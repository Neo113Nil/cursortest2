package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5482a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5483b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5484c;

    /* renamed from: d, reason: collision with root package name */
    public int f5485d;

    /* renamed from: e, reason: collision with root package name */
    public int f5486e;

    /* renamed from: f, reason: collision with root package name */
    public int f5487f;

    public j0(int i) {
        this.f5482a = r0.f5528a;
        Object[] objArr = p.a.f5709c;
        this.f5483b = objArr;
        this.f5484c = objArr;
        if (i >= 0) {
            h(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f5486e = 0;
        long[] jArr = this.f5482a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5482a;
            int i = this.f5485d;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5484c, 0, this.f5485d);
        d6.l.L(this.f5483b, 0, this.f5485d);
        this.f5487f = r0.a(this.f5485d) - this.f5486e;
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
    public final boolean b(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5485d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5482a;
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
                if (q6.i.a(this.f5483b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
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
        int i10 = this.f5485d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5482a;
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
                if (q6.i.a(this.f5483b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f5484c;
        long[] jArr = this.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && q6.i.a(obj, objArr[(i << 3) + i9])) {
                            return true;
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
        return false;
    }

    public final int e(int i) {
        int i8 = this.f5485d;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5482a;
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
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.f5486e != this.f5486e) {
            return false;
        }
        Object[] objArr = this.f5483b;
        Object[] objArr2 = this.f5484c;
        long[] jArr = this.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128) {
                            int i10 = (i << 3) + i9;
                            Object obj2 = objArr[i10];
                            Object obj3 = objArr2[i10];
                            if (obj3 == null) {
                                if (j0Var.g(obj2) != null || !j0Var.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(j0Var.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        long j7;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i;
        Object[] objArr;
        int i8 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f5485d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f5482a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr3[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr3[i15] >>> i16);
            long j11 = i11;
            int i17 = i11;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j13) >> 3)) & i12;
                int i18 = i8;
                if (q6.i.a(this.f5483b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i8 = i18;
            }
            int i19 = i8;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int e8 = e(i10);
                long j14 = 255;
                if (this.f5487f != 0 || ((this.f5482a[e8 >> 3] >> ((e8 & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                } else {
                    int i20 = this.f5485d;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((this.f5486e * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f5482a;
                            int i22 = this.f5485d;
                            Object[] objArr2 = this.f5483b;
                            Object[] objArr3 = this.f5484c;
                            j9 = 128;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j15 = j14;
                                long j16 = jArr4[i24] & (-9187201950435737472L);
                                jArr4[i24] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i24++;
                                i21 = i21;
                                j11 = j11;
                                j14 = j15;
                            }
                            j7 = j14;
                            j8 = j11;
                            int i25 = i21;
                            int O = d6.l.O(jArr4);
                            int i26 = O - 1;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j17 = (jArr4[i28] >> i29) & j7;
                                if (j17 != 128 && j17 == 254) {
                                    Object obj2 = objArr2[i27];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e9 = e(i30);
                                    int i31 = i30 & i22;
                                    if (((e9 - i31) & i22) / i25 == ((i27 - i31) & i22) / i25) {
                                        jArr4[i28] = ((r8 & 127) << i29) | (jArr4[i28] & (~(j7 << i29)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i27++;
                                        i25 = i25;
                                    } else {
                                        int i32 = i25;
                                        int i33 = e9 >> 3;
                                        long j18 = jArr4[i33];
                                        int i34 = (e9 & 7) << 3;
                                        if (((j18 >> i34) & j7) == 128) {
                                            i = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j7 << i34)) & j18) | ((r8 & 127) << i34);
                                            jArr4[i28] = (jArr4[i28] & (~(j7 << i29))) | (128 << i29);
                                            objArr[e9] = objArr[i27];
                                            objArr[i27] = null;
                                            objArr3[e9] = objArr3[i27];
                                            objArr3[i27] = null;
                                        } else {
                                            i = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((r8 & 127) << i34) | ((~(j7 << i34)) & j18);
                                            Object obj3 = objArr[e9];
                                            objArr[e9] = objArr[i27];
                                            objArr[i27] = obj3;
                                            Object obj4 = objArr3[e9];
                                            objArr3[e9] = objArr3[i27];
                                            objArr3[i27] = obj4;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i27++;
                                        i25 = i32;
                                        i22 = i;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f5487f = r0.a(this.f5485d) - this.f5486e;
                            e8 = e(i10);
                        }
                    }
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                    int b8 = r0.b(this.f5485d);
                    long[] jArr5 = this.f5482a;
                    Object[] objArr4 = this.f5483b;
                    Object[] objArr5 = this.f5484c;
                    int i35 = this.f5485d;
                    h(b8);
                    long[] jArr6 = this.f5482a;
                    Object[] objArr6 = this.f5483b;
                    Object[] objArr7 = this.f5484c;
                    int i36 = this.f5485d;
                    int i37 = 0;
                    while (i37 < i35) {
                        if (((jArr5[i37 >> 3] >> ((i37 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i37];
                            int hashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i19;
                            int i38 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i38 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j19 = i38 & 127;
                            int i39 = e10 >> 3;
                            int i40 = (e10 & 7) << 3;
                            long j20 = (jArr[i39] & (~(255 << i40))) | (j19 << i40);
                            jArr[i39] = j20;
                            jArr[(((e10 - 7) & i36) + (i36 & 7)) >> 3] = j20;
                            objArr6[e10] = obj5;
                            objArr7[e10] = objArr5[i37];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i37++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e8 = e(i10);
                }
                this.f5486e++;
                int i41 = this.f5487f;
                long[] jArr7 = this.f5482a;
                int i42 = e8 >> 3;
                long j21 = jArr7[i42];
                int i43 = (e8 & 7) << 3;
                this.f5487f = i41 - (((j21 >> i43) & j7) == j9 ? 1 : 0);
                int i44 = this.f5485d;
                long j22 = (j21 & (~(j7 << i43))) | (j8 << i43);
                jArr7[i42] = j22;
                jArr7[(((e8 - 7) & i44) + (i44 & 7)) >> 3] = j22;
                return ~e8;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = i19;
        }
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
        int i;
        int i8 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5485d;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f5482a;
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
                if (q6.i.a(this.f5483b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i8 += 8;
            i12 = i13 + i8;
        }
        if (i >= 0) {
            return this.f5484c[i];
        }
        return null;
    }

    public final void h(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5485d = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
            int i8 = max >> 3;
            long j7 = 255 << ((max & 7) << 3);
            jArr[i8] = (jArr[i8] & (~j7)) | j7;
        }
        this.f5482a = jArr;
        this.f5487f = r0.a(this.f5485d) - this.f5486e;
        Object[] objArr = p.a.f5709c;
        this.f5483b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f5484c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f5483b;
        Object[] objArr2 = this.f5484c;
        long[] jArr = this.f5482a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        int i11 = (i << 3) + i10;
                        Object obj = objArr[i11];
                        Object obj2 = objArr2[i11];
                        i8 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j7 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i == length) {
                return i8;
            }
            i++;
        }
    }

    public final boolean i() {
        return this.f5486e == 0;
    }

    public final boolean j() {
        return this.f5486e != 0;
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
    public final Object k(Object obj) {
        int i;
        int i8 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5485d;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f5482a;
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
                if (q6.i.a(this.f5483b[i], obj)) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i8 += 8;
            i12 = i13 + i8;
        }
        if (i >= 0) {
            return l(i);
        }
        return null;
    }

    public final Object l(int i) {
        this.f5486e--;
        long[] jArr = this.f5482a;
        int i8 = this.f5485d;
        int i9 = i >> 3;
        int i10 = (i & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f5483b[i] = null;
        Object[] objArr = this.f5484c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int f6 = f(obj);
        if (f6 < 0) {
            f6 = ~f6;
        }
        this.f5483b[f6] = obj;
        this.f5484c[f6] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f5483b;
        Object[] objArr2 = this.f5484c;
        long[] jArr = this.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i8 = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = (i << 3) + i10;
                            Object obj = objArr[i11];
                            Object obj2 = objArr2[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i8++;
                            if (i8 < this.f5486e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ j0() {
        this(6);
    }
}
