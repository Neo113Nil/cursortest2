package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grr implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;

    public grr(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final grq b() {
        Object obj = ((jrx) this.e).a;
        cka b = ((gro) this.a).b();
        Set set = (Set) obj;
        boolean z = false;
        if (((Set) ((jrx) this.f).a).isEmpty() && set.isEmpty()) {
            z = true;
        }
        jsb jsbVar = this.d;
        jsb jsbVar2 = this.c;
        jsb jsbVar3 = this.b;
        hoq.y(z, "Can't provide @AccountSyncMonitor monitors into application scope.");
        return new grq(b, jsbVar3, jsbVar2, jsbVar);
    }
}
