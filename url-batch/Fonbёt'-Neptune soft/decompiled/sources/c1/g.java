package c1;

/* loaded from: classes.dex */
public final class g extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2012i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2013j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f2014k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, H0.d dVar) {
        super(2, dVar);
        this.f2014k = hVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        g gVar = new g(this.f2014k, dVar);
        gVar.f2013j = obj;
        return gVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((g) b((H0.d) obj2, (b1.e) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f2012i;
        F0.h hVar = F0.h.f469a;
        if (i2 == 0) {
            i1.a.G(obj);
            b1.e eVar = (b1.e) this.f2013j;
            this.f2012i = 1;
            Object k2 = this.f2014k.f2015h.k(eVar, this);
            if (k2 != aVar) {
                k2 = hVar;
            }
            if (k2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return hVar;
    }
}
