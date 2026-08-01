package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4306a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4308c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4309e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4310f = false;

    public C0343a(Activity activity) {
        this.f4307b = activity;
        this.f4308c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4307b == activity) {
            this.f4307b = null;
            this.f4309e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4309e || this.f4310f || this.d) {
            return;
        }
        Object obj = this.f4306a;
        try {
            Object obj2 = AbstractC0344b.f4313c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4308c) {
                AbstractC0344b.f4316g.postAtFrontOfQueue(new H.a(AbstractC0344b.f4312b.get(activity), 5, obj2));
                this.f4310f = true;
                this.f4306a = null;
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
        if (this.f4307b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
