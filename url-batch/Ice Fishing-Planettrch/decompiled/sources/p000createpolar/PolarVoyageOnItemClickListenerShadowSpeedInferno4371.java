package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnItemClickListenerShadowSpeedInferno4371 implements Iterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public PolarVoyageLinearLayoutHyperionSpectra2647 PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485 = -1;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;
    public final /* synthetic */ PolarVoyagePreviewBlazeForce3304 PolarVoyageViewRogueMaster4778;

    public PolarVoyageOnItemClickListenerShadowSpeedInferno4371(PolarVoyagePreviewBlazeForce3304 polarVoyagePreviewBlazeForce3304) {
        this.PolarVoyageViewRogueMaster4778 = polarVoyagePreviewBlazeForce3304;
        int PolarVoyageCameraViewSpectraMaxSpectra2824 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageCameraViewSpectraMaxSpectra2824(0, 0, ((String) polarVoyagePreviewBlazeForce3304.PolarVoyageMotionLayoutTransitionHeroVision4068).length());
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageCameraViewSpectraMaxSpectra2824;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageCameraViewSpectraMaxSpectra2824;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        PolarVoyagePreviewBlazeForce3304 polarVoyagePreviewBlazeForce3304 = this.PolarVoyageViewRogueMaster4778;
        String str = (String) polarVoyagePreviewBlazeForce3304.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
            this.PolarVoyageBottomSheetOmegaNeo1907 = null;
            return;
        }
        if (i > str.length()) {
            this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageLinearLayoutHyperionSpectra2647(this.PolarVoyageStrictModeLegendEpic1532, str.length() - 1, 1);
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
        } else {
            PolarVoyageRippleDrawableRogueBlazeBlaze8980 polarVoyageRippleDrawableRogueBlazeBlaze8980 = (PolarVoyageRippleDrawableRogueBlazeBlaze8980) ((PolarVoyageObjectDetectionThunderHyperInferno3620) polarVoyagePreviewBlazeForce3304.PolarVoyageKotlinBetaPulseBeta3653).PolarVoyageDiffUtilTurboStrike5735(str, Integer.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768));
            if (polarVoyageRippleDrawableRogueBlazeBlaze8980 == null) {
                this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageLinearLayoutHyperionSpectra2647(this.PolarVoyageStrictModeLegendEpic1532, str.length() - 1, 1);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = -1;
            } else {
                int intValue = ((Number) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageItemDecorationUltraDeltaEpic7485).intValue();
                int intValue2 = ((Number) polarVoyageRippleDrawableRogueBlazeBlaze8980.PolarVoyageStrictModeLegendEpic1532).intValue();
                this.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageThreadPhoenixVisionSolar1313(this.PolarVoyageStrictModeLegendEpic1532, intValue);
                int i2 = intValue + intValue2;
                this.PolarVoyageStrictModeLegendEpic1532 = i2;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == -1) {
            PolarVoyageZipVortexCelestial6185();
        }
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == -1) {
            PolarVoyageZipVortexCelestial6185();
        }
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 == 0) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        PolarVoyageLinearLayoutHyperionSpectra2647 polarVoyageLinearLayoutHyperionSpectra2647 = this.PolarVoyageBottomSheetOmegaNeo1907;
        polarVoyageLinearLayoutHyperionSpectra2647.getClass();
        this.PolarVoyageBottomSheetOmegaNeo1907 = null;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = -1;
        return polarVoyageLinearLayoutHyperionSpectra2647;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
