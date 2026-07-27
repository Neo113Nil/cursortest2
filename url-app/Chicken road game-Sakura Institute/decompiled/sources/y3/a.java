package y3;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import m3.s;

/* loaded from: classes.dex */
public final class a extends s {

    /* renamed from: a, reason: collision with root package name */
    public final d f11691a;

    public a(d trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f11691a = trustRootIndex;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.a(((a) obj).f11691a, this.f11691a);
    }

    @Override // m3.s
    public final List h(List chain, String hostname) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z4 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            Intrinsics.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a4 = this.f11691a.a(x509Certificate);
            if (a4 == null) {
                Iterator it = arrayDeque.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (Intrinsics.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (z4) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a4)) {
                arrayList.add(a4);
            }
            if (Intrinsics.a(a4.getIssuerDN(), a4.getSubjectDN())) {
                try {
                    a4.verify(a4.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z4 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f11691a.hashCode();
    }
}
