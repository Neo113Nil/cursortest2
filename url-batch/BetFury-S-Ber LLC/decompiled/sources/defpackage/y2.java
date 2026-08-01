package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y2 extends n9 {
    public final X509TrustManager s;
    public final X509TrustManagerExtensions t;

    public y2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.s = x509TrustManager;
        this.t = x509TrustManagerExtensions;
    }

    @Override // defpackage.n9
    public final List d(List list, String str) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.t.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y2) && ((y2) obj).s == this.s;
    }

    public final int hashCode() {
        return System.identityHashCode(this.s);
    }
}
