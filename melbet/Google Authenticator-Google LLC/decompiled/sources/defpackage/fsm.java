package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsm implements jrw {
    private final jsb a;
    private final jsb b;

    public fsm(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gbi b() {
        gbi gbiVar;
        jpu jpuVar = (jpu) ((jrx) this.a).a;
        jpuVar.getClass();
        int d = jpuVar.d() - 1;
        if (d == 0 || d == 1) {
            Object b = this.b.b();
            b.getClass();
            gbiVar = (gbi) b;
        } else {
            gbiVar = ((fsf) imq.a(jpuVar.b(), fsf.class)).h();
        }
        gbiVar.getClass();
        return gbiVar;
    }
}
