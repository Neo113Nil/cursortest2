package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4332a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4334c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4335e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4336f = false;

    public C0321a(Activity activity) {
        this.f4333b = activity;
        this.f4334c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4333b == activity) {
            this.f4333b = null;
            this.f4335e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4335e || this.f4336f || this.d) {
            return;
        }
        Object obj = this.f4332a;
        try {
            Object obj2 = AbstractC0322b.f4339c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4334c) {
                AbstractC0322b.f4342g.postAtFrontOfQueue(new H.a(AbstractC0322b.f4338b.get(activity), 5, obj2));
                this.f4336f = true;
                this.f4332a = null;
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
        if (this.f4333b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
