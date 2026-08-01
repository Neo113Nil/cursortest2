package g0;

import K.C0019q;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: g0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2261a;

    public /* synthetic */ C0111C(RecyclerView recyclerView) {
        this.f2261a = recyclerView;
    }

    public void a(C0115a c0115a) {
        int i = c0115a.f2321a;
        RecyclerView recyclerView = this.f2261a;
        if (i == 1) {
            recyclerView.f1580n.Y(c0115a.f2322b, c0115a.d);
            return;
        }
        if (i == 2) {
            recyclerView.f1580n.b0(c0115a.f2322b, c0115a.d);
        } else if (i == 4) {
            recyclerView.f1580n.c0(c0115a.f2322b, c0115a.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1580n.a0(c0115a.f2322b, c0115a.d);
        }
    }

    public c0 b(int i) {
        RecyclerView recyclerView = this.f2261a;
        int h = recyclerView.f1567f.h();
        int i2 = 0;
        c0 c0Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            c0 L2 = RecyclerView.L(recyclerView.f1567f.g(i2));
            if (L2 != null && !L2.j() && L2.f2341c == i) {
                if (!recyclerView.f1567f.f2357c.contains(L2.f2339a)) {
                    c0Var = L2;
                    break;
                }
                c0Var = L2;
            }
            i2++;
        }
        if (c0Var == null) {
            return null;
        }
        if (!recyclerView.f1567f.f2357c.contains(c0Var.f2339a)) {
            return c0Var;
        }
        if (RecyclerView.f1528A0) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2261a;
        int h = recyclerView.f1567f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g2 = recyclerView.f1567f.g(i6);
            c0 L2 = RecyclerView.L(g2);
            if (L2 != null && !L2.q() && (i4 = L2.f2341c) >= i && i4 < i5) {
                L2.a(2);
                if (obj == null) {
                    L2.a(1024);
                } else if ((1024 & L2.f2345j) == 0) {
                    if (L2.f2346k == null) {
                        ArrayList arrayList = new ArrayList();
                        L2.f2346k = arrayList;
                        L2.f2347l = Collections.unmodifiableList(arrayList);
                    }
                    L2.f2346k.add(obj);
                }
                ((M) g2.getLayoutParams()).f2289c = true;
            }
        }
        S s2 = recyclerView.f1562c;
        ArrayList arrayList2 = s2.f2298c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) arrayList2.get(size);
            if (c0Var != null && (i3 = c0Var.f2341c) >= i && i3 < i5) {
                c0Var.a(2);
                s2.g(size);
            }
        }
        recyclerView.k0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2261a;
        int h = recyclerView.f1567f.h();
        for (int i3 = 0; i3 < h; i3++) {
            c0 L2 = RecyclerView.L(recyclerView.f1567f.g(i3));
            if (L2 != null && !L2.q() && L2.f2341c >= i) {
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + L2 + " now at position " + (L2.f2341c + i2));
                }
                L2.n(i2, false);
                recyclerView.f1570g0.f2314f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1562c.f2298c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c0 c0Var = (c0) arrayList.get(i4);
            if (c0Var != null && c0Var.f2341c >= i) {
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + c0Var + " now at position " + (c0Var.f2341c + i2));
                }
                c0Var.n(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1574j0 = true;
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
        RecyclerView recyclerView = this.f2261a;
        int h = recyclerView.f1567f.h();
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
            c0 L2 = RecyclerView.L(recyclerView.f1567f.g(i11));
            if (L2 != null && (i10 = L2.f2341c) >= i4 && i10 <= i3) {
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + L2);
                }
                if (L2.f2341c == i) {
                    L2.n(i2 - i, false);
                } else {
                    L2.n(i5, false);
                }
                recyclerView.f1570g0.f2314f = true;
            }
        }
        S s2 = recyclerView.f1562c;
        s2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList arrayList = s2.f2298c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            c0 c0Var = (c0) arrayList.get(i12);
            if (c0Var != null && (i9 = c0Var.f2341c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    c0Var.n(i2 - i, z2);
                } else {
                    c0Var.n(i8, z2);
                }
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + c0Var);
                }
            }
            i12++;
            z2 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f1574j0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(c0 c0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2261a;
        recyclerView.getClass();
        c0Var.p(false);
        C0125k c0125k = (C0125k) recyclerView.f1546L;
        if (c0019q != null) {
            c0125k.getClass();
            int i = c0019q.f493a;
            int i2 = c0019q2.f493a;
            if (i != i2 || c0019q.f494b != c0019q2.f494b) {
                z2 = c0125k.g(c0Var, i, c0019q.f494b, i2, c0019q2.f494b);
                if (z2) {
                    return;
                }
                recyclerView.V();
                return;
            }
        }
        c0125k.l(c0Var);
        c0Var.f2339a.setAlpha(RecyclerView.f1530C0);
        c0125k.i.add(c0Var);
        z2 = true;
        if (z2) {
        }
    }

    public void g(c0 c0Var, C0019q c0019q, C0019q c0019q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2261a;
        recyclerView.f1562c.l(c0Var);
        recyclerView.h(c0Var);
        c0Var.p(false);
        C0125k c0125k = (C0125k) recyclerView.f1546L;
        c0125k.getClass();
        int i = c0019q.f493a;
        int i2 = c0019q.f494b;
        View view = c0Var.f2339a;
        int left = c0019q2 == null ? view.getLeft() : c0019q2.f493a;
        int top = c0019q2 == null ? view.getTop() : c0019q2.f494b;
        if (c0Var.j() || (i == left && i2 == top)) {
            c0125k.l(c0Var);
            c0125k.h.add(c0Var);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0125k.g(c0Var, i, i2, left, top);
        }
        if (z2) {
            recyclerView.V();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2261a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.L(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
