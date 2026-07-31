package j;

import k.AbstractC0522a;

/* renamed from: j.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475A {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5129a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5130b;

    /* renamed from: c, reason: collision with root package name */
    public int f5131c;

    /* renamed from: d, reason: collision with root package name */
    public int f5132d;

    /* renamed from: e, reason: collision with root package name */
    public int f5133e;

    public C0475A(int i3) {
        this.f5129a = AbstractC0478D.f5136a;
        this.f5130b = AbstractC0522a.f5304c;
        if (i3 >= 0) {
            f(AbstractC0478D.f(i3));
        } else {
            AbstractC0522a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i3 = this.f5132d;
        this.f5130b[d(obj)] = obj;
        return this.f5132d != i3;
    }

    public final void b() {
        this.f5132d = 0;
        long[] jArr = this.f5129a;
        if (jArr != AbstractC0478D.f5136a) {
            M1.k.d0(jArr);
            long[] jArr2 = this.f5129a;
            int i3 = this.f5131c;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        M1.k.c0(this.f5130b, 0, this.f5131c);
        this.f5133e = AbstractC0478D.c(this.f5131c) - this.f5132d;
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
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5131c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f5129a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (Z1.i.a(this.f5130b[i3], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i3 >= 0;
    }

    public final int d(Object obj) {
        long j3;
        int i3;
        long j4;
        int i4;
        int i5;
        int i6 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i7 = hashCode ^ (hashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f5131c;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f5129a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j5 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j6 = i9;
            int i15 = i9;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j8) >> 3)) & i10;
                if (Z1.i.a(this.f5130b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i16 = 8;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int e3 = e(i8);
                long j9 = 128;
                long j10 = 255;
                if (this.f5133e != 0 || ((this.f5129a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                    i3 = 0;
                } else {
                    int i17 = this.f5131c;
                    if (i17 <= 8 || Long.compare((this.f5132d * 32) ^ Long.MIN_VALUE, (i17 * 25) ^ Long.MIN_VALUE) > 0) {
                        j3 = j6;
                        i3 = 0;
                        int d3 = AbstractC0478D.d(this.f5131c);
                        long[] jArr2 = this.f5129a;
                        Object[] objArr = this.f5130b;
                        int i18 = this.f5131c;
                        f(d3);
                        long[] jArr3 = this.f5129a;
                        Object[] objArr2 = this.f5130b;
                        int i19 = this.f5131c;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr2[i20 >> 3] >> ((i20 & 7) << 3)) & j10) < 128) {
                                Object obj2 = objArr[i20];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i21 = hashCode2 ^ (hashCode2 << 16);
                                int e4 = e(i21 >>> 7);
                                long j11 = i21 & 127;
                                int i22 = e4 >> 3;
                                int i23 = (e4 & 7) << 3;
                                long j12 = (j11 << i23) | (jArr3[i22] & (~(255 << i23)));
                                jArr3[i22] = j12;
                                jArr3[(((e4 - 7) & i19) + (i19 & 7)) >> 3] = j12;
                                objArr2[e4] = obj2;
                            }
                            i20++;
                            j10 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f5129a;
                        int i24 = this.f5131c;
                        Object[] objArr3 = this.f5130b;
                        AbstractC0478D.a(jArr4, i24);
                        int i25 = 0;
                        int i26 = -1;
                        while (i25 != i24) {
                            int i27 = i25 >> 3;
                            int i28 = (i25 & 7) << 3;
                            long j13 = (jArr4[i27] >> i28) & 255;
                            if (j13 == j9) {
                                i26 = i25;
                                i25++;
                            } else if (j13 != 254) {
                                i25++;
                            } else {
                                Object obj3 = objArr3[i25];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i6;
                                int i29 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e5 = e(i29);
                                int i30 = i29 & i24;
                                if (((e5 - i30) & i24) / 8 == ((i25 - i30) & i24) / i16) {
                                    jArr4[i27] = ((r23 & 127) << i28) | (jArr4[i27] & (~(255 << i28)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i25++;
                                } else {
                                    int i31 = i26;
                                    int i32 = e5 >> 3;
                                    long j14 = jArr4[i32];
                                    int i33 = (e5 & 7) << 3;
                                    if (((j14 >> i33) & 255) == 128) {
                                        i5 = i25;
                                        j4 = j6;
                                        jArr4[i32] = (j14 & (~(255 << i33))) | ((r23 & 127) << i33);
                                        jArr4[i27] = (jArr4[i27] & (~(255 << i28))) | (128 << i28);
                                        objArr3[e5] = objArr3[i5];
                                        objArr3[i5] = null;
                                        i4 = i5;
                                    } else {
                                        j4 = j6;
                                        int i34 = i25;
                                        jArr4[i32] = (j14 & (~(255 << i33))) | ((r23 & 127) << i33);
                                        if (i31 == -1) {
                                            i31 = AbstractC0478D.b(jArr4, i34 + 1, i24);
                                        }
                                        objArr3[i31] = objArr3[e5];
                                        objArr3[e5] = objArr3[i34];
                                        objArr3[i34] = objArr3[i31];
                                        i4 = i34 - 1;
                                        i5 = i31;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i25 = i4 + 1;
                                    i26 = i5;
                                    j6 = j4;
                                }
                                i16 = 8;
                                i6 = -862048943;
                                j9 = 128;
                            }
                        }
                        j3 = j6;
                        i3 = 0;
                        this.f5133e = AbstractC0478D.c(this.f5131c) - this.f5132d;
                    }
                    e3 = e(i8);
                }
                this.f5132d++;
                int i35 = this.f5133e;
                long[] jArr5 = this.f5129a;
                int i36 = e3 >> 3;
                long j15 = jArr5[i36];
                int i37 = (e3 & 7) << 3;
                this.f5133e = i35 - (((j15 >> i37) & 255) != 128 ? i3 : 1);
                int i38 = this.f5131c;
                long j16 = (j15 & (~(255 << i37))) | (j3 << i37);
                jArr5[i36] = j16;
                jArr5[(((e3 - 7) & i38) + (i38 & 7)) >> 3] = j16;
                return e3;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
            i9 = i15;
            i6 = -862048943;
        }
    }

    public final int e(int i3) {
        int i4 = this.f5131c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5129a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0475A)) {
            return false;
        }
        C0475A c0475a = (C0475A) obj;
        if (c0475a.f5132d != this.f5132d) {
            return false;
        }
        Object[] objArr = this.f5130b;
        long[] jArr = this.f5129a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0475a.c(objArr[(i3 << 3) + i5])) {
                            return false;
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

    public final void f(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0478D.e(i3)) : 0;
        this.f5131c = max;
        if (max == 0) {
            jArr = AbstractC0478D.f5136a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            M1.k.d0(jArr);
        }
        this.f5129a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5133e = AbstractC0478D.c(this.f5131c) - this.f5132d;
        this.f5130b = new Object[max];
    }

    public final boolean g() {
        return this.f5132d == 0;
    }

    public final boolean h() {
        return this.f5132d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f5130b;
        long[] jArr = this.f5129a;
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
                            Object obj = objArr[(i4 << 3) + i7];
                            i5 += obj != null ? obj.hashCode() : 0;
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

    public final void i(C0475A c0475a) {
        Z1.i.f(c0475a, "elements");
        Object[] objArr = c0475a.f5130b;
        long[] jArr = c0475a.f5129a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j3) < 128) {
                        Object obj = objArr[(i3 << 3) + i5];
                        this.f5130b[d(obj)] = obj;
                    }
                    j3 >>= 8;
                }
                if (i4 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
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
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5131c;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f5129a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (Z1.i.a(this.f5130b[i3], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        boolean z3 = i3 >= 0;
        if (z3) {
            k(i3);
        }
        return z3;
    }

    public final void k(int i3) {
        this.f5132d--;
        long[] jArr = this.f5129a;
        int i4 = this.f5131c;
        int i5 = i3 >> 3;
        int i6 = (i3 & 7) << 3;
        long j3 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j3;
        jArr[(((i3 - 7) & i4) + (i4 & 7)) >> 3] = j3;
        this.f5130b[i3] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f5130b;
        long[] jArr = this.f5129a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            Object obj = objArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i4++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0475A() {
        this(6);
    }
}
