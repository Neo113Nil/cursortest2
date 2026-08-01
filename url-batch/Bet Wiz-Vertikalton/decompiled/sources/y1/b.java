package y1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends x1.l {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4292a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f4293b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f4292a = x509TrustManager;
        this.f4293b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f4292a == this.f4292a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4292a);
    }

    @Override // x1.l
    public final List n(List list, String str) {
        e1.d.e(list, "chain");
        e1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4293b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            e1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
