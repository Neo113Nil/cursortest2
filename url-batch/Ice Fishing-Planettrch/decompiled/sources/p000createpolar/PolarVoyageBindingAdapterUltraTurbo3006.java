package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageBindingAdapterUltraTurbo3006 {
    public long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public long PolarVoyageBitmapVisionAuroraPixel4705;
    public long PolarVoyageDiffUtilTurboStrike5735;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public long PolarVoyageKotlinBetaPulseBeta3653;
    public long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final boolean[] PolarVoyageTextInputEditTextNebulaHero6651 = new boolean[15];
    public long PolarVoyageZipVortexCelestial6185;

    public final void PolarVoyageKotlinBetaPulseBeta3653() {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0L;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0L;
        this.PolarVoyageDiffUtilTurboStrike5735 = 0L;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        Arrays.fill(this.PolarVoyageTextInputEditTextNebulaHero6651, false);
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        long j2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        if (j2 == 0) {
            this.PolarVoyageZipVortexCelestial6185 = j;
        } else if (j2 == 1) {
            long j3 = j - this.PolarVoyageZipVortexCelestial6185;
            this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j3;
            this.PolarVoyageDiffUtilTurboStrike5735 = j3;
            this.PolarVoyageBitmapVisionAuroraPixel4705 = 1L;
        } else {
            long j4 = j - this.PolarVoyageKotlinBetaPulseBeta3653;
            int i = (int) (j2 % 15);
            long abs = Math.abs(j4 - this.PolarVoyageMotionLayoutTransitionHeroVision4068);
            boolean[] zArr = this.PolarVoyageTextInputEditTextNebulaHero6651;
            if (abs <= 1000000) {
                this.PolarVoyageBitmapVisionAuroraPixel4705++;
                this.PolarVoyageDiffUtilTurboStrike5735 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.PolarVoyageItemDecorationUltraDeltaEpic7485--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.PolarVoyageItemDecorationUltraDeltaEpic7485++;
            }
        }
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767++;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j;
    }

    public final boolean PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 > 15 && this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0;
    }
}
