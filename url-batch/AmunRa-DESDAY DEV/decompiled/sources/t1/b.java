package t1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import k0.y;

/* loaded from: classes.dex */
public final class b extends y {
    public final X509TrustManager d;

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManagerExtensions f3874e;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.d = x509TrustManager;
        this.f3874e = x509TrustManagerExtensions;
    }

    @Override // k0.y
    public final List d(List list, String str) {
        Z0.d.e(list, "chain");
        Z0.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f3874e.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            Z0.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).d == this.d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.d);
    }
}
