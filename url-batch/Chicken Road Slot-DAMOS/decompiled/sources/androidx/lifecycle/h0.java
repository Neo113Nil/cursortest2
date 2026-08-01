package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.k0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, o oVar) {
        activity.getClass();
        oVar.getClass();
        if (activity instanceof u) {
            w g = ((u) activity).g();
            if (g instanceof w) {
                g.d(oVar);
            }
        }
    }

    public static void b(Activity activity) {
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            k0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new k0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new k0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
