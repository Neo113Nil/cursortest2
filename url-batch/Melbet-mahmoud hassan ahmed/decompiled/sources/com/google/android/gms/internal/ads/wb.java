package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class wb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f13783f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f13784g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13785h = false;

    public wb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f13784g = new WeakReference<>(activityLifecycleCallbacks);
        this.f13783f = application;
    }

    protected final void a(vb vbVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f13784g.get();
            if (activityLifecycleCallbacks != null) {
                vbVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f13785h) {
                    return;
                }
                this.f13783f.unregisterActivityLifecycleCallbacks(this);
                this.f13785h = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new ob(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new ub(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new rb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new qb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new tb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new pb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new sb(this, activity));
    }
}
