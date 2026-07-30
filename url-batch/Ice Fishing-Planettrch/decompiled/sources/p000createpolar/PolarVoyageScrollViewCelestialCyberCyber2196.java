package p000createpolar;

import java.io.Serializable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageScrollViewCelestialCyberCyber2196 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public Serializable PolarVoyageTextInputEditTextNebulaHero6651;
    public int PolarVoyageZipVortexCelestial6185;

    public boolean PolarVoyageZipVortexCelestial6185(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.PolarVoyageZipVortexCelestial6185 = i2;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageDiffUtilTurboStrike5735[3 - i3];
        int i6 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageTextInputEditTextNebulaHero6651[i5];
        this.PolarVoyageKotlinBetaPulseBeta3653 = i6;
        if (i2 == 2) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = i6 / 2;
        } else if (i2 == 0) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.PolarVoyageDiffUtilTurboStrike5735 = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageItemDecorationUltraDeltaEpic7485[i4 - 1] : PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageStrictModeLegendEpic1532[i4 - 1];
            this.PolarVoyageBitmapVisionAuroraPixel4705 = i9;
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = (((i9 * 12) / this.PolarVoyageKotlinBetaPulseBeta3653) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageRotateAnimationCyberCelestialDelta4768[i4 - 1] : PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageBottomSheetOmegaNeo1907[i4 - 1];
                this.PolarVoyageBitmapVisionAuroraPixel4705 = i10;
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = ((i10 * 144) / this.PolarVoyageKotlinBetaPulseBeta3653) + i7;
            } else {
                int i11 = PolarVoyageNavigationViewBlazeOmegaVision9396.PolarVoyageViewRogueMaster4778[i4 - 1];
                this.PolarVoyageBitmapVisionAuroraPixel4705 = i11;
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = (((i3 == 1 ? 72 : 144) * i11) / this.PolarVoyageKotlinBetaPulseBeta3653) + i7;
            }
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
