package b1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f764a;

    public /* synthetic */ d0(RecyclerView recyclerView) {
        this.f764a = recyclerView;
    }

    public void a(a aVar) {
        int i4 = aVar.f726a;
        RecyclerView recyclerView = this.f764a;
        if (i4 == 1) {
            recyclerView.f653r.X(aVar.f727b, aVar.f728d);
            return;
        }
        if (i4 == 2) {
            recyclerView.f653r.a0(aVar.f727b, aVar.f728d);
        } else if (i4 == 4) {
            recyclerView.f653r.b0(aVar.f727b, aVar.f728d);
        } else {
            if (i4 != 8) {
                return;
            }
            recyclerView.f653r.Z(aVar.f727b, aVar.f728d);
        }
    }

    public c1 b(int i4) {
        RecyclerView recyclerView = this.f764a;
        int n3 = recyclerView.f637j.n();
        int i5 = 0;
        c1 c1Var = null;
        while (true) {
            if (i5 >= n3) {
                break;
            }
            c1 I = RecyclerView.I(recyclerView.f637j.m(i5));
            if (I != null && !I.h() && I.c == i4) {
                if (!((ArrayList) recyclerView.f637j.f358d).contains(I.f747a)) {
                    c1Var = I;
                    break;
                }
                c1Var = I;
            }
            i5++;
        }
        if (c1Var != null) {
            if (!((ArrayList) recyclerView.f637j.f358d).contains(c1Var.f747a)) {
                return c1Var;
            }
        }
        return null;
    }

    public void c(int i4, int i5, Object obj) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f764a;
        int n3 = recyclerView.f637j.n();
        int i8 = i5 + i4;
        for (int i9 = 0; i9 < n3; i9++) {
            View m4 = recyclerView.f637j.m(i9);
            c1 I = RecyclerView.I(m4);
            if (I != null && !I.o() && (i7 = I.c) >= i4 && i7 < i8) {
                I.a(2);
                if (obj == null) {
                    I.a(1024);
                } else if ((1024 & I.f753j) == 0) {
                    if (I.f754k == null) {
                        ArrayList arrayList = new ArrayList();
                        I.f754k = arrayList;
                        I.f755l = Collections.unmodifiableList(arrayList);
                    }
                    I.f754k.add(obj);
                }
                ((o0) m4.getLayoutParams()).c = true;
            }
        }
        t0 t0Var = recyclerView.g;
        ArrayList arrayList2 = t0Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i6 = c1Var.c) >= i4 && i6 < i8) {
                c1Var.a(2);
                t0Var.f(size);
            }
        }
        recyclerView.f648o0 = true;
    }

    public void d(int i4, int i5) {
        RecyclerView recyclerView = this.f764a;
        int n3 = recyclerView.f637j.n();
        for (int i6 = 0; i6 < n3; i6++) {
            c1 I = RecyclerView.I(recyclerView.f637j.m(i6));
            if (I != null && !I.o() && I.c >= i4) {
                I.l(i5, false);
                recyclerView.f640k0.f960f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c1 c1Var = (c1) arrayList.get(i7);
            if (c1Var != null && c1Var.c >= i4) {
                c1Var.l(i5, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f646n0 = true;
    }

    public void e(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f764a;
        int n3 = recyclerView.f637j.n();
        int i13 = -1;
        if (i4 < i5) {
            i7 = i4;
            i6 = i5;
            i8 = -1;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i14 = 0; i14 < n3; i14++) {
            c1 I = RecyclerView.I(recyclerView.f637j.m(i14));
            if (I != null && (i12 = I.c) >= i7 && i12 <= i6) {
                if (i12 == i4) {
                    I.l(i5 - i4, false);
                } else {
                    I.l(i8, false);
                }
                recyclerView.f640k0.f960f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        if (i4 < i5) {
            i10 = i4;
            i9 = i5;
        } else {
            i9 = i4;
            i10 = i5;
            i13 = 1;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            c1 c1Var = (c1) arrayList.get(i15);
            if (c1Var != null && (i11 = c1Var.c) >= i10 && i11 <= i9) {
                if (i11 == i4) {
                    c1Var.l(i5 - i4, false);
                } else {
                    c1Var.l(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f646n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(c1 c1Var, i0 i0Var, i0 i0Var2) {
        boolean z3;
        RecyclerView recyclerView = this.f764a;
        recyclerView.getClass();
        c1Var.n(false);
        j jVar = (j) recyclerView.P;
        if (i0Var != null) {
            jVar.getClass();
            int i4 = i0Var.f801a;
            int i5 = i0Var2.f801a;
            if (i4 != i5 || i0Var.f802b != i0Var2.f802b) {
                z3 = jVar.g(c1Var, i4, i0Var.f802b, i5, i0Var2.f802b);
                if (z3) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        jVar.l(c1Var);
        c1Var.f747a.setAlpha(0.0f);
        jVar.f806i.add(c1Var);
        z3 = true;
        if (z3) {
        }
    }

    public void g(c1 c1Var, i0 i0Var, i0 i0Var2) {
        boolean z3;
        RecyclerView recyclerView = this.f764a;
        recyclerView.g.k(c1Var);
        recyclerView.f(c1Var);
        c1Var.n(false);
        j jVar = (j) recyclerView.P;
        jVar.getClass();
        int i4 = i0Var.f801a;
        int i5 = i0Var.f802b;
        View view = c1Var.f747a;
        int left = i0Var2 == null ? view.getLeft() : i0Var2.f801a;
        int top = i0Var2 == null ? view.getTop() : i0Var2.f802b;
        if (c1Var.h() || (i4 == left && i5 == top)) {
            jVar.l(c1Var);
            jVar.h.add(c1Var);
            z3 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z3 = jVar.g(c1Var, i4, i5, left, top);
        }
        if (z3) {
            recyclerView.S();
        }
    }

    public void h(int i4) {
        RecyclerView recyclerView = this.f764a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
