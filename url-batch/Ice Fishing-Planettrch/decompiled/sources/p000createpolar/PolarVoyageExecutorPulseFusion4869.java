package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageExecutorPulseFusion4869 implements PolarVoyagePaintMegaCelestial9975 {
    public final long[] PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long[] PolarVoyageBitmapVisionAuroraPixel4705;
    public final long PolarVoyageDiffUtilTurboStrike5735;
    public final long[] PolarVoyageKotlinBetaPulseBeta3653;
    public final int[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageExecutorPulseFusion4869(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = iArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = jArr;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = jArr2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = jArr3;
        int length = iArr.length;
        this.PolarVoyageZipVortexCelestial6185 = length;
        if (length <= 0) {
            this.PolarVoyageDiffUtilTurboStrike5735 = 0L;
        } else {
            int i = length - 1;
            this.PolarVoyageDiffUtilTurboStrike5735 = jArr2[i] + jArr3[i];
        }
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final PolarVoyageViewBindingPulseLegendNovaX4954 PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        long[] jArr = this.PolarVoyageBitmapVisionAuroraPixel4705;
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBarcodeScannerInfernoSolarSpark7767(jArr, j, true);
        long j2 = jArr[PolarVoyageBarcodeScannerInfernoSolarSpark7767];
        long[] jArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo7756 = new PolarVoyageTransitionListenerRogueNeo7756(j2, jArr2[PolarVoyageBarcodeScannerInfernoSolarSpark7767]);
        if (j2 >= j || PolarVoyageBarcodeScannerInfernoSolarSpark7767 == this.PolarVoyageZipVortexCelestial6185 - 1) {
            return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, polarVoyageTransitionListenerRogueNeo7756);
        }
        int i = PolarVoyageBarcodeScannerInfernoSolarSpark7767 + 1;
        return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, new PolarVoyageTransitionListenerRogueNeo7756(jArr[i], jArr2[i]));
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return true;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final long PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageDiffUtilTurboStrike5735;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.PolarVoyageZipVortexCelestial6185 + ", sizes=" + Arrays.toString(this.PolarVoyageMotionLayoutTransitionHeroVision4068) + ", offsets=" + Arrays.toString(this.PolarVoyageKotlinBetaPulseBeta3653) + ", timeUs=" + Arrays.toString(this.PolarVoyageBitmapVisionAuroraPixel4705) + ", durationsUs=" + Arrays.toString(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) + ")";
    }
}
