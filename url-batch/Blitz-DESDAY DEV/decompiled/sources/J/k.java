package J;

import android.os.Process;

/* loaded from: classes.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f379a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f379a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f379a);
        super.run();
    }
}
