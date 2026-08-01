package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class w70 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ w70(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(e2 e2Var) {
        int i = e2Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.r.X(e2Var.b, e2Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.a0(e2Var.b, e2Var.d);
        } else if (i == 4) {
            recyclerView.r.b0(e2Var.b, e2Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.Z(e2Var.b, e2Var.d);
        }
    }

    public x80 b(int i) {
        RecyclerView recyclerView = this.a;
        int p = recyclerView.j.p();
        int i2 = 0;
        x80 x80Var = null;
        while (true) {
            if (i2 >= p) {
                break;
            }
            x80 J = RecyclerView.J(recyclerView.j.o(i2));
            if (J != null && !J.i() && J.c == i) {
                if (!((ArrayList) recyclerView.j.d).contains(J.a)) {
                    x80Var = J;
                    break;
                }
                x80Var = J;
            }
            i2++;
        }
        if (x80Var != null) {
            if (!((ArrayList) recyclerView.j.d).contains(x80Var.a)) {
                return x80Var;
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int p = recyclerView.j.p();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < p; i6++) {
            View o = recyclerView.j.o(i6);
            x80 J = RecyclerView.J(o);
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
                ((i80) o.getLayoutParams()).c = true;
            }
        }
        o80 o80Var = recyclerView.g;
        ArrayList arrayList2 = o80Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            x80 x80Var = (x80) arrayList2.get(size);
            if (x80Var != null && (i3 = x80Var.c) >= i && i3 < i5) {
                x80Var.a(2);
                o80Var.f(size);
            }
        }
        recyclerView.p0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int p = recyclerView.j.p();
        for (int i3 = 0; i3 < p; i3++) {
            x80 J = RecyclerView.J(recyclerView.j.o(i3));
            if (J != null && !J.p() && J.c >= i) {
                J.m(i2, false);
                recyclerView.l0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            x80 x80Var = (x80) arrayList.get(i4);
            if (x80Var != null && x80Var.c >= i) {
                x80Var.m(i2, false);
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
        int p = recyclerView.j.p();
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
        for (int i11 = 0; i11 < p; i11++) {
            x80 J = RecyclerView.J(recyclerView.j.o(i11));
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
            x80 x80Var = (x80) arrayList.get(i12);
            if (x80Var != null && (i8 = x80Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    x80Var.m(i2 - i, false);
                } else {
                    x80Var.m(i10, false);
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
    public void f(x80 x80Var, t30 t30Var, t30 t30Var2) {
        boolean z;
        x80Var.o(false);
        RecyclerView recyclerView = this.a;
        pi piVar = (pi) recyclerView.Q;
        if (t30Var != null) {
            piVar.getClass();
            int i = t30Var.a;
            int i2 = t30Var2.a;
            if (i != i2 || t30Var.b != t30Var2.b) {
                z = piVar.g(x80Var, i, t30Var.b, i2, t30Var2.b);
                if (z) {
                    return;
                }
                recyclerView.T();
                return;
            }
        }
        piVar.l(x80Var);
        x80Var.a.setAlpha(0.0f);
        piVar.i.add(x80Var);
        z = true;
        if (z) {
        }
    }

    public void g(x80 x80Var, t30 t30Var, t30 t30Var2) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.g.k(x80Var);
        recyclerView.f(x80Var);
        x80Var.o(false);
        pi piVar = (pi) recyclerView.Q;
        piVar.getClass();
        int i = t30Var.a;
        int i2 = t30Var.b;
        View view = x80Var.a;
        int left = t30Var2 == null ? view.getLeft() : t30Var2.a;
        int top = t30Var2 == null ? view.getTop() : t30Var2.b;
        if (x80Var.i() || (i == left && i2 == top)) {
            piVar.l(x80Var);
            piVar.h.add(x80Var);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = piVar.g(x80Var, i, i2, left, top);
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
