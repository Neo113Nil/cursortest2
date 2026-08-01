package h0;

import L.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2382a;

    public /* synthetic */ C0113A(RecyclerView recyclerView) {
        this.f2382a = recyclerView;
    }

    public void a(C0119a c0119a) {
        int i = c0119a.f2451a;
        RecyclerView recyclerView = this.f2382a;
        if (i == 1) {
            recyclerView.f1672m.Y(c0119a.f2452b, c0119a.f2453c);
            return;
        }
        if (i == 2) {
            recyclerView.f1672m.b0(c0119a.f2452b, c0119a.f2453c);
        } else if (i == 4) {
            recyclerView.f1672m.c0(c0119a.f2452b, c0119a.f2453c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1672m.a0(c0119a.f2452b, c0119a.f2453c);
        }
    }

    public a0 b(int i) {
        RecyclerView recyclerView = this.f2382a;
        int h2 = recyclerView.f1660f.h();
        int i2 = 0;
        a0 a0Var = null;
        while (true) {
            if (i2 >= h2) {
                break;
            }
            a0 L2 = RecyclerView.L(recyclerView.f1660f.g(i2));
            if (L2 != null && !L2.i() && L2.f2457c == i) {
                if (!recyclerView.f1660f.f2478c.contains(L2.f2455a)) {
                    a0Var = L2;
                    break;
                }
                a0Var = L2;
            }
            i2++;
        }
        if (a0Var == null) {
            return null;
        }
        if (!recyclerView.f1660f.f2478c.contains(a0Var.f2455a)) {
            return a0Var;
        }
        if (RecyclerView.f1627y0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2382a;
        int h2 = recyclerView.f1660f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h2; i6++) {
            View g2 = recyclerView.f1660f.g(i6);
            a0 L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.p() && (i4 = L2.f2457c) >= i && i4 < i5) {
                L2.a(2);
                L2.a(1024);
                ((K) g2.getLayoutParams()).f2411c = true;
            }
        }
        P p2 = recyclerView.f1655c;
        ArrayList arrayList = p2.f2420c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var != null && (i3 = a0Var.f2457c) >= i && i3 < i5) {
                a0Var.a(2);
                p2.g(size);
            }
        }
        recyclerView.f1666i0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2382a;
        int h2 = recyclerView.f1660f.h();
        for (int i3 = 0; i3 < h2; i3++) {
            a0 L2 = RecyclerView.L(recyclerView.f1660f.g(i3));
            if (L2 != null && !L2.p() && L2.f2457c >= i) {
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f2457c + i2));
                }
                L2.m(i2, false);
                recyclerView.f1659e0.f2437f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1655c.f2420c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a0 a0Var = (a0) arrayList.get(i4);
            if (a0Var != null && a0Var.f2457c >= i) {
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + a0Var + " now at position " + (a0Var.f2457c + i2));
                }
                a0Var.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1665h0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f2382a;
        int h2 = recyclerView.f1660f.h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z2 = false;
        for (int i11 = 0; i11 < h2; i11++) {
            a0 L2 = RecyclerView.L(recyclerView.f1660f.g(i11));
            if (L2 != null && (i10 = L2.f2457c) >= i4 && i10 <= i3) {
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f2457c == i) {
                    L2.m(i2 - i, false);
                } else {
                    L2.m(i5, false);
                }
                recyclerView.f1659e0.f2437f = true;
            }
        }
        P p2 = recyclerView.f1655c;
        p2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = p2.f2420c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            a0 a0Var = (a0) arrayList.get(i12);
            if (a0Var != null && (i9 = a0Var.f2457c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    a0Var.m(i2 - i, z2);
                } else {
                    a0Var.m(i8, z2);
                }
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + a0Var);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1665h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(a0 a0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2382a;
        recyclerView.getClass();
        a0Var.o(false);
        C0128j c0128j = (C0128j) recyclerView.f1637J;
        if (c0019q != null) {
            c0128j.getClass();
            int i = c0019q.f562a;
            int i2 = c0019q2.f562a;
            if (i != i2 || c0019q.f563b != c0019q2.f563b) {
                z2 = c0128j.g(a0Var, i, c0019q.f563b, i2, c0019q2.f563b);
                if (z2) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0128j.l(a0Var);
        a0Var.f2455a.setAlpha(RecyclerView.A0);
        c0128j.i.add(a0Var);
        z2 = true;
        if (z2) {
        }
    }

    public void g(a0 a0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2382a;
        recyclerView.f1655c.l(a0Var);
        recyclerView.h(a0Var);
        a0Var.o(false);
        C0128j c0128j = (C0128j) recyclerView.f1637J;
        c0128j.getClass();
        int i = c0019q.f562a;
        int i2 = c0019q.f563b;
        View view = a0Var.f2455a;
        int left = c0019q2 == null ? view.getLeft() : c0019q2.f562a;
        int top = c0019q2 == null ? view.getTop() : c0019q2.f563b;
        if (a0Var.i() || (i == left && i2 == top)) {
            c0128j.l(a0Var);
            c0128j.f2531h.add(a0Var);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0128j.g(a0Var, i, i2, left, top);
        }
        if (z2) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2382a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
