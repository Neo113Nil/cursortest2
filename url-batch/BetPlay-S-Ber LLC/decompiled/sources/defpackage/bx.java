package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bx extends pz {
    public RecyclerView a;
    public final k30 b = new k30(this);
    public yw c;
    public yw d;

    public static int b(View view, zg zgVar) {
        return ((zgVar.c(view) / 2) + zgVar.e(view)) - ((zgVar.l() / 2) + zgVar.k());
    }

    public static View c(nz nzVar, zg zgVar) {
        int v = nzVar.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int l = (zgVar.l() / 2) + zgVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = nzVar.u(i2);
            int abs = Math.abs(((zgVar.c(u) / 2) + zgVar.e(u)) - l);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(nz nzVar, View view) {
        int[] iArr = new int[2];
        if (nzVar.d()) {
            iArr[0] = b(view, d(nzVar));
        } else {
            iArr[0] = 0;
        }
        if (nzVar.e()) {
            iArr[1] = b(view, e(nzVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final zg d(nz nzVar) {
        yw ywVar = this.d;
        if (ywVar == null || ((nz) ywVar.b) != nzVar) {
            this.d = new yw(nzVar, 0);
        }
        return this.d;
    }

    public final zg e(nz nzVar) {
        yw ywVar = this.c;
        if (ywVar == null || ((nz) ywVar.b) != nzVar) {
            this.c = new yw(nzVar, 1);
        }
        return this.c;
    }

    public final void f() {
        nz layoutManager;
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
        this.a.a0(i, false, a[1]);
    }
}
