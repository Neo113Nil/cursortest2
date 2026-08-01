package r1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends i1.m {

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f3964b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f3965c;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3964b = x509TrustManager;
        this.f3965c = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f3964b == this.f3964b;
    }

    @Override // i1.m
    public final List f(List list, String str) {
        X0.f.e(list, "chain");
        X0.f.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f3965c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            X0.f.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3964b);
    }
}
