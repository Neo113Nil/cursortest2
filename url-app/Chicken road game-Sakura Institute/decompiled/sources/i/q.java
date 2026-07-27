package i;

import j.AbstractC0705a;
import kotlin.jvm.internal.Intrinsics;
import y2.y;
import z2.C1436t;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6940a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6941b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6942c;

    /* renamed from: d, reason: collision with root package name */
    public int f6943d;

    /* renamed from: e, reason: collision with root package name */
    public int f6944e;

    /* renamed from: f, reason: collision with root package name */
    public int f6945f;

    public q(int i2) {
        this.f6940a = AbstractC0664E.f6891a;
        this.f6941b = k.f6923a;
        this.f6942c = AbstractC0705a.f7121c;
        if (i2 >= 0) {
            g(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f6944e = 0;
        long[] jArr = this.f6940a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6940a;
            int i2 = this.f6943d;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        C1436t.k(this.f6942c, 0, this.f6943d);
        this.f6945f = AbstractC0664E.c(this.f6943d) - this.f6944e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2) {
        int i4;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6943d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6940a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f6941b[i4] == i2) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i4 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i2) {
        int i4;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6943d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6940a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f6941b[i4] == i2) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i4 >= 0;
    }

    public final int d(int i2) {
        long j4;
        int i4;
        int i5;
        long[] jArr;
        int[] iArr;
        int i6;
        long j5;
        int i7;
        int i8;
        int i9;
        String str;
        int i10 = 1;
        int i11 = -862048943;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f6943d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr2 = this.f6940a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = i17;
            long j6 = (((-i19) >> 63) & (jArr2[i18 + i10] << (64 - i19))) | (jArr2[i18] >>> i19);
            long j7 = i14;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i15;
                if (this.f6941b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            int i21 = 8;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int e4 = e(i13);
                long j10 = 128;
                if (this.f6945f != 0 || ((this.f6940a[e4 >> 3] >> ((e4 & 7) << 3)) & 255) == 254) {
                    j4 = j7;
                    i4 = 1;
                } else {
                    int i22 = this.f6943d;
                    if (i22 > 8) {
                        long j11 = this.f6944e;
                        y.a aVar = y2.y.f11688e;
                        if (Long.compareUnsigned(j11 * 32, i22 * 25) <= 0) {
                            long[] jArr3 = this.f6940a;
                            int i23 = this.f6943d;
                            int[] iArr2 = this.f6941b;
                            Object[] objArr = this.f6942c;
                            AbstractC0664E.a(jArr3, i23);
                            int i24 = 0;
                            int i25 = -1;
                            while (i24 != i23) {
                                int i26 = i24 >> 3;
                                int i27 = (i24 & 7) << 3;
                                long j12 = (jArr3[i26] >> i27) & 255;
                                if (j12 == j10) {
                                    i25 = i24;
                                    i24++;
                                } else if (j12 != 254) {
                                    i24++;
                                } else {
                                    int hashCode2 = Integer.hashCode(iArr2[i24]) * i11;
                                    int i28 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e5 = e(i28);
                                    int i29 = i28 & i23;
                                    if (((e5 - i29) & i23) / 8 == ((i24 - i29) & i23) / i21) {
                                        j5 = j7;
                                        jArr3[i26] = ((r22 & 127) << i27) | (jArr3[i26] & (~(255 << i27)));
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i24++;
                                        i23 = i23;
                                    } else {
                                        int i30 = i23;
                                        j5 = j7;
                                        int i31 = i25;
                                        int i32 = e5 >> 3;
                                        long j13 = jArr3[i32];
                                        int i33 = (e5 & 7) << 3;
                                        if (((j13 >> i33) & 255) == 128) {
                                            i7 = i13;
                                            jArr3[i32] = ((r22 & 127) << i33) | ((~(255 << i33)) & j13);
                                            jArr3[i26] = (jArr3[i26] & (~(255 << i27))) | (128 << i27);
                                            iArr2[e5] = iArr2[i24];
                                            iArr2[i24] = 0;
                                            objArr[e5] = objArr[i24];
                                            objArr[i24] = null;
                                            str = "<this>";
                                            i25 = i24;
                                            i8 = i30;
                                        } else {
                                            i7 = i13;
                                            int i34 = i24;
                                            jArr3[i32] = ((r22 & 127) << i33) | (j13 & (~(255 << i33)));
                                            if (i31 == -1) {
                                                i8 = i30;
                                                i9 = AbstractC0664E.b(jArr3, i34 + 1, i8);
                                            } else {
                                                i8 = i30;
                                                i9 = i31;
                                            }
                                            iArr2[i9] = iArr2[e5];
                                            iArr2[e5] = iArr2[i34];
                                            iArr2[i34] = iArr2[i9];
                                            objArr[i9] = objArr[e5];
                                            objArr[e5] = objArr[i34];
                                            objArr[i34] = objArr[i9];
                                            i24 = i34 - 1;
                                            i25 = i9;
                                            str = "<this>";
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, str);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i24++;
                                        i23 = i8;
                                        i13 = i7;
                                    }
                                    j7 = j5;
                                    i21 = 8;
                                    i11 = -862048943;
                                    j10 = 128;
                                }
                            }
                            j4 = j7;
                            this.f6945f = AbstractC0664E.c(this.f6943d) - this.f6944e;
                            i5 = i13;
                            i4 = 1;
                            e4 = e(i5);
                        }
                    }
                    int i35 = i13;
                    j4 = j7;
                    int d4 = AbstractC0664E.d(this.f6943d);
                    long[] jArr4 = this.f6940a;
                    int[] iArr3 = this.f6941b;
                    Object[] objArr2 = this.f6942c;
                    int i36 = this.f6943d;
                    g(d4);
                    long[] jArr5 = this.f6940a;
                    int[] iArr4 = this.f6941b;
                    Object[] objArr3 = this.f6942c;
                    int i37 = this.f6943d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            int i39 = iArr3[i38];
                            int hashCode3 = Integer.hashCode(i39) * (-862048943);
                            int i40 = hashCode3 ^ (hashCode3 << 16);
                            int e6 = e(i40 >>> 7);
                            i6 = i37;
                            long j14 = i40 & 127;
                            int i41 = e6 >> 3;
                            int i42 = (e6 & 7) << 3;
                            jArr = jArr4;
                            iArr = iArr3;
                            long j15 = (jArr5[i41] & (~(255 << i42))) | (j14 << i42);
                            jArr5[i41] = j15;
                            jArr5[(((e6 - 7) & i6) + (i6 & 7)) >> 3] = j15;
                            iArr4[e6] = i39;
                            objArr3[e6] = objArr2[i38];
                        } else {
                            jArr = jArr4;
                            iArr = iArr3;
                            i6 = i37;
                        }
                        i38++;
                        i37 = i6;
                        jArr4 = jArr;
                        iArr3 = iArr;
                    }
                    i4 = 1;
                    i5 = i35;
                    e4 = e(i5);
                }
                this.f6944e += i4;
                int i43 = this.f6945f;
                long[] jArr6 = this.f6940a;
                int i44 = e4 >> 3;
                long j16 = jArr6[i44];
                int i45 = (e4 & 7) << 3;
                if (((j16 >> i45) & 255) != 128) {
                    i4 = 0;
                }
                this.f6945f = i43 - i4;
                int i46 = this.f6943d;
                long j17 = (j16 & (~(255 << i45))) | (j4 << i45);
                jArr6[i44] = j17;
                jArr6[(((e4 - 7) & i46) + (i46 & 7)) >> 3] = j17;
                return e4;
            }
            i10 = 1;
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i13 = i13;
            i11 = i11;
        }
    }

    public final int e(int i2) {
        int i4 = this.f6943d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6940a;
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f6944e != this.f6944e) {
            return false;
        }
        int[] iArr = this.f6941b;
        Object[] objArr = this.f6942c;
        long[] jArr = this.f6940a;
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
                            int i7 = iArr[i6];
                            Object obj2 = objArr[i6];
                            if (obj2 == null) {
                                if (qVar.f(i7) != null || !qVar.c(i7)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(qVar.f(i7))) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i2) {
        int i4;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6943d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6940a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f6941b[i4] == i2) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (i4 >= 0) {
            return this.f6942c[i4];
        }
        return null;
    }

    public final void g(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6943d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6940a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6945f = AbstractC0664E.c(this.f6943d) - this.f6944e;
        this.f6941b = new int[max];
        this.f6942c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i2) {
        int i4;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f6943d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6940a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = (i6 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i7;
                if (this.f6941b[i4] == i2) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (i4 < 0) {
            return null;
        }
        this.f6944e--;
        long[] jArr2 = this.f6940a;
        int i12 = this.f6943d;
        int i13 = i4 >> 3;
        int i14 = (i4 & 7) << 3;
        long j7 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
        jArr2[i13] = j7;
        jArr2[(((i4 - 7) & i12) + (i12 & 7)) >> 3] = j7;
        Object[] objArr = this.f6942c;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f6941b;
        Object[] objArr = this.f6942c;
        long[] jArr = this.f6940a;
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
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i9);
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

    public final void i(int i2, Object obj) {
        int d4 = d(i2);
        this.f6941b[d4] = i2;
        this.f6942c[d4] = obj;
    }

    public final String toString() {
        if (this.f6944e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f6941b;
        Object[] objArr = this.f6942c;
        long[] jArr = this.f6940a;
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
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f6944e) {
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

    public /* synthetic */ q() {
        this(6);
    }
}
