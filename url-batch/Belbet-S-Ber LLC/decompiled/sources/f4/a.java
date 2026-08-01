package f4;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final d f1439o;

    public a(d dVar) {
        i3.d.e(dVar, "trustRootIndex");
        this.f1439o = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i3.d.a(((a) obj).f1439o, this.f1439o);
    }

    public final int hashCode() {
        return this.f1439o.hashCode();
    }

    @Override // b4.d
    public final List n(List list, String str) {
        i3.d.e(list, "chain");
        i3.d.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i3.d.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z4 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            i3.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a5 = this.f1439o.a(x509Certificate);
            if (a5 == null) {
                Iterator it = arrayDeque.iterator();
                i3.d.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    i3.d.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (i3.d.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z4) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a5)) {
                arrayList.add(a5);
            }
            if (i3.d.a(a5.getIssuerDN(), a5.getSubjectDN())) {
                try {
                    a5.verify(a5.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z4 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
