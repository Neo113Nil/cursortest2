package x;

import android.os.Process;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330i extends Thread {

    /* renamed from: e, reason: collision with root package name */
    public final int f3588e;

    public C0330i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f3588e = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3588e);
        super.run();
    }
}
