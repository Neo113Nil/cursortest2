package m;

import r1.n1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d1 extends s0.n implements n1 {

    /* renamed from: s, reason: collision with root package name */
    public g1 f6132s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6133t;

    @Override // r1.n1
    public final void S(y1.i iVar) {
        x6.e[] eVarArr = y1.r.f9886a;
        y1.s sVar = y1.p.f9870l;
        x6.e[] eVarArr2 = y1.r.f9886a;
        x6.e eVar = eVarArr2[6];
        sVar.a(iVar, Boolean.TRUE);
        y1.g gVar = new y1.g(new c1(this, 0), new c1(this, 1));
        if (this.f6133t) {
            y1.s sVar2 = y1.p.f9874p;
            x6.e eVar2 = eVarArr2[11];
            sVar2.a(iVar, gVar);
        } else {
            y1.s sVar3 = y1.p.f9873o;
            x6.e eVar3 = eVarArr2[10];
            sVar3.a(iVar, gVar);
        }
    }
}
