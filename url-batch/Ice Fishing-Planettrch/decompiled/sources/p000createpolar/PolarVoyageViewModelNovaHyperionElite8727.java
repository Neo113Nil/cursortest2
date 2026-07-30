package p000createpolar;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewModelNovaHyperionElite8727 implements List, PolarVoyageGraphQuantumMasterOmega4348 {
    public final List PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageViewModelNovaHyperionElite8727(int i, int i2, List list) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = list;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(i + this.PolarVoyageStrictModeLegendEpic1532, obj);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.addAll(i + this.PolarVoyageStrictModeLegendEpic1532, collection);
        int size = collection.size();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i2 <= i) {
            while (true) {
                this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = this.PolarVoyageStrictModeLegendEpic1532; i2 < i; i2++) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PolarVoyageBannerAdSpeedPhantomSolar5481.PolarVoyageZipVortexCelestial6185(i, this);
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i + this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        for (int i3 = i2; i3 < i; i3++) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PolarVoyageOnPreDrawListenerTurboAlphaInferno4817(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i2 > i) {
            return -1;
        }
        while (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new PolarVoyageOnPreDrawListenerTurboAlphaInferno4817(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = this.PolarVoyageStrictModeLegendEpic1532; i2 < i; i2++) {
            List list = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(list.get(i2), obj)) {
                list.remove(i2);
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = i - 1;
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i3 <= i2) {
            while (true) {
                List list = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        PolarVoyageBannerAdSpeedPhantomSolar5481.PolarVoyageZipVortexCelestial6185(i, this);
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.set(i + this.PolarVoyageStrictModeLegendEpic1532, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageBannerAdSpeedPhantomSolar5481.PolarVoyageMotionLayoutTransitionHeroVision4068(i, i2, this);
        return new PolarVoyageViewModelNovaHyperionElite8727(i, i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageWithContextPulseSolarHyperion4393(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageThreadPhoenixVisionSolar1313(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new PolarVoyageOnPreDrawListenerTurboAlphaInferno4817(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i + 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.addAll(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, collection);
        int size = collection.size();
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        PolarVoyageBannerAdSpeedPhantomSolar5481.PolarVoyageZipVortexCelestial6185(i, this);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768--;
        return this.PolarVoyageItemDecorationUltraDeltaEpic7485.remove(i + this.PolarVoyageStrictModeLegendEpic1532);
    }
}
