package p000createpolar;

import java.math.RoundingMode;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageServiceUltraFusionBeta6845 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageBottomSheetOmegaNeo1907;
    public long[] PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageDiffUtilTurboStrike5735;
    public int[] PolarVoyageDrawableDeltaHyperion5742;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageDrawerLayoutUltraMasterShadow4631 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageTextInputEditTextNebulaHero6651;
    public long PolarVoyageViewRogueMaster4778;
    public final PolarVoyageGradleCosmosPhantomBlaze9117 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageServiceUltraFusionBeta6845(int i, PolarVoyageGradleCosmosPhantomBlaze9117 polarVoyageGradleCosmosPhantomBlaze9117, PolarVoyageDrawerLayoutUltraMasterShadow4631 polarVoyageDrawerLayoutUltraMasterShadow4631) {
        int i2 = polarVoyageGradleCosmosPhantomBlaze9117.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageGradleCosmosPhantomBlaze9117;
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageGradleCosmosPhantomBlaze9117.PolarVoyageMotionLayoutTransitionHeroVision4068();
        boolean z = true;
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 != 1 && PolarVoyageMotionLayoutTransitionHeroVision4068 != 2) {
            z = false;
        }
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.PolarVoyageKotlinBetaPulseBeta3653 = (PolarVoyageMotionLayoutTransitionHeroVision4068 == 2 ? 1667497984 : 1651965952) | i3;
        long j = polarVoyageGradleCosmosPhantomBlaze9117.PolarVoyageMotionLayoutTransitionHeroVision4068 * 1000000;
        long j2 = polarVoyageGradleCosmosPhantomBlaze9117.PolarVoyageKotlinBetaPulseBeta3653;
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(i2, j, j2, RoundingMode.DOWN);
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageDrawerLayoutUltraMasterShadow4631;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = PolarVoyageMotionLayoutTransitionHeroVision4068 == 2 ? i3 | 1650720768 : -1;
        this.PolarVoyageViewRogueMaster4778 = -1L;
        this.PolarVoyageCameraPixelBlaze2629 = new long[512];
        this.PolarVoyageDrawableDeltaHyperion5742 = new int[512];
        this.PolarVoyageDiffUtilTurboStrike5735 = i2;
    }

    public final PolarVoyageViewBindingPulseLegendNovaX4954 PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        if (this.PolarVoyageBottomSheetOmegaNeo1907 == 0) {
            PolarVoyageTransitionListenerRogueNeo7756 polarVoyageTransitionListenerRogueNeo7756 = new PolarVoyageTransitionListenerRogueNeo7756(0L, this.PolarVoyageViewRogueMaster4778);
            return new PolarVoyageViewBindingPulseLegendNovaX4954(polarVoyageTransitionListenerRogueNeo7756, polarVoyageTransitionListenerRogueNeo7756);
        }
        int i = (int) (j / (this.PolarVoyageBitmapVisionAuroraPixel4705 / this.PolarVoyageDiffUtilTurboStrike5735));
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageKotlinBetaPulseBeta3653(this.PolarVoyageDrawableDeltaHyperion5742, i, true, true);
        if (this.PolarVoyageDrawableDeltaHyperion5742[PolarVoyageKotlinBetaPulseBeta3653] == i) {
            PolarVoyageTransitionListenerRogueNeo7756 PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(PolarVoyageKotlinBetaPulseBeta3653);
            return new PolarVoyageViewBindingPulseLegendNovaX4954(PolarVoyageZipVortexCelestial6185, PolarVoyageZipVortexCelestial6185);
        }
        PolarVoyageTransitionListenerRogueNeo7756 PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185(PolarVoyageKotlinBetaPulseBeta3653);
        int i2 = PolarVoyageKotlinBetaPulseBeta3653 + 1;
        return i2 < this.PolarVoyageCameraPixelBlaze2629.length ? new PolarVoyageViewBindingPulseLegendNovaX4954(PolarVoyageZipVortexCelestial61852, PolarVoyageZipVortexCelestial6185(i2)) : new PolarVoyageViewBindingPulseLegendNovaX4954(PolarVoyageZipVortexCelestial61852, PolarVoyageZipVortexCelestial61852);
    }

    public final PolarVoyageTransitionListenerRogueNeo7756 PolarVoyageZipVortexCelestial6185(int i) {
        return new PolarVoyageTransitionListenerRogueNeo7756((this.PolarVoyageBitmapVisionAuroraPixel4705 / this.PolarVoyageDiffUtilTurboStrike5735) * this.PolarVoyageDrawableDeltaHyperion5742[i], this.PolarVoyageCameraPixelBlaze2629[i]);
    }
}
