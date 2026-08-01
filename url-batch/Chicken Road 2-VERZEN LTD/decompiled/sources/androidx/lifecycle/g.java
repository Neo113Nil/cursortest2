package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        e0.h.e(activity, "activity");
        int i2 = q.f450b;
        if (Build.VERSION.SDK_INT >= 29) {
            p.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new p());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new q(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
