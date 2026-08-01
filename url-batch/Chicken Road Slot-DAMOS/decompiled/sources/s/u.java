package s;

import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8383a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8384b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f8385c;

    /* renamed from: d, reason: collision with root package name */
    public int f8386d;

    /* renamed from: e, reason: collision with root package name */
    public int f8387e;

    /* renamed from: f, reason: collision with root package name */
    public int f8388f;

    public u(int i3) {
        this.f8383a = p0.f8356a;
        int[] iArr = m.f8345a;
        this.f8384b = iArr;
        this.f8385c = iArr;
        if (i3 >= 0) {
            e(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f8387e = 0;
        long[] jArr = this.f8383a;
        if (jArr != p0.f8356a) {
            kotlin.collections.v.j(jArr, -9187201950435737472L);
            long[] jArr2 = this.f8383a;
            int i3 = this.f8386d;
            int i10 = i3 >> 3;
            long j = 255 << ((i3 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        this.f8388f = p0.a(this.f8386d) - this.f8387e;
    }

    public final int b(int i3) {
        int i10 = this.f8386d;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8383a;
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

    public final int c(int i3) {
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f8386d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f8383a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j3 = (i11 * 72340172838076673L) ^ j;
            for (long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i12;
                if (this.f8384b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int d(int i3) {
        int c10 = c(i3);
        if (c10 >= 0) {
            return this.f8385c[c10];
        }
        return -1;
    }

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8386d = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8383a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8388f = p0.a(this.f8386d) - this.f8387e;
        this.f8384b = new int[max];
        this.f8385c = new int[max];
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f8387e != this.f8387e) {
            return false;
        }
        int[] iArr = this.f8384b;
        int[] iArr2 = this.f8385c;
        long[] jArr = this.f8383a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i3 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j) < 128) {
                        int i12 = (i3 << 3) + i11;
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int c10 = uVar.c(i13);
                        if (c10 < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i14 != uVar.f8385c[c10]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j >>= 8;
                    i11++;
                    z12 = z11;
                }
                z10 = z12;
                if (i10 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i3 == length) {
                return z10;
            }
            i3++;
            z12 = z10;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r37.f8388f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (((r37.f8383a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        r2 = r37.f8386d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r19 = 128;
        r5 = r37.f8387e;
        r3 = hd.a0.f4495e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (java.lang.Long.compare((r5 * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r2 = r37.f8383a;
        r3 = r37.f8386d;
        r5 = r37.f8384b;
        r6 = r37.f8385c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        r29 = r9;
        r27 = r11;
        r12 = 7;
        r7 = kotlin.collections.w.o(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0114, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0116, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012a, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012d, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = b(r10);
        r10 = r10 & r3;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014c, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0173, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        if (((r14 >> r12) & r27) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0187, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r27 << r12)) & r14) | ((r9 & 127) << r12);
        r2[r8] = (r2[r8] & (~(r27 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d2, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r31;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b1, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014e, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & 127) << r11) | (r2[r8] & (~(r27 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01eb, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f8388f = s.p0.a(r37.f8386d) - r37.f8387e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027b, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027f, code lost:
    
        r37.f8387e++;
        r1 = r37.f8388f;
        r3 = r37.f8383a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0297, code lost:
    
        if (((r5 >> r7) & r27) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0299, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r37.f8388f = r1 - r32;
        r1 = r37.f8386d;
        r5 = (r5 & (~(r27 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fe, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020c, code lost:
    
        r2 = s.p0.b(r37.f8386d);
        r3 = r37.f8383a;
        r5 = r37.f8384b;
        r6 = r37.f8385c;
        r7 = r37.f8386d;
        e(r2);
        r2 = r37.f8383a;
        r8 = r37.f8384b;
        r9 = r37.f8385c;
        r10 = r37.f8386d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0227, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0236, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0238, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0275, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0274, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:
    
        r29 = r9;
        r27 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3, int i10) {
        int i11;
        int i12;
        int i13 = i3;
        int i14 = -862048943;
        int hashCode = Integer.hashCode(i13) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f8386d;
        int i19 = i16 & i18;
        int i20 = 0;
        loop0: while (true) {
            long[] jArr = this.f8383a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            int i23 = 1;
            int i24 = i20;
            int i25 = 0;
            long j = (((-i22) >> 63) & (jArr[i21 + 1] << (64 - i22))) | (jArr[i21] >>> i22);
            long j3 = i17;
            long j10 = j ^ (j3 * 72340172838076673L);
            long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i12 = ((Long.numberOfTrailingZeros(j11) >> 3) + i19) & i18;
                int i26 = i14;
                if (this.f8384b[i12] == i13) {
                    break loop0;
                }
                j11 &= j11 - 1;
                i14 = i26;
            }
            i20 = i24 + 8;
            i19 = (i19 + i20) & i18;
            i13 = i3;
            i14 = i11;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f8384b[i12] = i3;
        this.f8385c[i12] = i10;
    }

    public final int hashCode() {
        int[] iArr = this.f8384b;
        int[] iArr2 = this.f8385c;
        long[] jArr = this.f8383a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i3 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i3 << 3) + i12;
                        int i14 = iArr[i13];
                        i10 += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
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
        if (this.f8387e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f8384b;
        int[] iArr2 = this.f8385c;
        long[] jArr = this.f8383a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i10 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i3 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f8387e) {
                                sb2.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ u() {
        this(6);
    }
}
