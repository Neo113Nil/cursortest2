package j;

import H2.AbstractC0080b;
import java.util.NoSuchElementException;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496n {

    /* renamed from: a, reason: collision with root package name */
    public long[] f5176a = AbstractC0478D.f5136a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5177b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f5178c;

    /* renamed from: d, reason: collision with root package name */
    public int f5179d;

    /* renamed from: e, reason: collision with root package name */
    public int f5180e;

    /* renamed from: f, reason: collision with root package name */
    public int f5181f;

    public C0496n() {
        int[] iArr = AbstractC0492j.f5167a;
        this.f5177b = iArr;
        this.f5178c = iArr;
        e(AbstractC0478D.f(6));
    }

    public final void a() {
        this.f5180e = 0;
        long[] jArr = this.f5176a;
        if (jArr != AbstractC0478D.f5136a) {
            M1.k.d0(jArr);
            long[] jArr2 = this.f5176a;
            int i3 = this.f5179d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        this.f5181f = AbstractC0478D.c(this.f5179d) - this.f5180e;
    }

    public final int b(int i3) {
        int i4 = this.f5179d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f5176a;
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

    public final int c(int i3) {
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f5179d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f5176a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i7) & i6;
                if (this.f5177b[numberOfTrailingZeros] == i3) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int d(int i3) {
        int c3 = c(i3);
        if (c3 >= 0) {
            return this.f5178c[c3];
        }
        throw new NoSuchElementException(AbstractC0080b.h("Cannot find value for key ", i3));
    }

    public final void e(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0478D.e(i3)) : 0;
        this.f5179d = max;
        if (max == 0) {
            jArr = AbstractC0478D.f5136a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            M1.k.d0(jArr);
        }
        this.f5176a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f5181f = AbstractC0478D.c(this.f5179d) - this.f5180e;
        this.f5177b = new int[max];
        this.f5178c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0496n)) {
            return false;
        }
        C0496n c0496n = (C0496n) obj;
        if (c0496n.f5180e != this.f5180e) {
            return false;
        }
        int[] iArr = this.f5177b;
        int[] iArr2 = this.f5178c;
        long[] jArr = this.f5176a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (iArr2[i6] != c0496n.d(iArr[i6])) {
                                return false;
                            }
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r2 = r0.b(r4);
        r6 = 128;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r0.f5181f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (((r0.f5176a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r2 = r0.f5179d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r2 <= 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (java.lang.Long.compare((r0.f5180e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r2 = r0.f5176a;
        r5 = r0.f5179d;
        r8 = r0.f5177b;
        r9 = r0.f5178c;
        j.AbstractC0478D.a(r2, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r15 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r18 = r15 >> 3;
        r27 = (r15 & 7) << 3;
        r25 = (r2[r18] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r25 != r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        if (r25 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r25 = java.lang.Integer.hashCode(r8[r15]) * r3;
        r10 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = r0.b(r10);
        r10 = r10 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        if ((((r28 - r10) & r5) / 8) != (((r15 - r10) & r5) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        r2[r18] = (r2[r18] & (~(255 << r27))) | ((r25 & 127) << r27);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r3 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0137, code lost:
    
        r14 = r13;
        r6 = r15;
        r3 = r28 >> 3;
        r19 = r2[r3];
        r7 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
    
        if (((r19 >> r7) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        r2[r3] = (r19 & (~(255 << r7))) | ((r25 & 127) << r7);
        r2[r18] = (r2[r18] & (~(255 << r27))) | (128 << r27);
        r8[r28] = r8[r6];
        r8[r6] = 0;
        r9[r28] = r9[r6];
        r9[r6] = 0;
        r1 = r6;
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r3 = -862048943;
        r0 = r37;
        r13 = r6;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0177, code lost:
    
        r18 = r9;
        r2[r3] = ((r25 & 127) << r7) | (r19 & (~(255 << r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0186, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0188, code lost:
    
        r13 = j.AbstractC0478D.b(r2, r6 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0190, code lost:
    
        r8[r13] = r8[r28];
        r8[r28] = r8[r6];
        r8[r6] = r8[r13];
        r18[r13] = r18[r28];
        r18[r28] = r18[r6];
        r18[r6] = r18[r13];
        r1 = r6 - 1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018f, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        r36 = r15;
        r15 = r15 + 1;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c6, code lost:
    
        r1 = r0;
        r19 = 0;
        r1.f5181f = j.AbstractC0478D.c(r1.f5179d) - r1.f5180e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025d, code lost:
    
        r2 = r1.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0261, code lost:
    
        r3 = 1;
        r1.f5180e++;
        r0 = r1.f5181f;
        r4 = r1.f5176a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027c, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027f, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0281, code lost:
    
        r1.f5181f = r0 - r3;
        r0 = r1.f5179d;
        r6 = (r6 & (~(255 << r8))) | (r21 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d6, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d7, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01de, code lost:
    
        r0 = j.AbstractC0478D.d(r1.f5179d);
        r2 = r1.f5176a;
        r3 = r1.f5177b;
        r5 = r1.f5178c;
        r6 = r1.f5179d;
        r1.e(r0);
        r0 = r1.f5176a;
        r7 = r1.f5177b;
        r8 = r1.f5178c;
        r9 = r1.f5179d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f9, code lost:
    
        if (r10 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020a, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r11) >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020c, code lost:
    
        r14 = r3[r10];
        r15 = java.lang.Integer.hashCode(r14) * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r13 = r1.b(r15 >>> 7);
        r11 = r15 & 127;
        r15 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r18 = r2;
        r27 = r3;
        r2 = (r0[r15] & (~(255 << r16))) | (r11 << r16);
        r0[r15] = r2;
        r0[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r13] = r14;
        r8[r13] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0254, code lost:
    
        r10 = r10 + 1;
        r2 = r18;
        r3 = r27;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024d, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01da, code lost:
    
        r1 = r0;
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0093, code lost:
    
        r1 = r0;
        r21 = r9;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3, int i4) {
        C0496n c0496n;
        int i5;
        C0496n c0496n2 = this;
        int i6 = i3;
        int i7 = -862048943;
        int hashCode = Integer.hashCode(i3) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = c0496n2.f5179d;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = c0496n2.f5176a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            int i16 = i13;
            long j3 = (((-i15) >> 63) & (jArr[i14 + 1] << (64 - i15))) | (jArr[i14] >>> i15);
            long j4 = i10;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
                if (c0496n2.f5177b[numberOfTrailingZeros] == i6) {
                    c0496n = c0496n2;
                    i5 = numberOfTrailingZeros;
                    break loop0;
                }
                j6 &= j6 - 1;
            }
            i13 = i16 + 8;
            i12 = (i12 + i13) & i11;
            c0496n2 = c0496n2;
            i6 = i3;
        }
        if (i5 < 0) {
            i5 = ~i5;
        }
        c0496n.f5177b[i5] = i3;
        c0496n.f5178c[i5] = i4;
    }

    public final int hashCode() {
        int[] iArr = this.f5177b;
        int[] iArr2 = this.f5178c;
        long[] jArr = this.f5176a;
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
                            int i8 = (i4 << 3) + i7;
                            int i9 = iArr[i8];
                            i5 += Integer.hashCode(iArr2[i8]) ^ Integer.hashCode(i9);
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
        if (this.f5180e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f5177b;
        int[] iArr2 = this.f5178c;
        long[] jArr = this.f5176a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j3) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr[i7];
                            int i9 = iArr2[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(i9);
                            i4++;
                            if (i4 < this.f5180e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        Z1.i.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
