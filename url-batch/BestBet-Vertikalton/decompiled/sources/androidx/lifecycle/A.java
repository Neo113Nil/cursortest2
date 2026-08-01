package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class A {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        k1.e.e(activity, "activity");
        k1.e.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
