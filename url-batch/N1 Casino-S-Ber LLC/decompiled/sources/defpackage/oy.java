package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class oy {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ oy(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(w1 w1Var) {
        int i = w1Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.r.X(w1Var.b, w1Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.a0(w1Var.b, w1Var.d);
        } else if (i == 4) {
            recyclerView.r.b0(w1Var.b, w1Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.Z(w1Var.b, w1Var.d);
        }
    }

    public nz b(int i) {
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
        int i2 = 0;
        nz nzVar = null;
        while (true) {
            if (i2 >= q) {
                break;
            }
            nz J = RecyclerView.J(recyclerView.j.p(i2));
            if (J != null && !J.i() && J.c == i) {
                if (!((ArrayList) recyclerView.j.d).contains(J.a)) {
                    nzVar = J;
                    break;
                }
                nzVar = J;
            }
            i2++;
        }
        if (nzVar != null) {
            if (!((ArrayList) recyclerView.j.d).contains(nzVar.a)) {
                return nzVar;
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < q; i6++) {
            View p = recyclerView.j.p(i6);
            nz J = RecyclerView.J(p);
            if (J != null && !J.p() && (i4 = J.c) >= i && i4 < i5) {
                J.a(2);
                if (obj == null) {
                    J.a(1024);
                } else if ((1024 & J.j) == 0) {
                    if (J.k == null) {
                        ArrayList arrayList = new ArrayList();
                        J.k = arrayList;
                        J.l = Collections.unmodifiableList(arrayList);
                    }
                    J.k.add(obj);
                }
                ((yy) p.getLayoutParams()).c = true;
            }
        }
        ez ezVar = recyclerView.g;
        ArrayList arrayList2 = ezVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            nz nzVar = (nz) arrayList2.get(size);
            if (nzVar != null && (i3 = nzVar.c) >= i && i3 < i5) {
                nzVar.a(2);
                ezVar.f(size);
            }
        }
        recyclerView.p0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
        for (int i3 = 0; i3 < q; i3++) {
            nz J = RecyclerView.J(recyclerView.j.p(i3));
            if (J != null && !J.p() && J.c >= i) {
                J.m(i2, false);
                recyclerView.l0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            nz nzVar = (nz) arrayList.get(i4);
            if (nzVar != null && nzVar.c >= i) {
                nzVar.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.o0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
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
        for (int i11 = 0; i11 < q; i11++) {
            nz J = RecyclerView.J(recyclerView.j.p(i11));
            if (J != null && (i9 = J.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    J.m(i2 - i, false);
                } else {
                    J.m(i5, false);
                }
                recyclerView.l0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            nz nzVar = (nz) arrayList.get(i12);
            if (nzVar != null && (i8 = nzVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    nzVar.m(i2 - i, false);
                } else {
                    nzVar.m(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.o0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(nz nzVar, ev evVar, ev evVar2) {
        boolean z;
        nzVar.o(false);
        RecyclerView recyclerView = this.a;
        re reVar = (re) recyclerView.Q;
        if (evVar != null) {
            reVar.getClass();
            int i = evVar.a;
            int i2 = evVar2.a;
            if (i != i2 || evVar.b != evVar2.b) {
                z = reVar.g(nzVar, i, evVar.b, i2, evVar2.b);
                if (z) {
                    return;
                }
                recyclerView.T();
                return;
            }
        }
        reVar.l(nzVar);
        nzVar.a.setAlpha(0.0f);
        reVar.i.add(nzVar);
        z = true;
        if (z) {
        }
    }

    public void g(nz nzVar, ev evVar, ev evVar2) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.g.k(nzVar);
        recyclerView.f(nzVar);
        nzVar.o(false);
        re reVar = (re) recyclerView.Q;
        reVar.getClass();
        int i = evVar.a;
        int i2 = evVar.b;
        View view = nzVar.a;
        int left = evVar2 == null ? view.getLeft() : evVar2.a;
        int top = evVar2 == null ? view.getTop() : evVar2.b;
        if (nzVar.i() || (i == left && i2 == top)) {
            reVar.l(nzVar);
            reVar.h.add(nzVar);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = reVar.g(nzVar, i, i2, left, top);
        }
        if (z) {
            recyclerView.T();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
