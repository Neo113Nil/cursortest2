package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class z2 extends l70 {
    public final X509TrustManager o;
    public final X509TrustManagerExtensions p;

    public z2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.o = x509TrustManager;
        this.p = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z2) && ((z2) obj).o == this.o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.o);
    }

    @Override // defpackage.l70
    public final List j(List list, String str) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.p.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
