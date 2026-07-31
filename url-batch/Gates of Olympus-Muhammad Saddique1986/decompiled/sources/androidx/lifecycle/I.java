package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.K;

/* loaded from: classes.dex */
public abstract class I {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0285n enumC0285n) {
        C0294x e3;
        f2.j.f(activity, "activity");
        f2.j.f(enumC0285n, "event");
        if (!(activity instanceof InterfaceC0292v) || (e3 = ((InterfaceC0292v) activity).e()) == null) {
            return;
        }
        e3.d(enumC0285n);
    }

    public static void b(Activity activity) {
        f2.j.f(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            K.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new K.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new K(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
