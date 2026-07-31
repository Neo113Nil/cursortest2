package i6;

import a1.AbstractC0223a;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends AbstractC0223a {

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManager f4432c;

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManagerExtensions f4433d;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.i.e(trustManager, "trustManager");
        this.f4432c = trustManager;
        this.f4433d = x509TrustManagerExtensions;
    }

    @Override // a1.AbstractC0223a
    public final List b(List chain, String hostname) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4433d.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.i.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f4432c == this.f4432c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4432c);
    }
}
