package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.e0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, l lVar) {
        t f5;
        i3.d.e(lVar, "event");
        if (!(activity instanceof r) || (f5 = ((r) activity).f()) == null) {
            return;
        }
        f5.d(lVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new e0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new e0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
