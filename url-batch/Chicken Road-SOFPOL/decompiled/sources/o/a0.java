package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5411a = r0.f5528a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f5412b = p.f5517a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5413c = p.a.f5709c;

    /* renamed from: d, reason: collision with root package name */
    public int f5414d;

    /* renamed from: e, reason: collision with root package name */
    public int f5415e;

    /* renamed from: f, reason: collision with root package name */
    public int f5416f;

    public a0(int i) {
        if (i >= 0) {
            e(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f5415e = 0;
        long[] jArr = this.f5411a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5411a;
            int i = this.f5414d;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5413c, 0, this.f5414d);
        this.f5416f = r0.a(this.f5414d) - this.f5415e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j7) {
        int i;
        int hashCode = Long.hashCode(j7) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5414d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5411a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (this.f5412b[i] == j7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        return i >= 0;
    }

    public final int c(int i) {
        int i8 = this.f5414d;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5411a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j7) {
        int i;
        int hashCode = Long.hashCode(j7) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f5414d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f5411a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (this.f5412b[i] == j7) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        if (i >= 0) {
            return this.f5413c[i];
        }
        return null;
    }

    public final void e(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5414d = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5411a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5416f = r0.a(this.f5414d) - this.f5415e;
        this.f5412b = new long[max];
        this.f5413c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z3;
        long[] jArr;
        boolean z7;
        long[] jArr2;
        boolean z8 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f5415e != this.f5415e) {
            return false;
        }
        long[] jArr3 = this.f5412b;
        Object[] objArr = this.f5413c;
        long[] jArr4 = this.f5411a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j7 = jArr4[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                int i9 = 0;
                while (i9 < i8) {
                    if ((255 & j7) < 128) {
                        int i10 = (i << 3) + i9;
                        z7 = z8;
                        jArr2 = jArr3;
                        long j8 = jArr2[i10];
                        Object obj2 = objArr[i10];
                        if (obj2 == null) {
                            if (a0Var.d(j8) != null || !a0Var.b(j8)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(a0Var.d(j8))) {
                            return false;
                        }
                    } else {
                        z7 = z8;
                        jArr2 = jArr3;
                    }
                    j7 >>= 8;
                    i9++;
                    z8 = z7;
                    jArr3 = jArr2;
                }
                z3 = z8;
                jArr = jArr3;
                if (i8 != 8) {
                    return z3;
                }
            } else {
                z3 = z8;
                jArr = jArr3;
            }
            if (i == length) {
                return z3;
            }
            i++;
            z8 = z3;
            jArr3 = jArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r38.f5416f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r38.f5411a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r1 = r38.f5414d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (java.lang.Long.compare((r38.f5415e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r1 = r38.f5411a;
        r2 = r38.f5414d;
        r4 = r38.f5412b;
        r5 = r38.f5413c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = d6.l.O(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = c(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0182, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & 127) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d4, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01af, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & 127) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r18 = r11;
        r38.f5416f = o.r0.a(r38.f5414d) - r38.f5415e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027e, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0282, code lost:
    
        r16 = r1;
        r38.f5415e++;
        r1 = r38.f5416f;
        r2 = r38.f5411a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029c, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029e, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a0, code lost:
    
        r38.f5416f = r1 - r29;
        r1 = r38.f5414d;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fd, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020b, code lost:
    
        r1 = o.r0.b(r38.f5414d);
        r2 = r38.f5411a;
        r4 = r38.f5412b;
        r5 = r38.f5413c;
        r6 = r38.f5414d;
        e(r1);
        r1 = r38.f5411a;
        r7 = r38.f5412b;
        r8 = r38.f5413c;
        r9 = r38.f5414d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        if (r10 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0235, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0237, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0278, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0275, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0097, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
        r20 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j7, Object obj) {
        int i;
        int i8;
        int i9 = -862048943;
        int hashCode = Long.hashCode(j7) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f5414d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f5411a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j8 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j9 = i12;
            int i19 = i15;
            int i20 = 0;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i8 = (i14 + (Long.numberOfTrailingZeros(j11) >> 3)) & i13;
                int i21 = i9;
                if (this.f5412b[i8] == j7) {
                    break loop0;
                }
                j11 &= j11 - 1;
                i9 = i21;
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i9 = i;
        }
        this.f5412b[i8] = j7;
        this.f5413c[i8] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f5412b;
        Object[] objArr = this.f5413c;
        long[] jArr2 = this.f5411a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i8 = 0;
        while (true) {
            long j7 = jArr2[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j7) < 128) {
                        int i11 = (i << 3) + i10;
                        long j8 = jArr[i11];
                        Object obj = objArr[i11];
                        i8 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j8);
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
        int i;
        int i8;
        if (this.f5415e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f5412b;
        Object[] objArr = this.f5413c;
        long[] jArr2 = this.f5411a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                long j7 = jArr2[i9];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((255 & j7) < 128) {
                            int i13 = (i9 << 3) + i12;
                            i8 = i9;
                            long j8 = jArr[i13];
                            Object obj = objArr[i13];
                            sb.append(j8);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f5415e) {
                                sb.append(", ");
                            }
                        } else {
                            i8 = i9;
                        }
                        j7 >>= 8;
                        i12++;
                        i9 = i8;
                    }
                    int i14 = i9;
                    if (i11 != 8) {
                        break;
                    }
                    i = i14;
                } else {
                    i = i9;
                }
                if (i == length) {
                    break;
                }
                i9 = i + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
