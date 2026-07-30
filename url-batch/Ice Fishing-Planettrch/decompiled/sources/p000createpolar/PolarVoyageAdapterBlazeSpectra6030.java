package p000createpolar;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAdapterBlazeSpectra6030 extends AbstractSet {
    public final /* synthetic */ Set PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Set PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageAdapterBlazeSpectra6030(Set set, Set set2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = set;
        this.PolarVoyageStrictModeLegendEpic1532 = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.contains(obj) && this.PolarVoyageStrictModeLegendEpic1532.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.containsAll(collection) && this.PolarVoyageStrictModeLegendEpic1532.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.PolarVoyageStrictModeLegendEpic1532, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PolarVoyageBindingAdapterAlphaMax4806(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.PolarVoyageItemDecorationUltraDeltaEpic7485.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.PolarVoyageStrictModeLegendEpic1532.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
