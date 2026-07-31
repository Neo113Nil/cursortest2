package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5564a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5565b;

    /* renamed from: c, reason: collision with root package name */
    public int f5566c;

    /* renamed from: d, reason: collision with root package name */
    public int f5567d;

    /* renamed from: e, reason: collision with root package name */
    public int f5568e;

    public y(int i) {
        this.f5564a = r0.f5528a;
        this.f5565b = n.f5513a;
        if (i >= 0) {
            d(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r37.f5568e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r37.f5564a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r3 = r37.f5566c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (java.lang.Long.compare((r37.f5567d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        r3 = r37.f5564a;
        r4 = r37.f5566c;
        r6 = r37.f5565b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        r29 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        r27 = r12;
        r7 = d6.l.O(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0115, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
    
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
    
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0170, code lost:
    
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0182, code lost:
    
        if (((r33 >> r7) & r27) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        r3[r6] = (r33 & (~(r27 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c2, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a8, code lost:
    
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r27 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d0, code lost:
    
        r31 = r15;
        r37.f5568e = o.r0.a(r37.f5566c) - r37.f5567d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0257, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025b, code lost:
    
        r14 = r3;
        r37.f5567d++;
        r3 = r37.f5568e;
        r4 = r37.f5564a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0274, code lost:
    
        if (((r6 >> r8) & r27) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0276, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
    
        r37.f5568e = r3 - r9;
        r3 = r37.f5566c;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0279, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        r27 = 255;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e9, code lost:
    
        r3 = o.r0.b(r37.f5566c);
        r4 = r37.f5564a;
        r6 = r37.f5565b;
        r7 = r37.f5566c;
        d(r3);
        r3 = r37.f5564a;
        r8 = r37.f5565b;
        r9 = r37.f5566c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0200, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x020f, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0211, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r15 = c(r14 >>> 7);
        r19 = r3;
        r18 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r19[r14] & (~(255 << r23))) | (r3 << r23);
        r19[r14] = r3;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0250, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024c, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e6, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        r27 = 255;
        r31 = true;
        r20 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i) {
        int i8;
        boolean z3;
        int i9;
        int i10 = this.f5567d;
        int i11 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f5566c;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f5564a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            boolean z7 = true;
            int i20 = i17;
            long j7 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j8 = i14;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i9 = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i15;
                int i21 = i11;
                if (this.f5565b[i9] == i) {
                    z3 = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                i11 = i21;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i8;
        }
        this.f5565b[i9] = i;
        if (this.f5567d != i10) {
            return z3;
        }
        return false;
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
    public final boolean b(int i) {
        int i8;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5566c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f5564a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j7 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j8 = (i10 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i11;
                if (this.f5565b[i8] == i) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return i8 >= 0;
    }

    public final int c(int i) {
        int i8 = this.f5566c;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5564a;
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

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5566c = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5564a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5568e = r0.a(this.f5566c) - this.f5567d;
        this.f5565b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i) {
        int i8;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5566c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f5564a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j7 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j8 = (i10 * 72340172838076673L) ^ j7;
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j9 == 0) {
                    break;
                }
                i8 = ((Long.numberOfTrailingZeros(j9) >> 3) + i12) & i11;
                if (this.f5565b[i8] == i) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z3 = i8 >= 0;
        if (z3) {
            f(i8);
        }
        return z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f5567d != this.f5567d) {
            return false;
        }
        int[] iArr = this.f5565b;
        long[] jArr = this.f5564a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j7 = jArr[i];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j7) < 128 && !yVar.b(iArr[(i << 3) + i9])) {
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
        this.f5567d--;
        long[] jArr = this.f5564a;
        int i8 = this.f5566c;
        int i9 = i >> 3;
        int i10 = (i & 7) << 3;
        long j7 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j7;
        jArr[(((i - 7) & i8) + (i8 & 7)) >> 3] = j7;
    }

    public final int hashCode() {
        int[] iArr = this.f5565b;
        long[] jArr = this.f5564a;
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
                        i8 = Integer.hashCode(iArr[(i << 3) + i10]) + i8;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f5565b;
        long[] jArr = this.f5564a;
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
                            int i11 = iArr[(i << 3) + i10];
                            if (i8 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i8 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i11);
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

    public /* synthetic */ y() {
        this(6);
    }
}
