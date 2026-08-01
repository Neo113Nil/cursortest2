package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class A {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        g1.f.e(activity, "activity");
        g1.f.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
