package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ed2 implements Runnable {
    public final /* synthetic */ int m;
    public final Runnable n;

    public /* synthetic */ ed2(Runnable runnable, int i) {
        this.m = i;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                try {
                    this.n.run();
                    break;
                } catch (Exception e) {
                    s93.D("Executor", "Background execution failure.", e);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.n.run();
                break;
        }
    }
}
