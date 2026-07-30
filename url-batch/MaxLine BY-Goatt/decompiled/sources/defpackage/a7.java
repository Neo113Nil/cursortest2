package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a7 extends yj1 {
    public final X509TrustManager q;
    public final X509TrustManagerExtensions r;

    public a7(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.q = x509TrustManager;
        this.r = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a7) && ((a7) obj).q == this.q;
    }

    public final int hashCode() {
        return System.identityHashCode(this.q);
    }

    @Override // defpackage.yj1
    public final List p(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.r.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
