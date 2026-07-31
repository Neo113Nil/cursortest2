package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.r;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // androidx.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        P0.h.e(activity, "activity");
        int i2 = r.f1629f;
        if (Build.VERSION.SDK_INT >= 29) {
            r.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new r.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new r(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
