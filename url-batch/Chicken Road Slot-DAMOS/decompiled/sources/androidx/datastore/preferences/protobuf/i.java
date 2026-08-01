package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.gh;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: d, reason: collision with root package name */
    public int f559d;

    /* renamed from: e, reason: collision with root package name */
    public Object f560e;

    public i(gh ghVar, int i3) {
        if (ghVar == null) {
            te.a1.e("format options cannot be null");
            throw null;
        }
        if (i3 < 0) {
            te.a1.e(v4.a.n(new StringBuilder(String.valueOf(i3).length() + 15), "invalid index: ", i3));
            throw null;
        }
        this.f559d = i3;
        this.f560e = ghVar;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i3);

    public void D() {
        int z10;
        do {
            z10 = z();
            if (z10 == 0) {
                return;
            }
            int i3 = this.f559d;
            if (i3 >= 100) {
                throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f559d = i3 + 1;
            this.f559d--;
        } while (C(z10));
    }

    public abstract void E(c4.r rVar, Object obj);

    public abstract void a(int i3);

    public abstract int c();

    public abstract boolean d();

    public abstract o3.k1 g(o3.k1 k1Var, List list);

    public abstract c6.e h(o3.q0 q0Var, c6.e eVar);

    public abstract void i(int i3);

    public abstract int j(int i3);

    public abstract boolean k();

    public abstract f l();

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

    public void e(o3.q0 q0Var) {
    }

    public void f(o3.q0 q0Var) {
    }

    public i(int i3) {
        this.f559d = i3;
    }
}
