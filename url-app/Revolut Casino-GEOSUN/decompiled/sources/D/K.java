package D;

import M0.InterfaceC0062u;
import u0.C0247g;

/* loaded from: classes.dex */
public final class K extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f102i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0.f f103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0003d f104k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(E0.p pVar, C0003d c0003d, w0.d dVar) {
        super(2, dVar);
        this.f103j = (y0.f) pVar;
        this.f104k = c0003d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E0.p, y0.f] */
    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new K(this.f103j, this.f104k, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((K) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E0.p, y0.f] */
    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f102i;
        if (i2 == 0) {
            o.g.z(obj);
            Object obj2 = this.f104k.f175b;
            this.f102i = 1;
            obj = this.f103j.f(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
