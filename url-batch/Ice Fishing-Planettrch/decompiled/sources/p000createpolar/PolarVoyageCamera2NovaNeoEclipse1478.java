package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCamera2NovaNeoEclipse1478 implements Iterator {
    public final Iterator PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageViewRogueMaster4778;
    public Object PolarVoyageStrictModeLegendEpic1532 = null;
    public Collection PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
    public Iterator PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageClipDrawableCyberEclipseHyper1213.PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageCamera2NovaNeoEclipse1478(PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128) {
        this.PolarVoyageViewRogueMaster4778 = polarVoyageDispatchersMasterSparkHero8128;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageDispatchersMasterSparkHero8128.PolarVoyageBottomSheetOmegaNeo1907.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.hasNext() || this.PolarVoyageBottomSheetOmegaNeo1907.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.PolarVoyageBottomSheetOmegaNeo1907.hasNext()) {
            Map.Entry entry = (Map.Entry) this.PolarVoyageItemDecorationUltraDeltaEpic7485.next();
            this.PolarVoyageStrictModeLegendEpic1532 = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = collection;
            this.PolarVoyageBottomSheetOmegaNeo1907 = collection.iterator();
        }
        return this.PolarVoyageBottomSheetOmegaNeo1907.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.PolarVoyageBottomSheetOmegaNeo1907.remove();
        Collection collection = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove();
        }
        PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128 = this.PolarVoyageViewRogueMaster4778;
        polarVoyageDispatchersMasterSparkHero8128.PolarVoyageViewRogueMaster4778--;
    }
}
