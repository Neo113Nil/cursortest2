package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ch extends bh {
    @Override // defpackage.ah, defpackage.yg
    public void b(b50 b50Var, b50 b50Var2, Window window, View view, boolean z, boolean z2) {
        b50Var.getClass();
        b50Var2.getClass();
        window.getClass();
        view.getClass();
        c90.a(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof jb)) {
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
        vw vwVar = new vw(view, 12);
        int i3 = Build.VERSION.SDK_INT;
        u90 vb0Var = i3 >= 35 ? new vb0(window, vwVar) : i3 >= 30 ? new ub0(window, vwVar) : new sb0(window, vwVar);
        vb0Var.d(!z);
        vb0Var.c(!z2);
    }
}
