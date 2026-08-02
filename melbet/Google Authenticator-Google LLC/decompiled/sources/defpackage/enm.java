package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enm implements jrw {
    private final jsb a;
    private final jsb b;
    private final jsb c;
    private final jsb d;
    private final jsb e;
    private final jsb f;
    private final jsb g;
    private final jsb h;
    private final jsb i;
    private final jsb j;
    private final jsb k;
    private final jsb l;
    private final jsb m;
    private final jsb n;
    private final jsb o;
    private final jsb p;

    public enm(jsb jsbVar, jsb jsbVar2, jsb jsbVar3, jsb jsbVar4, jsb jsbVar5, jsb jsbVar6, jsb jsbVar7, jsb jsbVar8, jsb jsbVar9, jsb jsbVar10, jsb jsbVar11, jsb jsbVar12, jsb jsbVar13, jsb jsbVar14, jsb jsbVar15, jsb jsbVar16) {
        this.a = jsbVar;
        this.b = jsbVar2;
        this.c = jsbVar3;
        this.d = jsbVar4;
        this.e = jsbVar5;
        this.f = jsbVar6;
        this.g = jsbVar7;
        this.h = jsbVar8;
        this.i = jsbVar9;
        this.j = jsbVar10;
        this.k = jsbVar11;
        this.l = jsbVar12;
        this.m = jsbVar13;
        this.n = jsbVar14;
        this.o = jsbVar15;
        this.p = jsbVar16;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* bridge */ /* synthetic */ Object b() {
        ldt b = ((emj) this.a).b();
        Executor executor = (Executor) this.b.b();
        Object obj = ((jrx) this.d).a;
        jpt a = jrv.a(this.c);
        gzp gzpVar = (gzp) obj;
        bry bryVar = (bry) this.e.b();
        ekv ekvVar = (ekv) this.f.b();
        bry b2 = ((erm) this.g).b();
        iee b3 = ((enf) this.k).b();
        erj b4 = ((enh) this.l).b();
        gzp a2 = ((bnu) this.m).a();
        bry b5 = ((enz) this.p).b();
        return new enl(b, executor, a, gzpVar, bryVar, ekvVar, b2, this.h, this.i, this.j, b3, b4, a2, this.n, this.o, b5);
    }
}
