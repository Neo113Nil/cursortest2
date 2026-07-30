package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mj1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ nj1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj1(nj1 nj1Var, int i) {
        super(0);
        this.m = i;
        this.n = nj1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m12 placementScope;
        int i = this.m;
        nj1 nj1Var = this.n;
        switch (i) {
            case 0:
                m91 m91Var = nj1Var.r;
                m91Var.i = 0;
                eo1 y = m91Var.a.y();
                Object[] objArr = y.m;
                int i2 = y.o;
                for (int i3 = 0; i3 < i2; i3++) {
                    nj1 nj1Var2 = ((i91) objArr[i3]).Q.p;
                    nj1Var2.t = nj1Var2.u;
                    nj1Var2.u = Integer.MAX_VALUE;
                    nj1Var2.E = false;
                    if (nj1Var2.x == g91.n) {
                        nj1Var2.x = g91.o;
                    }
                }
                i91 i91Var = m91Var.a;
                i91 i91Var2 = m91Var.a;
                eo1 y2 = i91Var.y();
                Object[] objArr2 = y2.m;
                int i4 = y2.o;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((i91) objArr2[i5]).Q.p.I.getClass();
                    Unit unit = Unit.a;
                }
                nj1Var.n().y0().b();
                eo1 y3 = i91Var2.y();
                Object[] objArr3 = y3.m;
                int i6 = y3.o;
                for (int i7 = 0; i7 < i6; i7++) {
                    i91 i91Var3 = (i91) objArr3[i7];
                    m91 m91Var2 = i91Var3.Q;
                    if (m91Var2.p.t != i91Var3.v()) {
                        i91Var2.P();
                        i91Var2.B();
                        if (i91Var3.v() == Integer.MAX_VALUE) {
                            if (m91Var2.c) {
                                xg1 xg1Var = m91Var2.q;
                                xg1Var.getClass();
                                xg1Var.m0(false);
                            }
                            m91Var2.p.o0();
                        }
                    }
                }
                eo1 y4 = i91Var2.y();
                Object[] objArr4 = y4.m;
                int i8 = y4.o;
                for (int i9 = 0; i9 < i8; i9++) {
                    j91 j91Var = ((i91) objArr4[i9]).Q.p.I;
                    j91Var.getClass();
                    j91Var.c = false;
                    Unit unit2 = Unit.a;
                }
                break;
            case 1:
                nj1Var.r.a().c(nj1Var.M);
                break;
            default:
                m91 m91Var3 = nj1Var.r;
                ks1 ks1Var = m91Var3.a().C;
                if (ks1Var == null || (placementScope = ks1Var.x) == null) {
                    placementScope = ((t7) l91.a(m91Var3.a)).getPlacementScope();
                }
                Function1 function1 = nj1Var.R;
                if (function1 == null) {
                    ks1 a = m91Var3.a();
                    long j = nj1Var.S;
                    float f = nj1Var.T;
                    placementScope.getClass();
                    m12.a(placementScope, a);
                    a.i0(s31.c(j, a.q), f, null);
                } else {
                    ks1 a2 = m91Var3.a();
                    long j2 = nj1Var.S;
                    float f2 = nj1Var.T;
                    placementScope.getClass();
                    m12.a(placementScope, a2);
                    a2.i0(s31.c(j2, a2.q), f2, function1);
                }
                break;
        }
        return Unit.a;
    }
}
