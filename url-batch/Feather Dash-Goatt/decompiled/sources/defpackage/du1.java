package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class du1 implements Executor {
    public static final /* synthetic */ du1 e = new du1(0);
    public static final /* synthetic */ du1 g = new du1(1);
    public final /* synthetic */ int d;

    public /* synthetic */ du1(int i) {
        this.d = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
