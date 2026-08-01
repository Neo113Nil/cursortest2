package v1;

import android.net.http.X509TrustManagerExtensions;
import j0.AbstractC0143a;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0143a {
    public final X509TrustManager d;

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManagerExtensions f4112e;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.d = x509TrustManager;
        this.f4112e = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).d == this.d;
    }

    @Override // j0.AbstractC0143a
    public final List f(List list, String str) {
        b1.d.e(list, "chain");
        b1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4112e.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            b1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.d);
    }
}
