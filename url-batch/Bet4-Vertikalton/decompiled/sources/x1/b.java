package x1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f4235b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f4234a = x509TrustManager;
        this.f4235b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f4234a == this.f4234a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4234a);
    }

    @Override // w1.d
    public final List o(List list, String str) {
        d1.d.e(list, "chain");
        d1.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4235b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            d1.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
