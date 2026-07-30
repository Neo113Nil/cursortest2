package p000createpolar;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTransformPhantomCosmosFusion4026 extends AbstractList implements RandomAccess, Serializable {
    public final int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageTransformPhantomCosmosFusion4026(int[] iArr, int i, int i2) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        while (true) {
            if (i >= this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                i = -1;
                break;
            }
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485[i] == intValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageTransformPhantomCosmosFusion4026)) {
            return super.equals(obj);
        }
        PolarVoyageTransformPhantomCosmosFusion4026 polarVoyageTransformPhantomCosmosFusion4026 = (PolarVoyageTransformPhantomCosmosFusion4026) obj;
        int size = size();
        if (polarVoyageTransformPhantomCosmosFusion4026.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.PolarVoyageItemDecorationUltraDeltaEpic7485[this.PolarVoyageStrictModeLegendEpic1532 + i] != polarVoyageTransformPhantomCosmosFusion4026.PolarVoyageItemDecorationUltraDeltaEpic7485[polarVoyageTransformPhantomCosmosFusion4026.PolarVoyageStrictModeLegendEpic1532 + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i, size());
        return Integer.valueOf(this.PolarVoyageItemDecorationUltraDeltaEpic7485[this.PolarVoyageStrictModeLegendEpic1532 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.PolarVoyageStrictModeLegendEpic1532; i2 < this.PolarVoyageRotateAnimationCyberCelestialDelta4768; i2++) {
            i = (i * 31) + this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.PolarVoyageStrictModeLegendEpic1532;
            int i2 = i;
            while (true) {
                if (i2 >= this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    i2 = -1;
                    break;
                }
                if (this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2] == intValue) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            while (true) {
                i2--;
                i = this.PolarVoyageStrictModeLegendEpic1532;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageDisplayMetricsVortexDragon9516(i, size());
        int i2 = this.PolarVoyageStrictModeLegendEpic1532 + i;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - this.PolarVoyageStrictModeLegendEpic1532;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageLooperThreadAlphaPrime1279(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        return new PolarVoyageTransformPhantomCosmosFusion4026(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
