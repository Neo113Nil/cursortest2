package L1;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import k1.e;

/* loaded from: classes.dex */
public final class a extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final d f782e;

    public a(d dVar) {
        e.e(dVar, "trustRootIndex");
        this.f782e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && e.a(((a) obj).f782e, this.f782e);
    }

    public final int hashCode() {
        return this.f782e.hashCode();
    }

    @Override // H1.d
    public final List p(List list, String str) {
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
            X509Certificate a2 = this.f782e.a(x509Certificate);
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
}
