package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageNotificationManagerAlphaAurora9967 {
    public static final float PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final float PolarVoyageKotlinBetaPulseBeta3653;
    public static final float PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final float PolarVoyageZipVortexCelestial6185;

    static {
        PolarVoyageZipVortexCelestial6185(0.0f);
        PolarVoyageZipVortexCelestial6185(0.5f);
        PolarVoyageMotionLayoutTransitionHeroVision4068 = 0.5f;
        PolarVoyageZipVortexCelestial6185(-1.0f);
        PolarVoyageKotlinBetaPulseBeta3653 = -1.0f;
        PolarVoyageZipVortexCelestial6185(1.0f);
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 1.0f;
    }

    public static String PolarVoyageMotionLayoutTransitionHeroVision4068(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == PolarVoyageKotlinBetaPulseBeta3653) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public static void PolarVoyageZipVortexCelestial6185(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            PolarVoyageShapeDrawableSpeedPixel9873.PolarVoyageMotionLayoutTransitionHeroVision4068("topRatio should be in [0..1] range or -1");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyageNotificationManagerAlphaAurora9967) {
            return Float.compare(this.PolarVoyageZipVortexCelestial6185, ((PolarVoyageNotificationManagerAlphaAurora9967) obj).PolarVoyageZipVortexCelestial6185) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.PolarVoyageZipVortexCelestial6185);
    }

    public final String toString() {
        return PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageZipVortexCelestial6185);
    }
}
