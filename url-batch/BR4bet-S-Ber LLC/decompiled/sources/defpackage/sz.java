package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sz extends d20 {
    public RecyclerView a;
    public final b60 b = new b60(this);
    public pz c;
    public pz d;

    public static int b(View view, ij ijVar) {
        return ((ijVar.c(view) / 2) + ijVar.e(view)) - ((ijVar.l() / 2) + ijVar.k());
    }

    public static View c(b20 b20Var, ij ijVar) {
        int v = b20Var.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (ijVar.l() / 2) + ijVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = b20Var.u(i2);
            int abs = Math.abs(((ijVar.c(u) / 2) + ijVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(b20 b20Var, View view) {
        int[] iArr = new int[2];
        if (b20Var.d()) {
            iArr[0] = b(view, d(b20Var));
        } else {
            iArr[0] = 0;
        }
        if (b20Var.e()) {
            iArr[1] = b(view, e(b20Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final ij d(b20 b20Var) {
        pz pzVar = this.d;
        if (pzVar == null || ((b20) pzVar.b) != b20Var) {
            this.d = new pz(b20Var, 0);
        }
        return this.d;
    }

    public final ij e(b20 b20Var) {
        pz pzVar = this.c;
        if (pzVar == null || ((b20) pzVar.b) != b20Var) {
            this.c = new pz(b20Var, 1);
        }
        return this.c;
    }

    public final void f() {
        b20 layoutManager;
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
        this.a.a0(i, a[1], false);
    }
}
