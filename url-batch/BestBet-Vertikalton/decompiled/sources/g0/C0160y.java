package g0;

import K.C0019o;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2954a;

    public /* synthetic */ C0160y(RecyclerView recyclerView) {
        this.f2954a = recyclerView;
    }

    public void a(C0137a c0137a) {
        int i = c0137a.f2794a;
        RecyclerView recyclerView = this.f2954a;
        if (i == 1) {
            recyclerView.f1989m.Y(c0137a.f2795b, c0137a.f2796c);
            return;
        }
        if (i == 2) {
            recyclerView.f1989m.b0(c0137a.f2795b, c0137a.f2796c);
        } else if (i == 4) {
            recyclerView.f1989m.c0(c0137a.f2795b, c0137a.f2796c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1989m.a0(c0137a.f2795b, c0137a.f2796c);
        }
    }

    public Y b(int i) {
        RecyclerView recyclerView = this.f2954a;
        int h = recyclerView.f1977f.h();
        int i2 = 0;
        Y y2 = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            Y L2 = RecyclerView.L(recyclerView.f1977f.g(i2));
            if (L2 != null && !L2.i() && L2.f2779c == i) {
                if (!recyclerView.f1977f.f2800c.contains(L2.f2777a)) {
                    y2 = L2;
                    break;
                }
                y2 = L2;
            }
            i2++;
        }
        if (y2 == null) {
            return null;
        }
        if (!recyclerView.f1977f.f2800c.contains(y2.f2777a)) {
            return y2;
        }
        if (RecyclerView.f1944y0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2954a;
        int h = recyclerView.f1977f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g2 = recyclerView.f1977f.g(i6);
            Y L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.p() && (i4 = L2.f2779c) >= i && i4 < i5) {
                L2.a(2);
                L2.a(1024);
                ((I) g2.getLayoutParams()).f2738c = true;
            }
        }
        N n2 = recyclerView.f1972c;
        ArrayList arrayList = n2.f2747c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y y2 = (Y) arrayList.get(size);
            if (y2 != null && (i3 = y2.f2779c) >= i && i3 < i5) {
                y2.a(2);
                n2.g(size);
            }
        }
        recyclerView.f1982i0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2954a;
        int h = recyclerView.f1977f.h();
        for (int i3 = 0; i3 < h; i3++) {
            Y L2 = RecyclerView.L(recyclerView.f1977f.g(i3));
            if (L2 != null && !L2.p() && L2.f2779c >= i) {
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f2779c + i2));
                }
                L2.m(i2, false);
                recyclerView.f1976e0.f2763f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1972c.f2747c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Y y2 = (Y) arrayList.get(i4);
            if (y2 != null && y2.f2779c >= i) {
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + y2 + " now at position " + (y2.f2779c + i2));
                }
                y2.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1981h0 = true;
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
        RecyclerView recyclerView = this.f2954a;
        int h = recyclerView.f1977f.h();
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
        for (int i11 = 0; i11 < h; i11++) {
            Y L2 = RecyclerView.L(recyclerView.f1977f.g(i11));
            if (L2 != null && (i10 = L2.f2779c) >= i4 && i10 <= i3) {
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f2779c == i) {
                    L2.m(i2 - i, false);
                } else {
                    L2.m(i5, false);
                }
                recyclerView.f1976e0.f2763f = true;
            }
        }
        N n2 = recyclerView.f1972c;
        n2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = n2.f2747c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Y y2 = (Y) arrayList.get(i12);
            if (y2 != null && (i9 = y2.f2779c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    y2.m(i2 - i, z2);
                } else {
                    y2.m(i8, z2);
                }
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + y2);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1981h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(Y y2, C0019o c0019o, C0019o c0019o2) {
        boolean z2;
        RecyclerView recyclerView = this.f2954a;
        recyclerView.getClass();
        y2.o(false);
        C0145i c0145i = (C0145i) recyclerView.f1954J;
        if (c0019o != null) {
            c0145i.getClass();
            int i = c0019o.f641a;
            int i2 = c0019o2.f641a;
            if (i != i2 || c0019o.f642b != c0019o2.f642b) {
                z2 = c0145i.g(y2, i, c0019o.f642b, i2, c0019o2.f642b);
                if (z2) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0145i.l(y2);
        y2.f2777a.setAlpha(RecyclerView.f1937A0);
        c0145i.i.add(y2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(Y y2, C0019o c0019o, C0019o c0019o2) {
        boolean z2;
        RecyclerView recyclerView = this.f2954a;
        recyclerView.f1972c.l(y2);
        recyclerView.h(y2);
        y2.o(false);
        C0145i c0145i = (C0145i) recyclerView.f1954J;
        c0145i.getClass();
        int i = c0019o.f641a;
        int i2 = c0019o.f642b;
        View view = y2.f2777a;
        int left = c0019o2 == null ? view.getLeft() : c0019o2.f641a;
        int top = c0019o2 == null ? view.getTop() : c0019o2.f642b;
        if (y2.i() || (i == left && i2 == top)) {
            c0145i.l(y2);
            c0145i.h.add(y2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0145i.g(y2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2954a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
