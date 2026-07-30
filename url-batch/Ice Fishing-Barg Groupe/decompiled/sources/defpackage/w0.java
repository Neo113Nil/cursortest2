package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w0 extends pi {
    public static final v0 Companion = new v0();
    public final X509TrustManager PxuCJdSBwIXG;
    public final X509TrustManagerExtensions lS5Rgt96tfkO;

    public w0(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.PxuCJdSBwIXG = x509TrustManager;
        this.lS5Rgt96tfkO = x509TrustManagerExtensions;
    }

    @Override // defpackage.pi
    public final List PxuCJdSBwIXG(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.lS5Rgt96tfkO.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w0) && ((w0) obj).PxuCJdSBwIXG == this.PxuCJdSBwIXG;
    }

    public final int hashCode() {
        return System.identityHashCode(this.PxuCJdSBwIXG);
    }
}
