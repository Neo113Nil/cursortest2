package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejh implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;

    public ejh(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eqm b() {
        Context b = ((jrk) this.a).b();
        return new eqm(b, this.c, this.d);
    }
}
