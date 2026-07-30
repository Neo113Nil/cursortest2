package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class tu0 implements Cloneable {
    public final vu0 m;
    public vu0 n;

    public tu0(vu0 vu0Var) {
        this.m = vu0Var;
        if (vu0Var.g()) {
            lh.e("Default instance must be immutable.");
            throw null;
        }
        this.n = vu0Var.i();
    }

    public final vu0 a() {
        vu0 b = b();
        b.getClass();
        if (vu0.f(b, true)) {
            return b;
        }
        throw new a23();
    }

    public final vu0 b() {
        boolean g = this.n.g();
        vu0 vu0Var = this.n;
        if (!g) {
            return vu0Var;
        }
        vu0Var.getClass();
        q52 q52Var = q52.c;
        q52Var.getClass();
        q52Var.a(vu0Var.getClass()).c(vu0Var);
        vu0Var.h();
        return this.n;
    }

    public final void c() {
        if (this.n.g()) {
            return;
        }
        vu0 i = this.m.i();
        vu0 vu0Var = this.n;
        q52 q52Var = q52.c;
        q52Var.getClass();
        q52Var.a(i.getClass()).b(i, vu0Var);
        this.n = i;
    }

    public final Object clone() {
        tu0 tu0Var = (tu0) this.m.c(5);
        tu0Var.n = b();
        return tu0Var;
    }
}
