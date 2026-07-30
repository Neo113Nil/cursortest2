package p000createpolar;

import java.math.RoundingMode;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageLifecycleCameraControllerNebulaTurboStorm9637 {
    public static final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int PolarVoyageKotlinBetaPulseBeta3653(double d) {
        boolean PolarVoyageMotionLayoutTransitionHeroVision4068;
        RoundingMode roundingMode = RoundingMode.CEILING;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageSnackbarGammaEclipse2140("x must be positive and finite", d > 0.0d && PolarVoyageTransformNeoTitanium1654.PolarVoyagePackageManagerCelestialPhoenix8393(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return PolarVoyageKotlinBetaPulseBeta3653(d * 4.503599627370496E15d) - 52;
        }
        switch (PolarVoyageCardViewBetaVision6888.PolarVoyageZipVortexCelestial6185[roundingMode.ordinal()]) {
            case 1:
                PolarVoyageR8VisionOmegaNebula9943.PolarVoyageDrawableDeltaHyperion5742(PolarVoyageMotionLayoutTransitionHeroVision4068(d));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !PolarVoyageMotionLayoutTransitionHeroVision4068(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(d);
                r2 &= !PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (!r2) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                r2 = exponent >= 0;
                PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageMotionLayoutTransitionHeroVision4068(d);
                r2 &= !PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (!r2) {
                }
                break;
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.DOUBLE_FIELD_NUMBER /* 7 */:
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.BYTES_FIELD_NUMBER /* 8 */:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean PolarVoyageMotionLayoutTransitionHeroVision4068(double d) {
        if (d > 0.0d && PolarVoyageTransformNeoTitanium1654.PolarVoyagePackageManagerCelestialPhoenix8393(d)) {
            long PolarVoyageAlertDialogCyberHeroQuantum3938 = PolarVoyageTransformNeoTitanium1654.PolarVoyageAlertDialogCyberHeroQuantum3938(d);
            if ((PolarVoyageAlertDialogCyberHeroQuantum3938 & (PolarVoyageAlertDialogCyberHeroQuantum3938 - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean PolarVoyageZipVortexCelestial6185(double d) {
        if (PolarVoyageTransformNeoTitanium1654.PolarVoyagePackageManagerCelestialPhoenix8393(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(PolarVoyageTransformNeoTitanium1654.PolarVoyageAlertDialogCyberHeroQuantum3938(d)) <= Math.getExponent(d);
        }
        return false;
    }
}
