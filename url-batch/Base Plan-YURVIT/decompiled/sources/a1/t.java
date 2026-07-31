package a1;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class t extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f1174i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1175j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z0.e f1176k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Z0.e eVar, G0.d dVar) {
        super(2, dVar);
        this.f1176k = eVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        t tVar = new t(this.f1176k, dVar);
        tVar.f1175j = obj;
        return tVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((t) b((G0.d) obj2, obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f1174i;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            Object obj2 = this.f1175j;
            this.f1174i = 1;
            Object a2 = this.f1176k.a(obj2, this);
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
