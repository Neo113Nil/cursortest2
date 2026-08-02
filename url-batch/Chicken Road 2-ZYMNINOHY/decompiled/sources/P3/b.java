package P3;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends O3.l {

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManager f2093c;

    /* renamed from: d, reason: collision with root package name */
    public final X509TrustManagerExtensions f2094d;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f2093c = x509TrustManager;
        this.f2094d = x509TrustManagerExtensions;
    }

    @Override // O3.l
    public final List e(String hostname, List chain) {
        kotlin.jvm.internal.i.e(chain, "chain");
        kotlin.jvm.internal.i.e(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f2094d.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            kotlin.jvm.internal.i.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f2093c == this.f2093c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2093c);
    }
}
