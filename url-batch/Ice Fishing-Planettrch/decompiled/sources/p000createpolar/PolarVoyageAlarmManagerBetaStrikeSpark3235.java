package p000createpolar;

import android.os.SystemClock;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlarmManagerBetaStrikeSpark3235 implements PolarVoyageLocationManagerFusionMax8504 {
    public long PolarVoyageBottomSheetOmegaNeo1907;
    public final PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public long PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageStrictModeLegendEpic1532;
    public PolarVoyageTransitionBlazePixel9380 PolarVoyageViewRogueMaster4778 = PolarVoyageTransitionBlazePixel9380.PolarVoyageBarcodeScannerInfernoSolarSpark7767;

    public PolarVoyageAlarmManagerBetaStrikeSpark3235(PolarVoyageVelocityTrackerPhantomTitaniumStrike2970 polarVoyageVelocityTrackerPhantomTitaniumStrike2970) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageVelocityTrackerPhantomTitaniumStrike2970;
    }

    @Override // p000createpolar.PolarVoyageLocationManagerFusionMax8504
    public final PolarVoyageTransitionBlazePixel9380 PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        return this.PolarVoyageViewRogueMaster4778;
    }

    @Override // p000createpolar.PolarVoyageLocationManagerFusionMax8504
    public final long PolarVoyageBitmapVisionAuroraPixel4705() {
        long j = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            return j;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.PolarVoyageBottomSheetOmegaNeo1907;
        return (this.PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185 == 1.0f ? PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageLifecycleOlympianOmega3762(elapsedRealtime) : elapsedRealtime * r6.PolarVoyageKotlinBetaPulseBeta3653) + j;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735() {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            return;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
        this.PolarVoyageBottomSheetOmegaNeo1907 = SystemClock.elapsedRealtime();
        this.PolarVoyageStrictModeLegendEpic1532 = true;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(long j) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
            this.PolarVoyageBottomSheetOmegaNeo1907 = SystemClock.elapsedRealtime();
        }
    }

    @Override // p000createpolar.PolarVoyageLocationManagerFusionMax8504
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageTransitionBlazePixel9380 polarVoyageTransitionBlazePixel9380) {
        if (this.PolarVoyageStrictModeLegendEpic1532) {
            PolarVoyageKotlinBetaPulseBeta3653(PolarVoyageBitmapVisionAuroraPixel4705());
        }
        this.PolarVoyageViewRogueMaster4778 = polarVoyageTransitionBlazePixel9380;
    }
}
