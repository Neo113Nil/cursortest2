package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a4 extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ d4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(d4 d4Var, int i) {
        super(0);
        this.d = i;
        this.e = d4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        s3 s3Var;
        int i = this.d;
        d4 d4Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                MotionEvent motionEvent = d4Var.w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    d4Var.x0 = SystemClock.uptimeMillis();
                    d4Var.post(d4Var.C0);
                }
                return Unit.a;
            default:
                s3Var = d4Var.get_viewTreeOwners();
                return s3Var;
        }
    }
}
