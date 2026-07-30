package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class es implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ es(qo1 qo1Var, po1 po1Var) {
        this.m = 2;
        this.n = qo1Var;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((a0) obj4).invoke((Throwable) obj);
                break;
            case 1:
                up1 up1Var = (up1) obj4;
                yx1 yx1Var = (yx1) obj;
                a00 a00Var = (a00) obj2;
                int intValue = ((Integer) obj3).intValue();
                yx1Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= a00Var.f(yx1Var) ? 4 : 2;
                }
                if (a00Var.P(intValue & 1, (intValue & 19) != 18)) {
                    vl1 g = a.g(b.b(sl1.a, 1.0f), yx1Var);
                    boolean h = a00Var.h(up1Var);
                    Object M = a00Var.M();
                    if (h || M == sz.a) {
                        M = new lh1(up1Var, 10);
                        a00Var.i0(M);
                    }
                    o70.h(up1Var, g, null, null, null, null, null, (Function1) M, a00Var, 48);
                } else {
                    a00Var.S();
                }
                break;
            case 2:
                qo1 qo1Var = (qo1) obj4;
                qo1.v.set(qo1Var, null);
                qo1Var.b(null);
                break;
            default:
                ((pi2) obj4).d();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ es(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }
}
