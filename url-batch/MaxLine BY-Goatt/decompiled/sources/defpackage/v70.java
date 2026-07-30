package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v70 extends ul1 implements xd0 {
    public final b41 A;
    public boolean B;
    public boolean C;
    public boolean D;

    public v70(b41 b41Var) {
        this.A = b41Var;
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        k91Var.a();
        ns nsVar = k91Var.m;
        if (this.B) {
            yd0.H(k91Var, aw.b(aw.b, 0.3f), nsVar.f(), 122);
        } else if (this.C || this.D) {
            yd0.H(k91Var, aw.b(aw.b, 0.1f), nsVar.f(), 122);
        }
    }

    @Override // defpackage.ul1
    public final void y0() {
        z71.H(u0(), null, new fj(1, (o30) null, this), 3);
    }
}
