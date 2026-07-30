package p000createpolar;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLayoutInflaterTitaniumMaxSolar6862 implements Collection, Set, PolarVoyageGraphQuantumMasterOmega4348, PolarVoyageSensorManagerThunderPulseNebula9092 {
    public int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object[] PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLayoutInflaterTitaniumMaxSolar6862(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageBitmapVisionAuroraPixel4705;
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
        if (i > 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new int[i];
            this.PolarVoyageStrictModeLegendEpic1532 = new Object[i];
        }
    }

    public final Object PolarVoyageZipVortexCelestial6185(int i) {
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i4, i2, objArr2, objArr2);
            }
            this.PolarVoyageStrictModeLegendEpic1532[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr2;
            this.PolarVoyageStrictModeLegendEpic1532 = new Object[i5];
            if (i > 0) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(0, i, 6, iArr, iArr2);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCardViewSpectraTurbo5149(0, i, 6, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
            if (i < i3) {
                int i6 = i + 1;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i, i6, i2, iArr, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i, i6, i2, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
        }
        if (i2 == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i3;
            return obj;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int PolarVoyageConfigurationMaxSpectraForce5418;
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (obj == null) {
            PolarVoyageConfigurationMaxSpectraForce5418 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            PolarVoyageConfigurationMaxSpectraForce5418 = PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, obj, hashCode);
        }
        if (PolarVoyageConfigurationMaxSpectraForce5418 >= 0) {
            return false;
        }
        int i3 = ~PolarVoyageConfigurationMaxSpectraForce5418;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            int[] iArr2 = new int[i4];
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr2;
            this.PolarVoyageStrictModeLegendEpic1532 = new Object[i4];
            if (i2 != this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
                return false;
            }
            if (iArr2.length != 0) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(0, iArr.length, 6, iArr, iArr2);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCardViewSpectraTurbo5149(0, objArr.length, 6, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i5 = i3 + 1;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i2 == i6) {
            int[] iArr4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.PolarVoyageStrictModeLegendEpic1532[i3] = obj;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i6 + 1;
                return true;
            }
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            int[] iArr2 = new int[size];
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = iArr2;
            this.PolarVoyageStrictModeLegendEpic1532 = new Object[size];
            if (i > 0) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDelayCyberQuantumEclipse8687(0, i, 6, iArr, iArr2);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCardViewSpectraTurbo5149(0, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, 6, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != i) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 == 0) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, null, 0) : PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.PolarVoyageStrictModeLegendEpic1532[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PolarVoyageInsetDrawableSpectraElitePhantom6346(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int PolarVoyageConfigurationMaxSpectraForce5418 = obj == null ? PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, null, 0) : PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageConfigurationMaxSpectraForce5418(this, obj, obj.hashCode());
        if (PolarVoyageConfigurationMaxSpectraForce5418 < 0) {
            return false;
        }
        PolarVoyageZipVortexCelestial6185(PolarVoyageConfigurationMaxSpectraForce5418);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1; -1 < i; i--) {
            if (!PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageFlowOnBetaCyber2473(collection, this.PolarVoyageStrictModeLegendEpic1532[i])) {
                PolarVoyageZipVortexCelestial6185(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 0, this.PolarVoyageRotateAnimationCyberCelestialDelta4768, this.PolarVoyageStrictModeLegendEpic1532, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 * 14);
        sb.append('{');
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.PolarVoyageStrictModeLegendEpic1532[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageViewPagerPhantomHyperionNova3183(this.PolarVoyageStrictModeLegendEpic1532, 0, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
    }
}
