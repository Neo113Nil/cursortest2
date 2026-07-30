package p000createpolar;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRotateAnimationTitanDragonSpeed3446 extends PolarVoyagePagingDataTurboElite5231 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.PolarVoyageItemDecorationUltraDeltaEpic7485).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        it.getClass();
        PolarVoyageTypefaceNebulaAurora4762 polarVoyageTypefaceNebulaAurora4762 = this.PolarVoyageStrictModeLegendEpic1532;
        polarVoyageTypefaceNebulaAurora4762.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (polarVoyageTypefaceNebulaAurora4762.apply(next)) {
                return next;
            }
        }
        PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new PolarVoyageRotateAnimationTitanDragonSpeed3446(((SortedSet) this.PolarVoyageItemDecorationUltraDeltaEpic7485).headSet(obj), this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        while (true) {
            Object last = sortedSet.last();
            if (this.PolarVoyageStrictModeLegendEpic1532.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new PolarVoyageRotateAnimationTitanDragonSpeed3446(((SortedSet) this.PolarVoyageItemDecorationUltraDeltaEpic7485).subSet(obj, obj2), this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new PolarVoyageRotateAnimationTitanDragonSpeed3446(((SortedSet) this.PolarVoyageItemDecorationUltraDeltaEpic7485).tailSet(obj), this.PolarVoyageStrictModeLegendEpic1532);
    }
}
