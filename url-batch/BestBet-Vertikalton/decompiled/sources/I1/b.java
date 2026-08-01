package I1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends H1.d {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f545e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f546f;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f545e = x509TrustManager;
        this.f546f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f545e == this.f545e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f545e);
    }

    @Override // H1.d
    public final List p(List list, String str) {
        k1.e.e(list, "chain");
        k1.e.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f546f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            k1.e.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
