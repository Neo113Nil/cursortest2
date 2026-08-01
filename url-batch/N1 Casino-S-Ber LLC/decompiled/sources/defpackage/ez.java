package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ez {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public dz g;
    public final /* synthetic */ RecyclerView h;

    public ez(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(nz nzVar, boolean z) {
        RecyclerView.j(nzVar);
        View view = nzVar.a;
        RecyclerView recyclerView = this.h;
        pz pzVar = recyclerView.s0;
        if (pzVar != null) {
            oz ozVar = pzVar.e;
            x80.m(view, ozVar != null ? (w) ozVar.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                t8.c();
                return;
            } else if (recyclerView.l0 != null) {
                recyclerView.k.Q(nzVar);
            }
        }
        nzVar.s = null;
        nzVar.r = null;
        dz c = c();
        c.getClass();
        int i = nzVar.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((cz) c.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        nzVar.n();
        arrayList2.add(nzVar);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        kz kzVar = recyclerView.l0;
        if (i >= 0 && i < kzVar.b()) {
            return !kzVar.g ? i : recyclerView.i.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + kzVar.b() + recyclerView.z());
    }

    public final dz c() {
        if (this.g == null) {
            dz dzVar = new dz();
            dzVar.a = new SparseArray();
            dzVar.b = 0;
            this.g = dzVar;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.E0;
        im imVar = this.h.k0;
        int[] iArr2 = (int[]) imVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        imVar.c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((nz) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        nz J = RecyclerView.J(view);
        boolean k = J.k();
        RecyclerView recyclerView = this.h;
        if (k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (J.j()) {
            J.n.k(J);
        } else if (J.q()) {
            J.j &= -33;
        }
        h(J);
        if (recyclerView.Q == null || J.h()) {
            return;
        }
        recyclerView.Q.d(J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(nz nzVar) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        im imVar = recyclerView.k0;
        boolean j = nzVar.j();
        View view = nzVar.a;
        boolean z3 = true;
        if (j || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(nzVar.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.z());
            throw new IllegalArgumentException(sb.toString());
        }
        if (nzVar.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + nzVar + recyclerView.z());
        }
        if (nzVar.p()) {
            t8.k("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.z()));
            return;
        }
        if ((nzVar.j & 16) == 0) {
            WeakHashMap weakHashMap = x80.a;
            if (view.hasTransientState()) {
                z = true;
                if (nzVar.h()) {
                    z3 = false;
                } else {
                    if (this.f <= 0 || (nzVar.j & 526) != 0) {
                        z2 = false;
                    } else {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.E0;
                        if (size > 0) {
                            int i = nzVar.c;
                            if (((int[]) imVar.d) != null) {
                                int i2 = imVar.c * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (((int[]) imVar.d)[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((nz) arrayList.get(i4)).c;
                                if (((int[]) imVar.d) == null) {
                                    break;
                                }
                                int i6 = imVar.c * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (((int[]) imVar.d)[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, nzVar);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(nzVar, true);
                    }
                    r4 = z2;
                }
                recyclerView.k.Q(nzVar);
                if (r4 && !z3 && z) {
                    nzVar.s = null;
                    nzVar.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (nzVar.h()) {
        }
        recyclerView.k.Q(nzVar);
        if (r4) {
        }
    }

    public final void i(View view) {
        ty tyVar;
        nz J = RecyclerView.J(view);
        int i = J.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && J.l() && (tyVar = recyclerView.Q) != null) {
            re reVar = (re) tyVar;
            if (J.d().isEmpty() && reVar.g && !J.g()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                J.n = this;
                J.o = true;
                this.b.add(J);
                return;
            }
        }
        if (J.g() && !J.i() && !recyclerView.q.b) {
            t8.k("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.z()));
            return;
        }
        J.n = this;
        J.o = false;
        this.a.add(J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0426, code lost:
    
        if (r10.g() == false) goto L241;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0543 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nz j(int i, long j) {
        nz nzVar;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z5;
        boolean z6;
        w wVar;
        ViewGroup.LayoutParams layoutParams;
        yy yyVar;
        int i2;
        nz nzVar2;
        int i3;
        View view;
        boolean z7;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        kz kzVar = recyclerView.l0;
        if (i < 0 || i >= kzVar.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + kzVar.b() + recyclerView.z());
        }
        if (kzVar.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        nzVar = (nz) this.b.get(i4);
                        if (!nzVar.q() && nzVar.c() == i) {
                            nzVar.a(32);
                            break;
                        }
                        i4++;
                    } else if (recyclerView.q.b && (g = recyclerView.i.g(i, 0)) > 0 && g < recyclerView.q.a()) {
                        long b = recyclerView.q.b(g);
                        for (int i5 = 0; i5 < size; i5++) {
                            nz nzVar3 = (nz) this.b.get(i5);
                            if (!nzVar3.q() && nzVar3.e == b) {
                                nzVar3.a(32);
                                nzVar = nzVar3;
                                break;
                            }
                        }
                    }
                }
                if (nzVar != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (nzVar != null) {
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            nz nzVar4 = (nz) arrayList2.get(i6);
                            if (!nzVar4.q() && nzVar4.c() == i && !nzVar4.g() && (kzVar.g || !nzVar4.i())) {
                                nzVar4.a(32);
                                nzVar = nzVar4;
                                z2 = true;
                                break;
                            }
                        }
                        ArrayList arrayList4 = (ArrayList) recyclerView.j.d;
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size3) {
                                z2 = true;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i7);
                            nz J = RecyclerView.J(view);
                            z2 = true;
                            if (J.c() == i && !J.g() && !J.i()) {
                                break;
                            }
                            i7++;
                        }
                        if (view == null) {
                            int size4 = arrayList3.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size4) {
                                    nzVar = null;
                                    break;
                                }
                                nz nzVar5 = (nz) arrayList3.get(i8);
                                if (!nzVar5.g() && nzVar5.c() == i && !nzVar5.e()) {
                                    arrayList3.remove(i8);
                                    nzVar = nzVar5;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            nz J2 = RecyclerView.J(view);
                            a6 a6Var = recyclerView.j;
                            ca caVar = (ca) a6Var.c;
                            int indexOfChild = ((oy) a6Var.b).a.indexOfChild(view);
                            if (indexOfChild < 0) {
                                t8.v(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!caVar.d(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            caVar.a(indexOfChild);
                            a6Var.y(view);
                            a6 a6Var2 = recyclerView.j;
                            ca caVar2 = (ca) a6Var2.c;
                            int indexOfChild2 = ((oy) a6Var2.b).a.indexOfChild(view);
                            int b2 = (indexOfChild2 == -1 || caVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - caVar2.b(indexOfChild2);
                            if (b2 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + J2 + recyclerView.z());
                            }
                            recyclerView.j.d(b2);
                            i(view);
                            J2.a(8224);
                            nzVar = J2;
                        }
                        if (nzVar != null) {
                            if (nzVar.i()) {
                                z7 = kzVar.g;
                            } else {
                                int i9 = nzVar.c;
                                if (i9 < 0 || i9 >= recyclerView.q.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + nzVar + recyclerView.z());
                                }
                                if (kzVar.g || recyclerView.q.c(nzVar.c) == nzVar.f) {
                                    py pyVar = recyclerView.q;
                                    if (!pyVar.b || nzVar.e == pyVar.b(nzVar.c)) {
                                        z7 = z2;
                                    }
                                }
                                z7 = false;
                            }
                            if (z7) {
                                z = z2;
                            } else {
                                nzVar.a(4);
                                if (nzVar.j()) {
                                    recyclerView.removeDetachedView(nzVar.a, false);
                                    nzVar.n.k(nzVar);
                                } else if (nzVar.q()) {
                                    nzVar.j &= -33;
                                }
                                h(nzVar);
                                nzVar = null;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (nzVar != null) {
                        int g2 = recyclerView.i.g(i, 0);
                        if (g2 >= 0) {
                            j2 = 3;
                            if (g2 < recyclerView.q.a()) {
                                int c = recyclerView.q.c(g2);
                                py pyVar2 = recyclerView.q;
                                j3 = 4;
                                if (pyVar2.b) {
                                    long b3 = pyVar2.b(g2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            nz nzVar6 = (nz) arrayList2.get(size5);
                                            i3 = g2;
                                            long j5 = nzVar6.e;
                                            View view2 = nzVar6.a;
                                            if (j5 == b3 && !nzVar6.q()) {
                                                if (c == nzVar6.f) {
                                                    nzVar6.a(32);
                                                    if (nzVar6.i() && !kzVar.g) {
                                                        nzVar6.j = (nzVar6.j & (-15)) | 2;
                                                    }
                                                    nzVar = nzVar6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    nz J3 = RecyclerView.J(view2);
                                                    J3.n = null;
                                                    J3.o = false;
                                                    J3.j &= -33;
                                                    h(J3);
                                                }
                                            }
                                            size5--;
                                            g2 = i3;
                                        } else {
                                            i3 = g2;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                nz nzVar7 = (nz) arrayList3.get(size6);
                                                if (nzVar7.e != b3 || nzVar7.e()) {
                                                    size6--;
                                                } else if (c == nzVar7.f) {
                                                    arrayList3.remove(size6);
                                                    nzVar = nzVar7;
                                                } else {
                                                    f(size6);
                                                }
                                            }
                                            nzVar = null;
                                        }
                                    }
                                    if (nzVar != null) {
                                        nzVar.c = i3;
                                        z = z2;
                                    }
                                }
                                if (nzVar == null) {
                                    cz czVar = (cz) c().a.get(c);
                                    if (czVar != null) {
                                        ArrayList arrayList5 = czVar.a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((nz) arrayList5.get(size7)).e()) {
                                                    nzVar2 = (nz) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    nzVar2 = null;
                                    if (nzVar2 != null) {
                                        nzVar2.n();
                                        int[] iArr = RecyclerView.E0;
                                    }
                                    nzVar = nzVar2;
                                }
                                if (nzVar == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j6 = this.g.a(c).c;
                                        if (!((j6 == 0 || j6 + nanoTime < j) ? z2 : false)) {
                                            return null;
                                        }
                                    }
                                    py pyVar3 = recyclerView.q;
                                    pyVar3.getClass();
                                    try {
                                        int i10 = n60.a;
                                        Trace.beginSection("RV CreateView");
                                        nzVar = pyVar3.e(recyclerView, c);
                                        View view3 = nzVar.a;
                                        if (view3.getParent() != null) {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                        nzVar.f = c;
                                        Trace.endSection();
                                        int[] iArr2 = RecyclerView.E0;
                                        RecyclerView E = RecyclerView.E(view3);
                                        if (E != null) {
                                            nzVar.b = new WeakReference(E);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        cz a = this.g.a(c);
                                        long j7 = a.c;
                                        if (j7 != 0) {
                                            nanoTime2 = (nanoTime2 / 4) + ((j7 / 4) * 3);
                                        }
                                        a.c = nanoTime2;
                                    } finally {
                                        int i11 = n60.a;
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g2 + ").state:" + kzVar.b() + recyclerView.z());
                    }
                    j2 = 3;
                    j3 = 4;
                    View view4 = nzVar.a;
                    if (z && !kzVar.g) {
                        i2 = nzVar.j;
                        if ((i2 & 8192) == 0 ? z2 : false) {
                            nzVar.j = i2 & (-8193);
                            if (kzVar.j) {
                                ty.b(nzVar);
                                ty tyVar = recyclerView.Q;
                                nzVar.d();
                                tyVar.getClass();
                                ev evVar = new ev();
                                evVar.a(nzVar);
                                recyclerView.V(nzVar, evVar);
                            }
                        }
                    }
                    if (kzVar.g || !nzVar.f()) {
                        if (nzVar.f()) {
                            if (!((nzVar.j & 2) != 0 ? z2 : false)) {
                            }
                        }
                        z3 = false;
                        int g3 = recyclerView.i.g(i, 0);
                        w wVar2 = null;
                        nzVar.s = null;
                        nzVar.r = recyclerView;
                        int i12 = nzVar.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j8 = this.g.a(i12).d;
                            if (j8 != 0 && j8 + nanoTime3 >= j) {
                                z6 = false;
                                z5 = z2;
                                layoutParams = view4.getLayoutParams();
                                if (layoutParams != null) {
                                    yyVar = (yy) recyclerView.generateDefaultLayoutParams();
                                    view4.setLayoutParams(yyVar);
                                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                    yyVar = (yy) layoutParams;
                                } else {
                                    yyVar = (yy) recyclerView.generateLayoutParams(layoutParams);
                                    view4.setLayoutParams(yyVar);
                                }
                                yyVar.a = nzVar;
                                if (z && z6) {
                                    z3 = z5;
                                }
                                yyVar.d = z3;
                                return nzVar;
                            }
                        }
                        py pyVar4 = recyclerView.q;
                        pyVar4.getClass();
                        z4 = nzVar.s != null ? z2 : false;
                        if (z4) {
                            nzVar.c = g3;
                            if (pyVar4.b) {
                                nzVar.e = pyVar4.b(g3);
                            }
                            nzVar.j = (nzVar.j & (-520)) | 1;
                            int i13 = n60.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        nzVar.s = pyVar4;
                        nzVar.d();
                        pyVar4.d(nzVar, g3);
                        if (z4) {
                            ArrayList arrayList6 = nzVar.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            nzVar.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof yy) {
                                ((yy) layoutParams2).c = z2;
                            }
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        cz a2 = this.g.a(nzVar.f);
                        j4 = a2.d;
                        if (j4 != 0) {
                            nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        accessibilityManager = recyclerView.F;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z5 = true;
                        } else {
                            WeakHashMap weakHashMap = x80.a;
                            z5 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            pz pzVar = recyclerView.s0;
                            if (pzVar != null) {
                                oz ozVar = pzVar.e;
                                if (ozVar != null) {
                                    View.AccessibilityDelegate d = x80.d(view4);
                                    if (d != null) {
                                        if (d instanceof v) {
                                            wVar = ((v) d).a;
                                            if (wVar != null && wVar != ozVar) {
                                                ozVar.e.put(view4, wVar);
                                            }
                                        } else {
                                            wVar2 = new w(d);
                                        }
                                    }
                                    wVar = wVar2;
                                    if (wVar != null) {
                                        ozVar.e.put(view4, wVar);
                                    }
                                }
                                x80.m(view4, ozVar);
                            }
                        }
                        if (kzVar.g) {
                            nzVar.g = i;
                        }
                        z6 = z5;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        yyVar.a = nzVar;
                        if (z) {
                            z3 = z5;
                        }
                        yyVar.d = z3;
                        return nzVar;
                    }
                    nzVar.g = i;
                    z5 = z2;
                    z6 = false;
                    z3 = false;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    yyVar.a = nzVar;
                    if (z) {
                    }
                    yyVar.d = z3;
                    return nzVar;
                }
            }
            nzVar = null;
            if (nzVar != null) {
            }
        } else {
            nzVar = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (nzVar != null) {
        }
        if (nzVar != null) {
        }
        View view42 = nzVar.a;
        if (z) {
            i2 = nzVar.j;
            if ((i2 & 8192) == 0 ? z2 : false) {
            }
        }
        if (kzVar.g) {
        }
        if (nzVar.f()) {
        }
        z3 = false;
        int g32 = recyclerView.i.g(i, 0);
        w wVar22 = null;
        nzVar.s = null;
        nzVar.r = recyclerView;
        int i122 = nzVar.f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        py pyVar42 = recyclerView.q;
        pyVar42.getClass();
        if (nzVar.s != null) {
        }
        if (z4) {
        }
        nzVar.s = pyVar42;
        nzVar.d();
        pyVar42.d(nzVar, g32);
        if (z4) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        cz a22 = this.g.a(nzVar.f);
        j4 = a22.d;
        if (j4 != 0) {
        }
        a22.d = nanoTime42;
        accessibilityManager = recyclerView.F;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (kzVar.g) {
        }
        z6 = z5;
        layoutParams = view42.getLayoutParams();
        if (layoutParams != null) {
        }
        yyVar.a = nzVar;
        if (z) {
        }
        yyVar.d = z3;
        return nzVar;
    }

    public final void k(nz nzVar) {
        if (nzVar.o) {
            this.b.remove(nzVar);
        } else {
            this.a.remove(nzVar);
        }
        nzVar.n = null;
        nzVar.o = false;
        nzVar.j &= -33;
    }

    public final void l() {
        xy xyVar = this.h.r;
        this.f = this.e + (xyVar != null ? xyVar.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
