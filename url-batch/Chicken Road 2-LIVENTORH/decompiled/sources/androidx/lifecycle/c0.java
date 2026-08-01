package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.e0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t e4;
        f3.d.e(lVar, "event");
        if (!(activity instanceof r) || (e4 = ((r) activity).e()) == null) {
            return;
        }
        e4.d(lVar);
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
