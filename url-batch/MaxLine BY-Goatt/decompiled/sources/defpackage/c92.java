package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c92 extends Thread {
    public final int m;

    public c92(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.m = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.m);
        super.run();
    }
}
