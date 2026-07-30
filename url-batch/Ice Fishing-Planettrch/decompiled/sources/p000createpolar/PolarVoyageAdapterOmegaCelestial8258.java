package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAdapterOmegaCelestial8258 {
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAdapterOmegaCelestial8258() {
        this.PolarVoyageZipVortexCelestial6185 = new int[10];
    }

    public void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, int i2, int i3) {
        int i4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PolarVoyageZipVortexCelestial6185 = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i5;
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3, int i4) {
        int i5 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PolarVoyageZipVortexCelestial6185 = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i6;
    }

    public void PolarVoyageDiffUtilTurboStrike5735(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.PolarVoyageZipVortexCelestial6185;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    PolarVoyageTextInputEditTextNebulaHero6651(i3, i4);
                }
            }
            PolarVoyageTextInputEditTextNebulaHero6651(i3 + 3, i2);
            PolarVoyageDiffUtilTurboStrike5735(i, i3);
            PolarVoyageDiffUtilTurboStrike5735(i3 + 6, i2);
        }
    }

    public void PolarVoyageKotlinBetaPulseBeta3653(int i) {
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        if (this.PolarVoyageMotionLayoutTransitionHeroVision4068 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PolarVoyageZipVortexCelestial6185 = iArr;
        }
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 1;
        iArr[i2] = i;
    }

    public int PolarVoyageMotionLayoutTransitionHeroVision4068() {
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        return iArr[i];
    }

    public void PolarVoyageTextInputEditTextNebulaHero6651(int i, int i2) {
        int[] iArr = this.PolarVoyageZipVortexCelestial6185;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public int PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
        return i2 >= 0 ? this.PolarVoyageZipVortexCelestial6185[i2] : i;
    }

    public PolarVoyageAdapterOmegaCelestial8258(int i) {
        this.PolarVoyageZipVortexCelestial6185 = new int[i];
    }
}
