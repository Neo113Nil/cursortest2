package I;

import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class I extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f546j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P p2, H0.d dVar) {
        super(2, dVar);
        this.f546j = p2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new I(this.f546j, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((I) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f545i;
        P p2 = this.f546j;
        try {
            if (i2 == 0) {
                i1.a.G(obj);
                if (p2.f576l.m() instanceof b0) {
                    return p2.f576l.m();
                }
                this.f545i = 1;
                if (p2.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i1.a.G(obj);
                    return (k0) obj;
                }
                i1.a.G(obj);
            }
            this.f545i = 2;
            obj = P.e(p2, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (k0) obj;
        } catch (Throwable th) {
            return new d0(th, -1);
        }
    }
}
