package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.F;

/* loaded from: classes.dex */
public abstract class D {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0071l enumC0071l) {
        v e2;
        k1.e.e(activity, "activity");
        k1.e.e(enumC0071l, "event");
        if (!(activity instanceof t) || (e2 = ((t) activity).e()) == null) {
            return;
        }
        e2.d(enumC0071l);
    }

    public static void b(Activity activity) {
        k1.e.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            F.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new F.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new F(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
