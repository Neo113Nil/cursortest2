package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w81 {
    public long[] PxuCJdSBwIXG;
    public int TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public int e9gEMXR7LXtO;
    public Object[] lS5Rgt96tfkO;

    public w81(int i) {
        this.PxuCJdSBwIXG = c02.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = mm2.e9gEMXR7LXtO;
        if (i >= 0) {
            a92UlCVFR9N8(c02.Y1f8riQaR6yg(i));
        } else {
            u9.XL4ISE6Oc65B("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OPXfSBeufaJ8(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.TSizfFm2Yiuu;
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
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            cpQdD2nAriOS(i);
        }
    }

    public final boolean PxuCJdSBwIXG(Object obj) {
        int i = this.Y1f8riQaR6yg;
        this.lS5Rgt96tfkO[Y1f8riQaR6yg(obj)] = obj;
        return this.Y1f8riQaR6yg != i;
    }

    public final boolean RAsUl2FVSrh6() {
        return this.Y1f8riQaR6yg == 0;
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
        int i4 = this.TSizfFm2Yiuu;
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

    public final int Y1f8riQaR6yg(Object obj) {
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
        int i7 = this.TSizfFm2Yiuu;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.PxuCJdSBwIXG;
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
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i3 = i13;
            }
            int i14 = i3;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e9gEMXR7LXtO = e9gEMXR7LXtO(i5);
                long j8 = 255;
                if (this.e9gEMXR7LXtO != 0 || ((this.PxuCJdSBwIXG[e9gEMXR7LXtO >> 3] >> ((e9gEMXR7LXtO & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i15 = this.TSizfFm2Yiuu;
                    if (i15 > 8) {
                        int i16 = 8;
                        if (Long.compare((this.Y1f8riQaR6yg * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.PxuCJdSBwIXG;
                            int i17 = this.TSizfFm2Yiuu;
                            Object[] objArr2 = this.lS5Rgt96tfkO;
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
                            int uy1Qfkdvj4xZ = na.uy1Qfkdvj4xZ(jArr4);
                            int i21 = uy1Qfkdvj4xZ - 1;
                            long j11 = 72057594037927935L;
                            jArr4[i21] = (jArr4[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[uy1Qfkdvj4xZ] = jArr4[0];
                            int i22 = 0;
                            while (i22 != i17) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j12 = (jArr4[i23] >> i24) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i22];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i14;
                                    int i25 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9gEMXR7LXtO2 = e9gEMXR7LXtO(i25);
                                    int i26 = i25 & i17;
                                    if (((e9gEMXR7LXtO2 - i26) & i17) / i20 == ((i22 - i26) & i17) / i20) {
                                        long j13 = j11;
                                        jArr4[i23] = ((r7 & 127) << i24) | ((~(j << i24)) & jArr4[i23]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i22++;
                                        j11 = j13;
                                    } else {
                                        long j14 = j11;
                                        int i27 = e9gEMXR7LXtO2 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (e9gEMXR7LXtO2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i2 = i20;
                                            i = i17;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r7 & 127) << i28);
                                            jArr4[i23] = (jArr4[i23] & (~(j << i24))) | (128 << i24);
                                            objArr[e9gEMXR7LXtO2] = objArr[i22];
                                            objArr[i22] = null;
                                        } else {
                                            i = i17;
                                            objArr = objArr2;
                                            i2 = i20;
                                            jArr4[i27] = ((r7 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[e9gEMXR7LXtO2];
                                            objArr[e9gEMXR7LXtO2] = objArr[i22];
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
                            this.e9gEMXR7LXtO = c02.PxuCJdSBwIXG(this.TSizfFm2Yiuu) - this.Y1f8riQaR6yg;
                            e9gEMXR7LXtO = e9gEMXR7LXtO(i5);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int lS5Rgt96tfkO = c02.lS5Rgt96tfkO(this.TSizfFm2Yiuu);
                    long[] jArr5 = this.PxuCJdSBwIXG;
                    Object[] objArr3 = this.lS5Rgt96tfkO;
                    int i29 = this.TSizfFm2Yiuu;
                    a92UlCVFR9N8(lS5Rgt96tfkO);
                    long[] jArr6 = this.PxuCJdSBwIXG;
                    Object[] objArr4 = this.lS5Rgt96tfkO;
                    int i30 = this.TSizfFm2Yiuu;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr5[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i31];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int i32 = hashCode3 ^ (hashCode3 << 16);
                            int e9gEMXR7LXtO3 = e9gEMXR7LXtO(i32 >>> 7);
                            long j16 = i32 & 127;
                            int i33 = e9gEMXR7LXtO3 >> 3;
                            int i34 = (e9gEMXR7LXtO3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j17 = (jArr6[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((e9gEMXR7LXtO3 - 7) & i30) + (i30 & 7)) >> 3] = j17;
                            objArr4[e9gEMXR7LXtO3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i31++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e9gEMXR7LXtO = e9gEMXR7LXtO(i5);
                }
                this.Y1f8riQaR6yg++;
                int i35 = this.e9gEMXR7LXtO;
                long[] jArr7 = this.PxuCJdSBwIXG;
                int i36 = e9gEMXR7LXtO >> 3;
                long j18 = jArr7[i36];
                int i37 = (e9gEMXR7LXtO & 7) << 3;
                this.e9gEMXR7LXtO = i35 - (((j18 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.TSizfFm2Yiuu;
                long j19 = (j18 & (~(j << i37))) | (j2 << i37);
                jArr7[i36] = j19;
                jArr7[(((e9gEMXR7LXtO - 7) & i38) + (i38 & 7)) >> 3] = j19;
                return e9gEMXR7LXtO;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = i14;
        }
    }

    public final void a92UlCVFR9N8(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, c02.TSizfFm2Yiuu(i)) : 0;
        this.TSizfFm2Yiuu = max;
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
        this.e9gEMXR7LXtO = c02.PxuCJdSBwIXG(this.TSizfFm2Yiuu) - this.Y1f8riQaR6yg;
        this.lS5Rgt96tfkO = max == 0 ? mm2.e9gEMXR7LXtO : new Object[max];
    }

    public final void cpQdD2nAriOS(int i) {
        this.Y1f8riQaR6yg--;
        long[] jArr = this.PxuCJdSBwIXG;
        int i2 = this.TSizfFm2Yiuu;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.lS5Rgt96tfkO[i] = null;
    }

    public final void dgRBjINgWbAK(Object obj) {
        this.lS5Rgt96tfkO[Y1f8riQaR6yg(obj)] = obj;
    }

    public final int e9gEMXR7LXtO(int i) {
        int i2 = this.TSizfFm2Yiuu;
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
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        if (w81Var.Y1f8riQaR6yg != this.Y1f8riQaR6yg) {
            return false;
        }
        Object[] objArr = this.lS5Rgt96tfkO;
        long[] jArr = this.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !w81Var.TSizfFm2Yiuu(objArr[(i << 3) + i3])) {
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
        int i = (this.TSizfFm2Yiuu * 31) + this.Y1f8riQaR6yg;
        Object[] objArr = this.lS5Rgt96tfkO;
        long[] jArr = this.PxuCJdSBwIXG;
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
                            if (!cs0.wdg6QnbFHrFF(obj, this)) {
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

    public final void lS5Rgt96tfkO() {
        this.Y1f8riQaR6yg = 0;
        long[] jArr = this.PxuCJdSBwIXG;
        if (jArr != c02.PxuCJdSBwIXG) {
            na.Nlhe969cAGO8(jArr, -9187201950435737472L);
            long[] jArr2 = this.PxuCJdSBwIXG;
            int i = this.TSizfFm2Yiuu;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        na.v6yxfmkxNKhL(0, this.TSizfFm2Yiuu, null, this.lS5Rgt96tfkO);
        this.e9gEMXR7LXtO = c02.PxuCJdSBwIXG(this.TSizfFm2Yiuu) - this.Y1f8riQaR6yg;
    }

    public final boolean rtx2ld2ELZv4() {
        return this.Y1f8riQaR6yg != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.lS5Rgt96tfkO;
        long[] jArr = this.PxuCJdSBwIXG;
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

    public final void wdg6QnbFHrFF(w81 w81Var) {
        w81Var.getClass();
        Object[] objArr = w81Var.lS5Rgt96tfkO;
        long[] jArr = w81Var.PxuCJdSBwIXG;
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
                        dgRBjINgWbAK(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x50lh2ztY7Y5(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.TSizfFm2Yiuu;
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
        boolean z = i >= 0;
        if (z) {
            cpQdD2nAriOS(i);
        }
        return z;
    }

    public /* synthetic */ w81() {
        this(6);
    }
}
