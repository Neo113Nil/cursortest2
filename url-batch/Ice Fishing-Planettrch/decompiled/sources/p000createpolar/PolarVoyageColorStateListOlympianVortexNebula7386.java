package p000createpolar;

import android.view.Choreographer;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorStateListOlympianVortexNebula7386 extends PolarVoyageHandlerPulsePixel7687 implements Choreographer.FrameCallback {
    @Override // p000createpolar.PolarVoyageHandlerPulsePixel7687
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageStrictModeLegendEpic1532.unregisterDisplayListener(this);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.removeFrameCallback(this);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -9223372036854775807L;
        this.PolarVoyageBottomSheetOmegaNeo1907 = -9223372036854775807L;
    }

    @Override // p000createpolar.PolarVoyageHandlerPulsePixel7687
    public final void PolarVoyageZipVortexCelestial6185() {
        long j;
        this.PolarVoyageStrictModeLegendEpic1532.registerDisplayListener(this, PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageBottomSheetOmegaNeo1907(null));
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.postFrameCallback(this);
        if (this.PolarVoyageStrictModeLegendEpic1532.getDisplay(0) != null) {
            j = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.PolarVoyageBottomSheetOmegaNeo1907 = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = j;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.postFrameCallback(this);
            if (this.PolarVoyageStrictModeLegendEpic1532.getDisplay(0) != null) {
                j = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.PolarVoyageBottomSheetOmegaNeo1907 = j;
        }
    }
}
