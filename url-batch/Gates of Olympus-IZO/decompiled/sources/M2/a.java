package M2;

import I2.l;
import Z1.i;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: f, reason: collision with root package name */
    public final d f2813f;

    public a(d dVar) {
        i.f(dVar, "trustRootIndex");
        this.f2813f = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i.a(((a) obj).f2813f, this.f2813f);
    }

    public final int hashCode() {
        return this.f2813f.hashCode();
    }

    @Override // I2.l
    public final List l(List list, String str) {
        i.f(list, "chain");
        i.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.e(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i3 = 0; i3 < 9; i3++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            i.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a3 = this.f2813f.a(x509Certificate);
            if (a3 == null) {
                Iterator it = arrayDeque.iterator();
                i.e(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    i.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (i.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z3) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a3)) {
                arrayList.add(a3);
            }
            if (i.a(a3.getIssuerDN(), a3.getSubjectDN())) {
                try {
                    a3.verify(a3.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z3 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
