package T1;

import android.os.Process;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2589d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f2590e;

    public /* synthetic */ i(Runnable runnable, int i2) {
        this.f2589d = i2;
        this.f2590e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2589d) {
            case 0:
                this.f2590e.run();
                break;
            case 1:
                try {
                    this.f2590e.run();
                    break;
                } catch (Exception e7) {
                    d4.c.l("Executor", "Background execution failure.", e7);
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.f2590e.run();
                break;
        }
    }

    public String toString() {
        switch (this.f2589d) {
            case 0:
                return this.f2590e.toString();
            default:
                return super.toString();
        }
    }
}
