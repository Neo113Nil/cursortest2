package defpackage;

import android.view.WindowInsets;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w6 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ pn1 e;
    public final /* synthetic */ jd0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(pn1 pn1Var, jd0 jd0Var, int i) {
        super(1);
        this.d = i;
        this.e = pn1Var;
        this.g = jd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets b;
        int i = this.d;
        jd0 jd0Var = this.g;
        pn1 pn1Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                eu0 eu0Var = (eu0) obj;
                d4 d4Var = eu0Var instanceof d4 ? (d4) eu0Var : null;
                if (d4Var != null) {
                    d4Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(pn1Var, jd0Var);
                    d4Var.getAndroidViewsHandler$ui().addView(pn1Var);
                    d4Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(jd0Var, pn1Var);
                    pn1Var.setImportantForAccessibility(1);
                    ln1.a(pn1Var, new u3(d4Var, jd0Var, d4Var));
                }
                if (pn1Var.getView().getParent() != pn1Var) {
                    pn1Var.addView(pn1Var.getView());
                }
                break;
            case 1:
                op.n(pn1Var, jd0Var);
                break;
            default:
                op.n(pn1Var, jd0Var);
                ((d4) pn1Var.g).K = true;
                int[] iArr = pn1Var.r;
                int i2 = iArr[0];
                int i3 = iArr[1];
                pn1Var.getView().getLocationOnScreen(iArr);
                long j = pn1Var.s;
                long K = ((uc0) obj).K();
                pn1Var.s = K;
                ip1 ip1Var = pn1Var.t;
                if (ip1Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !ba0.a(j, K)) && (b = pn1Var.g(ip1Var).b()) != null)) {
                    pn1Var.getView().dispatchApplyWindowInsets(b);
                }
                break;
        }
        return Unit.a;
    }
}
