package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageKeyframeThunderMegaVortex8492 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageDiffUtilTurboStrike5735;
    public Object[] PolarVoyageKotlinBetaPulseBeta3653;
    public Object[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageKeyframeThunderMegaVortex8492(int i) {
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        Object[] objArr = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = objArr;
        this.PolarVoyageKotlinBetaPulseBeta3653 = objArr;
        if (i >= 0) {
            PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i));
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        Object[] objArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageBottomSheetOmegaNeo1907(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return PolarVoyageViewRogueMaster4778(i);
        }
        return null;
    }

    public final void PolarVoyageCameraPixelBlaze2629(Object obj, Object obj2) {
        int PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageDiffUtilTurboStrike5735(obj);
        if (PolarVoyageDiffUtilTurboStrike5735 < 0) {
            PolarVoyageDiffUtilTurboStrike5735 = ~PolarVoyageDiffUtilTurboStrike5735;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[PolarVoyageDiffUtilTurboStrike5735] = obj;
        this.PolarVoyageKotlinBetaPulseBeta3653[PolarVoyageDiffUtilTurboStrike5735] = obj2;
    }

    public final int PolarVoyageDiffUtilTurboStrike5735(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = i3 & 127;
        int i6 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.PolarVoyageZipVortexCelestial6185;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr3[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr3[i9] >>> i10);
            long j5 = i5;
            int i11 = i5;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i7 + (Long.numberOfTrailingZeros(j7) >> 3)) & i6;
                int i12 = i2;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i4);
                long j8 = 255;
                if (this.PolarVoyageDiffUtilTurboStrike5735 != 0 || ((this.PolarVoyageZipVortexCelestial6185[PolarVoyageBitmapVisionAuroraPixel4705 >> 3] >> ((PolarVoyageBitmapVisionAuroraPixel4705 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.PolarVoyageBitmapVisionAuroraPixel4705 * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.PolarVoyageZipVortexCelestial6185;
                            int i16 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            Object[] objArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            Object[] objArr3 = this.PolarVoyageKotlinBetaPulseBeta3653;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j9 = j8;
                                long j10 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int PolarVoyageConstraintSetCloneCelestialHero1930 = PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageConstraintSetCloneCelestialHero1930(jArr4);
                            int i20 = PolarVoyageConstraintSetCloneCelestialHero1930 - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[PolarVoyageConstraintSetCloneCelestialHero1930] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int PolarVoyageBitmapVisionAuroraPixel47052 = PolarVoyageBitmapVisionAuroraPixel4705(i24);
                                    int i25 = i24 & i16;
                                    if (((PolarVoyageBitmapVisionAuroraPixel47052 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = PolarVoyageBitmapVisionAuroraPixel47052 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (PolarVoyageBitmapVisionAuroraPixel47052 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[PolarVoyageBitmapVisionAuroraPixel47052] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[PolarVoyageBitmapVisionAuroraPixel47052] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[PolarVoyageBitmapVisionAuroraPixel47052];
                                            objArr[PolarVoyageBitmapVisionAuroraPixel47052] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[PolarVoyageBitmapVisionAuroraPixel47052];
                                            objArr3[PolarVoyageBitmapVisionAuroraPixel47052] = objArr3[i21];
                                            objArr3[i21] = obj4;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i26;
                                        i16 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) - this.PolarVoyageBitmapVisionAuroraPixel4705;
                            PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
                    long[] jArr5 = this.PolarVoyageZipVortexCelestial6185;
                    Object[] objArr4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    Object[] objArr5 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    int i29 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageMotionLayoutTransitionHeroVision4068);
                    long[] jArr6 = this.PolarVoyageZipVortexCelestial6185;
                    Object[] objArr6 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    Object[] objArr7 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    int i30 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int PolarVoyageBitmapVisionAuroraPixel47053 = PolarVoyageBitmapVisionAuroraPixel4705(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = PolarVoyageBitmapVisionAuroraPixel47053 >> 3;
                            int i34 = (PolarVoyageBitmapVisionAuroraPixel47053 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((PolarVoyageBitmapVisionAuroraPixel47053 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[PolarVoyageBitmapVisionAuroraPixel47053] = obj5;
                            objArr7[PolarVoyageBitmapVisionAuroraPixel47053] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i4);
                }
                this.PolarVoyageBitmapVisionAuroraPixel4705++;
                int i35 = this.PolarVoyageDiffUtilTurboStrike5735;
                long[] jArr7 = this.PolarVoyageZipVortexCelestial6185;
                int i36 = PolarVoyageBitmapVisionAuroraPixel4705 >> 3;
                long j15 = jArr7[i36];
                int i37 = (PolarVoyageBitmapVisionAuroraPixel4705 & 7) << 3;
                this.PolarVoyageDiffUtilTurboStrike5735 = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((PolarVoyageBitmapVisionAuroraPixel4705 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~PolarVoyageBitmapVisionAuroraPixel4705;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void PolarVoyageItemDecorationUltraDeltaEpic7485(int i) {
        long[] jArr;
        Object[] objArr = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
        int max = i > 0 ? Math.max(7, PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageKotlinBetaPulseBeta3653(i)) : 0;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = max;
        if (max == 0) {
            jArr = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.PolarVoyageZipVortexCelestial6185 = jArr;
        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) - this.PolarVoyageBitmapVisionAuroraPixel4705;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean PolarVoyageRotateAnimationCyberCelestialDelta4768() {
        return this.PolarVoyageBitmapVisionAuroraPixel4705 != 0;
    }

    public final boolean PolarVoyageStrictModeLegendEpic1532() {
        return this.PolarVoyageBitmapVisionAuroraPixel4705 == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PolarVoyageTextInputEditTextNebulaHero6651(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.PolarVoyageKotlinBetaPulseBeta3653[i];
        }
        return null;
    }

    public final Object PolarVoyageViewRogueMaster4778(int i) {
        this.PolarVoyageBitmapVisionAuroraPixel4705--;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[i] = null;
        Object[] objArr = this.PolarVoyageKotlinBetaPulseBeta3653;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        this.PolarVoyageBitmapVisionAuroraPixel4705 = 0;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        if (jArr != PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDialogFragmentPixelEliteHyperion4038(jArr, -9187201950435737472L);
            long[] jArr2 = this.PolarVoyageZipVortexCelestial6185;
            int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageKotlinBetaPulseBeta3653, 0, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageMotionLayoutTransitionHeroVision4068, 0, this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        this.PolarVoyageDiffUtilTurboStrike5735 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) - this.PolarVoyageBitmapVisionAuroraPixel4705;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageKeyframeThunderMegaVortex8492)) {
            return false;
        }
        PolarVoyageKeyframeThunderMegaVortex8492 polarVoyageKeyframeThunderMegaVortex8492 = (PolarVoyageKeyframeThunderMegaVortex8492) obj;
        if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageBitmapVisionAuroraPixel4705 != this.PolarVoyageBitmapVisionAuroraPixel4705) {
            return false;
        }
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            Object obj3 = objArr2[i4];
                            if (obj3 == null) {
                                if (polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(obj2) != null || !polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageKotlinBetaPulseBeta3653(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(polarVoyageKeyframeThunderMegaVortex8492.PolarVoyageTextInputEditTextNebulaHero6651(obj2))) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        i2 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        if (PolarVoyageStrictModeLegendEpic1532()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        Object[] objArr2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i2++;
                            if (i2 < this.PolarVoyageBitmapVisionAuroraPixel4705) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ PolarVoyageKeyframeThunderMegaVortex8492() {
        this(6);
    }
}
