package j;

import java.util.NoSuchElementException;
import k.AbstractC0561a;

/* renamed from: j.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6330a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6331b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6332c;

    /* renamed from: d, reason: collision with root package name */
    public int f6333d;

    /* renamed from: e, reason: collision with root package name */
    public int f6334e;

    /* renamed from: f, reason: collision with root package name */
    public int f6335f;

    public C0547u(int i3) {
        this.f6330a = AbstractC0522D.f6254a;
        this.f6331b = AbstractC0561a.f6410c;
        this.f6332c = AbstractC0536j.f6285a;
        if (i3 >= 0) {
            d(AbstractC0522D.f(i3));
        } else {
            AbstractC0561a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i3) {
        int i4 = this.f6333d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6330a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b(Object obj) {
        long j3;
        int i3;
        long[] jArr;
        Object[] objArr;
        long j4;
        int i4 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.f6333d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f6330a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j5 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j6 = i7;
            int i13 = i7;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
                if (f2.j.a(this.f6331b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i14 = 8;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int a3 = a(i6);
                long j9 = 128;
                long j10 = 255;
                if (this.f6335f != 0 || ((this.f6330a[a3 >> 3] >> ((a3 & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                    i3 = 0;
                } else {
                    int i15 = this.f6333d;
                    if (i15 <= 8 || Long.compare((this.f6334e * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) > 0) {
                        j3 = j6;
                        i3 = 0;
                        int d3 = AbstractC0522D.d(this.f6333d);
                        long[] jArr3 = this.f6330a;
                        Object[] objArr2 = this.f6331b;
                        int[] iArr = this.f6332c;
                        int i16 = this.f6333d;
                        d(d3);
                        long[] jArr4 = this.f6330a;
                        Object[] objArr3 = this.f6331b;
                        int[] iArr2 = this.f6332c;
                        int i17 = this.f6333d;
                        int i18 = 0;
                        while (i18 < i16) {
                            if (((jArr3[i18 >> 3] >> ((i18 & 7) << 3)) & j10) < 128) {
                                Object obj2 = objArr2[i18];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i19 = hashCode2 ^ (hashCode2 << 16);
                                int a4 = a(i19 >>> 7);
                                long j11 = i19 & 127;
                                int i20 = a4 >> 3;
                                int i21 = (a4 & 7) << 3;
                                jArr = jArr3;
                                objArr = objArr2;
                                long j12 = (jArr4[i20] & (~(255 << i21))) | (j11 << i21);
                                jArr4[i20] = j12;
                                jArr4[(((a4 - 7) & i17) + (i17 & 7)) >> 3] = j12;
                                objArr3[a4] = obj2;
                                iArr2[a4] = iArr[i18];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i18++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                            j10 = 255;
                        }
                    } else {
                        long[] jArr5 = this.f6330a;
                        int i22 = this.f6333d;
                        Object[] objArr4 = this.f6331b;
                        int[] iArr3 = this.f6332c;
                        AbstractC0522D.a(jArr5, i22);
                        int i23 = 0;
                        int i24 = -1;
                        while (i23 != i22) {
                            int i25 = i23 >> 3;
                            int i26 = (i23 & 7) << 3;
                            long j13 = (jArr5[i25] >> i26) & 255;
                            if (j13 == j9) {
                                i24 = i23;
                                i23++;
                            } else if (j13 != 254) {
                                i23++;
                            } else {
                                Object obj3 = objArr4[i23];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i4;
                                int i27 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int a5 = a(i27);
                                int i28 = i27 & i22;
                                if (((a5 - i28) & i22) / 8 == ((i23 - i28) & i22) / i14) {
                                    jArr5[i25] = ((r24 & 127) << i26) | (jArr5[i25] & (~(255 << i26)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i23++;
                                    i14 = 8;
                                    i4 = -862048943;
                                } else {
                                    int i29 = i23;
                                    int i30 = a5 >> 3;
                                    long j14 = jArr5[i30];
                                    int i31 = (a5 & 7) << 3;
                                    if (((j14 >> i31) & 255) == j9) {
                                        j4 = j6;
                                        jArr5[i30] = ((r24 & 127) << i31) | (j14 & (~(255 << i31)));
                                        jArr5[i25] = (jArr5[i25] & (~(255 << i26))) | (128 << i26);
                                        objArr4[a5] = objArr4[i29];
                                        objArr4[i29] = null;
                                        iArr3[a5] = iArr3[i29];
                                        iArr3[i29] = 0;
                                        i24 = i29;
                                    } else {
                                        j4 = j6;
                                        jArr5[i30] = ((r24 & 127) << i31) | (j14 & (~(255 << i31)));
                                        int i32 = i24;
                                        i24 = i32 == -1 ? AbstractC0522D.b(jArr5, i29 + 1, i22) : i32;
                                        objArr4[i24] = objArr4[a5];
                                        objArr4[a5] = objArr4[i29];
                                        objArr4[i29] = objArr4[i24];
                                        iArr3[i24] = iArr3[a5];
                                        iArr3[a5] = iArr3[i29];
                                        iArr3[i29] = iArr3[i24];
                                        i29--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i23 = i29 + 1;
                                    j6 = j4;
                                    i14 = 8;
                                    i4 = -862048943;
                                    j9 = 128;
                                }
                            }
                        }
                        j3 = j6;
                        i3 = 0;
                        this.f6335f = AbstractC0522D.c(this.f6333d) - this.f6334e;
                    }
                    a3 = a(i6);
                }
                this.f6334e++;
                int i33 = this.f6335f;
                long[] jArr6 = this.f6330a;
                int i34 = a3 >> 3;
                long j15 = jArr6[i34];
                int i35 = (a3 & 7) << 3;
                this.f6335f = i33 - (((j15 >> i35) & 255) != 128 ? i3 : 1);
                int i36 = this.f6333d;
                long j16 = (j15 & (~(255 << i35))) | (j3 << i35);
                jArr6[i34] = j16;
                jArr6[(((a3 - 7) & i36) + (i36 & 7)) >> 3] = j16;
                return ~a3;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i13;
            i4 = -862048943;
        }
    }

    public final int c(Object obj) {
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6333d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6330a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                if (f2.j.a(this.f6331b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i7 = i8 + i3;
        }
    }

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6333d = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6330a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6335f = AbstractC0522D.c(this.f6333d) - this.f6334e;
        this.f6331b = new Object[max];
        this.f6332c = new int[max];
    }

    public final void e(int i3) {
        this.f6334e--;
        long[] jArr = this.f6330a;
        int i4 = this.f6333d;
        int i5 = i3 >> 3;
        int i6 = (i3 & 7) << 3;
        long j3 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j3;
        jArr[(((i3 - 7) & i4) + (i4 & 7)) >> 3] = j3;
        this.f6331b[i3] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0547u)) {
            return false;
        }
        C0547u c0547u = (C0547u) obj;
        if (c0547u.f6334e != this.f6334e) {
            return false;
        }
        Object[] objArr = this.f6331b;
        int[] iArr = this.f6332c;
        long[] jArr = this.f6330a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj2 = objArr[i6];
                            int i7 = iArr[i6];
                            int c2 = c0547u.c(obj2);
                            if (c2 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (i7 != c0547u.f6332c[c2]) {
                                return false;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final void f(int i3, Object obj) {
        int b3 = b(obj);
        if (b3 < 0) {
            b3 = ~b3;
        }
        this.f6331b[b3] = obj;
        this.f6332c[b3] = i3;
    }

    public final int hashCode() {
        Object[] objArr = this.f6331b;
        int[] iArr = this.f6332c;
        long[] jArr = this.f6330a;
        int length = jArr.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i5 += Integer.hashCode(iArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j3 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
        }
        return i3;
    }

    public final String toString() {
        if (this.f6334e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6331b;
        int[] iArr = this.f6332c;
        long[] jArr = this.f6330a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            int i8 = iArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.f6334e) {
                                sb.append(", ");
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f2.j.e(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ C0547u() {
        this(6);
    }
}
