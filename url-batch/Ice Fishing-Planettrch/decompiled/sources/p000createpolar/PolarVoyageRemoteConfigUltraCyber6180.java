package p000createpolar;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRemoteConfigUltraCyber6180 implements Iterator {
    public final /* synthetic */ PolarVoyageObjectAnimatorLegendCosmos2129 PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageItemDecorationUltraDeltaEpic7485 = -1;
    public Iterator PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public boolean PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageRemoteConfigUltraCyber6180(PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageObjectAnimatorLegendCosmos2129;
    }

    public final Iterator PolarVoyageZipVortexCelestial6185() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == null) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageStrictModeLegendEpic1532.entrySet().iterator();
        }
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
        PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129 = this.PolarVoyageBottomSheetOmegaNeo1907;
        return i < polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485.size() || (!polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageStrictModeLegendEpic1532.isEmpty() && PolarVoyageZipVortexCelestial6185().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.PolarVoyageStrictModeLegendEpic1532 = true;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129 = this.PolarVoyageBottomSheetOmegaNeo1907;
        return i < polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485.size() ? (Map.Entry) polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485.get(this.PolarVoyageItemDecorationUltraDeltaEpic7485) : (Map.Entry) PolarVoyageZipVortexCelestial6185().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.PolarVoyageStrictModeLegendEpic1532) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("remove() was called before next()");
            return;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = false;
        int i = PolarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageCameraPixelBlaze2629;
        PolarVoyageObjectAnimatorLegendCosmos2129 polarVoyageObjectAnimatorLegendCosmos2129 = this.PolarVoyageBottomSheetOmegaNeo1907;
        polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (this.PolarVoyageItemDecorationUltraDeltaEpic7485 >= polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485.size()) {
            PolarVoyageZipVortexCelestial6185().remove();
            return;
        }
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2 - 1;
        polarVoyageObjectAnimatorLegendCosmos2129.PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
    }
}
