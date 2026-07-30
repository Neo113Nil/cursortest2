package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import defpackage.t21;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class r21 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, ng0 ng0Var) {
        xg0 f;
        activity.getClass();
        ng0Var.getClass();
        if (!(activity instanceof vg0) || (f = ((vg0) activity).f()) == null) {
            return;
        }
        f.d(ng0Var);
    }

    public static void b(Activity activity) {
        activity.getClass();
        t21.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new t21.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new t21(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
