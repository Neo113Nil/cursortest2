package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class mo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f8657f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f8658g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8659h = false;

    public mo(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f8658g = new WeakReference<>(activityLifecycleCallbacks);
        this.f8657f = application;
    }

    protected final void a(lo loVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f8658g.get();
            if (activityLifecycleCallbacks != null) {
                loVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f8659h) {
                    return;
                }
                this.f8657f.unregisterActivityLifecycleCallbacks(this);
                this.f8659h = true;
            }
        } catch (Exception e7) {
            io0.e("Error while dispatching lifecycle callback.", e7);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new eo(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new ko(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new ho(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new go(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new jo(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new fo(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new io(this, activity));
    }
}
