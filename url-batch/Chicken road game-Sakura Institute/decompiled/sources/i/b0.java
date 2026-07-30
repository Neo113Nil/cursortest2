package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4721a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4722b;

    /* renamed from: c, reason: collision with root package name */
    public int f4723c;

    /* renamed from: d, reason: collision with root package name */
    public int f4724d;

    /* renamed from: e, reason: collision with root package name */
    public int f4725e;

    public b0(int i7) {
        this.f4721a = e0.f4736a;
        this.f4722b = j.a.f4968c;
        if (i7 >= 0) {
            f(e0.f(i7));
        } else {
            j.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f4724d;
        this.f4722b[d(obj)] = obj;
        return this.f4724d != i7;
    }

    public final void b() {
        this.f4724d = 0;
        long[] jArr = this.f4721a;
        if (jArr != e0.f4736a) {
            e6.k.d0(jArr);
            long[] jArr2 = this.f4721a;
            int i7 = this.f4723c;
            int i8 = i7 >> 3;
            long j8 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j8)) | j8;
        }
        e6.k.c0(0, this.f4723c, null, this.f4722b);
        this.f4725e = e0.c(this.f4723c) - this.f4724d;
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
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4723c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f4721a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (r6.k.a(this.f4722b[i7], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i7 >= 0;
    }

    public final int d(Object obj) {
        long j8;
        long j9;
        long j10;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        long j11;
        int i7 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f4723c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr3 = this.f4721a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j12 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j13 = i10;
            int i16 = i10;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j15) >> 3)) & i11;
                int i17 = i7;
                if (r6.k.a(this.f4722b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i7 = i17;
            }
            int i18 = i7;
            char c4 = '\b';
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int e9 = e(i9);
                long j16 = 128;
                long j17 = 255;
                if (this.f4725e != 0 || ((this.f4721a[e9 >> 3] >> ((e9 & 7) << 3)) & 255) == 254) {
                    j8 = 128;
                    j9 = 255;
                    j10 = j13;
                } else {
                    int i19 = this.f4723c;
                    if (i19 <= 8 || Long.compare((this.f4724d * 32) ^ Long.MIN_VALUE, (i19 * 25) ^ Long.MIN_VALUE) > 0) {
                        j8 = 128;
                        j9 = 255;
                        j10 = j13;
                        int d8 = e0.d(this.f4723c);
                        long[] jArr4 = this.f4721a;
                        Object[] objArr2 = this.f4722b;
                        int i20 = this.f4723c;
                        f(d8);
                        long[] jArr5 = this.f4721a;
                        Object[] objArr3 = this.f4722b;
                        int i21 = this.f4723c;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr4[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i22];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i18;
                                int i23 = hashCode2 ^ (hashCode2 << 16);
                                int e10 = e(i23 >>> 7);
                                long j18 = i23 & 127;
                                int i24 = e10 >> 3;
                                int i25 = (e10 & 7) << 3;
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j19 = (jArr5[i24] & (~(255 << i25))) | (j18 << i25);
                                jArr[i24] = j19;
                                jArr[(((e10 - 7) & i21) + (i21 & 7)) >> 3] = j19;
                                objArr3[e10] = obj2;
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i22++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f4721a;
                        int i26 = this.f4723c;
                        Object[] objArr4 = this.f4722b;
                        e0.a(jArr6, i26);
                        int i27 = 0;
                        int i28 = -1;
                        while (i27 != i26) {
                            int i29 = i27 >> 3;
                            int i30 = (i27 & 7) << 3;
                            long j20 = (jArr6[i29] >> i30) & j17;
                            if (j20 == j16) {
                                i28 = i27;
                                i27++;
                            } else if (j20 != 254) {
                                i27++;
                            } else {
                                Object obj3 = objArr4[i27];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i18;
                                char c6 = c4;
                                int i31 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e11 = e(i31);
                                int i32 = i31 & i26;
                                long j21 = j16;
                                if (((e11 - i32) & i26) / 8 == ((i27 - i32) & i26) / 8) {
                                    long j22 = j17;
                                    jArr6[i29] = ((r23 & 127) << i30) | (jArr6[i29] & (~(j22 << i30)));
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                    c4 = c6;
                                    j16 = j21;
                                    j17 = j22;
                                } else {
                                    long j23 = j17;
                                    int i33 = e11 >> 3;
                                    long j24 = jArr6[i33];
                                    int i34 = (e11 & 7) << 3;
                                    if (((j24 >> i34) & j23) == j21) {
                                        j11 = j13;
                                        objArr = objArr4;
                                        jArr6[i33] = ((~(j23 << i34)) & j24) | ((r23 & 127) << i34);
                                        jArr6[i29] = (jArr6[i29] & (~(j23 << i30))) | (j21 << i30);
                                        objArr[e11] = objArr[i27];
                                        objArr[i27] = null;
                                        i28 = i27;
                                    } else {
                                        objArr = objArr4;
                                        j11 = j13;
                                        jArr6[i33] = ((r23 & 127) << i34) | (j24 & (~(j23 << i34)));
                                        if (i28 == -1) {
                                            i28 = e0.b(jArr6, i27 + 1, i26);
                                        }
                                        objArr[i28] = objArr[e11];
                                        objArr[e11] = objArr[i27];
                                        objArr[i27] = objArr[i28];
                                        i27--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                    objArr4 = objArr;
                                    c4 = c6;
                                    j16 = j21;
                                    j17 = j23;
                                    j13 = j11;
                                }
                            }
                        }
                        j8 = j16;
                        j9 = j17;
                        j10 = j13;
                        this.f4725e = e0.c(this.f4723c) - this.f4724d;
                    }
                    e9 = e(i9);
                }
                this.f4724d++;
                int i35 = this.f4725e;
                long[] jArr7 = this.f4721a;
                int i36 = e9 >> 3;
                long j25 = jArr7[i36];
                int i37 = (e9 & 7) << 3;
                this.f4725e = i35 - (((j25 >> i37) & j9) == j8 ? 1 : 0);
                int i38 = this.f4723c;
                long j26 = (j25 & (~(j9 << i37))) | (j10 << i37);
                jArr7[i36] = j26;
                jArr7[(((e9 - 7) & i38) + (i38 & 7)) >> 3] = j26;
                return e9;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
            i7 = i18;
        }
    }

    public final int e(int i7) {
        int i8 = this.f4723c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4721a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j8 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (b0Var.f4724d != this.f4724d) {
            return false;
        }
        Object[] objArr = this.f4722b;
        long[] jArr = this.f4721a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128 && !b0Var.c(objArr[(i7 << 3) + i9])) {
                            return false;
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final void f(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4723c = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4721a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4725e = e0.c(this.f4723c) - this.f4724d;
        this.f4722b = new Object[max];
    }

    public final boolean g() {
        return this.f4724d == 0;
    }

    public final boolean h() {
        return this.f4724d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f4722b;
        long[] jArr = this.f4721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        Object obj = objArr[(i7 << 3) + i10];
                        i8 += obj != null ? obj.hashCode() : 0;
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 == length) {
                return i8;
            }
            i7++;
        }
    }

    public final void i(b0 b0Var) {
        r6.k.f(b0Var, "elements");
        Object[] objArr = b0Var.f4722b;
        long[] jArr = b0Var.f4721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j8) < 128) {
                        Object obj = objArr[(i7 << 3) + i9];
                        this.f4722b[d(obj)] = obj;
                    }
                    j8 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
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
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4723c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f4721a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (r6.k.a(this.f4722b[i7], obj)) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        boolean z8 = i7 >= 0;
        if (z8) {
            k(i7);
        }
        return z8;
    }

    public final void k(int i7) {
        this.f4724d--;
        long[] jArr = this.f4721a;
        int i8 = this.f4723c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j8 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j8;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j8;
        this.f4722b[i7] = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f4722b;
        long[] jArr = this.f4721a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            loop0: while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            Object obj = objArr[(i7 << 3) + i10];
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
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ b0() {
        this(6);
    }
}
