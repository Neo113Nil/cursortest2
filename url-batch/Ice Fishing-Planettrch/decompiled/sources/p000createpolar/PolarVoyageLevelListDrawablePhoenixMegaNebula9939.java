package p000createpolar;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class PolarVoyageLevelListDrawablePhoenixMegaNebula9939 {
    public int[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public int PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Object[] PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageLevelListDrawablePhoenixMegaNebula9939(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i == 0 ? PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageBitmapVisionAuroraPixel4705 : new int[i];
        this.PolarVoyageStrictModeLegendEpic1532 = i == 0 ? PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651 : new Object[i << 1];
    }

    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == 0) {
            return -1;
        }
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i, 0);
        if (PolarVoyageTextInputEditTextNebulaHero6651 < 0 || this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageTextInputEditTextNebulaHero6651 << 1] == null) {
            return PolarVoyageTextInputEditTextNebulaHero6651;
        }
        int i2 = PolarVoyageTextInputEditTextNebulaHero6651 + 1;
        while (i2 < i && this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2] == 0) {
            if (this.PolarVoyageStrictModeLegendEpic1532[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = PolarVoyageTextInputEditTextNebulaHero6651 - 1; i3 >= 0 && this.PolarVoyageItemDecorationUltraDeltaEpic7485[i3] == 0; i3--) {
            if (this.PolarVoyageStrictModeLegendEpic1532[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        boolean z = false;
        if (i >= 0 && i < this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            z = true;
        }
        if (z) {
            return this.PolarVoyageStrictModeLegendEpic1532[i << 1];
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final Object PolarVoyageDiffUtilTurboStrike5735(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768)) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.copyOf(iArr, i7);
            this.PolarVoyageStrictModeLegendEpic1532 = Arrays.copyOf(this.PolarVoyageStrictModeLegendEpic1532, i7 << 1);
            if (i2 != this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
                return null;
            }
            if (i > 0) {
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(0, 0, i, iArr, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(0, 0, i3, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
            if (i < i4) {
                int i8 = i + 1;
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i, i8, i2, iArr, this.PolarVoyageItemDecorationUltraDeltaEpic7485);
                PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i3, i8 << 1, i2 << 1, objArr, this.PolarVoyageStrictModeLegendEpic1532);
            }
        }
        if (i2 == this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i4;
            return obj;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
        return null;
    }

    public final Object PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        boolean z = false;
        if (i >= 0 && i < this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            z = true;
        }
        if (z) {
            return this.PolarVoyageStrictModeLegendEpic1532[(i << 1) + 1];
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public final int PolarVoyageKotlinBetaPulseBeta3653(Object obj) {
        return obj == null ? PolarVoyageBarcodeScannerInfernoSolarSpark7767() : PolarVoyageMotionLayoutTransitionHeroVision4068(obj.hashCode(), obj);
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(int i, Object obj) {
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i2 == 0) {
            return -1;
        }
        int PolarVoyageTextInputEditTextNebulaHero6651 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i2, i);
        if (PolarVoyageTextInputEditTextNebulaHero6651 < 0 || PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[PolarVoyageTextInputEditTextNebulaHero6651 << 1])) {
            return PolarVoyageTextInputEditTextNebulaHero6651;
        }
        int i3 = PolarVoyageTextInputEditTextNebulaHero6651 + 1;
        while (i3 < i2 && this.PolarVoyageItemDecorationUltraDeltaEpic7485[i3] == i) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = PolarVoyageTextInputEditTextNebulaHero6651 - 1; i4 >= 0 && this.PolarVoyageItemDecorationUltraDeltaEpic7485[i4] == i; i4--) {
            if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this.PolarVoyageStrictModeLegendEpic1532[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object PolarVoyageTextInputEditTextNebulaHero6651(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            z = true;
        }
        if (!z) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageItemDecorationUltraDeltaEpic7485("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int PolarVoyageZipVortexCelestial6185(Object obj) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768 * 2;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void clear() {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 > 0) {
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageBitmapVisionAuroraPixel4705;
            this.PolarVoyageStrictModeLegendEpic1532 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = 0;
        }
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768 <= 0) {
            return;
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
    }

    public boolean containsKey(Object obj) {
        return PolarVoyageKotlinBetaPulseBeta3653(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return PolarVoyageZipVortexCelestial6185(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof PolarVoyageLevelListDrawablePhoenixMegaNebula9939) {
                int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                if (i != ((PolarVoyageLevelListDrawablePhoenixMegaNebula9939) obj).PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    return false;
                }
                PolarVoyageLevelListDrawablePhoenixMegaNebula9939 polarVoyageLevelListDrawablePhoenixMegaNebula9939 = (PolarVoyageLevelListDrawablePhoenixMegaNebula9939) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i2);
                    Object PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
                    Object obj2 = polarVoyageLevelListDrawablePhoenixMegaNebula9939.get(PolarVoyageBitmapVisionAuroraPixel4705);
                    if (PolarVoyageItemDecorationUltraDeltaEpic7485 == null) {
                        if (obj2 != null || !polarVoyageLevelListDrawablePhoenixMegaNebula9939.containsKey(PolarVoyageBitmapVisionAuroraPixel4705)) {
                            return false;
                        }
                    } else if (!PolarVoyageItemDecorationUltraDeltaEpic7485.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.PolarVoyageRotateAnimationCyberCelestialDelta4768 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            for (int i4 = 0; i4 < i3; i4++) {
                Object PolarVoyageBitmapVisionAuroraPixel47052 = PolarVoyageBitmapVisionAuroraPixel4705(i4);
                Object PolarVoyageItemDecorationUltraDeltaEpic74852 = PolarVoyageItemDecorationUltraDeltaEpic7485(i4);
                Object obj3 = ((Map) obj).get(PolarVoyageBitmapVisionAuroraPixel47052);
                if (PolarVoyageItemDecorationUltraDeltaEpic74852 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(PolarVoyageBitmapVisionAuroraPixel47052)) {
                        return false;
                    }
                } else if (!PolarVoyageItemDecorationUltraDeltaEpic74852.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 >= 0) {
            return this.PolarVoyageStrictModeLegendEpic1532[(PolarVoyageKotlinBetaPulseBeta3653 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        return PolarVoyageKotlinBetaPulseBeta3653 >= 0 ? this.PolarVoyageStrictModeLegendEpic1532[(PolarVoyageKotlinBetaPulseBeta3653 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final boolean isEmpty() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768 <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int PolarVoyageMotionLayoutTransitionHeroVision4068 = obj != null ? PolarVoyageMotionLayoutTransitionHeroVision4068(hashCode, obj) : PolarVoyageBarcodeScannerInfernoSolarSpark7767();
        if (PolarVoyageMotionLayoutTransitionHeroVision4068 >= 0) {
            int i2 = (PolarVoyageMotionLayoutTransitionHeroVision4068 << 1) + 1;
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~PolarVoyageMotionLayoutTransitionHeroVision4068;
        int[] iArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.copyOf(iArr, i4);
            this.PolarVoyageStrictModeLegendEpic1532 = Arrays.copyOf(this.PolarVoyageStrictModeLegendEpic1532, i4 << 1);
            if (i != this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            int i5 = i3 + 1;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageSensorManagerFusionPixelSolar7026(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageFlowOnBetaCyber2473(i5 << 1, i3 << 1, this.PolarVoyageRotateAnimationCyberCelestialDelta4768 << 1, objArr2, objArr2);
        }
        int i6 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == i6) {
            int[] iArr3 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.PolarVoyageStrictModeLegendEpic1532;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = i6 + 1;
                return null;
            }
        }
        PolarVoyageCamera2MasterPulse1881.PolarVoyageBitmapVisionAuroraPixel4705();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 < 0 || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj2, PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageKotlinBetaPulseBeta3653))) {
            return false;
        }
        PolarVoyageDiffUtilTurboStrike5735(PolarVoyageKotlinBetaPulseBeta3653);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 < 0 || !PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj2, PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageKotlinBetaPulseBeta3653))) {
            return false;
        }
        PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageKotlinBetaPulseBeta3653, obj3);
        return true;
    }

    public final int size() {
        return this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.PolarVoyageRotateAnimationCyberCelestialDelta4768 * 28);
        sb.append('{');
        int i = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i2);
            if (PolarVoyageBitmapVisionAuroraPixel4705 != sb) {
                sb.append(PolarVoyageBitmapVisionAuroraPixel4705);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(i2);
            if (PolarVoyageItemDecorationUltraDeltaEpic7485 != sb) {
                sb.append(PolarVoyageItemDecorationUltraDeltaEpic7485);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 >= 0) {
            return PolarVoyageDiffUtilTurboStrike5735(PolarVoyageKotlinBetaPulseBeta3653);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageKotlinBetaPulseBeta3653(obj);
        if (PolarVoyageKotlinBetaPulseBeta3653 >= 0) {
            return PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageKotlinBetaPulseBeta3653, obj2);
        }
        return null;
    }
}
