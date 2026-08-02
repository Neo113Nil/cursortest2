package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qt {
    public long[] a = qw.a;
    public Object[] b = rb.b;
    public long[] c = qx.a;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    private int h;

    public qt(int i) {
        e(i);
    }

    private final int c(int i) {
        int i2 = this.f;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
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

    private final void d() {
        this.h = qw.a(this.f) - this.g;
    }

    private final void e(int i) {
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr;
        long[] jArr2;
        int i4 = 0;
        if (i > 0) {
            long[] jArr3 = qw.a;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        this.f = i2;
        if (i2 == 0) {
            jArr = qw.a;
            i3 = 0;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            i3 = i2;
        }
        this.a = jArr;
        int i5 = i3 >> 3;
        long j = 255 << ((7 & i3) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        d();
        if (i2 == 0) {
            objArr = rb.b;
        } else {
            i4 = i2;
            objArr = new Object[i2];
        }
        this.b = objArr;
        if (i4 == 0) {
            jArr2 = qx.a;
        } else {
            jArr2 = new long[i4];
            Arrays.fill(jArr2, 0, jArr2.length, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    public final int a(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long[] jArr3;
        int i2 = -862048943;
        int hashCode = obj.hashCode() * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.f;
        int i6 = i4 & i5;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long[] jArr4 = this.a;
            int i9 = i6 >> 3;
            int i10 = (i6 & 7) << 3;
            long j4 = jArr4[i9] >>> i10;
            long j5 = jArr4[i9 + 1] << (64 - i10);
            int i11 = 1;
            long j6 = i3 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                int i12 = i2;
                int i13 = i11;
                if (ksp.b(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i12;
                i11 = i13;
            }
            int i14 = i2;
            int i15 = i11;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int c = c(i4);
                if (this.h != 0 || ((this.a[c >> 3] >> ((c & 7) << 3)) & 255) == 254) {
                    i = 0;
                    j = 255;
                    j2 = j6;
                    j3 = 128;
                } else {
                    int i16 = this.f;
                    if (i16 > 8) {
                        j3 = 128;
                        if (Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = this.a;
                            if (jArr5 == null) {
                                i = 0;
                                j = 255;
                                j2 = j6;
                            } else {
                                int i17 = this.f;
                                Object[] objArr2 = this.b;
                                long[] jArr6 = this.c;
                                long[] jArr7 = new long[i17];
                                j = 255;
                                Arrays.fill(jArr7, 0, i17, 9223372034707292159L);
                                int i18 = (i17 + 7) >> 3;
                                int i19 = 0;
                                while (i19 < i18) {
                                    int i20 = i7;
                                    long j10 = jArr5[i19] & (-9187201950435737472L);
                                    jArr5[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                    i19++;
                                    i7 = i20;
                                    jArr7 = jArr7;
                                }
                                int i21 = i7;
                                long[] jArr8 = jArr7;
                                int H = ixc.H(jArr5);
                                int i22 = H - 1;
                                jArr5[i22] = (jArr5[i22] & 72057594037927935L) | (-72057594037927936L);
                                jArr5[H] = jArr5[i21];
                                int i23 = i21;
                                while (i23 != i17) {
                                    int i24 = i23 >> 3;
                                    int i25 = (i23 & 7) << 3;
                                    long j11 = (jArr5[i24] >> i25) & 255;
                                    if (j11 != 128 && j11 == 254) {
                                        Object obj2 = objArr2[i23];
                                        int hashCode2 = (obj2 != null ? obj2.hashCode() : i21) * i14;
                                        int i26 = hashCode2 ^ (hashCode2 << 16);
                                        int i27 = i26 & 127;
                                        int i28 = i26 >>> 7;
                                        int c2 = c(i28);
                                        int i29 = i28 & i17;
                                        int i30 = i21;
                                        long j12 = i27;
                                        if (((c2 - i29) & i17) / 8 == ((i23 - i29) & i17) / 8) {
                                            int i31 = i23 + 1;
                                            jArr5[i24] = (jArr5[i24] & (~(255 << i25))) | (j12 << i25);
                                            if (jArr8[i23] == 9223372034707292159L) {
                                                long j13 = i23;
                                                jArr8[i23] = j13 | (j13 << 32);
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[i30];
                                            i23 = i31;
                                            i21 = i30;
                                        } else {
                                            long j14 = i23;
                                            long j15 = c2;
                                            int i32 = c2 >> 3;
                                            long j16 = jArr5[i32];
                                            int i33 = (c2 & 7) << 3;
                                            long j17 = j12 << i33;
                                            long j18 = j6;
                                            long j19 = j16 & (~(255 << i33));
                                            if (((j16 >> i33) & 255) == 128) {
                                                long j20 = j14 << 32;
                                                objArr = objArr2;
                                                jArr3 = jArr6;
                                                long j21 = ~(255 << i25);
                                                jArr5[i32] = j19 | j17;
                                                jArr5[i24] = (j21 & jArr5[i24]) | (128 << i25);
                                                objArr[c2] = objArr[i23];
                                                objArr[i23] = null;
                                                jArr3[c2] = jArr3[i23];
                                                jArr3[i23] = 4611686018427387903L;
                                                int i34 = (int) ((jArr8[i23] >> 32) & 4294967295L);
                                                if (i34 != Integer.MAX_VALUE) {
                                                    jArr8[i34] = j15 | (jArr8[i34] & (-4294967296L));
                                                    jArr8[i23] = (jArr8[i23] & 4294967295L) | (-4294967296L);
                                                } else {
                                                    jArr8[i23] = 9223372032559808512L | j15;
                                                }
                                                jArr8[c2] = j20 | 2147483647L;
                                            } else {
                                                objArr = objArr2;
                                                jArr3 = jArr6;
                                                long j22 = j15 << 32;
                                                jArr5[i32] = j19 | j17;
                                                Object obj3 = objArr[c2];
                                                objArr[c2] = objArr[i23];
                                                objArr[i23] = obj3;
                                                long j23 = jArr3[c2];
                                                jArr3[c2] = jArr3[i23];
                                                jArr3[i23] = j23;
                                                int i35 = (int) ((jArr8[i23] >> 32) & 4294967295L);
                                                if (i35 != Integer.MAX_VALUE) {
                                                    jArr8[i35] = j15 | (jArr8[i35] & (-4294967296L));
                                                    jArr8[i23] = j22 | (jArr8[i23] & 4294967295L);
                                                } else {
                                                    jArr8[i23] = j22 | j15;
                                                    i35 = i23;
                                                }
                                                jArr8[c2] = (i35 << 32) | j14;
                                                i23--;
                                            }
                                            jArr5[jArr5.length - 1] = jArr5[i30];
                                            i23++;
                                            i21 = i30;
                                            objArr2 = objArr;
                                            j6 = j18;
                                            jArr6 = jArr3;
                                        }
                                    } else {
                                        i23++;
                                    }
                                }
                                i = i21;
                                j2 = j6;
                                d();
                                long[] jArr9 = this.c;
                                int length = jArr9.length;
                                for (int i36 = i; i36 < length; i36++) {
                                    long j24 = jArr9[i36];
                                    jArr9[i36] = (((j24 & (-4611686018427387904L)) | (((int) ((j24 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr8[r7] & 4294967295L))) << 31) | (((int) (j24 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr8[r8] & 4294967295L));
                                }
                                int i37 = this.d;
                                if (i37 != Integer.MAX_VALUE) {
                                    this.d = (int) (jArr8[i37] & 4294967295L);
                                }
                                int i38 = this.e;
                                if (i38 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr8[i38] & 4294967295L);
                                }
                            }
                            c = c(i4);
                        }
                    } else {
                        j3 = 128;
                    }
                    i = 0;
                    j = 255;
                    j2 = j6;
                    int b = qw.b(this.f);
                    long[] jArr10 = this.a;
                    Object[] objArr3 = this.b;
                    long[] jArr11 = this.c;
                    int i39 = this.f;
                    int[] iArr = new int[i39];
                    e(b);
                    long[] jArr12 = this.a;
                    Object[] objArr4 = this.b;
                    long[] jArr13 = this.c;
                    int i40 = this.f;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr10[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < j3) {
                            Object obj4 = objArr3[i41];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i14;
                            int c3 = c((hashCode3 ^ (hashCode3 << 16)) >>> 7);
                            int i42 = c3 >> 3;
                            int i43 = (c3 & 7) << 3;
                            jArr = jArr12;
                            jArr2 = jArr10;
                            long j25 = (jArr12[i42] & (~(255 << i43))) | ((r13 & 127) << i43);
                            jArr[i42] = j25;
                            jArr[(((c3 - 7) & i40) + (i40 & 7)) >> 3] = j25;
                            objArr4[c3] = obj4;
                            jArr13[c3] = jArr11[i41];
                            iArr[i41] = c3;
                        } else {
                            jArr = jArr12;
                            jArr2 = jArr10;
                        }
                        i41++;
                        jArr10 = jArr2;
                        jArr12 = jArr;
                    }
                    long[] jArr14 = this.c;
                    int length2 = jArr14.length;
                    for (int i44 = 0; i44 < length2; i44++) {
                        long j26 = jArr14[i44];
                        jArr14[i44] = (((j26 & (-4611686018427387904L)) | (((int) ((j26 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r8])) << 31) | (((int) (j26 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r9]);
                    }
                    int i45 = this.d;
                    if (i45 != Integer.MAX_VALUE) {
                        this.d = iArr[i45];
                    }
                    int i46 = this.e;
                    if (i46 != Integer.MAX_VALUE) {
                        this.e = iArr[i46];
                    }
                    c = c(i4);
                }
                this.g++;
                int i47 = this.h;
                long[] jArr15 = this.a;
                int i48 = c >> 3;
                long j27 = jArr15[i48];
                int i49 = (c & 7) << 3;
                if (((j27 >> i49) & j) == j3) {
                    i = i15;
                }
                this.h = i47 - i;
                int i50 = this.f;
                long j28 = (j27 & (~(j << i49))) | (j2 << i49);
                jArr15[i48] = j28;
                jArr15[(((c - 7) & i50) + (i50 & 7)) >> 3] = j28;
                return c;
            }
            i8 += 8;
            i6 = (i6 + i8) & i5;
            i2 = i14;
        }
    }

    public final boolean b(Object obj) {
        int i = this.g;
        int a = a(obj);
        this.b[a] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[a] = (i2 & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & a) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = a;
        if (this.e == Integer.MAX_VALUE) {
            this.e = a;
        }
        return this.g != i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (((((~r11) << 6) & r11) & r27) != 0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Object[] objArr;
        int i;
        boolean z2;
        Object[] objArr2;
        ?? r19;
        long j;
        char c;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i2 = 0;
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        if (qtVar.g != this.g) {
            return false;
        }
        Object[] objArr3 = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j2 = jArr[i3];
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = ~(i3 - length);
                int i5 = i2;
                while (true) {
                    char c2 = '\b';
                    int i6 = 8 - (i4 >>> 31);
                    if (i5 < i6) {
                        if ((255 & j2) < 128) {
                            Object obj2 = objArr3[(i3 << 3) + i5];
                            int hashCode = obj2 != null ? obj2.hashCode() : i2;
                            z2 = z3;
                            int i7 = qtVar.f;
                            int i8 = hashCode * (-862048943);
                            int i9 = ((i8 ^ (i8 << 16)) >>> 7) & i7;
                            int i10 = i2;
                            while (true) {
                                r19 = i2;
                                j = j3;
                                long[] jArr2 = qtVar.a;
                                int i11 = i9 >> 3;
                                c = c2;
                                int i12 = (i9 & 7) << 3;
                                int i13 = i7;
                                objArr2 = objArr3;
                                long j4 = (jArr2[i11] >>> i12) | ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63));
                                long j5 = ((r15 & 127) * 72340172838076673L) ^ j4;
                                long j6 = (j5 - 72340172838076673L) & (~j5) & j;
                                while (true) {
                                    if (j6 == 0) {
                                        break;
                                    }
                                    int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i13;
                                    if (!ksp.b(qtVar.b[numberOfTrailingZeros], obj2)) {
                                        j6 &= j6 - 1;
                                    } else if (numberOfTrailingZeros < 0) {
                                        break loop0;
                                    }
                                }
                                i10 += 8;
                                i9 = (i9 + i10) & i13;
                                j3 = j;
                                i2 = r19 == true ? 1 : 0;
                                objArr3 = objArr2;
                                c2 = c;
                                i7 = i13;
                            }
                        } else {
                            z2 = z3;
                            objArr2 = objArr3;
                            r19 = i2;
                            j = j3;
                            c = '\b';
                        }
                        j2 >>= c;
                        i5++;
                        j3 = j;
                        z3 = z2;
                        i2 = r19;
                        objArr3 = objArr2;
                    } else {
                        z = z3;
                        objArr = objArr3;
                        i = i2;
                        if (i6 != 8) {
                            return z;
                        }
                    }
                }
            } else {
                z = z3;
                objArr = objArr3;
                i = i2;
            }
            if (i3 == length) {
                return z;
            }
            i3++;
            z3 = z;
            i2 = i;
            objArr3 = objArr;
        }
        return r19;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f * 31) + this.g;
        Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = (~(i3 - length)) >>> 31;
                    int i5 = 0;
                    while (true) {
                        i = 8 - i4;
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            if (!ksp.b(obj, this)) {
                                i2 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        return i2;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final String toString() {
        ajq ajqVar = new ajq(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.b;
        long[] jArr = this.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i == Integer.MAX_VALUE) {
                break;
            }
            long j = jArr[i] >> 31;
            Object obj = objArr[i];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append((CharSequence) ajqVar.a(obj));
            i2++;
            i = (int) (j & 2147483647L);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public qt() {
    }
}
