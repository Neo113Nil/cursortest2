package w4;

import a0.g1;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import u.i1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7953a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7954b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7955c;

    /* renamed from: d, reason: collision with root package name */
    public int f7956d;

    /* renamed from: e, reason: collision with root package name */
    public int f7957e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f7958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7959g;

    public j0(RecyclerView recyclerView) {
        this.f7959g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7953a = arrayList;
        this.f7954b = null;
        this.f7955c = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f7956d = 2;
        this.f7957e = 2;
    }

    public final void a(p0 p0Var, boolean z3) {
        RecyclerView.e(p0Var);
        p0Var.getClass();
        RecyclerView recyclerView = this.f7959g;
        r0 r0Var = recyclerView.f918g0;
        if (r0Var != null) {
            q0 q0Var = r0Var.f8027e;
            q3.k0.k(null, q0Var != null ? (q3.b) q0Var.f8022e.remove(null) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f930n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f910c0 != null) {
                a0.a0 a0Var = recyclerView.f919h;
                o.q qVar = (o.q) a0Var.f12f;
                int g3 = qVar.g() - 1;
                while (true) {
                    if (g3 < 0) {
                        break;
                    }
                    if (p0Var == qVar.h(g3)) {
                        Object[] objArr = qVar.f5522f;
                        Object obj = objArr[g3];
                        Object obj2 = o.r.f5525a;
                        if (obj != obj2) {
                            objArr[g3] = obj2;
                            qVar.f5520d = true;
                        }
                    } else {
                        g3--;
                    }
                }
                w0 w0Var = (w0) ((o.t0) a0Var.f11e).remove(p0Var);
                if (w0Var != null) {
                    w0Var.f8057a = 0;
                    w0.f8056b.c(w0Var);
                }
            }
        }
        p0Var.f8010g = null;
        i0 c8 = c();
        c8.getClass();
        ArrayList arrayList2 = c8.a(0).f7922a;
        if (((h0) c8.f7927a.get(0)).f7923b <= arrayList2.size()) {
            return;
        }
        p0Var.l();
        arrayList2.add(p0Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f7959g;
        if (i >= 0 && i < recyclerView.f910c0.a()) {
            return !recyclerView.f910c0.f7977e ? i : recyclerView.f915f.k(i, 0);
        }
        StringBuilder l3 = a0.q.l("invalid position ", i, ". State item count is ");
        l3.append(recyclerView.f910c0.a());
        l3.append(recyclerView.p());
        throw new IndexOutOfBoundsException(l3.toString());
    }

    public final i0 c() {
        if (this.f7958f == null) {
            i0 i0Var = new i0();
            i0Var.f7927a = new SparseArray();
            i0Var.f7928b = 0;
            this.f7958f = i0Var;
        }
        return this.f7958f;
    }

    public final View d(int i) {
        i(i, Long.MAX_VALUE).getClass();
        return null;
    }

    public final void e() {
        ArrayList arrayList = this.f7955c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f905n0;
        r5.m mVar = this.f7959g.f909b0;
        mVar.getClass();
        mVar.f6682c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.f7955c;
        a((p0) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        p0 s5 = RecyclerView.s(view);
        boolean j7 = s5.j();
        RecyclerView recyclerView = this.f7959g;
        if (j7) {
            recyclerView.removeDetachedView(view, false);
        }
        if (s5.i()) {
            s5.f8006c.j(s5);
        } else if (s5.o()) {
            s5.f8005b &= -33;
        }
        h(s5);
        if (recyclerView.I == null || s5.g()) {
            return;
        }
        recyclerView.I.b(s5);
    }

    public final void h(p0 p0Var) {
        if (!p0Var.i()) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(p0Var.i());
        sb.append(" isAttached:");
        throw null;
    }

    public final p0 i(int i, long j7) {
        View view;
        a0 a0Var;
        ArrayList arrayList;
        int size;
        RecyclerView recyclerView = this.f7959g;
        m0 m0Var = recyclerView.f910c0;
        if (i < 0 || i >= m0Var.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + m0Var.a() + recyclerView.p());
        }
        if (m0Var.f7977e && (arrayList = this.f7954b) != null && (size = arrayList.size()) != 0) {
            for (int i8 = 0; i8 < size; i8++) {
                p0 p0Var = (p0) this.f7954b.get(i8);
                if (!p0Var.o() && p0Var.b() == i) {
                    p0Var.a(32);
                }
            }
            throw null;
        }
        ArrayList arrayList2 = this.f7953a;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p0 p0Var2 = (p0) arrayList2.get(i9);
            if (!p0Var2.o() && p0Var2.b() == i && !p0Var2.f() && (m0Var.f7977e || !p0Var2.h())) {
                p0Var2.a(32);
                break;
            }
        }
        ArrayList arrayList3 = (ArrayList) recyclerView.f917g.f86d;
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                view = null;
                break;
            }
            view = (View) arrayList3.get(i10);
            p0 s5 = RecyclerView.s(view);
            if (s5.b() == i && !s5.f() && !s5.h()) {
                break;
            }
            i10++;
        }
        if (view == null) {
            ArrayList arrayList4 = this.f7955c;
            int size4 = arrayList4.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size4) {
                    break;
                }
                p0 p0Var3 = (p0) arrayList4.get(i11);
                if (!p0Var3.f() && p0Var3.b() == i && !p0Var3.d()) {
                    arrayList4.remove(i11);
                    break;
                }
                i11++;
            }
        } else {
            p0 s7 = RecyclerView.s(view);
            g1 g1Var = recyclerView.f917g;
            i1 i1Var = (i1) g1Var.f85c;
            int indexOfChild = ((w) g1Var.f84b).f8055a.indexOfChild(view);
            if (indexOfChild < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            if (!i1Var.e(indexOfChild)) {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
            i1Var.b(indexOfChild);
            g1Var.O(view);
            g1 g1Var2 = recyclerView.f917g;
            i1 i1Var2 = (i1) g1Var2.f85c;
            int indexOfChild2 = ((w) g1Var2.f84b).f8055a.indexOfChild(view);
            int c8 = (indexOfChild2 == -1 || i1Var2.e(indexOfChild2)) ? -1 : indexOfChild2 - i1Var2.c(indexOfChild2);
            if (c8 == -1) {
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + s7 + recyclerView.p());
            }
            recyclerView.f917g.j(c8);
            RecyclerView.s(view);
            p0 p0Var4 = null;
            if ((p0Var4.f8005b & 12) == 0 && p0Var4.k() && (a0Var = this.f7959g.I) != null) {
                g gVar = (g) a0Var;
                if (p0Var4.c().isEmpty() && gVar.f7911g && !p0Var4.f()) {
                    if (this.f7954b == null) {
                        this.f7954b = new ArrayList();
                    }
                    p0Var4.f8006c = this;
                    p0Var4.f8007d = true;
                    this.f7954b.add(null);
                    s7.a(8224);
                }
            }
            if (p0Var4.f() && !p0Var4.h()) {
                throw null;
            }
            p0Var4.f8006c = this;
            p0Var4.f8007d = false;
            this.f7953a.add(null);
            s7.a(8224);
        }
        int k3 = recyclerView.f915f.k(i, 0);
        if (k3 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + k3 + ").state:" + m0Var.a() + recyclerView.p());
    }

    public final void j(p0 p0Var) {
        if (p0Var.f8007d) {
            this.f7954b.remove(p0Var);
        } else {
            this.f7953a.remove(p0Var);
        }
        p0Var.f8006c = null;
        p0Var.f8007d = false;
        p0Var.f8005b &= -33;
    }

    public final void k() {
        this.f7957e = this.f7956d + 0;
        ArrayList arrayList = this.f7955c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7957e; size--) {
            f(size);
        }
    }
}
