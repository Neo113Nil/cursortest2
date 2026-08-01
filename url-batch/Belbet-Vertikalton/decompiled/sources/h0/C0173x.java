package h0;

import M.C0019o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: h0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3135a;

    public /* synthetic */ C0173x(RecyclerView recyclerView) {
        this.f3135a = recyclerView;
    }

    public void a(C0151a c0151a) {
        int i = c0151a.f2983a;
        RecyclerView recyclerView = this.f3135a;
        if (i == 1) {
            recyclerView.f2031l.W(c0151a.f2984b, c0151a.f2985c);
            return;
        }
        if (i == 2) {
            recyclerView.f2031l.Z(c0151a.f2984b, c0151a.f2985c);
        } else if (i == 4) {
            recyclerView.f2031l.a0(c0151a.f2984b, c0151a.f2985c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f2031l.Y(c0151a.f2984b, c0151a.f2985c);
        }
    }

    public V b(int i) {
        RecyclerView recyclerView = this.f3135a;
        int m2 = recyclerView.e.m();
        int i2 = 0;
        V v2 = null;
        while (true) {
            if (i2 >= m2) {
                break;
            }
            V I2 = RecyclerView.I(recyclerView.e.l(i2));
            if (I2 != null && !I2.i() && I2.f2960c == i) {
                if (!((ArrayList) recyclerView.e.f593d).contains(I2.f2958a)) {
                    v2 = I2;
                    break;
                }
                v2 = I2;
            }
            i2++;
        }
        if (v2 == null || ((ArrayList) recyclerView.e.f593d).contains(v2.f2958a)) {
            return null;
        }
        return v2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3135a;
        int m2 = recyclerView.e.m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m2; i6++) {
            View l2 = recyclerView.e.l(i6);
            V I2 = RecyclerView.I(l2);
            if (I2 != null && !I2.p() && (i4 = I2.f2960c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((C0142H) l2.getLayoutParams()).f2918c = true;
            }
        }
        C0147M c0147m = recyclerView.f2014b;
        ArrayList arrayList = c0147m.f2928c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            V v2 = (V) arrayList.get(size);
            if (v2 != null && (i3 = v2.f2960c) >= i && i3 < i5) {
                v2.a(2);
                c0147m.e(size);
            }
        }
        recyclerView.f2024g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f3135a;
        int m2 = recyclerView.e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            V I2 = RecyclerView.I(recyclerView.e.l(i3));
            if (I2 != null && !I2.p() && I2.f2960c >= i) {
                I2.m(i2, false);
                recyclerView.f2017c0.f2944f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2014b.f2928c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            V v2 = (V) arrayList.get(i4);
            if (v2 != null && v2.f2960c >= i) {
                v2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2022f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3135a;
        int m2 = recyclerView.e.m();
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
        for (int i11 = 0; i11 < m2; i11++) {
            V I2 = RecyclerView.I(recyclerView.e.l(i11));
            if (I2 != null && (i9 = I2.f2960c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f2017c0.f2944f = true;
            }
        }
        C0147M c0147m = recyclerView.f2014b;
        c0147m.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = c0147m.f2928c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            V v2 = (V) arrayList.get(i12);
            if (v2 != null && (i8 = v2.f2960c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    v2.m(i2 - i, false);
                } else {
                    v2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2022f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(V v2, C0019o c0019o, C0019o c0019o2) {
        boolean z2;
        RecyclerView recyclerView = this.f3135a;
        recyclerView.getClass();
        v2.o(false);
        C0158h c0158h = (C0158h) recyclerView.H;
        if (c0019o != null) {
            c0158h.getClass();
            int i = c0019o.f781a;
            int i2 = c0019o2.f781a;
            if (i != i2 || c0019o.f782b != c0019o2.f782b) {
                z2 = c0158h.g(v2, i, c0019o.f782b, i2, c0019o2.f782b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0158h.l(v2);
        v2.f2958a.setAlpha(0.0f);
        c0158h.i.add(v2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(V v2, C0019o c0019o, C0019o c0019o2) {
        boolean z2;
        RecyclerView recyclerView = this.f3135a;
        recyclerView.f2014b.j(v2);
        recyclerView.f(v2);
        v2.o(false);
        C0158h c0158h = (C0158h) recyclerView.H;
        c0158h.getClass();
        int i = c0019o.f781a;
        int i2 = c0019o.f782b;
        View view = v2.f2958a;
        int left = c0019o2 == null ? view.getLeft() : c0019o2.f781a;
        int top = c0019o2 == null ? view.getTop() : c0019o2.f782b;
        if (v2.i() || (i == left && i2 == top)) {
            c0158h.l(v2);
            c0158h.f3037h.add(v2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0158h.g(v2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f3135a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
