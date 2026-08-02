package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fuk implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;

    public fuk(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fuj b() {
        fwm fwmVar = (fwm) this.a.b();
        fuy fuyVar = (fuy) this.b.b();
        fuq fuqVar = (fuq) this.c.b();
        ((gdu) this.d).b();
        return new fuj(fwmVar, fuyVar, fuqVar, this.e, (ScheduledExecutorService) this.g.b());
    }
}
