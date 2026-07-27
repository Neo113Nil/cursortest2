package i;

import j.AbstractC0705a;
import kotlin.jvm.internal.Intrinsics;
import y2.y;
import z2.C1436t;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6982a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6983b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6984c;

    /* renamed from: d, reason: collision with root package name */
    public int f6985d;

    /* renamed from: e, reason: collision with root package name */
    public int f6986e;

    /* renamed from: f, reason: collision with root package name */
    public int f6987f;

    public y(int i2) {
        this.f6982a = AbstractC0664E.f6891a;
        Object[] objArr = AbstractC0705a.f7121c;
        this.f6983b = objArr;
        this.f6984c = objArr;
        if (i2 >= 0) {
            f(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f6986e = 0;
        long[] jArr = this.f6982a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6982a;
            int i2 = this.f6985d;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        C1436t.k(this.f6984c, 0, this.f6985d);
        C1436t.k(this.f6983b, 0, this.f6985d);
        this.f6987f = AbstractC0664E.c(this.f6985d) - this.f6986e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i2;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6985d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6982a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (Intrinsics.a(this.f6983b[i2], obj)) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i2 >= 0;
    }

    public final int c(int i2) {
        int i4 = this.f6985d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6982a;
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

    public final int d(Object obj) {
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
        int i11 = this.f6985d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr2 = this.f6982a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = (((-i15) >> 63) & (jArr2[i14 + i6] << (64 - i15))) | (jArr2[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (Intrinsics.a(this.f6983b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i17 = 8;
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int c4 = c(i9);
                long j10 = 128;
                long j11 = 255;
                if (this.f6987f != 0 || ((this.f6982a[c4 >> 3] >> ((c4 & 7) << 3)) & 255) == 254) {
                    j4 = j7;
                    i2 = 1;
                } else {
                    int i18 = this.f6985d;
                    if (i18 > 8) {
                        long j12 = this.f6986e;
                        y.a aVar = y2.y.f11688e;
                        if (Long.compareUnsigned(j12 * 32, i18 * 25) <= 0) {
                            long[] jArr3 = this.f6982a;
                            int i19 = this.f6985d;
                            Object[] objArr2 = this.f6983b;
                            Object[] objArr3 = this.f6984c;
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
                                    int c5 = c(i24);
                                    int i25 = i24 & i19;
                                    if (((c5 - i25) & i19) / 8 == ((i20 - i25) & i19) / i17) {
                                        jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | ((r22 & 127) << i23);
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i20++;
                                    } else {
                                        int i26 = i21;
                                        int i27 = c5 >> 3;
                                        long j14 = jArr3[i27];
                                        int i28 = (c5 & 7) << 3;
                                        if (((j14 >> i28) & 255) == 128) {
                                            j5 = j7;
                                            jArr3[i27] = (j14 & (~(255 << i28))) | ((r22 & 127) << i28);
                                            jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | (128 << i23);
                                            objArr2[c5] = objArr2[i20];
                                            objArr2[i20] = null;
                                            objArr3[c5] = objArr3[i20];
                                            objArr3[i20] = null;
                                            str = "<this>";
                                            i5 = i9;
                                            b4 = i20;
                                        } else {
                                            j5 = j7;
                                            i5 = i9;
                                            jArr3[i27] = (j14 & (~(255 << i28))) | ((r22 & 127) << i28);
                                            b4 = i26 == -1 ? AbstractC0664E.b(jArr3, i20 + 1, i19) : i26;
                                            objArr2[b4] = objArr2[c5];
                                            objArr2[c5] = objArr2[i20];
                                            objArr2[i20] = objArr2[b4];
                                            objArr3[b4] = objArr3[c5];
                                            objArr3[c5] = objArr3[i20];
                                            objArr3[i20] = objArr3[b4];
                                            i20--;
                                            str = "<this>";
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, str);
                                        jArr3[jArr3.length - 1] = jArr3[0];
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
                            this.f6987f = AbstractC0664E.c(this.f6985d) - this.f6986e;
                            i4 = i9;
                            i2 = 1;
                            c4 = c(i4);
                        }
                    }
                    j4 = j7;
                    int i29 = 0;
                    int d4 = AbstractC0664E.d(this.f6985d);
                    long[] jArr4 = this.f6982a;
                    Object[] objArr4 = this.f6983b;
                    Object[] objArr5 = this.f6984c;
                    int i30 = this.f6985d;
                    f(d4);
                    long[] jArr5 = this.f6982a;
                    Object[] objArr6 = this.f6983b;
                    Object[] objArr7 = this.f6984c;
                    int i31 = this.f6985d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr4[i32 >> 3] >> ((i32 & 7) << 3)) & j11) < 128) {
                            Object obj3 = objArr4[i32];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : i29) * (-862048943);
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int c6 = c(i33 >>> 7);
                            long j15 = i33 & 127;
                            int i34 = c6 >> 3;
                            int i35 = (c6 & 7) << 3;
                            jArr = jArr4;
                            objArr = objArr4;
                            long j16 = (jArr5[i34] & (~(255 << i35))) | (j15 << i35);
                            jArr5[i34] = j16;
                            jArr5[(((c6 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr6[c6] = obj3;
                            objArr7[c6] = objArr5[i32];
                        } else {
                            jArr = jArr4;
                            objArr = objArr4;
                        }
                        i32++;
                        jArr4 = jArr;
                        objArr4 = objArr;
                        i29 = 0;
                        j11 = 255;
                    }
                    i2 = 1;
                    i4 = i9;
                    c4 = c(i4);
                }
                this.f6986e += i2;
                int i36 = this.f6987f;
                long[] jArr6 = this.f6982a;
                int i37 = c4 >> 3;
                long j17 = jArr6[i37];
                int i38 = (c4 & 7) << 3;
                this.f6987f = i36 - (((j17 >> i38) & 255) == 128 ? i2 : 0);
                int i39 = this.f6985d;
                long j18 = (j17 & (~(255 << i38))) | (j4 << i38);
                jArr6[i37] = j18;
                jArr6[(((c4 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return ~c4;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i6 = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj) {
        int i2;
        int i4 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6985d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f6982a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i7;
                if (Intrinsics.a(this.f6983b[i2], obj)) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i4 += 8;
            i8 = i9 + i4;
        }
        if (i2 >= 0) {
            return this.f6984c[i2];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f6986e != this.f6986e) {
            return false;
        }
        Object[] objArr = this.f6983b;
        Object[] objArr2 = this.f6984c;
        long[] jArr = this.f6982a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj2 = objArr[i6];
                            Object obj3 = objArr2[i6];
                            if (obj3 == null) {
                                if (yVar.e(obj2) != null || !yVar.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(yVar.e(obj2))) {
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
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6985d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6982a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6987f = AbstractC0664E.c(this.f6985d) - this.f6986e;
        this.f6983b = new Object[max];
        this.f6984c = new Object[max];
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
    public final Object g(Object obj) {
        int i2;
        int i4 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6985d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f6982a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j6) >> 3) + i9) & i7;
                if (Intrinsics.a(this.f6983b[i2], obj)) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i4 += 8;
            i8 = i9 + i4;
        }
        if (i2 >= 0) {
            return h(i2);
        }
        return null;
    }

    public final Object h(int i2) {
        this.f6986e--;
        long[] jArr = this.f6982a;
        int i4 = this.f6985d;
        int i5 = i2 >> 3;
        int i6 = (i2 & 7) << 3;
        long j4 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j4;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
        this.f6983b[i2] = null;
        Object[] objArr = this.f6984c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f6983b;
        Object[] objArr2 = this.f6984c;
        long[] jArr = this.f6982a;
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
                            Object obj2 = objArr2[i8];
                            i5 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 < 0) {
            d4 = ~d4;
        }
        this.f6983b[d4] = obj;
        this.f6984c[d4] = obj2;
    }

    public final String toString() {
        if (this.f6986e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6983b;
        Object[] objArr2 = this.f6984c;
        long[] jArr = this.f6982a;
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
                            Object obj2 = objArr2[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i4++;
                            if (i4 < this.f6986e) {
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

    public /* synthetic */ y() {
        this(6);
    }
}
