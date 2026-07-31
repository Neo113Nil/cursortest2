package P2;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends l0.c {

    /* renamed from: g, reason: collision with root package name */
    public final X509TrustManager f3924g;

    /* renamed from: h, reason: collision with root package name */
    public final X509TrustManagerExtensions f3925h;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3924g = x509TrustManager;
        this.f3925h = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f3924g == this.f3924g;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3924g);
    }

    @Override // l0.c
    public final List p(List list, String str) {
        f2.j.f(list, "chain");
        f2.j.f(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f3925h.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            f2.j.e(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }
}
