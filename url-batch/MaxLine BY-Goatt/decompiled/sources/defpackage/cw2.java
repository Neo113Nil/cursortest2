package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cw2 {
    public final bw2 a;
    public t81 b = null;
    public t81 c;

    public cw2(bw2 bw2Var, t81 t81Var) {
        this.a = bw2Var;
        this.c = t81Var;
    }

    public final long a(long j) {
        w72 w72Var;
        t81 t81Var = this.b;
        w72 w72Var2 = w72.e;
        if (t81Var != null) {
            if (t81Var.y()) {
                t81 t81Var2 = this.c;
                w72Var = t81Var2 != null ? t81Var2.M(t81Var, true) : null;
            } else {
                w72Var = w72Var2;
            }
            if (w72Var != null) {
                w72Var2 = w72Var;
            }
        }
        float d = au1.d(j);
        float f = w72Var2.a;
        if (d >= f) {
            float d2 = au1.d(j);
            f = w72Var2.c;
            if (d2 <= f) {
                f = au1.d(j);
            }
        }
        float e = au1.e(j);
        float f2 = w72Var2.b;
        if (e >= f2) {
            float e2 = au1.e(j);
            f2 = w72Var2.d;
            if (e2 <= f2) {
                f2 = au1.e(j);
            }
        }
        return ap.i(f, f2);
    }

    public final int b(boolean z, long j) {
        if (z) {
            j = a(j);
        }
        return this.a.b.e(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float e = au1.e(d);
        bw2 bw2Var = this.a;
        int c = bw2Var.b.c(e);
        return au1.d(d) >= bw2Var.f(c) && au1.d(d) <= bw2Var.g(c);
    }

    public final long d(long j) {
        t81 t81Var;
        t81 t81Var2 = this.b;
        if (t81Var2 != null) {
            if (!t81Var2.y()) {
                t81Var2 = null;
            }
            if (t81Var2 != null && (t81Var = this.c) != null) {
                t81 t81Var3 = t81Var.y() ? t81Var : null;
                if (t81Var3 != null) {
                    return t81Var2.u(t81Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        t81 t81Var;
        t81 t81Var2 = this.b;
        if (t81Var2 != null) {
            if (!t81Var2.y()) {
                t81Var2 = null;
            }
            if (t81Var2 != null && (t81Var = this.c) != null) {
                t81 t81Var3 = t81Var.y() ? t81Var : null;
                if (t81Var3 != null) {
                    return t81Var3.u(t81Var2, j);
                }
            }
        }
        return j;
    }
}
