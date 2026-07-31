package j;

import k.AbstractC0522a;

/* renamed from: j.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498p {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5184a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5185b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5186c;

    /* renamed from: d, reason: collision with root package name */
    public int f5187d;

    /* renamed from: e, reason: collision with root package name */
    public int f5188e;

    /* renamed from: f, reason: collision with root package name */
    public int f5189f;

    public C0498p(int i3) {
        this.f5184a = AbstractC0478D.f5136a;
        this.f5185b = AbstractC0492j.f5167a;
        this.f5186c = AbstractC0522a.f5304c;
        if (i3 >= 0) {
            g(AbstractC0478D.f(i3));
        } else {
            AbstractC0522a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f5188e = 0;
        long[] jArr = this.f5184a;
        if (jArr != AbstractC0478D.f5136a) {
            M1.k.d0(jArr);
            long[] jArr2 = this.f5184a;
            int i3 = this.f5187d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        M1.k.c0(this.f5186c, 0, this.f5187d);
        this.f5189f = AbstractC0478D.c(this.f5187d) - this.f5188e;
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
    public final boolean b(int i3) {
        int i4;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5187d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f5184a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                if (this.f5185b[i4] == i3) {
                    break loop0;
                }
                j5 &= j5 - 1;
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
    public final boolean c(int i3) {
        int i4;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5187d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f5184a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                if (this.f5185b[i4] == i3) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i4 >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i3) {
        long j3;
        int i4;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        long j4;
        int i5;
        char c3 = 11601;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f5187d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f5184a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j5 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j6 = i8;
            int i14 = i11;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                if (this.f5185b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int e3 = e(i7);
                long j9 = 128;
                long j10 = 255;
                if (this.f5189f == 0) {
                    long j11 = 254;
                    if (((this.f5184a[e3 >> 3] >> ((e3 & 7) << 3)) & 255) != 254) {
                        int i15 = this.f5187d;
                        if (i15 > 8) {
                            i4 = i7;
                            if (Long.compare((this.f5188e * 32) ^ Long.MIN_VALUE, (i15 * 25) ^ Long.MIN_VALUE) <= 0) {
                                long[] jArr3 = this.f5184a;
                                int i16 = this.f5187d;
                                int[] iArr3 = this.f5185b;
                                Object[] objArr = this.f5186c;
                                AbstractC0478D.a(jArr3, i16);
                                int i17 = 0;
                                int i18 = -1;
                                while (i17 != i16) {
                                    int i19 = i17 >> 3;
                                    int i20 = (i17 & 7) << 3;
                                    long j12 = (jArr3[i19] >> i20) & 255;
                                    if (j12 == j9) {
                                        i18 = i17;
                                        i17++;
                                    } else if (j12 != j11) {
                                        i17++;
                                    } else {
                                        int hashCode2 = Integer.hashCode(iArr3[i17]) * (-862048943);
                                        int i21 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                        int e4 = e(i21);
                                        int i22 = i21 & i16;
                                        if (((e4 - i22) & i16) / 8 == ((i17 - i22) & i16) / 8) {
                                            jArr3[i19] = (jArr3[i19] & (~(255 << i20))) | ((r23 & 127) << i20);
                                            jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i17++;
                                        } else {
                                            int i23 = i17;
                                            int i24 = e4 >> 3;
                                            long j13 = jArr3[i24];
                                            int i25 = (e4 & 7) << 3;
                                            if (((j13 >> i25) & 255) == 128) {
                                                j4 = j6;
                                                iArr2 = iArr3;
                                                jArr3[i24] = ((~(255 << i25)) & j13) | ((r23 & 127) << i25);
                                                jArr3[i19] = (jArr3[i19] & (~(255 << i20))) | (128 << i20);
                                                iArr2[e4] = iArr2[i23];
                                                iArr2[i23] = 0;
                                                objArr[e4] = objArr[i23];
                                                objArr[i23] = null;
                                                i18 = i23;
                                                i5 = i16;
                                            } else {
                                                int i26 = i16;
                                                iArr2 = iArr3;
                                                j4 = j6;
                                                jArr3[i24] = ((r23 & 127) << i25) | ((~(255 << i25)) & j13);
                                                int i27 = i18;
                                                if (i27 == -1) {
                                                    i5 = i26;
                                                    i18 = AbstractC0478D.b(jArr3, i23 + 1, i5);
                                                } else {
                                                    i5 = i26;
                                                    i18 = i27;
                                                }
                                                iArr2[i18] = iArr2[e4];
                                                iArr2[e4] = iArr2[i23];
                                                iArr2[i23] = iArr2[i18];
                                                objArr[i18] = objArr[e4];
                                                objArr[e4] = objArr[i23];
                                                objArr[i23] = objArr[i18];
                                                i23--;
                                            }
                                            jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i17 = i23 + 1;
                                            i16 = i5;
                                            j6 = j4;
                                            iArr3 = iArr2;
                                        }
                                        j9 = 128;
                                        j11 = 254;
                                    }
                                }
                                j3 = j6;
                                this.f5189f = AbstractC0478D.c(this.f5187d) - this.f5188e;
                                e3 = e(i4);
                                this.f5188e++;
                                int i28 = this.f5189f;
                                long[] jArr4 = this.f5184a;
                                int i29 = e3 >> 3;
                                long j14 = jArr4[i29];
                                int i30 = (e3 & 7) << 3;
                                this.f5189f = i28 - (((j14 >> i30) & 255) != 128 ? 0 : 1);
                                int i31 = this.f5187d;
                                long j15 = (j14 & (~(255 << i30))) | (j3 << i30);
                                jArr4[i29] = j15;
                                jArr4[(((e3 - 7) & i31) + (i31 & 7)) >> 3] = j15;
                                return e3;
                            }
                        } else {
                            i4 = i7;
                        }
                        j3 = j6;
                        int d3 = AbstractC0478D.d(this.f5187d);
                        long[] jArr5 = this.f5184a;
                        int[] iArr4 = this.f5185b;
                        Object[] objArr2 = this.f5186c;
                        int i32 = this.f5187d;
                        g(d3);
                        long[] jArr6 = this.f5184a;
                        int[] iArr5 = this.f5185b;
                        Object[] objArr3 = this.f5186c;
                        int i33 = this.f5187d;
                        int i34 = 0;
                        while (i34 < i32) {
                            if (((jArr5[i34 >> 3] >> ((i34 & 7) << 3)) & j10) < 128) {
                                int i35 = iArr4[i34];
                                int hashCode3 = Integer.hashCode(i35) * (-862048943);
                                int i36 = hashCode3 ^ (hashCode3 << 16);
                                int e5 = e(i36 >>> 7);
                                long j16 = i36 & 127;
                                int i37 = e5 >> 3;
                                int i38 = (e5 & 7) << 3;
                                jArr = jArr5;
                                iArr = iArr4;
                                long j17 = (jArr6[i37] & (~(255 << i38))) | (j16 << i38);
                                jArr6[i37] = j17;
                                jArr6[(((e5 - 7) & i33) + (i33 & 7)) >> 3] = j17;
                                iArr5[e5] = i35;
                                objArr3[e5] = objArr2[i34];
                            } else {
                                jArr = jArr5;
                                iArr = iArr4;
                            }
                            i34++;
                            jArr5 = jArr;
                            iArr4 = iArr;
                            j10 = 255;
                        }
                        e3 = e(i4);
                        this.f5188e++;
                        int i282 = this.f5189f;
                        long[] jArr42 = this.f5184a;
                        int i292 = e3 >> 3;
                        long j142 = jArr42[i292];
                        int i302 = (e3 & 7) << 3;
                        this.f5189f = i282 - (((j142 >> i302) & 255) != 128 ? 0 : 1);
                        int i312 = this.f5187d;
                        long j152 = (j142 & (~(255 << i302))) | (j3 << i302);
                        jArr42[i292] = j152;
                        jArr42[(((e3 - 7) & i312) + (i312 & 7)) >> 3] = j152;
                        return e3;
                    }
                }
                j3 = j6;
                this.f5188e++;
                int i2822 = this.f5189f;
                long[] jArr422 = this.f5184a;
                int i2922 = e3 >> 3;
                long j1422 = jArr422[i2922];
                int i3022 = (e3 & 7) << 3;
                this.f5189f = i2822 - (((j1422 >> i3022) & 255) != 128 ? 0 : 1);
                int i3122 = this.f5187d;
                long j1522 = (j1422 & (~(255 << i3022))) | (j3 << i3022);
                jArr422[i2922] = j1522;
                jArr422[(((e3 - 7) & i3122) + (i3122 & 7)) >> 3] = j1522;
                return e3;
            }
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            c3 = c3;
        }
    }

    public final int e(int i3) {
        int i4 = this.f5187d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5184a;
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
        if (!(obj instanceof C0498p)) {
            return false;
        }
        C0498p c0498p = (C0498p) obj;
        if (c0498p.f5188e != this.f5188e) {
            return false;
        }
        int[] iArr = this.f5185b;
        Object[] objArr = this.f5186c;
        long[] jArr = this.f5184a;
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
                            int i7 = iArr[i6];
                            Object obj2 = objArr[i6];
                            if (obj2 == null) {
                                if (c0498p.f(i7) != null || !c0498p.c(i7)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(c0498p.f(i7))) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i3) {
        int i4;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5187d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f5184a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                if (this.f5185b[i4] == i3) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (i4 >= 0) {
            return this.f5186c[i4];
        }
        return null;
    }

    public final void g(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0478D.e(i3)) : 0;
        this.f5187d = max;
        if (max == 0) {
            jArr = AbstractC0478D.f5136a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            M1.k.d0(jArr);
        }
        this.f5184a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5189f = AbstractC0478D.c(this.f5187d) - this.f5188e;
        this.f5185b = new int[max];
        this.f5186c = new Object[max];
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
    public final Object h(int i3) {
        int i4;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 & 127;
        int i7 = this.f5187d;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f5184a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j3 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j4 = (i6 * 72340172838076673L) ^ j3;
            long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j5 == 0) {
                    break;
                }
                i4 = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i7;
                if (this.f5185b[i4] == i3) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (i4 < 0) {
            return null;
        }
        this.f5188e--;
        long[] jArr2 = this.f5184a;
        int i12 = this.f5187d;
        int i13 = i4 >> 3;
        int i14 = (i4 & 7) << 3;
        long j6 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
        jArr2[i13] = j6;
        jArr2[(((i4 - 7) & i12) + (i12 & 7)) >> 3] = j6;
        Object[] objArr = this.f5186c;
        Object obj = objArr[i4];
        objArr[i4] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f5185b;
        Object[] objArr = this.f5186c;
        long[] jArr = this.f5184a;
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
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i9);
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

    public final void i(int i3, Object obj) {
        int d3 = d(i3);
        this.f5185b[d3] = i3;
        this.f5186c[d3] = obj;
    }

    public final String toString() {
        if (this.f5188e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f5185b;
        Object[] objArr = this.f5186c;
        long[] jArr = this.f5184a;
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
                            int i8 = iArr[i7];
                            Object obj = objArr[i7];
                            sb.append(i8);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f5188e) {
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

    public /* synthetic */ C0498p() {
        this(6);
    }
}
