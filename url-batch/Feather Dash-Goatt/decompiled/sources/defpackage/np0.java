package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class np0 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ qp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np0(qp0 qp0Var, int i) {
        super(0);
        this.d = i;
        this.e = qp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        qp0 qp0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                xf xfVar = qp0Var.L;
                xfVar.getClass();
                qp0Var.D0(xfVar, qp0Var.K);
                break;
            default:
                qp0 qp0Var2 = qp0Var.u;
                if (qp0Var2 != null) {
                    qp0Var2.Q0();
                }
                break;
        }
        return Unit.a;
    }
}
