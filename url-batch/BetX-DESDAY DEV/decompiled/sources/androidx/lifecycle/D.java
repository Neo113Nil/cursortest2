package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.F;

/* loaded from: classes.dex */
public abstract class D {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0080m enumC0080m) {
        X0.f.e(activity, "activity");
        X0.f.e(enumC0080m, "event");
        if (activity instanceof InterfaceC0086t) {
            AbstractC0082o lifecycle = ((InterfaceC0086t) activity).getLifecycle();
            if (lifecycle instanceof C0088v) {
                ((C0088v) lifecycle).e(enumC0080m);
            }
        }
    }

    public static void b(Activity activity) {
        X0.f.e(activity, "activity");
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
