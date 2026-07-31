package S2;

import f2.j;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class a extends l0.c {

    /* renamed from: g, reason: collision with root package name */
    public final d f4330g;

    public a(d dVar) {
        j.f(dVar, "trustRootIndex");
        this.f4330g = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && j.a(((a) obj).f4330g, this.f4330g);
    }

    public final int hashCode() {
        return this.f4330g.hashCode();
    }

    @Override // l0.c
    public final List p(List list, String str) {
        j.f(list, "chain");
        j.f(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        j.e(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i3 = 0; i3 < 9; i3++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            j.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a3 = this.f4330g.a(x509Certificate);
            if (a3 == null) {
                Iterator it = arrayDeque.iterator();
                j.e(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    j.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (j.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
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
            if (j.a(a3.getIssuerDN(), a3.getSubjectDN())) {
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
