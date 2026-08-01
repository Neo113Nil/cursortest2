package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4237a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4239c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4240e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4241f = false;

    public C0341a(Activity activity) {
        this.f4238b = activity;
        this.f4239c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4238b == activity) {
            this.f4238b = null;
            this.f4240e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4240e || this.f4241f || this.d) {
            return;
        }
        Object obj = this.f4237a;
        try {
            Object obj2 = AbstractC0342b.f4244c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4239c) {
                AbstractC0342b.f4247g.postAtFrontOfQueue(new H.a(AbstractC0342b.f4243b.get(activity), 5, obj2));
                this.f4241f = true;
                this.f4237a = null;
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
        if (this.f4238b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
