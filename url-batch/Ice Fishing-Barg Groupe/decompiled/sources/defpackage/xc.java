package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xc extends pi {
    public static final wc Companion = new wc();
    public final jm2 PxuCJdSBwIXG;

    public xc(jm2 jm2Var) {
        jm2Var.getClass();
        this.PxuCJdSBwIXG = jm2Var;
    }

    public static boolean lS5Rgt96tfkO(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!cs0.wdg6QnbFHrFF(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.pi
    public final List PxuCJdSBwIXG(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate PxuCJdSBwIXG = this.PxuCJdSBwIXG.PxuCJdSBwIXG(x509Certificate);
            if (PxuCJdSBwIXG == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (lS5Rgt96tfkO(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(PxuCJdSBwIXG)) {
                arrayList.add(PxuCJdSBwIXG);
            }
            if (lS5Rgt96tfkO(PxuCJdSBwIXG, PxuCJdSBwIXG, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof xc) && cs0.wdg6QnbFHrFF(((xc) obj).PxuCJdSBwIXG, this.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }
}
