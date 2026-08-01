package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class rl extends ql {
    @Override // defpackage.pl, defpackage.nl
    public void b(ah0 ah0Var, ah0 ah0Var2, Window window, View view, boolean z, boolean z2) {
        ah0Var.getClass();
        ah0Var2.getClass();
        window.getClass();
        view.getClass();
        ud0.z(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof dd)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        xy xyVar = new xy(view, 17);
        int i3 = Build.VERSION.SDK_INT;
        mc0 hp0Var = i3 >= 35 ? new hp0(window, xyVar) : i3 >= 30 ? new gp0(window, xyVar) : new ep0(window, xyVar);
        hp0Var.l(!z);
        hp0Var.k(!z2);
    }
}
