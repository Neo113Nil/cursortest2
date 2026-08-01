package A1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends z1.l {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f3e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f4f;

    public c(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3e = x509TrustManager;
        this.f4f = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f3e == this.f3e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3e);
    }

    @Override // z1.l
    public final List i(List list, String str) {
        g1.d.e(list, "chain");
        g1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            g1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
