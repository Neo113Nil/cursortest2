package k0;

import android.os.Process;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f2303f;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2303f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2303f);
        super.run();
    }
}
