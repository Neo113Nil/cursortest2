package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class l {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        P0.h.e(activity, "activity");
        P0.h.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
