package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f1686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i3) {
        super(0);
        this.f1685d = i3;
        this.f1686e = w0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a2.n0 placementScope;
        switch (this.f1685d) {
            case 0:
                w0 w0Var = this.f1686e;
                k0 k0Var = w0Var.f1687t;
                k0Var.f1600i = 0;
                o0.e w6 = k0Var.f1593a.w();
                Object[] objArr = w6.f7317d;
                int i3 = w6.f7319i;
                for (int i10 = 0; i10 < i3; i10++) {
                    w0 w0Var2 = ((g0) objArr[i10]).T.f1606p;
                    w0Var2.f1689v = w0Var2.f1690w;
                    w0Var2.f1690w = Integer.MAX_VALUE;
                    w0Var2.G = false;
                    if (w0Var2.f1693z == e0.f1529e) {
                        w0Var2.f1693z = e0.f1530i;
                    }
                }
                g0 g0Var = k0Var.f1593a;
                g0 g0Var2 = k0Var.f1593a;
                o0.e w10 = g0Var.w();
                Object[] objArr2 = w10.f7317d;
                int i11 = w10.f7319i;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((g0) objArr2[i12]).T.f1606p.K.getClass();
                }
                if (w0Var.v().f1635x) {
                    o0.b bVar = (o0.b) g0Var2.l();
                    int i13 = bVar.f7311d.f7319i;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((i1) ((g0) bVar.get(i14)).S.f1494e).f1635x = true;
                    }
                }
                w0Var.v().l0().b();
                if (w0Var.v().f1635x) {
                    o0.b bVar2 = (o0.b) g0Var2.l();
                    int i15 = bVar2.f7311d.f7319i;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((i1) ((g0) bVar2.get(i16)).S.f1494e).f1635x = false;
                    }
                }
                o0.e w11 = g0Var2.w();
                Object[] objArr3 = w11.f7317d;
                int i17 = w11.f7319i;
                for (int i18 = 0; i18 < i17; i18++) {
                    g0 g0Var3 = (g0) objArr3[i18];
                    k0 k0Var2 = g0Var3.T;
                    if (k0Var2.f1606p.f1689v != g0Var3.t()) {
                        g0Var2.K();
                        g0Var2.z();
                        if (g0Var3.t() == Integer.MAX_VALUE) {
                            if (k0Var2.f1595c || k.q(g0Var3)) {
                                s0 s0Var = k0Var2.f1607q;
                                s0Var.getClass();
                                s0Var.d0(false);
                            }
                            k0Var2.f1606p.e0();
                        }
                    }
                }
                o0.e w12 = g0Var2.w();
                Object[] objArr4 = w12.f7317d;
                int i19 = w12.f7319i;
                for (int i20 = 0; i20 < i19; i20++) {
                    h0 h0Var = ((g0) objArr4[i20]).T.f1606p.K;
                    h0Var.getClass();
                    h0Var.f1572c = false;
                }
                break;
            case 1:
                w0 w0Var3 = this.f1686e;
                w0Var3.f1687t.a().c(w0Var3.O);
                break;
            default:
                w0 w0Var4 = this.f1686e;
                k0 k0Var3 = w0Var4.f1687t;
                i1 i1Var = k0Var3.a().D;
                if (i1Var == null || (placementScope = i1Var.f1636y) == null) {
                    placementScope = j0.a(k0Var3.f1593a).getPlacementScope();
                }
                Function1 function1 = w0Var4.T;
                if (function1 == null) {
                    i1 a9 = k0Var3.a();
                    long j = w0Var4.U;
                    float f3 = w0Var4.V;
                    placementScope.getClass();
                    a2.n0.a(placementScope, a9);
                    a9.Z(x2.i.c(j, a9.f135s), f3, null);
                } else {
                    i1 a10 = k0Var3.a();
                    long j3 = w0Var4.U;
                    float f10 = w0Var4.V;
                    placementScope.getClass();
                    a2.n0.a(placementScope, a10);
                    a10.Z(x2.i.c(j3, a10.f135s), f10, function1);
                }
                break;
        }
        return Unit.f5554a;
    }
}
