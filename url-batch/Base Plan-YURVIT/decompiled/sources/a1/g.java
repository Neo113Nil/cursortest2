package a1;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class g extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f1154i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1155j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f1156k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, G0.d dVar) {
        super(2, dVar);
        this.f1156k = hVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        g gVar = new g(this.f1156k, dVar);
        gVar.f1155j = obj;
        return gVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((g) b((G0.d) obj2, (Z0.e) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f1154i;
        D0.h hVar = D0.h.f206a;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            Z0.e eVar = (Z0.e) this.f1155j;
            this.f1154i = 1;
            Object m2 = this.f1156k.f1157h.m(eVar, this);
            H0.a aVar = H0.a.f511e;
            if (m2 != aVar) {
                m2 = hVar;
            }
            if (m2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
        }
        return hVar;
    }
}
