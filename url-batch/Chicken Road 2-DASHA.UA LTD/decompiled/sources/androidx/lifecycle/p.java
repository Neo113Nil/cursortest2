package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class p implements Application.ActivityLifecycleCallbacks {
    public static final o Companion = new o();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        e0.h.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new p());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        e0.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        e0.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        a.a.i(activity, d.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        e0.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
        e0.h.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        e0.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        e0.h.e(activity, "activity");
    }
}
