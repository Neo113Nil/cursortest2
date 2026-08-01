package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4233a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4235c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4236e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4237f = false;

    public C0328a(Activity activity) {
        this.f4234b = activity;
        this.f4235c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4234b == activity) {
            this.f4234b = null;
            this.f4236e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4236e || this.f4237f || this.d) {
            return;
        }
        Object obj = this.f4233a;
        try {
            Object obj2 = AbstractC0329b.f4240c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4235c) {
                AbstractC0329b.f4243g.postAtFrontOfQueue(new H.a(AbstractC0329b.f4239b.get(activity), 5, obj2));
                this.f4237f = true;
                this.f4233a = null;
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
        if (this.f4234b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
