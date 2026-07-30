package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageBroadcastInfernoCelestial5352 extends PolarVoyageKeyEventPhantomDragonVortex9872 {
    public final Map PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageDispatchersMasterSparkHero8128 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageBroadcastInfernoCelestial5352(PolarVoyageDispatchersMasterSparkHero8128 polarVoyageDispatchersMasterSparkHero8128, Map map) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDispatchersMasterSparkHero8128;
        map.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            PolarVoyageScaleAnimationPhoenixSpectra5238 polarVoyageScaleAnimationPhoenixSpectra5238 = (PolarVoyageScaleAnimationPhoenixSpectra5238) it;
            if (!polarVoyageScaleAnimationPhoenixSpectra5238.hasNext()) {
                return;
            }
            polarVoyageScaleAnimationPhoenixSpectra5238.next();
            polarVoyageScaleAnimationPhoenixSpectra5238.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PolarVoyageScaleAnimationPhoenixSpectra5238(this, this.PolarVoyageItemDecorationUltraDeltaEpic7485.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageViewRogueMaster4778 -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
    }
}
