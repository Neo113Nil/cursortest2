package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxm implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final /* synthetic */ int d;

    public fxm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i) {
        this.d = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    public final fxl a() {
        int i = this.d;
        jsb jsbVar = this.a;
        if (i != 0) {
            return new fxl((gpj) jsbVar.b(), ((gmu) this.b).b(), (hvl) this.c.b());
        }
        return new fxl((gpj) jsbVar.b(), ((gmu) this.b).b(), (hvl) this.c.b());
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.d != 0 ? a() : a();
    }
}
