package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0078l enumC0078l) {
        t d;
        h1.d.e(activity, "activity");
        h1.d.e(enumC0078l, "event");
        if (!(activity instanceof r) || (d = ((r) activity).d()) == null) {
            return;
        }
        d.d(enumC0078l);
    }

    public static void b(Activity activity) {
        h1.d.e(activity, "activity");
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
