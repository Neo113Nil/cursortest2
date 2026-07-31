package E1;

import F.AbstractC0062r0;
import F.J;
import F.L;
import I.C0113p;
import I.InterfaceC0088c0;
import L1.z;
import q1.C0775D;

/* loaded from: classes.dex */
public final class e implements Y1.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0775D f746f;

    public e(boolean z3, InterfaceC0088c0 interfaceC0088c0, C0775D c0775d) {
        this.f744d = z3;
        this.f745e = interfaceC0088c0;
        this.f746f = c0775d;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0113p c0113p = (C0113p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else if (this.f744d) {
            AbstractC0062r0.a(null, ((J) c0113p.k(L.f1045a)).p, 0L, 0.0f, null, Q.f.b(1006920280, new d(this.f745e, 0, this.f746f), c0113p), c0113p, 196608);
        }
        return z.f2729a;
    }
}
