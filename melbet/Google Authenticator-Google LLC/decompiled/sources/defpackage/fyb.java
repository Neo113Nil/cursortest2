package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyb implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;

    public fyb(jsb jsbVar, jsb jsbVar2, jsb jsbVar3) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gpm b() {
        Object obj = ((jrx) this.b).a;
        Context b = ((jrk) this.a).b();
        iyi a = ((fxa) this.c).a();
        gpl a2 = gpm.a();
        a2.a = "DefaultAccountData";
        a2.d(fyg.a);
        if (((Optional) obj).isPresent()) {
            a2.b(new fwv(a, "default_account", new fya(b)));
        }
        return a2.a();
    }
}
