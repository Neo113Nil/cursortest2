package l3;

import android.os.Process;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: d, reason: collision with root package name */
    public final int f5859d;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5859d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f5859d);
        super.run();
    }
}
