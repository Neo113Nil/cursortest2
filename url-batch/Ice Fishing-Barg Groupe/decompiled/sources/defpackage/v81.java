package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v81 {
    public long[] PxuCJdSBwIXG;
    public Object[] TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public Object[] lS5Rgt96tfkO;

    public v81(int i) {
        this.PxuCJdSBwIXG = c02.PxuCJdSBwIXG;
        Object[] objArr = mm2.e9gEMXR7LXtO;
        this.lS5Rgt96tfkO = objArr;
        this.TSizfFm2Yiuu = objArr;
        if (i >= 0) {
            rtx2ld2ELZv4(c02.Y1f8riQaR6yg(i));
        } else {
            u9.XL4ISE6Oc65B("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean OPXfSBeufaJ8() {
        return this.e9gEMXR7LXtO == 0;
    }

    public final void PxuCJdSBwIXG() {
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
        na.v6yxfmkxNKhL(0, this.Y1f8riQaR6yg, null, this.lS5Rgt96tfkO);
        this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
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
    public final Object RAsUl2FVSrh6(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.Y1f8riQaR6yg;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return this.TSizfFm2Yiuu[i];
        }
        return null;
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
    public final boolean TSizfFm2Yiuu(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.Y1f8riQaR6yg;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean Y1f8riQaR6yg(Object obj) {
        Object[] objArr = this.TSizfFm2Yiuu;
        long[] jArr = this.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && cs0.wdg6QnbFHrFF(obj, objArr[(i << 3) + i3])) {
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

    public final int a92UlCVFR9N8(Object obj) {
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
        int i6 = this.Y1f8riQaR6yg;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e9gEMXR7LXtO = e9gEMXR7LXtO(i4);
                long j8 = 255;
                if (this.a92UlCVFR9N8 != 0 || ((this.PxuCJdSBwIXG[e9gEMXR7LXtO >> 3] >> ((e9gEMXR7LXtO & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.Y1f8riQaR6yg;
                    if (i14 > 8) {
                        int i15 = 8;
                        if (Long.compare((this.e9gEMXR7LXtO * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.PxuCJdSBwIXG;
                            int i16 = this.Y1f8riQaR6yg;
                            Object[] objArr2 = this.lS5Rgt96tfkO;
                            Object[] objArr3 = this.TSizfFm2Yiuu;
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
                            int uy1Qfkdvj4xZ = na.uy1Qfkdvj4xZ(jArr4);
                            int i20 = uy1Qfkdvj4xZ - 1;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[uy1Qfkdvj4xZ] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j11 = (jArr4[i22] >> i23) & j;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9gEMXR7LXtO2 = e9gEMXR7LXtO(i24);
                                    int i25 = i24 & i16;
                                    if (((e9gEMXR7LXtO2 - i25) & i16) / i19 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i21++;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = e9gEMXR7LXtO2 >> 3;
                                        long j12 = jArr4[i27];
                                        int i28 = (e9gEMXR7LXtO2 & 7) << 3;
                                        if (((j12 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j12) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[e9gEMXR7LXtO2] = objArr[i21];
                                            objArr[i21] = null;
                                            objArr3[e9gEMXR7LXtO2] = objArr3[i21];
                                            objArr3[i21] = null;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j12);
                                            Object obj3 = objArr[e9gEMXR7LXtO2];
                                            objArr[e9gEMXR7LXtO2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            Object obj4 = objArr3[e9gEMXR7LXtO2];
                                            objArr3[e9gEMXR7LXtO2] = objArr3[i21];
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
                            this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
                            e9gEMXR7LXtO = e9gEMXR7LXtO(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int lS5Rgt96tfkO = c02.lS5Rgt96tfkO(this.Y1f8riQaR6yg);
                    long[] jArr5 = this.PxuCJdSBwIXG;
                    Object[] objArr4 = this.lS5Rgt96tfkO;
                    Object[] objArr5 = this.TSizfFm2Yiuu;
                    int i29 = this.Y1f8riQaR6yg;
                    rtx2ld2ELZv4(lS5Rgt96tfkO);
                    long[] jArr6 = this.PxuCJdSBwIXG;
                    Object[] objArr6 = this.lS5Rgt96tfkO;
                    Object[] objArr7 = this.TSizfFm2Yiuu;
                    int i30 = this.Y1f8riQaR6yg;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i31];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int e9gEMXR7LXtO3 = e9gEMXR7LXtO(i32 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j13 = i32 & 127;
                            int i33 = e9gEMXR7LXtO3 >> 3;
                            int i34 = (e9gEMXR7LXtO3 & 7) << 3;
                            long j14 = (jArr[i33] & (~(255 << i34))) | (j13 << i34);
                            jArr[i33] = j14;
                            jArr[(((e9gEMXR7LXtO3 - 7) & i30) + (i30 & 7)) >> 3] = j14;
                            objArr6[e9gEMXR7LXtO3] = obj5;
                            objArr7[e9gEMXR7LXtO3] = objArr5[i31];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e9gEMXR7LXtO = e9gEMXR7LXtO(i4);
                }
                this.e9gEMXR7LXtO++;
                int i35 = this.a92UlCVFR9N8;
                long[] jArr7 = this.PxuCJdSBwIXG;
                int i36 = e9gEMXR7LXtO >> 3;
                long j15 = jArr7[i36];
                int i37 = (e9gEMXR7LXtO & 7) << 3;
                this.a92UlCVFR9N8 = i35 - (((j15 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.Y1f8riQaR6yg;
                long j16 = (j15 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j16;
                jArr7[(((e9gEMXR7LXtO - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return ~e9gEMXR7LXtO;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final void cpQdD2nAriOS(Object obj, Object obj2) {
        int a92UlCVFR9N8 = a92UlCVFR9N8(obj);
        if (a92UlCVFR9N8 < 0) {
            a92UlCVFR9N8 = ~a92UlCVFR9N8;
        }
        this.lS5Rgt96tfkO[a92UlCVFR9N8] = obj;
        this.TSizfFm2Yiuu[a92UlCVFR9N8] = obj2;
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
    public final Object dgRBjINgWbAK(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.Y1f8riQaR6yg;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return x50lh2ztY7Y5(i);
        }
        return null;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v81)) {
            return false;
        }
        v81 v81Var = (v81) obj;
        if (v81Var.e9gEMXR7LXtO != this.e9gEMXR7LXtO) {
            return false;
        }
        Object[] objArr = this.lS5Rgt96tfkO;
        Object[] objArr2 = this.TSizfFm2Yiuu;
        long[] jArr = this.PxuCJdSBwIXG;
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
                                if (v81Var.RAsUl2FVSrh6(obj2) != null || !v81Var.TSizfFm2Yiuu(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(v81Var.RAsUl2FVSrh6(obj2))) {
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
        Object[] objArr = this.lS5Rgt96tfkO;
        Object[] objArr2 = this.TSizfFm2Yiuu;
        long[] jArr = this.PxuCJdSBwIXG;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean lS5Rgt96tfkO(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.Y1f8riQaR6yg;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final void rtx2ld2ELZv4(int i) {
        long[] jArr;
        Object[] objArr = mm2.e9gEMXR7LXtO;
        int max = i > 0 ? Math.max(7, c02.TSizfFm2Yiuu(i)) : 0;
        this.Y1f8riQaR6yg = max;
        if (max == 0) {
            jArr = c02.PxuCJdSBwIXG;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.PxuCJdSBwIXG = jArr;
        this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
        this.lS5Rgt96tfkO = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.TSizfFm2Yiuu = objArr;
    }

    public final String toString() {
        if (OPXfSBeufaJ8()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.lS5Rgt96tfkO;
        Object[] objArr2 = this.TSizfFm2Yiuu;
        long[] jArr = this.PxuCJdSBwIXG;
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
                            if (i2 < this.e9gEMXR7LXtO) {
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

    public final boolean wdg6QnbFHrFF() {
        return this.e9gEMXR7LXtO != 0;
    }

    public final Object x50lh2ztY7Y5(int i) {
        this.e9gEMXR7LXtO--;
        long[] jArr = this.PxuCJdSBwIXG;
        int i2 = this.Y1f8riQaR6yg;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.lS5Rgt96tfkO[i] = null;
        Object[] objArr = this.TSizfFm2Yiuu;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public /* synthetic */ v81() {
        this(6);
    }
}
