package p000createpolar;

import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelScopeNebulaPhoenixPhoenix1908 implements Iterator {
    public int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public final /* synthetic */ PolarVoyageDataBindingInfernoInfernoPixel1843 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageViewModelScopeNebulaPhoenixPhoenix1908(PolarVoyageDataBindingInfernoInfernoPixel1843 polarVoyageDataBindingInfernoInfernoPixel1843) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageDataBindingInfernoInfernoPixel1843;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDataBindingInfernoInfernoPixel1843.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485 < this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i < this.PolarVoyageStrictModeLegendEpic1532) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i + 1;
            return Byte.valueOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageTextInputEditTextNebulaHero6651(i));
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
