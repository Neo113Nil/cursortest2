package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f3621a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f3622b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3623d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3624e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3625f = false;

    public a(Activity activity) {
        this.f3622b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f3622b == activity) {
            this.f3622b = null;
            this.f3624e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f3624e || this.f3625f || this.f3623d) {
            return;
        }
        Object obj = this.f3621a;
        try {
            Object obj2 = b.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.c) {
                b.g.postAtFrontOfQueue(new androidx.fragment.app.e(b.f3627b.get(activity), obj2, 6));
                this.f3625f = true;
                this.f3621a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f3622b == activity) {
            this.f3623d = true;
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
