package D0;

import android.os.Process;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f350f;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f351g;

    public /* synthetic */ p(Runnable runnable, int i7) {
        this.f350f = i7;
        this.f351g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f350f) {
            case 0:
                try {
                    this.f351g.run();
                    break;
                } catch (Exception e4) {
                    AbstractC0521b.l("Executor", "Background execution failure.", e4);
                    return;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Process.setThreadPriority(0);
                this.f351g.run();
                break;
            default:
                this.f351g.run();
                break;
        }
    }

    public String toString() {
        switch (this.f350f) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return this.f351g.toString();
            default:
                return super.toString();
        }
    }
}
