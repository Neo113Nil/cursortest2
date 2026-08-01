package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0072l enumC0072l) {
        t e2;
        g1.d.e(activity, "activity");
        g1.d.e(enumC0072l, "event");
        if (!(activity instanceof r) || (e2 = ((r) activity).e()) == null) {
            return;
        }
        e2.d(enumC0072l);
    }

    public static void b(Activity activity) {
        g1.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            D.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new D.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new D(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
