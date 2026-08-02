package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eph implements ekz {
    private final Window$OnFrameMetricsAvailableListener a;
    private final jpt b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public eph(jpt jptVar, Window$OnFrameMetricsAvailableListener window$OnFrameMetricsAvailableListener) {
        this.a = window$OnFrameMetricsAvailableListener;
        this.b = jptVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.b());
            return;
        }
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).s("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).s("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 101, "WindowTracker.java")).s("Activity is null or isn't being tracked");
    }

    @Override // defpackage.ekz
    public final void a(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.ekz
    public final void b(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.ekz
    public final void c(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public final synchronized void g() {
        this.d = true;
        k();
    }

    public final synchronized void j() {
        this.d = false;
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void f(int i) {
    }
}
