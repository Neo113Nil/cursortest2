package I;

/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081p extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f698i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f699j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081p(P p2, H0.d dVar) {
        super(2, dVar);
        this.f699j = p2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new C0081p(this.f699j, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0081p) b((H0.d) obj2, (b1.e) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f698i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f698i = 1;
            if (P.d(this.f699j, this) == aVar) {
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
