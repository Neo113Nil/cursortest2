package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class j50 extends j80 {
    public RecyclerView a;
    public final ee0 b = new ee0(this);
    public g50 c;
    public g50 d;

    public static int b(View view, wl wlVar) {
        return ((wlVar.c(view) / 2) + wlVar.e(view)) - ((wlVar.l() / 2) + wlVar.k());
    }

    public static View c(h80 h80Var, wl wlVar) {
        int v = h80Var.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (wlVar.l() / 2) + wlVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = h80Var.u(i2);
            int abs = Math.abs(((wlVar.c(u) / 2) + wlVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(h80 h80Var, View view) {
        int[] iArr = new int[2];
        if (h80Var.d()) {
            iArr[0] = b(view, d(h80Var));
        } else {
            iArr[0] = 0;
        }
        if (h80Var.e()) {
            iArr[1] = b(view, e(h80Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final wl d(h80 h80Var) {
        g50 g50Var = this.d;
        if (g50Var == null || ((h80) g50Var.b) != h80Var) {
            this.d = new g50(h80Var, 0);
        }
        return this.d;
    }

    public final wl e(h80 h80Var) {
        g50 g50Var = this.c;
        if (g50Var == null || ((h80) g50Var.b) != h80Var) {
            this.c = new g50(h80Var, 1);
        }
        return this.c;
    }

    public final void f() {
        h80 layoutManager;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a = a(layoutManager, c);
        int i = a[0];
        if (i == 0 && a[1] == 0) {
            return;
        }
        this.a.c0(i, a[1], false);
    }
}
