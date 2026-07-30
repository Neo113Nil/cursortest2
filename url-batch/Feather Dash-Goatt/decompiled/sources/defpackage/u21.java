package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u21 extends Thread {
    public final int d;

    public u21(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.d);
        super.run();
    }
}
