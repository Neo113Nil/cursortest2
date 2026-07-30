package p000createpolar;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageThemeOverlayMegaStrike5586 {
    public final PolarVoyageDisplayMetricsSpectraNeoHero6356[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(0);
        PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutForceEpicAurora7183(1);
    }

    public PolarVoyageThemeOverlayMegaStrike5586(String str, PolarVoyageDisplayMetricsSpectraNeoHero6356... polarVoyageDisplayMetricsSpectraNeoHero6356Arr) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(polarVoyageDisplayMetricsSpectraNeoHero6356Arr.length > 0);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = polarVoyageDisplayMetricsSpectraNeoHero6356Arr;
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageDisplayMetricsSpectraNeoHero6356Arr.length;
        String str2 = polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageSnackbarGammaEclipse2140;
        this.PolarVoyageKotlinBetaPulseBeta3653 = TextUtils.isEmpty(str2) ? PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageDiffUtilTurboStrike5735(polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageDrawableDeltaHyperion5742) : PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageDiffUtilTurboStrike5735(str2);
        String str3 = polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageDiffUtilTurboStrike5735 | 16384;
        for (int i2 = 1; i2 < polarVoyageDisplayMetricsSpectraNeoHero6356Arr.length; i2++) {
            String str4 = polarVoyageDisplayMetricsSpectraNeoHero6356Arr[i2].PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                PolarVoyageZipVortexCelestial6185(i2, "languages", polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageDisplayMetricsSpectraNeoHero6356Arr[i2].PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                return;
            } else {
                if (i != (polarVoyageDisplayMetricsSpectraNeoHero6356Arr[i2].PolarVoyageDiffUtilTurboStrike5735 | 16384)) {
                    PolarVoyageZipVortexCelestial6185(i2, "role flags", Integer.toBinaryString(polarVoyageDisplayMetricsSpectraNeoHero6356Arr[0].PolarVoyageDiffUtilTurboStrike5735), Integer.toBinaryString(polarVoyageDisplayMetricsSpectraNeoHero6356Arr[i2].PolarVoyageDiffUtilTurboStrike5735));
                    return;
                }
            }
        }
    }

    public static void PolarVoyageZipVortexCelestial6185(int i, String str, String str2, String str3) {
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PolarVoyageThemeOverlayMegaStrike5586.class == obj.getClass()) {
            PolarVoyageThemeOverlayMegaStrike5586 polarVoyageThemeOverlayMegaStrike5586 = (PolarVoyageThemeOverlayMegaStrike5586) obj;
            if (this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(polarVoyageThemeOverlayMegaStrike5586.PolarVoyageMotionLayoutTransitionHeroVision4068) && Arrays.equals(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767, polarVoyageThemeOverlayMegaStrike5586.PolarVoyageBarcodeScannerInfernoSolarSpark7767)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.PolarVoyageBitmapVisionAuroraPixel4705 == 0) {
            this.PolarVoyageBitmapVisionAuroraPixel4705 = Arrays.hashCode(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) + PolarVoyageRealtimeDatabaseCyberShadowForce7689.PolarVoyageBarcodeScannerInfernoSolarSpark7767(this.PolarVoyageMotionLayoutTransitionHeroVision4068, 527, 31);
        }
        return this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public final String toString() {
        return this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ": " + Arrays.toString(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
    }
}
