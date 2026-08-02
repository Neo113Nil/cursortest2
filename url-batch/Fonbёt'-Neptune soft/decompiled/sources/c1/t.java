package c1;

/* loaded from: classes.dex */
public final class t extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2032i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2033j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1.e f2034k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b1.e eVar, H0.d dVar) {
        super(2, dVar);
        this.f2034k = eVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        t tVar = new t(this.f2034k, dVar);
        tVar.f2033j = obj;
        return tVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((t) b((H0.d) obj2, obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f2032i;
        if (i2 == 0) {
            i1.a.G(obj);
            Object obj2 = this.f2033j;
            this.f2032i = 1;
            if (this.f2034k.a(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
