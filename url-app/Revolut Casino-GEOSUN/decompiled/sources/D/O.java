package D;

import u0.C0247g;

/* loaded from: classes.dex */
public final class O extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f112i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f113j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f114k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s2, w0.d dVar) {
        super(2, dVar);
        this.f114k = s2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        O o2 = new O(this.f114k, dVar);
        o2.f113j = obj;
        return o2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((O) b((e0) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f112i;
        if (i2 == 0) {
            o.g.z(obj);
            e0 e0Var = (e0) this.f113j;
            this.f112i = 1;
            if (S.b(this.f114k, e0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0247g.f3005a;
    }
}
