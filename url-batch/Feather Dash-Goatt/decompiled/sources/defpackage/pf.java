package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pf implements yp0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + op.y(this) + ']';
            default:
                return "DisposeOnCancel[" + ((rs) obj) + ']';
        }
    }
}
