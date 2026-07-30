package defpackage;

import androidx.compose.ui.draw.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pc extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.m = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.m;
        Object obj5 = sz.a;
        Object obj6 = this.p;
        Object obj7 = this.n;
        Object obj8 = this.o;
        Object obj9 = this.q;
        switch (i) {
            case 0:
                fd fdVar = (fd) obj;
                a00 a00Var = (a00) obj2;
                int intValue = ((Number) obj3).intValue();
                fn2 fn2Var = (fn2) obj7;
                zc zcVar = (zc) obj6;
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? a00Var.f(fdVar) : a00Var.h(fdVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && a00Var.B()) {
                    a00Var.S();
                } else {
                    boolean f = a00Var.f(fn2Var) | a00Var.h(obj8) | a00Var.h(zcVar);
                    Object M = a00Var.M();
                    if (f || M == obj5) {
                        M = new oc(fn2Var, obj8, zcVar, 0);
                        a00Var.i0(M);
                    }
                    l41.f(fdVar, (Function1) M, a00Var);
                    tn1 tn1Var = zcVar.d;
                    fdVar.getClass();
                    tn1Var.m(obj8, ((gd) fdVar).a);
                    Object M2 = a00Var.M();
                    if (M2 == obj5) {
                        M2 = new vc();
                        a00Var.i0(M2);
                    }
                    ((my) obj9).b((vc) M2, obj8, a00Var, 0);
                }
                return Unit.a;
            default:
                cu1 cu1Var = (cu1) obj9;
                vl1 vl1Var = (vl1) obj;
                a00 a00Var2 = (a00) obj2;
                ((Number) obj3).intValue();
                sc1 sc1Var = (sc1) obj8;
                nn2 nn2Var = (nn2) obj7;
                nv2 nv2Var = (nv2) obj6;
                long j = nv2Var.b;
                a00Var2.X(-84507373);
                Object M3 = a00Var2.M();
                if (M3 == obj5) {
                    M3 = new q50();
                    a00Var2.i0(M3);
                }
                q50 q50Var = (q50) M3;
                boolean z = nn2Var.a != 16;
                if (((Boolean) ((mc1) ((x63) a00Var2.j(p00.t))).a.getValue()).booleanValue() && sc1Var.b() && jw2.b(j) && z) {
                    a00Var2.X(808320157);
                    yd ydVar = nv2Var.a;
                    jw2 jw2Var = new jw2(j);
                    boolean h = a00Var2.h(q50Var);
                    Object M4 = a00Var2.M();
                    if (h || M4 == obj5) {
                        M4 = new fj(11, (o30) null, q50Var);
                        a00Var2.i0(M4);
                    }
                    l41.i(ydVar, jw2Var, (Function2) M4, a00Var2);
                    boolean h2 = a00Var2.h(q50Var) | a00Var2.h(cu1Var) | a00Var2.f(nv2Var) | a00Var2.h(sc1Var) | a00Var2.f(nn2Var);
                    Object M5 = a00Var2.M();
                    if (h2 || M5 == obj5) {
                        Object aaVar = new aa(q50Var, cu1Var, nv2Var, sc1Var, nn2Var);
                        a00Var2.i0(aaVar);
                        M5 = aaVar;
                    }
                    obj4 = a.c(vl1Var, (Function1) M5);
                    a00Var2.q(false);
                } else {
                    a00Var2.X(809534830);
                    a00Var2.q(false);
                    obj4 = sl1.a;
                }
                a00Var2.q(false);
                return obj4;
        }
    }
}
