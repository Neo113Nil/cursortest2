package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class le {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final /* synthetic */ RecyclerView f;
    ifn g;

    public le(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.f;
            lm lmVar = recyclerView.M;
            if (i < lmVar.a()) {
                return !lmVar.g ? i : recyclerView.g.a(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.f;
        sb.append(recyclerView2.M.a());
        sb.append(recyclerView2.k());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    final void b(lp lpVar, boolean z) {
        RecyclerView.u(lpVar);
        RecyclerView recyclerView = this.f;
        View view = lpVar.a;
        lr lrVar = recyclerView.Q;
        if (lrVar != null) {
            wv j = lrVar.j();
            yq.l(view, j instanceof lq ? (wv) ((lq) j).b.remove(view) : null);
        }
        if (z) {
            List list = recyclerView.n;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((lf) list.get(i)).a();
            }
            kr krVar = recyclerView.l;
            if (krVar != null) {
                krVar.n(lpVar);
            }
            if (recyclerView.M != null) {
                recyclerView.V.i(lpVar);
            }
        }
        lpVar.r = null;
        lpVar.q = null;
        ifn p = p();
        int i2 = lpVar.f;
        ArrayList arrayList = p.h(i2).a;
        int i3 = ((ld) ((SparseArray) p.a).get(i2)).b;
        if (arrayList.size() >= 5) {
            yg.d(view);
        } else {
            lpVar.k();
            arrayList.add(lpVar);
        }
    }

    public final void c() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void d() {
        RecyclerView recyclerView;
        kr krVar;
        ifn ifnVar = this.g;
        if (ifnVar == null || (krVar = (recyclerView = this.f).l) == null || !recyclerView.p) {
            return;
        }
        ifnVar.c.add(krVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void e(kr krVar, boolean z) {
        ifn ifnVar = this.g;
        if (ifnVar == null) {
            return;
        }
        ?? r0 = ifnVar.c;
        r0.remove(krVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) ifnVar.a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((ld) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                yg.d(((lp) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void f(View view) {
        lp h = RecyclerView.h(view);
        h.m = null;
        h.n = false;
        h.h();
        j(h);
    }

    public final void g() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f.L.b();
                return;
            }
            h(size);
        }
    }

    public final void h(int i) {
        int i2 = RecyclerView.aa;
        ArrayList arrayList = this.c;
        b((lp) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        lp h = RecyclerView.h(view);
        if (h.w()) {
            this.f.removeDetachedView(view, false);
        }
        if (h.v()) {
            h.o();
        } else if (h.A()) {
            h.h();
        }
        j(h);
        RecyclerView recyclerView = this.f;
        if (recyclerView.C == null || h.t()) {
            return;
        }
        recyclerView.C.d(h);
    }

    final void j(lp lpVar) {
        boolean z;
        kr krVar;
        boolean z2;
        boolean z3 = false;
        if (!lpVar.v()) {
            View view = lpVar.a;
            if (view.getParent() == null) {
                if (lpVar.w()) {
                    throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + lpVar + this.f.k());
                }
                if (lpVar.z()) {
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f.k()));
                }
                if ((lpVar.j & 16) == 0) {
                    int i = yq.a;
                    if (view.hasTransientState()) {
                        z = true;
                        RecyclerView recyclerView = this.f;
                        krVar = recyclerView.l;
                        if ((krVar == null && z && krVar.q()) || lpVar.t()) {
                            if (this.e <= 0 || lpVar.p(526)) {
                                z2 = false;
                            } else {
                                ArrayList arrayList = this.c;
                                int size = arrayList.size();
                                if (size >= this.e && size > 0) {
                                    h(0);
                                    size--;
                                }
                                if (size > 0 && !recyclerView.L.d(lpVar.c)) {
                                    do {
                                        size--;
                                        if (size < 0) {
                                            break;
                                        }
                                    } while (recyclerView.L.d(((lp) arrayList.get(size)).c));
                                    size++;
                                }
                                arrayList.add(size, lpVar);
                                z2 = true;
                            }
                            if (z2) {
                                r1 = false;
                            } else {
                                b(lpVar, true);
                            }
                            z3 = z2;
                        } else {
                            r1 = false;
                        }
                        recyclerView.V.i(lpVar);
                        if (z3 && !r1 && z) {
                            yg.d(view);
                            lpVar.r = null;
                            lpVar.q = null;
                            return;
                        }
                        return;
                    }
                }
                z = false;
                RecyclerView recyclerView2 = this.f;
                krVar = recyclerView2.l;
                if (krVar == null) {
                }
                r1 = false;
                recyclerView2.V.i(lpVar);
                if (z3) {
                    return;
                } else {
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(lpVar.v());
        sb.append(" isAttached:");
        sb.append(lpVar.a.getParent() != null);
        sb.append(this.f.k());
        throw new IllegalArgumentException(sb.toString());
    }

    final void k(View view) {
        kv kvVar;
        lp h = RecyclerView.h(view);
        if (!h.p(12) && h.x() && (kvVar = this.f.C) != null && h.c().isEmpty() && kvVar.a && !h.s()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            h.n(this, true);
            this.b.add(h);
            return;
        }
        if (h.s() && !h.u()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.l.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.k()));
            }
        }
        h.n(this, false);
        this.a.add(h);
    }

    public final void l(lp lpVar) {
        if (lpVar.n) {
            this.b.remove(lpVar);
        } else {
            this.a.remove(lpVar);
        }
        lpVar.m = null;
        lpVar.n = false;
        lpVar.h();
    }

    public final void m() {
        ky kyVar = this.f.m;
        this.e = (kyVar != null ? kyVar.y : 0) + 2;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.e) {
                return;
            } else {
                h(size);
            }
        }
    }

    public final View n(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0424, code lost:
    
        if ((r6 + r8) >= r25) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019b, code lost:
    
        if (r3.g == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cd, code lost:
    
        if (r10.e != r6.c(r10.c)) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0080  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final lp o(int i, long j) {
        boolean z;
        lp lpVar;
        lp lpVar2;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        lp lpVar3;
        View view;
        int size;
        int a;
        if (i >= 0) {
            RecyclerView recyclerView = this.f;
            lm lmVar = recyclerView.M;
            if (i < lmVar.a()) {
                if (lmVar.g) {
                    ArrayList arrayList = this.b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                lpVar = (lp) this.b.get(i2);
                                if (!lpVar.A() && lpVar.b() == i) {
                                    lpVar.e(32);
                                    break;
                                }
                                i2++;
                            } else if (recyclerView.l.c && (a = recyclerView.g.a(i, 0)) > 0 && a < recyclerView.l.a()) {
                                long c = recyclerView.l.c(a);
                                for (int i3 = 0; i3 < size; i3++) {
                                    lp lpVar4 = (lp) this.b.get(i3);
                                    if (!lpVar4.A() && lpVar4.e == c) {
                                        lpVar4.e(32);
                                        lpVar = lpVar4;
                                        break;
                                    }
                                }
                            }
                        }
                        z = lpVar == null;
                    }
                    lpVar = null;
                    if (lpVar == null) {
                    }
                } else {
                    z = false;
                    lpVar = null;
                }
                if (lpVar == null) {
                    ArrayList arrayList2 = this.a;
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        lp lpVar5 = (lp) arrayList2.get(i4);
                        if (!lpVar5.A() && lpVar5.b() == i && !lpVar5.s() && (lmVar.g || !lpVar5.u())) {
                            lpVar5.e(32);
                            lpVar = lpVar5;
                            lpVar2 = null;
                            break;
                        }
                    }
                    ja jaVar = recyclerView.h;
                    List list = jaVar.b;
                    int size3 = list.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            lpVar2 = null;
                            view = null;
                            break;
                        }
                        view = (View) list.get(i5);
                        kee keeVar = jaVar.e;
                        lp h = RecyclerView.h(view);
                        lpVar2 = null;
                        if (h.b() == i && !h.s() && !h.u()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        ArrayList arrayList3 = this.c;
                        int size4 = arrayList3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                lpVar = lpVar2;
                                break;
                            }
                            lp lpVar6 = (lp) arrayList3.get(i6);
                            if (!lpVar6.s() && lpVar6.b() == i && !lpVar6.q()) {
                                arrayList3.remove(i6);
                                lpVar = lpVar6;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        lp h2 = RecyclerView.h(view);
                        ja jaVar2 = recyclerView.h;
                        int C = jaVar2.e.C(view);
                        if (C < 0) {
                            Objects.toString(view);
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
                        }
                        iz izVar = jaVar2.a;
                        if (!izVar.f(C)) {
                            Objects.toString(view);
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(view.toString()));
                        }
                        izVar.b(C);
                        jaVar2.l(view);
                        int d = recyclerView.h.d(view);
                        if (d == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + h2 + recyclerView.k());
                        }
                        recyclerView.h.i(d);
                        k(view);
                        h2.e(8224);
                        lpVar = h2;
                    }
                    if (lpVar != null) {
                        if (!lpVar.u()) {
                            int i7 = lpVar.c;
                            if (i7 < 0 || i7 >= recyclerView.l.a()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + lpVar + recyclerView.k());
                            }
                            if (lmVar.g || recyclerView.l.b(lpVar.c) == lpVar.f) {
                                kr krVar = recyclerView.l;
                                if (krVar.c) {
                                }
                                z = true;
                            }
                            lpVar.e(4);
                            if (lpVar.v()) {
                                recyclerView.removeDetachedView(lpVar.a, false);
                                lpVar.o();
                            } else if (lpVar.A()) {
                                lpVar.h();
                            }
                            j(lpVar);
                            lpVar = lpVar2;
                        }
                    }
                } else {
                    lpVar2 = null;
                }
                if (lpVar == null) {
                    int a2 = recyclerView.g.a(i, 0);
                    if (a2 < 0 || a2 >= recyclerView.l.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + a2 + ").state:" + lmVar.a() + recyclerView.k());
                    }
                    int b = recyclerView.l.b(a2);
                    kr krVar2 = recyclerView.l;
                    j2 = 0;
                    if (krVar2.c) {
                        long c2 = krVar2.c(a2);
                        ArrayList arrayList4 = this.a;
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j3 = Long.MAX_VALUE;
                                lp lpVar7 = (lp) arrayList4.get(size5);
                                if (lpVar7.e == c2 && !lpVar7.A()) {
                                    if (b == lpVar7.f) {
                                        lpVar7.e(32);
                                        if (lpVar7.u() && !lmVar.g) {
                                            lpVar7.l(2, 14);
                                        }
                                        lpVar = lpVar7;
                                    } else {
                                        arrayList4.remove(size5);
                                        View view2 = lpVar7.a;
                                        recyclerView.removeDetachedView(view2, false);
                                        f(view2);
                                    }
                                }
                                size5--;
                            } else {
                                j3 = Long.MAX_VALUE;
                                ArrayList arrayList5 = this.c;
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    lp lpVar8 = (lp) arrayList5.get(size6);
                                    if (lpVar8.e != c2 || lpVar8.q()) {
                                        size6--;
                                    } else if (b == lpVar8.f) {
                                        arrayList5.remove(size6);
                                        lpVar = lpVar8;
                                    } else {
                                        h(size6);
                                    }
                                }
                                lpVar = lpVar2;
                            }
                        }
                        if (lpVar != null) {
                            lpVar.c = a2;
                            z = true;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (lpVar == null) {
                        ld ldVar = (ld) ((SparseArray) p().a).get(b);
                        if (ldVar != null) {
                            ArrayList arrayList6 = ldVar.a;
                            if (!arrayList6.isEmpty()) {
                                for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                                    if (!((lp) arrayList6.get(size7)).q()) {
                                        lpVar3 = (lp) arrayList6.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        lpVar3 = lpVar2;
                        if (lpVar3 != null) {
                            lpVar3.k();
                        }
                        lpVar = lpVar3;
                    }
                    if (lpVar == null) {
                        long nanoTime = System.nanoTime();
                        if (j != j3) {
                            long j4 = this.g.h(b).c;
                            if (j4 != 0 && j4 + nanoTime >= j) {
                                return lpVar2;
                            }
                        }
                        kr krVar3 = recyclerView.l;
                        try {
                            if (vy.a()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(b)));
                            }
                            lpVar = krVar3.d(recyclerView, b);
                            if (lpVar.a.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            lpVar.f = b;
                            Trace.endSection();
                            RecyclerView i8 = RecyclerView.i(lpVar.a);
                            if (i8 != null) {
                                lpVar.b = new WeakReference(i8);
                            }
                            long nanoTime2 = System.nanoTime() - nanoTime;
                            ld h3 = this.g.h(b);
                            h3.c = ifn.i(h3.c, nanoTime2);
                        } finally {
                            Trace.endSection();
                        }
                    }
                } else {
                    j2 = 0;
                    j3 = Long.MAX_VALUE;
                }
                if (z) {
                    RecyclerView recyclerView2 = this.f;
                    lm lmVar2 = recyclerView2.M;
                    if (!lmVar2.g && lpVar.p(8192)) {
                        lpVar.l(0, 8192);
                        if (lmVar2.j) {
                            kv.k(lpVar);
                            lpVar.c();
                            recyclerView2.ar(lpVar, kv.l(lpVar));
                        }
                    }
                }
                RecyclerView recyclerView3 = this.f;
                lm lmVar3 = recyclerView3.M;
                if (lmVar3.g && lpVar.r()) {
                    lpVar.g = i;
                } else if (!lpVar.r() || lpVar.y() || lpVar.s()) {
                    int a3 = recyclerView3.g.a(i, 0);
                    lpVar.r = lpVar2;
                    lpVar.q = recyclerView3;
                    int i9 = lpVar.f;
                    long nanoTime3 = System.nanoTime();
                    if (j != j3) {
                        long j5 = this.g.h(i9).d;
                        if (j5 != j2) {
                        }
                    }
                    if (lpVar.w()) {
                        View view3 = lpVar.a;
                        recyclerView3.attachViewToParent(view3, recyclerView3.getChildCount(), view3.getLayoutParams());
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    kr krVar4 = recyclerView3.l;
                    boolean z6 = lpVar.r == null;
                    if (z6) {
                        lpVar.c = a3;
                        if (krVar4.c) {
                            lpVar.e = krVar4.c(a3);
                        }
                        lpVar.l(1, 519);
                        if (vy.a()) {
                            z3 = false;
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(lpVar.f)));
                            lpVar.r = krVar4;
                            lpVar.c();
                            krVar4.k(lpVar, a3);
                            if (z6) {
                                lpVar.g();
                                ViewGroup.LayoutParams layoutParams3 = lpVar.a.getLayoutParams();
                                if (layoutParams3 instanceof kz) {
                                    ((kz) layoutParams3).e = true;
                                }
                            }
                            if (z2) {
                                recyclerView3.detachViewFromParent(lpVar.a);
                            }
                            long nanoTime4 = System.nanoTime();
                            ld h4 = this.g.h(lpVar.f);
                            h4.d = ifn.i(h4.d, nanoTime4 - nanoTime3);
                            if (recyclerView3.aj()) {
                                z4 = true;
                            } else {
                                View view4 = lpVar.a;
                                z4 = true;
                                if (view4.getImportantForAccessibility() == 0) {
                                    view4.setImportantForAccessibility(1);
                                }
                                lr lrVar = recyclerView3.Q;
                                if (lrVar != null) {
                                    wv j6 = lrVar.j();
                                    if (j6 instanceof lq) {
                                        lq lqVar = (lq) j6;
                                        wv c3 = yq.c(view4);
                                        if (c3 != null && c3 != lqVar) {
                                            lqVar.b.put(view4, c3);
                                        }
                                    }
                                    yq.l(view4, j6);
                                }
                            }
                            if (lmVar3.g) {
                                lpVar.g = i;
                            }
                            z5 = z4;
                            View view5 = lpVar.a;
                            layoutParams = view5.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams2 = recyclerView3.generateDefaultLayoutParams();
                                view5.setLayoutParams(layoutParams2);
                            } else if (recyclerView3.checkLayoutParams(layoutParams)) {
                                layoutParams2 = (kz) layoutParams;
                            } else {
                                layoutParams2 = recyclerView3.generateLayoutParams(layoutParams);
                                view5.setLayoutParams(layoutParams2);
                            }
                            kz kzVar = (kz) layoutParams2;
                            kzVar.c = lpVar;
                            kzVar.f = (z || !z5) ? z3 : z4;
                            return lpVar;
                        }
                    }
                    z3 = false;
                    lpVar.r = krVar4;
                    lpVar.c();
                    krVar4.k(lpVar, a3);
                    if (z6) {
                    }
                    if (z2) {
                    }
                    long nanoTime42 = System.nanoTime();
                    ld h42 = this.g.h(lpVar.f);
                    h42.d = ifn.i(h42.d, nanoTime42 - nanoTime3);
                    if (recyclerView3.aj()) {
                    }
                    if (lmVar3.g) {
                    }
                    z5 = z4;
                    View view52 = lpVar.a;
                    layoutParams = view52.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    kz kzVar2 = (kz) layoutParams2;
                    kzVar2.c = lpVar;
                    kzVar2.f = (z || !z5) ? z3 : z4;
                    return lpVar;
                }
                z5 = false;
                z4 = true;
                z3 = false;
                View view522 = lpVar.a;
                layoutParams = view522.getLayoutParams();
                if (layoutParams == null) {
                }
                kz kzVar22 = (kz) layoutParams2;
                kzVar22.c = lpVar;
                kzVar22.f = (z || !z5) ? z3 : z4;
                return lpVar;
            }
        }
        StringBuilder sb = new StringBuilder("Invalid item position ");
        sb.append(i);
        sb.append("(");
        sb.append(i);
        sb.append("). Item count:");
        RecyclerView recyclerView4 = this.f;
        sb.append(recyclerView4.M.a());
        sb.append(recyclerView4.k());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final ifn p() {
        if (this.g == null) {
            this.g = new ifn((byte[]) null);
            d();
        }
        return this.g;
    }
}
