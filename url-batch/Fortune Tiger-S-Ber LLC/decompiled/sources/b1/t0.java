package b1;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f917a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f918b;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final List f919d;

    /* renamed from: e, reason: collision with root package name */
    public int f920e;

    /* renamed from: f, reason: collision with root package name */
    public int f921f;
    public s0 g;
    public final /* synthetic */ RecyclerView h;

    public t0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f917a = arrayList;
        this.f918b = null;
        this.c = new ArrayList();
        this.f919d = Collections.unmodifiableList(arrayList);
        this.f920e = 2;
        this.f921f = 2;
    }

    public final void a(c1 c1Var, boolean z3) {
        RecyclerView.j(c1Var);
        View view = c1Var.f747a;
        RecyclerView recyclerView = this.h;
        e1 e1Var = recyclerView.f654r0;
        if (e1Var != null) {
            d1 d1Var = e1Var.f774e;
            k0.j0.m(view, d1Var != null ? (k0.b) d1Var.f766e.remove(view) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f655s;
            if (arrayList.size() > 0) {
                throw androidx.fragment.app.w0.d(arrayList, 0);
            }
            if (recyclerView.f640k0 != null) {
                recyclerView.f639k.I(c1Var);
            }
        }
        c1Var.f762s = null;
        c1Var.f761r = null;
        s0 c = c();
        c.getClass();
        int i4 = c1Var.f751f;
        ArrayList arrayList2 = c.a(i4).f902a;
        if (((r0) c.f911a.get(i4)).f903b <= arrayList2.size()) {
            return;
        }
        c1Var.m();
        arrayList2.add(c1Var);
    }

    public final int b(int i4) {
        RecyclerView recyclerView = this.h;
        if (i4 >= 0 && i4 < recyclerView.f640k0.b()) {
            return !recyclerView.f640k0.g ? i4 : recyclerView.f635i.g(i4, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + recyclerView.f640k0.b() + recyclerView.y());
    }

    public final s0 c() {
        if (this.g == null) {
            s0 s0Var = new s0();
            s0Var.f911a = new SparseArray();
            s0Var.f912b = 0;
            this.g = s0Var;
        }
        return this.g;
    }

    public final View d(int i4) {
        return j(i4, Long.MAX_VALUE).f747a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        o oVar = this.h.f638j0;
        int[] iArr2 = oVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        oVar.f888d = 0;
    }

    public final void f(int i4) {
        ArrayList arrayList = this.c;
        a((c1) arrayList.get(i4), true);
        arrayList.remove(i4);
    }

    public final void g(View view) {
        c1 I = RecyclerView.I(view);
        boolean j4 = I.j();
        RecyclerView recyclerView = this.h;
        if (j4) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.f757n.k(I);
        } else if (I.p()) {
            I.f753j &= -33;
        }
        h(I);
        if (recyclerView.P == null || I.g()) {
            return;
        }
        recyclerView.P.d(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(c1 c1Var) {
        boolean z3;
        boolean z4;
        RecyclerView recyclerView = this.h;
        o oVar = recyclerView.f638j0;
        boolean i4 = c1Var.i();
        View view = c1Var.f747a;
        boolean z5 = true;
        if (i4 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(c1Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (c1Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c1Var + recyclerView.y());
        }
        if (c1Var.o()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((c1Var.f753j & 16) == 0) {
            WeakHashMap weakHashMap = k0.j0.f2752a;
            if (view.hasTransientState()) {
                z3 = true;
                if (c1Var.g()) {
                    z5 = false;
                } else {
                    if (this.f921f <= 0 || (c1Var.f753j & 526) != 0) {
                        z4 = false;
                    } else {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f921f && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.D0;
                        if (size > 0) {
                            int i5 = c1Var.c;
                            if (oVar.c != null) {
                                int i6 = oVar.f888d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (oVar.c[i7] == i5) {
                                        break;
                                    }
                                }
                            }
                            int i8 = size - 1;
                            loop1: while (i8 >= 0) {
                                int i9 = ((c1) arrayList.get(i8)).c;
                                if (oVar.c == null) {
                                    break;
                                }
                                int i10 = oVar.f888d * 2;
                                for (int i11 = 0; i11 < i10; i11 += 2) {
                                    if (oVar.c[i11] == i9) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i8 + 1;
                        }
                        arrayList.add(size, c1Var);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(c1Var, true);
                    }
                    r4 = z4;
                }
                recyclerView.f639k.I(c1Var);
                if (r4 && !z5 && z3) {
                    c1Var.f762s = null;
                    c1Var.f761r = null;
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (c1Var.g()) {
        }
        recyclerView.f639k.I(c1Var);
        if (r4) {
        }
    }

    public final void i(View view) {
        j0 j0Var;
        c1 I = RecyclerView.I(view);
        int i4 = I.f753j & 12;
        RecyclerView recyclerView = this.h;
        if (i4 == 0 && I.k() && (j0Var = recyclerView.P) != null) {
            j jVar = (j) j0Var;
            if (I.c().isEmpty() && jVar.g && !I.f()) {
                if (this.f918b == null) {
                    this.f918b = new ArrayList();
                }
                I.f757n = this;
                I.f758o = true;
                this.f918b.add(I);
                return;
            }
        }
        if (I.f() && !I.h() && !recyclerView.f651q.f772b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I.f757n = this;
        I.f758o = false;
        this.f917a.add(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0435, code lost:
    
        if (r10.f() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0461, code lost:
    
        if ((r13 + r11) >= r28) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d3, code lost:
    
        if (r10.f751f != 0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0080  */
    /* JADX WARN: Type inference failed for: r11v4, types: [k0.b] */
    /* JADX WARN: Type inference failed for: r9v10, types: [k0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c1 j(int i4, long j4) {
        boolean z3;
        c1 c1Var;
        boolean z4;
        long j5;
        long j6;
        boolean z5;
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        o0 o0Var;
        c1 c1Var2;
        int i5;
        View view;
        boolean z7;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        z0 z0Var = recyclerView.f640k0;
        if (i4 < 0 || i4 >= z0Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + z0Var.b() + recyclerView.y());
        }
        if (z0Var.g) {
            ArrayList arrayList = this.f918b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        c1Var = (c1) this.f918b.get(i6);
                        if (!c1Var.p() && c1Var.b() == i4) {
                            c1Var.a(32);
                            break;
                        }
                        i6++;
                    } else if (recyclerView.f651q.f772b && (g = recyclerView.f635i.g(i4, 0)) > 0 && g < recyclerView.f651q.a()) {
                        long b2 = recyclerView.f651q.b(g);
                        for (int i7 = 0; i7 < size; i7++) {
                            c1 c1Var3 = (c1) this.f918b.get(i7);
                            if (!c1Var3.p() && c1Var3.f750e == b2) {
                                c1Var3.a(32);
                                c1Var = c1Var3;
                                break;
                            }
                        }
                    }
                }
                z3 = c1Var == null;
            }
            c1Var = null;
            if (c1Var == null) {
            }
        } else {
            z3 = false;
            c1Var = null;
        }
        ArrayList arrayList2 = this.f917a;
        ArrayList arrayList3 = this.c;
        if (c1Var == null) {
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                c1 c1Var4 = (c1) arrayList2.get(i8);
                if (!c1Var4.p() && c1Var4.b() == i4 && !c1Var4.f() && (z0Var.g || !c1Var4.h())) {
                    c1Var4.a(32);
                    c1Var = c1Var4;
                    z4 = true;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.f637j.f358d;
            int size3 = arrayList4.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size3) {
                    z4 = true;
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i9);
                c1 I = RecyclerView.I(view);
                z4 = true;
                if (I.b() == i4 && !I.f() && !I.h()) {
                    break;
                }
                i9++;
            }
            if (view == null) {
                int size4 = arrayList3.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        c1Var = null;
                        break;
                    }
                    c1 c1Var5 = (c1) arrayList3.get(i10);
                    if (!c1Var5.f() && c1Var5.b() == i4 && !c1Var5.d()) {
                        arrayList3.remove(i10);
                        c1Var = c1Var5;
                        break;
                    }
                    i10++;
                }
            } else {
                c1 I2 = RecyclerView.I(view);
                androidx.emoji2.text.s sVar = recyclerView.f637j;
                c cVar = (c) sVar.c;
                int indexOfChild = ((d0) sVar.f357b).f764a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.a(indexOfChild);
                sVar.v(view);
                androidx.emoji2.text.s sVar2 = recyclerView.f637j;
                c cVar2 = (c) sVar2.c;
                int indexOfChild2 = ((d0) sVar2.f357b).f764a.indexOfChild(view);
                int b4 = (indexOfChild2 == -1 || cVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.b(indexOfChild2);
                if (b4 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I2 + recyclerView.y());
                }
                recyclerView.f637j.d(b4);
                i(view);
                I2.a(8224);
                c1Var = I2;
            }
            if (c1Var != null) {
                if (c1Var.h()) {
                    z7 = z0Var.g;
                } else {
                    int i11 = c1Var.c;
                    if (i11 < 0 || i11 >= recyclerView.f651q.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c1Var + recyclerView.y());
                    }
                    if (!z0Var.g) {
                        recyclerView.f651q.getClass();
                    }
                    e0 e0Var = recyclerView.f651q;
                    if (!e0Var.f772b || c1Var.f750e == e0Var.b(c1Var.c)) {
                        z7 = z4;
                    }
                    z7 = false;
                }
                if (z7) {
                    z3 = z4;
                } else {
                    c1Var.a(4);
                    if (c1Var.i()) {
                        recyclerView.removeDetachedView(c1Var.f747a, false);
                        c1Var.f757n.k(c1Var);
                    } else if (c1Var.p()) {
                        c1Var.f753j &= -33;
                    }
                    h(c1Var);
                    c1Var = null;
                }
            }
        } else {
            z4 = true;
        }
        if (c1Var == null) {
            int g4 = recyclerView.f635i.g(i4, 0);
            if (g4 >= 0) {
                j5 = 3;
                if (g4 < recyclerView.f651q.a()) {
                    recyclerView.f651q.getClass();
                    e0 e0Var2 = recyclerView.f651q;
                    if (e0Var2.f772b) {
                        long b5 = e0Var2.b(g4);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j6 = 4;
                                c1 c1Var6 = (c1) arrayList2.get(size5);
                                i5 = g4;
                                long j7 = c1Var6.f750e;
                                View view2 = c1Var6.f747a;
                                if (j7 == b5 && !c1Var6.p()) {
                                    if (c1Var6.f751f == 0) {
                                        c1Var6.a(32);
                                        if (c1Var6.h() && !z0Var.g) {
                                            c1Var6.f753j = (c1Var6.f753j & (-15)) | 2;
                                        }
                                        c1Var = c1Var6;
                                    } else {
                                        arrayList2.remove(size5);
                                        recyclerView.removeDetachedView(view2, false);
                                        c1 I3 = RecyclerView.I(view2);
                                        I3.f757n = null;
                                        I3.f758o = false;
                                        I3.f753j &= -33;
                                        h(I3);
                                    }
                                }
                                size5--;
                                g4 = i5;
                            } else {
                                i5 = g4;
                                j6 = 4;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    c1 c1Var7 = (c1) arrayList3.get(size6);
                                    if (c1Var7.f750e != b5 || c1Var7.d()) {
                                        size6--;
                                    } else if (c1Var7.f751f == 0) {
                                        arrayList3.remove(size6);
                                        c1Var = c1Var7;
                                    } else {
                                        f(size6);
                                    }
                                }
                                c1Var = null;
                            }
                        }
                        if (c1Var != null) {
                            c1Var.c = i5;
                            z3 = z4;
                        }
                    } else {
                        j6 = 4;
                    }
                    if (c1Var == null) {
                        r0 r0Var = (r0) c().f911a.get(0);
                        if (r0Var != null) {
                            ArrayList arrayList5 = r0Var.f902a;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((c1) arrayList5.get(size7)).d()) {
                                        c1Var2 = (c1) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        c1Var2 = null;
                        if (c1Var2 != null) {
                            c1Var2.m();
                            int[] iArr = RecyclerView.D0;
                        }
                        c1Var = c1Var2;
                    }
                    if (c1Var == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j4 != Long.MAX_VALUE) {
                            long j8 = this.g.a(0).c;
                            if (!((j8 == 0 || j8 + nanoTime < j4) ? z4 : false)) {
                                return null;
                            }
                        }
                        e0 e0Var3 = recyclerView.f651q;
                        e0Var3.getClass();
                        try {
                            int i12 = g0.f.f1759a;
                            Trace.beginSection("RV CreateView");
                            c1Var = e0Var3.d(recyclerView);
                            View view3 = c1Var.f747a;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            c1Var.f751f = 0;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.D0;
                            RecyclerView D = RecyclerView.D(view3);
                            if (D != null) {
                                c1Var.f748b = new WeakReference(D);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            r0 a4 = this.g.a(0);
                            long j9 = a4.c;
                            if (j9 != 0) {
                                nanoTime2 = (nanoTime2 / j6) + ((j9 / j6) * 3);
                            }
                            a4.c = nanoTime2;
                        } finally {
                            int i13 = g0.f.f1759a;
                            Trace.endSection();
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + g4 + ").state:" + z0Var.b() + recyclerView.y());
        }
        j5 = 3;
        j6 = 4;
        View view4 = c1Var.f747a;
        if (z3 && !z0Var.g) {
            int i14 = c1Var.f753j;
            if ((i14 & 8192) != 0 ? z4 : false) {
                c1Var.f753j = i14 & (-8193);
                if (z0Var.f962j) {
                    j0.b(c1Var);
                    j0 j0Var = recyclerView.P;
                    c1Var.c();
                    j0Var.getClass();
                    i0 i0Var = new i0();
                    i0Var.a(c1Var);
                    recyclerView.U(c1Var, i0Var);
                }
            }
        }
        if (!z0Var.g || !c1Var.e()) {
            if (c1Var.e()) {
                if (!((c1Var.f753j & 2) != 0 ? z4 : false)) {
                }
            }
            int g5 = recyclerView.f635i.g(i4, 0);
            c1Var.f762s = null;
            c1Var.f761r = recyclerView;
            int i15 = c1Var.f751f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j4 != Long.MAX_VALUE) {
                long j10 = this.g.a(i15).f904d;
                if (j10 != 0) {
                }
            }
            e0 e0Var4 = recyclerView.f651q;
            e0Var4.getClass();
            boolean z8 = c1Var.f762s == null ? z4 : false;
            if (z8) {
                c1Var.c = g5;
                if (e0Var4.f772b) {
                    c1Var.f750e = e0Var4.b(g5);
                }
                c1Var.f753j = (c1Var.f753j & (-520)) | 1;
                int i16 = g0.f.f1759a;
                Trace.beginSection("RV OnBindView");
            }
            c1Var.f762s = e0Var4;
            c1Var.c();
            e0Var4.c(c1Var, g5);
            if (z8) {
                ArrayList arrayList6 = c1Var.f754k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                c1Var.f753j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof o0) {
                    ((o0) layoutParams2).c = z4;
                }
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            r0 a5 = this.g.a(c1Var.f751f);
            long j11 = a5.f904d;
            if (j11 != 0) {
                nanoTime4 = (nanoTime4 / j6) + ((j11 / j6) * j5);
            }
            a5.f904d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.F;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = k0.j0.f2752a;
                z5 = true;
                if (view4.getImportantForAccessibility() == 0) {
                    view4.setImportantForAccessibility(1);
                }
                e1 e1Var = recyclerView.f654r0;
                if (e1Var != null) {
                    d1 d1Var = e1Var.f774e;
                    if (d1Var != null) {
                        View.AccessibilityDelegate d4 = k0.j0.d(view4);
                        d1 bVar = d4 != null ? d4 instanceof k0.a ? ((k0.a) d4).f2711a : new k0.b(d4) : null;
                        if (bVar != null && bVar != d1Var) {
                            d1Var.f766e.put(view4, bVar);
                        }
                    }
                    k0.j0.m(view4, d1Var);
                }
            } else {
                z5 = true;
            }
            if (z0Var.g) {
                c1Var.g = i4;
            }
            z6 = z5;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                o0Var = (o0) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(o0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                o0Var = (o0) layoutParams;
            } else {
                o0Var = (o0) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(o0Var);
            }
            o0Var.f889a = c1Var;
            if (z3 || !z6) {
                z5 = false;
            }
            o0Var.f891d = z5;
            return c1Var;
        }
        c1Var.g = i4;
        z6 = false;
        z5 = z4;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        o0Var.f889a = c1Var;
        if (z3) {
        }
        z5 = false;
        o0Var.f891d = z5;
        return c1Var;
    }

    public final void k(c1 c1Var) {
        if (c1Var.f758o) {
            this.f918b.remove(c1Var);
        } else {
            this.f917a.remove(c1Var);
        }
        c1Var.f757n = null;
        c1Var.f758o = false;
        c1Var.f753j &= -33;
    }

    public final void l() {
        n0 n0Var = this.h.f653r;
        this.f921f = this.f920e + (n0Var != null ? n0Var.f880j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f921f; size--) {
            f(size);
        }
    }
}
