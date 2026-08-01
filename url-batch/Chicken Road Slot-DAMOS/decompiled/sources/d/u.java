package d;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;
import o3.g0;
import o3.l1;
import o3.m1;
import o3.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends t {
    @Override // d.s, d.q, d.v
    public void b(f0 f0Var, f0 f0Var2, Window window, View view, boolean z10, boolean z11) {
        f0Var.getClass();
        f0Var2.getClass();
        window.getClass();
        view.getClass();
        g8.b.J(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = new o3.f0(viewGroup).iterator();
            while (true) {
                g0 g0Var = (g0) it;
                if (!g0Var.hasNext()) {
                    break;
                }
                Object tag = ((View) g0Var.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof r3.a)) {
                        Iterator it2 = ((Iterable) tag).iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        l.d dVar = new l.d(view);
        int i3 = Build.VERSION.SDK_INT;
        k7.e n1Var = i3 >= 35 ? new n1(window, dVar, 1) : i3 >= 30 ? new l1(window, dVar, 1) : i3 >= 26 ? new m1(window, dVar, 0) : new l1(window, dVar, 0);
        n1Var.P(!z10);
        n1Var.O(!z11);
    }
}
