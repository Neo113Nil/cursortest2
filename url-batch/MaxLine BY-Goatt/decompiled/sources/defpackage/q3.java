package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q3 implements Application.ActivityLifecycleCallbacks {
    public Object m;
    public Activity n;
    public final int o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;

    public q3(Activity activity) {
        this.n = activity;
        this.o = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.n == activity) {
            this.n = null;
            this.q = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.q || this.r || this.p) {
            return;
        }
        Object obj = this.m;
        try {
            Object obj2 = r3.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.o) {
                r3.g.postAtFrontOfQueue(new iu0(5, r3.b.get(activity), obj2));
                this.r = true;
                this.m = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.n == activity) {
            this.p = true;
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
