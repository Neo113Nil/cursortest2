package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nf0 extends mf0 {
    @Override // defpackage.lf0, defpackage.jf0, defpackage.of0
    public void b(es2 es2Var, es2 es2Var2, Window window, View view, boolean z, boolean z2) {
        es2Var.getClass();
        es2Var2.getClass();
        window.getClass();
        view.getClass();
        ak2.l(window, false);
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
                    if (list.size() == 4 && (list.get(0) instanceof fw)) {
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
        int i3 = Build.VERSION.SDK_INT;
        nk2 h83Var = i3 >= 35 ? new h83(window) : i3 >= 30 ? new f83(window) : i3 >= 26 ? new e83(window) : new d83(window);
        h83Var.n(!z);
        h83Var.m(true ^ z2);
    }
}
