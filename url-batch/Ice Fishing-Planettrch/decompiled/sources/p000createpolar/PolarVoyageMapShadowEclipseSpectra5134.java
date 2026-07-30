package p000createpolar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMapShadowEclipseSpectra5134 implements PolarVoyageDrawerLayoutGammaCosmos7826 {
    public final Method PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final X509TrustManager PolarVoyageZipVortexCelestial6185;

    public PolarVoyageMapShadowEclipseSpectra5134(X509TrustManager x509TrustManager, Method method) {
        this.PolarVoyageZipVortexCelestial6185 = x509TrustManager;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = method;
    }

    @Override // p000createpolar.PolarVoyageDrawerLayoutGammaCosmos7826
    public final X509Certificate PolarVoyageZipVortexCelestial6185(X509Certificate x509Certificate) {
        try {
            Object invoke = this.PolarVoyageMotionLayoutTransitionHeroVision4068.invoke(this.PolarVoyageZipVortexCelestial6185, x509Certificate);
            invoke.getClass();
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageMapShadowEclipseSpectra5134)) {
            return false;
        }
        PolarVoyageMapShadowEclipseSpectra5134 polarVoyageMapShadowEclipseSpectra5134 = (PolarVoyageMapShadowEclipseSpectra5134) obj;
        return this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageMapShadowEclipseSpectra5134.PolarVoyageZipVortexCelestial6185) && this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageMapShadowEclipseSpectra5134.PolarVoyageMotionLayoutTransitionHeroVision4068);
    }

    public final int hashCode() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068.hashCode() + (this.PolarVoyageZipVortexCelestial6185.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.PolarVoyageZipVortexCelestial6185 + ", findByIssuerAndSignatureMethod=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ')';
    }
}
