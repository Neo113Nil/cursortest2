package p000createpolar;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageKotlinHyperVortexPixel2096 extends AbstractList implements RandomAccess, PolarVoyageConstraintSetMasterThunder5950 {
    public static final PolarVoyageKotlinHyperVortexPixel2096 PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageKotlinHyperVortexPixel2096(new Object[0], 0, false);
    public boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object[] PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageKotlinHyperVortexPixel2096(Object[] objArr, int i, boolean z) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z;
        this.PolarVoyageStrictModeLegendEpic1532 = objArr;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
    }

    public final PolarVoyageKotlinHyperVortexPixel2096 PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
        if (i >= this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return new PolarVoyageKotlinHyperVortexPixel2096(Arrays.copyOf(this.PolarVoyageStrictModeLegendEpic1532, i), this.PolarVoyageRotateAnimationCyberCelestialDelta4768, true);
        }
        PolarVoyageR8UltraEliteBeta8736.PolarVoyageDrawableDeltaHyperion5742();
        return null;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (!this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            throw new UnsupportedOperationException();
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(int i) {
        if (i < 0 || i >= this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Index:", i, ", Size:");
            PolarVoyageContentProviderHyperSpark3838.append(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        if (i < 0 || i > (i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Index:", i, ", Size:");
            PolarVoyageContentProviderHyperSpark3838.append(this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
        }
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.PolarVoyageStrictModeLegendEpic1532, i, objArr2, i + 1, this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - i);
            this.PolarVoyageStrictModeLegendEpic1532 = objArr2;
        }
        this.PolarVoyageStrictModeLegendEpic1532[i] = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        PolarVoyageZipVortexCelestial6185(i);
        return this.PolarVoyageStrictModeLegendEpic1532[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageZipVortexCelestial6185(i);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj = objArr[i];
        if (i < this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        PolarVoyageZipVortexCelestial6185(i);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (i == objArr.length) {
            this.PolarVoyageStrictModeLegendEpic1532 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
