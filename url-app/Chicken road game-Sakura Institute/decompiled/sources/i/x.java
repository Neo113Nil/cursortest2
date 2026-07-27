package i;

import j.AbstractC0705a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6976a = AbstractC0664E.f6891a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6977b = AbstractC0705a.f7121c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f6978c = l.f6924a;

    /* renamed from: d, reason: collision with root package name */
    public int f6979d;

    /* renamed from: e, reason: collision with root package name */
    public int f6980e;

    /* renamed from: f, reason: collision with root package name */
    public int f6981f;

    public x(int i2) {
        if (i2 >= 0) {
            d(AbstractC0664E.f(i2));
        } else {
            AbstractC0705a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i2) {
        int i4 = this.f6979d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6976a;
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

    public final int b(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6979d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6976a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i6;
                if (Intrinsics.a(this.f6977b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i7 = i8 + i2;
        }
    }

    public final long c(Object obj) {
        int b4 = b(obj);
        if (b4 >= 0) {
            return this.f6978c[b4];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6979d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6976a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6981f = AbstractC0664E.c(this.f6979d) - this.f6980e;
        this.f6977b = new Object[max];
        this.f6978c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r2 = r0.a(r6);
        r7 = 128;
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r0.f6981f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (((r0.f6976a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        r2 = r0.f6979d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r13 = r0.f6980e;
        r4 = y2.y.f11688e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (java.lang.Long.compareUnsigned(r13 * 32, r2 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r2 = r0.f6976a;
        r3 = r0.f6979d;
        r4 = r0.f6977b;
        r13 = r0.f6978c;
        i.AbstractC0664E.a(r2, r3);
        r14 = 0;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        if (r14 == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r17 = r14 >> 3;
        r27 = (r14 & 7) << 3;
        r25 = (r2[r17] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r25 != r7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r25 == 254) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r25 = r4[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r25 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        r25 = r25.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        r25 = r25 * r5;
        r5 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = r0.a(r5);
        r5 = r5 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        if ((((r28 - r5) & r3) / 8) != (((r14 - r5) & r3) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0115, code lost:
    
        r35 = r11;
        r37 = r6;
        r2[r17] = (r2[r17] & (~(255 << r27))) | ((r25 & 127) << r27);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        r11 = r35;
        r6 = r37;
        r5 = -862048943;
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        r37 = r6;
        r35 = r11;
        r5 = r28 >> 3;
        r6 = r2[r5];
        r11 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0157, code lost:
    
        if (((r6 >> r11) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        r29 = r13;
        r2[r5] = ((r25 & 127) << r11) | (r6 & (~(255 << r11)));
        r2[r17] = (r2[r17] & (~(255 << r27))) | (128 << r27);
        r4[r28] = r4[r14];
        r4[r14] = null;
        r29[r28] = r29[r14];
        r29[r14] = 0;
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ba, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "<this>");
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r14 = r14 + 1;
        r0 = r41;
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0183, code lost:
    
        r29 = r13;
        r2[r5] = ((r25 & 127) << r11) | (r6 & (~(255 << r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        if (r15 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0193, code lost:
    
        r0 = i.AbstractC0664E.b(r2, r14 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019f, code lost:
    
        r4[r0] = r4[r28];
        r4[r28] = r4[r14];
        r4[r14] = r4[r0];
        r29[r0] = r29[r28];
        r29[r28] = r29[r14];
        r29[r14] = r29[r0];
        r14 = r14 - 1;
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019b, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ee, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d2, code lost:
    
        r15 = r14;
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
    
        r35 = r11;
        r0.f6981f = i.AbstractC0664E.c(r0.f6979d) - r0.f6980e;
        r2 = r6;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0272, code lost:
    
        r2 = r0.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0276, code lost:
    
        r0.f6980e += r3;
        r1 = r0.f6981f;
        r4 = r0.f6976a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0290, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0293, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0294, code lost:
    
        r0.f6981f = r1 - r3;
        r1 = r0.f6979d;
        r6 = (r6 & (~(255 << r8))) | (r35 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e7, code lost:
    
        r35 = r11;
        r6 = 0;
        r1 = i.AbstractC0664E.d(r0.f6979d);
        r2 = r0.f6976a;
        r3 = r0.f6977b;
        r4 = r0.f6978c;
        r5 = r0.f6979d;
        r0.d(r1);
        r1 = r0.f6976a;
        r7 = r0.f6977b;
        r8 = r0.f6978c;
        r11 = r0.f6979d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0206, code lost:
    
        if (r12 >= r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0216, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & r9) >= 128) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0218, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021a, code lost:
    
        if (r13 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021c, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0226, code lost:
    
        r14 = r14 * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r6 = r0.a(r14 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0266, code lost:
    
        r12 = r12 + 1;
        r2 = r23;
        r3 = r24;
        r6 = 0;
        r9 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0224, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025e, code lost:
    
        r23 = r2;
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026f, code lost:
    
        r3 = 1;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0096, code lost:
    
        r35 = r11;
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(long j4, Object obj) {
        int i2;
        x xVar = this;
        Object obj2 = obj;
        int i4 = 1;
        int i5 = -862048943;
        int hashCode = obj.hashCode() * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = xVar.f6979d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = xVar.f6976a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = i11;
            long j5 = (((-i13) >> 63) & (jArr[i12 + i4] << (64 - i13))) | (jArr[i12] >>> i13);
            long j6 = i8;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j8 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                if (Intrinsics.a(xVar.f6977b[numberOfTrailingZeros], obj2)) {
                    i2 = numberOfTrailingZeros;
                    break loop0;
                }
                j8 &= j8 - 1;
            }
            i4 = 1;
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            obj2 = obj;
            i5 = i5;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        xVar.f6977b[i2] = obj;
        xVar.f6978c[i2] = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f6980e != this.f6980e) {
            return false;
        }
        Object[] objArr = this.f6977b;
        long[] jArr = this.f6978c;
        long[] jArr2 = this.f6976a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j4 = jArr2[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (jArr[i6] != xVar.c(objArr[i6])) {
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

    public final int hashCode() {
        Object[] objArr = this.f6977b;
        long[] jArr = this.f6978c;
        long[] jArr2 = this.f6976a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i8]);
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
        int i2;
        int i4;
        if (this.f6980e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6977b;
        long[] jArr = this.f6978c;
        long[] jArr2 = this.f6976a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j4 = jArr2[i5];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((255 & j4) < 128) {
                            int i9 = (i5 << 3) + i8;
                            Object obj = objArr[i9];
                            i4 = i5;
                            long j5 = jArr[i9];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j5);
                            i6++;
                            if (i6 < this.f6980e) {
                                sb.append(", ");
                            }
                        } else {
                            i4 = i5;
                        }
                        j4 >>= 8;
                        i8++;
                        i5 = i4;
                    }
                    int i10 = i5;
                    if (i7 != 8) {
                        break;
                    }
                    i2 = i10;
                } else {
                    i2 = i5;
                }
                if (i2 == length) {
                    break;
                }
                i5 = i2 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "s.append('}').toString()");
        return sb2;
    }
}
