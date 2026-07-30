package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnPreDrawListenerCelestialTitaniumAurora4421 implements PolarVoyageKotlinBetaHeroSolar7457 {
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageOnPreDrawListenerCelestialTitaniumAurora4421(int i, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
    }

    @Override // p000createpolar.PolarVoyageKotlinBetaHeroSolar7457
    public final void accept(Object obj) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageMotionEventAlphaCelestialThunder3331 polarVoyageMotionEventAlphaCelestialThunder3331 = (PolarVoyageMotionEventAlphaCelestialThunder3331) obj;
                if (polarVoyageMotionEventAlphaCelestialThunder3331 == null) {
                    polarVoyageMotionEventAlphaCelestialThunder3331 = new PolarVoyageMotionEventAlphaCelestialThunder3331(-3);
                }
                ((PolarVoyageZoomStateAlphaVision6590) this.PolarVoyageMotionLayoutTransitionHeroVision4068).PolarVoyageNavigationViewHyperHyperHyperion1793(polarVoyageMotionEventAlphaCelestialThunder3331);
                return;
            default:
                PolarVoyageMotionEventAlphaCelestialThunder3331 polarVoyageMotionEventAlphaCelestialThunder33312 = (PolarVoyageMotionEventAlphaCelestialThunder3331) obj;
                synchronized (PolarVoyageScaleAnimationStrikeEpic4566.PolarVoyageKotlinBetaPulseBeta3653) {
                    try {
                        PolarVoyageLevelListDrawablePhoenixMegaNebula9939 polarVoyageLevelListDrawablePhoenixMegaNebula9939 = PolarVoyageScaleAnimationStrikeEpic4566.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                        ArrayList arrayList = (ArrayList) polarVoyageLevelListDrawablePhoenixMegaNebula9939.get((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        if (arrayList == null) {
                            return;
                        }
                        polarVoyageLevelListDrawablePhoenixMegaNebula9939.remove((String) this.PolarVoyageMotionLayoutTransitionHeroVision4068);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((PolarVoyageKotlinBetaHeroSolar7457) arrayList.get(i)).accept(polarVoyageMotionEventAlphaCelestialThunder33312);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
