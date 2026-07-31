package j;

import k.AbstractC0522a;

/* renamed from: j.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5226a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5227b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5228c;

    /* renamed from: d, reason: collision with root package name */
    public int f5229d;

    /* renamed from: e, reason: collision with root package name */
    public int f5230e;

    /* renamed from: f, reason: collision with root package name */
    public int f5231f;

    public C0506x(int i3) {
        this.f5226a = AbstractC0478D.f5136a;
        Object[] objArr = AbstractC0522a.f5304c;
        this.f5227b = objArr;
        this.f5228c = objArr;
        if (i3 >= 0) {
            f(AbstractC0478D.f(i3));
        } else {
            AbstractC0522a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f5230e = 0;
        long[] jArr = this.f5226a;
        if (jArr != AbstractC0478D.f5136a) {
            M1.k.d0(jArr);
            long[] jArr2 = this.f5226a;
            int i3 = this.f5229d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        M1.k.c0(this.f5228c, 0, this.f5229d);
        M1.k.c0(this.f5227b, 0, this.f5229d);
        this.f5231f = AbstractC0478D.c(this.f5229d) - this.f5230e;
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
        int i3;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5229d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f5226a;
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
                if (Z1.i.a(this.f5227b[i3], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return i3 >= 0;
    }

    public final int c(int i3) {
        int i4 = this.f5229d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5226a;
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

    public final int d(Object obj) {
        long j3;
        int i3;
        long[] jArr;
        Object[] objArr;
        long j4;
        int i4;
        int i5 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f5229d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f5226a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j6 = i8;
            int i14 = i8;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                if (Z1.i.a(this.f5227b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i15 = 8;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int c3 = c(i7);
                long j9 = 128;
                long j10 = 255;
                if (this.f5231f != 0 || ((this.f5226a[c3 >> 3] >> ((c3 & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                    i3 = 0;
                } else {
                    int i16 = this.f5229d;
                    if (i16 <= 8 || Long.compare((this.f5230e * 32) ^ Long.MIN_VALUE, (i16 * 25) ^ Long.MIN_VALUE) > 0) {
                        j3 = j6;
                        i3 = 0;
                        int d3 = AbstractC0478D.d(this.f5229d);
                        long[] jArr3 = this.f5226a;
                        Object[] objArr2 = this.f5227b;
                        Object[] objArr3 = this.f5228c;
                        int i17 = this.f5229d;
                        f(d3);
                        long[] jArr4 = this.f5226a;
                        Object[] objArr4 = this.f5227b;
                        Object[] objArr5 = this.f5228c;
                        int i18 = this.f5229d;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr3[i19 >> 3] >> ((i19 & 7) << 3)) & j10) < 128) {
                                Object obj2 = objArr2[i19];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i20 = hashCode2 ^ (hashCode2 << 16);
                                int c4 = c(i20 >>> 7);
                                long j11 = i20 & 127;
                                int i21 = c4 >> 3;
                                int i22 = (c4 & 7) << 3;
                                jArr = jArr3;
                                objArr = objArr2;
                                long j12 = (jArr4[i21] & (~(255 << i22))) | (j11 << i22);
                                jArr4[i21] = j12;
                                jArr4[(((c4 - 7) & i18) + (i18 & 7)) >> 3] = j12;
                                objArr4[c4] = obj2;
                                objArr5[c4] = objArr3[i19];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i19++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                            j10 = 255;
                        }
                    } else {
                        long[] jArr5 = this.f5226a;
                        int i23 = this.f5229d;
                        Object[] objArr6 = this.f5227b;
                        Object[] objArr7 = this.f5228c;
                        AbstractC0478D.a(jArr5, i23);
                        int i24 = 0;
                        int i25 = -1;
                        while (i24 != i23) {
                            int i26 = i24 >> 3;
                            int i27 = (i24 & 7) << 3;
                            long j13 = (jArr5[i26] >> i27) & 255;
                            if (j13 == j9) {
                                i25 = i24;
                                i24++;
                            } else if (j13 != 254) {
                                i24++;
                            } else {
                                Object obj3 = objArr6[i24];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i5;
                                int i28 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int c5 = c(i28);
                                int i29 = i28 & i23;
                                if (((c5 - i29) & i23) / 8 == ((i24 - i29) & i23) / i15) {
                                    jArr5[i26] = ((r21 & 127) << i27) | (jArr5[i26] & (~(255 << i27)));
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i24++;
                                    i15 = 8;
                                    i5 = -862048943;
                                } else {
                                    int i30 = i24;
                                    int i31 = c5 >> 3;
                                    long j14 = jArr5[i31];
                                    int i32 = (c5 & 7) << 3;
                                    if (((j14 >> i32) & 255) == j9) {
                                        j4 = j6;
                                        jArr5[i31] = ((r21 & 127) << i32) | (j14 & (~(255 << i32)));
                                        jArr5[i26] = (jArr5[i26] & (~(255 << i27))) | (128 << i27);
                                        objArr6[c5] = objArr6[i30];
                                        objArr6[i30] = null;
                                        objArr7[c5] = objArr7[i30];
                                        objArr7[i30] = null;
                                        i4 = i30;
                                        i25 = i4;
                                    } else {
                                        j4 = j6;
                                        jArr5[i31] = ((r21 & 127) << i32) | (j14 & (~(255 << i32)));
                                        int i33 = i25;
                                        i25 = i33 == -1 ? AbstractC0478D.b(jArr5, i30 + 1, i23) : i33;
                                        objArr6[i25] = objArr6[c5];
                                        objArr6[c5] = objArr6[i30];
                                        objArr6[i30] = objArr6[i25];
                                        objArr7[i25] = objArr7[c5];
                                        objArr7[c5] = objArr7[i30];
                                        objArr7[i30] = objArr7[i25];
                                        i4 = i30 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i24 = i4 + 1;
                                    j6 = j4;
                                    i15 = 8;
                                    i5 = -862048943;
                                    j9 = 128;
                                }
                            }
                        }
                        j3 = j6;
                        i3 = 0;
                        this.f5231f = AbstractC0478D.c(this.f5229d) - this.f5230e;
                    }
                    c3 = c(i7);
                }
                this.f5230e++;
                int i34 = this.f5231f;
                long[] jArr6 = this.f5226a;
                int i35 = c3 >> 3;
                long j15 = jArr6[i35];
                int i36 = (c3 & 7) << 3;
                this.f5231f = i34 - (((j15 >> i36) & 255) != 128 ? i3 : 1);
                int i37 = this.f5229d;
                long j16 = (j15 & (~(255 << i36))) | (j3 << i36);
                jArr6[i35] = j16;
                jArr6[(((c3 - 7) & i37) + (i37 & 7)) >> 3] = j16;
                return ~c3;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i14;
            i5 = -862048943;
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
        int i3;
        int i4 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5229d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f5226a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j5) >> 3) + i9) & i7;
                if (Z1.i.a(this.f5227b[i3], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i4 += 8;
            i8 = i9 + i4;
        }
        if (i3 >= 0) {
            return this.f5228c[i3];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0506x)) {
            return false;
        }
        C0506x c0506x = (C0506x) obj;
        if (c0506x.f5230e != this.f5230e) {
            return false;
        }
        Object[] objArr = this.f5227b;
        Object[] objArr2 = this.f5228c;
        long[] jArr = this.f5226a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj2 = objArr[i6];
                            Object obj3 = objArr2[i6];
                            if (obj3 == null) {
                                if (c0506x.e(obj2) != null || !c0506x.b(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(c0506x.e(obj2))) {
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
            return false;
        }
        return true;
    }

    public final void f(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0478D.e(i3)) : 0;
        this.f5229d = max;
        if (max == 0) {
            jArr = AbstractC0478D.f5136a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            M1.k.d0(jArr);
        }
        this.f5226a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5231f = AbstractC0478D.c(this.f5229d) - this.f5230e;
        this.f5227b = new Object[max];
        this.f5228c = new Object[max];
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
        int i3;
        int i4 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5229d;
        int i8 = i5 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f5226a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j5) >> 3) + i9) & i7;
                if (Z1.i.a(this.f5227b[i3], obj)) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i4 += 8;
            i8 = i9 + i4;
        }
        if (i3 >= 0) {
            return h(i3);
        }
        return null;
    }

    public final Object h(int i3) {
        this.f5230e--;
        long[] jArr = this.f5226a;
        int i4 = this.f5229d;
        int i5 = i3 >> 3;
        int i6 = (i3 & 7) << 3;
        long j3 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j3;
        jArr[(((i3 - 7) & i4) + (i4 & 7)) >> 3] = j3;
        this.f5227b[i3] = null;
        Object[] objArr = this.f5228c;
        Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f5227b;
        Object[] objArr2 = this.f5228c;
        long[] jArr = this.f5226a;
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
                            Object obj2 = objArr2[i8];
                            i5 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 < 0) {
            d3 = ~d3;
        }
        this.f5227b[d3] = obj;
        this.f5228c[d3] = obj2;
    }

    public final String toString() {
        if (this.f5230e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f5227b;
        Object[] objArr2 = this.f5228c;
        long[] jArr = this.f5226a;
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
                            if (i4 < this.f5230e) {
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
        Z1.i.e(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ C0506x() {
        this(6);
    }
}
