package a1;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class e extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f1148i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1149j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f1150k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, G0.d dVar) {
        super(2, dVar);
        this.f1150k = fVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        e eVar = new e(this.f1150k, dVar);
        eVar.f1149j = obj;
        return eVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((e) b((G0.d) obj2, (Y0.p) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f1148i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            Y0.p pVar = (Y0.p) this.f1149j;
            this.f1148i = 1;
            Object a2 = this.f1150k.a(pVar, this);
            H0.a aVar = H0.a.f511e;
            if (a2 == aVar) {
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
