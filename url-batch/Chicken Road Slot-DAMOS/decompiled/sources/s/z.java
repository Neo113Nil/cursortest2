package s;

import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8399a = p0.f8356a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f8400b = o.f8350a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8401c = t.a.f9195c;

    /* renamed from: d, reason: collision with root package name */
    public int f8402d;

    /* renamed from: e, reason: collision with root package name */
    public int f8403e;

    /* renamed from: f, reason: collision with root package name */
    public int f8404f;

    public z(int i3) {
        if (i3 >= 0) {
            e(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f8403e = 0;
        long[] jArr = this.f8399a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8399a;
            int i3 = this.f8402d;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        kotlin.collections.v.i(this.f8401c, 0, this.f8402d);
        this.f8404f = p0.a(this.f8402d) - this.f8403e;
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
    public final boolean b(long j) {
        int i3;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8402d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8399a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j3;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (this.f8400b[i3] == j) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i3 >= 0;
    }

    public final int c(int i3) {
        int i10 = this.f8402d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8399a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j3 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j3) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
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
    public final Object d(long j) {
        int i3;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8402d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f8399a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j3 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j3;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i3 = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (this.f8400b[i3] == j) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i3 >= 0) {
            return this.f8401c[i3];
        }
        return null;
    }

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8402d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8399a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8404f = p0.a(this.f8402d) - this.f8403e;
        this.f8400b = new long[max];
        this.f8401c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        long[] jArr;
        boolean z11;
        long[] jArr2;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (zVar.f8403e != this.f8403e) {
            return false;
        }
        long[] jArr3 = this.f8400b;
        Object[] objArr = this.f8401c;
        long[] jArr4 = this.f8399a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j = jArr4[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        z11 = z12;
                        jArr2 = jArr3;
                        long j3 = jArr2[i12];
                        Object obj2 = objArr[i12];
                        if (obj2 == null) {
                            if (zVar.d(j3) != null || !zVar.b(j3)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(zVar.d(j3))) {
                            return false;
                        }
                    } else {
                        z11 = z12;
                        jArr2 = jArr3;
                    }
                    j >>= 8;
                    i11++;
                    z12 = z11;
                    jArr3 = jArr2;
                }
                z10 = z12;
                jArr = jArr3;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
                jArr = jArr3;
            }
            if (i3 == length) {
                return z10;
            }
            i3++;
            z12 = z10;
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
    
        if (r38.f8404f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (((r38.f8399a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r1 = r38.f8402d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r20 = 128;
        r4 = r38.f8403e;
        r2 = hd.a0.f4495e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
    
        if (java.lang.Long.compare((r4 * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
    
        r1 = r38.f8399a;
        r2 = r38.f8402d;
        r4 = r38.f8400b;
        r5 = r38.f8401c;
        r6 = (r2 + 7) >> 3;
        r27 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        if (r7 >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
    
        r31 = r10;
        r29 = r12;
        r11 = r13;
        r8 = 7;
        r6 = kotlin.collections.w.o(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r29];
        r6 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        if (r6 == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r9 == 254) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = c(r10);
        r10 = r10 & r2;
        r30 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0182, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0184, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01d6, code lost:
    
        r1[r1.length - 1] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r30;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b1, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014e, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & 127) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r29] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r30;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ee, code lost:
    
        r18 = r11;
        r38.f8404f = s.p0.a(r38.f8402d) - r38.f8403e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0280, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0284, code lost:
    
        r16 = r1;
        r38.f8403e++;
        r1 = r38.f8404f;
        r2 = r38.f8399a;
        r3 = r16 >> 3;
        r4 = r2[r3];
        r6 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029e, code lost:
    
        if (((r4 >> r6) & r27) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a0, code lost:
    
        r29 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a2, code lost:
    
        r38.f8404f = r1 - r29;
        r1 = r38.f8402d;
        r4 = (r4 & (~(r27 << r6))) | (r31 << r6);
        r2[r3] = r4;
        r2[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ff, code lost:
    
        r27 = 255;
        r31 = r10;
        r29 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020d, code lost:
    
        r1 = s.p0.b(r38.f8402d);
        r2 = r38.f8399a;
        r4 = r38.f8400b;
        r5 = r38.f8401c;
        r6 = r38.f8402d;
        e(r1);
        r1 = r38.f8399a;
        r7 = r38.f8400b;
        r8 = r38.f8401c;
        r9 = r38.f8402d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0228, code lost:
    
        if (r10 >= r6) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0237, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0239, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:67:0x027a, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0277, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020a, code lost:
    
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
    public final void f(long j, Object obj) {
        int i3;
        int i10;
        int i11 = -862048943;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f8402d;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f8399a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            int i20 = 1;
            long j3 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j10 = i14;
            int i21 = i17;
            int i22 = 0;
            long j11 = j3 ^ (j10 * 72340172838076673L);
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i10 = (i16 + (Long.numberOfTrailingZeros(j12) >> 3)) & i15;
                int i23 = i11;
                if (this.f8400b[i10] == j) {
                    break loop0;
                }
                j12 &= j12 - 1;
                i11 = i23;
            }
            i17 = i21 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i3;
        }
        this.f8400b[i10] = j;
        this.f8401c[i10] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f8400b;
        Object[] objArr = this.f8401c;
        long[] jArr2 = this.f8399a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            long j = jArr2[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i3 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i3 << 3) + i12;
                        long j3 = jArr[i13];
                        Object obj = objArr[i13];
                        i10 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j3);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i3 == length) {
                return i10;
            }
            i3++;
        }
    }

    public final String toString() {
        int i3;
        int i10;
        if (this.f8403e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f8400b;
        Object[] objArr = this.f8401c;
        long[] jArr2 = this.f8399a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j = jArr2[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j3 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j3);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f8403e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i3 = i16;
                } else {
                    i3 = i11;
                }
                if (i3 == length) {
                    break;
                }
                i11 = i3 + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
