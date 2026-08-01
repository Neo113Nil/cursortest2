package I;

import android.os.Process;

/* loaded from: classes.dex */
public final class k extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f341a;

    public k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f341a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f341a);
        super.run();
    }
}
