package defpackage;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class m51 implements Runnable {
    public final /* synthetic */ int d;
    public final Runnable e;

    public /* synthetic */ m51(Runnable runnable, int i) {
        this.d = i;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Runnable runnable = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    xa0.l("Executor", "Background execution failure.", e);
                    return;
                }
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return this.e.toString();
            default:
                return super.toString();
        }
    }
}
