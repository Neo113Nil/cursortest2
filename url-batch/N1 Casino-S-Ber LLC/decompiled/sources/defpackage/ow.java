package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ow extends zy {
    public RecyclerView a;
    public final z20 b = new z20(this);
    public mw c;
    public mw d;

    public static int b(View view, hh hhVar) {
        return ((hhVar.c(view) / 2) + hhVar.e(view)) - ((hhVar.l() / 2) + hhVar.k());
    }

    public static View c(xy xyVar, hh hhVar) {
        int v = xyVar.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (hhVar.l() / 2) + hhVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = xyVar.u(i2);
            int abs = Math.abs(((hhVar.c(u) / 2) + hhVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(xy xyVar, View view) {
        int[] iArr = new int[2];
        if (xyVar.d()) {
            iArr[0] = b(view, d(xyVar));
        } else {
            iArr[0] = 0;
        }
        if (xyVar.e()) {
            iArr[1] = b(view, e(xyVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final hh d(xy xyVar) {
        mw mwVar = this.d;
        if (mwVar == null || ((xy) mwVar.b) != xyVar) {
            this.d = new mw(xyVar, 0);
        }
        return this.d;
    }

    public final hh e(xy xyVar) {
        mw mwVar = this.c;
        if (mwVar == null || ((xy) mwVar.b) != xyVar) {
            this.c = new mw(xyVar, 1);
        }
        return this.c;
    }

    public final void f() {
        xy layoutManager;
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
