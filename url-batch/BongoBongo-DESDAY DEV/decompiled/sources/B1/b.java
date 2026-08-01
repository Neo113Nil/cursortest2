package B1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f44e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f45f;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f44e = x509TrustManager;
        this.f45f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f44e == this.f44e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f44e);
    }

    @Override // A1.d
    public final List o(List list, String str) {
        h1.d.e(list, "chain");
        h1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f45f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            h1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
