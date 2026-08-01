package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.e0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t f4;
        u2.c.e(lVar, "event");
        if (!(activity instanceof r) || (f4 = ((r) activity).f()) == null) {
            return;
        }
        f4.d(lVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new e0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new e0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
