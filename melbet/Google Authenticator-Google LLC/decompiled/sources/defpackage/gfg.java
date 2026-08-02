package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gfg implements gex {
    private final gex a;
    private gft b = null;

    public gfg(gex gexVar) {
        this.a = gexVar;
    }

    @Override // defpackage.gex
    public final void a(Throwable th) {
        fao.c();
        gft gftVar = this.b;
        gfr gfrVar = new gfr(th);
        this.b = gfrVar;
        if (gfrVar.equals(gftVar)) {
            return;
        }
        this.a.a(th);
    }

    @Override // defpackage.gex
    public final void b(Object obj) {
        fao.c();
        gft gftVar = this.b;
        gfs gfsVar = new gfs(obj);
        this.b = gfsVar;
        if (gfsVar.equals(gftVar)) {
            return;
        }
        this.a.b(obj);
    }
}
