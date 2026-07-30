package a0;

import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l2 f32g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f33h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f34i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0.o f35j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f36k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l2 l2Var, long j8, boolean z8, s0.o oVar, o oVar2) {
        super(2);
        this.f32g = l2Var;
        this.f33h = j8;
        this.f34i = z8;
        this.f35j = oVar;
        this.f36k = oVar2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            g0.d.a(s1.f1.f8228q.a(this.f32g), o0.f.b(-1426434671, new c(this.f33h, this.f34i, this.f35j, this.f36k), pVar), pVar, 56);
        }
        return d6.z.f2639a;
    }
}
