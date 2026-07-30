package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jq1 extends pc0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ kq1 e;
    public final /* synthetic */ Function2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq1(kq1 kq1Var, Function2 function2, int i) {
        super(2);
        this.d = i;
        this.e = kq1Var;
        this.g = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object b(Object obj, Object obj2) {
        int i = this.d;
        Function2 function2 = this.g;
        kq1 kq1Var = this.e;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                hl hlVar = (hl) obj;
                int intValue = ((Number) obj2).intValue();
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(kq1Var.d, function2, hlVar, 0);
                } else {
                    hlVar.R();
                }
                break;
            default:
                hl hlVar2 = (hl) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (hlVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    d4 d4Var = kq1Var.d;
                    Object tag = d4Var.getTag(R.id.inspection_slot_table_set);
                    dn dnVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof yb0) && !(tag instanceof bc0))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = d4Var.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof yb0) && !(tag2 instanceof bc0))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(hlVar2.w());
                        hlVar2.q = true;
                        hlVar2.C = true;
                        hlVar2.c.b();
                        hlVar2.H.b();
                        db1 db1Var = hlVar2.I;
                        ab1 ab1Var = db1Var.a;
                        db1Var.e = ab1Var.n;
                        db1Var.f = ab1Var.o;
                    }
                    boolean h = hlVar2.h(kq1Var);
                    Object L = hlVar2.L();
                    j41 j41Var = bl.a;
                    if (h || L == j41Var) {
                        L = new iq1(kq1Var, dnVar, i3);
                        hlVar2.h0(L);
                    }
                    p4.i(hlVar2, d4Var, (Function2) L);
                    boolean h2 = hlVar2.h(kq1Var);
                    Object L2 = hlVar2.L();
                    if (h2 || L2 == j41Var) {
                        L2 = new iq1(kq1Var, dnVar, i2);
                        hlVar2.h0(L2);
                    }
                    p4.i(hlVar2, d4Var, (Function2) L2);
                    op.a(j90.a.a(set), m90.J(-280240369, new jq1(kq1Var, function2, i3), hlVar2), hlVar2, 56);
                } else {
                    hlVar2.R();
                }
                break;
        }
        return Unit.a;
    }
}
