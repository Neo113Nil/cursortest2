package c1;

/* loaded from: classes.dex */
public final class e extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2006i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2007j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f2008k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, H0.d dVar) {
        super(2, dVar);
        this.f2008k = fVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        e eVar = new e(this.f2008k, dVar);
        eVar.f2007j = obj;
        return eVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((e) b((H0.d) obj2, (a1.p) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f2006i;
        if (i2 == 0) {
            i1.a.G(obj);
            a1.p pVar = (a1.p) this.f2007j;
            this.f2006i = 1;
            if (this.f2008k.a(pVar, this) == aVar) {
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
