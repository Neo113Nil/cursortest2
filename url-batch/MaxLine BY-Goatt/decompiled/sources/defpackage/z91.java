package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z91 implements db1 {
    public final va1 a;

    public z91(va1 va1Var) {
        this.a = va1Var;
    }

    @Override // defpackage.db1
    public final int b() {
        return this.a.g().j;
    }

    @Override // defpackage.db1
    public final int c() {
        return ((oa1) zv.B(this.a.g().g)).a;
    }

    @Override // defpackage.db1
    public final boolean d() {
        return !this.a.g().g.isEmpty();
    }

    @Override // defpackage.db1
    public final void e() {
        i91 i91Var = this.a.h;
        if (i91Var != null) {
            i91Var.k();
        }
    }

    @Override // defpackage.db1
    public final int f() {
        return ((iz1) this.a.b.b).h();
    }
}
