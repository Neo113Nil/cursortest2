package c7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1684a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1685b;

    public /* synthetic */ e(int i7, Object obj) {
        this.f1684a = i7;
        this.f1685b = obj;
    }

    public final String toString() {
        switch (this.f1684a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f1685b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((q6.c) this.f1685b).getClass().getSimpleName() + '@' + a0.i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((i0) this.f1685b) + ']';
        }
    }
}
