package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qv {
    public long[] a = qw.a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    private int f;

    public qv(int i) {
        Object[] objArr = rb.b;
        this.b = objArr;
        this.c = objArr;
        f(i);
    }

    private final int d(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void e() {
        this.f = qw.a(this.d) - this.e;
    }

    private final void f(int i) {
        int i2;
        long[] jArr;
        Object[] objArr;
        int i3 = 0;
        if (i > 0) {
            long[] jArr2 = qw.a;
            i2 = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            i2 = 0;
        }
        this.d = i2;
        if (i2 == 0) {
            jArr = qw.a;
        } else {
            jArr = new long[(i2 + 15) >> 3];
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            int i4 = i2 >> 3;
            long j = 255 << ((i2 & 7) << 3);
            jArr[i4] = (jArr[i4] & (~j)) | j;
        }
        this.a = jArr;
        e();
        if (i2 == 0) {
            objArr = rb.b;
        } else {
            i3 = i2;
            objArr = new Object[i2];
        }
        this.b = objArr;
        this.c = i3 == 0 ? rb.b : new Object[i3];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int i3 = this.d;
        int i4 = hashCode * (-862048943);
        int i5 = (i4 ^ (i4 << 16)) >>> 7;
        loop0: while (true) {
            int i6 = i5 & i3;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ ((r1 & 127) * 72340172838076673L);
            long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i3;
                if (ksp.b(this.b[i], obj)) {
                    break loop0;
                }
                j3 &= (-1) + j3;
            }
            i2 += 8;
            i5 = i6 + i2;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        int i = this.d;
        int i2 = hashCode * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = ((i3 & 127) * 72340172838076673L) ^ j;
            long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (!ksp.b(this.b[numberOfTrailingZeros], obj)) {
                    j3 &= (-1) + j3;
                } else if (numberOfTrailingZeros >= 0) {
                    return true;
                }
            }
            i5 += 8;
            i4 = (i4 + i5) & i;
            i3 = i8;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        r2 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r32.f != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (((r32.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
    
        r2 = r32.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r2 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (java.lang.Long.compare((r32.e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r2 = r32.a;
        r3 = r32.d;
        r5 = r32.b;
        r6 = r32.c;
        r14 = r3 + 7;
        r24 = 255;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r9 >= (r14 >> 3)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        r10 = r2[r9] & (-9187201950435737472L);
        r2[r9] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r9 = r9 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        r26 = r12;
        r9 = defpackage.ixc.H(r2);
        r10 = r9 - 1;
        r2[r10] = (r2[r10] & 72057594037927935L) | (-72057594037927936L);
        r2[r9] = r2[r26];
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (r9 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
    
        r10 = r9 >> 3;
        r13 = (r9 & 7) << 3;
        r11 = (r2[r10] >> r13) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
    
        if (r11 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0120, code lost:
    
        if (r11 == 254) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        r11 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0125, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
    
        r11 = r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:
    
        r11 = r11 * r21;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 & 127;
        r11 = r11 >>> 7;
        r14 = d(r11);
        r11 = r11 & r3;
        r17 = r15;
        r16 = r2;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
    
        if ((((r14 - r11) & r3) / 8) != (((r9 - r11) & r3) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        r16[r10] = (r1 << r13) | ((~(255 << r13)) & r16[r10]);
        r16[defpackage.ixc.H(r16)] = r16[r26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0160, code lost:
    
        r9 = r9 + 1;
        r2 = r16;
        r15 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0169, code lost:
    
        r11 = r14 >> 3;
        r28 = r16[r11];
        r12 = (r14 & 7) << 3;
        r1 = r1 << r12;
        r1 = r28 & (~(255 << r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
    
        if (((r28 >> r12) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0181, code lost:
    
        r1 = ~(255 << r13);
        r16[r11] = r1 | r1;
        r16[r10] = (r1 & r16[r10]) | (128 << r13);
        r5[r14] = r5[r9];
        r5[r9] = null;
        r6[r14] = r6[r9];
        r6[r9] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b8, code lost:
    
        r16[defpackage.ixc.H(r16)] = r16[r26];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a0, code lost:
    
        r16[r11] = r1 | r1;
        r1 = r5[r14];
        r5[r14] = r5[r9];
        r5[r9] = r1;
        r1 = r6[r14];
        r6[r14] = r6[r9];
        r6[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011b, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
    
        r17 = r15;
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x024d, code lost:
    
        r2 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025c, code lost:
    
        r32.e++;
        r1 = r32.f;
        r3 = r32.a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0274, code lost:
    
        if (((r5 >> r9) & r24) != r18) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
    
        r17 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0279, code lost:
    
        r32.f = r1 - r17;
        r1 = r32.d;
        r5 = (r5 & (~(r24 << r9))) | (r7 << r9);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r11 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ca, code lost:
    
        r24 = 255;
        r26 = 0;
        r17 = 1;
        r1 = defpackage.qw.b(r32.d);
        r2 = r32.a;
        r3 = r32.b;
        r5 = r32.c;
        r6 = r32.d;
        f(r1);
        r1 = r32.a;
        r9 = r32.b;
        r10 = r32.c;
        r11 = r32.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ed, code lost:
    
        if (r12 >= r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01fc, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r18) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01fe, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0200, code lost:
    
        if (r13 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0202, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0209, code lost:
    
        r14 = r14 * r21;
        r15 = d((r14 ^ (r14 << 16)) >>> 7);
        r16 = r15 >> 3;
        r20 = (r15 & 7) << 3;
        r29 = r1;
        r28 = r2;
        r1 = (r1[r16] & (~(255 << r20))) | ((r14 & 127) << r20);
        r29[r16] = r1;
        r29[(((r15 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r15] = r13;
        r10[r15] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0246, code lost:
    
        r12 = r12 + 1;
        r2 = r28;
        r1 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0207, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0242, code lost:
    
        r29 = r1;
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c8, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0252, code lost:
    
        r24 = 255;
        r26 = 0;
        r17 = 1;
        r18 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, Object obj2) {
        int i;
        int i2;
        Object obj3 = obj;
        int i3 = -862048943;
        int hashCode = obj3.hashCode() * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j = jArr[i9] >>> i10;
            int i11 = 1;
            long j2 = jArr[i9 + 1] << (64 - i10);
            int i12 = i8;
            int i13 = 0;
            long j3 = i4 & 127;
            long j4 = (j2 & ((-i10) >> 63)) | j;
            long j5 = (72340172838076673L * j3) ^ j4;
            long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
            while (true) {
                if (j6 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j6) >> 3) + i7) & i6;
                int i14 = i3;
                if (ksp.b(this.b[i2], obj3)) {
                    break loop0;
                }
                j6 &= j6 - 1;
                i3 = i14;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
            obj3 = obj;
            i3 = i;
        }
        if (i2 < 0) {
            i2 = ~i2;
        }
        this.b[i2] = obj;
        this.c[i2] = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        if (qvVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj2 = objArr[i5];
                                Object obj3 = objArr2[i5];
                                if (obj3 == null) {
                                    if (qvVar.a(obj2) != null || !qvVar.b(obj2)) {
                                        break loop0;
                                    }
                                } else if (!ksp.b(obj3, qvVar.a(obj2))) {
                                    return false;
                                }
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        i3 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    public final String toString() {
        int i;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = (~(i2 - length)) >>> 31;
                    int i5 = 0;
                    while (true) {
                        i = 8 - i4;
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i3++;
                            if (i3 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
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
        return sb.toString();
    }

    public qv() {
        Object[] objArr = rb.b;
        this.b = objArr;
        this.c = objArr;
    }
}
