package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4770a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4771b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4772c;

    /* renamed from: d, reason: collision with root package name */
    public int f4773d;

    /* renamed from: e, reason: collision with root package name */
    public int f4774e;

    /* renamed from: f, reason: collision with root package name */
    public int f4775f;

    public p(int i7) {
        this.f4770a = e0.f4736a;
        this.f4771b = j.f4753a;
        this.f4772c = j.a.f4968c;
        if (i7 >= 0) {
            g(e0.f(i7));
        } else {
            j.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f4774e = 0;
        long[] jArr = this.f4770a;
        if (jArr != e0.f4736a) {
            e6.k.d0(jArr);
            long[] jArr2 = this.f4770a;
            int i7 = this.f4773d;
            int i8 = i7 >> 3;
            long j8 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j8)) | j8;
        }
        e6.k.c0(0, this.f4773d, null, this.f4772c);
        this.f4775f = e0.c(this.f4773d) - this.f4774e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i7) {
        int i8;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f4773d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f4770a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f4771b[i8] == i7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return i8 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i7) {
        int i8;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f4773d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f4770a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f4771b[i8] == i7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return i8 >= 0;
    }

    public final int d(int i7) {
        long j8;
        int i8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i9;
        int[] iArr;
        int i10 = -862048943;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f4773d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f4770a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            int i21 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                int i22 = i10;
                int i23 = i21;
                if (this.f4771b[numberOfTrailingZeros] == i7) {
                    return numberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i10 = i22;
                i21 = i23;
            }
            int i24 = i10;
            int i25 = i21;
            char c4 = '\b';
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int e9 = e(i12);
                long j14 = 255;
                if (this.f4775f != 0 || ((this.f4770a[e9 >> 3] >> ((e9 & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    i8 = 1;
                    j9 = 128;
                } else {
                    int i26 = this.f4773d;
                    if (i26 <= 8 || Long.compare((this.f4774e * 32) ^ Long.MIN_VALUE, (i26 * 25) ^ Long.MIN_VALUE) > 0) {
                        j8 = 255;
                        i8 = 1;
                        j9 = 128;
                        int d8 = e0.d(this.f4773d);
                        long[] jArr4 = this.f4770a;
                        int[] iArr2 = this.f4771b;
                        Object[] objArr = this.f4772c;
                        int i27 = this.f4773d;
                        g(d8);
                        long[] jArr5 = this.f4770a;
                        int[] iArr3 = this.f4771b;
                        Object[] objArr2 = this.f4772c;
                        int i28 = this.f4773d;
                        int i29 = i25;
                        while (i29 < i27) {
                            if (((jArr4[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                int i30 = iArr2[i29];
                                int hashCode2 = Integer.hashCode(i30) * i24;
                                int i31 = hashCode2 ^ (hashCode2 << 16);
                                int e10 = e(i31 >>> 7);
                                jArr = jArr5;
                                jArr2 = jArr4;
                                long j15 = i31 & 127;
                                int i32 = e10 >> 3;
                                int i33 = (e10 & 7) << 3;
                                long j16 = (jArr[i32] & (~(255 << i33))) | (j15 << i33);
                                jArr[i32] = j16;
                                jArr[(((e10 - 7) & i28) + (i28 & 7)) >> 3] = j16;
                                iArr3[e10] = i30;
                                objArr2[e10] = objArr[i29];
                            } else {
                                jArr = jArr5;
                                jArr2 = jArr4;
                            }
                            i29++;
                            jArr4 = jArr2;
                            jArr5 = jArr;
                        }
                    } else {
                        long[] jArr6 = this.f4770a;
                        int i34 = this.f4773d;
                        int[] iArr4 = this.f4771b;
                        Object[] objArr3 = this.f4772c;
                        e0.a(jArr6, i34);
                        int i35 = i25;
                        int i36 = -1;
                        j9 = 128;
                        while (i35 != i34) {
                            int i37 = i35 >> 3;
                            int i38 = (i35 & 7) << 3;
                            long j17 = (jArr6[i37] >> i38) & j14;
                            if (j17 == 128) {
                                int i39 = i35;
                                i35++;
                                i36 = i39;
                            } else if (j17 != 254) {
                                i35++;
                            } else {
                                int hashCode3 = Integer.hashCode(iArr4[i35]) * i24;
                                char c6 = c4;
                                int i40 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e11 = e(i40);
                                int i41 = i40 & i34;
                                long j18 = j14;
                                if (((e11 - i41) & i34) / 8 == ((i35 - i41) & i34) / 8) {
                                    int i42 = i19;
                                    jArr6[i37] = ((r25 & 127) << i38) | (jArr6[i37] & (~(j18 << i38)));
                                    jArr6[jArr6.length - i42] = (jArr6[i25] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35++;
                                    i19 = i42;
                                    c4 = c6;
                                    j14 = j18;
                                } else {
                                    int i43 = i19;
                                    int i44 = e11 >> 3;
                                    long j19 = jArr6[i44];
                                    int i45 = (e11 & 7) << 3;
                                    if (((j19 >> i45) & j18) == 128) {
                                        i9 = i43;
                                        iArr = iArr4;
                                        jArr6[i44] = ((~(j18 << i45)) & j19) | ((r25 & 127) << i45);
                                        jArr6[i37] = (jArr6[i37] & (~(j18 << i38))) | (128 << i38);
                                        iArr[e11] = iArr[i35];
                                        iArr[i35] = i25;
                                        objArr3[e11] = objArr3[i35];
                                        objArr3[i35] = null;
                                        i36 = i35;
                                    } else {
                                        i9 = i43;
                                        iArr = iArr4;
                                        jArr6[i44] = ((~(j18 << i45)) & j19) | ((r25 & 127) << i45);
                                        if (i36 == -1) {
                                            i36 = e0.b(jArr6, i35 + 1, i34);
                                        }
                                        iArr[i36] = iArr[e11];
                                        iArr[e11] = iArr[i35];
                                        iArr[i35] = iArr[i36];
                                        objArr3[i36] = objArr3[e11];
                                        objArr3[e11] = objArr3[i35];
                                        objArr3[i35] = objArr3[i36];
                                        i35--;
                                    }
                                    jArr6[jArr6.length - 1] = (jArr6[i25] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35++;
                                    c4 = c6;
                                    iArr4 = iArr;
                                    j14 = j18;
                                    i19 = i9;
                                }
                            }
                        }
                        j8 = j14;
                        i8 = i19;
                        this.f4775f = e0.c(this.f4773d) - this.f4774e;
                    }
                    e9 = e(i12);
                }
                this.f4774e++;
                int i46 = this.f4775f;
                long[] jArr7 = this.f4770a;
                int i47 = e9 >> 3;
                long j20 = jArr7[i47];
                int i48 = (e9 & 7) << 3;
                if (((j20 >> i48) & j8) != j9) {
                    i8 = i25;
                }
                this.f4775f = i46 - i8;
                int i49 = this.f4773d;
                long j21 = (j20 & (~(j8 << i48))) | (j11 << i48);
                jArr7[i47] = j21;
                jArr7[(((e9 - 7) & i49) + (i49 & 7)) >> 3] = j21;
                return e9;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i10 = i24;
        }
    }

    public final int e(int i7) {
        int i8 = this.f4773d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4770a;
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.f4774e != this.f4774e) {
            return false;
        }
        int[] iArr = this.f4771b;
        Object[] objArr = this.f4772c;
        long[] jArr = this.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            loop0: while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            int i10 = (i7 << 3) + i9;
                            int i11 = iArr[i10];
                            Object obj2 = objArr[i10];
                            if (obj2 == null) {
                                if (pVar.f(i11) != null || !pVar.c(i11)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(pVar.f(i11))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i7) {
        int i8;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f4773d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f4770a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f4771b[i8] == i7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 >= 0) {
            return this.f4772c[i8];
        }
        return null;
    }

    public final void g(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4773d = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4770a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4775f = e0.c(this.f4773d) - this.f4774e;
        this.f4771b = new int[max];
        this.f4772c = new Object[max];
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
    public final Object h(int i7) {
        int i8;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f4773d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f4770a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (i10 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f4771b[i8] == i7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 < 0) {
            return null;
        }
        this.f4774e--;
        long[] jArr2 = this.f4770a;
        int i16 = this.f4773d;
        int i17 = i8 >> 3;
        int i18 = (i8 & 7) << 3;
        long j11 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
        jArr2[i17] = j11;
        jArr2[(((i8 - 7) & i16) + (i16 & 7)) >> 3] = j11;
        Object[] objArr = this.f4772c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f4771b;
        Object[] objArr = this.f4772c;
        long[] jArr = this.f4770a;
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
                        int i11 = (i7 << 3) + i10;
                        int i12 = iArr[i11];
                        Object obj = objArr[i11];
                        i8 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i12);
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

    public final void i(int i7, Object obj) {
        int d8 = d(i7);
        this.f4771b[d8] = i7;
        this.f4772c[d8] = obj;
    }

    public final String toString() {
        if (this.f4774e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f4771b;
        Object[] objArr = this.f4772c;
        long[] jArr = this.f4770a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr[i11];
                            Object obj = objArr[i11];
                            sb.append(i12);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i8++;
                            if (i8 < this.f4774e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "s.append('}').toString()");
        return sb2;
    }

    public /* synthetic */ p() {
        this(6);
    }
}
