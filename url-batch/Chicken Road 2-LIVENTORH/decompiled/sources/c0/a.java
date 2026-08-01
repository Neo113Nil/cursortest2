package c0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f742a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f744c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f745e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f746f = false;

    public a(Activity activity) {
        this.f743b = activity;
        this.f744c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f743b == activity) {
            this.f743b = null;
            this.f745e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f745e || this.f746f || this.d) {
            return;
        }
        Object obj = this.f742a;
        try {
            Object obj2 = b.f749c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f744c) {
                b.f752g.postAtFrontOfQueue(new androidx.fragment.app.e(b.f748b.get(activity), obj2, 3));
                this.f746f = true;
                this.f742a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f743b == activity) {
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
