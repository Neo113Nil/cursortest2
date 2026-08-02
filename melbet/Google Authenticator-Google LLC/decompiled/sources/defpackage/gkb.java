package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkb implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;

    public gkb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gka b() {
        return new gka(((gjf) this.a).a().booleanValue(), this.b, (hvl) this.c.b(), (gnp) this.d.b(), (ikj) this.e.b());
    }
}
