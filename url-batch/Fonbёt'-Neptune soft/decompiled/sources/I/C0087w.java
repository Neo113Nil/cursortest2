package I;

/* renamed from: I.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087w extends J0.g implements P0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f718i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ H f719j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087w(H h2, H0.d dVar) {
        super(1, dVar);
        this.f719j = h2;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        return new C0087w(this.f719j, (H0.d) obj).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f718i;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f718i = 1;
            obj = this.f719j.i(this);
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
