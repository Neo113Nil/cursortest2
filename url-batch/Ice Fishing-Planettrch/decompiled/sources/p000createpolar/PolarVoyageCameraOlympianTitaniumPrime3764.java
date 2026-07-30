package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraOlympianTitaniumPrime3764 {
    public int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public int PolarVoyageBitmapVisionAuroraPixel4705;
    public int PolarVoyageKotlinBetaPulseBeta3653;
    public int[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public long[] PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCameraOlympianTitaniumPrime3764(int i) {
        this.PolarVoyageZipVortexCelestial6185 = PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageActivityDeltaDelta4379.PolarVoyageZipVortexCelestial6185;
        if (i >= 0) {
            PolarVoyageBarcodeScannerInfernoSolarSpark7767(PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageBarcodeScannerInfernoSolarSpark7767(i));
        } else {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(int i) {
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
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageBitmapVisionAuroraPixel4705(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.PolarVoyageMotionLayoutTransitionHeroVision4068[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        boolean z = i2 >= 0;
        if (z) {
            PolarVoyageDiffUtilTurboStrike5735(i2);
        }
        return z;
    }

    public final void PolarVoyageDiffUtilTurboStrike5735(int i) {
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767--;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int i2 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }

    public final int PolarVoyageKotlinBetaPulseBeta3653(int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.PolarVoyageMotionLayoutTransitionHeroVision4068[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        return i2 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = PolarVoyageKotlinBetaPulseBeta3653(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r37.PolarVoyageBitmapVisionAuroraPixel4705 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r37.PolarVoyageZipVortexCelestial6185[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r3 = r37.PolarVoyageKotlinBetaPulseBeta3653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (java.lang.Long.compare((r37.PolarVoyageBarcodeScannerInfernoSolarSpark7767 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        r3 = r37.PolarVoyageZipVortexCelestial6185;
        r4 = r37.PolarVoyageKotlinBetaPulseBeta3653;
        r6 = r37.PolarVoyageMotionLayoutTransitionHeroVision4068;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        r29 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        r27 = r12;
        r7 = p000createpolar.PolarVoyagePagingDataPhantomCelestialPhoenix8159.PolarVoyageConstraintSetCloneCelestialHero1930(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = PolarVoyageKotlinBetaPulseBeta3653(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
    
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
    
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0170, code lost:
    
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0182, code lost:
    
        if (((r33 >> r7) & r27) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        r3[r6] = (r33 & (~(r27 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c2, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a8, code lost:
    
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r27 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d0, code lost:
    
        r31 = r15;
        r37.PolarVoyageBitmapVisionAuroraPixel4705 = p000createpolar.PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageZipVortexCelestial6185(r37.PolarVoyageKotlinBetaPulseBeta3653) - r37.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0257, code lost:
    
        r3 = PolarVoyageKotlinBetaPulseBeta3653(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025b, code lost:
    
        r14 = r3;
        r37.PolarVoyageBarcodeScannerInfernoSolarSpark7767++;
        r3 = r37.PolarVoyageBitmapVisionAuroraPixel4705;
        r4 = r37.PolarVoyageZipVortexCelestial6185;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0274, code lost:
    
        if (((r6 >> r8) & r27) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0276, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
    
        r37.PolarVoyageBitmapVisionAuroraPixel4705 = r3 - r9;
        r3 = r37.PolarVoyageKotlinBetaPulseBeta3653;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        r27 = 255;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e9, code lost:
    
        r3 = p000createpolar.PolarVoyageAlertDialogInfernoBlaze9386.PolarVoyageMotionLayoutTransitionHeroVision4068(r37.PolarVoyageKotlinBetaPulseBeta3653);
        r4 = r37.PolarVoyageZipVortexCelestial6185;
        r6 = r37.PolarVoyageMotionLayoutTransitionHeroVision4068;
        r7 = r37.PolarVoyageKotlinBetaPulseBeta3653;
        PolarVoyageBarcodeScannerInfernoSolarSpark7767(r3);
        r3 = r37.PolarVoyageZipVortexCelestial6185;
        r8 = r37.PolarVoyageMotionLayoutTransitionHeroVision4068;
        r9 = r37.PolarVoyageKotlinBetaPulseBeta3653;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0200, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020f, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0211, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = PolarVoyageKotlinBetaPulseBeta3653(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0250, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024c, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e6, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        r27 = 255;
        r31 = true;
        r20 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PolarVoyageZipVortexCelestial6185(int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i5 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.PolarVoyageKotlinBetaPulseBeta3653;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.PolarVoyageZipVortexCelestial6185;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            boolean z2 = true;
            int i14 = i11;
            long j = (((-i13) >> 63) & (jArr[i12 + 1] << (64 - i13))) | (jArr[i12] >>> i13);
            long j2 = i8;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (j3 - 72340172838076673L) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j4) >> 3) + i10) & i9;
                int i15 = i5;
                if (this.PolarVoyageMotionLayoutTransitionHeroVision4068[i3] == i) {
                    z = true;
                    break loop0;
                }
                j4 &= j4 - 1;
                i5 = i15;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i2;
        }
        this.PolarVoyageMotionLayoutTransitionHeroVision4068[i3] = i;
        if (this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != i4) {
            return z;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PolarVoyageCameraOlympianTitaniumPrime3764)) {
            return false;
        }
        PolarVoyageCameraOlympianTitaniumPrime3764 polarVoyageCameraOlympianTitaniumPrime3764 = (PolarVoyageCameraOlympianTitaniumPrime3764) obj;
        if (polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageBarcodeScannerInfernoSolarSpark7767 != this.PolarVoyageBarcodeScannerInfernoSolarSpark7767) {
            return false;
        }
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        long[] jArr = this.PolarVoyageZipVortexCelestial6185;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !polarVoyageCameraOlympianTitaniumPrime3764.PolarVoyageMotionLayoutTransitionHeroVision4068(iArr[(i << 3) + i3])) {
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
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
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
                        i2 = Integer.hashCode(iArr[(i << 3) + i4]) + i2;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
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
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i5);
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

    public /* synthetic */ PolarVoyageCameraOlympianTitaniumPrime3764() {
        this(6);
    }
}
