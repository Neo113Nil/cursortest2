package defpackage;

import android.widget.FrameLayout;
import com.trembin.nirefon.betfury.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class oj0 {
    public static final w7 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        w7 w7Var = new w7();
        w7Var.F = new ArrayList();
        w7Var.I = false;
        w7Var.J = 0;
        w7Var.G = false;
        w7Var.I(new fo(2));
        w7Var.I(new eb());
        w7Var.I(new fo(1));
        a = w7Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, kj0 kj0Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (kj0Var == null) {
            kj0Var = a;
        }
        kj0 clone = kj0Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((kj0) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            s9.c();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        nj0 nj0Var = new nj0();
        nj0Var.f = clone;
        nj0Var.g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(nj0Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(nj0Var);
    }

    public static g7 b() {
        g7 g7Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (g7Var = (g7) weakReference.get()) != null) {
            return g7Var;
        }
        g7 g7Var2 = new g7(0);
        threadLocal.set(new WeakReference(g7Var2));
        return g7Var2;
    }
}
