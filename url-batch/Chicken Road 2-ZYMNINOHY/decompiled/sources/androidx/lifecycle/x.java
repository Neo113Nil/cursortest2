package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.z;

/* loaded from: classes.dex */
public abstract class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0229h event) {
        kotlin.jvm.internal.i.e(event, "event");
        if (activity instanceof InterfaceC0235n) {
            AbstractC0231j lifecycle = ((InterfaceC0235n) activity).getLifecycle();
            if (lifecycle instanceof C0237p) {
                ((C0237p) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            z.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new z.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new z(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
