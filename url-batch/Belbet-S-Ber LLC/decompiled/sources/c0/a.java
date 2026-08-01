package c0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f859a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f861c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f862e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f863f = false;

    public a(Activity activity) {
        this.f860b = activity;
        this.f861c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f860b == activity) {
            this.f860b = null;
            this.f862e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f862e || this.f863f || this.d) {
            return;
        }
        Object obj = this.f859a;
        try {
            Object obj2 = b.f866c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f861c) {
                b.f869g.postAtFrontOfQueue(new androidx.fragment.app.e(b.f865b.get(activity), obj2, 3));
                this.f863f = true;
                this.f859a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f860b == activity) {
            this.d = true;
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
