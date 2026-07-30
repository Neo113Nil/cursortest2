package y;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public Object f8449d;

    /* renamed from: e, reason: collision with root package name */
    public Activity f8450e;

    /* renamed from: i, reason: collision with root package name */
    public final int f8451i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8452l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8453m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8454n = false;

    public c(Activity activity) {
        this.f8450e = activity;
        this.f8451i = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f8450e == activity) {
            this.f8450e = null;
            this.f8453m = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f8453m || this.f8454n || this.f8452l) {
            return;
        }
        Object obj = this.f8449d;
        try {
            Object obj2 = d.f8457c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f8451i) {
                d.f8461g.postAtFrontOfQueue(new b(d.f8456b.get(activity), 0, obj2));
                this.f8454n = true;
                this.f8449d = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f8450e == activity) {
            this.f8452l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
