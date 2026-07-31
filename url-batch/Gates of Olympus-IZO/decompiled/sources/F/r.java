package F;

import I.C0113p;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0796H f1354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1355g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j3, InterfaceC0796H interfaceC0796H, Q.a aVar) {
        super(2);
        this.f1353e = j3;
        this.f1354f = interfaceC0796H;
        this.f1355g = aVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            G.a.a(this.f1353e, ((a1) c0113p.k(b1.f1200a)).f1196m, Q.f.b(1327513942, new C0060q(this.f1354f, 0, this.f1355g), c0113p), c0113p, 384);
        }
        return L1.z.f2729a;
    }
}
