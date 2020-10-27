
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.sap.persistence.j;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-12-21T11:49:14.509+01:00
 * Generated source version: 3.2.6
 *
 */

@javax.jws.WebService(
                      serviceName = "Jc",
                      portName = "JcusPort",
                      targetNamespace = "http://sap.com/persistence/j/",
                      wsdlLocation = "http://i83lp1.informatik.tu-muenchen.de:50000/Jc/Jcus?wsdl",
                      endpointInterface = "com.sap.persistence.j.Jcus")

public class JcusPortImpl implements Jcus {

    private static final Logger LOG = Logger.getLogger(JcusPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#findAllCUSTOMER()*
     */
    public java.util.List<com.sap.persistence.j.Customer> findAllCUSTOMER() {
        LOG.info("Executing operation findAllCUSTOMER");
        try {
            java.util.List<com.sap.persistence.j.Customer> _return = new java.util.ArrayList<com.sap.persistence.j.Customer>();
            com.sap.persistence.j.Customer _returnVal1 = new com.sap.persistence.j.Customer();
            _returnVal1.setAddress("Address1358789706");
            _returnVal1.setCountry("Country-371644382");
            _returnVal1.setCusId(Integer.valueOf(-110639895));
            _returnVal1.setName("Name-1076609497");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#findCUSTOMERByCusId(java.lang.Integer cusId)*
     */
    public java.util.List<com.sap.persistence.j.Customer> findCUSTOMERByCusId(java.lang.Integer cusId) {
        LOG.info("Executing operation findCUSTOMERByCusId");
        System.out.println(cusId);
        try {
            java.util.List<com.sap.persistence.j.Customer> _return = new java.util.ArrayList<com.sap.persistence.j.Customer>();
            com.sap.persistence.j.Customer _returnVal1 = new com.sap.persistence.j.Customer();
            _returnVal1.setAddress("Address-643484361");
            _returnVal1.setCountry("Country1236435412");
            _returnVal1.setCusId(Integer.valueOf(-571046097));
            _returnVal1.setName("Name-90505355");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#delete(com.sap.persistence.j.Customer entity)*
     */
    public void delete(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation delete");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#create(com.sap.persistence.j.Customer entity)*
     */
    public void create(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation create");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#update(com.sap.persistence.j.Customer entity)*
     */
    public void update(com.sap.persistence.j.Customer entity) {
        LOG.info("Executing operation update");
        System.out.println(entity);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.sap.persistence.j.Jcus#getCUSTOMERItemCount()*
     */
    public int getCUSTOMERItemCount() {
        LOG.info("Executing operation getCUSTOMERItemCount");
        try {
            int _return = 2036135269;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
