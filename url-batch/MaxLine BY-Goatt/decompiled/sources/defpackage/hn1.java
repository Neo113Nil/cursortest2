package defpackage;

import defpackage.q13;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hn1 {
    public long[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public hn1(int i) {
        this.a = oe2.a;
        this.b = yk3.r;
        this.c = w31.a;
        if (i >= 0) {
            f(oe2.d(i));
        } else {
            lh.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != oe2.a) {
            ni.l(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ni.k(0, this.d, null, this.b);
        this.f = oe2.a(this.d) - this.e;
    }

    public final int b(int i) {
        int i2 = this.d;
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

    public final int c(Object obj) {
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
        int i6 = this.d;
        int i7 = i4 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
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
                if (Intrinsics.b(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i2 = i12;
            }
            int i13 = i2;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int b = b(i4);
                long j8 = 255;
                if (this.f != 0 || ((this.a[b >> 3] >> ((b & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        int i15 = 8;
                        long j9 = this.e;
                        q13.a aVar = q13.m;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i16 = this.d;
                            Object[] objArr2 = this.b;
                            int[] iArr = this.c;
                            j3 = 128;
                            int i17 = (i16 + 7) >> 3;
                            int i18 = 0;
                            while (i18 < i17) {
                                long j10 = j8;
                                long j11 = jArr4[i18] & (-9187201950435737472L);
                                jArr4[i18] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i18++;
                                i15 = i15;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int i19 = i15;
                            int r = oi.r(jArr4);
                            int i20 = r - 1;
                            long j12 = 72057594037927935L;
                            jArr4[i20] = (jArr4[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[r] = jArr4[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr4[i22] >> i23) & j;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj2 = objArr2[i21];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i13;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b2 = b(i24);
                                    int i25 = i24 & i16;
                                    long j14 = j12;
                                    if (((b2 - i25) & i16) / 8 == ((i21 - i25) & i16) / i19) {
                                        jArr4[i22] = ((r8 & 127) << i23) | (jArr4[i22] & (~(j << i23)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        j12 = j14;
                                        i19 = i19;
                                    } else {
                                        int i26 = i19;
                                        int i27 = b2 >> 3;
                                        long j15 = jArr4[i27];
                                        int i28 = (b2 & 7) << 3;
                                        if (((j15 >> i28) & j) == 128) {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((~(j << i28)) & j15) | ((r8 & 127) << i28);
                                            jArr4[i22] = (jArr4[i22] & (~(j << i23))) | (128 << i23);
                                            objArr[b2] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[b2] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            i = i16;
                                            objArr = objArr2;
                                            jArr4[i27] = ((r8 & 127) << i28) | ((~(j << i28)) & j15);
                                            Object obj3 = objArr[b2];
                                            objArr[b2] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i29 = iArr[b2];
                                            iArr[b2] = iArr[i21];
                                            iArr[i21] = i29;
                                            i21--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j14) | Long.MIN_VALUE;
                                        i21++;
                                        i16 = i;
                                        j12 = j14;
                                        i19 = i26;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            this.f = oe2.a(this.d) - this.e;
                            b = b(i4);
                        }
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int b3 = oe2.b(this.d);
                    long[] jArr5 = this.a;
                    Object[] objArr3 = this.b;
                    int[] iArr2 = this.c;
                    int i30 = this.d;
                    f(b3);
                    long[] jArr6 = this.a;
                    Object[] objArr4 = this.b;
                    int[] iArr3 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i32];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int b4 = b(i33 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j16 = i33 & 127;
                            int i34 = b4 >> 3;
                            int i35 = (b4 & 7) << 3;
                            long j17 = (jArr[i34] & (~(255 << i35))) | (j16 << i35);
                            jArr[i34] = j17;
                            jArr[(((b4 - 7) & i31) + (i31 & 7)) >> 3] = j17;
                            objArr4[b4] = obj4;
                            iArr3[b4] = iArr2[i32];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i32++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b = b(i4);
                }
                this.e++;
                int i36 = this.f;
                long[] jArr7 = this.a;
                int i37 = b >> 3;
                long j18 = jArr7[i37];
                int i38 = (b & 7) << 3;
                this.f = i36 - (((j18 >> i38) & j) == j3 ? 1 : 0);
                int i39 = this.d;
                long j19 = (j18 & (~(j << i38))) | (j2 << i38);
                jArr7[i37] = j19;
                jArr7[(((b - 7) & i39) + (i39 & 7)) >> 3] = j19;
                return ~b;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i5 = i11;
            i2 = i13;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.b(this.b[numberOfTrailingZeros], obj)) {
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

    public final int e(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.c[d];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hn1)) {
            return false;
        }
        hn1 hn1Var = (hn1) obj;
        if (hn1Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
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
                            int d = hn1Var.d(obj2);
                            if (d < 0 || i5 != hn1Var.c[d]) {
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

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, oe2.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = oe2.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = oe2.a(this.d) - this.e;
        this.b = new Object[max];
        this.c = new int[max];
    }

    public final void g(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void h(int i, Object obj) {
        int c = c(obj);
        if (c < 0) {
            c = ~c;
        }
        this.b[c] = obj;
        this.c[c] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
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

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        int[] iArr = this.c;
        long[] jArr = this.a;
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
                            if (i2 < this.e) {
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

    public /* synthetic */ hn1() {
        this(6);
    }
}
