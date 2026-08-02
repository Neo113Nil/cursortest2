package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsn implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public fsn(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fsj b() {
        jpu jpuVar = (jpu) ((jrx) this.a).a;
        glu gluVar = (glu) this.b.b();
        gzp a = ((jri) this.c).a();
        jpuVar.getClass();
        gluVar.getClass();
        int d = jpuVar.d() - 1;
        return d != 0 ? d != 1 ? new fse(jpuVar.b(), gluVar, a) : new fsc(jpuVar.e()) : new fsb((bg) jpuVar.a());
    }
}
