package defpackage;

import com.trembin.nirefon.betfury.MainActivity2;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ry extends sy implements jx {
    public final MainActivity2 j;
    public final /* synthetic */ ty k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(ty tyVar, MainActivity2 mainActivity2, lz lzVar) {
        super(tyVar, lzVar);
        this.k = tyVar;
        this.j = mainActivity2;
    }

    @Override // defpackage.sy
    public final void b() {
        this.j.f.f(this);
    }

    @Override // defpackage.sy
    public final boolean c(MainActivity2 mainActivity2) {
        return this.j == mainActivity2;
    }

    @Override // defpackage.sy
    public final boolean d() {
        return this.j.f.c.isAtLeast(gx.STARTED);
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        nx nxVar = this.j.f;
        gx gxVar = nxVar.c;
        if (gxVar == gx.DESTROYED) {
            this.k.g(this.f);
            return;
        }
        gx gxVar2 = null;
        while (gxVar2 != gxVar) {
            a(d());
            gxVar2 = gxVar;
            gxVar = nxVar.c;
        }
    }
}
