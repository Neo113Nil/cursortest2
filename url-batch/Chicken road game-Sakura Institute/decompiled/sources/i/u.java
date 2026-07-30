package i;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4798a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4799b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f4800c;

    /* renamed from: d, reason: collision with root package name */
    public int f4801d;

    /* renamed from: e, reason: collision with root package name */
    public int f4802e;

    /* renamed from: f, reason: collision with root package name */
    public int f4803f;

    public u(int i7) {
        this.f4798a = e0.f4736a;
        this.f4799b = j.a.f4968c;
        this.f4800c = j.f4753a;
        if (i7 >= 0) {
            d(e0.f(i7));
        } else {
            j.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i8 = this.f4801d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4798a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j8 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int b(Object obj) {
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i7;
        int i8 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f4801d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f4798a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            long j10 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j11 = i11;
            int i18 = i11;
            int i19 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j13) >> 3)) & i12;
                int i20 = i8;
                if (r6.k.a(this.f4799b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i8 = i20;
            }
            int i21 = i8;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int a3 = a(i10);
                long j14 = 128;
                long j15 = 255;
                if (this.f4803f != 0 || ((this.f4798a[a3 >> 3] >> ((a3 & 7) << 3)) & 255) == 254) {
                    j8 = 128;
                    j9 = 255;
                } else {
                    int i22 = this.f4801d;
                    if (i22 <= 8 || Long.compare((this.f4802e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) > 0) {
                        j8 = 128;
                        j9 = 255;
                        int d8 = e0.d(this.f4801d);
                        long[] jArr4 = this.f4798a;
                        Object[] objArr2 = this.f4799b;
                        int[] iArr = this.f4800c;
                        int i23 = this.f4801d;
                        d(d8);
                        long[] jArr5 = this.f4798a;
                        Object[] objArr3 = this.f4799b;
                        int[] iArr2 = this.f4800c;
                        int i24 = this.f4801d;
                        int i25 = 0;
                        while (i25 < i23) {
                            if (((jArr4[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i25];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : i19) * i21;
                                int i26 = hashCode2 ^ (hashCode2 << 16);
                                int a9 = a(i26 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j16 = i26 & 127;
                                int i27 = a9 >> 3;
                                int i28 = (a9 & 7) << 3;
                                long j17 = (jArr[i27] & (~(255 << i28))) | (j16 << i28);
                                jArr[i27] = j17;
                                jArr[(((a9 - 7) & i24) + (i24 & 7)) >> 3] = j17;
                                objArr3[a9] = obj2;
                                iArr2[a9] = iArr[i25];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i25++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                            i19 = 0;
                        }
                    } else {
                        long[] jArr6 = this.f4798a;
                        int i29 = this.f4801d;
                        Object[] objArr4 = this.f4799b;
                        int[] iArr3 = this.f4800c;
                        e0.a(jArr6, i29);
                        int i30 = 0;
                        int i31 = -1;
                        while (i30 != i29) {
                            int i32 = i30 >> 3;
                            int i33 = (i30 & 7) << 3;
                            long j18 = (jArr6[i32] >> i33) & j15;
                            if (j18 == j14) {
                                int i34 = i30;
                                i30++;
                                i31 = i34;
                            } else if (j18 != 254) {
                                i30++;
                            } else {
                                Object obj3 = objArr4[i30];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i21;
                                long j19 = j14;
                                int i35 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int a10 = a(i35);
                                int i36 = i35 & i29;
                                long j20 = j15;
                                if (((a10 - i36) & i29) / 8 == ((i30 - i36) & i29) / 8) {
                                    jArr6[i32] = ((r24 & 127) << i33) | (jArr6[i32] & (~(j20 << i33)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    j14 = j19;
                                    j15 = j20;
                                } else {
                                    int i37 = i30;
                                    int i38 = a10 >> 3;
                                    long j21 = jArr6[i38];
                                    int i39 = (a10 & 7) << 3;
                                    if (((j21 >> i39) & j20) == j19) {
                                        objArr = objArr4;
                                        jArr6[i38] = ((~(j20 << i39)) & j21) | ((r24 & 127) << i39);
                                        jArr6[i32] = (jArr6[i32] & (~(j20 << i33))) | (j19 << i33);
                                        objArr[a10] = objArr[i37];
                                        objArr[i37] = null;
                                        iArr3[a10] = iArr3[i37];
                                        iArr3[i37] = 0;
                                        i31 = i37;
                                        i7 = i31;
                                    } else {
                                        objArr = objArr4;
                                        jArr6[i38] = ((~(j20 << i39)) & j21) | ((r24 & 127) << i39);
                                        if (i31 == -1) {
                                            i31 = e0.b(jArr6, i37 + 1, i29);
                                        }
                                        objArr[i31] = objArr[a10];
                                        objArr[a10] = objArr[i37];
                                        objArr[i37] = objArr[i31];
                                        iArr3[i31] = iArr3[a10];
                                        iArr3[a10] = iArr3[i37];
                                        iArr3[i37] = iArr3[i31];
                                        i7 = i37 - 1;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    objArr4 = objArr;
                                    j15 = j20;
                                    i30 = i7 + 1;
                                    j14 = j19;
                                }
                            }
                        }
                        j8 = j14;
                        j9 = j15;
                        this.f4803f = e0.c(this.f4801d) - this.f4802e;
                    }
                    a3 = a(i10);
                }
                this.f4802e++;
                int i40 = this.f4803f;
                long[] jArr7 = this.f4798a;
                int i41 = a3 >> 3;
                long j22 = jArr7[i41];
                int i42 = (a3 & 7) << 3;
                if (((j22 >> i42) & j9) != j8) {
                    i17 = 0;
                }
                this.f4803f = i40 - i17;
                int i43 = this.f4801d;
                long j23 = (j22 & (~(j9 << i42))) | (j11 << i42);
                jArr7[i41] = j23;
                jArr7[(((a3 - 7) & i43) + (i43 & 7)) >> 3] = j23;
                return ~a3;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i18;
            i8 = i21;
        }
    }

    public final int c(Object obj) {
        int i7 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4801d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f4798a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i10;
                if (r6.k.a(this.f4799b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i11 = i12 + i7;
        }
    }

    public final void d(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4801d = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4798a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4803f = e0.c(this.f4801d) - this.f4802e;
        this.f4799b = new Object[max];
        this.f4800c = new int[max];
    }

    public final void e(int i7) {
        this.f4802e--;
        long[] jArr = this.f4798a;
        int i8 = this.f4801d;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j8 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j8;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j8;
        this.f4799b[i7] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (uVar.f4802e == this.f4802e) {
                Object[] objArr = this.f4799b;
                int[] iArr = this.f4800c;
                long[] jArr = this.f4798a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i7 = 0;
                loop0: while (true) {
                    long j8 = jArr[i7];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j8) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj2 = objArr[i10];
                                int i11 = iArr[i10];
                                int c4 = uVar.c(obj2);
                                if (c4 < 0) {
                                    throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                                }
                                if (i11 != uVar.f4800c[c4]) {
                                    break loop0;
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i8 != 8) {
                            return true;
                        }
                    }
                    if (i7 == length) {
                        return true;
                    }
                    i7++;
                }
            }
        }
        return false;
    }

    public final void f(int i7, Object obj) {
        int b9 = b(obj);
        if (b9 < 0) {
            b9 = ~b9;
        }
        this.f4799b[b9] = obj;
        this.f4800c[b9] = i7;
    }

    public final int hashCode() {
        Object[] objArr = this.f4799b;
        int[] iArr = this.f4800c;
        long[] jArr = this.f4798a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr[i11];
                        i8 += Integer.hashCode(iArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 == length) {
                return i8;
            }
            i7++;
        }
    }

    public final String toString() {
        if (this.f4802e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f4799b;
        int[] iArr = this.f4800c;
        long[] jArr = this.f4798a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i7 << 3) + i10;
                            Object obj = objArr[i11];
                            int i12 = iArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i12);
                            i8++;
                            if (i8 < this.f4802e) {
                                sb.append(", ");
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
