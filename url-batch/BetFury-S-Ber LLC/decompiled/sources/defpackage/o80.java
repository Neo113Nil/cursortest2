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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class o80 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public n80 g;
    public final /* synthetic */ RecyclerView h;

    public o80(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(x80 x80Var, boolean z) {
        RecyclerView.j(x80Var);
        View view = x80Var.a;
        RecyclerView recyclerView = this.h;
        z80 z80Var = recyclerView.s0;
        if (z80Var != null) {
            y80 y80Var = z80Var.e;
            hm0.m(view, y80Var != null ? (a0) y80Var.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                s9.c();
                return;
            } else if (recyclerView.l0 != null) {
                recyclerView.k.f(x80Var);
            }
        }
        x80Var.s = null;
        x80Var.r = null;
        n80 c = c();
        c.getClass();
        int i = x80Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((m80) c.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        x80Var.n();
        arrayList2.add(x80Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        u80 u80Var = recyclerView.l0;
        if (i >= 0 && i < u80Var.b()) {
            return !u80Var.g ? i : recyclerView.i.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + u80Var.b() + recyclerView.z());
    }

    public final n80 c() {
        if (this.g == null) {
            n80 n80Var = new n80();
            n80Var.a = new SparseArray();
            n80Var.b = 0;
            this.g = n80Var;
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
        ac acVar = this.h.k0;
        int[] iArr2 = (int[]) acVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        acVar.c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((x80) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        x80 J = RecyclerView.J(view);
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
    public final void h(x80 x80Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        ac acVar = recyclerView.k0;
        boolean j = x80Var.j();
        View view = x80Var.a;
        boolean z3 = true;
        if (j || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(x80Var.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.z());
            throw new IllegalArgumentException(sb.toString());
        }
        if (x80Var.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + x80Var + recyclerView.z());
        }
        if (x80Var.p()) {
            s9.k("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.z()));
            return;
        }
        if ((x80Var.j & 16) == 0) {
            WeakHashMap weakHashMap = hm0.a;
            if (view.hasTransientState()) {
                z = true;
                if (x80Var.h()) {
                    z3 = false;
                } else {
                    if (this.f <= 0 || (x80Var.j & 526) != 0) {
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
                            int i = x80Var.c;
                            if (((int[]) acVar.d) != null) {
                                int i2 = acVar.c * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (((int[]) acVar.d)[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((x80) arrayList.get(i4)).c;
                                if (((int[]) acVar.d) == null) {
                                    break;
                                }
                                int i6 = acVar.c * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (((int[]) acVar.d)[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, x80Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(x80Var, true);
                    }
                    r4 = z2;
                }
                recyclerView.k.f(x80Var);
                if (r4 && !z3 && z) {
                    x80Var.s = null;
                    x80Var.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (x80Var.h()) {
        }
        recyclerView.k.f(x80Var);
        if (r4) {
        }
    }

    public final void i(View view) {
        d80 d80Var;
        x80 J = RecyclerView.J(view);
        int i = J.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && J.l() && (d80Var = recyclerView.Q) != null) {
            pi piVar = (pi) d80Var;
            if (J.d().isEmpty() && piVar.g && !J.g()) {
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
            s9.k("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.z()));
            return;
        }
        J.n = this;
        J.o = false;
        this.a.add(J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0426, code lost:
    
        if (r10.g() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0452, code lost:
    
        if ((r13 + r11) >= r28) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
    
        if (r10.f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x80 j(int i, long j) {
        x80 x80Var;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        i80 i80Var;
        int i2;
        x80 x80Var2;
        int i3;
        View view;
        boolean z6;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        u80 u80Var = recyclerView.l0;
        if (i < 0 || i >= u80Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + u80Var.b() + recyclerView.z());
        }
        if (u80Var.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        x80Var = (x80) this.b.get(i4);
                        if (!x80Var.q() && x80Var.c() == i) {
                            x80Var.a(32);
                            break;
                        }
                        i4++;
                    } else if (recyclerView.q.b && (g = recyclerView.i.g(i, 0)) > 0 && g < recyclerView.q.a()) {
                        long b = recyclerView.q.b(g);
                        for (int i5 = 0; i5 < size; i5++) {
                            x80 x80Var3 = (x80) this.b.get(i5);
                            if (!x80Var3.q() && x80Var3.e == b) {
                                x80Var3.a(32);
                                x80Var = x80Var3;
                                break;
                            }
                        }
                    }
                }
                if (x80Var != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (x80Var != null) {
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            x80 x80Var4 = (x80) arrayList2.get(i6);
                            if (!x80Var4.q() && x80Var4.c() == i && !x80Var4.g() && (u80Var.g || !x80Var4.i())) {
                                x80Var4.a(32);
                                x80Var = x80Var4;
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
                            x80 J = RecyclerView.J(view);
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
                                    x80Var = null;
                                    break;
                                }
                                x80 x80Var5 = (x80) arrayList3.get(i8);
                                if (!x80Var5.g() && x80Var5.c() == i && !x80Var5.e()) {
                                    arrayList3.remove(i8);
                                    x80Var = x80Var5;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            x80 J2 = RecyclerView.J(view);
                            s6 s6Var = recyclerView.j;
                            mb mbVar = (mb) s6Var.c;
                            int indexOfChild = ((w70) s6Var.b).a.indexOfChild(view);
                            if (indexOfChild < 0) {
                                s9.v(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!mbVar.d(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            mbVar.a(indexOfChild);
                            s6Var.x(view);
                            s6 s6Var2 = recyclerView.j;
                            mb mbVar2 = (mb) s6Var2.c;
                            int indexOfChild2 = ((w70) s6Var2.b).a.indexOfChild(view);
                            int b2 = (indexOfChild2 == -1 || mbVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - mbVar2.b(indexOfChild2);
                            if (b2 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + J2 + recyclerView.z());
                            }
                            recyclerView.j.d(b2);
                            i(view);
                            J2.a(8224);
                            x80Var = J2;
                        }
                        if (x80Var != null) {
                            if (x80Var.i()) {
                                z6 = u80Var.g;
                            } else {
                                int i9 = x80Var.c;
                                if (i9 < 0 || i9 >= recyclerView.q.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + x80Var + recyclerView.z());
                                }
                                if (!u80Var.g) {
                                    recyclerView.q.getClass();
                                }
                                z70 z70Var = recyclerView.q;
                                if (!z70Var.b || x80Var.e == z70Var.b(x80Var.c)) {
                                    z6 = z2;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                z = z2;
                            } else {
                                x80Var.a(4);
                                if (x80Var.j()) {
                                    recyclerView.removeDetachedView(x80Var.a, false);
                                    x80Var.n.k(x80Var);
                                } else if (x80Var.q()) {
                                    x80Var.j &= -33;
                                }
                                h(x80Var);
                                x80Var = null;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (x80Var != null) {
                        int g2 = recyclerView.i.g(i, 0);
                        if (g2 >= 0) {
                            j2 = 3;
                            if (g2 < recyclerView.q.a()) {
                                recyclerView.q.getClass();
                                z70 z70Var2 = recyclerView.q;
                                if (z70Var2.b) {
                                    long b3 = z70Var2.b(g2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            j3 = 4;
                                            x80 x80Var6 = (x80) arrayList2.get(size5);
                                            i3 = g2;
                                            long j5 = x80Var6.e;
                                            View view2 = x80Var6.a;
                                            if (j5 == b3 && !x80Var6.q()) {
                                                if (x80Var6.f == 0) {
                                                    x80Var6.a(32);
                                                    if (x80Var6.i() && !u80Var.g) {
                                                        x80Var6.j = (x80Var6.j & (-15)) | 2;
                                                    }
                                                    x80Var = x80Var6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    x80 J3 = RecyclerView.J(view2);
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
                                            j3 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                x80 x80Var7 = (x80) arrayList3.get(size6);
                                                if (x80Var7.e != b3 || x80Var7.e()) {
                                                    size6--;
                                                } else if (x80Var7.f == 0) {
                                                    arrayList3.remove(size6);
                                                    x80Var = x80Var7;
                                                } else {
                                                    f(size6);
                                                }
                                            }
                                            x80Var = null;
                                        }
                                    }
                                    if (x80Var != null) {
                                        x80Var.c = i3;
                                        z = z2;
                                    }
                                } else {
                                    j3 = 4;
                                }
                                if (x80Var == null) {
                                    m80 m80Var = (m80) c().a.get(0);
                                    if (m80Var != null) {
                                        ArrayList arrayList5 = m80Var.a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((x80) arrayList5.get(size7)).e()) {
                                                    x80Var2 = (x80) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    x80Var2 = null;
                                    if (x80Var2 != null) {
                                        x80Var2.n();
                                        int[] iArr = RecyclerView.E0;
                                    }
                                    x80Var = x80Var2;
                                }
                                if (x80Var == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j6 = this.g.a(0).c;
                                        if (!((j6 == 0 || j6 + nanoTime < j) ? z2 : false)) {
                                            return null;
                                        }
                                    }
                                    z70 z70Var3 = recyclerView.q;
                                    z70Var3.getClass();
                                    try {
                                        int i10 = bj0.a;
                                        Trace.beginSection("RV CreateView");
                                        x80Var = z70Var3.d(recyclerView);
                                        View view3 = x80Var.a;
                                        if (view3.getParent() != null) {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                        x80Var.f = 0;
                                        Trace.endSection();
                                        int[] iArr2 = RecyclerView.E0;
                                        RecyclerView E = RecyclerView.E(view3);
                                        if (E != null) {
                                            x80Var.b = new WeakReference(E);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        m80 a = this.g.a(0);
                                        long j7 = a.c;
                                        if (j7 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j7 / j3) * 3);
                                        }
                                        a.c = nanoTime2;
                                    } finally {
                                        int i11 = bj0.a;
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g2 + ").state:" + u80Var.b() + recyclerView.z());
                    }
                    j2 = 3;
                    j3 = 4;
                    View view4 = x80Var.a;
                    if (z && !u80Var.g) {
                        i2 = x80Var.j;
                        if ((i2 & 8192) == 0 ? z2 : false) {
                            x80Var.j = i2 & (-8193);
                            if (u80Var.j) {
                                d80.b(x80Var);
                                d80 d80Var = recyclerView.Q;
                                x80Var.d();
                                d80Var.getClass();
                                t30 t30Var = new t30();
                                t30Var.a(x80Var);
                                recyclerView.V(x80Var, t30Var);
                            }
                        }
                    }
                    if (u80Var.g || !x80Var.f()) {
                        if (x80Var.f()) {
                            if (!((x80Var.j & 2) != 0 ? z2 : false)) {
                            }
                        }
                        int g3 = recyclerView.i.g(i, 0);
                        x80Var.s = null;
                        x80Var.r = recyclerView;
                        int i12 = x80Var.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j8 = this.g.a(i12).d;
                            if (j8 != 0) {
                            }
                        }
                        z70 z70Var4 = recyclerView.q;
                        z70Var4.getClass();
                        z3 = x80Var.s != null ? z2 : false;
                        if (z3) {
                            x80Var.c = g3;
                            if (z70Var4.b) {
                                x80Var.e = z70Var4.b(g3);
                            }
                            x80Var.j = (x80Var.j & (-520)) | 1;
                            int i13 = bj0.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        x80Var.s = z70Var4;
                        x80Var.d();
                        z70Var4.c(x80Var, g3);
                        if (z3) {
                            ArrayList arrayList6 = x80Var.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            x80Var.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof i80) {
                                ((i80) layoutParams2).c = z2;
                            }
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        m80 a2 = this.g.a(x80Var.f);
                        j4 = a2.d;
                        if (j4 != 0) {
                            nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        accessibilityManager = recyclerView.F;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = hm0.a;
                            z4 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            z80 z80Var = recyclerView.s0;
                            if (z80Var != null) {
                                y80 y80Var = z80Var.e;
                                if (y80Var != null) {
                                    View.AccessibilityDelegate d = hm0.d(view4);
                                    a0 a0Var = d == null ? null : d instanceof z ? ((z) d).a : new a0(d);
                                    if (a0Var != null && a0Var != y80Var) {
                                        y80Var.e.put(view4, a0Var);
                                    }
                                }
                                hm0.m(view4, y80Var);
                            }
                        }
                        if (u80Var.g) {
                            x80Var.g = i;
                        }
                        z5 = z4;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams == null) {
                            i80Var = (i80) recyclerView.generateDefaultLayoutParams();
                            view4.setLayoutParams(i80Var);
                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                            i80Var = (i80) layoutParams;
                        } else {
                            i80Var = (i80) recyclerView.generateLayoutParams(layoutParams);
                            view4.setLayoutParams(i80Var);
                        }
                        i80Var.a = x80Var;
                        if (z || !z5) {
                            z4 = false;
                        }
                        i80Var.d = z4;
                        return x80Var;
                    }
                    x80Var.g = i;
                    z5 = false;
                    z4 = z2;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    i80Var.a = x80Var;
                    if (z) {
                    }
                    z4 = false;
                    i80Var.d = z4;
                    return x80Var;
                }
            }
            x80Var = null;
            if (x80Var != null) {
            }
        } else {
            x80Var = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (x80Var != null) {
        }
        if (x80Var != null) {
        }
        View view42 = x80Var.a;
        if (z) {
            i2 = x80Var.j;
            if ((i2 & 8192) == 0 ? z2 : false) {
            }
        }
        if (u80Var.g) {
        }
        if (x80Var.f()) {
        }
        int g32 = recyclerView.i.g(i, 0);
        x80Var.s = null;
        x80Var.r = recyclerView;
        int i122 = x80Var.f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        z70 z70Var42 = recyclerView.q;
        z70Var42.getClass();
        if (x80Var.s != null) {
        }
        if (z3) {
        }
        x80Var.s = z70Var42;
        x80Var.d();
        z70Var42.c(x80Var, g32);
        if (z3) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        m80 a22 = this.g.a(x80Var.f);
        j4 = a22.d;
        if (j4 != 0) {
        }
        a22.d = nanoTime42;
        accessibilityManager = recyclerView.F;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (u80Var.g) {
        }
        z5 = z4;
        layoutParams = view42.getLayoutParams();
        if (layoutParams == null) {
        }
        i80Var.a = x80Var;
        if (z) {
        }
        z4 = false;
        i80Var.d = z4;
        return x80Var;
    }

    public final void k(x80 x80Var) {
        if (x80Var.o) {
            this.b.remove(x80Var);
        } else {
            this.a.remove(x80Var);
        }
        x80Var.n = null;
        x80Var.o = false;
        x80Var.j &= -33;
    }

    public final void l() {
        h80 h80Var = this.h.r;
        this.f = this.e + (h80Var != null ? h80Var.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
