package p000createpolar;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePlaceholderCyberSpectraInferno5488 extends PolarVoyageDrawableNovaXTurbo6837 implements RandomAccess, Serializable {
    public static final PolarVoyagePlaceholderCyberSpectraInferno5488 PolarVoyageBottomSheetOmegaNeo1907;
    public Object[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    static {
        PolarVoyagePlaceholderCyberSpectraInferno5488 polarVoyagePlaceholderCyberSpectraInferno5488 = new PolarVoyagePlaceholderCyberSpectraInferno5488(0);
        polarVoyagePlaceholderCyberSpectraInferno5488.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        PolarVoyageBottomSheetOmegaNeo1907 = polarVoyagePlaceholderCyberSpectraInferno5488;
    }

    public PolarVoyagePlaceholderCyberSpectraInferno5488(int i) {
        if (i >= 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new Object[i];
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("capacity must be non-negative.");
            throw null;
        }
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        PolarVoyageItemDecorationUltraDeltaEpic7485(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485[i + i3] = it.next();
        }
    }

    public final int PolarVoyageBottomSheetOmegaNeo1907(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i + i4, i2 + i, this.PolarVoyageStrictModeLegendEpic1532, objArr, objArr);
        Object[] objArr3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i7 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.PolarVoyageStrictModeLegendEpic1532 -= i6;
        return i6;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i, Object obj) {
        ((AbstractList) this).modCount++;
        PolarVoyageItemDecorationUltraDeltaEpic7485(i, 1);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485[i] = obj;
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i, int i2) {
        int i3 = this.PolarVoyageStrictModeLegendEpic1532 + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i + i2, i, this.PolarVoyageStrictModeLegendEpic1532, objArr2, objArr2);
        this.PolarVoyageStrictModeLegendEpic1532 += i2;
    }

    @Override // p000createpolar.PolarVoyageDrawableNovaXTurbo6837
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        PolarVoyageTextInputEditTextNebulaHero6651();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i >= 0 && i < i2) {
            return PolarVoyageStrictModeLegendEpic1532(i);
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i + i2, this.PolarVoyageStrictModeLegendEpic1532, objArr, objArr);
        Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(objArr2, i3 - i2, i3);
        this.PolarVoyageStrictModeLegendEpic1532 -= i2;
    }

    public final Object PolarVoyageStrictModeLegendEpic1532(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = objArr[i];
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i + 1, this.PolarVoyageStrictModeLegendEpic1532, objArr, objArr);
        Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.PolarVoyageStrictModeLegendEpic1532--;
        return obj;
    }

    public final void PolarVoyageTextInputEditTextNebulaHero6651() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // p000createpolar.PolarVoyageDrawableNovaXTurbo6837
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        PolarVoyageTextInputEditTextNebulaHero6651();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i < 0 || i > i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        PolarVoyageItemDecorationUltraDeltaEpic7485(i, 1);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        PolarVoyageTextInputEditTextNebulaHero6651();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i < 0 || i > i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        PolarVoyageBitmapVisionAuroraPixel4705(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        PolarVoyageTextInputEditTextNebulaHero6651();
        PolarVoyageRotateAnimationCyberCelestialDelta4768(0, this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i = this.PolarVoyageStrictModeLegendEpic1532;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i >= 0 && i < i2) {
            return this.PolarVoyageItemDecorationUltraDeltaEpic7485[i];
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.PolarVoyageStrictModeLegendEpic1532; i++) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.PolarVoyageStrictModeLegendEpic1532 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.PolarVoyageStrictModeLegendEpic1532 - 1; i >= 0; i--) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i >= 0 && i <= i2) {
            return new PolarVoyageImageAnalysisNeoEclipseMega9636(this, i);
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        PolarVoyageTextInputEditTextNebulaHero6651();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        PolarVoyageTextInputEditTextNebulaHero6651();
        return PolarVoyageBottomSheetOmegaNeo1907(0, this.PolarVoyageStrictModeLegendEpic1532, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        PolarVoyageTextInputEditTextNebulaHero6651();
        return PolarVoyageBottomSheetOmegaNeo1907(0, this.PolarVoyageStrictModeLegendEpic1532, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        PolarVoyageTextInputEditTextNebulaHero6651();
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i < 0 || i >= i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageActivityInfoBetaQuantum8726(i, i2, this.PolarVoyageStrictModeLegendEpic1532);
        return new PolarVoyageLooperThreadAuroraStrikePixel3154(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 0, i, objArr2, objArr);
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, this.PolarVoyageStrictModeLegendEpic1532, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        PolarVoyageTextInputEditTextNebulaHero6651();
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        ((AbstractList) this).modCount++;
        PolarVoyageItemDecorationUltraDeltaEpic7485(i, 1);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageViewPagerPhantomHyperionNova3183(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        PolarVoyageTextInputEditTextNebulaHero6651();
        int size = collection.size();
        PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageStrictModeLegendEpic1532, collection, size);
        return size > 0;
    }
}
