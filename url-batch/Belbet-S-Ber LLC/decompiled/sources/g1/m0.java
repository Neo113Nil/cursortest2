package g1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m0 extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f1717a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f1718b = new t1(this);

    /* renamed from: c, reason: collision with root package name */
    public k0 f1719c;
    public k0 d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(a1 a1Var, androidx.emoji2.text.g gVar) {
        int v4 = a1Var.v();
        View view = null;
        if (v4 == 0) {
            return null;
        }
        int l4 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v4; i4++) {
            View u4 = a1Var.u(i4);
            int abs = Math.abs(((gVar.c(u4) / 2) + gVar.e(u4)) - l4);
            if (abs < i) {
                view = u4;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(a1 a1Var, View view) {
        int[] iArr = new int[2];
        if (a1Var.d()) {
            iArr[0] = b(view, d(a1Var));
        } else {
            iArr[0] = 0;
        }
        if (a1Var.e()) {
            iArr[1] = b(view, e(a1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(a1 a1Var) {
        k0 k0Var = this.d;
        if (k0Var == null || ((a1) k0Var.f449b) != a1Var) {
            this.d = new k0(a1Var, 0);
        }
        return this.d;
    }

    public final androidx.emoji2.text.g e(a1 a1Var) {
        k0 k0Var = this.f1719c;
        if (k0Var == null || ((a1) k0Var.f449b) != a1Var) {
            this.f1719c = new k0(a1Var, 1);
        }
        return this.f1719c;
    }

    public final void f() {
        a1 layoutManager;
        RecyclerView recyclerView = this.f1717a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c5 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c5 == null) {
            return;
        }
        int[] a5 = a(layoutManager, c5);
        int i = a5[0];
        if (i == 0 && a5[1] == 0) {
            return;
        }
        this.f1717a.i0(i, a5[1], false);
    }
}
