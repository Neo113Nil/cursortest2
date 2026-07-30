package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.yu1;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wu1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void PxuCJdSBwIXG(Activity activity, e01 e01Var) {
        e01Var.getClass();
        if (activity instanceof o01) {
            s01 rtx2ld2ELZv4 = ((o01) activity).rtx2ld2ELZv4();
            if (rtx2ld2ELZv4 instanceof s01) {
                rtx2ld2ELZv4.Y1f8riQaR6yg(e01Var);
            }
        }
    }

    public static void lS5Rgt96tfkO(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            yu1.PxuCJdSBwIXG.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new yu1.PxuCJdSBwIXG());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new yu1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
