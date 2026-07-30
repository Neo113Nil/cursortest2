package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class iv {
    public int m;
    public Object n;

    public iv(int i) {
        this.m = i;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        int z;
        do {
            z = z();
            if (z == 0) {
                return;
            }
            int i = this.m;
            if (i >= 100) {
                throw new u41("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.m = i + 1;
            this.m--;
        } while (C(z));
    }

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract c83 g(c83 c83Var, List list);

    public abstract tt1 h(i73 i73Var, tt1 tt1Var);

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract cr l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void e(i73 i73Var) {
    }

    public void f(i73 i73Var) {
    }
}
