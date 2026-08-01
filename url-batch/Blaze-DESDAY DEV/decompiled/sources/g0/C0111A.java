package g0;

import K.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: g0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2296a;

    public /* synthetic */ C0111A(RecyclerView recyclerView) {
        this.f2296a = recyclerView;
    }

    public void a(C0117a c0117a) {
        int i = c0117a.f2362a;
        RecyclerView recyclerView = this.f2296a;
        if (i == 1) {
            recyclerView.f1609m.Y(c0117a.f2363b, c0117a.f2364c);
            return;
        }
        if (i == 2) {
            recyclerView.f1609m.b0(c0117a.f2363b, c0117a.f2364c);
        } else if (i == 4) {
            recyclerView.f1609m.c0(c0117a.f2363b, c0117a.f2364c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1609m.a0(c0117a.f2363b, c0117a.f2364c);
        }
    }

    public a0 b(int i) {
        RecyclerView recyclerView = this.f2296a;
        int h = recyclerView.f1597f.h();
        int i2 = 0;
        a0 a0Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            a0 L2 = RecyclerView.L(recyclerView.f1597f.g(i2));
            if (L2 != null && !L2.i() && L2.f2368c == i) {
                if (!recyclerView.f1597f.f2388c.contains(L2.f2366a)) {
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
        if (!recyclerView.f1597f.f2388c.contains(a0Var.f2366a)) {
            return a0Var;
        }
        if (RecyclerView.f1565y0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2296a;
        int h = recyclerView.f1597f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g2 = recyclerView.f1597f.g(i6);
            a0 L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.p() && (i4 = L2.f2368c) >= i && i4 < i5) {
                L2.a(2);
                L2.a(1024);
                ((K) g2.getLayoutParams()).f2324c = true;
            }
        }
        P p2 = recyclerView.f1592c;
        ArrayList arrayList = p2.f2333c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var != null && (i3 = a0Var.f2368c) >= i && i3 < i5) {
                a0Var.a(2);
                p2.g(size);
            }
        }
        recyclerView.f1602i0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2296a;
        int h = recyclerView.f1597f.h();
        for (int i3 = 0; i3 < h; i3++) {
            a0 L2 = RecyclerView.L(recyclerView.f1597f.g(i3));
            if (L2 != null && !L2.p() && L2.f2368c >= i) {
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f2368c + i2));
                }
                L2.m(i2, false);
                recyclerView.f1596e0.f2349f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1592c.f2333c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a0 a0Var = (a0) arrayList.get(i4);
            if (a0Var != null && a0Var.f2368c >= i) {
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + a0Var + " now at position " + (a0Var.f2368c + i2));
                }
                a0Var.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1601h0 = true;
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
        RecyclerView recyclerView = this.f2296a;
        int h = recyclerView.f1597f.h();
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
            a0 L2 = RecyclerView.L(recyclerView.f1597f.g(i11));
            if (L2 != null && (i10 = L2.f2368c) >= i4 && i10 <= i3) {
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f2368c == i) {
                    L2.m(i2 - i, false);
                } else {
                    L2.m(i5, false);
                }
                recyclerView.f1596e0.f2349f = true;
            }
        }
        P p2 = recyclerView.f1592c;
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
        ArrayList arrayList = p2.f2333c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            a0 a0Var = (a0) arrayList.get(i12);
            if (a0Var != null && (i9 = a0Var.f2368c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    a0Var.m(i2 - i, z2);
                } else {
                    a0Var.m(i8, z2);
                }
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + a0Var);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1601h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(a0 a0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2296a;
        recyclerView.getClass();
        a0Var.o(false);
        C0126j c0126j = (C0126j) recyclerView.f1574J;
        if (c0019q != null) {
            c0126j.getClass();
            int i = c0019q.f510a;
            int i2 = c0019q2.f510a;
            if (i != i2 || c0019q.f511b != c0019q2.f511b) {
                z2 = c0126j.g(a0Var, i, c0019q.f511b, i2, c0019q2.f511b);
                if (z2) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0126j.l(a0Var);
        a0Var.f2366a.setAlpha(RecyclerView.f1559A0);
        c0126j.i.add(a0Var);
        z2 = true;
        if (z2) {
        }
    }

    public void g(a0 a0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2296a;
        recyclerView.f1592c.l(a0Var);
        recyclerView.h(a0Var);
        a0Var.o(false);
        C0126j c0126j = (C0126j) recyclerView.f1574J;
        c0126j.getClass();
        int i = c0019q.f510a;
        int i2 = c0019q.f511b;
        View view = a0Var.f2366a;
        int left = c0019q2 == null ? view.getLeft() : c0019q2.f510a;
        int top = c0019q2 == null ? view.getTop() : c0019q2.f511b;
        if (a0Var.i() || (i == left && i2 == top)) {
            c0126j.l(a0Var);
            c0126j.h.add(a0Var);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0126j.g(a0Var, i, i2, left, top);
        }
        if (z2) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2296a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
