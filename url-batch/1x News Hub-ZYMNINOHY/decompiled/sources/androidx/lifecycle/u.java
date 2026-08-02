package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public abstract class u {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0165g event) {
        o e3;
        kotlin.jvm.internal.j.e(event, "event");
        if (!(activity instanceof m) || (e3 = ((m) activity).e()) == null) {
            return;
        }
        e3.e(event);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            w.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new w.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
