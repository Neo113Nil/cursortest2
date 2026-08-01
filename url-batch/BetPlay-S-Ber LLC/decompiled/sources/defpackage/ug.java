package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ug extends tg {
    @Override // defpackage.sg, defpackage.qg
    public void b(i50 i50Var, i50 i50Var2, Window window, View view, boolean z, boolean z2) {
        i50Var.getClass();
        i50Var2.getClass();
        window.getClass();
        view.getClass();
        op.P(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof lb)) {
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
        ix ixVar = new ix(view, 12);
        int i3 = Build.VERSION.SDK_INT;
        l70 ec0Var = i3 >= 35 ? new ec0(window, ixVar) : i3 >= 30 ? new dc0(window, ixVar) : new bc0(window, ixVar);
        ec0Var.U(!z);
        ec0Var.T(!z2);
    }
}
