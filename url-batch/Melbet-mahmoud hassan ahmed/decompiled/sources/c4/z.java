package c4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
final class z implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Activity f2162f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ u f2163g;

    public z(u uVar, Activity activity) {
        this.f2163g = uVar;
        this.f2162f = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        Application application;
        application = this.f2163g.f2112a;
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f2162f) {
            return;
        }
        this.f2163g.h(new e2(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
