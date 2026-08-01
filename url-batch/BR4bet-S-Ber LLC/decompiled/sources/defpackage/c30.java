package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c30 extends Thread {
    public final int f;

    public c30(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f);
        super.run();
    }
}
