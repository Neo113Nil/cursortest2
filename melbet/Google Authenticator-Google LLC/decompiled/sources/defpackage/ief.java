package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ief implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;

    public ief(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7) {
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
    public final iee b() {
        Object obj = ((jrx) this.c).a;
        Context b = ((jrk) this.a).b();
        Set b2 = ((jsd) this.b).b();
        gzp gzpVar = (gzp) obj;
        Object obj2 = ((jrx) this.g).a;
        return new iee(b, b2, gzpVar, ((ieh) this.d).b(), this.e, this.f, (gzp) obj2);
    }
}
