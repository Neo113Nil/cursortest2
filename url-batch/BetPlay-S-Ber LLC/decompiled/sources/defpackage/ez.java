package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ez {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ ez(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(k2 k2Var) {
        int i = k2Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.r.X(k2Var.b, k2Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.r.a0(k2Var.b, k2Var.d);
        } else if (i == 4) {
            recyclerView.r.b0(k2Var.b, k2Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.r.Z(k2Var.b, k2Var.d);
        }
    }

    public c00 b(int i) {
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
        int i2 = 0;
        c00 c00Var = null;
        while (true) {
            if (i2 >= q) {
                break;
            }
            c00 I = RecyclerView.I(recyclerView.j.p(i2));
            if (I != null && !I.h() && I.c == i) {
                if (!((ArrayList) recyclerView.j.d).contains(I.a)) {
                    c00Var = I;
                    break;
                }
                c00Var = I;
            }
            i2++;
        }
        if (c00Var != null) {
            if (!((ArrayList) recyclerView.j.d).contains(c00Var.a)) {
                return c00Var;
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
            c00 I = RecyclerView.I(p);
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
                ((oz) p.getLayoutParams()).c = true;
            }
        }
        tz tzVar = recyclerView.g;
        ArrayList arrayList2 = tzVar.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c00 c00Var = (c00) arrayList2.get(size);
            if (c00Var != null && (i3 = c00Var.c) >= i && i3 < i5) {
                c00Var.a(2);
                tzVar.f(size);
            }
        }
        recyclerView.o0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int q = recyclerView.j.q();
        for (int i3 = 0; i3 < q; i3++) {
            c00 I = RecyclerView.I(recyclerView.j.p(i3));
            if (I != null && !I.o() && I.c >= i) {
                I.l(i2, false);
                recyclerView.k0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.g.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c00 c00Var = (c00) arrayList.get(i4);
            if (c00Var != null && c00Var.c >= i) {
                c00Var.l(i2, false);
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
            c00 I = RecyclerView.I(recyclerView.j.p(i11));
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
            c00 c00Var = (c00) arrayList.get(i12);
            if (c00Var != null && (i8 = c00Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    c00Var.l(i2 - i, false);
                } else {
                    c00Var.l(i10, false);
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
    public void f(c00 c00Var, uv uvVar, uv uvVar2) {
        boolean z;
        c00Var.n(false);
        RecyclerView recyclerView = this.a;
        se seVar = (se) recyclerView.P;
        if (uvVar != null) {
            seVar.getClass();
            int i = uvVar.a;
            int i2 = uvVar2.a;
            if (i != i2 || uvVar.b != uvVar2.b) {
                z = seVar.g(c00Var, i, uvVar.b, i2, uvVar2.b);
                if (z) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        seVar.l(c00Var);
        c00Var.a.setAlpha(0.0f);
        seVar.i.add(c00Var);
        z = true;
        if (z) {
        }
    }

    public void g(c00 c00Var, uv uvVar, uv uvVar2) {
        boolean z;
        RecyclerView recyclerView = this.a;
        recyclerView.g.k(c00Var);
        recyclerView.f(c00Var);
        c00Var.n(false);
        se seVar = (se) recyclerView.P;
        seVar.getClass();
        int i = uvVar.a;
        int i2 = uvVar.b;
        View view = c00Var.a;
        int left = uvVar2 == null ? view.getLeft() : uvVar2.a;
        int top = uvVar2 == null ? view.getTop() : uvVar2.b;
        if (c00Var.h() || (i == left && i2 == top)) {
            seVar.l(c00Var);
            seVar.h.add(c00Var);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = seVar.g(c00Var, i, i2, left, top);
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
