package g0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159x extends J {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2951a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f2952b = new b0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0158w f2953c;
    public C0158w d;

    public static int b(View view, U.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(H h, U.g gVar) {
        int v2 = h.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = h.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(H h, View view) {
        int[] iArr = new int[2];
        if (h.d()) {
            iArr[0] = b(view, d(h));
        } else {
            iArr[0] = 0;
        }
        if (h.e()) {
            iArr[1] = b(view, e(h));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final U.g d(H h) {
        C0158w c0158w = this.d;
        if (c0158w == null || ((H) c0158w.f1086b) != h) {
            this.d = new C0158w(h, 0);
        }
        return this.d;
    }

    public final U.g e(H h) {
        C0158w c0158w = this.f2953c;
        if (c0158w == null || ((H) c0158w.f1086b) != h) {
            this.f2953c = new C0158w(h, 1);
        }
        return this.f2953c;
    }

    public final void f() {
        H layoutManager;
        RecyclerView recyclerView = this.f2951a;
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
        this.f2951a.g0(i, a2[1], false);
    }
}
