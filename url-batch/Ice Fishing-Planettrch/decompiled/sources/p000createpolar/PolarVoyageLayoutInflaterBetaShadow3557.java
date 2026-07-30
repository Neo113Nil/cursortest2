package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayoutInflaterBetaShadow3557 {
    public final int[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final boolean[] PolarVoyageBitmapVisionAuroraPixel4705;
    public final boolean PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageThemeOverlayMegaStrike5586 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(0);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(1);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(3);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(4);
    }

    public PolarVoyageLayoutInflaterBetaShadow3557(PolarVoyageThemeOverlayMegaStrike5586 polarVoyageThemeOverlayMegaStrike5586, boolean z, int[] iArr, boolean[] zArr) {
        int i = polarVoyageThemeOverlayMegaStrike5586.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageZipVortexCelestial6185 = i;
        boolean z2 = false;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(i == iArr.length && i == zArr.length);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageThemeOverlayMegaStrike5586;
        if (z && i > 1) {
            z2 = true;
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = z2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = (int[]) iArr.clone();
        this.PolarVoyageBitmapVisionAuroraPixel4705 = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PolarVoyageLayoutInflaterBetaShadow3557.class == obj.getClass()) {
            PolarVoyageLayoutInflaterBetaShadow3557 polarVoyageLayoutInflaterBetaShadow3557 = (PolarVoyageLayoutInflaterBetaShadow3557) obj;
            if (this.PolarVoyageKotlinBetaPulseBeta3653 == polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageKotlinBetaPulseBeta3653 && this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageMotionLayoutTransitionHeroVision4068) && Arrays.equals(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageBarcodeScannerInfernoSolarSpark7767) && Arrays.equals(this.PolarVoyageBitmapVisionAuroraPixel4705, polarVoyageLayoutInflaterBetaShadow3557.PolarVoyageBitmapVisionAuroraPixel4705)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageBitmapVisionAuroraPixel4705) + ((Arrays.hashCode(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) + (((this.PolarVoyageMotionLayoutTransitionHeroVision4068.hashCode() * 31) + (this.PolarVoyageKotlinBetaPulseBeta3653 ? 1 : 0)) * 31)) * 31);
    }
}
