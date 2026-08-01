package defpackage;

import android.widget.FrameLayout;
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class da0 {
    public static final k7 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        k7 k7Var = new k7();
        k7Var.F = new ArrayList();
        k7Var.I = false;
        k7Var.J = 0;
        k7Var.G = false;
        k7Var.I(new fl(2));
        k7Var.I(new ka());
        k7Var.I(new fl(1));
        a = k7Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, z90 z90Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (z90Var == null) {
            z90Var = a;
        }
        z90 clone = z90Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((z90) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            g9.b();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ca0 ca0Var = new ca0();
        ca0Var.f = clone;
        ca0Var.g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(ca0Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(ca0Var);
    }

    public static x6 b() {
        x6 x6Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (x6Var = (x6) weakReference.get()) != null) {
            return x6Var;
        }
        x6 x6Var2 = new x6(0);
        threadLocal.set(new WeakReference(x6Var2));
        return x6Var2;
    }
}
