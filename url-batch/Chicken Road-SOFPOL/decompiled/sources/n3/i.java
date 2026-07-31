package n3;

import android.os.Process;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f5365d;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5365d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f5365d);
        super.run();
    }
}
