package B0;

import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class J extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f110i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f111j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f112k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n2, String str, String str2, H0.d dVar) {
        super(2, dVar);
        this.f111j = n2;
        this.f112k = str;
        this.f113l = str2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new J(this.f111j, this.f112k, this.f113l, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((J) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f110i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f110i = 1;
            if (N.r(this.f111j, this.f112k, this.f113l, this) == aVar) {
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
