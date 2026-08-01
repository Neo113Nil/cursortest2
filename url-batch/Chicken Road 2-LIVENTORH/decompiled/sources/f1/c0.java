package f1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f1328a;

    public void a(a aVar) {
        int i = aVar.f1291a;
        RecyclerView recyclerView = this.f1328a;
        if (i == 1) {
            recyclerView.f685r.X(aVar.f1292b, aVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.f685r.a0(aVar.f1292b, aVar.d);
        } else if (i == 4) {
            recyclerView.f685r.b0(aVar.f1292b, aVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f685r.Z(aVar.f1292b, aVar.d);
        }
    }

    public b1 b(int i) {
        RecyclerView recyclerView = this.f1328a;
        int s3 = recyclerView.f669j.s();
        int i4 = 0;
        b1 b1Var = null;
        while (true) {
            if (i4 >= s3) {
                break;
            }
            b1 I = RecyclerView.I(recyclerView.f669j.r(i4));
            if (I != null && !I.h() && I.f1311c == i) {
                if (!((ArrayList) recyclerView.f669j.d).contains(I.f1309a)) {
                    b1Var = I;
                    break;
                }
                b1Var = I;
            }
            i4++;
        }
        if (b1Var != null) {
            if (!((ArrayList) recyclerView.f669j.d).contains(b1Var.f1309a)) {
                return b1Var;
            }
        }
        return null;
    }

    public void c(int i, int i4, Object obj) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f1328a;
        int s3 = recyclerView.f669j.s();
        int i7 = i4 + i;
        for (int i8 = 0; i8 < s3; i8++) {
            View r3 = recyclerView.f669j.r(i8);
            b1 I = RecyclerView.I(r3);
            if (I != null && !I.o() && (i6 = I.f1311c) >= i && i6 < i7) {
                I.a(2);
                if (obj == null) {
                    I.a(1024);
                } else if ((1024 & I.f1316j) == 0) {
                    if (I.f1317k == null) {
                        ArrayList arrayList = new ArrayList();
                        I.f1317k = arrayList;
                        I.f1318l = Collections.unmodifiableList(arrayList);
                    }
                    I.f1317k.add(obj);
                }
                ((n0) r3.getLayoutParams()).f1462c = true;
            }
        }
        s0 s0Var = recyclerView.f665g;
        ArrayList arrayList2 = s0Var.f1492c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b1 b1Var = (b1) arrayList2.get(size);
            if (b1Var != null && (i5 = b1Var.f1311c) >= i && i5 < i7) {
                b1Var.a(2);
                s0Var.f(size);
            }
        }
        recyclerView.f680o0 = true;
    }

    public void d(int i, int i4) {
        RecyclerView recyclerView = this.f1328a;
        int s3 = recyclerView.f669j.s();
        for (int i5 = 0; i5 < s3; i5++) {
            b1 I = RecyclerView.I(recyclerView.f669j.r(i5));
            if (I != null && !I.o() && I.f1311c >= i) {
                I.l(i4, false);
                recyclerView.f672k0.f1540f = true;
            }
        }
        ArrayList arrayList = recyclerView.f665g.f1492c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b1 b1Var = (b1) arrayList.get(i6);
            if (b1Var != null && b1Var.f1311c >= i) {
                b1Var.l(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f678n0 = true;
    }

    public void e(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f1328a;
        int s3 = recyclerView.f669j.s();
        int i12 = -1;
        if (i < i4) {
            i6 = i;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i;
            i6 = i4;
            i7 = 1;
        }
        for (int i13 = 0; i13 < s3; i13++) {
            b1 I = RecyclerView.I(recyclerView.f669j.r(i13));
            if (I != null && (i11 = I.f1311c) >= i6 && i11 <= i5) {
                if (i11 == i) {
                    I.l(i4 - i, false);
                } else {
                    I.l(i7, false);
                }
                recyclerView.f672k0.f1540f = true;
            }
        }
        ArrayList arrayList = recyclerView.f665g.f1492c;
        if (i < i4) {
            i9 = i;
            i8 = i4;
        } else {
            i8 = i;
            i9 = i4;
            i12 = 1;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            b1 b1Var = (b1) arrayList.get(i14);
            if (b1Var != null && (i10 = b1Var.f1311c) >= i9 && i10 <= i8) {
                if (i10 == i) {
                    b1Var.l(i4 - i, false);
                } else {
                    b1Var.l(i12, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f678n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(b1 b1Var, h0 h0Var, h0 h0Var2) {
        boolean z3;
        RecyclerView recyclerView = this.f1328a;
        recyclerView.getClass();
        b1Var.n(false);
        j jVar = (j) recyclerView.P;
        if (h0Var != null) {
            jVar.getClass();
            int i = h0Var.f1364a;
            int i4 = h0Var2.f1364a;
            if (i != i4 || h0Var.f1365b != h0Var2.f1365b) {
                z3 = jVar.g(b1Var, i, h0Var.f1365b, i4, h0Var2.f1365b);
                if (z3) {
                    return;
                }
                recyclerView.S();
                return;
            }
        }
        jVar.l(b1Var);
        b1Var.f1309a.setAlpha(0.0f);
        jVar.i.add(b1Var);
        z3 = true;
        if (z3) {
        }
    }

    public void g(b1 b1Var, h0 h0Var, h0 h0Var2) {
        boolean z3;
        RecyclerView recyclerView = this.f1328a;
        recyclerView.f665g.k(b1Var);
        recyclerView.f(b1Var);
        b1Var.n(false);
        j jVar = (j) recyclerView.P;
        jVar.getClass();
        int i = h0Var.f1364a;
        int i4 = h0Var.f1365b;
        View view = b1Var.f1309a;
        int left = h0Var2 == null ? view.getLeft() : h0Var2.f1364a;
        int top = h0Var2 == null ? view.getTop() : h0Var2.f1365b;
        if (b1Var.h() || (i == left && i4 == top)) {
            jVar.l(b1Var);
            jVar.f1389h.add(b1Var);
            z3 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z3 = jVar.g(b1Var, i, i4, left, top);
        }
        if (z3) {
            recyclerView.S();
        }
    }

    public void h(int i) {
        RecyclerView recyclerView = this.f1328a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public /* synthetic */ c0(RecyclerView recyclerView) {
        this.f1328a = recyclerView;
    }
}
