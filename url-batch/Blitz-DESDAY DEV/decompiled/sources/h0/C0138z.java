package h0;

import M.C0015p;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: h0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2611a;

    public /* synthetic */ C0138z(RecyclerView recyclerView) {
        this.f2611a = recyclerView;
    }

    public void a(C0114a c0114a) {
        int i = c0114a.f2447a;
        RecyclerView recyclerView = this.f2611a;
        if (i == 1) {
            recyclerView.f1660l.W(c0114a.f2448b, c0114a.f2449c);
            return;
        }
        if (i == 2) {
            recyclerView.f1660l.Z(c0114a.f2448b, c0114a.f2449c);
        } else if (i == 4) {
            recyclerView.f1660l.a0(c0114a.f2448b, c0114a.f2449c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1660l.Y(c0114a.f2448b, c0114a.f2449c);
        }
    }

    public X b(int i) {
        RecyclerView recyclerView = this.f2611a;
        int o2 = recyclerView.f1648e.o();
        int i2 = 0;
        X x2 = null;
        while (true) {
            if (i2 >= o2) {
                break;
            }
            X I2 = RecyclerView.I(recyclerView.f1648e.n(i2));
            if (I2 != null && !I2.i() && I2.f2432c == i) {
                if (!((ArrayList) recyclerView.f1648e.d).contains(I2.f2430a)) {
                    x2 = I2;
                    break;
                }
                x2 = I2;
            }
            i2++;
        }
        if (x2 == null || ((ArrayList) recyclerView.f1648e.d).contains(x2.f2430a)) {
            return null;
        }
        return x2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2611a;
        int o2 = recyclerView.f1648e.o();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < o2; i6++) {
            View n2 = recyclerView.f1648e.n(i6);
            X I2 = RecyclerView.I(n2);
            if (I2 != null && !I2.p() && (i4 = I2.f2432c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((J) n2.getLayoutParams()).f2393c = true;
            }
        }
        O o3 = recyclerView.f1643b;
        ArrayList arrayList = o3.f2401c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null && (i3 = x2.f2432c) >= i && i3 < i5) {
                x2.a(2);
                o3.e(size);
            }
        }
        recyclerView.f1653g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2611a;
        int o2 = recyclerView.f1648e.o();
        for (int i3 = 0; i3 < o2; i3++) {
            X I2 = RecyclerView.I(recyclerView.f1648e.n(i3));
            if (I2 != null && !I2.p() && I2.f2432c >= i) {
                I2.m(i2, false);
                recyclerView.f1646c0.f2416f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1643b.f2401c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null && x2.f2432c >= i) {
                x2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1651f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2611a;
        int o2 = recyclerView.f1648e.o();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < o2; i11++) {
            X I2 = RecyclerView.I(recyclerView.f1648e.n(i11));
            if (I2 != null && (i9 = I2.f2432c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f1646c0.f2416f = true;
            }
        }
        O o3 = recyclerView.f1643b;
        o3.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = o3.f2401c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            X x2 = (X) arrayList.get(i12);
            if (x2 != null && (i8 = x2.f2432c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    x2.m(i2 - i, false);
                } else {
                    x2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1651f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(X x2, C0015p c0015p, C0015p c0015p2) {
        boolean z2;
        RecyclerView recyclerView = this.f2611a;
        recyclerView.getClass();
        x2.o(false);
        C0122i c0122i = (C0122i) recyclerView.H;
        if (c0015p != null) {
            c0122i.getClass();
            int i = c0015p.f582a;
            int i2 = c0015p2.f582a;
            if (i != i2 || c0015p.f583b != c0015p2.f583b) {
                z2 = c0122i.g(x2, i, c0015p.f583b, i2, c0015p2.f583b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0122i.l(x2);
        x2.f2430a.setAlpha(0.0f);
        c0122i.i.add(x2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(X x2, C0015p c0015p, C0015p c0015p2) {
        boolean z2;
        RecyclerView recyclerView = this.f2611a;
        recyclerView.f1643b.j(x2);
        recyclerView.f(x2);
        x2.o(false);
        C0122i c0122i = (C0122i) recyclerView.H;
        c0122i.getClass();
        int i = c0015p.f582a;
        int i2 = c0015p.f583b;
        View view = x2.f2430a;
        int left = c0015p2 == null ? view.getLeft() : c0015p2.f582a;
        int top = c0015p2 == null ? view.getTop() : c0015p2.f583b;
        if (x2.i() || (i == left && i2 == top)) {
            c0122i.l(x2);
            c0122i.h.add(x2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0122i.g(x2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2611a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
