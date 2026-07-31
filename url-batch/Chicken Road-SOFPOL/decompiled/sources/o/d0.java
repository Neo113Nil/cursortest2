package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5434a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5435b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5436c;

    /* renamed from: d, reason: collision with root package name */
    public int f5437d;

    /* renamed from: e, reason: collision with root package name */
    public int f5438e;

    /* renamed from: f, reason: collision with root package name */
    public int f5439f;

    public d0(int i) {
        this.f5434a = r0.f5528a;
        this.f5435b = p.a.f5709c;
        this.f5436c = n.f5513a;
        if (i >= 0) {
            f(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f5438e = 0;
        long[] jArr = this.f5434a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5434a;
            int i = this.f5437d;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5435b, 0, this.f5437d);
        this.f5439f = r0.a(this.f5437d) - this.f5438e;
    }

    public final int b(int i) {
        int i8 = this.f5437d;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5434a;
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

    public final int c(Object obj) {
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
        int i12 = this.f5437d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr3 = this.f5434a;
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
                if (q6.i.a(this.f5435b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i8 = i18;
            }
            int i19 = i8;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int b8 = b(i10);
                long j14 = 255;
                if (this.f5439f != 0 || ((this.f5434a[b8 >> 3] >> ((b8 & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                } else {
                    int i20 = this.f5437d;
                    if (i20 > 8) {
                        int i21 = 8;
                        if (Long.compare((this.f5438e * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f5434a;
                            int i22 = this.f5437d;
                            Object[] objArr2 = this.f5435b;
                            int[] iArr = this.f5436c;
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
                            long j17 = 72057594037927935L;
                            jArr4[i26] = (jArr4[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[O] = jArr4[0];
                            int i27 = 0;
                            while (i27 != i22) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j18 = (jArr4[i28] >> i29) & j7;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i27];
                                    int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i19;
                                    int i30 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int b9 = b(i30);
                                    int i31 = i30 & i22;
                                    long j19 = j17;
                                    if (((b9 - i31) & i22) / 8 == ((i27 - i31) & i22) / i25) {
                                        jArr4[i28] = ((r8 & 127) << i29) | (jArr4[i28] & (~(j7 << i29)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i27++;
                                        j17 = j19;
                                        i25 = i25;
                                    } else {
                                        int i32 = i25;
                                        int i33 = b9 >> 3;
                                        long j20 = jArr4[i33];
                                        int i34 = (b9 & 7) << 3;
                                        if (((j20 >> i34) & j7) == 128) {
                                            i = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((~(j7 << i34)) & j20) | ((r8 & 127) << i34);
                                            jArr4[i28] = (jArr4[i28] & (~(j7 << i29))) | (128 << i29);
                                            objArr[b9] = objArr[i27];
                                            objArr[i27] = null;
                                            iArr[b9] = iArr[i27];
                                            iArr[i27] = 0;
                                        } else {
                                            i = i22;
                                            objArr = objArr2;
                                            jArr4[i33] = ((r8 & 127) << i34) | ((~(j7 << i34)) & j20);
                                            Object obj3 = objArr[b9];
                                            objArr[b9] = objArr[i27];
                                            objArr[i27] = obj3;
                                            int i35 = iArr[b9];
                                            iArr[b9] = iArr[i27];
                                            iArr[i27] = i35;
                                            i27--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i27++;
                                        i22 = i;
                                        j17 = j19;
                                        i25 = i32;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            this.f5439f = r0.a(this.f5437d) - this.f5438e;
                            b8 = b(i10);
                        }
                    }
                    j7 = 255;
                    j8 = j11;
                    j9 = 128;
                    int b10 = r0.b(this.f5437d);
                    long[] jArr5 = this.f5434a;
                    Object[] objArr3 = this.f5435b;
                    int[] iArr2 = this.f5436c;
                    int i36 = this.f5437d;
                    f(b10);
                    long[] jArr6 = this.f5434a;
                    Object[] objArr4 = this.f5435b;
                    int[] iArr3 = this.f5436c;
                    int i37 = this.f5437d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr5[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i38];
                            int hashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i19;
                            int i39 = hashCode3 ^ (hashCode3 << 16);
                            int b11 = b(i39 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i39 & 127;
                            int i40 = b11 >> 3;
                            int i41 = (b11 & 7) << 3;
                            long j22 = (jArr[i40] & (~(255 << i41))) | (j21 << i41);
                            jArr[i40] = j22;
                            jArr[(((b11 - 7) & i37) + (i37 & 7)) >> 3] = j22;
                            objArr4[b11] = obj4;
                            iArr3[b11] = iArr2[i38];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i38++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b8 = b(i10);
                }
                this.f5438e++;
                int i42 = this.f5439f;
                long[] jArr7 = this.f5434a;
                int i43 = b8 >> 3;
                long j23 = jArr7[i43];
                int i44 = (b8 & 7) << 3;
                this.f5439f = i42 - (((j23 >> i44) & j7) == j9 ? 1 : 0);
                int i45 = this.f5437d;
                long j24 = (j23 & (~(j7 << i44))) | (j8 << i44);
                jArr7[i43] = j24;
                jArr7[(((b8 - 7) & i45) + (i45 & 7)) >> 3] = j24;
                return ~b8;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
            i8 = i19;
        }
    }

    public final int d(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5437d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f5434a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j7 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = (i9 * 72340172838076673L) ^ j7;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i10;
                if (q6.i.a(this.f5435b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i11 = i12 + i;
        }
    }

    public final int e(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f5436c[d8];
        }
        p.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z7;
        boolean z8 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (d0Var.f5438e != this.f5438e) {
            return false;
        }
        Object[] objArr = this.f5435b;
        int[] iArr = this.f5436c;
        long[] jArr = this.f5434a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        Object obj2 = objArr[i10];
                        int i11 = iArr[i10];
                        int d8 = d0Var.d(obj2);
                        if (d8 < 0) {
                            break loop0;
                        }
                        z7 = z8;
                        if (i11 != d0Var.f5436c[d8]) {
                            break loop0;
                        }
                    } else {
                        z7 = z8;
                    }
                    j7 >>= 8;
                    i9++;
                    z8 = z7;
                }
                z3 = z8;
                if (i8 != 8) {
                    return z3;
                }
            } else {
                z3 = z8;
            }
            if (i == length) {
                return z3;
            }
            i++;
            z8 = z3;
        }
        return false;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5437d = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5434a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5439f = r0.a(this.f5437d) - this.f5438e;
        this.f5435b = new Object[max];
        this.f5436c = new int[max];
    }

    public final void g(int i) {
        this.f5438e--;
        long[] jArr = this.f5434a;
        int i8 = this.f5437d;
        int i9 = i >> 3;
        int i10 = (i & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i - 7) & i8) + (i8 & 7)) >> 3] = j7;
        this.f5435b[i] = null;
    }

    public final void h(int i, Object obj) {
        int c8 = c(obj);
        if (c8 < 0) {
            c8 = ~c8;
        }
        this.f5435b[c8] = obj;
        this.f5436c[c8] = i;
    }

    public final int hashCode() {
        Object[] objArr = this.f5435b;
        int[] iArr = this.f5436c;
        long[] jArr = this.f5434a;
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
                        i8 += Integer.hashCode(iArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
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

    public final String toString() {
        if (this.f5438e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f5435b;
        int[] iArr = this.f5436c;
        long[] jArr = this.f5434a;
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
                            int i12 = iArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i12);
                            i8++;
                            if (i8 < this.f5438e) {
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

    public /* synthetic */ d0() {
        this(6);
    }
}
