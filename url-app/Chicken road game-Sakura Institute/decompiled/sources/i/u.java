package i;

import j.AbstractC0705a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6962a = AbstractC0664E.f6891a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6963b = AbstractC0705a.f7121c;

    /* renamed from: c, reason: collision with root package name */
    public float[] f6964c = AbstractC0672g.f6919a;

    /* renamed from: d, reason: collision with root package name */
    public int f6965d;

    /* renamed from: e, reason: collision with root package name */
    public int f6966e;

    /* renamed from: f, reason: collision with root package name */
    public int f6967f;

    public u() {
        d(AbstractC0664E.f(6));
    }

    public final void a() {
        this.f6966e = 0;
        long[] jArr = this.f6962a;
        if (jArr != AbstractC0664E.f6891a) {
            C1436t.m(jArr);
            long[] jArr2 = this.f6962a;
            int i2 = this.f6965d;
            int i4 = i2 >> 3;
            long j4 = 255 << ((i2 & 7) << 3);
            jArr2[i4] = (jArr2[i4] & (~j4)) | j4;
        }
        C1436t.k(this.f6963b, 0, this.f6965d);
        this.f6967f = AbstractC0664E.c(this.f6965d) - this.f6966e;
    }

    public final int b(int i2) {
        int i4 = this.f6965d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.f6962a;
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

    public final int c(Object obj) {
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 & 127;
        int i6 = this.f6965d;
        int i7 = i4 >>> 7;
        while (true) {
            int i8 = i7 & i6;
            long[] jArr = this.f6962a;
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j5 = (i5 * 72340172838076673L) ^ j4;
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i8) & i6;
                if (Intrinsics.a(this.f6963b[numberOfTrailingZeros], obj)) {
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

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, AbstractC0664E.e(i2)) : 0;
        this.f6965d = max;
        if (max == 0) {
            jArr = AbstractC0664E.f6891a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C1436t.m(jArr);
        }
        this.f6962a = jArr;
        int i4 = max >> 3;
        long j4 = 255 << ((max & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j4)) | j4;
        this.f6967f = AbstractC0664E.c(this.f6965d) - this.f6966e;
        this.f6963b = new Object[max];
        this.f6964c = new float[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f6966e != this.f6966e) {
            return false;
        }
        Object[] objArr = this.f6963b;
        float[] fArr = this.f6964c;
        long[] jArr = this.f6962a;
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
                            Object obj2 = objArr[i6];
                            float f4 = fArr[i6];
                            int c4 = uVar.c(obj2);
                            if (c4 < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f4 != uVar.f6964c[c4]) {
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
        Object[] objArr = this.f6963b;
        float[] fArr = this.f6964c;
        long[] jArr = this.f6962a;
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
                            Object obj = objArr[i8];
                            i5 += Float.hashCode(fArr[i8]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f6966e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f6963b;
        float[] fArr = this.f6964c;
        long[] jArr = this.f6962a;
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
                            Object obj = objArr[i7];
                            float f4 = fArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f4);
                            i4++;
                            if (i4 < this.f6966e) {
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
