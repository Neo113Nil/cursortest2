package j;

import k.AbstractC0561a;

/* renamed from: j.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543q {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6308a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6309b;

    /* renamed from: c, reason: collision with root package name */
    public int f6310c;

    /* renamed from: d, reason: collision with root package name */
    public int f6311d;

    /* renamed from: e, reason: collision with root package name */
    public int f6312e;

    public C0543q(int i3) {
        this.f6308a = AbstractC0522D.f6254a;
        this.f6309b = AbstractC0536j.f6285a;
        if (i3 >= 0) {
            e(AbstractC0522D.f(i3));
        } else {
            AbstractC0561a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r3 = d(r20);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r37.f6312e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (((r37.f6308a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r3 = r37.f6310c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r3 <= 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (java.lang.Long.compare((r37.f6311d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        r3 = r37.f6308a;
        r5 = r37.f6310c;
        r6 = r37.f6309b;
        j.AbstractC0522D.a(r3, r5);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (r9 == r5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        r24 = r9 >> 3;
        r27 = (r9 & 7) << 3;
        r25 = (r3[r24] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r25 != r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e6, code lost:
    
        if (r25 == 254) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        r25 = java.lang.Integer.hashCode(r6[r9]) * (-862048943);
        r11 = r14;
        r14 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = d(r14);
        r14 = r14 & r5;
        r26 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if ((((r28 - r14) & r5) / 8) != (((r9 - r14) & r5) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r3[r24] = (r3[r24] & (~(255 << r27))) | ((r21 & 127) << r27);
        r3[r3.length - r15] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r26 + 1;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
    
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
    
        r7 = r28 >> 3;
        r8 = r3[r7];
        r10 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (((r8 >> r10) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
    
        r35 = r2;
        r3[r7] = ((~(255 << r10)) & r8) | ((r21 & 127) << r10);
        r3[r24] = (r3[r24] & (~(255 << r27))) | (128 << r27);
        r6[r28] = r6[r26];
        r6[r26] = 0;
        r9 = r26;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0197, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r15 = 1;
        r2 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0171, code lost:
    
        r35 = r2;
        r3[r7] = ((r21 & 127) << r10) | (r8 & (~(255 << r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017f, code lost:
    
        if (r11 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0181, code lost:
    
        r14 = j.AbstractC0522D.b(r3, r26 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        r6[r14] = r6[r28];
        r6[r28] = r6[r26];
        r6[r26] = r6[r14];
        r9 = r26 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0188, code lost:
    
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01aa, code lost:
    
        r35 = r2;
        r37.f6312e = j.AbstractC0522D.c(r37.f6310c) - r37.f6311d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x022b, code lost:
    
        r18 = d(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0234, code lost:
    
        r2 = true;
        r37.f6311d++;
        r1 = r37.f6312e;
        r3 = r37.f6308a;
        r4 = r18 >> 3;
        r5 = r3[r4];
        r7 = (r18 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024d, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024f, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0252, code lost:
    
        r37.f6312e = r1 - r8;
        r1 = r37.f6310c;
        r5 = (r5 & (~(255 << r7))) | (r22 << r7);
        r3[r4] = r5;
        r3[(((r18 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0251, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        r35 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c3, code lost:
    
        r1 = j.AbstractC0522D.d(r37.f6310c);
        r2 = r37.f6308a;
        r3 = r37.f6309b;
        r5 = r37.f6310c;
        e(r1);
        r1 = r37.f6308a;
        r6 = r37.f6309b;
        r7 = r37.f6310c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d9, code lost:
    
        if (r9 >= r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e9, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01eb, code lost:
    
        r10 = r3[r9];
        r11 = java.lang.Integer.hashCode(r10) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r15 = d(r11 >>> 7);
        r17 = r9;
        r8 = r11 & 127;
        r11 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r8 = (r8 << r18) | (r1[r11] & (~(255 << r18)));
        r1[r11] = r8;
        r1[(((r15 - 7) & r7) + (r7 & 7)) >> 3] = r8;
        r6[r15] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0227, code lost:
    
        r9 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0225, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01be, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009b, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0232, code lost:
    
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6 = i3;
        int i7 = this.f6311d;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f6310c;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f6308a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            int i16 = 1;
            int i17 = i13;
            long j3 = (((-i15) >> 63) & (jArr[i14 + 1] << (64 - i15))) | (jArr[i14] >>> i15);
            long j4 = i10;
            int i18 = i9;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i5 = (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
                if (this.f6309b[i5] == i6) {
                    i4 = i7;
                    z3 = true;
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i13 = i17 + 8;
            i12 = (i12 + i13) & i11;
            i6 = i3;
            i9 = i18;
        }
        this.f6309b[i5] = i3;
        if (this.f6311d != i4) {
            return z3;
        }
        return false;
    }

    public final void b() {
        this.f6311d = 0;
        long[] jArr = this.f6308a;
        if (jArr != AbstractC0522D.f6254a) {
            S1.k.s0(jArr);
            long[] jArr2 = this.f6308a;
            int i3 = this.f6310c;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        this.f6312e = AbstractC0522D.c(this.f6310c) - this.f6311d;
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
        int i7 = this.f6310c;
        int i8 = (i5 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f6308a;
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
                if (this.f6309b[i4] == i3) {
                    break loop0;
                }
                j5 &= j5 - 1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return i4 >= 0;
    }

    public final int d(int i3) {
        int i4 = this.f6310c;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6308a;
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

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6310c = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6308a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6312e = AbstractC0522D.c(this.f6310c) - this.f6311d;
        this.f6309b = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0543q)) {
            return false;
        }
        C0543q c0543q = (C0543q) obj;
        if (c0543q.f6311d != this.f6311d) {
            return false;
        }
        int[] iArr = this.f6309b;
        long[] jArr = this.f6308a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128 && !c0543q.c(iArr[(i3 << 3) + i5])) {
                            return false;
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
        }
        return true;
    }

    public final void f(int i3) {
        this.f6311d--;
        long[] jArr = this.f6308a;
        int i4 = this.f6310c;
        int i5 = i3 >> 3;
        int i6 = (i3 & 7) << 3;
        long j3 = (jArr[i5] & (~(255 << i6))) | (254 << i6);
        jArr[i5] = j3;
        jArr[(((i3 - 7) & i4) + (i4 & 7)) >> 3] = j3;
    }

    public final int hashCode() {
        int[] iArr = this.f6309b;
        long[] jArr = this.f6308a;
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
                            i5 = Integer.hashCode(iArr[(i4 << 3) + i7]) + i5;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6309b;
        long[] jArr = this.f6308a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = iArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(i7);
                            i4++;
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
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ C0543q() {
        this(6);
    }
}
