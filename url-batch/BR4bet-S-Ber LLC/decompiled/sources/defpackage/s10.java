package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class s10 {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ s10(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(x1 x1Var) {
        int i = x1Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.r.X(x1Var.b, x1Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.a0(x1Var.b, x1Var.d);
        } else if (i == 4) {
            recyclerView.r.b0(x1Var.b, x1Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.Z(x1Var.b, x1Var.d);
        }
    }

    public q20 b(int i) {
        RecyclerView recyclerView = this.a;
        int u = recyclerView.j.u();
        int i2 = 0;
        q20 q20Var = null;
        while (true) {
            if (i2 >= u) {
                break;
            }
            q20 I = RecyclerView.I(recyclerView.j.t(i2));
            if (I != null && !I.h() && I.c == i) {
                if (!((ArrayList) recyclerView.j.i).contains(I.a)) {
                    q20Var = I;
                    break;
                }
                q20Var = I;
            }
            i2++;
        }
        if (q20Var != null) {
            if (!((ArrayList) recyclerView.j.i).contains(q20Var.a)) {
                return q20Var;
            }
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int u = recyclerView.j.u();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < u; i6++) {
            View t = recyclerView.j.t(i6);
            q20 I = RecyclerView.I(t);
            if (I != null && !I.o() && (i4 = I.c) >= i && i4 < i5) {
                I.a(2);
                if (obj == null) {
                    I.a(1024);
                } else if ((1024 & I.j) == 0) {
                    if (I.k == null) {
                        ArrayList arrayList = new ArrayList();
                        I.k = arrayList;
                        I.l = Collections.unmodifiableList(arrayList);
                    }
                    I.k.add(obj);
                }
                ((c20) t.getLayoutParams()).c = true;
            }
        }
        h20 h20Var = recyclerView.g;
        ArrayList arrayList2 = h20Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            q20 q20Var = (q20) arrayList2.get(size);
            if (q20Var != null && (i3 = q20Var.c) >= i && i3 < i5) {
                q20Var.a(2);
                h20Var.f(size);
            }
        }
        recyclerView.o0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int u = recyclerView.j.u();
        for (int i3 = 0; i3 < u; i3++) {
            q20 I = RecyclerView.I(recyclerView.j.t(i3));
            if (I != null && !I.o() && I.c >= i) {
                I.l(i2, false);
                recyclerView.k0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q20 q20Var = (q20) arrayList.get(i4);
            if (q20Var != null && q20Var.c >= i) {
                q20Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.n0 = true;
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
        int u = recyclerView.j.u();
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
        for (int i11 = 0; i11 < u; i11++) {
            q20 I = RecyclerView.I(recyclerView.j.t(i11));
            if (I != null && (i9 = I.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    I.l(i2 - i, false);
                } else {
                    I.l(i5, false);
                }
                recyclerView.k0.f = true;
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
            q20 q20Var = (q20) arrayList.get(i12);
            if (q20Var != null && (i8 = q20Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    q20Var.l(i2 - i, false);
                } else {
                    q20Var.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(q20 q20Var, hy hyVar, hy hyVar2) {
        boolean z;
        q20Var.n(false);
        RecyclerView recyclerView = this.a;
        lg lgVar = (lg) recyclerView.P;
        if (hyVar != null) {
            lgVar.getClass();
            int i = hyVar.a;
            int i2 = hyVar2.a;
            if (i != i2 || hyVar.b != hyVar2.b) {
                z = lgVar.g(q20Var, i, hyVar.b, i2, hyVar2.b);
                if (z) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        lgVar.l(q20Var);
        q20Var.a.setAlpha(0.0f);
        lgVar.i.add(q20Var);
        z = true;
        if (z) {
        }
    }

    public void g(q20 q20Var, hy hyVar, hy hyVar2) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.g.k(q20Var);
        recyclerView.f(q20Var);
        q20Var.n(false);
        lg lgVar = (lg) recyclerView.P;
        lgVar.getClass();
        int i = hyVar.a;
        int i2 = hyVar.b;
        View view = q20Var.a;
        int left = hyVar2 == null ? view.getLeft() : hyVar2.a;
        int top = hyVar2 == null ? view.getTop() : hyVar2.b;
        if (q20Var.h() || (i == left && i2 == top)) {
            lgVar.l(q20Var);
            lgVar.h.add(q20Var);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = lgVar.g(q20Var, i, i2, left, top);
        }
        if (z) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
