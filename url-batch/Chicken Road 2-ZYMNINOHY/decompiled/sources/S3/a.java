package S3;

import O3.l;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: c, reason: collision with root package name */
    public final d f2604c;

    public a(d trustRootIndex) {
        i.e(trustRootIndex, "trustRootIndex");
        this.f2604c = trustRootIndex;
    }

    @Override // O3.l
    public final List e(String hostname, List chain) {
        i.e(chain, "chain");
        i.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i4 = 0;
        boolean z = false;
        while (i4 < 9) {
            i4++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a3 = this.f2604c.a(x509Certificate);
            if (a3 == null) {
                Iterator it = arrayDeque.iterator();
                i.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
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
                if (!z) {
                    throw new SSLPeerUnverifiedException(i.h(x509Certificate, "Failed to find a trusted cert that signed "));
                }
                return arrayList;
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
            z = true;
        }
        throw new SSLPeerUnverifiedException(i.h(arrayList, "Certificate chain too long: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i.a(((a) obj).f2604c, this.f2604c);
    }

    public final int hashCode() {
        return this.f2604c.hashCode();
    }
}
