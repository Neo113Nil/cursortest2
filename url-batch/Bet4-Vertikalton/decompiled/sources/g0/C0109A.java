package g0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109A extends N {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2256a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f2257b = new f0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0138y f2258c;
    public C0138y d;

    public static int b(View view, U.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(L l2, U.g gVar) {
        int v2 = l2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l3 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = l2.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l3);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(L l2, View view) {
        int[] iArr = new int[2];
        if (l2.d()) {
            iArr[0] = b(view, d(l2));
        } else {
            iArr[0] = 0;
        }
        if (l2.e()) {
            iArr[1] = b(view, e(l2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final U.g d(L l2) {
        C0138y c0138y = this.d;
        if (c0138y == null || ((L) c0138y.f844b) != l2) {
            this.d = new C0138y(l2, 0);
        }
        return this.d;
    }

    public final U.g e(L l2) {
        C0138y c0138y = this.f2258c;
        if (c0138y == null || ((L) c0138y.f844b) != l2) {
            this.f2258c = new C0138y(l2, 1);
        }
        return this.f2258c;
    }

    public final void f() {
        L layoutManager;
        RecyclerView recyclerView = this.f2256a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c2 = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c2 == null) {
            return;
        }
        int[] a2 = a(layoutManager, c2);
        int i = a2[0];
        if (i == 0 && a2[1] == 0) {
            return;
        }
        this.f2256a.h0(i, a2[1], false);
    }
}
