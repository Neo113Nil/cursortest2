package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class eu implements Cloneable {
    public /* synthetic */ boolean f;
    public /* synthetic */ long[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public eu() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.g = new long[i4];
        this.h = new Object[i4];
    }

    public final void a() {
        int i = this.i;
        Object[] objArr = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.i = 0;
        this.f = false;
    }

    public final Object b(long j) {
        Object obj;
        int g = xf.g(this.g, this.i, j);
        if (g < 0 || (obj = this.h[g]) == mz.d) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.i)) {
            g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != mz.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f = false;
            this.i = i3;
        }
        return this.g[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        eu euVar = (eu) clone;
        euVar.g = (long[]) this.g.clone();
        euVar.h = (Object[]) this.h.clone();
        return euVar;
    }

    public final void d(long j, Object obj) {
        Object obj2 = mz.d;
        int g = xf.g(this.g, this.i, j);
        if (g >= 0) {
            this.h[g] = obj;
            return;
        }
        int i = ~g;
        int i2 = this.i;
        if (i < i2) {
            Object[] objArr = this.h;
            if (objArr[i] == obj2) {
                this.g[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f) {
            long[] jArr = this.g;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f = false;
                this.i = i3;
                i = ~xf.g(this.g, i3, j);
            }
        }
        int i5 = this.i;
        if (i5 >= this.g.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.g = Arrays.copyOf(this.g, i9);
            this.h = Arrays.copyOf(this.h, i9);
        }
        int i10 = this.i - i;
        if (i10 != 0) {
            long[] jArr2 = this.g;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.h;
            a7.Z(objArr3, objArr3, i11, i, this.i);
        }
        this.g[i] = j;
        this.h[i] = obj;
        this.i++;
    }

    public final int e() {
        if (this.f) {
            int i = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != mz.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f = false;
            this.i = i2;
        }
        return this.i;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.i)) {
            g9.d(f60.e("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.f) {
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != mz.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f = false;
            this.i = i3;
        }
        return this.h[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
