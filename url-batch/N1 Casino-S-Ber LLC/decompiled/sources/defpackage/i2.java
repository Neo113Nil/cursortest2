package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i2 extends o8 {
    public final X509TrustManager s;
    public final X509TrustManagerExtensions t;

    public i2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.s = x509TrustManager;
        this.t = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i2) && ((i2) obj).s == this.s;
    }

    public final int hashCode() {
        return System.identityHashCode(this.s);
    }

    @Override // defpackage.o8
    public final List m(List list, String str) {
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
}
