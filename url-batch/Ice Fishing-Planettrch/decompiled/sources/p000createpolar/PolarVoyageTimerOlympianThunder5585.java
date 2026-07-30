package p000createpolar;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTimerOlympianThunder5585 implements PolarVoyageMaterialCardViewQuantumAlphaOmega1996, PolarVoyagePaintMegaCelestial9975 {
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public final int PolarVoyageBottomSheetOmegaNeo1907;
    public final long PolarVoyageCameraPixelBlaze2629;
    public final long PolarVoyageDiffUtilTurboStrike5735;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final long PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final long PolarVoyageStrictModeLegendEpic1532;
    public final boolean PolarVoyageTextInputEditTextNebulaHero6651;
    public final boolean PolarVoyageViewRogueMaster4778;
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTimerOlympianThunder5585(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.PolarVoyageZipVortexCelestial6185 = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = j2;
        this.PolarVoyageKotlinBetaPulseBeta3653 = i2 == -1 ? 1 : i2;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = i;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = z;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z2;
        if (j == -1) {
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = -1L;
            this.PolarVoyageDiffUtilTurboStrike5735 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j3;
            this.PolarVoyageDiffUtilTurboStrike5735 = (Math.max(0L, j3) * 8000000) / i;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = j2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
        this.PolarVoyageBottomSheetOmegaNeo1907 = i2;
        this.PolarVoyageViewRogueMaster4778 = z;
        this.PolarVoyageCameraPixelBlaze2629 = j == -1 ? -1L : j;
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767(long j) {
        return (Math.max(0L, j - this.PolarVoyageMotionLayoutTransitionHeroVision4068) * 8000000) / this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final PolarVoyageViewBindingPulseLegendNovaX4954 PolarVoyageBitmapVisionAuroraPixel4705(long j) {
        long j2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        long j3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (j2 == -1 && !this.PolarVoyageTextInputEditTextNebulaHero6651) {
            PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo7756 = new PolarVoyageTransitionListenerRogueNeo7756(0L, j3);
            return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, polarVoyageTransitionListenerRogueNeo7756);
        }
        int i = this.PolarVoyageBitmapVisionAuroraPixel4705;
        long j4 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long j5 = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            j5 = Math.min(j5, j2 - j4);
        }
        long max = Math.max(j5, 0L) + j3;
        long max2 = (Math.max(0L, max - j3) * 8000000) / i;
        PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo77562 = new PolarVoyageTransitionListenerRogueNeo7756(max2, max);
        if (j2 != -1 && max2 < j) {
            long j6 = max + j4;
            if (j6 < this.PolarVoyageZipVortexCelestial6185) {
                return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo77562, new PolarVoyageTransitionListenerRogueNeo7756((Math.max(0L, j6 - j3) * 8000000) / i, j6));
            }
        }
        return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo77562, polarVoyageTransitionListenerRogueNeo77562);
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final int PolarVoyageDiffUtilTurboStrike5735() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final boolean PolarVoyageKotlinBetaPulseBeta3653() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != -1 || this.PolarVoyageTextInputEditTextNebulaHero6651;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // p000createpolar.PolarVoyagePaintMegaCelestial9975
    public final long PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageDiffUtilTurboStrike5735;
    }

    @Override // p000createpolar.PolarVoyageMaterialCardViewQuantumAlphaOmega1996
    public final long PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageCameraPixelBlaze2629;
    }
}
