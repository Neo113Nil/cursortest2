package p000createpolar;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnPreDrawListenerTurboAlphaInferno4817 implements ListIterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public final List PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageOnPreDrawListenerTurboAlphaInferno4817(int i, List list) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = list;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(this.PolarVoyageStrictModeLegendEpic1532, obj);
        this.PolarVoyageStrictModeLegendEpic1532++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.PolarVoyageStrictModeLegendEpic1532 < this.PolarVoyageItemDecorationUltraDeltaEpic7485.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.PolarVoyageStrictModeLegendEpic1532 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = i + 1;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.PolarVoyageStrictModeLegendEpic1532 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.set(this.PolarVoyageStrictModeLegendEpic1532, obj);
    }
}
