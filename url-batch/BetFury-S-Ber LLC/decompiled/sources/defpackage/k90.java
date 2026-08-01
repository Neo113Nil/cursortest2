package defpackage;

import android.os.Process;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k90 extends Thread {
    public final int f;

    public k90(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f);
        super.run();
    }
}
