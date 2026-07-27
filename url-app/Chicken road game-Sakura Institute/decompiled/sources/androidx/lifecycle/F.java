package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.H;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class F {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0474n event) {
        C0483x e4;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(activity instanceof InterfaceC0481v) || (e4 = ((InterfaceC0481v) activity).e()) == null) {
            return;
        }
        e4.d(event);
    }

    public static void b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new H(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
