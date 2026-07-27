package i;

import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6951a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6952b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6953c;

    /* renamed from: d, reason: collision with root package name */
    public int f6954d;

    /* renamed from: e, reason: collision with root package name */
    public int f6955e;

    /* renamed from: f, reason: collision with root package name */
    public int f6956f;

    public final int a(int i2) {
        int i4 = this.f6954d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6951a;
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j4) {
        int i2;
        int hashCode = Long.hashCode(j4) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6954d;
        int i7 = (i4 >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f6951a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = (i5 * 72340172838076673L) ^ j5;
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j7 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                if (this.f6952b[i2] == j4) {
                    break loop0;
                }
                j7 &= j7 - 1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (i2 >= 0) {
            return this.f6953c[i2];
        }
        return null;
    }

    public final void c(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6954d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6951a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6956f = AbstractC0664E.c(this.f6954d) - this.f6955e;
        this.f6952b = new long[max];
        this.f6953c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1 = a(r5);
        r6 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r41.f6956f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        if (((r41.f6951a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        r1 = r41.f6954d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r1 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        r12 = r41.f6955e;
        r3 = y2.y.f11688e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (java.lang.Long.compareUnsigned(r12 * 32, r1 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        r1 = r41.f6951a;
        r2 = r41.f6954d;
        r3 = r41.f6952b;
        r12 = r41.f6953c;
        i.AbstractC0664E.a(r1, r2);
        r13 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r13 == r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        r16 = r13 >> 3;
        r26 = (r13 & 7) << 3;
        r24 = (r1[r16] >> r26) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r24 != r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
    
        if (r24 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e1, code lost:
    
        r24 = java.lang.Long.hashCode(r3[r13]) * r4;
        r15 = (r24 ^ (r24 << 16)) >>> 7;
        r27 = a(r15);
        r15 = r15 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010a, code lost:
    
        if ((((r27 - r15) & r2) / 8) != (((r13 - r15) & r2) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r35 = r10;
        r37 = r5;
        r1[r16] = (r1[r16] & (~(255 << r26))) | ((r24 & 127) << r26);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
    
        r10 = r35;
        r5 = r37;
        r4 = -862048943;
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0139, code lost:
    
        r37 = r5;
        r35 = r10;
        r4 = r27 >> 3;
        r10 = r1[r4];
        r5 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (((r10 >> r5) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        r1[r4] = ((~(255 << r5)) & r10) | ((r24 & 127) << r5);
        r1[r16] = (r1[r16] & (~(255 << r26))) | (128 << r26);
        r3[r27] = r3[r13];
        r3[r13] = 0;
        r12[r27] = r12[r13];
        r12[r13] = null;
        r16 = r3;
        r14 = r13;
        r3 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01be, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3);
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r13 = r13 + 1;
        r3 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
    
        r15 = r2;
        r16 = r3;
        r1[r4] = ((~(255 << r5)) & r10) | ((r24 & 127) << r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0191, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0193, code lost:
    
        r2 = r15;
        r3 = i.AbstractC0664E.b(r1, r13 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a1, code lost:
    
        r16[r3] = r16[r27];
        r16[r27] = r16[r13];
        r16[r13] = r16[r3];
        r12[r3] = r12[r27];
        r12[r27] = r12[r13];
        r12[r13] = r12[r3];
        r13 = r13 - 1;
        r14 = r3;
        r3 = "<this>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019c, code lost:
    
        r2 = r15;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00de, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        r14 = r13;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d3, code lost:
    
        r35 = r10;
        r25 = 0;
        r41.f6956f = i.AbstractC0664E.c(r41.f6954d) - r41.f6955e;
        r1 = r5;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026d, code lost:
    
        r1 = a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0271, code lost:
    
        r41.f6955e += r2;
        r3 = r41.f6956f;
        r4 = r41.f6951a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x028b, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028e, code lost:
    
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0290, code lost:
    
        r41.f6956f = r3 - r2;
        r2 = r41.f6954d;
        r6 = (r6 & (~(255 << r8))) | (r35 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e9, code lost:
    
        r37 = r5;
        r35 = r10;
        r25 = 0;
        r1 = i.AbstractC0664E.d(r41.f6954d);
        r2 = r41.f6951a;
        r3 = r41.f6952b;
        r4 = r41.f6953c;
        r5 = r41.f6954d;
        c(r1);
        r1 = r41.f6951a;
        r6 = r41.f6952b;
        r7 = r41.f6953c;
        r10 = r41.f6954d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020a, code lost:
    
        if (r11 >= r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x021a, code lost:
    
        if (((r2[r11 >> 3] >> ((r11 & 7) << 3)) & r8) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x021c, code lost:
    
        r12 = r3[r11];
        r14 = java.lang.Long.hashCode(r12) * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r8 = r14 & 127;
        r14 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r22 = r2;
        r23 = r3;
        r2 = (r1[r14] & (~(255 << r18))) | (r8 << r18);
        r1[r14] = r2;
        r1[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r2;
        r6[r15] = r12;
        r7[r15] = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0262, code lost:
    
        r11 = r11 + 1;
        r2 = r22;
        r3 = r23;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x025d, code lost:
    
        r22 = r2;
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026a, code lost:
    
        r2 = 1;
        r1 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0090, code lost:
    
        r35 = r10;
        r2 = 1;
        r25 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j4, w wVar) {
        int i2;
        int i4 = 1;
        int i5 = -862048943;
        int hashCode = Long.hashCode(j4) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f6954d;
        int i10 = i7 & i9;
        int i11 = 0;
        loop0: while (true) {
            long[] jArr = this.f6951a;
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
                i2 = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                if (this.f6952b[i2] == j4) {
                    break loop0;
                } else {
                    j8 &= j8 - 1;
                }
            }
            i4 = 1;
            i11 = i14 + 8;
            i10 = (i10 + i11) & i9;
            i7 = i7;
            i5 = -862048943;
        }
        this.f6952b[i2] = j4;
        this.f6953c[i2] = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        r26 = r2;
        r7 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e2, code lost:
    
        r21 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i4;
        int i5;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        int i6;
        int i7;
        long j4;
        int i8;
        int i9;
        int i10;
        if (obj == this) {
            return true;
        }
        int i11 = 0;
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (sVar.f6955e != this.f6955e) {
            return false;
        }
        long[] jArr5 = this.f6952b;
        Object[] objArr3 = this.f6953c;
        long[] jArr6 = this.f6951a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j5 = jArr6[i12];
            int i13 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                while (i11 < i15) {
                    if ((j5 & 255) < 128) {
                        int i16 = (i12 << 3) + i11;
                        long j7 = jArr5[i16];
                        Object obj2 = objArr3[i16];
                        if (obj2 != null) {
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            jArr4 = jArr6;
                            i6 = length;
                            i7 = i12;
                            j4 = -9187201950435737472L;
                            if (!obj2.equals(sVar.b(j7))) {
                                return false;
                            }
                        } else {
                            if (sVar.b(j7) != null) {
                                return false;
                            }
                            int hashCode = Long.hashCode(j7) * (-862048943);
                            int i17 = hashCode ^ (hashCode << 16);
                            int i18 = i17 & 127;
                            int i19 = sVar.f6954d;
                            int i20 = (i17 >>> i13) & i19;
                            int i21 = 0;
                            while (true) {
                                long[] jArr7 = sVar.f6951a;
                                int i22 = i20 >> 3;
                                jArr3 = jArr5;
                                int i23 = (i20 & 7) << 3;
                                long j8 = jArr7[i22] >>> i23;
                                long j9 = jArr7[i22 + 1] << (64 - i23);
                                objArr2 = objArr3;
                                jArr4 = jArr6;
                                long j10 = j8 | (j9 & ((-i23) >> 63));
                                i6 = length;
                                i7 = i12;
                                long j11 = (i18 * 72340172838076673L) ^ j10;
                                long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
                                while (true) {
                                    if (j12 == 0) {
                                        break;
                                    }
                                    i10 = (i20 + (Long.numberOfTrailingZeros(j12) >> 3)) & i19;
                                    int i24 = i18;
                                    if (sVar.f6952b[i10] == j7) {
                                        j4 = -9187201950435737472L;
                                        break;
                                    }
                                    j12 &= j12 - 1;
                                    i18 = i24;
                                }
                                i21 += 8;
                                i20 = (i20 + i21) & i19;
                                length = i6;
                                objArr3 = objArr2;
                                i12 = i7;
                                jArr5 = jArr3;
                                jArr6 = jArr4;
                                i18 = i9;
                            }
                            if (!(i10 >= 0)) {
                                return false;
                            }
                        }
                        i8 = 8;
                    } else {
                        jArr3 = jArr5;
                        objArr2 = objArr3;
                        jArr4 = jArr6;
                        i6 = length;
                        i7 = i12;
                        j4 = j6;
                        i8 = i14;
                    }
                    j5 >>= i8;
                    i11++;
                    i14 = i8;
                    j6 = j4;
                    objArr3 = objArr2;
                    i12 = i7;
                    jArr6 = jArr4;
                    i13 = 7;
                    length = i6;
                    jArr5 = jArr3;
                }
                jArr = jArr5;
                objArr = objArr3;
                jArr2 = jArr6;
                i4 = length;
                int i25 = i12;
                i2 = 0;
                if (i15 != i14) {
                    return true;
                }
                i5 = i25;
            } else {
                jArr = jArr5;
                i2 = i11;
                objArr = objArr3;
                jArr2 = jArr6;
                i4 = length;
                i5 = i12;
            }
            if (i5 == i4) {
                return true;
            }
            i12 = i5 + 1;
            i11 = i2;
            length = i4;
            objArr3 = objArr;
            jArr5 = jArr;
            jArr6 = jArr2;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f6952b;
        Object[] objArr = this.f6953c;
        long[] jArr2 = this.f6951a;
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
                            long j5 = jArr[i8];
                            Object obj = objArr[i8];
                            i5 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j5);
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
        if (this.f6955e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f6952b;
        Object[] objArr = this.f6953c;
        long[] jArr2 = this.f6951a;
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
                            i4 = i5;
                            long j5 = jArr[i9];
                            Object obj = objArr[i9];
                            sb.append(j5);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i6++;
                            if (i6 < this.f6955e) {
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
