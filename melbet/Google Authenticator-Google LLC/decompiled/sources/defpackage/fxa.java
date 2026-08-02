package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxa implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final /* synthetic */ int d;

    public fxa(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, int i) {
        this.d = i;
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    public final iyi a() {
        int i = this.d;
        jsb jsbVar = this.b;
        return i != 0 ? new iyi((Object) ((jrk) this.a).b(), jsbVar.b(), this.c.b(), (byte[]) null) : new iyi((Object) ((jrk) this.a).b(), jsbVar.b(), this.c.b(), (byte[]) null);
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.d != 0 ? a() : a();
    }
}
