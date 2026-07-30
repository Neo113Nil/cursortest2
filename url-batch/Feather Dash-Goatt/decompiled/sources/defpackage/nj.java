package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nj implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ nj(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        MainActivity mainActivity = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mainActivity.reportFullyDrawn();
                return null;
            case 1:
                mainActivity.w.setValue(null);
                return Unit.a;
            default:
                return uq1.J(mainActivity);
        }
    }
}
