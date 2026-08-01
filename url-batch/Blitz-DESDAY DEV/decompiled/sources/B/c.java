package B;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f90a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f91b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94f = false;

    public c(Activity activity) {
        this.f91b = activity;
        this.f92c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f91b == activity) {
            this.f91b = null;
            this.f93e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f93e || this.f94f || this.d) {
            return;
        }
        Object obj = this.f90a;
        try {
            Object obj2 = d.f97c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f92c) {
                d.f100g.postAtFrontOfQueue(new b(d.f96b.get(activity), obj2, 2, false));
                this.f94f = true;
                this.f90a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f91b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
