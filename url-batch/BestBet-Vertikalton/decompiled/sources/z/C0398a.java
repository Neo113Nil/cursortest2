package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4611a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4613c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4614e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4615f = false;

    public C0398a(Activity activity) {
        this.f4612b = activity;
        this.f4613c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4612b == activity) {
            this.f4612b = null;
            this.f4614e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4614e || this.f4615f || this.d) {
            return;
        }
        Object obj = this.f4611a;
        try {
            Object obj2 = AbstractC0399b.f4618c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4613c) {
                AbstractC0399b.f4621g.postAtFrontOfQueue(new H.a(AbstractC0399b.f4617b.get(activity), 5, obj2));
                this.f4615f = true;
                this.f4611a = null;
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
        if (this.f4612b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
