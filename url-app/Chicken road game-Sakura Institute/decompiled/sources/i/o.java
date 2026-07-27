package i;

import A.AbstractC0017m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6932a = AbstractC0664E.f6891a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6933b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f6934c;

    /* renamed from: d, reason: collision with root package name */
    public int f6935d;

    /* renamed from: e, reason: collision with root package name */
    public int f6936e;

    /* renamed from: f, reason: collision with root package name */
    public int f6937f;

    public o() {
        int[] iArr = k.f6923a;
        this.f6933b = iArr;
        this.f6934c = iArr;
        e(AbstractC0664E.f(6));
    }

    public final void a() {
        this.f6936e = 0;
        long[] jArr = this.f6932a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6932a;
            int i2 = this.f6935d;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        this.f6937f = AbstractC0664E.c(this.f6935d) - this.f6936e;
    }

    public final int b(int i2) {
        int i4 = this.f6935d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6932a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j4 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j5 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i5 + (Long.numberOfTrailingZeros(j5) >> 3)) & i4;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final int c(int i2) {
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6935d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.f6932a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                if (this.f6933b[numberOfTrailingZeros] == i2) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    public final int d(int i2) {
        int c4 = c(i2);
        if (c4 >= 0) {
            return this.f6934c[c4];
        }
        throw new NoSuchElementException(AbstractC0017m.g(i2, "Cannot find value for key "));
    }

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6935d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6932a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6937f = AbstractC0664E.c(this.f6935d) - this.f6936e;
        this.f6933b = new int[max];
        this.f6934c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f6936e != this.f6936e) {
            return false;
        }
        int[] iArr = this.f6933b;
        int[] iArr2 = this.f6934c;
        long[] jArr = this.f6932a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (iArr2[i6] != oVar.d(iArr[i6])) {
                                return false;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r2 = r0.b(r6);
        r7 = 128;
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r0.f6937f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (((r0.f6932a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r2 = r0.f6935d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r13 = r0.f6936e;
        r4 = y2.y.f11688e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (java.lang.Long.compareUnsigned(r13 * 32, r2 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r2 = r0.f6932a;
        r3 = r0.f6935d;
        r4 = r0.f6933b;
        r13 = r0.f6934c;
        i.AbstractC0664E.a(r2, r3);
        r14 = 0;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r14 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        r22 = r14 >> 3;
        r25 = (r14 & 7) << 3;
        r23 = (r2[r22] >> r25) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r23 != r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r23 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r23 = java.lang.Integer.hashCode(r4[r14]) * r5;
        r5 = (r23 ^ (r23 << 16)) >>> 7;
        r26 = r0.b(r5);
        r5 = r5 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        if ((((r26 - r5) & r3) / 8) != (((r14 - r5) & r3) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        r33 = r11;
        r35 = r6;
        r2[r22] = (r2[r22] & (~(255 << r25))) | ((r23 & 127) << r25);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
    
        r11 = r33;
        r6 = r35;
        r5 = -862048943;
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        r35 = r6;
        r33 = r11;
        r5 = r26 >> 3;
        r6 = r2[r5];
        r11 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        if (((r6 >> r11) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:
    
        r27 = r13;
        r2[r5] = ((r23 & 127) << r11) | (r6 & (~(255 << r11)));
        r2[r22] = (r2[r22] & (~(255 << r25))) | (128 << r25);
        r4[r26] = r4[r14];
        r4[r14] = 0;
        r27[r26] = r27[r14];
        r27[r14] = 0;
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b0, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r14 = r14 + 1;
        r0 = r39;
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r27 = r13;
        r2[r5] = ((r23 & 127) << r11) | (r6 & (~(255 << r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0187, code lost:
    
        if (r15 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0189, code lost:
    
        r0 = i.AbstractC0664E.b(r2, r14 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0195, code lost:
    
        r4[r0] = r4[r26];
        r4[r26] = r4[r14];
        r4[r14] = r4[r0];
        r27[r0] = r27[r26];
        r27[r26] = r27[r14];
        r27[r14] = r27[r0];
        r14 = r14 - 1;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
    
        r15 = r14;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c8, code lost:
    
        r33 = r11;
        r0.f6937f = i.AbstractC0664E.c(r0.f6935d) - r0.f6936e;
        r2 = r6;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0263, code lost:
    
        r2 = r0.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0267, code lost:
    
        r0.f6936e += r3;
        r1 = r0.f6937f;
        r4 = r0.f6932a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0284, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0285, code lost:
    
        r0.f6937f = r1 - r3;
        r1 = r0.f6935d;
        r6 = (r6 & (~(255 << r8))) | (r33 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dd, code lost:
    
        r33 = r11;
        r1 = i.AbstractC0664E.d(r0.f6935d);
        r2 = r0.f6932a;
        r3 = r0.f6933b;
        r4 = r0.f6934c;
        r5 = r0.f6935d;
        r0.e(r1);
        r1 = r0.f6932a;
        r7 = r0.f6933b;
        r8 = r0.f6934c;
        r11 = r0.f6935d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fc, code lost:
    
        if (r12 >= r5) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020c, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & r9) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x020e, code lost:
    
        r13 = r3[r12];
        r14 = java.lang.Integer.hashCode(r13) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r6 = r0.b(r14 >>> 7);
        r9 = r14 & 127;
        r14 = r6 >> 3;
        r19 = (r6 & 7) << 3;
        r23 = r2;
        r24 = r3;
        r2 = (r1[r14] & (~(255 << r19))) | (r9 << r19);
        r1[r14] = r2;
        r1[(((r6 - 7) & r11) + (r11 & 7)) >> 3] = r2;
        r7[r6] = r13;
        r8[r6] = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0257, code lost:
    
        r12 = r12 + 1;
        r2 = r23;
        r3 = r24;
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024f, code lost:
    
        r23 = r2;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0260, code lost:
    
        r3 = 1;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0092, code lost:
    
        r33 = r11;
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i2, int i4) {
        int i5;
        o oVar = this;
        int i6 = i2;
        int i7 = 1;
        int i8 = -862048943;
        int hashCode = Integer.hashCode(i2) * (-862048943);
        int i9 = hashCode ^ (hashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = oVar.f6935d;
        int i13 = i10 & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = oVar.f6932a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = i14;
            long j4 = (((-i16) >> 63) & (jArr[i15 + i7] << (64 - i16))) | (jArr[i15] >>> i16);
            long j5 = i11;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                if (oVar.f6933b[numberOfTrailingZeros] == i6) {
                    i5 = numberOfTrailingZeros;
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i7 = 1;
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
            i6 = i2;
            i8 = i8;
        }
        if (i5 < 0) {
            i5 = ~i5;
        }
        oVar.f6933b[i5] = i2;
        oVar.f6934c[i5] = i4;
    }

    public final int hashCode() {
        int[] iArr = this.f6933b;
        int[] iArr2 = this.f6934c;
        long[] jArr = this.f6932a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i8 = (i4 << 3) + i7;
                            int i9 = iArr[i8];
                            i5 += Integer.hashCode(iArr2[i8]) ^ Integer.hashCode(i9);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        return i5;
                    }
                }
                if (i4 == length) {
                    i2 = i5;
                    break;
                }
                i4++;
            }
        }
        return i2;
    }

    public final String toString() {
        if (this.f6936e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f6933b;
        int[] iArr2 = this.f6934c;
        long[] jArr = this.f6932a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i4 = 0;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i2 << 3) + i6;
                            int i8 = iArr[i7];
                            int i9 = iArr2[i7];
                            sb.append(i8);
                            sb.append("=");
                            sb.append(i9);
                            i4++;
                            if (i4 < this.f6936e) {
                                sb.append(", ");
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "s.append('}').toString()");
        return sb2;
    }
}
