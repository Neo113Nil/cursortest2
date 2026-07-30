package p000createpolar;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageClipDrawableNebulaThunder5087 implements Collection, PolarVoyageZipDeltaSpectraRogue6055 {
    public final Object[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final boolean PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageClipDrawableNebulaThunder5087(Object[] objArr, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = objArr;
        this.PolarVoyageStrictModeLegendEpic1532 = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageThreadPhoenixVisionSolar1313(this.PolarVoyageItemDecorationUltraDeltaEpic7485, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageThreadPhoenixVisionSolar1313(this.PolarVoyageItemDecorationUltraDeltaEpic7485, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageProximitySensorHyperBlaze3823(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (this.PolarVoyageStrictModeLegendEpic1532 && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        copyOf.getClass();
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageThreadPhoenixVisionSolar1313(this, objArr);
    }
}
