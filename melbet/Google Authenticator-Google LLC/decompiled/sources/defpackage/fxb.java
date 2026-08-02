package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxb implements jrw {
    private final jsb a;
    private final jsb b;

    public fxb(jsb jsbVar, jsb jsbVar2) {
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fwz b() {
        return new fwz((Executor) this.a.b(), ((fxa) this.b).a());
    }
}
