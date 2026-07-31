package M1;

import F.O0;
import I.C0167p;
import R1.y;
import e2.InterfaceC0426e;
import t1.C1013A;
import t1.u;

/* loaded from: classes.dex */
public final class g implements InterfaceC0426e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1013A f3477e;

    public g(u uVar, C1013A c1013a) {
        this.f3476d = uVar;
        this.f3477e = c1013a;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            O0.a(null, 0L, 0L, 0.0f, null, Q.f.b(995149142, new f(this.f3476d, 0, this.f3477e), c0167p), c0167p, 196608);
        }
        return y.f4171a;
    }
}
