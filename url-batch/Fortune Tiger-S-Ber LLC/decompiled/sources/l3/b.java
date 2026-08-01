package l3;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends l0.g {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f2884b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f2883a = x509TrustManager;
        this.f2884b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2883a == this.f2883a;
    }

    @Override // l0.g
    public final List f(List list, String str) {
        u2.c.e(list, "chain");
        u2.c.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f2884b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            u2.c.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2883a);
    }
}
