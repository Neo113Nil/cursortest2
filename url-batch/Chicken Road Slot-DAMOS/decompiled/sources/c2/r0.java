package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r0 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f1655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i3) {
        super(0);
        this.f1654d = i3;
        this.f1655e = s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p0 B0;
        switch (this.f1654d) {
            case 0:
                s0 s0Var = this.f1655e;
                k0 k0Var = s0Var.f1661t;
                k0Var.f1599h = 0;
                o0.e w6 = k0Var.f1593a.w();
                Object[] objArr = w6.f7317d;
                int i3 = w6.f7319i;
                for (int i10 = 0; i10 < i3; i10++) {
                    s0 s0Var2 = ((g0) objArr[i10]).T.f1607q;
                    s0Var2.getClass();
                    s0Var2.f1663v = s0Var2.f1664w;
                    s0Var2.f1664w = Integer.MAX_VALUE;
                    if (s0Var2.f1665x == e0.f1529e) {
                        s0Var2.f1665x = e0.f1530i;
                    }
                }
                g0 g0Var = k0Var.f1593a;
                g0 g0Var2 = k0Var.f1593a;
                o0.e w10 = g0Var.w();
                Object[] objArr2 = w10.f7317d;
                int i11 = w10.f7319i;
                for (int i12 = 0; i12 < i11; i12++) {
                    s0 s0Var3 = ((g0) objArr2[i12]).T.f1607q;
                    s0Var3.getClass();
                    s0Var3.E.getClass();
                }
                p pVar = s0Var.v().f1640e0;
                if (pVar != null) {
                    boolean z10 = pVar.f1635x;
                    o0.b bVar = (o0.b) g0Var2.l();
                    int i13 = bVar.f7311d.f7319i;
                    for (int i14 = 0; i14 < i13; i14++) {
                        p0 B02 = ((i1) ((g0) bVar.get(i14)).S.f1494e).B0();
                        if (B02 != null) {
                            B02.f1635x = z10;
                        }
                    }
                }
                p pVar2 = s0Var.v().f1640e0;
                pVar2.getClass();
                pVar2.l0().b();
                if (s0Var.v().f1640e0 != null) {
                    o0.b bVar2 = (o0.b) g0Var2.l();
                    int i15 = bVar2.f7311d.f7319i;
                    for (int i16 = 0; i16 < i15; i16++) {
                        p0 B03 = ((i1) ((g0) bVar2.get(i16)).S.f1494e).B0();
                        if (B03 != null) {
                            B03.f1635x = false;
                        }
                    }
                }
                o0.e w11 = g0Var2.w();
                Object[] objArr3 = w11.f7317d;
                int i17 = w11.f7319i;
                for (int i18 = 0; i18 < i17; i18++) {
                    s0 s0Var4 = ((g0) objArr3[i18]).T.f1607q;
                    s0Var4.getClass();
                    int i19 = s0Var4.f1663v;
                    int i20 = s0Var4.f1664w;
                    if (i19 != i20 && i20 == Integer.MAX_VALUE) {
                        s0Var4.d0(true);
                    }
                }
                o0.e w12 = g0Var2.w();
                Object[] objArr4 = w12.f7317d;
                int i21 = w12.f7319i;
                for (int i22 = 0; i22 < i21; i22++) {
                    s0 s0Var5 = ((g0) objArr4[i22]).T.f1607q;
                    s0Var5.getClass();
                    h0 h0Var = s0Var5.E;
                    h0Var.getClass();
                    h0Var.f1572c = false;
                }
                break;
            case 1:
                s0 s0Var6 = this.f1655e;
                k0 k0Var2 = s0Var6.f1661t;
                a2.n0 n0Var = null;
                if (k.q(k0Var2.f1593a) || k0Var2.f1595c) {
                    i1 i1Var = k0Var2.a().D;
                    if (i1Var != null) {
                        n0Var = i1Var.f1636y;
                    }
                } else {
                    i1 i1Var2 = k0Var2.a().D;
                    if (i1Var2 != null && (B0 = i1Var2.B0()) != null) {
                        n0Var = B0.f1636y;
                    }
                }
                if (n0Var == null) {
                    n0Var = j0.a(k0Var2.f1593a).getPlacementScope();
                }
                p0 B04 = k0Var2.a().B0();
                B04.getClass();
                a2.n0.o(n0Var, B04, s0Var6.B);
                break;
            default:
                s0 s0Var7 = this.f1655e;
                p0 B05 = s0Var7.f1661t.a().B0();
                B05.getClass();
                B05.c(s0Var7.L);
                break;
        }
        return Unit.f5554a;
    }
}
