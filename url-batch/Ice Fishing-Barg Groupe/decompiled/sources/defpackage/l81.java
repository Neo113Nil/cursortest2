package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l81 {
    public long[] PxuCJdSBwIXG;
    public int[] TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public int e9gEMXR7LXtO;
    public Object[] lS5Rgt96tfkO;

    public l81(int i) {
        this.PxuCJdSBwIXG = c02.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = mm2.e9gEMXR7LXtO;
        this.TSizfFm2Yiuu = gr0.PxuCJdSBwIXG;
        if (i >= 0) {
            e9gEMXR7LXtO(c02.Y1f8riQaR6yg(i));
        } else {
            u9.XL4ISE6Oc65B("Capacity must be a positive value.");
            throw null;
        }
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
        na.v6yxfmkxNKhL(0, this.Y1f8riQaR6yg, null, this.lS5Rgt96tfkO);
        this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
    }

    public final void RAsUl2FVSrh6(int i, Object obj) {
        int TSizfFm2Yiuu = TSizfFm2Yiuu(obj);
        if (TSizfFm2Yiuu < 0) {
            TSizfFm2Yiuu = ~TSizfFm2Yiuu;
        }
        this.lS5Rgt96tfkO[TSizfFm2Yiuu] = obj;
        this.TSizfFm2Yiuu[TSizfFm2Yiuu] = i;
    }

    public final int TSizfFm2Yiuu(Object obj) {
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
                int lS5Rgt96tfkO = lS5Rgt96tfkO(i4);
                long j8 = 255;
                if (this.a92UlCVFR9N8 != 0 || ((this.PxuCJdSBwIXG[lS5Rgt96tfkO >> 3] >> ((lS5Rgt96tfkO & 7) << 3)) & 255) == 254) {
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
                            int[] iArr = this.TSizfFm2Yiuu;
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
                            long j11 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[uy1Qfkdvj4xZ] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr4[i22] >> i23) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int lS5Rgt96tfkO2 = lS5Rgt96tfkO(i24);
                                    int i25 = i24 & i16;
                                    long j13 = j11;
                                    if (((lS5Rgt96tfkO2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = lS5Rgt96tfkO2 >> 3;
                                        long j14 = jArr4[i27];
                                        int i28 = (lS5Rgt96tfkO2 & 7) << 3;
                                        if (((j14 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j14) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[lS5Rgt96tfkO2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[lS5Rgt96tfkO2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j14);
                                            Object obj3 = objArr[lS5Rgt96tfkO2];
                                            objArr[lS5Rgt96tfkO2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[lS5Rgt96tfkO2];
                                            iArr[lS5Rgt96tfkO2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j11 = j13;
                                        i19 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.a92UlCVFR9N8 = c02.PxuCJdSBwIXG(this.Y1f8riQaR6yg) - this.e9gEMXR7LXtO;
                            lS5Rgt96tfkO = lS5Rgt96tfkO(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int lS5Rgt96tfkO3 = c02.lS5Rgt96tfkO(this.Y1f8riQaR6yg);
                    long[] jArr5 = this.PxuCJdSBwIXG;
                    Object[] objArr3 = this.lS5Rgt96tfkO;
                    int[] iArr2 = this.TSizfFm2Yiuu;
                    int i30 = this.Y1f8riQaR6yg;
                    e9gEMXR7LXtO(lS5Rgt96tfkO3);
                    long[] jArr6 = this.PxuCJdSBwIXG;
                    Object[] objArr4 = this.lS5Rgt96tfkO;
                    int[] iArr3 = this.TSizfFm2Yiuu;
                    int i31 = this.Y1f8riQaR6yg;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int lS5Rgt96tfkO4 = lS5Rgt96tfkO(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j15 = i33 & 127;
                            int i34 = lS5Rgt96tfkO4 >> 3;
                            int i35 = (lS5Rgt96tfkO4 & 7) << 3;
                            long j16 = (jArr[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr[i34] = j16;
                            jArr[(((lS5Rgt96tfkO4 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[lS5Rgt96tfkO4] = obj4;
                            iArr3[lS5Rgt96tfkO4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    lS5Rgt96tfkO = lS5Rgt96tfkO(i4);
                }
                this.e9gEMXR7LXtO++;
                int i36 = this.a92UlCVFR9N8;
                long[] jArr7 = this.PxuCJdSBwIXG;
                int i37 = lS5Rgt96tfkO >> 3;
                long j17 = jArr7[i37];
                int i38 = (lS5Rgt96tfkO & 7) << 3;
                this.a92UlCVFR9N8 = i36 - (((j17 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.Y1f8riQaR6yg;
                long j18 = (j17 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j18;
                jArr7[(((lS5Rgt96tfkO - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~lS5Rgt96tfkO;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int Y1f8riQaR6yg(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.Y1f8riQaR6yg;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.PxuCJdSBwIXG;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void a92UlCVFR9N8(int i) {
        this.e9gEMXR7LXtO--;
        long[] jArr = this.PxuCJdSBwIXG;
        int i2 = this.Y1f8riQaR6yg;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.lS5Rgt96tfkO[i] = null;
    }

    public final void e9gEMXR7LXtO(int i) {
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
        this.lS5Rgt96tfkO = new Object[max];
        this.TSizfFm2Yiuu = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return false;
        }
        l81 l81Var = (l81) obj;
        if (l81Var.e9gEMXR7LXtO != this.e9gEMXR7LXtO) {
            return false;
        }
        Object[] objArr = this.lS5Rgt96tfkO;
        int[] iArr = this.TSizfFm2Yiuu;
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
                            int i5 = iArr[i4];
                            int Y1f8riQaR6yg = l81Var.Y1f8riQaR6yg(obj2);
                            if (Y1f8riQaR6yg < 0 || i5 != l81Var.TSizfFm2Yiuu[Y1f8riQaR6yg]) {
                                break loop0;
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
        int[] iArr = this.TSizfFm2Yiuu;
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
                        i2 += Integer.hashCode(iArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final int lS5Rgt96tfkO(int i) {
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

    public final String toString() {
        if (this.e9gEMXR7LXtO == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.lS5Rgt96tfkO;
        int[] iArr = this.TSizfFm2Yiuu;
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
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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

    public /* synthetic */ l81() {
        this(6);
    }
}
