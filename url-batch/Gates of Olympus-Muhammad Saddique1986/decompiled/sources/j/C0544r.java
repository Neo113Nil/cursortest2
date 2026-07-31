package j;

/* renamed from: j.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6313a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6314b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6315c;

    /* renamed from: d, reason: collision with root package name */
    public int f6316d;

    /* renamed from: e, reason: collision with root package name */
    public int f6317e;

    /* renamed from: f, reason: collision with root package name */
    public int f6318f;

    public final int a(int i3) {
        int i4 = this.f6316d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6313a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3) {
        int i3;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6316d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6313a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (this.f6314b[i3] == j3) {
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i3 >= 0) {
            return this.f6315c[i3];
        }
        return null;
    }

    public final void c(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6316d = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6313a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6318f = AbstractC0522D.c(this.f6316d) - this.f6317e;
        this.f6314b = new long[max];
        this.f6315c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1 = a(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r37.f6318f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (((r37.f6313a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        r1 = r37.f6316d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r1 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (java.lang.Long.compare((r37.f6317e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r1 = r37.f6313a;
        r2 = r37.f6316d;
        r3 = r37.f6314b;
        r4 = r37.f6315c;
        j.AbstractC0522D.a(r1, r2);
        r12 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r15 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        r18 = r15 >> 3;
        r28 = (r15 & 7) << 3;
        r26 = (r1[r18] >> r28) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r26 != r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r26 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        r26 = java.lang.Long.hashCode(r3[r15]) * (-862048943);
        r14 = (r26 ^ (r26 << 16)) >>> 7;
        r29 = a(r14);
        r14 = r14 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        if ((((r29 - r14) & r2) / 8) != (((r15 - r14) & r2) / r7)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r6 = r12;
        r5 = r29 >> 3;
        r13 = r1[r5];
        r19 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013c, code lost:
    
        if (((r13 >> r19) & 255) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013e, code lost:
    
        r1[r5] = (r13 & (~(255 << r19))) | ((r26 & 127) << r19);
        r1[r18] = (r1[r18] & (~(255 << r28))) | (128 << r28);
        r3[r29] = r3[r15];
        r3[r15] = 0;
        r4[r29] = r4[r15];
        r4[r15] = null;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a0, code lost:
    
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r5 = 128;
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
    
        r7 = r15;
        r1[r5] = ((r26 & 127) << r19) | (r13 & (~(255 << r19)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017c, code lost:
    
        if (r6 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017e, code lost:
    
        r12 = j.AbstractC0522D.b(r1, r7 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        r3[r12] = r3[r29];
        r3[r29] = r3[r7];
        r3[r7] = r3[r12];
        r4[r12] = r4[r29];
        r4[r29] = r4[r7];
        r4[r7] = r4[r12];
        r15 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0185, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        r1[r18] = ((r26 & 127) << r28) | (r1[r18] & (~(255 << r28)));
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r5 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d3, code lost:
    
        r36 = r15;
        r15 = r15 + 1;
        r12 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b5, code lost:
    
        r19 = 0;
        r37.f6318f = j.AbstractC0522D.c(r37.f6316d) - r37.f6317e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0253, code lost:
    
        r1 = a(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0257, code lost:
    
        r16 = r1;
        r2 = 1;
        r37.f6317e++;
        r1 = r37.f6318f;
        r3 = r37.f6313a;
        r4 = r16 >> 3;
        r5 = r3[r4];
        r7 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0274, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0277, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0279, code lost:
    
        r37.f6318f = r1 - r2;
        r1 = r37.f6316d;
        r5 = (r5 & (~(255 << r7))) | (r26 << r7);
        r3[r4] = r5;
        r3[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c8, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ce, code lost:
    
        r1 = j.AbstractC0522D.d(r37.f6316d);
        r2 = r37.f6313a;
        r3 = r37.f6314b;
        r4 = r37.f6315c;
        r5 = r37.f6316d;
        c(r1);
        r1 = r37.f6313a;
        r6 = r37.f6314b;
        r7 = r37.f6315c;
        r12 = r37.f6316d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e9, code lost:
    
        if (r13 >= r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fa, code lost:
    
        if (((r2[r13 >> 3] >> ((r13 & 7) << 3)) & r8) >= 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fc, code lost:
    
        r14 = r3[r13];
        r16 = java.lang.Long.hashCode(r14) * (-862048943);
        r16 = r16 ^ (r16 << 16);
        r8 = a(r16 >>> 7);
        r9 = r16 & 127;
        r16 = r2;
        r18 = r3;
        r2 = r9;
        r9 = r8 >> 3;
        r22 = (r8 & 7) << 3;
        r26 = r10;
        r2 = (r2 << r22) | (r1[r9] & (~(255 << r22)));
        r1[r9] = r2;
        r1[(((r8 - 7) & r12) + (r12 & 7)) >> 3] = r2;
        r6[r8] = r14;
        r7[r8] = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
    
        r13 = r13 + 1;
        r2 = r16;
        r3 = r18;
        r10 = r26;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023f, code lost:
    
        r16 = r2;
        r18 = r3;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01cb, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
    
        r26 = r10;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j3, C0548v c0548v) {
        int i3;
        char c2 = 11601;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.f6316d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6313a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j5 = i6;
            int i12 = i9;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i3 = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                if (this.f6314b[i3] == j3) {
                    break loop0;
                } else {
                    j7 &= j7 - 1;
                }
            }
            i9 = i12 + 8;
            i8 = (i8 + i9) & i7;
            i5 = i5;
            c2 = c2;
        }
        this.f6314b[i3] = j3;
        this.f6315c[i3] = c0548v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        r26 = r2;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e2, code lost:
    
        r21 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        int i3;
        Object[] objArr;
        long[] jArr2;
        int i4;
        int i5;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        if (obj == this) {
            return true;
        }
        int i11 = 0;
        if (!(obj instanceof C0544r)) {
            return false;
        }
        C0544r c0544r = (C0544r) obj;
        if (c0544r.f6317e != this.f6317e) {
            return false;
        }
        long[] jArr5 = this.f6314b;
        Object[] objArr3 = this.f6315c;
        long[] jArr6 = this.f6313a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j4 = jArr6[i12];
            int i13 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                while (i11 < i15) {
                    if ((j4 & 255) < 128) {
                        int i16 = (i12 << 3) + i11;
                        long j6 = jArr5[i16];
                        Object obj2 = objArr3[i16];
                        if (obj2 != null) {
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            jArr4 = jArr6;
                            i6 = length;
                            i7 = i12;
                            j3 = -9187201950435737472L;
                            if (!obj2.equals(c0544r.b(j6))) {
                                return false;
                            }
                        } else {
                            if (c0544r.b(j6) != null) {
                                return false;
                            }
                            int hashCode = Long.hashCode(j6) * (-862048943);
                            int i17 = hashCode ^ (hashCode << 16);
                            int i18 = i17 & 127;
                            int i19 = c0544r.f6316d;
                            int i20 = (i17 >>> i13) & i19;
                            int i21 = 0;
                            while (true) {
                                long[] jArr7 = c0544r.f6313a;
                                int i22 = i20 >> 3;
                                jArr3 = jArr5;
                                int i23 = (i20 & 7) << 3;
                                long j7 = jArr7[i22] >>> i23;
                                long j8 = jArr7[i22 + 1] << (64 - i23);
                                objArr2 = objArr3;
                                jArr4 = jArr6;
                                long j9 = j7 | (j8 & ((-i23) >> 63));
                                i6 = length;
                                i7 = i12;
                                long j10 = (i18 * 72340172838076673L) ^ j9;
                                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                                while (true) {
                                    if (j11 == 0) {
                                        break;
                                    }
                                    i10 = (i20 + (Long.numberOfTrailingZeros(j11) >> 3)) & i19;
                                    int i24 = i18;
                                    if (c0544r.f6314b[i10] == j6) {
                                        j3 = -9187201950435737472L;
                                        break;
                                    }
                                    j11 &= j11 - 1;
                                    i18 = i24;
                                }
                                i21 += 8;
                                i20 = (i20 + i21) & i19;
                                length = i6;
                                objArr3 = objArr2;
                                i12 = i7;
                                jArr5 = jArr3;
                                jArr6 = jArr4;
                                i18 = i9;
                            }
                            if (!(i10 >= 0)) {
                                return false;
                            }
                        }
                        i8 = 8;
                    } else {
                        jArr3 = jArr5;
                        objArr2 = objArr3;
                        jArr4 = jArr6;
                        i6 = length;
                        i7 = i12;
                        j3 = j5;
                        i8 = i14;
                    }
                    j4 >>= i8;
                    i11++;
                    i14 = i8;
                    j5 = j3;
                    objArr3 = objArr2;
                    i12 = i7;
                    jArr6 = jArr4;
                    i13 = 7;
                    length = i6;
                    jArr5 = jArr3;
                }
                jArr = jArr5;
                objArr = objArr3;
                jArr2 = jArr6;
                i4 = length;
                int i25 = i12;
                i3 = 0;
                if (i15 != i14) {
                    return true;
                }
                i5 = i25;
            } else {
                jArr = jArr5;
                i3 = i11;
                objArr = objArr3;
                jArr2 = jArr6;
                i4 = length;
                i5 = i12;
            }
            if (i5 == i4) {
                return true;
            }
            i12 = i5 + 1;
            i11 = i3;
            length = i4;
            objArr3 = objArr;
            jArr5 = jArr;
            jArr6 = jArr2;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f6314b;
        Object[] objArr = this.f6315c;
        long[] jArr2 = this.f6313a;
        int length = jArr2.length - 2;
        int i3 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j3) < 128) {
                            int i8 = (i4 << 3) + i7;
                            long j4 = jArr[i8];
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
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

    public final String toString() {
        int i3;
        int i4;
        if (this.f6317e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f6314b;
        Object[] objArr = this.f6315c;
        long[] jArr2 = this.f6313a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j3 = jArr2[i5];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j3) < 128) {
                            int i9 = (i5 << 3) + i8;
                            i4 = i5;
                            long j4 = jArr[i9];
                            Object obj = objArr[i9];
                            sb.append(j4);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i6++;
                            if (i6 < this.f6317e) {
                                sb.append(", ");
                            }
                        } else {
                            i4 = i5;
                        }
                        j3 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    int i10 = i5;
                    if (i7 != 8) {
                        break;
                    }
                    i3 = i10;
                } else {
                    i3 = i5;
                }
                if (i3 == length) {
                    break;
                }
                i5 = i3 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        f2.j.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
