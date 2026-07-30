package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlingGesturePixelShadow3186 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public int PolarVoyageItemDecorationUltraDeltaEpic7485 = -1;
    public final /* synthetic */ PolarVoyageViewPagerSparkVision4365 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageFlingGesturePixelShadow3186(PolarVoyageViewPagerSparkVision4365 polarVoyageViewPagerSparkVision4365) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageViewPagerSparkVision4365;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1 < ((PolarVoyageOnTouchListenerPrimePixelLegend8920) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBitmapVisionAuroraPixel4705();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = true;
        PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend8920 = (PolarVoyageOnTouchListenerPrimePixelLegend8920) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        return (PolarVoyageCameraXCelestialNeoSolar7858) polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageDiffUtilTurboStrike5735(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("You must call next() before you can remove an element");
            return;
        }
        PolarVoyageOnTouchListenerPrimePixelLegend8920 polarVoyageOnTouchListenerPrimePixelLegend8920 = (PolarVoyageOnTouchListenerPrimePixelLegend8920) this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        ((PolarVoyageCameraXCelestialNeoSolar7858) polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageDiffUtilTurboStrike5735(this.PolarVoyageItemDecorationUltraDeltaEpic7485)).PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object[] objArr = polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object obj = objArr[i];
        Object obj2 = PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageCameraPixelBlaze2629;
        if (obj != obj2) {
            objArr[i] = obj2;
            polarVoyageOnTouchListenerPrimePixelLegend8920.PolarVoyageItemDecorationUltraDeltaEpic7485 = true;
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = false;
    }
}
