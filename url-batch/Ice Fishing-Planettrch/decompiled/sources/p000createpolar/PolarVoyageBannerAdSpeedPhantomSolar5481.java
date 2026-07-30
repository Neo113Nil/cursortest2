package p000createpolar;

import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageBannerAdSpeedPhantomSolar5481 {
    private static final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        throw new IndexOutOfBoundsException(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("fromIndex (", i, ") is less than 0."));
    }

    private static final void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void PolarVoyageDiffUtilTurboStrike5735(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    private static final void PolarVoyageKotlinBetaPulseBeta3653(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void PolarVoyageMotionLayoutTransitionHeroVision4068(int i, int i2, List list) {
        if (i > i2) {
            PolarVoyageDiffUtilTurboStrike5735(i, i2);
        }
        if (i < 0) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(i);
        }
        if (i2 > list.size()) {
            PolarVoyageBitmapVisionAuroraPixel4705(i2, list.size());
        }
    }

    public static final void PolarVoyageZipVortexCelestial6185(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            PolarVoyageKotlinBetaPulseBeta3653(i, size);
        }
    }
}
