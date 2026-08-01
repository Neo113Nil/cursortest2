package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.i90;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class g90 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, fx fxVar) {
        nx e;
        fxVar.getClass();
        if (!(activity instanceof lx) || (e = ((lx) activity).e()) == null) {
            return;
        }
        e.d(fxVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            i90.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new i90.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new i90(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
