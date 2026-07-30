package p000createpolar;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageImageCaptureShadowBlaze1163 implements PolarVoyageAlphaAnimationHeroTitanium5808 {
    public Object PolarVoyageBottomSheetOmegaNeo1907;
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public int PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageImageCaptureShadowBlaze1163(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 8;
        this.PolarVoyageStrictModeLegendEpic1532 = i2;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.PolarVoyageBottomSheetOmegaNeo1907 = bArr;
    }

    @Override // p000createpolar.PolarVoyageAlphaAnimationHeroTitanium5808
    public PolarVoyageStateListAnimatorVortexSparkSpeed3559 PolarVoyageAlertDialogCyberHeroQuantum3938(PolarVoyageMotionEventDeltaNovaXShadow3329 polarVoyageMotionEventDeltaNovaXShadow3329, long j) {
        long j2;
        long position = polarVoyageMotionEventDeltaNovaXShadow3329.getPosition();
        int min = (int) Math.min(112800L, polarVoyageMotionEventDeltaNovaXShadow3329.PolarVoyageBarcodeScannerInfernoSolarSpark7767() - position);
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageBottomSheetOmegaNeo1907;
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageToolbarEclipseInfernoHero6368(min);
        polarVoyageMotionEventDeltaNovaXShadow3329.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185, 0, min);
        int i = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageKotlinBetaPulseBeta3653;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageZipVortexCelestial6185;
            int i2 = polarVoyageTextRecognitionHeroOmega1312.PolarVoyageMotionLayoutTransitionHeroVision4068;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long PolarVoyageCameraPixelBlaze2629 = PolarVoyageFlowOnCosmosTurbo3722.PolarVoyageCameraPixelBlaze2629(polarVoyageTextRecognitionHeroOmega1312, i2, this.PolarVoyageStrictModeLegendEpic1532);
            if (PolarVoyageCameraPixelBlaze2629 != j2) {
                long PolarVoyageMotionLayoutTransitionHeroVision4068 = ((PolarVoyageSupervisorJobStrikeCelestialGamma8770) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageMotionLayoutTransitionHeroVision4068(PolarVoyageCameraPixelBlaze2629);
                if (PolarVoyageMotionLayoutTransitionHeroVision4068 > j) {
                    return j5 == j2 ? new PolarVoyageStateListAnimatorVortexSparkSpeed3559(-1, PolarVoyageMotionLayoutTransitionHeroVision4068, position) : new PolarVoyageStateListAnimatorVortexSparkSpeed3559(0, -9223372036854775807L, position + j4);
                }
                j5 = PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (100000 + j5 > j) {
                    return new PolarVoyageStateListAnimatorVortexSparkSpeed3559(0, -9223372036854775807L, position + i2);
                }
                j4 = i2;
            }
            polarVoyageTextRecognitionHeroOmega1312.PolarVoyageConfigurationMaxSpectraForce5418(i3);
            j3 = i3;
        }
        return j5 != j2 ? new PolarVoyageStateListAnimatorVortexSparkSpeed3559(-2, j5, position + j3) : PolarVoyageStateListAnimatorVortexSparkSpeed3559.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767() {
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public void PolarVoyageBitmapVisionAuroraPixel4705(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = (long[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i7 = this.PolarVoyageStrictModeLegendEpic1532;
        int i8 = i7 + 3;
        this.PolarVoyageStrictModeLegendEpic1532 = i8;
        int length = jArr.length;
        if (length <= i8) {
            int max = Math.max(length * 2, i8);
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Arrays.copyOf(jArr, max);
            this.PolarVoyageBottomSheetOmegaNeo1907 = Arrays.copyOf((long[]) this.PolarVoyageBottomSheetOmegaNeo1907, max);
        }
        long[] jArr2 = (long[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | 2305843009213693952L | (Math.min(0, 511) << 52) | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (Math.min(i7 - i10, 511) << 52) | (j & (-2301339409586323457L));
                return;
            }
        }
    }

    public void PolarVoyageDiffUtilTurboStrike5735(Object obj, Object obj2) {
        int i = (this.PolarVoyageStrictModeLegendEpic1532 + 1) * 2;
        Object[] objArr = (Object[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i > objArr.length) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Arrays.copyOf(objArr, PolarVoyageAccelerometerPhantomTitan1866.PolarVoyageBitmapVisionAuroraPixel4705(objArr.length, i));
        }
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageSnackbarGammaEclipse2140(obj, obj2);
        Object[] objArr2 = (Object[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i2 = this.PolarVoyageStrictModeLegendEpic1532;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.PolarVoyageStrictModeLegendEpic1532 = i2 + 1;
    }

    public List PolarVoyageItemDecorationUltraDeltaEpic7485(CharSequence charSequence) {
        charSequence.getClass();
        PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612 = (PolarVoyageRecyclerViewUltraBlazeThunder8612) this.PolarVoyageBottomSheetOmegaNeo1907;
        polarVoyageRecyclerViewUltraBlazeThunder8612.getClass();
        PolarVoyageFirebaseSpeedNovaUltra2172 polarVoyageFirebaseSpeedNovaUltra2172 = new PolarVoyageFirebaseSpeedNovaUltra2172(polarVoyageRecyclerViewUltraBlazeThunder8612, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (polarVoyageFirebaseSpeedNovaUltra2172.hasNext()) {
            arrayList.add((String) polarVoyageFirebaseSpeedNovaUltra2172.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Object PolarVoyageKotlinBetaPulseBeta3653(int i) {
        SparseArray sparseArray = (SparseArray) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (this.PolarVoyageStrictModeLegendEpic1532 == -1) {
            this.PolarVoyageStrictModeLegendEpic1532 = 0;
        }
        while (true) {
            int i2 = this.PolarVoyageStrictModeLegendEpic1532;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.PolarVoyageStrictModeLegendEpic1532--;
        }
        while (this.PolarVoyageStrictModeLegendEpic1532 < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.PolarVoyageStrictModeLegendEpic1532 + 1)) {
            this.PolarVoyageStrictModeLegendEpic1532++;
        }
        return sparseArray.valueAt(this.PolarVoyageStrictModeLegendEpic1532);
    }

    @Override // p000createpolar.PolarVoyageAlphaAnimationHeroTitanium5808
    public void PolarVoyageLayerDrawableShadowTitaniumOmega1942() {
        PolarVoyageTextRecognitionHeroOmega1312 polarVoyageTextRecognitionHeroOmega1312 = (PolarVoyageTextRecognitionHeroOmega1312) this.PolarVoyageBottomSheetOmegaNeo1907;
        byte[] bArr = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageMotionLayoutTransitionHeroVision4068;
        polarVoyageTextRecognitionHeroOmega1312.getClass();
        polarVoyageTextRecognitionHeroOmega1312.PolarVoyageAlarmManagerShadowHyperBeta8339(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ab  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageContentProviderNebulaVisionCyber2673 PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z) {
        boolean z2;
        int i;
        char c;
        Object obj;
        char c2;
        short[] sArr;
        boolean z3;
        int i2;
        ?? r16;
        boolean z4;
        PolarVoyageContentProviderNebulaVisionCyber2673 polarVoyageContentProviderNebulaVisionCyber2673;
        boolean z5;
        PolarVoyageProximitySensorBlazeStrike6486 polarVoyageProximitySensorBlazeStrike6486;
        PolarVoyageProximitySensorBlazeStrike6486 polarVoyageProximitySensorBlazeStrike64862;
        if (z && (polarVoyageProximitySensorBlazeStrike64862 = (PolarVoyageProximitySensorBlazeStrike6486) this.PolarVoyageBottomSheetOmegaNeo1907) != null) {
            throw polarVoyageProximitySensorBlazeStrike64862.PolarVoyageZipVortexCelestial6185();
        }
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        Object[] objArr = (Object[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i3 == 0) {
            polarVoyageContentProviderNebulaVisionCyber2673 = PolarVoyageContentProviderNebulaVisionCyber2673.PolarVoyageDrawableDeltaHyperion5742;
        } else {
            Object obj2 = null;
            boolean z6 = false;
            int i4 = 1;
            if (i3 == 1) {
                Objects.requireNonNull(objArr[0]);
                Objects.requireNonNull(objArr[1]);
                polarVoyageContentProviderNebulaVisionCyber2673 = new PolarVoyageContentProviderNebulaVisionCyber2673(1, null, objArr);
            } else {
                PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageCameraViewSpectraMaxSpectra2824(i3, objArr.length >> 1);
                int PolarVoyageStrictModeLegendEpic1532 = PolarVoyageFirebaseModelInterpreterNovaXOmegaOmega6799.PolarVoyageStrictModeLegendEpic1532(i3);
                char c3 = 2;
                if (i3 == 1) {
                    Objects.requireNonNull(objArr[0]);
                    Objects.requireNonNull(objArr[1]);
                    z5 = false;
                    i = 1;
                } else {
                    int i5 = PolarVoyageStrictModeLegendEpic1532 - 1;
                    if (PolarVoyageStrictModeLegendEpic1532 <= 128) {
                        byte[] bArr = new byte[PolarVoyageStrictModeLegendEpic1532];
                        Arrays.fill(bArr, (byte) -1);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i3) {
                            int i8 = i6 * 2;
                            int i9 = i7 * 2;
                            Object obj3 = objArr[i8];
                            Objects.requireNonNull(obj3);
                            Object obj4 = objArr[i8 ^ i4];
                            Objects.requireNonNull(obj4);
                            int PolarVoyageDisplayMetricsForceEclipseVision4728 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsForceEclipseVision4728(obj3.hashCode());
                            while (true) {
                                int i10 = PolarVoyageDisplayMetricsForceEclipseVision4728 & i5;
                                z3 = z6;
                                i2 = i4;
                                int i11 = bArr[i10] & 255;
                                if (i11 == 255) {
                                    bArr[i10] = (byte) i9;
                                    if (i7 < i6) {
                                        objArr[i9] = obj3;
                                        objArr[i9 ^ 1] = obj4;
                                    }
                                    i7++;
                                } else {
                                    if (obj3.equals(objArr[i11])) {
                                        int i12 = i11 ^ 1;
                                        Object obj5 = objArr[i12];
                                        Objects.requireNonNull(obj5);
                                        obj2 = new PolarVoyageProximitySensorBlazeStrike6486(obj3, obj4, obj5);
                                        objArr[i12] = obj4;
                                        break;
                                    }
                                    PolarVoyageDisplayMetricsForceEclipseVision4728 = i10 + 1;
                                    z6 = z3;
                                    i4 = i2;
                                }
                            }
                            i6++;
                            z6 = z3;
                            i4 = i2;
                        }
                        z2 = z6;
                        i = i4;
                        if (i7 == i3) {
                            obj2 = bArr;
                            z5 = z2;
                        } else {
                            sArr = new Object[3];
                            sArr[z2 ? 1 : 0] = bArr;
                            sArr[i] = Integer.valueOf(i7);
                            sArr[2] = obj2;
                            obj2 = sArr;
                            z5 = z2;
                        }
                    } else {
                        z2 = false;
                        i = 1;
                        if (PolarVoyageStrictModeLegendEpic1532 <= 32768) {
                            sArr = new short[PolarVoyageStrictModeLegendEpic1532];
                            Arrays.fill(sArr, (short) -1);
                            int i13 = 0;
                            for (int i14 = 0; i14 < i3; i14++) {
                                int i15 = i14 * 2;
                                int i16 = i13 * 2;
                                Object obj6 = objArr[i15];
                                Objects.requireNonNull(obj6);
                                Object obj7 = objArr[i15 ^ 1];
                                Objects.requireNonNull(obj7);
                                int PolarVoyageDisplayMetricsForceEclipseVision47282 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsForceEclipseVision4728(obj6.hashCode());
                                while (true) {
                                    int i17 = PolarVoyageDisplayMetricsForceEclipseVision47282 & i5;
                                    int i18 = sArr[i17] & 65535;
                                    if (i18 == 65535) {
                                        sArr[i17] = (short) i16;
                                        if (i13 < i14) {
                                            objArr[i16] = obj6;
                                            objArr[i16 ^ 1] = obj7;
                                        }
                                        i13++;
                                    } else {
                                        if (obj6.equals(objArr[i18])) {
                                            int i19 = i18 ^ 1;
                                            Object obj8 = objArr[i19];
                                            Objects.requireNonNull(obj8);
                                            obj2 = new PolarVoyageProximitySensorBlazeStrike6486(obj6, obj7, obj8);
                                            objArr[i19] = obj7;
                                            break;
                                        }
                                        PolarVoyageDisplayMetricsForceEclipseVision47282 = i17 + 1;
                                    }
                                }
                            }
                            if (i13 != i3) {
                                obj2 = new Object[]{sArr, Integer.valueOf(i13), obj2};
                                z5 = z2;
                            }
                            obj2 = sArr;
                            z5 = z2;
                        } else {
                            int[] iArr = new int[PolarVoyageStrictModeLegendEpic1532];
                            Arrays.fill(iArr, -1);
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < i3) {
                                int i22 = i20 * 2;
                                int i23 = i21 * 2;
                                Object obj9 = objArr[i22];
                                Objects.requireNonNull(obj9);
                                Object obj10 = objArr[i22 ^ 1];
                                Objects.requireNonNull(obj10);
                                int PolarVoyageDisplayMetricsForceEclipseVision47283 = PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageDisplayMetricsForceEclipseVision4728(obj9.hashCode());
                                while (true) {
                                    int i24 = PolarVoyageDisplayMetricsForceEclipseVision47283 & i5;
                                    int i25 = iArr[i24];
                                    if (i25 == -1) {
                                        iArr[i24] = i23;
                                        if (i21 < i20) {
                                            objArr[i23] = obj9;
                                            objArr[i23 ^ 1] = obj10;
                                        }
                                        i21++;
                                        c2 = c3;
                                    } else {
                                        c2 = c3;
                                        if (obj9.equals(objArr[i25])) {
                                            int i26 = i25 ^ 1;
                                            Object obj11 = objArr[i26];
                                            Objects.requireNonNull(obj11);
                                            obj2 = new PolarVoyageProximitySensorBlazeStrike6486(obj9, obj10, obj11);
                                            objArr[i26] = obj10;
                                            break;
                                        }
                                        PolarVoyageDisplayMetricsForceEclipseVision47283 = i24 + 1;
                                        c3 = c2;
                                    }
                                }
                                i20++;
                                c3 = c2;
                            }
                            c = c3;
                            if (i21 == i3) {
                                obj = iArr;
                                r16 = z2;
                            } else {
                                Object[] objArr2 = new Object[3];
                                objArr2[0] = iArr;
                                objArr2[1] = Integer.valueOf(i21);
                                objArr2[c] = obj2;
                                obj = objArr2;
                                r16 = z2;
                            }
                            z4 = obj instanceof Object[];
                            Object obj12 = obj;
                            if (z4) {
                                Object[] objArr3 = (Object[]) obj;
                                this.PolarVoyageBottomSheetOmegaNeo1907 = (PolarVoyageProximitySensorBlazeStrike6486) objArr3[c];
                                Object obj13 = objArr3[r16];
                                int intValue = ((Integer) objArr3[i]).intValue();
                                objArr = Arrays.copyOf(objArr, intValue * 2);
                                obj12 = obj13;
                                i3 = intValue;
                            }
                            polarVoyageContentProviderNebulaVisionCyber2673 = new PolarVoyageContentProviderNebulaVisionCyber2673(i3, obj12, objArr);
                        }
                    }
                }
                c = 2;
                obj = obj2;
                r16 = z5;
                z4 = obj instanceof Object[];
                Object obj122 = obj;
                if (z4) {
                }
                polarVoyageContentProviderNebulaVisionCyber2673 = new PolarVoyageContentProviderNebulaVisionCyber2673(i3, obj122, objArr);
            }
        }
        if (!z || (polarVoyageProximitySensorBlazeStrike6486 = (PolarVoyageProximitySensorBlazeStrike6486) this.PolarVoyageBottomSheetOmegaNeo1907) == null) {
            return polarVoyageContentProviderNebulaVisionCyber2673;
        }
        throw polarVoyageProximitySensorBlazeStrike6486.PolarVoyageZipVortexCelestial6185();
    }

    public void PolarVoyageStrictModeLegendEpic1532(int i, PolarVoyageTextInputEditTextSolarDragon5443 polarVoyageTextInputEditTextSolarDragon5443) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        int i3 = this.PolarVoyageStrictModeLegendEpic1532;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                polarVoyageTextInputEditTextSolarDragon5443.PolarVoyageStrictModeLegendEpic1532(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void PolarVoyageTextInputEditTextNebulaHero6651(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.PolarVoyageStrictModeLegendEpic1532) * 2;
            Object[] objArr = (Object[]) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (size > objArr.length) {
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Arrays.copyOf(objArr, PolarVoyageAccelerometerPhantomTitan1866.PolarVoyageBitmapVisionAuroraPixel4705(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            PolarVoyageDiffUtilTurboStrike5735(entry.getKey(), entry.getValue());
        }
    }

    public PolarVoyageLooperGammaInferno3959 PolarVoyageZipVortexCelestial6185() {
        if (!"".isEmpty()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("Missing required properties:".concat(""));
            return null;
        }
        String str = (String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        return new PolarVoyageLooperGammaInferno3959(this.PolarVoyageStrictModeLegendEpic1532, ((Long) this.PolarVoyageBottomSheetOmegaNeo1907).longValue(), str);
    }

    public String toString() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder();
                if (((PolarVoyageServiceInfoStormStorm6276) this.PolarVoyageBottomSheetOmegaNeo1907) == PolarVoyageServiceInfoStormStorm6276.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.PolarVoyageStrictModeLegendEpic1532);
                sb.append(' ');
                sb.append((String) this.PolarVoyageRotateAnimationCyberCelestialDelta4768);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public PolarVoyageImageCaptureShadowBlaze1163(PolarVoyageServiceInfoStormStorm6276 polarVoyageServiceInfoStormStorm6276, int i, String str) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 6;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageServiceInfoStormStorm6276;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = str;
    }

    public PolarVoyageImageCaptureShadowBlaze1163(PolarVoyageR8UltraEliteBeta8736 polarVoyageR8UltraEliteBeta8736) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 4;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new SparseArray();
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageR8UltraEliteBeta8736;
        this.PolarVoyageStrictModeLegendEpic1532 = -1;
    }

    public PolarVoyageImageCaptureShadowBlaze1163(int i, PolarVoyageSupervisorJobStrikeCelestialGamma8770 polarVoyageSupervisorJobStrikeCelestialGamma8770) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 7;
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageSupervisorJobStrikeCelestialGamma8770;
        this.PolarVoyageBottomSheetOmegaNeo1907 = new PolarVoyageTextRecognitionHeroOmega1312();
    }

    public PolarVoyageImageCaptureShadowBlaze1163(PolarVoyageRecyclerViewUltraBlazeThunder8612 polarVoyageRecyclerViewUltraBlazeThunder8612) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 5;
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageRecyclerViewUltraBlazeThunder8612;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageIntentPrimeAlpha3235.PolarVoyageStrictModeLegendEpic1532;
        this.PolarVoyageStrictModeLegendEpic1532 = Integer.MAX_VALUE;
    }

    public /* synthetic */ PolarVoyageImageCaptureShadowBlaze1163(int i, byte b) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    public PolarVoyageImageCaptureShadowBlaze1163(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new Object[i * 2];
        this.PolarVoyageStrictModeLegendEpic1532 = 0;
    }
}
