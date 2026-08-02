package I;

import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class J extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f547i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J0.g f548j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0069d f549k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(P0.p pVar, C0069d c0069d, H0.d dVar) {
        super(2, dVar);
        this.f548j = (J0.g) pVar;
        this.f549k = c0069d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J0.g, P0.p] */
    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new J(this.f548j, this.f549k, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((J) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J0.g, P0.p] */
    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f547i;
        if (i2 == 0) {
            i1.a.G(obj);
            Object obj2 = this.f549k.f623b;
            this.f547i = 1;
            obj = this.f548j.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return obj;
    }
}
