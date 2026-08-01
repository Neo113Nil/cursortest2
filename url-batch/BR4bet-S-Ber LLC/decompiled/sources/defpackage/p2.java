package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p2 extends xf {
    public final X509TrustManager p;
    public final X509TrustManagerExtensions q;

    public p2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.p = x509TrustManager;
        this.q = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p2) && ((p2) obj).p == this.p;
    }

    public final int hashCode() {
        return System.identityHashCode(this.p);
    }

    @Override // defpackage.xf
    public final List i(List list, String str) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.q.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
