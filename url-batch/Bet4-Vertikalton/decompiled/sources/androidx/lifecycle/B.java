package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0071l enumC0071l) {
        t d;
        d1.d.e(activity, "activity");
        d1.d.e(enumC0071l, "event");
        if (!(activity instanceof r) || (d = ((r) activity).d()) == null) {
            return;
        }
        d.d(enumC0071l);
    }

    public static void b(Activity activity) {
        d1.d.e(activity, "activity");
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
