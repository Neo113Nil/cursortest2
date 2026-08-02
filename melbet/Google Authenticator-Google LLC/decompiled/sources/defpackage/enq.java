package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enq implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public enq(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enp b() {
        return new enp(((ene) this.a).b(), ((end) this.b).b(), this.c);
    }
}
