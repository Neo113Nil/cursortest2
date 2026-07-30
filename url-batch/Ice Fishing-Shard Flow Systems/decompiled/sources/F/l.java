package F;

import android.os.Process;

/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f750d;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f750d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f750d);
        super.run();
    }
}
