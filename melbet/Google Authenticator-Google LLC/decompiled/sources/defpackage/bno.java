package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bno implements jqe, jrp {
    final jsb a;
    final jsb b;
    final jsb c;
    final jsb d;
    final jsb e;
    final jsb f;
    private final bnl g;

    public bno(bnl bnlVar, afr afrVar) {
        this.g = bnlVar;
        jrw a = jrx.a(afrVar);
        this.a = a;
        jsb jsbVar = bof.a;
        this.b = jsbVar;
        this.c = new ekb(a, jsbVar, 20);
        this.d = new emo(a, 18);
        jsb jsbVar2 = bnlVar.C;
        jsb jsbVar3 = bnlVar.gc;
        this.e = new gaa(a, jsbVar2, jsbVar3, 3, (short[]) null);
        this.f = new gaa(bnlVar.q, bnlVar.gZ, jsbVar3, 5);
    }

    @Override // defpackage.jqe
    public final Map a() {
        return hix.b;
    }

    @Override // defpackage.jqe
    public final Map b() {
        return new jry(her.m(this.c, this.d, this.e, this.f));
    }
}
