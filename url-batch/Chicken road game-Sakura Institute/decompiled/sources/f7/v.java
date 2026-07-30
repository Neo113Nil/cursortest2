package f7;

import g4.e1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v implements f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f3563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e1 f3564h;

    public v(f fVar, f fVar2, e1 e1Var) {
        this.f3562f = fVar;
        this.f3563g = fVar2;
        this.f3564h = e1Var;
    }

    @Override // f7.f
    public final Object b(g gVar, h6.d dVar) {
        g7.p pVar = new g7.p(new f[]{this.f3562f, this.f3563g}, new p(this.f3564h, null, 2), gVar, null);
        g7.r rVar = new g7.r(dVar, dVar.getContext());
        Object n02 = j1.c.n0(rVar, rVar, pVar);
        d6.z zVar = d6.z.f2639a;
        i6.a aVar = i6.a.f4956f;
        if (n02 != aVar) {
            n02 = zVar;
        }
        return n02 == aVar ? n02 : zVar;
    }
}
