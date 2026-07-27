package i;

import G.T0;
import j.AbstractC0705a;
import kotlin.jvm.internal.Intrinsics;
import y2.y;
import z2.C1436t;

/* renamed from: i.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661B {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6884a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6885b;

    /* renamed from: c, reason: collision with root package name */
    public int f6886c;

    /* renamed from: d, reason: collision with root package name */
    public int f6887d;

    /* renamed from: e, reason: collision with root package name */
    public int f6888e;

    public C0661B(int i2) {
        this.f6884a = AbstractC0664E.f6891a;
        this.f6885b = AbstractC0705a.f7121c;
        if (i2 >= 0) {
            f(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i2 = this.f6887d;
        this.f6885b[d(obj)] = obj;
        return this.f6887d != i2;
    }

    public final void b() {
        this.f6887d = 0;
        long[] jArr = this.f6884a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6884a;
            int i2 = this.f6886c;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        C1436t.k(this.f6885b, 0, this.f6886c);
        this.f6888e = AbstractC0664E.c(this.f6886c) - this.f6887d;
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
    public final boolean c(Object obj) {
        int i2;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6886c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6884a;
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
                if (Intrinsics.a(this.f6885b[i2], obj)) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i2 >= 0;
    }

    public final int d(Object obj) {
        long j4;
        int i2;
        int i4;
        long j5;
        int i5;
        String str;
        int i6 = 1;
        int i7 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f6886c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6884a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = (((-i15) >> 63) & (jArr[i14 + i6] << (64 - i15))) | (jArr[i14] >>> i15);
            long j7 = i10;
            int i16 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j9) >> 3)) & i11;
                if (Intrinsics.a(this.f6885b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i17 = 8;
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                int e4 = e(i9);
                long j10 = 128;
                long j11 = 255;
                if (this.f6888e != 0 || ((this.f6884a[e4 >> 3] >> ((e4 & 7) << 3)) & 255) == 254) {
                    j4 = j7;
                    i2 = 1;
                    i4 = 0;
                } else {
                    int i18 = this.f6886c;
                    if (i18 > 8) {
                        long j12 = this.f6887d;
                        y.a aVar = y2.y.f11688e;
                        if (Long.compareUnsigned(j12 * 32, i18 * 25) <= 0) {
                            long[] jArr2 = this.f6884a;
                            int i19 = this.f6886c;
                            Object[] objArr = this.f6885b;
                            AbstractC0664E.a(jArr2, i19);
                            int i20 = 0;
                            int i21 = -1;
                            while (i20 != i19) {
                                int i22 = i20 >> 3;
                                int i23 = (i20 & 7) << 3;
                                long j13 = (jArr2[i22] >> i23) & 255;
                                if (j13 == j10) {
                                    i21 = i20;
                                    i20++;
                                } else if (j13 != 254) {
                                    i20++;
                                } else {
                                    Object obj2 = objArr[i20];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i7;
                                    int i24 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e5 = e(i24);
                                    int i25 = i24 & i19;
                                    if (((e5 - i25) & i19) / 8 == ((i20 - i25) & i19) / i17) {
                                        j5 = j7;
                                        jArr2[i22] = ((r22 & 127) << i23) | (jArr2[i22] & (~(255 << i23)));
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        j5 = j7;
                                        int i26 = e5 >> 3;
                                        long j14 = jArr2[i26];
                                        int i27 = (e5 & 7) << 3;
                                        if (((j14 >> i27) & 255) == 128) {
                                            jArr2[i26] = ((~(255 << i27)) & j14) | ((r22 & 127) << i27);
                                            jArr2[i22] = (jArr2[i22] & (~(255 << i23))) | (128 << i23);
                                            objArr[e5] = objArr[i20];
                                            objArr[i20] = null;
                                            str = "<this>";
                                            i5 = i19;
                                            i21 = i20;
                                        } else {
                                            int i28 = i19;
                                            int i29 = i20;
                                            jArr2[i26] = ((r22 & 127) << i27) | (j14 & (~(255 << i27)));
                                            if (i21 == -1) {
                                                i5 = i28;
                                                i21 = AbstractC0664E.b(jArr2, i29 + 1, i5);
                                            } else {
                                                i5 = i28;
                                            }
                                            objArr[i21] = objArr[e5];
                                            objArr[e5] = objArr[i29];
                                            objArr[i29] = objArr[i21];
                                            i20 = i29 - 1;
                                            str = "<this>";
                                        }
                                        Intrinsics.checkNotNullParameter(jArr2, str);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                        i19 = i5;
                                    }
                                    j7 = j5;
                                    i17 = 8;
                                    j10 = 128;
                                    i7 = -862048943;
                                }
                            }
                            j4 = j7;
                            i4 = 0;
                            this.f6888e = AbstractC0664E.c(this.f6886c) - this.f6887d;
                            i2 = 1;
                            e4 = e(i9);
                        }
                    }
                    j4 = j7;
                    i4 = 0;
                    int d4 = AbstractC0664E.d(this.f6886c);
                    long[] jArr3 = this.f6884a;
                    Object[] objArr2 = this.f6885b;
                    int i30 = this.f6886c;
                    f(d4);
                    long[] jArr4 = this.f6884a;
                    Object[] objArr3 = this.f6885b;
                    int i31 = this.f6886c;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr3[i32 >> 3] >> ((i32 & 7) << 3)) & j11) < 128) {
                            Object obj3 = objArr2[i32];
                            int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                            int i33 = hashCode3 ^ (hashCode3 << 16);
                            int e6 = e(i33 >>> 7);
                            long j15 = i33 & 127;
                            int i34 = e6 >> 3;
                            int i35 = (e6 & 7) << 3;
                            long j16 = (j15 << i35) | (jArr4[i34] & (~(255 << i35)));
                            jArr4[i34] = j16;
                            jArr4[(((e6 - 7) & i31) + (i31 & 7)) >> 3] = j16;
                            objArr3[e6] = obj3;
                        }
                        i32++;
                        j11 = 255;
                    }
                    i2 = 1;
                    e4 = e(i9);
                }
                this.f6887d += i2;
                int i36 = this.f6888e;
                long[] jArr5 = this.f6884a;
                int i37 = e4 >> 3;
                long j17 = jArr5[i37];
                int i38 = (e4 & 7) << 3;
                if (((j17 >> i38) & 255) == 128) {
                    i4 = i2;
                }
                this.f6888e = i36 - i4;
                int i39 = this.f6886c;
                long j18 = (j17 & (~(255 << i38))) | (j4 << i38);
                jArr5[i37] = j18;
                jArr5[(((e4 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                return e4;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i6 = 1;
            i10 = i16;
            i7 = -862048943;
        }
    }

    public final int e(int i2) {
        int i4 = this.f6886c;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6884a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0661B)) {
            return false;
        }
        C0661B c0661b = (C0661B) obj;
        if (c0661b.f6887d != this.f6887d) {
            return false;
        }
        Object[] objArr = this.f6885b;
        long[] jArr = this.f6884a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128 && !c0661b.c(objArr[(i2 << 3) + i5])) {
                            return false;
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

    public final void f(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6886c = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6884a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6888e = AbstractC0664E.c(this.f6886c) - this.f6887d;
        this.f6885b = new Object[max];
    }

    public final boolean g() {
        return this.f6887d == 0;
    }

    public final boolean h() {
        return this.f6887d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f6885b;
        long[] jArr = this.f6884a;
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
                            Object obj = objArr[(i4 << 3) + i7];
                            i5 += obj != null ? obj.hashCode() : 0;
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

    public final void i(C0661B elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.f6885b;
        long[] jArr = elements.f6884a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j4) < 128) {
                        Object obj = objArr[(i2 << 3) + i5];
                        this.f6885b[d(obj)] = obj;
                    }
                    j4 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
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
    public final boolean j(Object obj) {
        int i2;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6886c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6884a;
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
                if (Intrinsics.a(this.f6885b[i2], obj)) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        boolean z4 = i2 >= 0;
        if (z4) {
            k(i2);
        }
        return z4;
    }

    public final void k(int i2) {
        this.f6887d--;
        long[] jArr = this.f6884a;
        int i4 = this.f6886c;
        int i5 = i2 >> 3;
        int i6 = (i2 & 7) << 3;
        long j4 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j4;
        jArr[(((i2 - 7) & i4) + (i4 & 7)) >> 3] = j4;
        this.f6885b[i2] = null;
    }

    public final String toString() {
        int i2;
        T0 t0 = new T0(this, 1);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f6885b;
        long[] jArr = this.f6884a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i4 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            Object obj = objArr[(i4 << 3) + i8];
                            if (i5 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i5 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) t0.invoke(obj));
                            i5++;
                            i2 = 8;
                        } else {
                            i2 = i6;
                        }
                        j4 >>= i2;
                        i8++;
                        i6 = i2;
                    }
                    if (i7 != i6) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0661B() {
        this(6);
    }
}
