package g0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141z extends L {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f2542a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f2543b = new d0(this);

    /* renamed from: c, reason: collision with root package name */
    public C0139x f2544c;
    public C0139x d;

    public static int b(View view, U.g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(J j2, U.g gVar) {
        int v2 = j2.v();
        View view = null;
        if (v2 == 0) {
            return null;
        }
        int l2 = (gVar.l() / 2) + gVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v2; i2++) {
            View u2 = j2.u(i2);
            int abs = Math.abs(((gVar.c(u2) / 2) + gVar.e(u2)) - l2);
            if (abs < i) {
                view = u2;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(J j2, View view) {
        int[] iArr = new int[2];
        if (j2.d()) {
            iArr[0] = b(view, d(j2));
        } else {
            iArr[0] = 0;
        }
        if (j2.e()) {
            iArr[1] = b(view, e(j2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final U.g d(J j2) {
        C0139x c0139x = this.d;
        if (c0139x == null || ((J) c0139x.f853b) != j2) {
            this.d = new C0139x(j2, 0);
        }
        return this.d;
    }

    public final U.g e(J j2) {
        C0139x c0139x = this.f2544c;
        if (c0139x == null || ((J) c0139x.f853b) != j2) {
            this.f2544c = new C0139x(j2, 1);
        }
        return this.f2544c;
    }

    public final void f() {
        J layoutManager;
        RecyclerView recyclerView = this.f2542a;
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
        this.f2542a.g0(i, a2[1], false);
    }
}
