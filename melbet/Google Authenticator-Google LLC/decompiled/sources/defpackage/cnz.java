package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnz extends cnt {
    public final qk e;
    private final cog g;

    public cnz(com comVar, cog cogVar) {
        super(comVar, cll.a);
        this.e = new qk(0);
        this.g = cogVar;
        this.f.b(this);
    }

    @Override // defpackage.cnt
    protected final void e(clg clgVar, int i) {
        this.g.d(clgVar, i);
    }

    @Override // defpackage.cnt
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.col
    public final void h() {
        k();
    }

    @Override // defpackage.col
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.col
    public final void j() {
        this.a = false;
        Object obj = cog.c;
        cog cogVar = this.g;
        synchronized (obj) {
            if (cogVar.l == this) {
                cogVar.l = null;
                cogVar.m.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.f(this);
    }
}
