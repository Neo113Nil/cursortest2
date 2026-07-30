package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePagingCosmosDragon7783 {
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePagingCosmosDragon7783(int i) {
        this.PolarVoyageZipVortexCelestial6185 = i == 0 ? PolarVoyageActivityDeltaDelta4379.PolarVoyageZipVortexCelestial6185 : new int[i];
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, int i2) {
        if (i < 0 || i >= this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i, i + 1, i2, iArr, iArr);
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068--;
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        if (i >= 0 && i < this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return this.PolarVoyageZipVortexCelestial6185[i];
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705("Index must be between 0 and size");
        return 0;
    }

    public final void PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + 1;
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        if (iArr.length < i2) {
            this.PolarVoyageZipVortexCelestial6185 = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.PolarVoyageZipVortexCelestial6185;
        int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        iArr2[i3] = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PolarVoyagePagingCosmosDragon7783) {
            PolarVoyagePagingCosmosDragon7783 polarVoyagePagingCosmosDragon7783 = (PolarVoyagePagingCosmosDragon7783) obj;
            int i = polarVoyagePagingCosmosDragon7783.PolarVoyageMotionLayoutTransitionHeroVision4068;
            int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            if (i == i2) {
                int[] iArr = this.PolarVoyageZipVortexCelestial6185;
                int[] iArr2 = polarVoyagePagingCosmosDragon7783.PolarVoyageZipVortexCelestial6185;
                PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageThreadPhoenixVisionSolar1313 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(0, i2);
                int i3 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageItemDecorationUltraDeltaEpic7485;
                int i4 = PolarVoyageThreadPhoenixVisionSolar1313.PolarVoyageStrictModeLegendEpic1532;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ PolarVoyagePagingCosmosDragon7783() {
        this(16);
    }
}
