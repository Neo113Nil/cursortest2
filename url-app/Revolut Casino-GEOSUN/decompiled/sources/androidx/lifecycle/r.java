package androidx.lifecycle;

import a.AbstractC0069a;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class r implements Application.ActivityLifecycleCallbacks {
    public static final q Companion = new q();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        F0.i.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new r());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        F0.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        F0.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        F0.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        F0.i.e(activity, "activity");
        int i2 = s.f1539f;
        AbstractC0069a.k(activity, d.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        F0.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        F0.i.e(activity, "activity");
        F0.i.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        F0.i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        F0.i.e(activity, "activity");
    }
}
