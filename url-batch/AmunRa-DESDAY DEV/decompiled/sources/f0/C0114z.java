package f0;

import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2252a;

    public /* synthetic */ C0114z(RecyclerView recyclerView) {
        this.f2252a = recyclerView;
    }

    public void a(C0090a c0090a) {
        int i = c0090a.f2092a;
        RecyclerView recyclerView = this.f2252a;
        if (i == 1) {
            recyclerView.f1487l.W(c0090a.f2093b, c0090a.f2094c);
            return;
        }
        if (i == 2) {
            recyclerView.f1487l.Z(c0090a.f2093b, c0090a.f2094c);
        } else if (i == 4) {
            recyclerView.f1487l.a0(c0090a.f2093b, c0090a.f2094c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1487l.Y(c0090a.f2093b, c0090a.f2094c);
        }
    }

    public X b(int i) {
        RecyclerView recyclerView = this.f2252a;
        int m2 = recyclerView.f1476e.m();
        int i2 = 0;
        X x2 = null;
        while (true) {
            if (i2 >= m2) {
                break;
            }
            X I2 = RecyclerView.I(recyclerView.f1476e.l(i2));
            if (I2 != null && !I2.i() && I2.f2077c == i) {
                if (!((ArrayList) recyclerView.f1476e.d).contains(I2.f2075a)) {
                    x2 = I2;
                    break;
                }
                x2 = I2;
            }
            i2++;
        }
        if (x2 == null || ((ArrayList) recyclerView.f1476e.d).contains(x2.f2075a)) {
            return null;
        }
        return x2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2252a;
        int m2 = recyclerView.f1476e.m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m2; i6++) {
            View l2 = recyclerView.f1476e.l(i6);
            X I2 = RecyclerView.I(l2);
            if (I2 != null && !I2.p() && (i4 = I2.f2077c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((J) l2.getLayoutParams()).f2038c = true;
            }
        }
        O o2 = recyclerView.f1471b;
        ArrayList arrayList = o2.f2046c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null && (i3 = x2.f2077c) >= i && i3 < i5) {
                x2.a(2);
                o2.e(size);
            }
        }
        recyclerView.f1481g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2252a;
        int m2 = recyclerView.f1476e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = RecyclerView.I(recyclerView.f1476e.l(i3));
            if (I2 != null && !I2.p() && I2.f2077c >= i) {
                I2.m(i2, false);
                recyclerView.f1474c0.f2061f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1471b.f2046c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null && x2.f2077c >= i) {
                x2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1479f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2252a;
        int m2 = recyclerView.f1476e.m();
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
            X I2 = RecyclerView.I(recyclerView.f1476e.l(i11));
            if (I2 != null && (i9 = I2.f2077c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f1474c0.f2061f = true;
            }
        }
        O o2 = recyclerView.f1471b;
        o2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = o2.f2046c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            X x2 = (X) arrayList.get(i12);
            if (x2 != null && (i8 = x2.f2077c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    x2.m(i2 - i, false);
                } else {
                    x2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1479f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2252a;
        recyclerView.getClass();
        x2.o(false);
        C0098i c0098i = (C0098i) recyclerView.f1453H;
        if (c0016q != null) {
            c0098i.getClass();
            int i = c0016q.f435a;
            int i2 = c0016q2.f435a;
            if (i != i2 || c0016q.f436b != c0016q2.f436b) {
                z2 = c0098i.g(x2, i, c0016q.f436b, i2, c0016q2.f436b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0098i.l(x2);
        x2.f2075a.setAlpha(0.0f);
        c0098i.i.add(x2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2252a;
        recyclerView.f1471b.j(x2);
        recyclerView.f(x2);
        x2.o(false);
        C0098i c0098i = (C0098i) recyclerView.f1453H;
        c0098i.getClass();
        int i = c0016q.f435a;
        int i2 = c0016q.f436b;
        View view = x2.f2075a;
        int left = c0016q2 == null ? view.getLeft() : c0016q2.f435a;
        int top = c0016q2 == null ? view.getTop() : c0016q2.f436b;
        if (x2.i() || (i == left && i2 == top)) {
            c0098i.l(x2);
            c0098i.h.add(x2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0098i.g(x2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2252a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
