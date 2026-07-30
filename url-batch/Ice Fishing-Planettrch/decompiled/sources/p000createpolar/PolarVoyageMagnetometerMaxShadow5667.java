package p000createpolar;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMagnetometerMaxShadow5667 extends AbstractList implements RandomAccess, Serializable {
    public final List PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageOnLongClickListenerDragonEpicHero5214 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageMagnetometerMaxShadow5667(List list, PolarVoyageOnLongClickListenerDragonEpicHero5214 polarVoyageOnLongClickListenerDragonEpicHero5214) {
        list.getClass();
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = list;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageOnLongClickListenerDragonEpicHero5214;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.PolarVoyageStrictModeLegendEpic1532.apply(this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new PolarVoyageCountDownTimerRogueTitanVortex2469(this, this.PolarVoyageItemDecorationUltraDeltaEpic7485.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.PolarVoyageStrictModeLegendEpic1532.apply(this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
    }
}
