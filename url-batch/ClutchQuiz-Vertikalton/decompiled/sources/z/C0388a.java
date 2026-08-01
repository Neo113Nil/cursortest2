package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4019a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4021c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4022e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4023f = false;

    public C0388a(Activity activity) {
        this.f4020b = activity;
        this.f4021c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4020b == activity) {
            this.f4020b = null;
            this.f4022e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4022e || this.f4023f || this.d) {
            return;
        }
        Object obj = this.f4019a;
        try {
            Object obj2 = AbstractC0389b.f4026c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4021c) {
                AbstractC0389b.f4029g.postAtFrontOfQueue(new H.a(AbstractC0389b.f4025b.get(activity), 6, obj2));
                this.f4023f = true;
                this.f4019a = null;
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
        if (this.f4020b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
