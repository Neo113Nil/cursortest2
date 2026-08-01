package A1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f67e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f68f;

    public c(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f67e = x509TrustManager;
        this.f68f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f67e == this.f67e;
    }

    @Override // z1.d
    public final List h(List list, String str) {
        g1.d.e(list, "chain");
        g1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f68f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            g1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f67e);
    }
}
