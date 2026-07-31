package j;

import java.util.NoSuchElementException;
import k.AbstractC0561a;

/* renamed from: j.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6324a = AbstractC0522D.f6254a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6325b = AbstractC0561a.f6410c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f6326c = AbstractC0533g.f6282a;

    /* renamed from: d, reason: collision with root package name */
    public int f6327d;

    /* renamed from: e, reason: collision with root package name */
    public int f6328e;

    /* renamed from: f, reason: collision with root package name */
    public int f6329f;

    public C0546t() {
        d(AbstractC0522D.f(6));
    }

    public final void a() {
        this.f6328e = 0;
        long[] jArr = this.f6324a;
        if (jArr != AbstractC0522D.f6254a) {
            S1.k.s0(jArr);
            long[] jArr2 = this.f6324a;
            int i3 = this.f6327d;
            int i4 = i3 >> 3;
            long j3 = 255 << ((i3 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j3)) | j3;
        }
        S1.k.r0(this.f6325b, null, 0, this.f6327d);
        this.f6329f = AbstractC0522D.c(this.f6327d) - this.f6328e;
    }

    public final int b(int i3) {
        int i4 = this.f6327d;
        int i5 = i3 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6324a;
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

    public final int c(Object obj) {
        int i3 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6327d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6324a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j3 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j4 = (i5 * 72340172838076673L) ^ j3;
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i8) & i6;
                if (f2.j.a(this.f6325b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i7 = i8 + i3;
        }
    }

    public final void d(int i3) {
        long[] jArr;
        int max = i3 > 0 ? Math.max(7, AbstractC0522D.e(i3)) : 0;
        this.f6327d = max;
        if (max == 0) {
            jArr = AbstractC0522D.f6254a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            S1.k.s0(jArr);
        }
        this.f6324a = jArr;
        int i4 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j3)) | j3;
        this.f6329f = AbstractC0522D.c(this.f6327d) - this.f6328e;
        this.f6325b = new Object[max];
        this.f6326c = new float[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0546t)) {
            return false;
        }
        C0546t c0546t = (C0546t) obj;
        if (c0546t.f6328e != this.f6328e) {
            return false;
        }
        Object[] objArr = this.f6325b;
        float[] fArr = this.f6326c;
        long[] jArr = this.f6324a;
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
                            Object obj2 = objArr[i6];
                            float f3 = fArr[i6];
                            int c2 = c0546t.c(obj2);
                            if (c2 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f3 != c0546t.f6326c[c2]) {
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

    public final int hashCode() {
        Object[] objArr = this.f6325b;
        float[] fArr = this.f6326c;
        long[] jArr = this.f6324a;
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
                            Object obj = objArr[i8];
                            i5 += Float.hashCode(fArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f6328e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6325b;
        float[] fArr = this.f6326c;
        long[] jArr = this.f6324a;
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
                            Object obj = objArr[i7];
                            float f3 = fArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f3);
                            i4++;
                            if (i4 < this.f6328e) {
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
        f2.j.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
