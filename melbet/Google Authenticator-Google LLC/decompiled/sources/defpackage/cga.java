package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cga implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;

    public cga(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cfz b() {
        return new cfz((Executor) this.a.b(), (cgp) this.b.b(), ((cfn) this.c).b(), (cgp) this.d.b());
    }
}
