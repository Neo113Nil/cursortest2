package p000createpolar;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageKeyframeStrikeStrikeEclipse8404 implements PolarVoyageLooperHyperionOlympian2573 {
    public static final boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
    public static final PolarVoyageToolbarStormVision2832 PolarVoyageZipVortexCelestial6185 = new PolarVoyageToolbarStormVision2832();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, PolarVoyagePaintPulseNebula5461.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (PolarVoyagePaintPulseNebula5461.PolarVoyageZipVortexCelestial6185()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068 = z;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (PolarVoyageKotlinBetaPulseBeta3653(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageTextInputEditTextNebulaHero6651(list).toArray(new String[0]));
        }
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return PolarVoyageMotionLayoutTransitionHeroVision4068;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final String PolarVoyageZipVortexCelestial6185(SSLSocket sSLSocket) {
        if (PolarVoyageKotlinBetaPulseBeta3653(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
