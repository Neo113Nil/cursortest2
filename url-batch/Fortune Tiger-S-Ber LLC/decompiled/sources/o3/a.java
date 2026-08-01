package o3;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final d f2993a;

    public a(d dVar) {
        u2.c.e(dVar, "trustRootIndex");
        this.f2993a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && u2.c.a(((a) obj).f2993a, this.f2993a);
    }

    @Override // l0.g
    public final List f(List list, String str) {
        u2.c.e(list, "chain");
        u2.c.e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        u2.c.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z3 = false;
        for (int i4 = 0; i4 < 9; i4++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            u2.c.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a4 = this.f2993a.a(x509Certificate);
            if (a4 == null) {
                Iterator it = arrayDeque.iterator();
                u2.c.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    u2.c.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (u2.c.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z3) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a4)) {
                arrayList.add(a4);
            }
            if (u2.c.a(a4.getIssuerDN(), a4.getSubjectDN())) {
                try {
                    a4.verify(a4.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z3 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f2993a.hashCode();
    }
}
