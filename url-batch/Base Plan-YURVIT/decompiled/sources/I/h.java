package I;

import O0.p;
import a.AbstractC0086a;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends I0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f522i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I0.g f524k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, G0.d dVar) {
        super(2, dVar);
        this.f524k = (I0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [I0.g, O0.p] */
    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        h hVar = new h(this.f524k, dVar);
        hVar.f523j = obj;
        return hVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((h) b((G0.d) obj2, (b) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [I0.g, O0.p] */
    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f522i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f523j;
            AbstractC0086a.I(obj);
            return bVar;
        }
        AbstractC0086a.I(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f523j).a()), false);
        this.f523j = bVar2;
        this.f522i = 1;
        Object i3 = this.f524k.i(bVar2, this);
        H0.a aVar = H0.a.f511e;
        return i3 == aVar ? aVar : bVar2;
    }
}
