package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.UnsignedKt;

/* loaded from: classes3.dex */
public final class AndroidCertificateChainCleaner extends UnsignedKt {
    public final X509TrustManager trustManager;
    public final X509TrustManagerExtensions x509TrustManagerExtensions;

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        x509TrustManager.getClass();
        this.trustManager = x509TrustManager;
        this.x509TrustManagerExtensions = x509TrustManagerExtensions;
    }

    @Override // kotlin.UnsignedKt
    public final List clean(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.x509TrustManagerExtensions.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).trustManager == this.trustManager;
    }

    public final int hashCode() {
        return System.identityHashCode(this.trustManager);
    }
}
