package e0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137y extends K {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2370a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f2371b = new a0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0135w f2372c;

    /* renamed from: d, reason: collision with root package name */
    public C0135w f2373d;

    public static int b(View view, T.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(I i, T.g gVar) {
        int v2 = i.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < v2; i3++) {
            View u2 = i.u(i3);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i2) {
                view = u2;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(I i, View view) {
        int[] iArr = new int[2];
        if (i.d()) {
            iArr[0] = b(view, d(i));
        } else {
            iArr[0] = 0;
        }
        if (i.e()) {
            iArr[1] = b(view, e(i));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final T.g d(I i) {
        C0135w c0135w = this.f2373d;
        if (c0135w == null || ((I) c0135w.f786b) != i) {
            this.f2373d = new C0135w(i, 0);
        }
        return this.f2373d;
    }

    public final T.g e(I i) {
        C0135w c0135w = this.f2372c;
        if (c0135w == null || ((I) c0135w.f786b) != i) {
            this.f2372c = new C0135w(i, 1);
        }
        return this.f2372c;
    }

    public final void f() {
        I layoutManager;
        RecyclerView recyclerView = this.f2370a;
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
        this.f2370a.Z(i, a2[1], false);
    }
}
