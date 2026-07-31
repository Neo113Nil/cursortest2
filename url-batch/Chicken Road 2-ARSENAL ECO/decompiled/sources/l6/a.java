package l6;

import a1.AbstractC0223a;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends AbstractC0223a {

    /* renamed from: c, reason: collision with root package name */
    public final d f5308c;

    public a(d trustRootIndex) {
        i.e(trustRootIndex, "trustRootIndex");
        this.f5308c = trustRootIndex;
    }

    public static boolean H(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i7) {
        if (!i.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i7) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // a1.AbstractC0223a
    public final List b(List chain, String hostname) {
        i.e(chain, "chain");
        i.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        i.d(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z5 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            i.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a7 = this.f5308c.a(x509Certificate);
            if (a7 == null) {
                Iterator it = arrayDeque.iterator();
                i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    i.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (H(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z5) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a7)) {
                arrayList.add(a7);
            }
            if (H(a7, a7, arrayList.size() - 2)) {
                return arrayList;
            }
            z5 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && i.a(((a) obj).f5308c, this.f5308c);
    }

    public final int hashCode() {
        return this.f5308c.hashCode();
    }
}
