package p000createpolar;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFlowCollectorMegaCosmosAurora7549 implements Set {
    public final /* synthetic */ PolarVoyageContentObserverThunderOmega9101 PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageFlowCollectorMegaCosmosAurora7549(PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = polarVoyageContentObserverThunderOmega9101;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageStrictModeLegendEpic1532(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768 == set.size()) {
                return polarVoyageContentObserverThunderOmega9101.PolarVoyageStrictModeLegendEpic1532(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = 0;
        for (int i2 = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1; i2 >= 0; i2--) {
            Object PolarVoyageBitmapVisionAuroraPixel4705 = polarVoyageContentObserverThunderOmega9101.PolarVoyageBitmapVisionAuroraPixel4705(i2);
            i += PolarVoyageBitmapVisionAuroraPixel4705 == null ? 0 : PolarVoyageBitmapVisionAuroraPixel4705.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageInsetDrawableSpectraElitePhantom6346(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageContentObserverThunderOmega9101.PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 < 0) {
            return false;
        }
        polarVoyageContentObserverThunderOmega9101.PolarVoyageDiffUtilTurboStrike5735(PolarVoyageKotlinBetaPulseBeta3653);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(polarVoyageContentObserverThunderOmega9101.PolarVoyageBitmapVisionAuroraPixel4705(i2))) {
                polarVoyageContentObserverThunderOmega9101.PolarVoyageDiffUtilTurboStrike5735(i2);
            }
        }
        return i != polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = polarVoyageContentObserverThunderOmega9101.PolarVoyageBitmapVisionAuroraPixel4705(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        PolarVoyageContentObserverThunderOmega9101 polarVoyageContentObserverThunderOmega9101 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = polarVoyageContentObserverThunderOmega9101.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = polarVoyageContentObserverThunderOmega9101.PolarVoyageBitmapVisionAuroraPixel4705(i2);
        }
        return objArr;
    }
}
