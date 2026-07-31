package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.K;

/* loaded from: classes.dex */
public abstract class I {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0229n enumC0229n) {
        C0238x e3;
        Z1.i.f(activity, "activity");
        Z1.i.f(enumC0229n, "event");
        if (!(activity instanceof InterfaceC0236v) || (e3 = ((InterfaceC0236v) activity).e()) == null) {
            return;
        }
        e3.d(enumC0229n);
    }

    public static void b(Activity activity) {
        Z1.i.f(activity, "activity");
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
