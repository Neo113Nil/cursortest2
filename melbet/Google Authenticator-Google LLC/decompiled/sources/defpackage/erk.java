package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class erk implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public erk(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final erj b() {
        Context b = ((jrk) this.a).b();
        return new erj(b, this.c);
    }
}
