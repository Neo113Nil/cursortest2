package A;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f5a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f6b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9f = false;

    public c(Activity activity) {
        this.f6b = activity;
        this.f7c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f6b == activity) {
            this.f6b = null;
            this.f8e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f8e || this.f9f || this.d) {
            return;
        }
        Object obj = this.f5a;
        try {
            Object obj2 = d.f12c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f7c) {
                d.f15g.postAtFrontOfQueue(new b(d.f11b.get(activity), obj2, 2, false));
                this.f9f = true;
                this.f5a = null;
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
        if (this.f6b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
