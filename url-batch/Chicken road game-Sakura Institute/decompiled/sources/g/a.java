package g;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3652f;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3652f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b.p0().f3655d.f3659e.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
