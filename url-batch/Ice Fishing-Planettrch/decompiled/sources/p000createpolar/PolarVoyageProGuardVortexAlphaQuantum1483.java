package p000createpolar;

import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageProGuardVortexAlphaQuantum1483 {
    public boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public boolean PolarVoyageBitmapVisionAuroraPixel4705;
    public int[] PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Rect PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageTextInputEditTextNebulaHero6651;
    public long PolarVoyageMotionLayoutTransitionHeroVision4068 = -9223372036854775807L;
    public long PolarVoyageKotlinBetaPulseBeta3653 = -9223372036854775807L;
    public final int[] PolarVoyageZipVortexCelestial6185 = new int[4];
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
    public int PolarVoyageBottomSheetOmegaNeo1907 = -1;

    public static int PolarVoyageKotlinBetaPulseBeta3653(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public static int PolarVoyageZipVortexCelestial6185(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageAuthVortexNebulaNeo9087 polarVoyageAuthVortexNebulaNeo9087, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int width = rect.width();
        int height = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * width;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (polarVoyageAuthVortexNebulaNeo9087.PolarVoyageMotionLayoutTransitionHeroVision4068() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | polarVoyageAuthVortexNebulaNeo9087.PolarVoyageTextInputEditTextNebulaHero6651(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.PolarVoyageZipVortexCelestial6185[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            polarVoyageAuthVortexNebulaNeo9087.PolarVoyageKotlinBetaPulseBeta3653();
        }
    }
}
