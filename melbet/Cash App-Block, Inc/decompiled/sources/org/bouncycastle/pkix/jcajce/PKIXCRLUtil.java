package org.bouncycastle.pkix.jcajce;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* loaded from: classes9.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, list2);
            findCRLs(hashSet, pKIXCRLStoreSelector, list);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            PKIXCRLUtil$$ExternalSyntheticBUOutline0.m("Exception obtaining complete CRLs.", e);
            return null;
        }
    }

    public static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, PKIXParameters pKIXParameters) {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, pKIXParameters.getCertStores());
            return hashSet;
        } catch (AnnotatedException e) {
            PKIXCRLUtil$$ExternalSyntheticBUOutline0.m("Exception obtaining complete CRLs.", e);
            return null;
        }
    }

    public static Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) {
        return findCRLs(new PKIXCRLStoreSelector.Builder(x509CRLStoreSelector).build(), pKIXParameters);
    }

    private static void findCRLs(HashSet hashSet, PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                } catch (StoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
                } catch (CertStoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                    annotatedException2 = annotatedException;
                }
            }
            z = true;
        }
        if (!z && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
