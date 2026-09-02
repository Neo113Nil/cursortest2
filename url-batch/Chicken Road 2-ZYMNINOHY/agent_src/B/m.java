package B;

import android.os.Process;

/* loaded from: classes.dex */
public final class m extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f184a;

    public m(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f184a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f184a);
        super.run();
    }
}
