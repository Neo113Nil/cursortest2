package h0;

import android.os.Process;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: f, reason: collision with root package name */
    public final int f1998f;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f1998f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1998f);
        super.run();
    }
}
