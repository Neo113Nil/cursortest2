package a0;

import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u0 extends y0.l implements s1 {

    /* renamed from: r, reason: collision with root package name */
    public p6.a f148r;

    /* renamed from: s, reason: collision with root package name */
    public z.d f149s;

    /* renamed from: t, reason: collision with root package name */
    public u.j0 f150t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f151u;

    /* renamed from: v, reason: collision with root package name */
    public d2.h f152v;

    /* renamed from: w, reason: collision with root package name */
    public final r0 f153w = new r0(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public r0 f154x;

    public u0(p6.a aVar, z.d dVar, u.j0 j0Var, boolean z3) {
        this.f148r = aVar;
        this.f149s = dVar;
        this.f150t = j0Var;
        this.f151u = z3;
        r0();
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        w6.d[] dVarArr = d2.u.f2215a;
        d2.v vVar = d2.s.f2199m;
        w6.d[] dVarArr2 = d2.u.f2215a;
        w6.d dVar = dVarArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        jVar.e(d2.s.J, this.f153w);
        if (this.f150t == u.j0.f7027d) {
            d2.h hVar = this.f152v;
            if (hVar == null) {
                q6.i.j("scrollAxisRange");
                throw null;
            }
            d2.v vVar2 = d2.s.f2207u;
            w6.d dVar2 = dVarArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            d2.h hVar2 = this.f152v;
            if (hVar2 == null) {
                q6.i.j("scrollAxisRange");
                throw null;
            }
            d2.v vVar3 = d2.s.f2206t;
            w6.d dVar3 = dVarArr2[11];
            vVar3.a(jVar, hVar2);
        }
        r0 r0Var = this.f154x;
        if (r0Var != null) {
            jVar.e(d2.i.f2130f, new d2.a(null, r0Var));
        }
        jVar.e(d2.i.A, new d2.a(null, new b1.e(5, new s0(this, 2))));
        d2.b bVar = new d2.b(1, this.f149s.f9013a.g().f9052n);
        d2.v vVar4 = d2.s.f2193f;
        w6.d dVar4 = dVarArr2[22];
        vVar4.a(jVar, bVar);
    }

    public final void r0() {
        this.f152v = new d2.h(new s0(this, 0), new s0(this, 1));
        this.f154x = this.f151u ? new r0(this, 1) : null;
    }
}
