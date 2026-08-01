package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4181a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4183c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4184e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4185f = false;

    public C0345a(Activity activity) {
        this.f4182b = activity;
        this.f4183c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4182b == activity) {
            this.f4182b = null;
            this.f4184e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4184e || this.f4185f || this.d) {
            return;
        }
        Object obj = this.f4181a;
        try {
            Object obj2 = AbstractC0346b.f4188c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4183c) {
                AbstractC0346b.f4191g.postAtFrontOfQueue(new H.a(AbstractC0346b.f4187b.get(activity), 5, obj2));
                this.f4185f = true;
                this.f4181a = null;
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
        if (this.f4182b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
