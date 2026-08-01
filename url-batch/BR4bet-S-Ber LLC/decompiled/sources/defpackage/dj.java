package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class dj extends cj {
    @Override // defpackage.bj, defpackage.zi
    public void b(e80 e80Var, e80 e80Var2, Window window, View view, boolean z, boolean z2) {
        e80Var.getClass();
        e80Var2.getClass();
        window.getClass();
        view.getClass();
        xf.H(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof ec)) {
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
        ky kyVar = new ky(view, 14);
        int i3 = Build.VERSION.SDK_INT;
        mz cf0Var = i3 >= 35 ? new cf0(window, kyVar) : i3 >= 30 ? new bf0(window, kyVar) : new ze0(window, kyVar);
        cf0Var.H(!z);
        cf0Var.G(!z2);
    }
}
