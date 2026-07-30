package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4781a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f4782b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4783c;

    /* renamed from: d, reason: collision with root package name */
    public int f4784d;

    /* renamed from: e, reason: collision with root package name */
    public int f4785e;

    /* renamed from: f, reason: collision with root package name */
    public int f4786f;

    public final int a(int i7) {
        int i8 = this.f4784d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4781a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j8) {
        int i7;
        int hashCode = Long.hashCode(j8) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4784d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f4781a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (i9 * 72340172838076673L) ^ j9;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.f4782b[i7] == j8) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        if (i7 >= 0) {
            return this.f4783c[i7];
        }
        return null;
    }

    public final void c(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4784d = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4781a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4786f = e0.c(this.f4784d) - this.f4785e;
        this.f4782b = new long[max];
        this.f4783c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
        r6 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = a(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r39.f4786f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (((r39.f4781a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
    
        r1 = r39.f4784d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if (r1 <= 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (java.lang.Long.compare((r39.f4785e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        r1 = r39.f4781a;
        r2 = r39.f4784d;
        r9 = r39.f4782b;
        r14 = r39.f4783c;
        i.e0.a(r1, r2);
        r4 = 0;
        r5 = -1;
        r24 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r4 == r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r18 = r4 >> 3;
        r28 = (r4 & 7) << 3;
        r26 = (r1[r18] >> r28) & r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        if (r26 != 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r26 == 254) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        r26 = java.lang.Long.hashCode(r9[r4]) * r19;
        r27 = r6;
        r6 = (r26 ^ (r26 << 16)) >>> 7;
        r29 = a(r6);
        r6 = r6 & r2;
        r31 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
    
        if ((((r29 - r6) & r2) / 8) != (((r4 - r6) & r2) / 8)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013b, code lost:
    
        r35 = r12;
        r8 = r13;
        r6 = r29 >> 3;
        r12 = r1[r6];
        r7 = (r29 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        if (((r12 >> r7) & r31) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014e, code lost:
    
        r36 = r8;
        r30 = r9;
        r37 = r4;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
        r1[r18] = (r1[r18] & (~(r31 << r28))) | (128 << r28);
        r30[r29] = r30[r37];
        r30[r37] = 0;
        r14[r29] = r14[r37];
        r14[r37] = null;
        r4 = r37;
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b2, code lost:
    
        r1[r1.length - 1] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r6 = r27;
        r9 = r30;
        r7 = r31;
        r12 = r35;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017c, code lost:
    
        r37 = r4;
        r36 = r8;
        r30 = r9;
        r1[r6] = ((~(r31 << r7)) & r12) | ((r26 & 127) << r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0190, code lost:
    
        if (r5 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0192, code lost:
    
        r5 = i.e0.b(r1, r37 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0198, code lost:
    
        r30[r5] = r30[r29];
        r30[r29] = r30[r37];
        r30[r37] = r30[r5];
        r14[r5] = r14[r29];
        r14[r29] = r14[r37];
        r14[r37] = r14[r5];
        r4 = r37 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r35 = r12;
        r8 = r13;
        r1[r18] = ((r26 & 127) << r28) | (r1[r18] & (~(r31 << r28)));
        r1[r1.length - r8] = (r1[r35] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
        r13 = r8;
        r6 = r27;
        r7 = r31;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        r5 = r4;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cb, code lost:
    
        r31 = r7;
        r35 = r12;
        r36 = r13;
        r39.f4786f = i.e0.c(r39.f4784d) - r39.f4785e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025f, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0263, code lost:
    
        r16 = r1;
        r39.f4785e++;
        r1 = r39.f4786f;
        r2 = r39.f4781a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        if (((r4 >> r6) & r31) != r24) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027f, code lost:
    
        r35 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        r39.f4786f = r1 - r35;
        r1 = r39.f4784d;
        r4 = (r4 & (~(r31 << r6))) | (r10 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01de, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
        r1 = i.e0.d(r39.f4784d);
        r2 = r39.f4781a;
        r4 = r39.f4782b;
        r5 = r39.f4783c;
        r6 = r39.f4784d;
        c(r1);
        r1 = r39.f4781a;
        r7 = r39.f4782b;
        r8 = r39.f4783c;
        r9 = r39.f4784d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0201, code lost:
    
        if (r12 >= r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0210, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0212, code lost:
    
        r13 = r4[r12];
        r15 = java.lang.Long.hashCode(r13) * r19;
        r15 = r15 ^ (r15 << 16);
        r16 = r1;
        r1 = a(r15 >>> 7);
        r17 = r2;
        r1 = r15 & 127;
        r15 = r1 >> 3;
        r20 = (r1 & 7) << 3;
        r1 = (r16[r15] & (~(255 << r20))) | (r1 << r20);
        r16[r15] = r1;
        r16[(((r1 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r1] = r13;
        r8[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0254, code lost:
    
        r16 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0095, code lost:
    
        r31 = 255;
        r35 = 0;
        r36 = 1;
        r24 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j8, v vVar) {
        int i7;
        int i8;
        int i9 = -862048943;
        int hashCode = Long.hashCode(j8) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f4784d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f4781a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = i12;
            int i19 = i15;
            int i20 = 0;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i8 = (i14 + (Long.numberOfTrailingZeros(j12) >> 3)) & i13;
                int i21 = i9;
                if (this.f4782b[i8] == j8) {
                    break loop0;
                }
                j12 &= j12 - 1;
                i9 = i21;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i7;
        }
        this.f4782b[i8] = j8;
        this.f4783c[i8] = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (((r2 & ((~r2) << 6)) & r20) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        Object[] objArr;
        boolean z8;
        int i7;
        Object[] objArr2;
        long j8;
        int i8;
        char c4;
        long j9;
        long[] jArr2;
        int i9;
        if (obj != this) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (rVar.f4785e == this.f4785e) {
                    long[] jArr3 = this.f4782b;
                    Object[] objArr3 = this.f4783c;
                    long[] jArr4 = this.f4781a;
                    int length = jArr4.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j10 = jArr4[i10];
                            char c6 = 7;
                            long j11 = -9187201950435737472L;
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = 0;
                                z8 = true;
                                while (i13 < i12) {
                                    if ((j10 & 255) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        objArr2 = objArr3;
                                        long j12 = jArr3[i14];
                                        c4 = c6;
                                        Object obj2 = objArr2[i14];
                                        if (obj2 != null) {
                                            i7 = i13;
                                            j8 = j10;
                                            i8 = i11;
                                            j9 = j11;
                                            jArr2 = jArr3;
                                            if (!obj2.equals(rVar.b(j12))) {
                                                return false;
                                            }
                                        } else {
                                            if (rVar.b(j12) != null) {
                                                return false;
                                            }
                                            int hashCode = Long.hashCode(j12) * (-862048943);
                                            int i15 = hashCode ^ (hashCode << 16);
                                            j9 = j11;
                                            int i16 = i15 & 127;
                                            int i17 = rVar.f4784d;
                                            int i18 = (i15 >>> 7) & i17;
                                            i8 = i11;
                                            int i19 = 0;
                                            while (true) {
                                                long[] jArr5 = rVar.f4781a;
                                                int i20 = i18 >> 3;
                                                int i21 = (i18 & 7) << 3;
                                                long j13 = jArr5[i20] >>> i21;
                                                long j14 = jArr5[i20 + 1] << (64 - i21);
                                                i7 = i13;
                                                jArr2 = jArr3;
                                                long j15 = j13 | (j14 & ((-i21) >> 63));
                                                j8 = j10;
                                                long j16 = (i16 * 72340172838076673L) ^ j15;
                                                long j17 = (j16 - 72340172838076673L) & (~j16) & j9;
                                                while (true) {
                                                    if (j17 == 0) {
                                                        break;
                                                    }
                                                    int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i18) & i17;
                                                    if (rVar.f4782b[numberOfTrailingZeros] == j12) {
                                                        i9 = numberOfTrailingZeros;
                                                        break;
                                                    }
                                                    j17 &= j17 - 1;
                                                }
                                                i19 += 8;
                                                i18 = (i18 + i19) & i17;
                                                jArr3 = jArr2;
                                                i13 = i7;
                                                j10 = j8;
                                            }
                                            if (!(i9 >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        i7 = i13;
                                        objArr2 = objArr3;
                                        j8 = j10;
                                        i8 = i11;
                                        c4 = c6;
                                        j9 = j11;
                                        jArr2 = jArr3;
                                    }
                                    j10 = j8 >> i8;
                                    i13 = i7 + 1;
                                    c6 = c4;
                                    jArr3 = jArr2;
                                    objArr3 = objArr2;
                                    j11 = j9;
                                    i11 = i8;
                                }
                                objArr = objArr3;
                                int i22 = i11;
                                jArr = jArr3;
                                if (i12 != i22) {
                                    return true;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                z8 = true;
                            }
                            if (i10 == length) {
                                return z8;
                            }
                            i10++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f4782b;
        Object[] objArr = this.f4783c;
        long[] jArr2 = this.f4781a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j8 = jArr2[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i7 << 3) + i10;
                        long j9 = jArr[i11];
                        Object obj = objArr[i11];
                        i8 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j9);
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

    public final String toString() {
        int i7;
        int i8;
        if (this.f4785e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f4782b;
        Object[] objArr = this.f4783c;
        long[] jArr2 = this.f4781a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j8 = jArr2[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j8) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i9;
                            long j9 = jArr[i13];
                            Object obj = objArr[i13];
                            sb.append(j9);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f4785e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j8 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i7 = i14;
                } else {
                    i7 = i9;
                }
                if (i7 == length) {
                    break;
                }
                i9 = i7 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
