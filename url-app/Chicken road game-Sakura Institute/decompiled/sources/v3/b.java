package v3;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import m3.s;

/* loaded from: classes.dex */
public final class b extends s {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f10993a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f10994b;

    public b(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f10993a = trustManager;
        this.f10994b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f10993a == this.f10993a;
    }

    @Override // m3.s
    public final List h(List chain, String hostname) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f10994b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10993a);
    }
}
