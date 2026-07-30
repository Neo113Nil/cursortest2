package D;

import u0.C0247g;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015p(S s2, w0.d dVar) {
        super(2, dVar);
        this.f253j = s2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new C0015p(this.f253j, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0015p) b((P0.e) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f252i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f252i = 1;
            if (S.c(this.f253j, this) == aVar) {
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
