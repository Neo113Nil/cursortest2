package c4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends b4.d {

    /* renamed from: o, reason: collision with root package name */
    public final X509TrustManager f883o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManagerExtensions f884p;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f883o = x509TrustManager;
        this.f884p = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f883o == this.f883o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f883o);
    }

    @Override // b4.d
    public final List n(List list, String str) {
        i3.d.e(list, "chain");
        i3.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f884p.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            i3.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }
}
