package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tb1 {
    public final Object a;
    public final ub1 b;
    public final iz1 c = new iz1(-1);
    public final iz1 d = new iz1(0);
    public final lz1 e = ij2.j(null);
    public final lz1 f = ij2.j(null);

    public tb1(Object obj, ub1 ub1Var) {
        this.a = obj;
        this.b = ub1Var;
    }

    public final tb1 a() {
        iz1 iz1Var = this.d;
        if (iz1Var.h() == 0) {
            this.b.m.add(this);
            tb1 tb1Var = (tb1) this.f.getValue();
            if (tb1Var != null) {
                tb1Var.a();
            } else {
                tb1Var = null;
            }
            this.e.setValue(tb1Var);
        }
        iz1Var.i(iz1Var.h() + 1);
        return this;
    }

    public final void b() {
        iz1 iz1Var = this.d;
        if (iz1Var.h() <= 0) {
            lh.g("Release should only be called once");
            return;
        }
        iz1Var.i(iz1Var.h() - 1);
        if (iz1Var.h() == 0) {
            this.b.m.remove(this);
            lz1 lz1Var = this.e;
            tb1 tb1Var = (tb1) lz1Var.getValue();
            if (tb1Var != null) {
                tb1Var.b();
            }
            lz1Var.setValue(null);
        }
    }
}
