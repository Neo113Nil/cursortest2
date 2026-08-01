package f0;

import K.C0016q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2295a;

    public /* synthetic */ C0111z(RecyclerView recyclerView) {
        this.f2295a = recyclerView;
    }

    public void a(C0087a c0087a) {
        int i = c0087a.f2135a;
        RecyclerView recyclerView = this.f2295a;
        if (i == 1) {
            recyclerView.f1529l.W(c0087a.f2136b, c0087a.f2137c);
            return;
        }
        if (i == 2) {
            recyclerView.f1529l.Z(c0087a.f2136b, c0087a.f2137c);
        } else if (i == 4) {
            recyclerView.f1529l.a0(c0087a.f2136b, c0087a.f2137c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1529l.Y(c0087a.f2136b, c0087a.f2137c);
        }
    }

    public X b(int i) {
        RecyclerView recyclerView = this.f2295a;
        int m2 = recyclerView.f1518e.m();
        int i2 = 0;
        X x2 = null;
        while (true) {
            if (i2 >= m2) {
                break;
            }
            X I2 = RecyclerView.I(recyclerView.f1518e.l(i2));
            if (I2 != null && !I2.i() && I2.f2120c == i) {
                if (!((ArrayList) recyclerView.f1518e.d).contains(I2.f2118a)) {
                    x2 = I2;
                    break;
                }
                x2 = I2;
            }
            i2++;
        }
        if (x2 == null || ((ArrayList) recyclerView.f1518e.d).contains(x2.f2118a)) {
            return null;
        }
        return x2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2295a;
        int m2 = recyclerView.f1518e.m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m2; i6++) {
            View l2 = recyclerView.f1518e.l(i6);
            X I2 = RecyclerView.I(l2);
            if (I2 != null && !I2.p() && (i4 = I2.f2120c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((J) l2.getLayoutParams()).f2081c = true;
            }
        }
        O o2 = recyclerView.f1513b;
        ArrayList arrayList = o2.f2089c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x2 = (X) arrayList.get(size);
            if (x2 != null && (i3 = x2.f2120c) >= i && i3 < i5) {
                x2.a(2);
                o2.e(size);
            }
        }
        recyclerView.f1523g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2295a;
        int m2 = recyclerView.f1518e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            X I2 = RecyclerView.I(recyclerView.f1518e.l(i3));
            if (I2 != null && !I2.p() && I2.f2120c >= i) {
                I2.m(i2, false);
                recyclerView.f1516c0.f2104f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1513b.f2089c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            X x2 = (X) arrayList.get(i4);
            if (x2 != null && x2.f2120c >= i) {
                x2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1521f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2295a;
        int m2 = recyclerView.f1518e.m();
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
            X I2 = RecyclerView.I(recyclerView.f1518e.l(i11));
            if (I2 != null && (i9 = I2.f2120c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f1516c0.f2104f = true;
            }
        }
        O o2 = recyclerView.f1513b;
        o2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = o2.f2089c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            X x2 = (X) arrayList.get(i12);
            if (x2 != null && (i8 = x2.f2120c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    x2.m(i2 - i, false);
                } else {
                    x2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1521f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2295a;
        recyclerView.getClass();
        x2.o(false);
        C0095i c0095i = (C0095i) recyclerView.f1495H;
        if (c0016q != null) {
            c0095i.getClass();
            int i = c0016q.f424a;
            int i2 = c0016q2.f424a;
            if (i != i2 || c0016q.f425b != c0016q2.f425b) {
                z2 = c0095i.g(x2, i, c0016q.f425b, i2, c0016q2.f425b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0095i.l(x2);
        x2.f2118a.setAlpha(0.0f);
        c0095i.i.add(x2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(X x2, C0016q c0016q, C0016q c0016q2) {
        boolean z2;
        RecyclerView recyclerView = this.f2295a;
        recyclerView.f1513b.j(x2);
        recyclerView.f(x2);
        x2.o(false);
        C0095i c0095i = (C0095i) recyclerView.f1495H;
        c0095i.getClass();
        int i = c0016q.f424a;
        int i2 = c0016q.f425b;
        View view = x2.f2118a;
        int left = c0016q2 == null ? view.getLeft() : c0016q2.f424a;
        int top = c0016q2 == null ? view.getTop() : c0016q2.f425b;
        if (x2.i() || (i == left && i2 == top)) {
            c0095i.l(x2);
            c0095i.h.add(x2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0095i.g(x2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2295a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
