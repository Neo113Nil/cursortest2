package A;

import android.os.Process;

/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f33f;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f33f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f33f);
        super.run();
    }
}
