package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4192a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4194c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4195e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4196f = false;

    public C0344a(Activity activity) {
        this.f4193b = activity;
        this.f4194c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4193b == activity) {
            this.f4193b = null;
            this.f4195e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4195e || this.f4196f || this.d) {
            return;
        }
        Object obj = this.f4192a;
        try {
            Object obj2 = AbstractC0345b.f4199c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4194c) {
                AbstractC0345b.f4202g.postAtFrontOfQueue(new H.a(AbstractC0345b.f4198b.get(activity), 5, obj2));
                this.f4196f = true;
                this.f4192a = null;
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
        if (this.f4193b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
