package H;

import android.os.Process;

/* loaded from: classes.dex */
public final class l extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f241a;

    public l(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f241a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f241a);
        super.run();
    }
}
