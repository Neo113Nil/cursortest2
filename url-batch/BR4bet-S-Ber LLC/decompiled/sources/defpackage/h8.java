package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h8 extends xf {
    public final ia0 p;

    public h8(ia0 ia0Var) {
        ia0Var.getClass();
        this.p = ia0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof h8) && kr.b(((h8) obj).p, this.p);
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    @Override // defpackage.xf
    public final List i(List list, String str) {
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
            X509Certificate a = this.p.a(x509Certificate);
            if (a == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (kr.b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                arrayList.add(a);
            }
            if (kr.b(a.getIssuerDN(), a.getSubjectDN())) {
                try {
                    a.verify(a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
