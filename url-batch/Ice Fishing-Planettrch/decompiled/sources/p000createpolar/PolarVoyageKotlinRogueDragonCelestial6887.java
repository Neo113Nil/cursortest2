package p000createpolar;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageKotlinRogueDragonCelestial6887 extends PolarVoyageHandlerPulsePixel7687 implements Choreographer$VsyncCallback {
    public final Handler PolarVoyageViewRogueMaster4778;

    public PolarVoyageKotlinRogueDragonCelestial6887(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.PolarVoyageViewRogueMaster4778 = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null);
    }

    @Override // p000createpolar.PolarVoyageHandlerPulsePixel7687
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageStrictModeLegendEpic1532.unregisterDisplayListener(this);
        this.PolarVoyageViewRogueMaster4778.removeCallbacksAndMessages(null);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.removeVsyncCallback(this);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -9223372036854775807L;
        this.PolarVoyageBottomSheetOmegaNeo1907 = -9223372036854775807L;
    }

    @Override // p000createpolar.PolarVoyageHandlerPulsePixel7687
    public final void PolarVoyageZipVortexCelestial6185() {
        this.PolarVoyageStrictModeLegendEpic1532.registerDisplayListener(this, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null));
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.postVsyncCallback(this);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            this.PolarVoyageBottomSheetOmegaNeo1907 = j != 0 ? j : -9223372036854775807L;
        } else {
            this.PolarVoyageBottomSheetOmegaNeo1907 = -9223372036854775807L;
        }
        this.PolarVoyageViewRogueMaster4778.postDelayed(new PolarVoyageLightSensorSparkBlazeTitanium9192(26, this), 500L);
    }
}
