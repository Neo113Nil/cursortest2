package p000createpolar;

import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewPager2CyberStrike5195 extends PolarVoyageProximitySensorHyperBlaze3823 implements ListIterator {
    public final /* synthetic */ PolarVoyageGeocoderMasterHyperHyperion4028 PolarVoyageBottomSheetOmegaNeo1907;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolarVoyageViewPager2CyberStrike5195(PolarVoyageGeocoderMasterHyperHyperion4028 polarVoyageGeocoderMasterHyperHyperion4028, int i) {
        super(0, polarVoyageGeocoderMasterHyperHyperion4028);
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageGeocoderMasterHyperHyperion4028;
        int PolarVoyageZipVortexCelestial6185 = polarVoyageGeocoderMasterHyperHyperion4028.PolarVoyageZipVortexCelestial6185();
        if (i < 0 || i > PolarVoyageZipVortexCelestial6185) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, PolarVoyageZipVortexCelestial6185, "index: ", ", size: "));
            throw null;
        }
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.PolarVoyageStrictModeLegendEpic1532 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
            return null;
        }
        int i = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        return this.PolarVoyageBottomSheetOmegaNeo1907.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
