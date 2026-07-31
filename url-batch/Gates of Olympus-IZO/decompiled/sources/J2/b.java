package J2;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends I2.l {

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManager f2616f;

    /* renamed from: g, reason: collision with root package name */
    public final X509TrustManagerExtensions f2617g;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f2616f = x509TrustManager;
        this.f2617g = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2616f == this.f2616f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2616f);
    }

    @Override // I2.l
    public final List l(List list, String str) {
        Z1.i.f(list, "chain");
        Z1.i.f(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f2617g.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            Z1.i.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }
}
