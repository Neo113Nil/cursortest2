package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j4 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ k4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(k4 k4Var, int i) {
        super(1);
        this.d = i;
        this.e = k4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        k4 k4Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = k4Var.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                e71 e71Var = (e71) obj;
                if (e71Var.e.contains(e71Var)) {
                    gu0 snapshotObserver = k4Var.h.getSnapshotObserver();
                    snapshotObserver.a.b(e71Var, k4Var.R, new w3(e71Var, 2, k4Var));
                }
                return Unit.a;
        }
    }
}
