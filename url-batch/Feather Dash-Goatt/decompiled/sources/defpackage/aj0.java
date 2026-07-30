package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class aj0 implements Cloneable {
    public /* synthetic */ boolean d;
    public /* synthetic */ long[] e;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public aj0(int i) {
        if (i == 0) {
            this.e = p4.c;
            this.g = p4.d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.e = new long[i5];
        this.g = new Object[i5];
    }

    public final void a() {
        int i = this.h;
        Object[] objArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.h = 0;
        this.d = false;
    }

    public final Object b(long j) {
        Object obj;
        int p = p4.p(this.e, this.h, j);
        if (p < 0 || (obj = this.g[p]) == uq1.j) {
            return null;
        }
        return obj;
    }

    public final long c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            dd0.e(qy0.i(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.g;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != uq1.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.h = i3;
        }
        return this.e[i];
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        aj0 aj0Var = (aj0) clone;
        aj0Var.e = (long[]) this.e.clone();
        aj0Var.g = (Object[]) this.g.clone();
        return aj0Var;
    }

    public final void d(long j, Object obj) {
        Object obj2 = uq1.j;
        int p = p4.p(this.e, this.h, j);
        if (p >= 0) {
            this.g[p] = obj;
            return;
        }
        int i = ~p;
        int i2 = this.h;
        if (i < i2) {
            Object[] objArr = this.g;
            if (objArr[i] == obj2) {
                this.e[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.d) {
            long[] jArr = this.e;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.g;
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
                this.d = false;
                this.h = i3;
                i = ~p4.p(this.e, i3, j);
            }
        }
        int i5 = this.h;
        if (i5 >= this.e.length) {
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
            this.e = Arrays.copyOf(this.e, i9);
            this.g = Arrays.copyOf(this.g, i9);
        }
        int i10 = this.h;
        if (i10 - i != 0) {
            long[] jArr2 = this.e;
            int i11 = i + 1;
            w9.b(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.g;
            w9.c(objArr3, objArr3, i11, i, this.h);
        }
        this.e[i] = j;
        this.g[i] = obj;
        this.h++;
    }

    public final void e(long j) {
        int p = p4.p(this.e, this.h, j);
        if (p >= 0) {
            Object[] objArr = this.g;
            Object obj = objArr[p];
            Object obj2 = uq1.j;
            if (obj != obj2) {
                objArr[p] = obj2;
                this.d = true;
            }
        }
    }

    public final int f() {
        if (this.d) {
            int i = this.h;
            long[] jArr = this.e;
            Object[] objArr = this.g;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != uq1.j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.d = false;
            this.h = i2;
        }
        return this.h;
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            dd0.e(qy0.i(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.d) {
            long[] jArr = this.e;
            Object[] objArr = this.g;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != uq1.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.d = false;
            this.h = i3;
        }
        return this.g[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ aj0() {
        this(10);
    }
}
