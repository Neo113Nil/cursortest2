package f8;

import android.os.Process;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4189d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f4190e;

    public /* synthetic */ v0(Runnable runnable, int i3) {
        this.f4189d = i3;
        this.f4190e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4189d) {
            case 0:
                this.f4190e.run();
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f4190e.run();
                break;
            case 2:
                try {
                    this.f4190e.run();
                    break;
                } catch (Exception e2) {
                    k7.e.p("Executor", "Background execution failure.", e2);
                    return;
                }
            default:
                this.f4190e.run();
                break;
        }
    }

    public String toString() {
        switch (this.f4189d) {
            case 0:
                return this.f4190e.toString();
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f4190e.toString();
            default:
                return super.toString();
        }
    }
}
