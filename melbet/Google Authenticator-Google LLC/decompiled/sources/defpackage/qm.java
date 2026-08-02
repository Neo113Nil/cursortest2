package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qm {
    public long[] a = qw.a;
    public long[] b = qp.a;
    public Object[] c = rb.b;
    public int d;
    public int e;
    public int f;

    public qm(int i) {
        d(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j) {
        int i;
        int g = pj.g(j) * (-862048943);
        int i2 = this.d;
        int i3 = ((g ^ (g << 16)) >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j3 = j2 ^ ((r0 & 127) * 72340172838076673L);
            long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.b[i] == j) {
                    break loop0;
                }
                j4 &= (-1) + j4;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (i >= 0) {
            return this.c[i];
        }
        return null;
    }

    public final int b(int i) {
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

    public final void c() {
        this.f = qw.a(this.d) - this.e;
    }

    public final void d(int i) {
        int i2;
        long[] jArr;
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
        }
        this.a = jArr;
        int i3 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        c();
        this.b = new long[i2];
        this.c = new Object[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7, types: [boolean] */
    public final boolean equals(Object obj) {
        long[] jArr;
        boolean z;
        long[] jArr2;
        int i;
        Object[] objArr;
        long[] jArr3;
        boolean z2;
        long[] jArr4;
        ?? r18;
        Object[] objArr2;
        long j;
        char c;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i2 = 0;
        if (!(obj instanceof qm)) {
            return false;
        }
        qm qmVar = (qm) obj;
        if (qmVar.e != this.e) {
            return false;
        }
        long[] jArr5 = this.b;
        Object[] objArr3 = this.c;
        long[] jArr6 = this.a;
        int length = jArr6.length - 2;
        if (length < 0) {
            return true;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr6[i3];
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = (~(i3 - length)) >>> 31;
                int i5 = i2;
                while (true) {
                    char c2 = '\b';
                    int i6 = 8 - i4;
                    if (i5 < i6) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i5;
                            z2 = z3;
                            jArr4 = jArr5;
                            long j4 = jArr4[i7];
                            Object obj2 = objArr3[i7];
                            if (obj2 != null) {
                                jArr3 = jArr6;
                                r18 = i2;
                                objArr2 = objArr3;
                                j = j3;
                                c = '\b';
                                if (!ksp.b(obj2, qmVar.a(j4))) {
                                    return r18;
                                }
                            } else {
                                if (qmVar.a(j4) != null) {
                                    return i2;
                                }
                                int g = pj.g(j4);
                                r18 = i2;
                                int i8 = qmVar.d;
                                int i9 = g * (-862048943);
                                int i10 = ((i9 ^ (i9 << 16)) >>> 7) & i8;
                                int i11 = r18 == true ? 1 : 0;
                                while (true) {
                                    j = j3;
                                    long[] jArr7 = qmVar.a;
                                    int i12 = i10 >> 3;
                                    c = c2;
                                    int i13 = (i10 & 7) << 3;
                                    int i14 = i8;
                                    objArr2 = objArr3;
                                    long j5 = (jArr7[i12] >>> i13) | ((jArr7[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                                    long j6 = ((r15 & 127) * 72340172838076673L) ^ j5;
                                    long j7 = (j6 - 72340172838076673L) & (~j6) & j;
                                    while (j7 != 0) {
                                        int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i14;
                                        jArr3 = jArr6;
                                        if (qmVar.b[numberOfTrailingZeros] != j4) {
                                            j7 &= j7 - 1;
                                            jArr6 = jArr3;
                                        } else if (numberOfTrailingZeros < 0) {
                                            return r18;
                                        }
                                    }
                                    long[] jArr8 = jArr6;
                                    if ((((~j5) << 6) & j5 & j) != 0) {
                                        return r18;
                                    }
                                    i11 += 8;
                                    i10 = (i10 + i11) & i14;
                                    j3 = j;
                                    c2 = c;
                                    jArr6 = jArr8;
                                    objArr3 = objArr2;
                                    i8 = i14;
                                }
                            }
                        } else {
                            jArr3 = jArr6;
                            z2 = z3;
                            jArr4 = jArr5;
                            r18 = i2;
                            objArr2 = objArr3;
                            j = j3;
                            c = '\b';
                        }
                        j2 >>= c;
                        i5++;
                        j3 = j;
                        z3 = z2;
                        jArr5 = jArr4;
                        i2 = r18;
                        jArr6 = jArr3;
                        objArr3 = objArr2;
                    } else {
                        jArr = jArr6;
                        z = z3;
                        jArr2 = jArr5;
                        i = i2;
                        objArr = objArr3;
                        if (i6 != 8) {
                            return z;
                        }
                    }
                }
            } else {
                jArr = jArr6;
                z = z3;
                jArr2 = jArr5;
                i = i2;
                objArr = objArr3;
            }
            if (i3 == length) {
                return z;
            }
            i3++;
            z3 = z;
            jArr5 = jArr2;
            i2 = i;
            jArr6 = jArr;
            objArr3 = objArr;
        }
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr2[i2];
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
                        long j2 = jArr[i6];
                        Object obj = objArr[i6];
                        i3 += (obj != null ? obj.hashCode() : 0) ^ pj.g(j2);
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
        int i2;
        int i3;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = (~(i4 - length)) >>> 31;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - i6;
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            Object obj = objArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public qm() {
    }
}
