package h0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: h0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172w extends AbstractC0143I {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3132b = new Y(this);

    /* renamed from: c, reason: collision with root package name */
    public C0171v f3133c;

    /* renamed from: d, reason: collision with root package name */
    public C0171v f3134d;

    public static int b(View view, V.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(AbstractC0141G abstractC0141G, V.g gVar) {
        int v2 = abstractC0141G.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = abstractC0141G.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC0141G abstractC0141G, View view) {
        int[] iArr = new int[2];
        if (abstractC0141G.d()) {
            iArr[0] = b(view, d(abstractC0141G));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0141G.e()) {
            iArr[1] = b(view, e(abstractC0141G));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final V.g d(AbstractC0141G abstractC0141G) {
        C0171v c0171v = this.f3134d;
        if (c0171v == null || ((AbstractC0141G) c0171v.f1272b) != abstractC0141G) {
            this.f3134d = new C0171v(abstractC0141G, 0);
        }
        return this.f3134d;
    }

    public final V.g e(AbstractC0141G abstractC0141G) {
        C0171v c0171v = this.f3133c;
        if (c0171v == null || ((AbstractC0141G) c0171v.f1272b) != abstractC0141G) {
            this.f3133c = new C0171v(abstractC0141G, 1);
        }
        return this.f3133c;
    }

    public final void f() {
        AbstractC0141G layoutManager;
        RecyclerView recyclerView = this.f3131a;
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
        this.f3131a.Z(i, a2[1], false);
    }
}
