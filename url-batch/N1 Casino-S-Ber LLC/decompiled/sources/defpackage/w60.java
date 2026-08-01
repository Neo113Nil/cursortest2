package defpackage;

import android.widget.FrameLayout;
import com.derinko.gbini.n1casino.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class w60 {
    public static final a7 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        a7 a7Var = new a7();
        a7Var.F = new ArrayList();
        a7Var.I = false;
        a7Var.J = 0;
        a7Var.G = false;
        a7Var.I(new xi(2));
        a7Var.I(new y9());
        a7Var.I(new xi(1));
        a = a7Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, s60 s60Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (s60Var == null) {
            s60Var = a;
        }
        s60 clone = s60Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((s60) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            t8.c();
            return;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        v60 v60Var = new v60();
        v60Var.f = clone;
        v60Var.g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(v60Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(v60Var);
    }

    public static n6 b() {
        n6 n6Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (n6Var = (n6) weakReference.get()) != null) {
            return n6Var;
        }
        n6 n6Var2 = new n6(0);
        threadLocal.set(new WeakReference(n6Var2));
        return n6Var2;
    }
}
