package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhu implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;

    public dhu(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
    }

    @Override // defpackage.koe, defpackage.kod
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dhm b() {
        return new dhm((gzp) ((jrx) this.a).a, ((bnu) this.b).a(), (hvm) this.c.b(), (Set) this.d.b());
    }
}
