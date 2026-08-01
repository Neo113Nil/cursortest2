package z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f4313a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f4314b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4315c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4316e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4317f = false;

    public C0317a(Activity activity) {
        this.f4314b = activity;
        this.f4315c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f4314b == activity) {
            this.f4314b = null;
            this.f4316e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f4316e || this.f4317f || this.d) {
            return;
        }
        Object obj = this.f4313a;
        try {
            Object obj2 = AbstractC0318b.f4320c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f4315c) {
                AbstractC0318b.f4323g.postAtFrontOfQueue(new H.a(AbstractC0318b.f4319b.get(activity), 5, obj2));
                this.f4317f = true;
                this.f4313a = null;
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
        if (this.f4314b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
