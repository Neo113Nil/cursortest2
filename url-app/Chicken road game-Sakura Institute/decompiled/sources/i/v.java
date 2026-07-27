package i;

import j.AbstractC0705a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import y2.y;
import z2.C1436t;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6968a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6969b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6970c;

    /* renamed from: d, reason: collision with root package name */
    public int f6971d;

    /* renamed from: e, reason: collision with root package name */
    public int f6972e;

    /* renamed from: f, reason: collision with root package name */
    public int f6973f;

    public v(int i2) {
        this.f6968a = AbstractC0664E.f6891a;
        this.f6969b = AbstractC0705a.f7121c;
        this.f6970c = k.f6923a;
        if (i2 >= 0) {
            d(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i2) {
        int i4 = this.f6971d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6968a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j5 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int b(Object obj) {
        long j4;
        int i2;
        int i4;
        long[] jArr;
        Object[] objArr;
        long j5;
        int i5;
        int b4;
        String str;
        int i6 = 1;
        int i7 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f6971d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr2 = this.f6968a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = (((-i15) >> 63) & (jArr2[i14 + i6] << (64 - i15))) | (jArr2[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (Intrinsics.a(this.f6969b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i17 = 8;
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int a4 = a(i9);
                long j10 = 128;
                long j11 = 255;
                if (this.f6973f != 0 || ((this.f6968a[a4 >> 3] >> ((a4 & 7) << 3)) & 255) == 254) {
                    j4 = j7;
                    i2 = 1;
                } else {
                    int i18 = this.f6971d;
                    if (i18 > 8) {
                        long j12 = this.f6972e;
                        y.a aVar = y2.y.f11688e;
                        if (Long.compareUnsigned(j12 * 32, i18 * 25) <= 0) {
                            long[] jArr3 = this.f6968a;
                            int i19 = this.f6971d;
                            Object[] objArr2 = this.f6969b;
                            int[] iArr = this.f6970c;
                            AbstractC0664E.a(jArr3, i19);
                            int i20 = 0;
                            int i21 = -1;
                            while (i20 != i19) {
                                int i22 = i20 >> 3;
                                int i23 = (i20 & 7) << 3;
                                long j13 = (jArr3[i22] >> i23) & 255;
                                if (j13 == j10) {
                                    i21 = i20;
                                    i20++;
                                } else if (j13 != 254) {
                                    i20++;
                                } else {
                                    Object obj2 = objArr2[i20];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i7;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int a5 = a(i24);
                                    int i25 = i24 & i19;
                                    if (((a5 - i25) & i19) / 8 == ((i20 - i25) & i19) / i17) {
                                        jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | ((r22 & 127) << i23);
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        int i26 = i21;
                                        int i27 = a5 >> 3;
                                        long j14 = jArr3[i27];
                                        int i28 = (a5 & 7) << 3;
                                        if (((j14 >> i28) & 255) == 128) {
                                            j5 = j7;
                                            jArr3[i27] = (j14 & (~(255 << i28))) | ((r22 & 127) << i28);
                                            jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | (128 << i23);
                                            objArr2[a5] = objArr2[i20];
                                            objArr2[i20] = null;
                                            iArr[a5] = iArr[i20];
                                            iArr[i20] = 0;
                                            str = "<this>";
                                            i5 = i9;
                                            b4 = i20;
                                        } else {
                                            j5 = j7;
                                            i5 = i9;
                                            jArr3[i27] = (j14 & (~(255 << i28))) | ((r22 & 127) << i28);
                                            b4 = i26 == -1 ? AbstractC0664E.b(jArr3, i20 + 1, i19) : i26;
                                            objArr2[b4] = objArr2[a5];
                                            objArr2[a5] = objArr2[i20];
                                            objArr2[i20] = objArr2[b4];
                                            iArr[b4] = iArr[a5];
                                            iArr[a5] = iArr[i20];
                                            iArr[i20] = iArr[b4];
                                            i20--;
                                            str = "<this>";
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, str);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                        i21 = b4;
                                        i9 = i5;
                                        j7 = j5;
                                    }
                                    i17 = 8;
                                    j10 = 128;
                                    i7 = -862048943;
                                }
                            }
                            j4 = j7;
                            this.f6973f = AbstractC0664E.c(this.f6971d) - this.f6972e;
                            i4 = i9;
                            i2 = 1;
                            a4 = a(i4);
                        }
                    }
                    j4 = j7;
                    int i29 = 0;
                    int d4 = AbstractC0664E.d(this.f6971d);
                    long[] jArr4 = this.f6968a;
                    Object[] objArr3 = this.f6969b;
                    int[] iArr2 = this.f6970c;
                    int i30 = this.f6971d;
                    d(d4);
                    long[] jArr5 = this.f6968a;
                    Object[] objArr4 = this.f6969b;
                    int[] iArr3 = this.f6970c;
                    int i31 = this.f6971d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & j11) < 128) {
                            Object obj3 = objArr3[i32];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : i29) * (-862048943);
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int a6 = a(i33 >>> 7);
                            long j15 = i33 & 127;
                            int i34 = a6 >> 3;
                            int i35 = (a6 & 7) << 3;
                            jArr = jArr4;
                            objArr = objArr3;
                            long j16 = (jArr5[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr5[i34] = j16;
                            jArr5[(((a6 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr4[a6] = obj3;
                            iArr3[a6] = iArr2[i32];
                        } else {
                            jArr = jArr4;
                            objArr = objArr3;
                        }
                        i32++;
                        jArr4 = jArr;
                        objArr3 = objArr;
                        i29 = 0;
                        j11 = 255;
                    }
                    i2 = 1;
                    i4 = i9;
                    a4 = a(i4);
                }
                this.f6972e += i2;
                int i36 = this.f6973f;
                long[] jArr6 = this.f6968a;
                int i37 = a4 >> 3;
                long j17 = jArr6[i37];
                int i38 = (a4 & 7) << 3;
                this.f6973f = i36 - (((j17 >> i38) & 255) == 128 ? i2 : 0);
                int i39 = this.f6971d;
                long j18 = (j17 & (~(255 << i38))) | (j4 << i38);
                jArr6[i37] = j18;
                jArr6[(((a4 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~a4;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i6 = 1;
        }
    }

    public final int c(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6971d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6968a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i6;
                if (Intrinsics.a(this.f6969b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6971d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6968a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6973f = AbstractC0664E.c(this.f6971d) - this.f6972e;
        this.f6969b = new Object[max];
        this.f6970c = new int[max];
    }

    public final void e(int i2) {
        this.f6972e--;
        long[] jArr = this.f6968a;
        int i4 = this.f6971d;
        int i5 = i2 >> 3;
        int i6 = (i2 & 7) << 3;
        long j4 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j4;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
        this.f6969b[i2] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (vVar.f6972e != this.f6972e) {
            return false;
        }
        Object[] objArr = this.f6969b;
        int[] iArr = this.f6970c;
        long[] jArr = this.f6968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj2 = objArr[i6];
                            int i7 = iArr[i6];
                            int c4 = vVar.c(obj2);
                            if (c4 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (i7 != vVar.f6970c[c4]) {
                                return false;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    public final void f(int i2, Object obj) {
        int b4 = b(obj);
        if (b4 < 0) {
            b4 = ~b4;
        }
        this.f6969b[b4] = obj;
        this.f6970c[b4] = i2;
    }

    public final int hashCode() {
        Object[] objArr = this.f6969b;
        int[] iArr = this.f6970c;
        long[] jArr = this.f6968a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i5 += Integer.hashCode(iArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i2 = i5;
                    break;
                }
                i4++;
            }
        }
        return i2;
    }

    public final String toString() {
        if (this.f6972e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6969b;
        int[] iArr = this.f6970c;
        long[] jArr = this.f6968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i4 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i2 << 3) + i6;
                            Object obj = objArr[i7];
                            int i8 = iArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i8);
                            i4++;
                            if (i4 < this.f6972e) {
                                sb.append(", ");
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ v() {
        this(6);
    }
}
