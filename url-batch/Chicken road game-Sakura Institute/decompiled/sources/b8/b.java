package b8;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends t6.a {

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManager f1401d;

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManagerExtensions f1402e;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f1401d = x509TrustManager;
        this.f1402e = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f1401d == this.f1401d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1401d);
    }

    @Override // t6.a
    public final List u(List list, String str) {
        r6.k.f(list, "chain");
        r6.k.f(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f1402e.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            r6.k.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e9) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e9.getMessage());
            sSLPeerUnverifiedException.initCause(e9);
            throw sSLPeerUnverifiedException;
        }
    }
}
