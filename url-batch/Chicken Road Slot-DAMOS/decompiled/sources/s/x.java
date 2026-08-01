package s;

import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8392a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8393b;

    /* renamed from: c, reason: collision with root package name */
    public int f8394c;

    /* renamed from: d, reason: collision with root package name */
    public int f8395d;

    /* renamed from: e, reason: collision with root package name */
    public int f8396e;

    public x(int i3) {
        this.f8392a = p0.f8356a;
        this.f8393b = m.f8345a;
        if (i3 >= 0) {
            d(p0.d(i3));
        } else {
            a1.e("Capacity must be a positive value.");
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
    
        if (r37.f8396e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (((r37.f8392a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r3 = r37.f8394c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r3 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        r20 = 128;
        r6 = r37.f8395d;
        r4 = hd.a0.f4495e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        if (java.lang.Long.compare((r6 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        r3 = r37.f8392a;
        r4 = r37.f8394c;
        r6 = r37.f8393b;
        r7 = (r4 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r14 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        r29 = r8;
        r8 = r3[r14] & (-9187201950435737472L);
        r3[r14] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r14 = r14 + 1;
        r12 = r12;
        r8 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
    
        r27 = r12;
        r7 = kotlin.collections.w.o(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0115, code lost:
    
        if (r7 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r12 = (r3[r8] >> r9) & r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0124, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
    
        r12 = java.lang.Integer.hashCode(r6[r7]) * r22;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r14 = c(r13);
        r13 = r13 & r4;
        r31 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if ((((r14 - r13) & r4) / 8) != (((r7 - r13) & r4) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        r30 = r6;
        r3[r8] = ((~(r27 << r9)) & r3[r8]) | ((r12 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016d, code lost:
    
        r6 = r30;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        r30 = r6;
        r32 = r7;
        r6 = r14 >> 3;
        r33 = r3[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0184, code lost:
    
        if (((r33 >> r7) & r27) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0186, code lost:
    
        r3[r6] = (r33 & (~(r27 << r7))) | ((r12 & 127) << r7);
        r3[r8] = (r3[r8] & (~(r27 << r9))) | (128 << r9);
        r30[r14] = r30[r32];
        r30[r32] = 0;
        r7 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c4, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01aa, code lost:
    
        r3[r6] = ((r12 & 127) << r7) | (r33 & (~(r27 << r7)));
        r6 = r30[r14];
        r30[r14] = r30[r32];
        r30[r32] = r6;
        r7 = r32 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0126, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d2, code lost:
    
        r31 = r15;
        r37.f8396e = s.p0.a(r37.f8394c) - r37.f8395d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0259, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025d, code lost:
    
        r14 = r3;
        r37.f8395d++;
        r3 = r37.f8396e;
        r4 = r37.f8392a;
        r5 = r14 >> 3;
        r6 = r4[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0276, code lost:
    
        if (((r6 >> r8) & r27) != r20) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0278, code lost:
    
        r9 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        r37.f8396e = r3 - r9;
        r3 = r37.f8394c;
        r6 = (r6 & (~(r27 << r8))) | (r10 << r8);
        r4[r5] = r6;
        r4[(((r14 - 7) & r3) + (r3 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027b, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e1, code lost:
    
        r27 = 255;
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01eb, code lost:
    
        r3 = s.p0.b(r37.f8394c);
        r4 = r37.f8392a;
        r6 = r37.f8393b;
        r7 = r37.f8394c;
        d(r3);
        r3 = r37.f8392a;
        r8 = r37.f8393b;
        r9 = r37.f8394c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0202, code lost:
    
        if (r12 >= r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0211, code lost:
    
        if (((r4[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r20) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0252, code lost:
    
        r12 = r12 + 1;
        r4 = r18;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024e, code lost:
    
        r19 = r3;
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e8, code lost:
    
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
    public final boolean a(int i3) {
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f8395d;
        int i13 = -862048943;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f8394c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f8392a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            boolean z11 = true;
            int i22 = i19;
            long j = (((-i21) >> 63) & (jArr[i20 + 1] << (64 - i21))) | (jArr[i20] >>> i21);
            long j3 = i16;
            long j10 = j ^ (j3 * 72340172838076673L);
            long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j11) >> 3) + i18) & i17;
                int i23 = i13;
                if (this.f8393b[i11] == i3) {
                    z10 = true;
                    break loop0;
                }
                j11 &= j11 - 1;
                i13 = i23;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i10;
        }
        this.f8393b[i11] = i3;
        if (this.f8395d != i12) {
            return z10;
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
    public final boolean b(int i3) {
        int i10;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8394c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f8392a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j3 = (i12 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                if (this.f8393b[i10] == i3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final int c(int i3) {
        int i10 = this.f8394c;
        int i11 = i3 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f8392a;
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

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, p0.c(i3)) : 0;
        this.f8394c = max;
        if (max == 0) {
            jArr = p0.f8356a;
        } else {
            int i10 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i10];
            Arrays.fill(jArr2, 0, i10, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f8392a = jArr;
        int i11 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f8396e = p0.a(this.f8394c) - this.f8395d;
        this.f8393b = new int[max];
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
    public final boolean e(int i3) {
        int i10;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f8394c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f8392a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j3 = (i12 * 72340172838076673L) ^ j;
            long j10 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                if (this.f8393b[i10] == i3) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z10 = i10 >= 0;
        if (z10) {
            f(i10);
        }
        return z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f8395d != this.f8395d) {
            return false;
        }
        int[] iArr = this.f8393b;
        long[] jArr = this.f8392a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !xVar.b(iArr[(i3 << 3) + i11])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
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
        this.f8395d--;
        long[] jArr = this.f8392a;
        int i10 = this.f8394c;
        int i11 = i3 >> 3;
        int i12 = (i3 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i3 - 7) & i10) + (i10 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f8393b;
        long[] jArr = this.f8392a;
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
                        i10 = Integer.hashCode(iArr[(i3 << 3) + i12]) + i10;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f8393b;
        long[] jArr = this.f8392a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = iArr[(i3 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i13);
                            i10++;
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
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public /* synthetic */ x() {
        this(6);
    }
}
