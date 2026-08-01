package defpackage;

import android.view.ViewGroup;
import com.awerser.monnit.betplay.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class c70 {
    public static final o7 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        o7 o7Var = new o7();
        o7Var.H = false;
        o7Var.K(new qi(2));
        o7Var.K(new u9());
        o7Var.K(new qi(1));
        a = o7Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, y60 y60Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (y60Var == null) {
            y60Var = a;
        }
        y60 clone = y60Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((y60) obj).x(viewGroup);
            }
        }
        clone.i(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            o8.c();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        b70 b70Var = new b70();
        b70Var.f = clone;
        b70Var.g = viewGroup;
        viewGroup.addOnAttachStateChangeListener(b70Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(b70Var);
    }

    public static e7 b() {
        e7 e7Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (e7Var = (e7) weakReference.get()) != null) {
            return e7Var;
        }
        e7 e7Var2 = new e7(0);
        threadLocal.set(new WeakReference(e7Var2));
        return e7Var2;
    }
}
