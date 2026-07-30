package p000createpolar;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAuthHyperGammaHyperion1114 implements PolarVoyageLooperHyperionOlympian2573 {
    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyageAssetManagerPixelSpeed4796 PolarVoyageZipVortexCelestial6185 = new PolarVoyageAssetManagerPixelSpeed4796();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, PolarVoyageNestedScrollViewBlazeMaxMax1969.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (PolarVoyageKotlinBetaPulseBeta3653(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
            parameters.setApplicationProtocols((String[]) PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageTextInputEditTextNebulaHero6651(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final String PolarVoyageZipVortexCelestial6185(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }
}
