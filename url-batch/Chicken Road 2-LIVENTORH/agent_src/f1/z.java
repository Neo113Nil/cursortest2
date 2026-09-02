package f1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class z extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f1549b = new e1(this);

    /* renamed from: c, reason: collision with root package name */
    public x f1550c;
    public x d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(m0 m0Var, androidx.emoji2.text.g gVar) {
        int v3 = m0Var.v();
        View view = null;
        if (v3 == 0) {
            return null;
        }
        int l4 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = m0Var.u(i4);
            int abs = Math.abs(((gVar.c(u3) / 2) + gVar.e(u3)) - l4);
            if (abs < i) {
                view = u3;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(m0 m0Var, View view) {
        int[] iArr = new int[2];
        if (m0Var.d()) {
            iArr[0] = b(view, d(m0Var));
        } else {
            iArr[0] = 0;
        }
        if (m0Var.e()) {
            iArr[1] = b(view, e(m0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(m0 m0Var) {
        x xVar = this.d;
        if (xVar == null || ((m0) xVar.f326b) != m0Var) {
            this.d = new x(m0Var, 0);
        }
        return this.d;
    }

    public final androidx.emoji2.text.g e(m0 m0Var) {
        x xVar = this.f1550c;
        if (xVar == null || ((m0) xVar.f326b) != m0Var) {
            this.f1550c = new x(m0Var, 1);
        }
        return this.f1550c;
    }

    public final void f() {
        m0 layoutManager;
        RecyclerView recyclerView = this.f1548a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c4 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c4 == null) {
            return;
        }
        int[] a2 = a(layoutManager, c4);
        int i = a2[0];
        if (i == 0 && a2[1] == 0) {
            return;
        }
        this.f1548a.a0(i, a2[1], false);
    }
}
