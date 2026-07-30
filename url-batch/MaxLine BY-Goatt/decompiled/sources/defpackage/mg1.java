package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mg1 implements Cloneable {
    public /* synthetic */ boolean m;
    public /* synthetic */ long[] n;
    public /* synthetic */ Object[] o;
    public /* synthetic */ int p;

    public mg1(int i) {
        if (i == 0) {
            this.n = yk3.q;
            this.o = yk3.r;
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
        this.n = new long[i5];
        this.o = new Object[i5];
    }

    public final void a() {
        int i = this.p;
        Object[] objArr = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.p = 0;
        this.m = false;
    }

    public final long b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.p)) {
            lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.m) {
            long[] jArr = this.n;
            Object[] objArr = this.o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != o70.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.m = false;
            this.p = i3;
        }
        return this.n[i];
    }

    public final void c(long j, Object obj) {
        Object obj2 = o70.e;
        int p = yk3.p(this.n, this.p, j);
        if (p >= 0) {
            this.o[p] = obj;
            return;
        }
        int i = ~p;
        int i2 = this.p;
        if (i < i2) {
            Object[] objArr = this.o;
            if (objArr[i] == obj2) {
                this.n[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.m) {
            long[] jArr = this.n;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.o;
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
                this.m = false;
                this.p = i3;
                i = ~yk3.p(this.n, i3, j);
            }
        }
        int i5 = this.p;
        if (i5 >= this.n.length) {
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
            this.n = Arrays.copyOf(this.n, i9);
            this.o = Arrays.copyOf(this.o, i9);
        }
        int i10 = this.p;
        if (i10 - i != 0) {
            long[] jArr2 = this.n;
            int i11 = i + 1;
            ni.g(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.o;
            ni.e(i11, i, this.p, objArr3, objArr3);
        }
        this.n[i] = j;
        this.o[i] = obj;
        this.p++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        mg1 mg1Var = (mg1) clone;
        mg1Var.n = (long[]) this.n.clone();
        mg1Var.o = (Object[]) this.o.clone();
        return mg1Var;
    }

    public final void d(long j) {
        int p = yk3.p(this.n, this.p, j);
        if (p >= 0) {
            Object[] objArr = this.o;
            Object obj = objArr[p];
            Object obj2 = o70.e;
            if (obj != obj2) {
                objArr[p] = obj2;
                this.m = true;
            }
        }
    }

    public final int e() {
        if (this.m) {
            int i = this.p;
            long[] jArr = this.n;
            Object[] objArr = this.o;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != o70.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.m = false;
            this.p = i2;
        }
        return this.p;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.p)) {
            lh.e(in1.k(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.m) {
            long[] jArr = this.n;
            Object[] objArr = this.o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != o70.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.m = false;
            this.p = i3;
        }
        return this.o[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
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

    public /* synthetic */ mg1() {
        this(10);
    }
}
