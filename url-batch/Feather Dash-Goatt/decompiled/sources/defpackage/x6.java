package defpackage;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x6 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ pn1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6(pn1 pn1Var, int i) {
        super(1);
        this.d = i;
        this.e = pn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.d;
        pn1 pn1Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                eu0 eu0Var = (eu0) obj;
                d4 d4Var = eu0Var instanceof d4 ? (d4) eu0Var : null;
                if (d4Var != null) {
                    d4Var.getAndroidViewsHandler$ui().removeViewInLayout(pn1Var);
                    tj1.a(d4Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(d4Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(pn1Var));
                    pn1Var.setImportantForAccessibility(0);
                }
                pn1Var.removeAllViewsInLayout();
                return Unit.a;
            case 1:
                pn1Var.u = (Function1) obj;
                return Unit.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = pn1Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = pn1Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
