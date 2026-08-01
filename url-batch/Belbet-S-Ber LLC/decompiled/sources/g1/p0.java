package g1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p0 implements n0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1752a;

    public /* synthetic */ p0(RecyclerView recyclerView) {
        this.f1752a = recyclerView;
    }

    public void a(a aVar) {
        int i = aVar.f1590a;
        RecyclerView recyclerView = this.f1752a;
        if (i == 1) {
            recyclerView.f788s.Y(aVar.f1591b, aVar.d);
            return;
        }
        if (i == 2) {
            recyclerView.f788s.b0(aVar.f1591b, aVar.d);
        } else if (i == 4) {
            recyclerView.f788s.c0(aVar.f1591b, aVar.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f788s.a0(aVar.f1591b, aVar.d);
        }
    }

    @Override // n0.h
    public boolean b(float f5) {
        int i;
        int i4;
        RecyclerView recyclerView = this.f1752a;
        if (recyclerView.f788s.e()) {
            i4 = (int) f5;
            i = 0;
        } else if (recyclerView.f788s.d()) {
            i = (int) f5;
            i4 = 0;
        } else {
            i = 0;
            i4 = 0;
        }
        if (i == 0 && i4 == 0) {
            return false;
        }
        recyclerView.o0();
        return recyclerView.I(i, i4, 0, Integer.MAX_VALUE);
    }

    @Override // n0.h
    public float c() {
        float f5;
        RecyclerView recyclerView = this.f1752a;
        if (recyclerView.f788s.e()) {
            f5 = recyclerView.f768g0;
        } else {
            if (!recyclerView.f788s.d()) {
                return 0.0f;
            }
            f5 = recyclerView.f766f0;
        }
        return -f5;
    }

    @Override // n0.h
    public void d() {
        this.f1752a.o0();
    }

    public q1 e(int i) {
        RecyclerView recyclerView = this.f1752a;
        int h = recyclerView.f772k.h();
        int i4 = 0;
        q1 q1Var = null;
        while (true) {
            if (i4 >= h) {
                break;
            }
            q1 M = RecyclerView.M(recyclerView.f772k.g(i4));
            if (M != null && !M.h() && M.f1770c == i) {
                if (!recyclerView.f772k.f1673c.contains(M.f1768a)) {
                    q1Var = M;
                    break;
                }
                q1Var = M;
            }
            i4++;
        }
        if (q1Var != null) {
            if (!recyclerView.f772k.f1673c.contains(q1Var.f1768a)) {
                return q1Var;
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public void f(int i, int i4, Object obj) {
        int i5;
        int i6;
        RecyclerView recyclerView = this.f1752a;
        int h = recyclerView.f772k.h();
        int i7 = i4 + i;
        for (int i8 = 0; i8 < h; i8++) {
            View g3 = recyclerView.f772k.g(i8);
            q1 M = RecyclerView.M(g3);
            if (M != null && !M.o() && (i6 = M.f1770c) >= i && i6 < i7) {
                M.a(2);
                if (obj == null) {
                    M.a(1024);
                } else if ((1024 & M.f1774j) == 0) {
                    if (M.f1775k == null) {
                        ArrayList arrayList = new ArrayList();
                        M.f1775k = arrayList;
                        M.f1776l = Collections.unmodifiableList(arrayList);
                    }
                    M.f1775k.add(obj);
                }
                ((b1) g3.getLayoutParams()).f1619c = true;
            }
        }
        g1 g1Var = recyclerView.h;
        ArrayList arrayList2 = g1Var.f1667c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            q1 q1Var = (q1) arrayList2.get(size);
            if (q1Var != null && (i5 = q1Var.f1770c) >= i && i5 < i7) {
                q1Var.a(2);
                g1Var.h(size);
            }
        }
        recyclerView.f783p0 = true;
    }

    public void g(int i, int i4) {
        RecyclerView recyclerView = this.f1752a;
        int h = recyclerView.f772k.h();
        for (int i5 = 0; i5 < h; i5++) {
            q1 M = RecyclerView.M(recyclerView.f772k.g(i5));
            if (M != null && !M.o() && M.f1770c >= i) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i5 + " holder " + M + " now at position " + (M.f1770c + i4));
                }
                M.l(i4, false);
                recyclerView.f775l0.f1724f = true;
            }
        }
        ArrayList arrayList = recyclerView.h.f1667c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            q1 q1Var = (q1) arrayList.get(i6);
            if (q1Var != null && q1Var.f1770c >= i) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i6 + " holder " + q1Var + " now at position " + (q1Var.f1770c + i4));
                }
                q1Var.l(i4, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f781o0 = true;
    }

    public void h(int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f1752a;
        int h = recyclerView.f772k.h();
        if (i < i4) {
            i6 = i;
            i5 = i4;
            i7 = -1;
        } else {
            i5 = i;
            i6 = i4;
            i7 = 1;
        }
        boolean z4 = false;
        for (int i13 = 0; i13 < h; i13++) {
            q1 M = RecyclerView.M(recyclerView.f772k.g(i13));
            if (M != null && (i12 = M.f1770c) >= i6 && i12 <= i5) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i13 + " holder " + M);
                }
                if (M.f1770c == i) {
                    M.l(i4 - i, false);
                } else {
                    M.l(i7, false);
                }
                recyclerView.f775l0.f1724f = true;
            }
        }
        ArrayList arrayList = recyclerView.h.f1667c;
        if (i < i4) {
            i9 = i;
            i8 = i4;
            i10 = -1;
        } else {
            i8 = i;
            i9 = i4;
            i10 = 1;
        }
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            q1 q1Var = (q1) arrayList.get(i14);
            if (q1Var != null && (i11 = q1Var.f1770c) >= i9 && i11 <= i8) {
                if (i11 == i) {
                    q1Var.l(i4 - i, z4);
                } else {
                    q1Var.l(i10, z4);
                }
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i14 + " holder " + q1Var);
                }
            }
            i14++;
            z4 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f781o0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(q1 q1Var, v0 v0Var, v0 v0Var2) {
        boolean z4;
        RecyclerView recyclerView = this.f1752a;
        recyclerView.getClass();
        q1Var.n(false);
        o oVar = (o) recyclerView.Q;
        if (v0Var != null) {
            oVar.getClass();
            int i = v0Var.f1808a;
            int i4 = v0Var2.f1808a;
            if (i != i4 || v0Var.f1809b != v0Var2.f1809b) {
                z4 = oVar.g(q1Var, i, v0Var.f1809b, i4, v0Var2.f1809b);
                if (z4) {
                    return;
                }
                recyclerView.W();
                return;
            }
        }
        oVar.l(q1Var);
        q1Var.f1768a.setAlpha(0.0f);
        oVar.i.add(q1Var);
        z4 = true;
        if (z4) {
        }
    }

    public void j(q1 q1Var, v0 v0Var, v0 v0Var2) {
        boolean z4;
        RecyclerView recyclerView = this.f1752a;
        recyclerView.h.m(q1Var);
        recyclerView.h(q1Var);
        q1Var.n(false);
        o oVar = (o) recyclerView.Q;
        oVar.getClass();
        int i = v0Var.f1808a;
        int i4 = v0Var.f1809b;
        View view = q1Var.f1768a;
        int left = v0Var2 == null ? view.getLeft() : v0Var2.f1808a;
        int top = v0Var2 == null ? view.getTop() : v0Var2.f1809b;
        if (q1Var.h() || (i == left && i4 == top)) {
            oVar.l(q1Var);
            oVar.h.add(q1Var);
            z4 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z4 = oVar.g(q1Var, i, i4, left, top);
        }
        if (z4) {
            recyclerView.W();
        }
    }

    public void k(int i) {
        RecyclerView recyclerView = this.f1752a;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
