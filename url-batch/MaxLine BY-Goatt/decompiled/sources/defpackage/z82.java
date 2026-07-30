package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.b92;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z82 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, yc1 yc1Var) {
        activity.getClass();
        yc1Var.getClass();
        if (activity instanceof id1) {
            ad1 lifecycle = ((id1) activity).getLifecycle();
            if (lifecycle instanceof kd1) {
                ((kd1) lifecycle).f(yc1Var);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            b92.a.Companion.getClass();
            a92.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new b92(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
