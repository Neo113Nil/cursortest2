package p000createpolar;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMLKitNovaXNovaSpectra9261 extends PolarVoyageDrawableNovaXTurbo6837 {
    public static final Object[] PolarVoyageBottomSheetOmegaNeo1907 = new Object[0];
    public int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object[] PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageMLKitNovaXNovaSpectra9261(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = PolarVoyageBottomSheetOmegaNeo1907;
        } else {
            if (i <= 0) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.PolarVoyageStrictModeLegendEpic1532 = objArr;
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.PolarVoyageStrictModeLegendEpic1532.length;
        while (i < length && it.hasNext()) {
            this.PolarVoyageStrictModeLegendEpic1532[i] = it.next();
            i++;
        }
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.PolarVoyageStrictModeLegendEpic1532[i3] = it.next();
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = collection.size() + this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Deque is too big.");
            return;
        }
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == PolarVoyageBottomSheetOmegaNeo1907) {
            if (i < 10) {
                i = 10;
            }
            this.PolarVoyageStrictModeLegendEpic1532 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, this.PolarVoyageItemDecorationUltraDeltaEpic7485, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
        int length2 = objArr3.length;
        int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(length2 - i3, 0, i3, objArr3, objArr2);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        this.PolarVoyageStrictModeLegendEpic1532 = objArr2;
    }

    public final void PolarVoyageBottomSheetOmegaNeo1907() {
        ((AbstractList) this).modCount++;
    }

    public final int PolarVoyageDiffUtilTurboStrike5735(int i) {
        this.PolarVoyageStrictModeLegendEpic1532.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        return i < 0 ? i + this.PolarVoyageStrictModeLegendEpic1532.length : i;
    }

    @Override // p000createpolar.PolarVoyageDrawableNovaXTurbo6837
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0 || i >= i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == PolarVoyageZipVortexCelestial6185() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj = objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768];
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 >> 1;
        int i4 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i < i3) {
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768 >= i4) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i4 + 1, i4, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(1, 0, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
                Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
            int i6 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            objArr3[i6] = null;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDiffUtilTurboStrike5735(i6);
        } else {
            int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768((PolarVoyageZipVortexCelestial6185() - 1) + i4);
            Object[] objArr4 = this.PolarVoyageStrictModeLegendEpic1532;
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768 <= PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1, PolarVoyageRotateAnimationCyberCelestialDelta47682 + 1, objArr4, objArr4);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.PolarVoyageStrictModeLegendEpic1532;
                objArr5[objArr5.length - 1] = objArr5[0];
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 1, PolarVoyageRotateAnimationCyberCelestialDelta47682 + 1, objArr5, objArr5);
            }
            this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta47682] = null;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768--;
        return obj;
    }

    public final int PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void PolarVoyageStrictModeLegendEpic1532(int i, int i2) {
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (i < i2) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageStrictModeLegendEpic1532, 0, i2);
        }
    }

    public final Object PolarVoyageTextInputEditTextNebulaHero6651() {
        if (isEmpty()) {
            return null;
        }
        return this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768((size() - 1) + this.PolarVoyageItemDecorationUltraDeltaEpic7485)];
    }

    @Override // p000createpolar.PolarVoyageDrawableNovaXTurbo6837
    public final int PolarVoyageZipVortexCelestial6185() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0 || i > i3) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i3, "index: ", ", size: "));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1);
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i);
        int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < ((i4 + 1) >> 1)) {
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768 == 0) {
                Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
            }
            int i5 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i5 == 0) {
                Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i7, i7 + 1, i2 + 1, objArr3, objArr3);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.PolarVoyageStrictModeLegendEpic1532;
                objArr4[objArr4.length - 1] = objArr4[0];
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 1, i2 + 1, objArr4, objArr4);
            }
            this.PolarVoyageStrictModeLegendEpic1532[i2] = obj;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i6;
        } else {
            int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(i4 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            Object[] objArr5 = this.PolarVoyageStrictModeLegendEpic1532;
            if (PolarVoyageRotateAnimationCyberCelestialDelta4768 < PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1, PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr5, objArr5);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(1, 0, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr5, objArr5);
                Object[] objArr6 = this.PolarVoyageStrictModeLegendEpic1532;
                objArr6[0] = objArr6[objArr6.length - 1];
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr6.length - 1, objArr6, objArr6);
            }
            this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i < 0 || i > i2) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return addAll(collection);
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageBitmapVisionAuroraPixel4705(collection.size() + this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i);
        int size = collection.size();
        if (i >= ((this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1) >> 1)) {
            int i3 = PolarVoyageRotateAnimationCyberCelestialDelta47682 + size;
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            if (PolarVoyageRotateAnimationCyberCelestialDelta47682 < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                int i4 = size + PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (i4 <= objArr.length) {
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3, PolarVoyageRotateAnimationCyberCelestialDelta47682, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3 - objArr.length, PolarVoyageRotateAnimationCyberCelestialDelta47682, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
                } else {
                    int length = PolarVoyageRotateAnimationCyberCelestialDelta4768 - (i4 - objArr.length);
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, length, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
                    Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3, PolarVoyageRotateAnimationCyberCelestialDelta47682, length, objArr2, objArr2);
                }
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(size, 0, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr, objArr);
                Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
                if (i3 >= objArr3.length) {
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3 - objArr3.length, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr3.length, objArr3, objArr3);
                } else {
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.PolarVoyageStrictModeLegendEpic1532;
                    PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr4.length - size, objArr4, objArr4);
                }
            }
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageRotateAnimationCyberCelestialDelta47682, collection);
            return true;
        }
        int i5 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int i6 = i5 - size;
        Object[] objArr5 = this.PolarVoyageStrictModeLegendEpic1532;
        if (PolarVoyageRotateAnimationCyberCelestialDelta47682 < i5) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.PolarVoyageStrictModeLegendEpic1532;
            if (size >= PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(objArr6.length - size, 0, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr6, objArr6);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, size, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i6, i5, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = PolarVoyageRotateAnimationCyberCelestialDelta47682 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i6, i5, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr5, objArr5);
            } else {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, this.PolarVoyageItemDecorationUltraDeltaEpic7485 + length2, PolarVoyageRotateAnimationCyberCelestialDelta47682, objArr8, objArr8);
            }
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i6;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageRotateAnimationCyberCelestialDelta47682 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageBitmapVisionAuroraPixel4705(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1);
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i == 0) {
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
        this.PolarVoyageStrictModeLegendEpic1532[i2] = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768++;
    }

    public final void addLast(Object obj) {
        PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageZipVortexCelestial6185() + 1);
        this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageZipVortexCelestial6185() + this.PolarVoyageItemDecorationUltraDeltaEpic7485)] = obj;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageZipVortexCelestial6185() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            PolarVoyageBottomSheetOmegaNeo1907();
            PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageZipVortexCelestial6185() + this.PolarVoyageItemDecorationUltraDeltaEpic7485));
        }
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.PolarVoyageStrictModeLegendEpic1532[this.PolarVoyageItemDecorationUltraDeltaEpic7485];
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        if (i >= 0 && i < PolarVoyageZipVortexCelestial6185) {
            return this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i)];
        }
        PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, PolarVoyageZipVortexCelestial6185, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageZipVortexCelestial6185() + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            while (i2 < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[i2])) {
                    i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485) < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return -1;
        }
        int length = this.PolarVoyageStrictModeLegendEpic1532.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < PolarVoyageRotateAnimationCyberCelestialDelta4768; i3++) {
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[i3])) {
                        i2 = i3 + this.PolarVoyageStrictModeLegendEpic1532.length;
                        i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    }
                }
                return -1;
            }
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[i2])) {
                i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return PolarVoyageZipVortexCelestial6185() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("ArrayDeque is empty.");
            return null;
        }
        return this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768((size() - 1) + this.PolarVoyageItemDecorationUltraDeltaEpic7485)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            length = PolarVoyageRotateAnimationCyberCelestialDelta4768 - 1;
            if (i2 <= length) {
                while (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.PolarVoyageItemDecorationUltraDeltaEpic7485 >= PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            while (true) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768--;
                Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
                if (-1 >= PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (i3 <= length) {
                        while (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    }
                } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768])) {
                    length = PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageStrictModeLegendEpic1532.length;
                    i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        PolarVoyageMotionLayoutTransitionHeroVision4068(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.PolarVoyageStrictModeLegendEpic1532.length != 0) {
            int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i < PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
                while (true) {
                    objArr = this.PolarVoyageStrictModeLegendEpic1532;
                    if (i >= PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj;
                        PolarVoyageRotateAnimationCyberCelestialDelta4768++;
                    }
                    i++;
                }
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(objArr, PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageRotateAnimationCyberCelestialDelta47682);
            } else {
                int length = this.PolarVoyageStrictModeLegendEpic1532.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.PolarVoyageStrictModeLegendEpic1532[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(i2);
                for (int i3 = 0; i3 < PolarVoyageRotateAnimationCyberCelestialDelta47682; i3++) {
                    Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj3;
                        PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDiffUtilTurboStrike5735(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    }
                }
                z = z2;
            }
            if (z) {
                PolarVoyageBottomSheetOmegaNeo1907();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageRotateAnimationCyberCelestialDelta4768 - this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("ArrayDeque is empty.");
            return null;
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = objArr[i];
        objArr[i] = null;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDiffUtilTurboStrike5735(i);
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageZipVortexCelestial6185() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageStrictModeLegendEpic1532("ArrayDeque is empty.");
            return null;
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768((size() - 1) + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj = objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768];
        objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768] = null;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageZipVortexCelestial6185() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageActivityInfoBetaQuantum8726(i, i2, this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            clear();
            return;
        }
        if (i3 == 1) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(i);
            return;
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        int i4 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 - i2;
        int i5 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i < i4) {
            int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768((i - 1) + i5);
            int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + (i2 - 1));
            while (i > 0) {
                int i6 = PolarVoyageRotateAnimationCyberCelestialDelta4768 + 1;
                int min = Math.min(i, Math.min(i6, PolarVoyageRotateAnimationCyberCelestialDelta47682 + 1));
                Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
                int i7 = PolarVoyageRotateAnimationCyberCelestialDelta47682 - min;
                int i8 = PolarVoyageRotateAnimationCyberCelestialDelta4768 - min;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i7 + 1, i8 + 1, i6, objArr, objArr);
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageItemDecorationUltraDeltaEpic7485(i8);
                PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageItemDecorationUltraDeltaEpic7485(i7);
                i -= min;
            }
            int PolarVoyageRotateAnimationCyberCelestialDelta47683 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i3);
            PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageItemDecorationUltraDeltaEpic7485, PolarVoyageRotateAnimationCyberCelestialDelta47683);
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageRotateAnimationCyberCelestialDelta47683;
        } else {
            int PolarVoyageRotateAnimationCyberCelestialDelta47684 = PolarVoyageRotateAnimationCyberCelestialDelta4768(i5 + i2);
            int PolarVoyageRotateAnimationCyberCelestialDelta47685 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i);
            int i9 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                i2 = Math.min(i9, Math.min(objArr2.length - PolarVoyageRotateAnimationCyberCelestialDelta47684, objArr2.length - PolarVoyageRotateAnimationCyberCelestialDelta47685));
                Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
                int i10 = PolarVoyageRotateAnimationCyberCelestialDelta47684 + i2;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(PolarVoyageRotateAnimationCyberCelestialDelta47685, PolarVoyageRotateAnimationCyberCelestialDelta47684, i10, objArr3, objArr3);
                PolarVoyageRotateAnimationCyberCelestialDelta47684 = PolarVoyageRotateAnimationCyberCelestialDelta4768(i10);
                PolarVoyageRotateAnimationCyberCelestialDelta47685 = PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageRotateAnimationCyberCelestialDelta47685 + i2);
            }
            int PolarVoyageRotateAnimationCyberCelestialDelta47686 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            PolarVoyageStrictModeLegendEpic1532(PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageRotateAnimationCyberCelestialDelta47686 - i3), PolarVoyageRotateAnimationCyberCelestialDelta47686);
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int PolarVoyageRotateAnimationCyberCelestialDelta4768;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.PolarVoyageStrictModeLegendEpic1532.length != 0) {
            int PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i < PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = i;
                while (true) {
                    objArr = this.PolarVoyageStrictModeLegendEpic1532;
                    if (i >= PolarVoyageRotateAnimationCyberCelestialDelta47682) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj;
                        PolarVoyageRotateAnimationCyberCelestialDelta4768++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(objArr, PolarVoyageRotateAnimationCyberCelestialDelta4768, PolarVoyageRotateAnimationCyberCelestialDelta47682);
            } else {
                int length = this.PolarVoyageStrictModeLegendEpic1532.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.PolarVoyageStrictModeLegendEpic1532[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(i2);
                for (int i3 = 0; i3 < PolarVoyageRotateAnimationCyberCelestialDelta47682; i3++) {
                    Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj3;
                        PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageDiffUtilTurboStrike5735(PolarVoyageRotateAnimationCyberCelestialDelta4768);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                PolarVoyageBottomSheetOmegaNeo1907();
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageRotateAnimationCyberCelestialDelta4768 - this.PolarVoyageItemDecorationUltraDeltaEpic7485);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        if (i < 0 || i >= PolarVoyageZipVortexCelestial6185) {
            PolarVoyageMeteringPointSolarMax4741.PolarVoyageBitmapVisionAuroraPixel4705(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageTextInputEditTextNebulaHero6651(i, PolarVoyageZipVortexCelestial6185, "index: ", ", size: "));
            return null;
        }
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageItemDecorationUltraDeltaEpic7485 + i);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj2 = objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768];
        objArr[PolarVoyageRotateAnimationCyberCelestialDelta4768] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageRotateAnimationCyberCelestialDelta4768(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 + this.PolarVoyageItemDecorationUltraDeltaEpic7485);
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i2 < PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCardViewSpectraTurbo5149(i2, PolarVoyageRotateAnimationCyberCelestialDelta4768, 2, this.PolarVoyageStrictModeLegendEpic1532, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, this.PolarVoyageItemDecorationUltraDeltaEpic7485, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(objArr3.length - this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, PolarVoyageRotateAnimationCyberCelestialDelta4768, objArr3, objArr);
        }
        int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public PolarVoyageMLKitNovaXNovaSpectra9261() {
        this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageBottomSheetOmegaNeo1907;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[PolarVoyageZipVortexCelestial6185()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        PolarVoyageBottomSheetOmegaNeo1907();
        PolarVoyageBitmapVisionAuroraPixel4705(collection.size() + PolarVoyageZipVortexCelestial6185());
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageZipVortexCelestial6185() + this.PolarVoyageItemDecorationUltraDeltaEpic7485), collection);
        return true;
    }
}
