package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c81 extends tq0 {
    public int a92UlCVFR9N8;

    public c81(int i) {
        this.PxuCJdSBwIXG = c02.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = gr0.PxuCJdSBwIXG;
        this.TSizfFm2Yiuu = mm2.e9gEMXR7LXtO;
        if (i >= 0) {
            a92UlCVFR9N8(c02.Y1f8riQaR6yg(i));
        } else {
            u9.XL4ISE6Oc65B("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RAsUl2FVSrh6(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.Y1f8riQaR6yg;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.PxuCJdSBwIXG;
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
                if (this.lS5Rgt96tfkO[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 < 0) {
            return null;
        }
        this.e9gEMXR7LXtO--;
        long[] jArr2 = this.PxuCJdSBwIXG;
        int i10 = this.Y1f8riQaR6yg;
        int i11 = i2 >> 3;
        int i12 = (i2 & 7) << 3;
        long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
        jArr2[i11] = j4;
        jArr2[(((i2 - 7) & i10) + (i10 & 7)) >> 3] = j4;
        Object[] objArr = this.TSizfFm2Yiuu;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void TSizfFm2Yiuu() {
        this.e9gEMXR7LXtO = 0;
        long[] jArr = this.PxuCJdSBwIXG;
        if (jArr != c02.PxuCJdSBwIXG) {
            na.Nlhe969cAGO8(jArr, -9187201950435737472L);
            long[] jArr2 = this.PxuCJdSBwIXG;
            int i = this.Y1f8riQaR6yg;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        na.v6yxfmkxNKhL(0, this.Y1f8riQaR6yg, null, this.TSizfFm2Yiuu);
        this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
    }

    public final int Y1f8riQaR6yg(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.Y1f8riQaR6yg;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.PxuCJdSBwIXG;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.lS5Rgt96tfkO[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e9gEMXR7LXtO = e9gEMXR7LXtO(i6);
                long j8 = 255;
                if (this.a92UlCVFR9N8 != 0 || ((this.PxuCJdSBwIXG[e9gEMXR7LXtO >> 3] >> ((e9gEMXR7LXtO & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.Y1f8riQaR6yg;
                    if (i20 > 8) {
                        j3 = 128;
                        if (Long.compare((this.e9gEMXR7LXtO * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.PxuCJdSBwIXG;
                            int i21 = this.Y1f8riQaR6yg;
                            int[] iArr2 = this.lS5Rgt96tfkO;
                            Object[] objArr2 = this.TSizfFm2Yiuu;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j9 = j8;
                                long j10 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j9;
                            }
                            j = j8;
                            j2 = j5;
                            int uy1Qfkdvj4xZ = na.uy1Qfkdvj4xZ(jArr4);
                            int i24 = uy1Qfkdvj4xZ - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[uy1Qfkdvj4xZ] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j12 = (jArr4[i26] >> i27) & j;
                                if (j12 != 128 && j12 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9gEMXR7LXtO2 = e9gEMXR7LXtO(i28);
                                    int i29 = i28 & i21;
                                    if (((e9gEMXR7LXtO2 - i29) & i21) / 8 == ((i25 - i29) & i21) / 8) {
                                        long j13 = j11;
                                        jArr4[i26] = ((r8 & 127) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j13) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i30 = e9gEMXR7LXtO2 >> 3;
                                        long j15 = jArr4[i30];
                                        int i31 = (e9gEMXR7LXtO2 & 7) << 3;
                                        if (((j15 >> i31) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i30] = ((~(j << i31)) & j15) | ((r8 & 127) << i31);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[e9gEMXR7LXtO2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[e9gEMXR7LXtO2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i30] = ((r8 & 127) << i31) | ((~(j << i31)) & j15);
                                            int i32 = iArr[e9gEMXR7LXtO2];
                                            iArr[e9gEMXR7LXtO2] = iArr[i25];
                                            iArr[i25] = i32;
                                            Object obj = objArr[e9gEMXR7LXtO2];
                                            objArr[e9gEMXR7LXtO2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j11 = j14;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
                            e9gEMXR7LXtO = e9gEMXR7LXtO(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int lS5Rgt96tfkO = c02.lS5Rgt96tfkO(this.Y1f8riQaR6yg);
                    long[] jArr5 = this.PxuCJdSBwIXG;
                    int[] iArr3 = this.lS5Rgt96tfkO;
                    Object[] objArr3 = this.TSizfFm2Yiuu;
                    int i33 = this.Y1f8riQaR6yg;
                    a92UlCVFR9N8(lS5Rgt96tfkO);
                    long[] jArr6 = this.PxuCJdSBwIXG;
                    int[] iArr4 = this.lS5Rgt96tfkO;
                    Object[] objArr4 = this.TSizfFm2Yiuu;
                    int i34 = this.Y1f8riQaR6yg;
                    int i35 = i19;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int hashCode3 = Integer.hashCode(i36) * i18;
                            int i37 = hashCode3 ^ (hashCode3 << 16);
                            int e9gEMXR7LXtO3 = e9gEMXR7LXtO(i37 >>> 7);
                            long j16 = i37 & 127;
                            int i38 = e9gEMXR7LXtO3 >> 3;
                            int i39 = (e9gEMXR7LXtO3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i38] & (~(255 << i39))) | (j16 << i39);
                            jArr[i38] = j17;
                            jArr[(((e9gEMXR7LXtO3 - 7) & i34) + (i34 & 7)) >> 3] = j17;
                            iArr4[e9gEMXR7LXtO3] = i36;
                            objArr4[e9gEMXR7LXtO3] = objArr3[i35];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i35++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e9gEMXR7LXtO = e9gEMXR7LXtO(i6);
                }
                this.e9gEMXR7LXtO++;
                int i40 = this.a92UlCVFR9N8;
                long[] jArr7 = this.PxuCJdSBwIXG;
                int i41 = e9gEMXR7LXtO >> 3;
                long j18 = jArr7[i41];
                int i42 = (e9gEMXR7LXtO & 7) << 3;
                if (((j18 >> i42) & j) != j3) {
                    i2 = i19;
                }
                this.a92UlCVFR9N8 = i40 - i2;
                int i43 = this.Y1f8riQaR6yg;
                long j19 = (j18 & (~(j << i42))) | (j2 << i42);
                jArr7[i41] = j19;
                jArr7[(((e9gEMXR7LXtO - 7) & i43) + (i43 & 7)) >> 3] = j19;
                return e9gEMXR7LXtO;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final void a92UlCVFR9N8(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, c02.TSizfFm2Yiuu(i)) : 0;
        this.Y1f8riQaR6yg = max;
        if (max == 0) {
            jArr = c02.PxuCJdSBwIXG;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.PxuCJdSBwIXG = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
        this.lS5Rgt96tfkO = new int[max];
        this.TSizfFm2Yiuu = new Object[max];
    }

    public final int e9gEMXR7LXtO(int i) {
        int i2 = this.Y1f8riQaR6yg;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.PxuCJdSBwIXG;
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

    public final void rtx2ld2ELZv4(int i, Object obj) {
        int Y1f8riQaR6yg = Y1f8riQaR6yg(i);
        this.lS5Rgt96tfkO[Y1f8riQaR6yg] = i;
        this.TSizfFm2Yiuu[Y1f8riQaR6yg] = obj;
    }

    public /* synthetic */ c81() {
        this(6);
    }
}
