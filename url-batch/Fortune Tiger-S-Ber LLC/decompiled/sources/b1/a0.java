package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 extends p0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f729a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f730b = new f1(this);
    public y c;

    /* renamed from: d, reason: collision with root package name */
    public y f731d;

    public static int b(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(n0 n0Var, androidx.emoji2.text.g gVar) {
        int v3 = n0Var.v();
        View view = null;
        if (v3 == 0) {
            return null;
        }
        int l4 = (gVar.l() / 2) + gVar.k();
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < v3; i5++) {
            View u3 = n0Var.u(i5);
            int abs = Math.abs(((gVar.c(u3) / 2) + gVar.e(u3)) - l4);
            if (abs < i4) {
                view = u3;
                i4 = abs;
            }
        }
        return view;
    }

    public final int[] a(n0 n0Var, View view) {
        int[] iArr = new int[2];
        if (n0Var.d()) {
            iArr[0] = b(view, d(n0Var));
        } else {
            iArr[0] = 0;
        }
        if (n0Var.e()) {
            iArr[1] = b(view, e(n0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final androidx.emoji2.text.g d(n0 n0Var) {
        y yVar = this.f731d;
        if (yVar == null || ((n0) yVar.f337b) != n0Var) {
            this.f731d = new y(n0Var, 0);
        }
        return this.f731d;
    }

    public final androidx.emoji2.text.g e(n0 n0Var) {
        y yVar = this.c;
        if (yVar == null || ((n0) yVar.f337b) != n0Var) {
            this.c = new y(n0Var, 1);
        }
        return this.c;
    }

    public final void f() {
        n0 layoutManager;
        RecyclerView recyclerView = this.f729a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a4 = a(layoutManager, c);
        int i4 = a4[0];
        if (i4 == 0 && a4[1] == 0) {
            return;
        }
        this.f729a.a0(i4, a4[1], false);
    }
}
