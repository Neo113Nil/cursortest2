package m;

/* loaded from: classes.dex */
public final class r0 extends S.n implements r0.n0 {

    /* renamed from: t, reason: collision with root package name */
    public u0 f8172t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8173u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8174v;

    @Override // r0.n0
    public final void p(y0.i iVar) {
        S2.e[] eVarArr = y0.s.f11639a;
        y0.t tVar = y0.q.f11623l;
        S2.e[] eVarArr2 = y0.s.f11639a;
        S2.e eVar = eVarArr2[6];
        tVar.a(iVar, Boolean.TRUE);
        y0.g gVar = new y0.g(new q0(this, 0), new q0(this, 1), this.f8173u);
        if (this.f8174v) {
            y0.t tVar2 = y0.q.f11627p;
            S2.e eVar2 = eVarArr2[11];
            tVar2.a(iVar, gVar);
        } else {
            y0.t tVar3 = y0.q.f11626o;
            S2.e eVar3 = eVarArr2[10];
            tVar3.a(iVar, gVar);
        }
    }
}
