package p8;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class b extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f39835a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f39836b;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        this.f39835a = trustManager;
        this.f39836b = x509TrustManagerExtensions;
    }

    @Override // com.bumptech.glide.d
    public final List d(String hostname, List chain) {
        kotlin.jvm.internal.h.e(chain, "chain");
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f39836b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.h.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e6) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
            sSLPeerUnverifiedException.initCause(e6);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f39835a == this.f39835a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f39835a);
    }
}
