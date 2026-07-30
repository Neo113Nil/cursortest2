package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageSensorManagerTurboHero8884 implements PolarVoyageMaterialCardViewQuantumAlphaOmega1996 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageBitmapVisionAuroraPixel4705;
    public final long PolarVoyageDiffUtilTurboStrike5735;
    public final long PolarVoyageKotlinBetaPulseBeta3653;
    public final int PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final long[] PolarVoyageTextInputEditTextNebulaHero6651;
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageSensorManagerTurboHero8884(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = i;
        this.PolarVoyageKotlinBetaPulseBeta3653 = j2;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = j3;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = jArr;
        this.PolarVoyageDiffUtilTurboStrike5735 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        long j2 = j - this.PolarVoyageZipVortexCelestial6185;
        if (!PolarVoyageKotlinBetaPulseBeta3653() || j2 <= this.PolarVoyageMotionLayoutTransitionHeroVision4068) {
            return 0L;
        }
        long[] jArr = this.PolarVoyageTextInputEditTextNebulaHero6651;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.PolarVoyageBitmapVisionAuroraPixel4705;
        int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBarcodeScannerInfernoSolarSpark7767(jArr, (long) d, true);
        long j3 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long j4 = (PolarVoyageBarcodeScannerInfernoSolarSpark7767 * j3) / 100;
        long j5 = jArr[PolarVoyageBarcodeScannerInfernoSolarSpark7767];
        int i = PolarVoyageBarcodeScannerInfernoSolarSpark7767 + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final PolarVoyageViewBindingPulseLegendNovaX4954 PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        double d;
        double d2;
        boolean PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653();
        int i = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long j2 = this.PolarVoyageZipVortexCelestial6185;
        if (!PolarVoyageKotlinBetaPulseBeta3653) {
            PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo7756 = new PolarVoyageTransitionListenerRogueNeo7756(0L, j2 + i);
            return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, polarVoyageTransitionListenerRogueNeo7756);
        }
        long PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageItemDecorationUltraDeltaEpic7485(j, 0L, this.PolarVoyageKotlinBetaPulseBeta3653);
        double d3 = (PolarVoyageItemDecorationUltraDeltaEpic7485 * 100.0d) / this.PolarVoyageKotlinBetaPulseBeta3653;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.PolarVoyageTextInputEditTextNebulaHero6651;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j3 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo77562 = new PolarVoyageTransitionListenerRogueNeo7756(PolarVoyageItemDecorationUltraDeltaEpic7485, j2 + PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageItemDecorationUltraDeltaEpic7485(Math.round((d4 / d) * j3), i, j3 - 1));
        return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo77562, polarVoyageTransitionListenerRogueNeo77562);
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final int PolarVoyageDiffUtilTurboStrike5735() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageTextInputEditTextNebulaHero6651 != null;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final long PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageKotlinBetaPulseBeta3653;
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final long PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageDiffUtilTurboStrike5735;
    }
}
