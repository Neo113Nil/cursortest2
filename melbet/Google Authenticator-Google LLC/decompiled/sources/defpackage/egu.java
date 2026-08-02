package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egu implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;

    public egu(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egt b() {
        return new egt(((eid) this.a).b(), (ExecutorService) this.b.b(), ((jrk) this.c).b(), ((dwp) this.d).b());
    }
}
