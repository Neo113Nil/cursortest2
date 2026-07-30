package s;

import r1.n1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends s0.n implements n1 {

    /* renamed from: s, reason: collision with root package name */
    public q6.a f7991s;

    /* renamed from: t, reason: collision with root package name */
    public r.c f7992t;

    /* renamed from: u, reason: collision with root package name */
    public o.j0 f7993u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7994v;

    /* renamed from: w, reason: collision with root package name */
    public y1.g f7995w;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f7996x = new b0(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public b0 f7997y;

    public d0(q6.a aVar, r.c cVar, o.j0 j0Var, boolean z8) {
        this.f7991s = aVar;
        this.f7992t = cVar;
        this.f7993u = j0Var;
        this.f7994v = z8;
        A0();
    }

    public final void A0() {
        this.f7995w = new y1.g(new a0(this, 1), new a0(this, 2));
        this.f7997y = this.f7994v ? new b0(this, 1) : null;
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        x6.e[] eVarArr = y1.r.f9886a;
        y1.s sVar = y1.p.f9870l;
        x6.e[] eVarArr2 = y1.r.f9886a;
        x6.e eVar = eVarArr2[6];
        sVar.a(iVar, Boolean.TRUE);
        iVar.m(y1.p.E, this.f7996x);
        if (this.f7993u == o.j0.f6657f) {
            y1.g gVar = this.f7995w;
            if (gVar == null) {
                r6.k.j("scrollAxisRange");
                throw null;
            }
            y1.s sVar2 = y1.p.f9874p;
            x6.e eVar2 = eVarArr2[11];
            sVar2.a(iVar, gVar);
        } else {
            y1.g gVar2 = this.f7995w;
            if (gVar2 == null) {
                r6.k.j("scrollAxisRange");
                throw null;
            }
            y1.s sVar3 = y1.p.f9873o;
            x6.e eVar3 = eVarArr2[10];
            sVar3.a(iVar, gVar2);
        }
        b0 b0Var = this.f7997y;
        if (b0Var != null) {
            iVar.m(y1.h.f9811f, new y1.a(null, b0Var));
        }
        iVar.m(y1.h.A, new y1.a(null, new s1.l0(15, new a0(this, 0))));
        this.f7992t.getClass();
        y1.b bVar = new y1.b(-1, 1);
        y1.s sVar4 = y1.p.f9864f;
        x6.e eVar4 = eVarArr2[20];
        sVar4.a(iVar, bVar);
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }
}
