package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxc implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;

    public fxc(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gpm b() {
        gzp gzpVar = (gzp) ((jrx) this.a).a;
        fwz b = ((fxb) this.b).b();
        Executor executor = (Executor) this.c.b();
        fwq b2 = ((fwr) this.d).b();
        gpl a = gpm.a();
        a.a = "AccountData";
        a.d(fxd.a);
        a.c(b2);
        a.c = executor;
        if (gzpVar.f()) {
            a.b(new fwv(b.a, "accountmanager", b));
        }
        return a.a();
    }
}
