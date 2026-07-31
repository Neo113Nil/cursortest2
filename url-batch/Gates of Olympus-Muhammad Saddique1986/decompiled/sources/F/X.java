package F;

import E.C0074b;
import E.C0076d;
import E.C0080h;
import e2.InterfaceC0422a;
import t0.AbstractC0993f;

/* loaded from: classes.dex */
public final class X extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f1435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y3, int i3) {
        super(0);
        this.f1434e = i3;
        this.f1435f = y3;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        C0080h c0080h;
        int i3 = 0;
        Y y3 = this.f1435f;
        switch (this.f1434e) {
            case 0:
                c1 c1Var = (c1) AbstractC0993f.i(y3, e1.f1525b);
                return (c1Var == null || (c0080h = c1Var.f1492b) == null) ? d1.f1505a : c0080h;
            default:
                if (((c1) AbstractC0993f.i(y3, e1.f1525b)) == null) {
                    E.y yVar = y3.f1455w;
                    if (yVar != null) {
                        y3.z0(yVar);
                    }
                } else if (y3.f1455w == null) {
                    W w2 = new W(0, y3);
                    X x3 = new X(y3, i3);
                    m.t0 t0Var = E.w.f1008a;
                    boolean z3 = E.C.f914a;
                    q.j jVar = y3.f1451s;
                    boolean z4 = y3.f1452t;
                    float f3 = y3.f1453u;
                    E.y c0076d = z3 ? new C0076d(jVar, z4, f3, w2, x3) : new C0074b(jVar, z4, f3, w2, x3);
                    y3.y0(c0076d);
                    y3.f1455w = c0076d;
                }
                return R1.y.f4171a;
        }
    }
}
