package L;

import P0.p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends J0.g implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f765i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f766j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J0.g f767k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, H0.d dVar) {
        super(2, dVar);
        this.f767k = (J0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J0.g, P0.p] */
    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        h hVar = new h(this.f767k, dVar);
        hVar.f766j = obj;
        return hVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((h) b((H0.d) obj2, (b) obj)).l(F0.h.f469a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [J0.g, P0.p] */
    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f765i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f766j;
            i1.a.G(obj);
            return bVar;
        }
        i1.a.G(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f766j).a()), false);
        this.f766j = bVar2;
        this.f765i = 1;
        return this.f767k.h(bVar2, this) == aVar ? aVar : bVar2;
    }
}
