package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnDeviceTranslatorNovaBeta2948 {
    public long[] PolarVoyageKotlinBetaPulseBeta3653;
    public int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 1;

    public PolarVoyageOnDeviceTranslatorNovaBeta2948(int i) {
        this.PolarVoyageKotlinBetaPulseBeta3653 = new long[i];
    }

    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        if (i >= 0 && i < this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return this.PolarVoyageKotlinBetaPulseBeta3653[i];
        }
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Invalid index ", i, ", size is ");
        PolarVoyageContentProviderHyperSpark3838.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.PolarVoyageKotlinBetaPulseBeta3653[i2]) {
                int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068 - 1;
                while (i2 < i3) {
                    long[] jArr = this.PolarVoyageKotlinBetaPulseBeta3653;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.PolarVoyageMotionLayoutTransitionHeroVision4068--;
                return;
            }
            i2++;
        }
    }

    public boolean PolarVoyageKotlinBetaPulseBeta3653(long j) {
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.PolarVoyageKotlinBetaPulseBeta3653[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void PolarVoyageMotionLayoutTransitionHeroVision4068(long[] jArr) {
        int length = this.PolarVoyageMotionLayoutTransitionHeroVision4068 + jArr.length;
        long[] jArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (length > jArr2.length) {
            this.PolarVoyageKotlinBetaPulseBeta3653 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.PolarVoyageKotlinBetaPulseBeta3653, this.PolarVoyageMotionLayoutTransitionHeroVision4068, jArr.length);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = length;
    }

    public final void PolarVoyageZipVortexCelestial6185(long j) {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                long[] jArr = this.PolarVoyageKotlinBetaPulseBeta3653;
                if (i == jArr.length) {
                    this.PolarVoyageKotlinBetaPulseBeta3653 = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
                int i2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                if (!PolarVoyageKotlinBetaPulseBeta3653(j)) {
                    int i3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    long[] jArr3 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    if (i3 >= jArr3.length) {
                        jArr3 = Arrays.copyOf(jArr3, Math.max(i3 + 1, jArr3.length * 2));
                        this.PolarVoyageKotlinBetaPulseBeta3653 = jArr3;
                    }
                    jArr3[i3] = j;
                    if (i3 >= this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
                        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i3 + 1;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ PolarVoyageOnDeviceTranslatorNovaBeta2948() {
    }
}
