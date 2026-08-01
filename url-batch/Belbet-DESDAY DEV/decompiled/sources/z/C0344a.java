package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4198a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4200c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4201e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4202f = false;

    public C0344a(Activity activity) {
        this.f4199b = activity;
        this.f4200c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4199b == activity) {
            this.f4199b = null;
            this.f4201e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4201e || this.f4202f || this.d) {
            return;
        }
        Object obj = this.f4198a;
        try {
            Object obj2 = AbstractC0345b.f4205c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4200c) {
                AbstractC0345b.f4208g.postAtFrontOfQueue(new H.a(AbstractC0345b.f4204b.get(activity), 5, obj2));
                this.f4202f = true;
                this.f4198a = null;
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
        if (this.f4199b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
