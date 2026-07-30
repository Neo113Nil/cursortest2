package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zn0 {
    public jj1 a;
    public n12 b;
    public jj1 c;
    public n12 d;
    public n31 e;
    public n31 f;

    public final n31 a(int i, int i2, boolean z) {
        int u = q40.u(2);
        if (u == 0 || u == 1) {
            return null;
        }
        if (u == 2) {
            if (z) {
                return this.e;
            }
            return null;
        }
        if (u != 3) {
            a.b();
            return null;
        }
        if (z) {
            return this.e;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f;
    }

    public final void b(jj1 jj1Var, jj1 jj1Var2, long j) {
        long B = tk3.B(j, 1);
        if (jj1Var != null) {
            int V = jj1Var.V(u10.g(B));
            this.e = new n31(n31.a(V, jj1Var.a0(V)));
            this.a = jj1Var;
            this.b = null;
        }
        if (jj1Var2 != null) {
            int V2 = jj1Var2.V(u10.g(B));
            this.f = new n31(n31.a(V2, jj1Var2.a0(V2)));
            this.c = jj1Var2;
            this.d = null;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zn0);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + q40.e(0, q40.u(2) * 31, 31);
    }

    public final String toString() {
        return q40.m("FlowLayoutOverflowState(type=", "Clip", ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)");
    }
}
