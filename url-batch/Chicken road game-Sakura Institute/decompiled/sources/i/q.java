package i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4776a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4777b;

    /* renamed from: c, reason: collision with root package name */
    public int f4778c;

    /* renamed from: d, reason: collision with root package name */
    public int f4779d;

    /* renamed from: e, reason: collision with root package name */
    public int f4780e;

    public q(int i7) {
        this.f4776a = e0.f4736a;
        this.f4777b = j.f4753a;
        if (i7 >= 0) {
            e(e0.f(i7));
        } else {
            j.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r22 = r4;
        r8 = (r8 & ((~r8) << 6)) & (-9187201950435737472L);
        r8 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r8 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r3 = d(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r38.f4780e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r38.f4776a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r3 = r38.f4778c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r3 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (java.lang.Long.compare((r38.f4779d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r3 = r38.f4776a;
        r4 = r38.f4778c;
        r6 = r38.f4777b;
        i.e0.a(r3, r4);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r9 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        r21 = r9 >> 3;
        r27 = (r9 & 7) << 3;
        r25 = (r3[r21] >> r27) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        if (r25 != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r25 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        r25 = java.lang.Integer.hashCode(r6[r9]) * r22;
        r26 = r8;
        r8 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = d(r8);
        r8 = r8 & r4;
        r30 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        if ((((r28 - r8) & r4) / 8) != (((r9 - r8) & r4) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        r3[r21] = (r3[r21] & (~(r30 << r27))) | ((r25 & 127) << r27);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        r12 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
    
        r7 = r28 >> 3;
        r12 = r3[r7];
        r8 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
    
        if (((r12 >> r8) & r30) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
        r3[r21] = (r3[r21] & (~(r30 << r27))) | (128 << r27);
        r29[r28] = r29[r9];
        r29[r9] = 0;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019a, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r8 = r26;
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0171, code lost:
    
        r29 = r6;
        r3[r7] = ((~(r30 << r8)) & r12) | ((r25 & 127) << r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0184, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0186, code lost:
    
        r14 = i.e0.b(r3, r9 + 1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
    
        r29[r14] = r29[r28];
        r29[r28] = r29[r9];
        r29[r9] = r29[r14];
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
    
        r30 = r12;
        r38.f4780e = i.e0.c(r38.f4778c) - r38.f4779d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b7, code lost:
    
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0237, code lost:
    
        r3 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x023b, code lost:
    
        r14 = r3;
        r38.f4779d++;
        r3 = r38.f4780e;
        r4 = r38.f4776a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0254, code lost:
    
        if (((r6 >> r8) & r30) != r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0256, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x025b, code lost:
    
        r38.f4780e = r3 - r9;
        r3 = r38.f4778c;
        r6 = (r6 & (~(r30 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0259, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
    
        r30 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
    
        r3 = i.e0.d(r38.f4778c);
        r4 = r38.f4776a;
        r6 = r38.f4777b;
        r7 = r38.f4778c;
        e(r3);
        r3 = r38.f4776a;
        r8 = r38.f4777b;
        r9 = r38.f4778c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d8, code lost:
    
        if (r12 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e8, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r17) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ea, code lost:
    
        r13 = r6[r12];
        r14 = java.lang.Integer.hashCode(r13) * r22;
        r14 = r14 ^ (r14 << 16);
        r19 = r15;
        r15 = d(r14 >>> 7);
        r21 = r3;
        r20 = r4;
        r3 = r14 & 127;
        r14 = r15 >> 3;
        r23 = (r15 & 7) << 3;
        r3 = (r21[r14] & (~(255 << r23))) | (r3 << r23);
        r21[r14] = r3;
        r21[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r12 = r12 + 1;
        r15 = r19;
        r4 = r20;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0228, code lost:
    
        r21 = r3;
        r20 = r4;
        r19 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01be, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        r30 = 255;
        r19 = true;
        r17 = 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i7) {
        int i8;
        boolean z8;
        int i9;
        int i10 = this.f4779d;
        int i11 = -862048943;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f4778c;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f4776a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            boolean z9 = true;
            int i20 = i17;
            long j8 = (((-i19) >> 63) & (jArr[i18 + 1] << (64 - i19))) | (jArr[i18] >>> i19);
            long j9 = i14;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i9 = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                int i21 = i11;
                if (this.f4777b[i9] == i7) {
                    z8 = true;
                    break loop0;
                }
                j11 &= j11 - 1;
                i11 = i21;
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i8;
        }
        this.f4777b[i9] = i7;
        if (this.f4779d != i10) {
            return z8;
        }
        return false;
    }

    public final void b() {
        this.f4779d = 0;
        long[] jArr = this.f4776a;
        if (jArr != e0.f4736a) {
            e6.k.d0(jArr);
            long[] jArr2 = this.f4776a;
            int i7 = this.f4778c;
            int i8 = i7 >> 3;
            long j8 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j8)) | j8;
        }
        this.f4780e = e0.c(this.f4778c) - this.f4779d;
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
        int i11 = this.f4778c;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f4776a;
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
                if (this.f4777b[i8] == i7) {
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
        int i8 = this.f4778c;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4776a;
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

    public final void e(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4778c = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4776a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4780e = e0.c(this.f4778c) - this.f4779d;
        this.f4777b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f4779d != this.f4779d) {
            return false;
        }
        int[] iArr = this.f4777b;
        long[] jArr = this.f4776a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128 && !qVar.c(iArr[(i7 << 3) + i9])) {
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
        this.f4779d--;
        long[] jArr = this.f4776a;
        int i8 = this.f4778c;
        int i9 = i7 >> 3;
        int i10 = (i7 & 7) << 3;
        long j8 = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        jArr[i9] = j8;
        jArr[(((i7 - 7) & i8) + (i8 & 7)) >> 3] = j8;
    }

    public final int hashCode() {
        int[] iArr = this.f4777b;
        long[] jArr = this.f4776a;
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
                        i8 = Integer.hashCode(iArr[(i7 << 3) + i10]) + i8;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f4777b;
        long[] jArr = this.f4776a;
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
                            int i11 = iArr[(i7 << 3) + i10];
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

    public /* synthetic */ q() {
        this(6);
    }
}
