package Q0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class g extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f845i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f846j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f847k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, w0.d dVar) {
        super(2, dVar);
        this.f847k = hVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        g gVar = new g(this.f847k, dVar);
        gVar.f846j = obj;
        return gVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((g) b((P0.e) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f845i;
        C0247g c0247g = C0247g.f3005a;
        if (i2 == 0) {
            o.g.z(obj);
            P0.e eVar = (P0.e) this.f846j;
            this.f845i = 1;
            Object d2 = this.f847k.f848h.d(eVar, this);
            if (d2 != aVar) {
                d2 = c0247g;
            }
            if (d2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return c0247g;
    }
}
