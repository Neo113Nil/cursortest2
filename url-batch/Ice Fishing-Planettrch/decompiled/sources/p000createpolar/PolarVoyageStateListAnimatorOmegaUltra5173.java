package p000createpolar;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageStateListAnimatorOmegaUltra5173 implements Map, Serializable, PolarVoyageGuidelineHyperionAurora4598 {
    public static final PolarVoyageStateListAnimatorOmegaUltra5173 PolarVoyageDisplayMetricsVortexDragon9516;
    public PolarVoyageFirebaseLegendGamma3176 PolarVoyageAnimatorSetSparkUltraMax8233;
    public boolean PolarVoyageBitmapMaxTitanTitan7960;
    public int[] PolarVoyageBottomSheetOmegaNeo1907;
    public int PolarVoyageCameraPixelBlaze2629;
    public int PolarVoyageContentProviderHyperSpark3838;
    public int PolarVoyageDrawableDeltaHyperion5742;
    public Object[] PolarVoyageItemDecorationUltraDeltaEpic7485;
    public PolarVoyageColorStateListInflaterMasterEclipse7836 PolarVoyageNavigationViewHyperHyperHyperion1793;
    public PolarVoyageFirebaseLegendGamma3176 PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public int[] PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageSnackbarGammaEclipse2140;
    public Object[] PolarVoyageStrictModeLegendEpic1532;
    public int PolarVoyageViewRogueMaster4778;

    static {
        PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = new PolarVoyageStateListAnimatorOmegaUltra5173(0);
        polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageBitmapMaxTitanTitan7960 = true;
        PolarVoyageDisplayMetricsVortexDragon9516 = polarVoyageStateListAnimatorOmegaUltra5173;
    }

    public PolarVoyageStateListAnimatorOmegaUltra5173(int i) {
        if (i < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = objArr;
        this.PolarVoyageStrictModeLegendEpic1532 = null;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = iArr;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new int[highestOneBit];
        this.PolarVoyageViewRogueMaster4778 = 2;
        this.PolarVoyageCameraPixelBlaze2629 = 0;
        this.PolarVoyageDrawableDeltaHyperion5742 = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(Collection collection) {
        boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(entry.getKey());
                    if (PolarVoyageDiffUtilTurboStrike5735 < 0) {
                        PolarVoyageItemDecorationUltraDeltaEpic7485 = false;
                    } else {
                        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
                        objArr.getClass();
                        PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(objArr[PolarVoyageDiffUtilTurboStrike5735], entry.getValue());
                    }
                    if (!PolarVoyageItemDecorationUltraDeltaEpic7485) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int length = objArr.length;
        int i2 = this.PolarVoyageCameraPixelBlaze2629;
        int i3 = length - i2;
        int i4 = i2 - this.PolarVoyageContentProviderHyperSpark3838;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            PolarVoyageKotlinBetaPulseBeta3653(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.PolarVoyageItemDecorationUltraDeltaEpic7485 = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
            this.PolarVoyageStrictModeLegendEpic1532 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Arrays.copyOf(this.PolarVoyageRotateAnimationCyberCelestialDelta4768, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.PolarVoyageBottomSheetOmegaNeo1907.length) {
                PolarVoyageStrictModeLegendEpic1532(highestOneBit);
            }
        }
    }

    public final int PolarVoyageDiffUtilTurboStrike5735(Object obj) {
        int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(obj);
        int i = this.PolarVoyageViewRogueMaster4778;
        while (true) {
            int i2 = this.PolarVoyageBottomSheetOmegaNeo1907[PolarVoyageItemDecorationUltraDeltaEpic7485];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485 == 0 ? this.PolarVoyageBottomSheetOmegaNeo1907.length - 1 : PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
        }
    }

    public final int PolarVoyageItemDecorationUltraDeltaEpic7485(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.PolarVoyageDrawableDeltaHyperion5742;
    }

    public final void PolarVoyageKotlinBetaPulseBeta3653(boolean z) {
        int i;
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.PolarVoyageCameraPixelBlaze2629;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.PolarVoyageBottomSheetOmegaNeo1907[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(this.PolarVoyageItemDecorationUltraDeltaEpic7485, i3, i);
        if (objArr != null) {
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(objArr, i3, this.PolarVoyageCameraPixelBlaze2629);
        }
        this.PolarVoyageCameraPixelBlaze2629 = i3;
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        if (this.PolarVoyageBitmapMaxTitanTitan7960) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(int i) {
        Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.PolarVoyageStrictModeLegendEpic1532;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i2 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i];
        int i3 = this.PolarVoyageViewRogueMaster4778 * 2;
        int length = this.PolarVoyageBottomSheetOmegaNeo1907.length / 2;
        if (i3 > length) {
            i3 = length;
        }
        int i4 = i3;
        int i5 = 0;
        int i6 = i2;
        while (true) {
            i2 = i2 == 0 ? this.PolarVoyageBottomSheetOmegaNeo1907.length - 1 : i2 - 1;
            i5++;
            int i7 = this.PolarVoyageViewRogueMaster4778;
            int[] iArr = this.PolarVoyageBottomSheetOmegaNeo1907;
            if (i5 > i7) {
                iArr[i6] = 0;
                break;
            }
            int i8 = iArr[i2];
            if (i8 == 0) {
                iArr[i6] = 0;
                break;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i9]) - i2;
                int[] iArr2 = this.PolarVoyageBottomSheetOmegaNeo1907;
                if ((PolarVoyageItemDecorationUltraDeltaEpic7485 & (iArr2.length - 1)) >= i5) {
                    iArr2[i6] = i8;
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i9] = i6;
                }
                i4--;
                if (i4 >= 0) {
                    this.PolarVoyageBottomSheetOmegaNeo1907[i6] = -1;
                    break;
                }
            }
            i6 = i2;
            i5 = 0;
            i4--;
            if (i4 >= 0) {
            }
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i] = -1;
        this.PolarVoyageContentProviderHyperSpark3838--;
        this.PolarVoyageSnackbarGammaEclipse2140++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.PolarVoyageRotateAnimationCyberCelestialDelta4768[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PolarVoyageStrictModeLegendEpic1532(int i) {
        this.PolarVoyageSnackbarGammaEclipse2140++;
        int i2 = 0;
        if (this.PolarVoyageCameraPixelBlaze2629 > this.PolarVoyageContentProviderHyperSpark3838) {
            PolarVoyageKotlinBetaPulseBeta3653(false);
        }
        this.PolarVoyageBottomSheetOmegaNeo1907 = new int[i];
        this.PolarVoyageDrawableDeltaHyperion5742 = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.PolarVoyageCameraPixelBlaze2629) {
            int i3 = i2 + 1;
            int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i2]);
            int i4 = this.PolarVoyageViewRogueMaster4778;
            while (true) {
                int[] iArr = this.PolarVoyageBottomSheetOmegaNeo1907;
                if (iArr[PolarVoyageItemDecorationUltraDeltaEpic7485] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485 == 0 ? iArr.length - 1 : PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
            }
        }
    }

    public final int PolarVoyageTextInputEditTextNebulaHero6651(Object obj) {
        int i = this.PolarVoyageCameraPixelBlaze2629;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i] >= 0) {
                Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
                objArr.getClass();
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int PolarVoyageZipVortexCelestial6185(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        while (true) {
            int PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485(obj);
            int i = this.PolarVoyageViewRogueMaster4778 * 2;
            int length = this.PolarVoyageBottomSheetOmegaNeo1907.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.PolarVoyageBottomSheetOmegaNeo1907;
                int i3 = iArr[PolarVoyageItemDecorationUltraDeltaEpic7485];
                if (i3 <= 0) {
                    int i4 = this.PolarVoyageCameraPixelBlaze2629;
                    Object[] objArr = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.PolarVoyageCameraPixelBlaze2629 = i5;
                        objArr[i4] = obj;
                        this.PolarVoyageRotateAnimationCyberCelestialDelta4768[i4] = PolarVoyageItemDecorationUltraDeltaEpic7485;
                        iArr[PolarVoyageItemDecorationUltraDeltaEpic7485] = i5;
                        this.PolarVoyageContentProviderHyperSpark3838++;
                        this.PolarVoyageSnackbarGammaEclipse2140++;
                        if (i2 > this.PolarVoyageViewRogueMaster4778) {
                            this.PolarVoyageViewRogueMaster4778 = i2;
                        }
                        return i4;
                    }
                    PolarVoyageBitmapVisionAuroraPixel4705(1);
                } else {
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageItemDecorationUltraDeltaEpic7485[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        PolarVoyageStrictModeLegendEpic1532(this.PolarVoyageBottomSheetOmegaNeo1907.length * 2);
                        break;
                    }
                    PolarVoyageItemDecorationUltraDeltaEpic7485 = PolarVoyageItemDecorationUltraDeltaEpic7485 == 0 ? this.PolarVoyageBottomSheetOmegaNeo1907.length - 1 : PolarVoyageItemDecorationUltraDeltaEpic7485 - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int i = this.PolarVoyageCameraPixelBlaze2629 - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.PolarVoyageBottomSheetOmegaNeo1907[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(this.PolarVoyageItemDecorationUltraDeltaEpic7485, 0, this.PolarVoyageCameraPixelBlaze2629);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (objArr != null) {
            PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageAlertDialogNovaXCelestial4954(objArr, 0, this.PolarVoyageCameraPixelBlaze2629);
        }
        this.PolarVoyageContentProviderHyperSpark3838 = 0;
        this.PolarVoyageCameraPixelBlaze2629 = 0;
        this.PolarVoyageSnackbarGammaEclipse2140++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return PolarVoyageDiffUtilTurboStrike5735(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return PolarVoyageTextInputEditTextNebulaHero6651(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        PolarVoyageFirebaseLegendGamma3176 polarVoyageFirebaseLegendGamma3176 = this.PolarVoyageAnimatorSetSparkUltraMax8233;
        if (polarVoyageFirebaseLegendGamma3176 != null) {
            return polarVoyageFirebaseLegendGamma3176;
        }
        PolarVoyageFirebaseLegendGamma3176 polarVoyageFirebaseLegendGamma31762 = new PolarVoyageFirebaseLegendGamma3176(this, 0);
        this.PolarVoyageAnimatorSetSparkUltraMax8233 = polarVoyageFirebaseLegendGamma31762;
        return polarVoyageFirebaseLegendGamma31762;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.PolarVoyageContentProviderHyperSpark3838 == map.size() && PolarVoyageBarcodeScannerInfernoSolarSpark7767(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(obj);
        if (PolarVoyageDiffUtilTurboStrike5735 < 0) {
            return null;
        }
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        objArr.getClass();
        return objArr[PolarVoyageDiffUtilTurboStrike5735];
    }

    @Override // java.util.Map
    public final int hashCode() {
        PolarVoyageGeocoderSpeedEpic6755 polarVoyageGeocoderSpeedEpic6755 = new PolarVoyageGeocoderSpeedEpic6755(this, 0);
        int i = 0;
        while (polarVoyageGeocoderSpeedEpic6755.hasNext()) {
            int i2 = polarVoyageGeocoderSpeedEpic6755.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = (PolarVoyageStateListAnimatorOmegaUltra5173) polarVoyageGeocoderSpeedEpic6755.PolarVoyageBottomSheetOmegaNeo1907;
            if (i2 >= polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageCameraPixelBlaze2629) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                return 0;
            }
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2 + 1;
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageStrictModeLegendEpic1532 = i2;
            Object obj = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageItemDecorationUltraDeltaEpic7485[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageStrictModeLegendEpic1532;
            objArr.getClass();
            Object obj2 = objArr[polarVoyageGeocoderSpeedEpic6755.PolarVoyageStrictModeLegendEpic1532];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageKotlinBetaPulseBeta3653();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.PolarVoyageContentProviderHyperSpark3838 == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        PolarVoyageFirebaseLegendGamma3176 polarVoyageFirebaseLegendGamma3176 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (polarVoyageFirebaseLegendGamma3176 != null) {
            return polarVoyageFirebaseLegendGamma3176;
        }
        PolarVoyageFirebaseLegendGamma3176 polarVoyageFirebaseLegendGamma31762 = new PolarVoyageFirebaseLegendGamma3176(this, 1);
        this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = polarVoyageFirebaseLegendGamma31762;
        return polarVoyageFirebaseLegendGamma31762;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(obj);
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        if (objArr == null) {
            int length = this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
            if (length < 0) {
                PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.PolarVoyageStrictModeLegendEpic1532 = objArr;
        }
        if (PolarVoyageZipVortexCelestial6185 >= 0) {
            objArr[PolarVoyageZipVortexCelestial6185] = obj2;
            return null;
        }
        int i = (-PolarVoyageZipVortexCelestial6185) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        PolarVoyageBitmapVisionAuroraPixel4705(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185(entry.getKey());
            Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
            if (objArr == null) {
                int length = this.PolarVoyageItemDecorationUltraDeltaEpic7485.length;
                if (length < 0) {
                    PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.PolarVoyageStrictModeLegendEpic1532 = objArr;
                }
            }
            if (PolarVoyageZipVortexCelestial6185 >= 0) {
                objArr[PolarVoyageZipVortexCelestial6185] = entry.getValue();
            } else {
                int i = (-PolarVoyageZipVortexCelestial6185) - 1;
                if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PolarVoyageMotionLayoutTransitionHeroVision4068();
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(obj);
        if (PolarVoyageDiffUtilTurboStrike5735 < 0) {
            return null;
        }
        Object[] objArr = this.PolarVoyageStrictModeLegendEpic1532;
        objArr.getClass();
        Object obj2 = objArr[PolarVoyageDiffUtilTurboStrike5735];
        PolarVoyageRotateAnimationCyberCelestialDelta4768(PolarVoyageDiffUtilTurboStrike5735);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.PolarVoyageContentProviderHyperSpark3838;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.PolarVoyageContentProviderHyperSpark3838 * 3) + 2);
        sb.append("{");
        int i = 0;
        PolarVoyageGeocoderSpeedEpic6755 polarVoyageGeocoderSpeedEpic6755 = new PolarVoyageGeocoderSpeedEpic6755(this, 0);
        while (polarVoyageGeocoderSpeedEpic6755.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = polarVoyageGeocoderSpeedEpic6755.PolarVoyageItemDecorationUltraDeltaEpic7485;
            PolarVoyageStateListAnimatorOmegaUltra5173 polarVoyageStateListAnimatorOmegaUltra5173 = (PolarVoyageStateListAnimatorOmegaUltra5173) polarVoyageGeocoderSpeedEpic6755.PolarVoyageBottomSheetOmegaNeo1907;
            if (i2 >= polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageCameraPixelBlaze2629) {
                PolarVoyageBroadcastDragonShadowRogue6783.PolarVoyageItemDecorationUltraDeltaEpic7485();
                return null;
            }
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2 + 1;
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageStrictModeLegendEpic1532 = i2;
            Object obj = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageItemDecorationUltraDeltaEpic7485[i2];
            if (obj == polarVoyageStateListAnimatorOmegaUltra5173) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = polarVoyageStateListAnimatorOmegaUltra5173.PolarVoyageStrictModeLegendEpic1532;
            objArr.getClass();
            Object obj2 = objArr[polarVoyageGeocoderSpeedEpic6755.PolarVoyageStrictModeLegendEpic1532];
            if (obj2 == polarVoyageStateListAnimatorOmegaUltra5173) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            polarVoyageGeocoderSpeedEpic6755.PolarVoyageKotlinBetaPulseBeta3653();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        PolarVoyageColorStateListInflaterMasterEclipse7836 polarVoyageColorStateListInflaterMasterEclipse7836 = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
        if (polarVoyageColorStateListInflaterMasterEclipse7836 != null) {
            return polarVoyageColorStateListInflaterMasterEclipse7836;
        }
        PolarVoyageColorStateListInflaterMasterEclipse7836 polarVoyageColorStateListInflaterMasterEclipse78362 = new PolarVoyageColorStateListInflaterMasterEclipse7836(0, this);
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = polarVoyageColorStateListInflaterMasterEclipse78362;
        return polarVoyageColorStateListInflaterMasterEclipse78362;
    }
}
