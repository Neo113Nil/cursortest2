package u1;

import X0.e;
import i1.p;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: b, reason: collision with root package name */
    public final d f3811b;

    public a(d dVar) {
        e.e(dVar, "trustRootIndex");
        this.f3811b = dVar;
    }

    @Override // i1.p
    public final List c(List list, String str) {
        e.e(list, "chain");
        e.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        e.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z2 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            e.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a2 = this.f3811b.a(x509Certificate);
            if (a2 == null) {
                Iterator it = arrayDeque.iterator();
                e.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    e.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (e.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                arrayList.add(a2);
            }
            if (e.a(a2.getIssuerDN(), a2.getSubjectDN())) {
                try {
                    a2.verify(a2.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && e.a(((a) obj).f3811b, this.f3811b);
    }

    public final int hashCode() {
        return this.f3811b.hashCode();
    }
}
