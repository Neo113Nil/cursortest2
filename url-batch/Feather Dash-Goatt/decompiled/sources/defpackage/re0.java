package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class re0 implements s30 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ re0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // defpackage.s30
    public final Object a(Object obj, Object obj2, Object obj3) {
        am0 c;
        int i = this.d;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                bf0 bf0Var = (bf0) obj7;
                am0 am0Var = (am0) obj6;
                Object obj8 = (qf0) obj5;
                ao0 ao0Var = (ao0) obj4;
                p51 p51Var = (p51) obj;
                hl hlVar = (hl) obj2;
                ((Integer) obj3).getClass();
                Object L = hlVar.L();
                Object obj9 = bl.a;
                if (L == obj9) {
                    L = new pe0(p51Var, new te0(ao0Var, 0));
                    hlVar.h0(L);
                }
                pe0 pe0Var = (pe0) L;
                Object L2 = hlVar.L();
                if (L2 == obj9) {
                    L2 = new df1(new yw(pe0Var));
                    hlVar.h0(L2);
                }
                df1 df1Var = (df1) L2;
                if (bf0Var != null) {
                    hlVar.W(1743490539);
                    hlVar.W(887527095);
                    Object obj10 = wy0.a;
                    if (obj10 != null) {
                        hlVar.W(1345554384);
                        hlVar.p(false);
                    } else {
                        hlVar.W(1345603457);
                        View view = (View) hlVar.j(AndroidCompositionLocals_androidKt.f);
                        boolean f = hlVar.f(view);
                        Object L3 = hlVar.L();
                        if (f || L3 == obj9) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            L3 = tag instanceof uy0 ? (uy0) tag : null;
                            if (L3 == null) {
                                L3 = new h6(view);
                                view.setTag(R.id.compose_prefetch_scheduler, L3);
                            }
                            hlVar.h0(L3);
                        }
                        obj10 = (uy0) L3;
                        hlVar.p(false);
                    }
                    Object obj11 = obj10;
                    hlVar.p(false);
                    Object[] objArr = {bf0Var, pe0Var, df1Var, obj11};
                    boolean f2 = hlVar.f(bf0Var) | hlVar.h(pe0Var) | hlVar.h(df1Var) | hlVar.h(obj11);
                    Object L4 = hlVar.L();
                    if (f2 || L4 == obj9) {
                        L4 = new j7(bf0Var, pe0Var, df1Var, obj11, 4);
                        hlVar.h0(L4);
                    }
                    Function1 function1 = (Function1) L4;
                    boolean z = false;
                    for (Object obj12 : Arrays.copyOf(objArr, 4)) {
                        z |= hlVar.f(obj12);
                    }
                    Object L5 = hlVar.L();
                    if (z || L5 == obj9) {
                        hlVar.h0(new ns(function1));
                    }
                } else {
                    hlVar.W(1737291469);
                }
                hlVar.p(false);
                int i2 = cf0.a;
                if (bf0Var != null && (c = am0Var.c(new lj1(bf0Var))) != null) {
                    am0Var = c;
                }
                boolean f3 = hlVar.f(pe0Var) | hlVar.f(obj8);
                Object L6 = hlVar.L();
                if (f3 || L6 == obj9) {
                    L6 = new il(pe0Var, 3, obj8);
                    hlVar.h0(L6);
                }
                la0.p(df1Var, am0Var, (Function2) L6, hlVar, 8);
                break;
            default:
                Function0 function0 = (Function0) obj7;
                Function0 function02 = (Function0) obj6;
                Function0 function03 = (Function0) obj5;
                Function0 function04 = (Function0) obj4;
                hl hlVar2 = (hl) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zd) obj).getClass();
                if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                    am0 S = yr1.S(xa1.b, 22.0f, 22.0f);
                    id idVar = j50.t;
                    a60 a60Var = yr1.f;
                    yi a = wi.a(a60Var, idVar, hlVar2, 54);
                    int hashCode = Long.hashCode(hlVar2.T);
                    kw0 l = hlVar2.l();
                    am0 N = p4.N(hlVar2, S);
                    yk.b.getClass();
                    xl xlVar = xk.b;
                    hlVar2.a0();
                    if (hlVar2.S) {
                        hlVar2.k(xlVar);
                    } else {
                        hlVar2.k0();
                    }
                    e7 e7Var = xk.e;
                    ka0.C(hlVar2, a, e7Var);
                    e7 e7Var2 = xk.d;
                    ka0.C(hlVar2, l, e7Var2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    e7 e7Var3 = xk.f;
                    ka0.u(hlVar2, valueOf, e7Var3);
                    y3 y3Var = xk.g;
                    ka0.A(hlVar2, y3Var);
                    e7 e7Var4 = xk.c;
                    ka0.C(hlVar2, N, e7Var4);
                    xl0 xl0Var = xl0.a;
                    yr1.e(R.drawable.button_start_road, xa1.b(xa1.a(xl0Var, 0.78f), 62.0f), null, hlVar2, 48, 4);
                    am0 T = yr1.T(xa1.a(xl0Var, 1.0f), 6.0f, 2);
                    r41 a2 = q41.a(a60Var, j50.q, hlVar2, 54);
                    int hashCode2 = Long.hashCode(hlVar2.T);
                    kw0 l2 = hlVar2.l();
                    am0 N2 = p4.N(hlVar2, T);
                    hlVar2.a0();
                    if (hlVar2.S) {
                        hlVar2.k(xlVar);
                    } else {
                        hlVar2.k0();
                    }
                    ka0.C(hlVar2, a2, e7Var);
                    ka0.C(hlVar2, l2, e7Var2);
                    ka0.u(hlVar2, Integer.valueOf(hashCode2), e7Var3);
                    ka0.A(hlVar2, y3Var);
                    ka0.C(hlVar2, N2, e7Var4);
                    am0 c2 = xa1.c(xl0Var, 92.0f);
                    ds dsVar = ds.EASY;
                    yr1.t(R.drawable.difficulty_easy, function02, c2, false, "Easy", hlVar2, 24960, 8);
                    yr1.t(R.drawable.difficulty_normal, function03, xa1.c(xl0Var, 92.0f), false, "Normal", hlVar2, 24960, 8);
                    yr1.t(R.drawable.difficulty_hard, function04, xa1.c(xl0Var, 92.0f), false, "Hard", hlVar2, 24960, 8);
                    hlVar2.p(true);
                    yr1.u(R.drawable.icon_back, function0, xa1.c(xl0Var, 62.0f), "Back", hlVar2, 3456);
                    hlVar2.p(true);
                } else {
                    hlVar2.R();
                }
                break;
        }
        return Unit.a;
    }
}
