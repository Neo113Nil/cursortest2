package f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117x extends J {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2364a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2365b = new Z(this);

    /* renamed from: c, reason: collision with root package name */
    public C0116w f2366c;
    public C0116w d;

    public static int b(View view, T.h hVar) {
        return ((hVar.c(view) / 2) + hVar.e(view)) - ((hVar.l() / 2) + hVar.k());
    }

    public static View c(H h, T.h hVar) {
        int v2 = h.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (hVar.l() / 2) + hVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = h.u(i2);
            int abs = Math.abs(((hVar.c(u2) / 2) + hVar.e(u2)) - l2);
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

    public final T.h d(H h) {
        C0116w c0116w = this.d;
        if (c0116w == null || ((H) c0116w.f813b) != h) {
            this.d = new C0116w(h, 0);
        }
        return this.d;
    }

    public final T.h e(H h) {
        C0116w c0116w = this.f2366c;
        if (c0116w == null || ((H) c0116w.f813b) != h) {
            this.f2366c = new C0116w(h, 1);
        }
        return this.f2366c;
    }

    public final void f() {
        H layoutManager;
        RecyclerView recyclerView = this.f2364a;
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
        this.f2364a.Z(i, a2[1], false);
    }
}
