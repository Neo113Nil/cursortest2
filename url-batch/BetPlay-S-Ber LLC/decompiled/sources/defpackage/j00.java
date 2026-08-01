package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;
import defpackage.l00;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class j00 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, gq gqVar) {
        gqVar.getClass();
        if (activity instanceof nq) {
            iq lifecycle = ((nq) activity).getLifecycle();
            if (lifecycle instanceof a) {
                ((a) lifecycle).e(gqVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            l00.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new l00.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new l00(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
