package Q0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class t extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f865i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P0.e f867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(P0.e eVar, w0.d dVar) {
        super(2, dVar);
        this.f867k = eVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        t tVar = new t(this.f867k, dVar);
        tVar.f866j = obj;
        return tVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) b(obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f865i;
        if (i2 == 0) {
            o.g.z(obj);
            Object obj2 = this.f866j;
            this.f865i = 1;
            if (this.f867k.a(obj2, this) == aVar) {
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
