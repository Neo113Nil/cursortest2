package i;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public long[] f4792a = e0.f4736a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4793b = j.a.f4968c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f4794c = g.f4741a;

    /* renamed from: d, reason: collision with root package name */
    public int f4795d;

    /* renamed from: e, reason: collision with root package name */
    public int f4796e;

    /* renamed from: f, reason: collision with root package name */
    public int f4797f;

    public t() {
        d(e0.f(6));
    }

    public final void a() {
        this.f4796e = 0;
        long[] jArr = this.f4792a;
        if (jArr != e0.f4736a) {
            e6.k.d0(jArr);
            long[] jArr2 = this.f4792a;
            int i7 = this.f4795d;
            int i8 = i7 >> 3;
            long j8 = 255 << ((i7 & 7) << 3);
            jArr2[i8] = (jArr2[i8] & (~j8)) | j8;
        }
        e6.k.c0(0, this.f4795d, null, this.f4793b);
        this.f4797f = e0.c(this.f4795d) - this.f4796e;
    }

    public final int b(int i7) {
        int i8 = this.f4795d;
        int i9 = i7 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr = this.f4792a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j8 = ((jArr[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr[i11] >>> i12);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
        }
    }

    public final int c(Object obj) {
        int i7 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = hashCode ^ (hashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f4795d;
        int i11 = i8 >>> 7;
        while (true) {
            int i12 = i11 & i10;
            long[] jArr = this.f4792a;
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (i9 * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i10;
                if (r6.k.a(this.f4793b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i11 = i12 + i7;
        }
    }

    public final void d(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, e0.e(i7)) : 0;
        this.f4795d = max;
        if (max == 0) {
            jArr = e0.f4736a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            e6.k.d0(jArr);
        }
        this.f4792a = jArr;
        int i8 = max >> 3;
        long j8 = 255 << ((max & 7) << 3);
        jArr[i8] = (jArr[i8] & (~j8)) | j8;
        this.f4797f = e0.c(this.f4795d) - this.f4796e;
        this.f4793b = new Object[max];
        this.f4794c = new float[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.f4796e != this.f4796e) {
            return false;
        }
        Object[] objArr = this.f4793b;
        float[] fArr = this.f4794c;
        long[] jArr = this.f4792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j8) < 128) {
                            int i10 = (i7 << 3) + i9;
                            Object obj2 = objArr[i10];
                            float f9 = fArr[i10];
                            int c4 = tVar.c(obj2);
                            if (c4 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f9 != tVar.f4794c[c4]) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.f4793b;
        float[] fArr = this.f4794c;
        long[] jArr = this.f4792a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr[i11];
                        i8 += Float.hashCode(fArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return i8;
                }
            }
            if (i7 == length) {
                return i8;
            }
            i7++;
        }
    }

    public final String toString() {
        if (this.f4796e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f4793b;
        float[] fArr = this.f4794c;
        long[] jArr = this.f4792a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j8 = jArr[i7];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i7 << 3) + i10;
                            Object obj = objArr[i11];
                            float f9 = fArr[i11];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f9);
                            i8++;
                            if (i8 < this.f4796e) {
                                sb.append(", ");
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r6.k.e(sb2, "s.append('}').toString()");
        return sb2;
    }
}
