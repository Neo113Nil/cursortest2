package p000createpolar;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourcesFusionShadowMega2471 implements List, PolarVoyageZipDeltaSpectraRogue6055 {
    public final int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageLinearLayoutGammaAuroraFusion8412 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageResourcesFusionShadowMega2471(PolarVoyageLinearLayoutGammaAuroraFusion8412 polarVoyageLinearLayoutGammaAuroraFusion8412, int i, int i2) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageLinearLayoutGammaAuroraFusion8412;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof PolarVoyageGyroscopePulseAurora9729) && indexOf((PolarVoyageGyroscopePulseAurora9729) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((PolarVoyageGyroscopePulseAurora9729) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object PolarVoyageBitmapVisionAuroraPixel4705 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(i + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        PolarVoyageBitmapVisionAuroraPixel4705.getClass();
        return (PolarVoyageGyroscopePulseAurora9729) PolarVoyageBitmapVisionAuroraPixel4705;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof PolarVoyageGyroscopePulseAurora9729)) {
            return -1;
        }
        PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = (PolarVoyageGyroscopePulseAurora9729) obj;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(i3), polarVoyageGyroscopePulseAurora9729)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return new PolarVoyageImageAnalysisNeoEclipseMega9636(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i, i, this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof PolarVoyageGyroscopePulseAurora9729)) {
            return -1;
        }
        PolarVoyageGyroscopePulseAurora9729 polarVoyageGyroscopePulseAurora9729 = (PolarVoyageGyroscopePulseAurora9729) obj;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 > i) {
            return -1;
        }
        while (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageRotateAnimationCyberCelestialDelta4768.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageBitmapVisionAuroraPixel4705(i), polarVoyageGyroscopePulseAurora9729)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        return new PolarVoyageImageAnalysisNeoEclipseMega9636(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i + i2, i2, i3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.PolarVoyageStrictModeLegendEpic1532 - this.PolarVoyageItemDecorationUltraDeltaEpic7485;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return new PolarVoyageResourcesFusionShadowMega2471(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageWithContextPulseSolarHyperion4393(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageThreadPhoenixVisionSolar1313(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        return new PolarVoyageImageAnalysisNeoEclipseMega9636(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i, i, this.PolarVoyageStrictModeLegendEpic1532);
    }
}
