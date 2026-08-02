package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvg implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public fvg(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iyi b() {
        return new iyi(((gcy) this.a).b(), (Executor) this.b.b(), (gbg) this.c.b());
    }
}
