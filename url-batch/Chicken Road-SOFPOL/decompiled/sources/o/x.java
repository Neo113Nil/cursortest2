package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends l {

    /* renamed from: f, reason: collision with root package name */
    public int f5563f;

    public x(int i) {
        this.f5494a = r0.f5528a;
        this.f5495b = n.f5513a;
        this.f5496c = p.a.f5709c;
        if (i >= 0) {
            e(r0.d(i));
        } else {
            p.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f5498e = 0;
        long[] jArr = this.f5494a;
        if (jArr != r0.f5528a) {
            d6.l.M(jArr, -9187201950435737472L);
            long[] jArr2 = this.f5494a;
            int i = this.f5497d;
            int i8 = i >> 3;
            long j7 = 255 << ((i & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j7)) | j7;
        }
        d6.l.L(this.f5496c, 0, this.f5497d);
        this.f5563f = r0.a(this.f5497d) - this.f5498e;
    }

    public final int d(int i) {
        int i8 = this.f5497d;
        int i9 = i & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f5494a;
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

    public final void e(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, r0.c(i)) : 0;
        this.f5497d = max;
        if (max == 0) {
            jArr = r0.f5528a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            d6.l.M(jArr, -9187201950435737472L);
        }
        this.f5494a = jArr;
        int i8 = max >> 3;
        long j7 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j7)) | j7;
        this.f5563f = r0.a(this.f5497d) - this.f5498e;
        this.f5495b = new int[max];
        this.f5496c = new Object[max];
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
    public final Object f(int i) {
        int i8;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f5497d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f5494a;
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
                if (this.f5495b[i8] == i) {
                    break loop0;
                }
                j9 &= j9 - 1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (i8 < 0) {
            return null;
        }
        this.f5498e--;
        long[] jArr2 = this.f5494a;
        int i16 = this.f5497d;
        int i17 = i8 >> 3;
        int i18 = (i8 & 7) << 3;
        long j10 = (jArr2[i17] & (~(255 << i18))) | (254 << i18);
        jArr2[i17] = j10;
        jArr2[(((i8 - 7) & i16) + (i16 & 7)) >> 3] = j10;
        Object[] objArr = this.f5496c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        r2 = d(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r37.f5563f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        if (((r37.f5494a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        r2 = r37.f5497d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (java.lang.Long.compare((r37.f5498e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r2 = r37.f5494a;
        r3 = r37.f5497d;
        r5 = r37.f5495b;
        r6 = r37.f5496c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = d6.l.O(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0114, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0121, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = d(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0183, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0185, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d1, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b0, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & 127) << r12) | ((~(r27 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ea, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f5563f = o.r0.a(r37.f5497d) - r37.f5498e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r13 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0281, code lost:
    
        r37.f5498e++;
        r1 = r37.f5563f;
        r2 = r37.f5494a;
        r3 = r13 >> 3;
        r4 = r2[r3];
        r6 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0299, code lost:
    
        if (((r4 >> r6) & r27) != r19) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029b, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a0, code lost:
    
        r37.f5563f = r1 - r7;
        r1 = r37.f5497d;
        r4 = (r4 & (~(r27 << r6))) | (r29 << r6);
        r2[r3] = r4;
        r2[(((r13 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x029e, code lost:
    
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fd, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020b, code lost:
    
        r2 = o.r0.b(r37.f5497d);
        r3 = r37.f5494a;
        r5 = r37.f5495b;
        r6 = r37.f5496c;
        r7 = r37.f5497d;
        e(r2);
        r2 = r37.f5494a;
        r8 = r37.f5495b;
        r9 = r37.f5496c;
        r10 = r37.f5497d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0226, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0235, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0237, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = d(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0274, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0273, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0208, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0280, code lost:
    
        r13 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, Object obj) {
        int i8;
        int i9;
        int i10 = i;
        int i11 = -862048943;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f5497d;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f5494a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = 1;
            int i21 = i17;
            int i22 = 0;
            long j7 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j8 = i14;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i9 = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i15;
                int i23 = i11;
                if (this.f5495b[i9] == i10) {
                    break loop0;
                }
                j10 &= j10 - 1;
                i11 = i23;
            }
            i17 = i21 + 8;
            i16 = (i16 + i17) & i15;
            i10 = i;
            i11 = i8;
        }
        this.f5495b[i9] = i;
        this.f5496c[i9] = obj;
    }

    public /* synthetic */ x() {
        this(6);
    }
}
