package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5489a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5490b;

    /* renamed from: c, reason: collision with root package name */
    public int f5491c;

    /* renamed from: d, reason: collision with root package name */
    public int f5492d;

    /* renamed from: e, reason: collision with root package name */
    public int f5493e;

    public k0(int i) {
        this.f5489a = r0.f5528a;
        this.f5490b = p.a.f5709c;
        if (i >= 0) {
            f(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f5492d;
        this.f5490b[d(obj)] = obj;
        return this.f5492d != i;
    }

    public final void b() {
        this.f5492d = 0;
        long[] jArr = this.f5489a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5489a;
            int i = this.f5491c;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5490b, 0, this.f5491c);
        this.f5493e = r0.a(this.f5491c) - this.f5492d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5491c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5489a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (q6.i.a(this.f5490b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
    }

    public final int d(Object obj) {
        long j7;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i8;
        int i9 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f5491c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr3 = this.f5489a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr3[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr3[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                int i19 = i9;
                if (q6.i.a(this.f5490b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i9 = i19;
            }
            int i20 = i9;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int e8 = e(i11);
                long j14 = 255;
                if (this.f5493e != 0 || ((this.f5489a[e8 >> 3] >> ((e8 & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                } else {
                    int i21 = this.f5491c;
                    if (i21 > 8) {
                        int i22 = 8;
                        if (Long.compare((this.f5492d * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f5489a;
                            int i23 = this.f5491c;
                            Object[] objArr2 = this.f5490b;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            j9 = 128;
                            while (i25 < i24) {
                                long j15 = j14;
                                long j16 = jArr4[i25] & (-9187201950435737472L);
                                jArr4[i25] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i25++;
                                i22 = i22;
                                j11 = j11;
                                j14 = j15;
                            }
                            j7 = j14;
                            j8 = j11;
                            int i26 = i22;
                            int O = d6.l.O(jArr4);
                            int i27 = O - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i28 = 0;
                            while (i28 != i23) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j18 = (jArr4[i29] >> i30) & j7;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i28];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                    int i31 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9 = e(i31);
                                    int i32 = i31 & i23;
                                    if (((e9 - i32) & i23) / i26 == ((i28 - i32) & i23) / i26) {
                                        long j19 = j17;
                                        jArr4[i29] = ((r7 & 127) << i30) | ((~(j7 << i30)) & jArr4[i29]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i28++;
                                        j17 = j19;
                                    } else {
                                        long j20 = j17;
                                        int i33 = e9 >> 3;
                                        long j21 = jArr4[i33];
                                        int i34 = (e9 & 7) << 3;
                                        if (((j21 >> i34) & j7) == 128) {
                                            i8 = i26;
                                            i = i23;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j7 << i34)) & j21) | ((r7 & 127) << i34);
                                            jArr4[i29] = (jArr4[i29] & (~(j7 << i30))) | (128 << i30);
                                            objArr[e9] = objArr[i28];
                                            objArr[i28] = null;
                                        } else {
                                            i = i23;
                                            objArr = objArr2;
                                            i8 = i26;
                                            jArr4[i33] = ((r7 & 127) << i34) | ((~(j7 << i34)) & j21);
                                            Object obj3 = objArr[e9];
                                            objArr[e9] = objArr[i28];
                                            objArr[i28] = obj3;
                                            i28--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i28++;
                                        j17 = j20;
                                        i26 = i8;
                                        i23 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i28++;
                                }
                            }
                            this.f5493e = r0.a(this.f5491c) - this.f5492d;
                            e8 = e(i11);
                        }
                    }
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                    int b8 = r0.b(this.f5491c);
                    long[] jArr5 = this.f5489a;
                    Object[] objArr3 = this.f5490b;
                    int i35 = this.f5491c;
                    f(b8);
                    long[] jArr6 = this.f5489a;
                    Object[] objArr4 = this.f5490b;
                    int i36 = this.f5491c;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i37];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i20;
                            int i38 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i38 >>> 7);
                            long j22 = i38 & 127;
                            int i39 = e10 >> 3;
                            int i40 = (e10 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = (jArr6[i39] & (~(255 << i40))) | (j22 << i40);
                            jArr[i39] = j23;
                            jArr[(((e10 - 7) & i36) + (i36 & 7)) >> 3] = j23;
                            objArr4[e10] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e8 = e(i11);
                }
                this.f5492d++;
                int i41 = this.f5493e;
                long[] jArr7 = this.f5489a;
                int i42 = e8 >> 3;
                long j24 = jArr7[i42];
                int i43 = (e8 & 7) << 3;
                this.f5493e = i41 - (((j24 >> i43) & j7) == j9 ? 1 : 0);
                int i44 = this.f5491c;
                long j25 = (j24 & (~(j7 << i43))) | (j8 << i43);
                jArr7[i42] = j25;
                jArr7[(((e8 - 7) & i44) + (i44 & 7)) >> 3] = j25;
                return e8;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
            i9 = i20;
        }
    }

    public final int e(int i) {
        int i8 = this.f5491c;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5489a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j7 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j8 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j8) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (k0Var.f5492d != this.f5492d) {
            return false;
        }
        Object[] objArr = this.f5490b;
        long[] jArr = this.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && !k0Var.c(objArr[(i << 3) + i9])) {
                            return false;
                        }
                        j7 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5491c = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5489a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5493e = r0.a(this.f5491c) - this.f5492d;
        this.f5490b = max == 0 ? p.a.f5709c : new Object[max];
    }

    public final boolean g() {
        return this.f5492d == 0;
    }

    public final boolean h() {
        return this.f5492d != 0;
    }

    public final int hashCode() {
        int i = (this.f5491c * 31) + this.f5492d;
        Object[] objArr = this.f5490b;
        long[] jArr = this.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            Object obj = objArr[(i8 << 3) + i10];
                            if (!q6.i.a(obj, this)) {
                                i += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        return i;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj) {
        int i;
        int i8 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5491c;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f5489a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j7 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j8 = (i10 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j9) >> 3) + i13) & i11;
                if (q6.i.a(this.f5490b[i], obj)) {
                    break loop0;
                } else {
                    j9 &= j9 - 1;
                }
            }
            i8 += 8;
            i12 = i13 + i8;
        }
        if (i >= 0) {
            m(i);
        }
    }

    public final void j(Object obj) {
        this.f5490b[d(obj)] = obj;
    }

    public final void k(k0 k0Var) {
        q6.i.e(k0Var, "elements");
        Object[] objArr = k0Var.f5490b;
        long[] jArr = k0Var.f5489a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        j(objArr[(i << 3) + i9]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
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
    public final boolean l(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5491c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5489a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j9) >> 3) + i11) & i10;
                if (q6.i.a(this.f5490b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        boolean z3 = i >= 0;
        if (z3) {
            m(i);
        }
        return z3;
    }

    public final void m(int i) {
        this.f5492d--;
        long[] jArr = this.f5489a;
        int i8 = this.f5491c;
        int i9 = i >> 3;
        int i10 = (i & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f5490b[i] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f5490b;
        long[] jArr = this.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i8 = 0;
            loop0: while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            Object obj = objArr[(i << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
                            i8++;
                        }
                        j7 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ k0() {
        this(6);
    }
}
