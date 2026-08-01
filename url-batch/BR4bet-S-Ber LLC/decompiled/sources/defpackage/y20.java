package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.a30;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class y20 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, gs gsVar) {
        os e;
        gsVar.getClass();
        if (!(activity instanceof ms) || (e = ((ms) activity).e()) == null) {
            return;
        }
        e.d(gsVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            a30.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new a30.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new a30(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
