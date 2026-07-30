package p000createpolar;

import java.math.RoundingMode;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextInputEditTextStrikeStrike2726 implements PolarVoyageBottomSheetNovaXMaster4211 {
    public final PolarVoyageDisplayMetricsSpectraNeoHero6356 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final int PolarVoyageBitmapVisionAuroraPixel4705;
    public long PolarVoyageDiffUtilTurboStrike5735;
    public long PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageAnimationSetEliteStorm4036 PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageDrawerLayoutUltraMasterShadow4631 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public int PolarVoyageTextInputEditTextNebulaHero6651;
    public final PolarVoyageR8EpicBlaze3675 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageTextInputEditTextStrikeStrike2726(PolarVoyageR8EpicBlaze3675 polarVoyageR8EpicBlaze3675, PolarVoyageDrawerLayoutUltraMasterShadow4631 polarVoyageDrawerLayoutUltraMasterShadow4631, PolarVoyageAnimationSetEliteStorm4036 polarVoyageAnimationSetEliteStorm4036, String str, int i) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageR8EpicBlaze3675;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageDrawerLayoutUltraMasterShadow4631;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageAnimationSetEliteStorm4036;
        int i2 = polarVoyageAnimationSetEliteStorm4036.PolarVoyageZipVortexCelestial6185;
        int i3 = polarVoyageAnimationSetEliteStorm4036.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i4 = (polarVoyageAnimationSetEliteStorm4036.PolarVoyageBarcodeScannerInfernoSolarSpark7767 * i2) / 8;
        int i5 = polarVoyageAnimationSetEliteStorm4036.PolarVoyageKotlinBetaPulseBeta3653;
        if (i5 != i4) {
            throw PolarVoyageToastNeoOmega7549.PolarVoyageZipVortexCelestial6185(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int max = Math.max(i4, i6 / 10);
        this.PolarVoyageBitmapVisionAuroraPixel4705 = max;
        PolarVoyageServiceConnectionCelestialSpectraPulse4742 polarVoyageServiceConnectionCelestialSpectraPulse4742 = new PolarVoyageServiceConnectionCelestialSpectraPulse4742();
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageCameraPixelBlaze2629 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907("audio/wav");
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageDrawableDeltaHyperion5742 = PolarVoyageScaleGestureDetectorSpeedGamma3567.PolarVoyageBottomSheetOmegaNeo1907(str);
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageItemDecorationUltraDeltaEpic7485 = i7;
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageStrictModeLegendEpic1532 = i7;
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageSnackbarGammaEclipse2140 = max;
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageViewBindingPulseHeroSpeed5705 = i2;
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageCardViewAlphaVortexCelestial9747 = i3;
        polarVoyageServiceConnectionCelestialSpectraPulse4742.PolarVoyageFlingGestureEclipsePrimeMax1376 = i;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageDisplayMetricsSpectraNeoHero6356(polarVoyageServiceConnectionCelestialSpectraPulse4742);
    }

    @Override // p000createpolar.PolarVoyageBottomSheetNovaXMaster4211
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageMotionEventDeltaNovaXShadow3329 polarVoyageMotionEventDeltaNovaXShadow3329, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.PolarVoyageTextInputEditTextNebulaHero6651) < (i2 = this.PolarVoyageBitmapVisionAuroraPixel4705)) {
            int PolarVoyageBarcodeScannerInfernoSolarSpark7767 = this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageBarcodeScannerInfernoSolarSpark7767(polarVoyageMotionEventDeltaNovaXShadow3329, (int) Math.min(i2 - i, j2), true);
            if (PolarVoyageBarcodeScannerInfernoSolarSpark7767 == -1) {
                j2 = 0;
            } else {
                this.PolarVoyageTextInputEditTextNebulaHero6651 += PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                j2 -= PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            }
        }
        PolarVoyageAnimationSetEliteStorm4036 polarVoyageAnimationSetEliteStorm4036 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i3 = polarVoyageAnimationSetEliteStorm4036.PolarVoyageKotlinBetaPulseBeta3653;
        int i4 = this.PolarVoyageTextInputEditTextNebulaHero6651 / i3;
        if (i4 > 0) {
            long j3 = this.PolarVoyageDiffUtilTurboStrike5735;
            long j4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            long j5 = polarVoyageAnimationSetEliteStorm4036.PolarVoyageMotionLayoutTransitionHeroVision4068;
            String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
            long PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149 = j3 + PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.PolarVoyageTextInputEditTextNebulaHero6651 - i5;
            this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageZipVortexCelestial6185(PolarVoyageFirebaseModelInterpreterPhantomUltraSolar4149, 1, i5, i6, null);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 += i4;
            this.PolarVoyageTextInputEditTextNebulaHero6651 = i6;
        }
        return j2 <= 0;
    }

    @Override // p000createpolar.PolarVoyageBottomSheetNovaXMaster4211
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(long j) {
        this.PolarVoyageDiffUtilTurboStrike5735 = j;
        this.PolarVoyageTextInputEditTextNebulaHero6651 = 0;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0L;
    }

    @Override // p000createpolar.PolarVoyageBottomSheetNovaXMaster4211
    public final void PolarVoyageZipVortexCelestial6185(int i, long j) {
        PolarVoyageDrawableCompatBlazeInfernoMaster3717 polarVoyageDrawableCompatBlazeInfernoMaster3717 = new PolarVoyageDrawableCompatBlazeInfernoMaster3717(this.PolarVoyageKotlinBetaPulseBeta3653, 1, i, j);
        this.PolarVoyageZipVortexCelestial6185.PolarVoyageStrictModeLegendEpic1532(polarVoyageDrawableCompatBlazeInfernoMaster3717);
        PolarVoyageDisplayMetricsSpectraNeoHero6356 polarVoyageDisplayMetricsSpectraNeoHero6356 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        PolarVoyageDrawerLayoutUltraMasterShadow4631 polarVoyageDrawerLayoutUltraMasterShadow4631 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageDrawerLayoutUltraMasterShadow4631.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageDisplayMetricsSpectraNeoHero6356);
        polarVoyageDrawerLayoutUltraMasterShadow4631.PolarVoyageDiffUtilTurboStrike5735(polarVoyageDrawableCompatBlazeInfernoMaster3717.PolarVoyageBitmapVisionAuroraPixel4705);
    }
}
