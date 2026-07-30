package p000createpolar;

import android.graphics.Color;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTraceVisionMega1085 {
    public final Integer PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final float PolarVoyageBitmapVisionAuroraPixel4705;
    public final boolean PolarVoyageDiffUtilTurboStrike5735;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final Integer PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final boolean PolarVoyageStrictModeLegendEpic1532;
    public final boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTraceVisionMega1085(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = num;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = num2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = f;
        this.PolarVoyageDiffUtilTurboStrike5735 = z;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = z2;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z3;
        this.PolarVoyageStrictModeLegendEpic1532 = z4;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
    }

    public static Integer PolarVoyageKotlinBetaPulseBeta3653(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(((parseLong >> 24) & 255) ^ 255), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793(parseLong & 255), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793((parseLong >> 8) & 255), PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageNavigationViewHyperHyperHyperion1793((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static boolean PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageDelayCyberQuantumEclipse8687("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static int PolarVoyageZipVortexCelestial6185(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
                case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageCameraViewSpectraMaxSpectra2824("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }
}
