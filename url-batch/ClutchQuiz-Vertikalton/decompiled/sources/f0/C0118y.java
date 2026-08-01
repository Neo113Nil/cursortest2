package f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: f0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2367a;

    public /* synthetic */ C0118y(RecyclerView recyclerView) {
        this.f2367a = recyclerView;
    }

    public void a(C0095a c0095a) {
        int i = c0095a.f2212a;
        RecyclerView recyclerView = this.f2367a;
        if (i == 1) {
            recyclerView.f1600l.W(c0095a.f2213b, c0095a.f2214c);
            return;
        }
        if (i == 2) {
            recyclerView.f1600l.Z(c0095a.f2213b, c0095a.f2214c);
        } else if (i == 4) {
            recyclerView.f1600l.a0(c0095a.f2213b, c0095a.f2214c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f1600l.Y(c0095a.f2213b, c0095a.f2214c);
        }
    }

    public W b(int i) {
        RecyclerView recyclerView = this.f2367a;
        int m2 = recyclerView.f1588e.m();
        int i2 = 0;
        W w2 = null;
        while (true) {
            if (i2 >= m2) {
                break;
            }
            W I2 = RecyclerView.I(recyclerView.f1588e.l(i2));
            if (I2 != null && !I2.i() && I2.f2195c == i) {
                if (!((ArrayList) recyclerView.f1588e.d).contains(I2.f2193a)) {
                    w2 = I2;
                    break;
                }
                w2 = I2;
            }
            i2++;
        }
        if (w2 == null || ((ArrayList) recyclerView.f1588e.d).contains(w2.f2193a)) {
            return null;
        }
        return w2;
    }

    public void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2367a;
        int m2 = recyclerView.f1588e.m();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m2; i6++) {
            View l2 = recyclerView.f1588e.l(i6);
            W I2 = RecyclerView.I(l2);
            if (I2 != null && !I2.p() && (i4 = I2.f2195c) >= i && i4 < i5) {
                I2.a(2);
                I2.a(1024);
                ((I) l2.getLayoutParams()).f2156c = true;
            }
        }
        N n2 = recyclerView.f1583b;
        ArrayList arrayList = n2.f2164c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w2 = (W) arrayList.get(size);
            if (w2 != null && (i3 = w2.f2195c) >= i && i3 < i5) {
                w2.a(2);
                n2.e(size);
            }
        }
        recyclerView.f1593g0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f2367a;
        int m2 = recyclerView.f1588e.m();
        for (int i3 = 0; i3 < m2; i3++) {
            W I2 = RecyclerView.I(recyclerView.f1588e.l(i3));
            if (I2 != null && !I2.p() && I2.f2195c >= i) {
                I2.m(i2, false);
                recyclerView.f1586c0.f2179f = true;
            }
        }
        ArrayList arrayList = recyclerView.f1583b.f2164c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            W w2 = (W) arrayList.get(i4);
            if (w2 != null && w2.f2195c >= i) {
                w2.m(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1591f0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f2367a;
        int m2 = recyclerView.f1588e.m();
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
            W I2 = RecyclerView.I(recyclerView.f1588e.l(i11));
            if (I2 != null && (i9 = I2.f2195c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I2.m(i2 - i, false);
                } else {
                    I2.m(i5, false);
                }
                recyclerView.f1586c0.f2179f = true;
            }
        }
        N n2 = recyclerView.f1583b;
        n2.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList arrayList = n2.f2164c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            W w2 = (W) arrayList.get(i12);
            if (w2 != null && (i8 = w2.f2195c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    w2.m(i2 - i, false);
                } else {
                    w2.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1591f0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(W w2, K.r rVar, K.r rVar2) {
        boolean z2;
        RecyclerView recyclerView = this.f2367a;
        recyclerView.getClass();
        w2.o(false);
        C0103i c0103i = (C0103i) recyclerView.f1565H;
        if (rVar != null) {
            c0103i.getClass();
            int i = rVar.f439a;
            int i2 = rVar2.f439a;
            if (i != i2 || rVar.f440b != rVar2.f440b) {
                z2 = c0103i.g(w2, i, rVar.f440b, i2, rVar2.f440b);
                if (z2) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        c0103i.l(w2);
        w2.f2193a.setAlpha(0.0f);
        c0103i.i.add(w2);
        z2 = true;
        if (z2) {
        }
    }

    public void g(W w2, K.r rVar, K.r rVar2) {
        boolean z2;
        RecyclerView recyclerView = this.f2367a;
        recyclerView.f1583b.j(w2);
        recyclerView.f(w2);
        w2.o(false);
        C0103i c0103i = (C0103i) recyclerView.f1565H;
        c0103i.getClass();
        int i = rVar.f439a;
        int i2 = rVar.f440b;
        View view = w2.f2193a;
        int left = rVar2 == null ? view.getLeft() : rVar2.f439a;
        int top = rVar2 == null ? view.getTop() : rVar2.f440b;
        if (w2.i() || (i == left && i2 == top)) {
            c0103i.l(w2);
            c0103i.h.add(w2);
            z2 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z2 = c0103i.g(w2, i, i2, left, top);
        }
        if (z2) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f2367a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
