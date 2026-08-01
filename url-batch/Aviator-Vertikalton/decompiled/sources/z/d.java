package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4616a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4619d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4620e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4621f = false;

    public d(Activity activity) {
        this.f4617b = activity;
        this.f4618c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4617b == activity) {
            this.f4617b = null;
            this.f4620e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4620e || this.f4621f || this.f4619d) {
            return;
        }
        Object obj = this.f4616a;
        try {
            Object obj2 = e.f4624c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4618c) {
                e.f4628g.postAtFrontOfQueue(new H.a(e.f4623b.get(activity), 5, obj2));
                this.f4621f = true;
                this.f4616a = null;
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
        if (this.f4617b == activity) {
            this.f4619d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
