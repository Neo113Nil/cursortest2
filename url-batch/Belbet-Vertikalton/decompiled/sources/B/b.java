package B;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f28a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f29b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31d = false;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32f = false;

    public b(Activity activity) {
        this.f29b = activity;
        this.f30c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f29b == activity) {
            this.f29b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.e || this.f32f || this.f31d) {
            return;
        }
        Object obj = this.f28a;
        try {
            Object obj2 = c.f35c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f30c) {
                c.f38g.postAtFrontOfQueue(new a(c.f34b.get(activity), obj2, 2, false));
                this.f32f = true;
                this.f28a = null;
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
        if (this.f29b == activity) {
            this.f31d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
