package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cy1 implements db1 {
    public final q80 a;

    public cy1(q80 q80Var) {
        this.a = q80Var;
    }

    @Override // defpackage.db1
    public final int b() {
        return this.a.m();
    }

    @Override // defpackage.db1
    public final int c() {
        return Math.min(r1.m() - 1, ((rj1) zv.B(this.a.l().a)).a);
    }

    @Override // defpackage.db1
    public final boolean d() {
        return !this.a.l().a.isEmpty();
    }

    @Override // defpackage.db1
    public final void e() {
        i91 i91Var = (i91) this.a.w.getValue();
        if (i91Var != null) {
            i91Var.k();
        }
    }

    @Override // defpackage.db1
    public final int f() {
        return Math.max(0, this.a.d);
    }
}
