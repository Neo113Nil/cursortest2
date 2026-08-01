package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4620a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4621b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4622c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4623d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4624e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4625f = false;

    public d(Activity activity) {
        this.f4621b = activity;
        this.f4622c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4621b == activity) {
            this.f4621b = null;
            this.f4624e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4624e || this.f4625f || this.f4623d) {
            return;
        }
        Object obj = this.f4620a;
        try {
            Object obj2 = e.f4628c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4622c) {
                e.f4632g.postAtFrontOfQueue(new H.a(e.f4627b.get(activity), 5, obj2));
                this.f4625f = true;
                this.f4620a = null;
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
        if (this.f4621b == activity) {
            this.f4623d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
