package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gry implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;

    public gry(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ldt b() {
        ikj ikjVar = (ikj) this.a.b();
        gzp a = ((bnu) this.b).a();
        return new ldt(ikjVar, a, (hvl) this.d.b(), ((bnu) this.e).a(), ((bnu) this.f).a());
    }
}
