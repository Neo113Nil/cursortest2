package k0;

import android.os.Process;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f2155f;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2155f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2155f);
        super.run();
    }
}
