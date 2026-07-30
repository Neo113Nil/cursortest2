package p000createpolar;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourceOlympianEpic5744 implements Collection {
    public final /* synthetic */ PolarVoyageContentObserverThunderOmega9101 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageResourceOlympianEpic5744(PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageContentObserverThunderOmega9101;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageZipVortexCelestial6185(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageInsetDrawableSpectraElitePhantom6346(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int PolarVoyageZipVortexCelestial6185 = polarVoyageContentObserverThunderOmega9101.PolarVoyageZipVortexCelestial6185(obj);
        if (PolarVoyageZipVortexCelestial6185 < 0) {
            return false;
        }
        polarVoyageContentObserverThunderOmega9101.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageZipVortexCelestial6185);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(polarVoyageContentObserverThunderOmega9101.PolarVoyageItemDecorationUltraDeltaEpic7485(i2))) {
                polarVoyageContentObserverThunderOmega9101.PolarVoyageDiffUtilTurboStrike5735(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(polarVoyageContentObserverThunderOmega9101.PolarVoyageItemDecorationUltraDeltaEpic7485(i2))) {
                polarVoyageContentObserverThunderOmega9101.PolarVoyageDiffUtilTurboStrike5735(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = polarVoyageContentObserverThunderOmega9101.PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = polarVoyageContentObserverThunderOmega9101.PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
        }
        return objArr;
    }
}
