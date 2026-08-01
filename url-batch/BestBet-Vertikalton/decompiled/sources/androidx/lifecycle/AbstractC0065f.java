package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0065f implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k1.e.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        k1.e.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        k1.e.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        k1.e.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k1.e.e(activity, "activity");
        k1.e.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        k1.e.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k1.e.e(activity, "activity");
    }
}
