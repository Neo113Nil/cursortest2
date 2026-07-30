package p000createpolar;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMotionEventOmegaThunder4824 extends PolarVoyageNavigationViewNebulaNovaXPhoenix7849 {
    public final X509TrustManagerExtensions PolarVoyageCameraPixelBlaze2629;
    public final X509TrustManager PolarVoyageViewRogueMaster4778;

    public PolarVoyageMotionEventOmegaThunder4824(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.PolarVoyageViewRogueMaster4778 = x509TrustManager;
        this.PolarVoyageCameraPixelBlaze2629 = x509TrustManagerExtensions;
    }

    @Override // p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849
    public final List PolarVoyageAnimatorSetSparkUltraMax8233(String str, List list) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.PolarVoyageCameraPixelBlaze2629.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof PolarVoyageMotionEventOmegaThunder4824) && ((PolarVoyageMotionEventOmegaThunder4824) obj).PolarVoyageViewRogueMaster4778 == this.PolarVoyageViewRogueMaster4778;
    }

    public final int hashCode() {
        return System.identityHashCode(this.PolarVoyageViewRogueMaster4778);
    }
}
