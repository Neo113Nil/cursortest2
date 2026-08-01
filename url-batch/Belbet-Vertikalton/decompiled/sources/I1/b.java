package I1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends H1.l {

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManager f603f;

    /* renamed from: g, reason: collision with root package name */
    public final X509TrustManagerExtensions f604g;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f603f = x509TrustManager;
        this.f604g = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f603f == this.f603f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f603f);
    }

    @Override // H1.l
    public final List i(List list, String str) {
        j1.h.e(list, "chain");
        j1.h.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f604g.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            j1.h.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
