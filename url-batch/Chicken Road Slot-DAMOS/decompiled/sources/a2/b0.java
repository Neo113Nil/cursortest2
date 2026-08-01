package a2;

import c2.q1;
import d2.v1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f56e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f57i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i3, Object obj, Object obj2) {
        super(2);
        this.f55d = i3;
        this.f56e = obj;
        this.f57i = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.f55d;
        Object obj3 = this.f56e;
        Object obj4 = this.f57i;
        switch (i3) {
            case 0:
                n0.i0 i0Var = (n0.i0) obj;
                int intValue = ((Number) obj2).intValue();
                if (i0Var.O(intValue & 1, (intValue & 3) != 2)) {
                    Boolean bool = (Boolean) ((t) obj3).f155f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    x0.d dVar = (x0.d) obj4;
                    i0Var.Y(bool);
                    boolean g = i0Var.g(booleanValue);
                    if (booleanValue) {
                        dVar.invoke(i0Var, 0);
                    } else {
                        if (i0Var.f6707l != 0) {
                            n0.m.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!i0Var.S) {
                            if (g) {
                                q0.g gVar = i0Var.G;
                                int i10 = gVar.g;
                                int i11 = gVar.f7740h;
                                r0.b bVar = i0Var.M;
                                bVar.getClass();
                                bVar.d(false);
                                bVar.f8085b.f8082a.l0(r0.i.f8108c);
                                n0.h.h(i0Var.f6714s, i10, i11);
                                i0Var.G.t();
                            } else {
                                i0Var.Q();
                            }
                        }
                    }
                    if (i0Var.f6720y && i0Var.G.f7741i == i0Var.f6721z) {
                        i0Var.f6721z = -1;
                        i0Var.f6720y = false;
                    }
                    i0Var.p(false);
                } else {
                    i0Var.R();
                }
                break;
            case 1:
                k1.n nVar = (k1.n) obj;
                n1.b bVar2 = (n1.b) obj2;
                c2.i1 i1Var = (c2.i1) obj3;
                c2.g0 g0Var = i1Var.B;
                if (g0Var.F()) {
                    i1Var.U = nVar;
                    i1Var.T = bVar2;
                    q1 snapshotObserver = c2.j0.a(g0Var).getSnapshotObserver();
                    k1.d0 d0Var = c2.i1.Z;
                    snapshotObserver.f1645a.c(i1Var, c2.d.f1513r, (c2.f1) obj4);
                    i1Var.X = false;
                } else {
                    i1Var.X = true;
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                j2.m mVar = (j2.m) obj2;
                f1.e eVar = (f1.e) obj4;
                if (!((v1) obj3).f3587b.b(mVar.f4985f)) {
                    eVar.m(intValue2, mVar);
                    eVar.f4052v.b(Unit.f5554a);
                }
                break;
        }
        return Unit.f5554a;
    }
}
