package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlr implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public dlr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dkv b() {
        dkj dkjVar = (dkj) this.a.b();
        dlp.a = ((Boolean) ((gzp) ((jrx) this.c).a).d(false)).booleanValue();
        return new dlp(dkjVar);
    }
}
