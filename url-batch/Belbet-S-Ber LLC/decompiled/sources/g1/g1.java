package g1;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1665a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1666b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1667c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f1668e;

    /* renamed from: f, reason: collision with root package name */
    public int f1669f;

    /* renamed from: g, reason: collision with root package name */
    public f1 f1670g;
    public final /* synthetic */ RecyclerView h;

    public g1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1665a = arrayList;
        this.f1666b = null;
        this.f1667c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f1668e = 2;
        this.f1669f = 2;
    }

    public final void a(q1 q1Var, boolean z4) {
        RecyclerView.l(q1Var);
        View view = q1Var.f1768a;
        RecyclerView recyclerView = this.h;
        s1 s1Var = recyclerView.f789s0;
        if (s1Var != null) {
            r1 r1Var = s1Var.f1791e;
            n0.p0.m(view, r1Var != null ? (n0.b) r1Var.f1787e.remove(view) : null);
        }
        if (z4) {
            ArrayList arrayList = recyclerView.f790t;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f775l0 != null) {
                recyclerView.f774l.I(q1Var);
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + q1Var);
            }
        }
        q1Var.f1783s = null;
        q1Var.f1782r = null;
        f1 c5 = c();
        c5.getClass();
        int i = q1Var.f1772f;
        ArrayList arrayList2 = c5.a(i).f1643a;
        if (((e1) c5.f1657a.get(i)).f1644b <= arrayList2.size()) {
            r1.b.b(view);
        } else {
            if (RecyclerView.G0 && arrayList2.contains(q1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            q1Var.m();
            arrayList2.add(q1Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f775l0.b()) {
            return !recyclerView.f775l0.f1725g ? i : recyclerView.f770j.h(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f775l0.b() + recyclerView.B());
    }

    public final f1 c() {
        if (this.f1670g == null) {
            f1 f1Var = new f1();
            f1Var.f1657a = new SparseArray();
            f1Var.f1658b = 0;
            f1Var.f1659c = Collections.newSetFromMap(new IdentityHashMap());
            this.f1670g = f1Var;
            e();
        }
        return this.f1670g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).f1768a;
    }

    public final void e() {
        RecyclerView recyclerView;
        q0 q0Var;
        f1 f1Var = this.f1670g;
        if (f1Var == null || (q0Var = (recyclerView = this.h).f786r) == null || !recyclerView.f798x) {
            return;
        }
        f1Var.f1659c.add(q0Var);
    }

    public final void f(q0 q0Var, boolean z4) {
        f1 f1Var = this.f1670g;
        if (f1Var != null) {
            SparseArray sparseArray = f1Var.f1657a;
            Set set = f1Var.f1659c;
            set.remove(q0Var);
            if (set.size() != 0 || z4) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((e1) sparseArray.get(sparseArray.keyAt(i))).f1643a;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    r1.b.b(((q1) arrayList.get(i4)).f1768a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1667c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.L0) {
            y yVar = this.h.f773k0;
            int[] iArr = yVar.f1853c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            yVar.d = 0;
        }
    }

    public final void h(int i) {
        if (RecyclerView.H0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f1667c;
        q1 q1Var = (q1) arrayList.get(i);
        if (RecyclerView.H0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + q1Var);
        }
        a(q1Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        q1 M = RecyclerView.M(view);
        boolean j2 = M.j();
        RecyclerView recyclerView = this.h;
        if (j2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (M.i()) {
            M.f1778n.m(M);
        } else if (M.p()) {
            M.f1774j &= -33;
        }
        j(M);
        if (recyclerView.Q == null || M.g()) {
            return;
        }
        recyclerView.Q.d(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(q1 q1Var) {
        boolean z4;
        boolean z5;
        boolean z6;
        RecyclerView recyclerView = this.h;
        y yVar = recyclerView.f773k0;
        boolean i = q1Var.i();
        View view = q1Var.f1768a;
        boolean z7 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(q1Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (q1Var.j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(q1Var);
            throw new IllegalArgumentException(a4.b.e(recyclerView, sb2));
        }
        if (q1Var.o()) {
            throw new IllegalArgumentException(a4.b.e(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((q1Var.f1774j & 16) == 0) {
            WeakHashMap weakHashMap = n0.p0.f2816a;
            if (view.hasTransientState()) {
                z4 = true;
                z5 = RecyclerView.G0;
                ArrayList arrayList = this.f1667c;
                if (!z5 && arrayList.contains(q1Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(q1Var);
                    throw new IllegalArgumentException(a4.b.e(recyclerView, sb3));
                }
                if (q1Var.g()) {
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z7 = false;
                } else {
                    if (this.f1669f <= 0 || (q1Var.f1774j & 526) != 0) {
                        z6 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f1669f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.L0 && size > 0) {
                            int i4 = q1Var.f1770c;
                            if (yVar.f1853c != null) {
                                int i5 = yVar.d * 2;
                                for (int i6 = 0; i6 < i5; i6 += 2) {
                                    if (yVar.f1853c[i6] == i4) {
                                        break;
                                    }
                                }
                            }
                            int i7 = size - 1;
                            loop1: while (i7 >= 0) {
                                int i8 = ((q1) arrayList.get(i7)).f1770c;
                                if (yVar.f1853c == null) {
                                    break;
                                }
                                int i9 = yVar.d * 2;
                                for (int i10 = 0; i10 < i9; i10 += 2) {
                                    if (yVar.f1853c[i10] == i8) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i7 + 1;
                        }
                        arrayList.add(size, q1Var);
                        z6 = true;
                    }
                    if (z6) {
                        z7 = false;
                    } else {
                        a(q1Var, true);
                    }
                    r4 = z6;
                }
                recyclerView.f774l.I(q1Var);
                if (r4 && !z7 && z4) {
                    r1.b.b(view);
                    q1Var.f1783s = null;
                    q1Var.f1782r = null;
                    return;
                }
                return;
            }
        }
        z4 = false;
        z5 = RecyclerView.G0;
        ArrayList arrayList2 = this.f1667c;
        if (!z5) {
        }
        if (q1Var.g()) {
        }
        recyclerView.f774l.I(q1Var);
        if (r4) {
        }
    }

    public final void k(View view) {
        w0 w0Var;
        q1 M = RecyclerView.M(view);
        int i = M.f1774j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && M.k() && (w0Var = recyclerView.Q) != null) {
            o oVar = (o) w0Var;
            if (M.c().isEmpty() && oVar.f1738g && !M.f()) {
                if (this.f1666b == null) {
                    this.f1666b = new ArrayList();
                }
                M.f1778n = this;
                M.f1779o = true;
                this.f1666b.add(M);
                return;
            }
        }
        if (M.f() && !M.h() && !recyclerView.f786r.f1765b) {
            throw new IllegalArgumentException(a4.b.e(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        M.f1778n = this;
        M.f1779o = false;
        this.f1665a.add(M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x0494, code lost:
    
        if (r10.f() == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fc, code lost:
    
        if (r10.f1772f != 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0659 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1 l(int i, long j2) {
        boolean z4;
        q1 q1Var;
        boolean z5;
        long j4;
        long j5;
        boolean z6;
        boolean z7;
        boolean z8;
        ViewGroup.LayoutParams layoutParams;
        b1 b1Var;
        RecyclerView G;
        q1 q1Var2;
        int i4;
        View view;
        boolean z9;
        int size;
        int h;
        RecyclerView recyclerView = this.h;
        m1 m1Var = recyclerView.f775l0;
        if (i < 0 || i >= m1Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + m1Var.b() + recyclerView.B());
        }
        if (m1Var.f1725g) {
            ArrayList arrayList = this.f1666b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        q1Var = (q1) this.f1666b.get(i5);
                        if (!q1Var.p() && q1Var.b() == i) {
                            q1Var.a(32);
                            break;
                        }
                        i5++;
                    } else if (recyclerView.f786r.f1765b && (h = recyclerView.f770j.h(i, 0)) > 0 && h < recyclerView.f786r.a()) {
                        long b2 = recyclerView.f786r.b(h);
                        for (int i6 = 0; i6 < size; i6++) {
                            q1 q1Var3 = (q1) this.f1666b.get(i6);
                            if (!q1Var3.p() && q1Var3.f1771e == b2) {
                                q1Var3.a(32);
                                q1Var = q1Var3;
                                break;
                            }
                        }
                    }
                }
                z4 = q1Var == null;
            }
            q1Var = null;
            if (q1Var == null) {
            }
        } else {
            z4 = false;
            q1Var = null;
        }
        ArrayList arrayList2 = this.f1665a;
        ArrayList arrayList3 = this.f1667c;
        if (q1Var == null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                q1 q1Var4 = (q1) arrayList2.get(i7);
                if (!q1Var4.p() && q1Var4.b() == i && !q1Var4.f() && (m1Var.f1725g || !q1Var4.h())) {
                    q1Var4.a(32);
                    q1Var = q1Var4;
                    z5 = true;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f772k.f1673c;
            int size3 = arrayList4.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    z5 = true;
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i8);
                q1 M = RecyclerView.M(view);
                z5 = true;
                if (M.b() == i && !M.f() && !M.h()) {
                    break;
                }
                i8++;
            }
            if (view == null) {
                int size4 = arrayList3.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        q1Var = null;
                        break;
                    }
                    q1 q1Var5 = (q1) arrayList3.get(i9);
                    if (q1Var5.f() || q1Var5.b() != i || q1Var5.d()) {
                        i9++;
                    } else {
                        arrayList3.remove(i9);
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + q1Var5);
                        }
                        q1Var = q1Var5;
                    }
                }
            } else {
                q1 M2 = RecyclerView.M(view);
                h hVar = recyclerView.f772k;
                g gVar = hVar.f1672b;
                int indexOfChild = hVar.f1671a.f1752a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!gVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                gVar.a(indexOfChild);
                hVar.j(view);
                h hVar2 = recyclerView.f772k;
                g gVar2 = hVar2.f1672b;
                int indexOfChild2 = hVar2.f1671a.f1752a.indexOfChild(view);
                int b5 = (indexOfChild2 == -1 || gVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - gVar2.b(indexOfChild2);
                if (b5 == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(M2);
                    throw new IllegalStateException(a4.b.e(recyclerView, sb));
                }
                recyclerView.f772k.c(b5);
                k(view);
                M2.a(8224);
                q1Var = M2;
            }
            if (q1Var != null) {
                if (!q1Var.h()) {
                    int i10 = q1Var.f1770c;
                    if (i10 < 0 || i10 >= recyclerView.f786r.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(q1Var);
                        throw new IndexOutOfBoundsException(a4.b.e(recyclerView, sb2));
                    }
                    if (!m1Var.f1725g) {
                        recyclerView.f786r.getClass();
                    }
                    q0 q0Var = recyclerView.f786r;
                    if (!q0Var.f1765b || q1Var.f1771e == q0Var.b(q1Var.f1770c)) {
                        z9 = z5;
                    }
                    z9 = false;
                } else {
                    if (RecyclerView.G0 && !m1Var.f1725g) {
                        throw new IllegalStateException(a4.b.e(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z9 = m1Var.f1725g;
                }
                if (z9) {
                    z4 = z5;
                } else {
                    q1Var.a(4);
                    if (q1Var.i()) {
                        recyclerView.removeDetachedView(q1Var.f1768a, false);
                        q1Var.f1778n.m(q1Var);
                    } else if (q1Var.p()) {
                        q1Var.f1774j &= -33;
                    }
                    j(q1Var);
                    q1Var = null;
                }
            }
        } else {
            z5 = true;
        }
        if (q1Var == null) {
            int h5 = recyclerView.f770j.h(i, 0);
            if (h5 >= 0) {
                j4 = 3;
                if (h5 < recyclerView.f786r.a()) {
                    recyclerView.f786r.getClass();
                    q0 q0Var2 = recyclerView.f786r;
                    if (q0Var2.f1765b) {
                        long b6 = q0Var2.b(h5);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j5 = 4;
                                q1 q1Var6 = (q1) arrayList2.get(size5);
                                i4 = h5;
                                long j6 = q1Var6.f1771e;
                                View view2 = q1Var6.f1768a;
                                if (j6 == b6 && !q1Var6.p()) {
                                    if (q1Var6.f1772f == 0) {
                                        q1Var6.a(32);
                                        if (q1Var6.h() && !m1Var.f1725g) {
                                            q1Var6.f1774j = (q1Var6.f1774j & (-15)) | 2;
                                        }
                                        q1Var = q1Var6;
                                    } else {
                                        arrayList2.remove(size5);
                                        recyclerView.removeDetachedView(view2, false);
                                        q1 M3 = RecyclerView.M(view2);
                                        M3.f1778n = null;
                                        M3.f1779o = false;
                                        M3.f1774j &= -33;
                                        j(M3);
                                    }
                                }
                                size5--;
                                h5 = i4;
                            } else {
                                i4 = h5;
                                j5 = 4;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    q1 q1Var7 = (q1) arrayList3.get(size6);
                                    if (q1Var7.f1771e != b6 || q1Var7.d()) {
                                        size6--;
                                    } else if (q1Var7.f1772f == 0) {
                                        arrayList3.remove(size6);
                                        q1Var = q1Var7;
                                    } else {
                                        h(size6);
                                    }
                                }
                                q1Var = null;
                            }
                        }
                        if (q1Var != null) {
                            q1Var.f1770c = i4;
                            z4 = z5;
                        }
                    } else {
                        j5 = 4;
                    }
                    if (q1Var == null) {
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        e1 e1Var = (e1) c().f1657a.get(0);
                        if (e1Var != null) {
                            ArrayList arrayList5 = e1Var.f1643a;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((q1) arrayList5.get(size7)).d()) {
                                        q1Var2 = (q1) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        q1Var2 = null;
                        if (q1Var2 != null) {
                            q1Var2.m();
                            boolean z10 = RecyclerView.G0;
                        }
                        q1Var = q1Var2;
                    }
                    if (q1Var == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j7 = this.f1670g.a(0).f1645c;
                            if (!((j7 == 0 || j7 + nanoTime < j2) ? z5 : false)) {
                                return null;
                            }
                        }
                        q0 q0Var3 = recyclerView.f786r;
                        q0Var3.getClass();
                        try {
                            if (j0.h.a()) {
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", 0));
                            }
                            q1Var = q0Var3.d(recyclerView);
                            View view3 = q1Var.f1768a;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            q1Var.f1772f = 0;
                            Trace.endSection();
                            if (RecyclerView.L0 && (G = RecyclerView.G(view3)) != null) {
                                q1Var.f1769b = new WeakReference(G);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            e1 a5 = this.f1670g.a(0);
                            long j8 = a5.f1645c;
                            if (j8 != 0) {
                                nanoTime2 = (nanoTime2 / j5) + ((j8 / j5) * 3);
                            }
                            a5.f1645c = nanoTime2;
                            if (RecyclerView.H0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + h5 + ").state:" + m1Var.b() + recyclerView.B());
        }
        j4 = 3;
        j5 = 4;
        View view4 = q1Var.f1768a;
        if (z4 && !m1Var.f1725g) {
            int i11 = q1Var.f1774j;
            if ((i11 & 8192) != 0 ? z5 : false) {
                q1Var.f1774j = i11 & (-8193);
                if (m1Var.f1726j) {
                    w0.b(q1Var);
                    w0 w0Var = recyclerView.Q;
                    q1Var.c();
                    w0Var.getClass();
                    v0 v0Var = new v0();
                    v0Var.a(q1Var);
                    recyclerView.Z(q1Var, v0Var);
                }
            }
        }
        if (!m1Var.f1725g || !q1Var.e()) {
            if (q1Var.e()) {
                if (!((q1Var.f1774j & 2) != 0 ? z5 : false)) {
                }
            }
            if (RecyclerView.G0 && q1Var.h()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(q1Var);
                throw new IllegalStateException(a4.b.e(recyclerView, sb3));
            }
            int h6 = recyclerView.f770j.h(i, 0);
            q1Var.f1783s = null;
            q1Var.f1782r = recyclerView;
            int i12 = q1Var.f1772f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j9 = this.f1670g.a(i12).d;
                if (j9 != 0 && j9 + nanoTime3 >= j2) {
                    z8 = false;
                    z7 = z5;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                        b1Var = (b1) recyclerView.generateDefaultLayoutParams();
                        view4.setLayoutParams(b1Var);
                    } else if (recyclerView.checkLayoutParams(layoutParams)) {
                        b1Var = (b1) layoutParams;
                    } else {
                        b1Var = (b1) recyclerView.generateLayoutParams(layoutParams);
                        view4.setLayoutParams(b1Var);
                    }
                    b1Var.f1617a = q1Var;
                    if (z4 || !z8) {
                        z7 = false;
                    }
                    b1Var.d = z7;
                    return q1Var;
                }
            }
            if (q1Var.j()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z6 = z5;
            } else {
                z6 = false;
            }
            q0 q0Var4 = recyclerView.f786r;
            q0Var4.getClass();
            boolean z11 = q1Var.f1783s == null ? z5 : false;
            if (z11) {
                q1Var.f1770c = h6;
                if (q0Var4.f1765b) {
                    q1Var.f1771e = q0Var4.b(h6);
                }
                q1Var.f1774j = (q1Var.f1774j & (-520)) | 1;
                if (j0.h.a()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(q1Var.f1772f)));
                }
            }
            q1Var.f1783s = q0Var4;
            if (RecyclerView.G0) {
                if (view4.getParent() == null && view4.isAttachedToWindow() != q1Var.j()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + q1Var.j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + q1Var);
                }
                if (view4.getParent() == null && view4.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + q1Var);
                }
            }
            q1Var.c();
            q0Var4.c(q1Var, h6);
            if (z11) {
                ArrayList arrayList6 = q1Var.f1775k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                q1Var.f1774j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof b1) {
                    ((b1) layoutParams2).f1619c = z5;
                }
                Trace.endSection();
            }
            if (z6) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            e1 a6 = this.f1670g.a(q1Var.f1772f);
            long j10 = a6.d;
            if (j10 != 0) {
                nanoTime4 = (nanoTime4 / j5) + ((j10 / j5) * j4);
            }
            a6.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.G;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                z7 = true;
                if (view4.getImportantForAccessibility() == 0) {
                    view4.setImportantForAccessibility(1);
                }
                s1 s1Var = recyclerView.f789s0;
                if (s1Var != null) {
                    r1 r1Var = s1Var.f1791e;
                    if (r1Var != null) {
                        View.AccessibilityDelegate d = n0.p0.d(view4);
                        n0.b bVar = d == null ? null : d instanceof n0.a ? ((n0.a) d).f2748a : new n0.b(d);
                        if (bVar != null && bVar != r1Var) {
                            r1Var.f1787e.put(view4, bVar);
                        }
                    }
                    n0.p0.m(view4, r1Var);
                }
            } else {
                z7 = true;
            }
            if (m1Var.f1725g) {
                q1Var.f1773g = i;
            }
            z8 = z7;
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            b1Var.f1617a = q1Var;
            if (z4) {
            }
            z7 = false;
            b1Var.d = z7;
            return q1Var;
        }
        q1Var.f1773g = i;
        z7 = z5;
        z8 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
        }
        b1Var.f1617a = q1Var;
        if (z4) {
        }
        z7 = false;
        b1Var.d = z7;
        return q1Var;
    }

    public final void m(q1 q1Var) {
        if (q1Var.f1779o) {
            this.f1666b.remove(q1Var);
        } else {
            this.f1665a.remove(q1Var);
        }
        q1Var.f1778n = null;
        q1Var.f1779o = false;
        q1Var.f1774j &= -33;
    }

    public final void n() {
        a1 a1Var = this.h.f788s;
        this.f1669f = this.f1668e + (a1Var != null ? a1Var.f1603j : 0);
        ArrayList arrayList = this.f1667c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1669f; size--) {
            h(size);
        }
    }
}
