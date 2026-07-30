package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourcesBetaPhoenix8681 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public Object[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageResourcesBetaPhoenix8681(int i) {
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651;
        if (i >= 0) {
            PolarVoyageDiffUtilTurboStrike5735(PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i));
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767(Object obj) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i2;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.PolarVoyageZipVortexCelestial6185;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                int i13 = i3;
                if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(this.PolarVoyageMotionLayoutTransitionHeroVision4068[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i5);
                long j8 = 255;
                if (this.PolarVoyageBitmapVisionAuroraPixel4705 != 0 || ((this.PolarVoyageZipVortexCelestial6185[PolarVoyageBitmapVisionAuroraPixel4705 >> 3] >> ((PolarVoyageBitmapVisionAuroraPixel4705 & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.PolarVoyageZipVortexCelestial6185;
                            int i17 = this.PolarVoyageKotlinBetaPulseBeta3653;
                            Object[] objArr2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                            int i18 = (i17 + 7) >> 3;
                            int i19 = 0;
                            j3 = 128;
                            while (i19 < i18) {
                                long j9 = j8;
                                long j10 = jArr4[i19] & (-9187201950435737472L);
                                jArr4[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i16 = i16;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int i20 = i16;
                            int PolarVoyageConstraintSetCloneCelestialHero1930 = PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageConstraintSetCloneCelestialHero1930(jArr4);
                            int i21 = PolarVoyageConstraintSetCloneCelestialHero1930 - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[PolarVoyageConstraintSetCloneCelestialHero1930] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int PolarVoyageBitmapVisionAuroraPixel47052 = PolarVoyageBitmapVisionAuroraPixel4705(i25);
                                    int i26 = i25 & i17;
                                    if (((PolarVoyageBitmapVisionAuroraPixel47052 - i26) & i17) / i20 == ((i22 - i26) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = ((r7 & 127) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = PolarVoyageBitmapVisionAuroraPixel47052 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (PolarVoyageBitmapVisionAuroraPixel47052 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r7 & 127) << i28);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[PolarVoyageBitmapVisionAuroraPixel47052] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[PolarVoyageBitmapVisionAuroraPixel47052];
                                            objArr[PolarVoyageBitmapVisionAuroraPixel47052] = objArr[i22];
                                            objArr[i22] = obj3;
                                            i22--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j14;
                                        i20 = i2;
                                        i17 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageKotlinBetaPulseBeta3653) - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
                            PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageMotionLayoutTransitionHeroVision4068(this.PolarVoyageKotlinBetaPulseBeta3653);
                    long[] jArr5 = this.PolarVoyageZipVortexCelestial6185;
                    Object[] objArr3 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i29 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    PolarVoyageDiffUtilTurboStrike5735(PolarVoyageMotionLayoutTransitionHeroVision4068);
                    long[] jArr6 = this.PolarVoyageZipVortexCelestial6185;
                    Object[] objArr4 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                    int i30 = this.PolarVoyageKotlinBetaPulseBeta3653;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int PolarVoyageBitmapVisionAuroraPixel47053 = PolarVoyageBitmapVisionAuroraPixel4705(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = PolarVoyageBitmapVisionAuroraPixel47053 >> 3;
                            int i34 = (PolarVoyageBitmapVisionAuroraPixel47053 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((PolarVoyageBitmapVisionAuroraPixel47053 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[PolarVoyageBitmapVisionAuroraPixel47053] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageBitmapVisionAuroraPixel4705(i5);
                }
                this.PolarVoyageBarcodeScannerInfernoSolarSpark7767++;
                int i35 = this.PolarVoyageBitmapVisionAuroraPixel4705;
                long[] jArr7 = this.PolarVoyageZipVortexCelestial6185;
                int i36 = PolarVoyageBitmapVisionAuroraPixel4705 >> 3;
                long j18 = jArr7[i36];
                int i37 = (PolarVoyageBitmapVisionAuroraPixel4705 & 7) << 3;
                this.PolarVoyageBitmapVisionAuroraPixel4705 = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.PolarVoyageKotlinBetaPulseBeta3653;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j19;
                jArr7[(((PolarVoyageBitmapVisionAuroraPixel4705 - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return PolarVoyageBitmapVisionAuroraPixel4705;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final int PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageBottomSheetOmegaNeo1907(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
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
        boolean z = i >= 0;
        if (z) {
            PolarVoyageViewRogueMaster4778(i);
        }
        return z;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageKotlinBetaPulseBeta3653(i)) : 0;
        this.PolarVoyageKotlinBetaPulseBeta3653 = max;
        if (max == 0) {
            jArr = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.PolarVoyageZipVortexCelestial6185 = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageKotlinBetaPulseBeta3653) - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = max == 0 ? PolarVoyageDispatchersGammaUltraTurbo4138.PolarVoyageTextInputEditTextNebulaHero6651 : new Object[max];
    }

    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != 0;
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
        int i4 = this.PolarVoyageKotlinBetaPulseBeta3653;
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

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = 0;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        if (jArr != PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185) {
            PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageDialogFragmentPixelEliteHyperion4038(jArr, -9187201950435737472L);
            long[] jArr2 = this.PolarVoyageZipVortexCelestial6185;
            int i = this.PolarVoyageKotlinBetaPulseBeta3653;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageCombineBlazeSparkInferno2844(this.PolarVoyageMotionLayoutTransitionHeroVision4068, 0, this.PolarVoyageKotlinBetaPulseBeta3653);
        this.PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(this.PolarVoyageKotlinBetaPulseBeta3653) - this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    }

    public final void PolarVoyageRotateAnimationCyberCelestialDelta4768(Object obj) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj)] = obj;
    }

    public final void PolarVoyageStrictModeLegendEpic1532(PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681) {
        polarVoyageResourcesBetaPhoenix8681.getClass();
        Object[] objArr = polarVoyageResourcesBetaPhoenix8681.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = polarVoyageResourcesBetaPhoenix8681.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        PolarVoyageRotateAnimationCyberCelestialDelta4768(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean PolarVoyageTextInputEditTextNebulaHero6651() {
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == 0;
    }

    public final void PolarVoyageViewRogueMaster4778(int i) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767--;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[i] = null;
    }

    public final boolean PolarVoyageZipVortexCelestial6185(Object obj) {
        int i = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[PolarVoyageBarcodeScannerInfernoSolarSpark7767(obj)] = obj;
        return this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageResourcesBetaPhoenix8681)) {
            return false;
        }
        PolarVoyageResourcesBetaPhoenix8681 polarVoyageResourcesBetaPhoenix8681 = (PolarVoyageResourcesBetaPhoenix8681) obj;
        if (polarVoyageResourcesBetaPhoenix8681.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            return false;
        }
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !polarVoyageResourcesBetaPhoenix8681.PolarVoyageKotlinBetaPulseBeta3653(objArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public final int hashCode() {
        int i = (this.PolarVoyageKotlinBetaPulseBeta3653 * 31) + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i2 << 3) + i4];
                            if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return i;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i2++;
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
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ PolarVoyageResourcesBetaPhoenix8681() {
        this(6);
    }
}
