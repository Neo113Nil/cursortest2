package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsu {
    public gvz a;
    public gvz b;
    private final bd c;
    private int d = 0;

    public gsu(bd bdVar) {
        this.c = bdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(gvz gvzVar, bd bdVar, boolean z) {
        if (bdVar.x() != null) {
            for (bd bdVar2 : bdVar.F().h()) {
                if (bdVar2 instanceof guo) {
                    ((guo) bdVar2).aJ(gvzVar, z);
                } else {
                    j(gvzVar, bdVar2, z);
                }
            }
        }
    }

    public final gut a(String str) {
        if (gta.u()) {
            return hoq.aC(223, str);
        }
        bg D = this.c.D();
        D.getClass();
        return hoq.aF(D).f(str, 222);
    }

    public final gut b() {
        try {
            return c();
        } finally {
            this.a = null;
            this.b = null;
            this.d = 0;
        }
    }

    public final gut c() {
        gvz gvzVar = this.b;
        if (gvzVar != null) {
            return gvzVar.a();
        }
        gvz gvzVar2 = this.a;
        return gvzVar2 != null ? gvzVar2.a() : gta.i();
    }

    public final gut d() {
        gut i = gta.i();
        if (this.d > 0) {
            g(gvz.b(), false);
        }
        return i;
    }

    public final gut e(String str) {
        gta.r();
        return new gsf((Object) gta.j(), gta.u() ? hoq.aC(225, str) : ((gst) hnu.bp(this.c.x(), gst.class)).e().f(str, 224), 7);
    }

    public final void f() {
        bd bdVar = this.c;
        bdVar.F().Y(new gux(((gst) hnu.bp(bdVar.x(), gst.class)).e()));
    }

    public final void g(gvz gvzVar, boolean z) {
        if (z) {
            int i = this.d;
            if (gvzVar == null) {
                int i2 = i - 1;
                if (i2 < 0) {
                    i2 = 0;
                }
                this.d = i2;
                if (i2 == 0) {
                    this.a = null;
                    return;
                }
                return;
            }
            this.d = i + 1;
        }
        this.a = gvzVar;
        j(gvzVar, this.c, z);
    }

    public final gut h(int i, int i2) {
        gut i3 = gta.i();
        if (i == 0 && i2 == 0) {
            return i3;
        }
        g(gvz.b(), true);
        return i3;
    }

    public final void i() {
        gta.q(true);
        if (this.d > 0) {
            g(gvz.b(), false);
        }
    }
}
