package p000createpolar;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnGlobalLayoutListenerAlphaMaster2475 implements Drawable.Callback {
    public final /* synthetic */ PolarVoyageLayerDrawableNeoMax4029 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageOnGlobalLayoutListenerAlphaMaster2475(PolarVoyageLayerDrawableNeoMax4029 polarVoyageLayerDrawableNeoMax4029) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageLayerDrawableNeoMax4029;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        PolarVoyageLayerDrawableNeoMax4029 polarVoyageLayerDrawableNeoMax4029 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageObserverVisionRogueForce3508 polarVoyageObserverVisionRogueForce3508 = polarVoyageLayerDrawableNeoMax4029.PolarVoyageCameraPixelBlaze2629;
        polarVoyageObserverVisionRogueForce3508.setValue(Integer.valueOf(((Number) polarVoyageObserverVisionRogueForce3508.getValue()).intValue() + 1));
        Drawable drawable2 = polarVoyageLayerDrawableNeoMax4029.PolarVoyageViewRogueMaster4778;
        PolarVoyageRotateAnimationNovaXSpectra7703 polarVoyageRotateAnimationNovaXSpectra7703 = PolarVoyageMotionLayoutFusionBeta3810.PolarVoyageZipVortexCelestial6185;
        polarVoyageLayerDrawableNeoMax4029.PolarVoyageDrawableDeltaHyperion5742.setValue(new PolarVoyageFlowCollectorQuantumPhantom5972((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageMotionLayoutTransitionHeroVision4068(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) PolarVoyageMotionLayoutFusionBeta3810.PolarVoyageZipVortexCelestial6185.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) PolarVoyageMotionLayoutFusionBeta3810.PolarVoyageZipVortexCelestial6185.getValue()).removeCallbacks(runnable);
    }
}
