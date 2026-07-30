package Q0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class e extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f839i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f840j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f841k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, w0.d dVar) {
        super(2, dVar);
        this.f841k = fVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        e eVar = new e(this.f841k, dVar);
        eVar.f840j = obj;
        return eVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((e) b((O0.p) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f839i;
        if (i2 == 0) {
            o.g.z(obj);
            O0.p pVar = (O0.p) this.f840j;
            this.f839i = 1;
            if (this.f841k.a(pVar, this) == aVar) {
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
