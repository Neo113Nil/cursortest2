package G;

import E0.p;
import java.util.LinkedHashMap;
import u0.C0247g;

/* loaded from: classes.dex */
public final class h extends y0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f335i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f336j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y0.f f337k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, w0.d dVar) {
        super(2, dVar);
        this.f337k = (y0.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E0.p, y0.f] */
    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        h hVar = new h(this.f337k, dVar);
        hVar.f336j = obj;
        return hVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((h) b((b) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [E0.p, y0.f] */
    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f335i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f336j;
            o.g.z(obj);
            return bVar;
        }
        o.g.z(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f336j).a()), false);
        this.f336j = bVar2;
        this.f335i = 1;
        return this.f337k.f(bVar2, this) == aVar ? aVar : bVar2;
    }
}
