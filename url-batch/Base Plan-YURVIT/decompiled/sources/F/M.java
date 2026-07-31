package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class M extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f274i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f275j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f276k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p2, G0.d dVar) {
        super(2, dVar);
        this.f276k = p2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        M m2 = new M(this.f276k, dVar);
        m2.f275j = obj;
        return m2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((M) b((G0.d) obj2, (c0) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f274i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            c0 c0Var = (c0) this.f275j;
            this.f274i = 1;
            Object b2 = P.b(this.f276k, c0Var, this);
            H0.a aVar = H0.a.f511e;
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
        }
        return D0.h.f206a;
    }
}
