package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: d, reason: collision with root package name */
    public int f706d;

    /* renamed from: e, reason: collision with root package name */
    public Object f707e;

    public j(int i) {
        this.f706d = i;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        int z3;
        do {
            z3 = z();
            if (z3 == 0) {
                return;
            }
            int i = this.f706d;
            if (i >= 100) {
                throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f706d = i + 1;
            this.f706d--;
        } while (C(z3));
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract q3.l1 f(q3.l1 l1Var, List list);

    public abstract a0.a0 g(q3.u0 u0Var, a0.a0 a0Var);

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract g l();

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

    public void e() {
    }

    public void d(q3.u0 u0Var) {
    }
}
