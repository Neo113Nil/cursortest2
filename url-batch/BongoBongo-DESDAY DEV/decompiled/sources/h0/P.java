package h0;

import L.C0000a;
import L.C0002b;
import L.C0019q;
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

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2418a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2419b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2420c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2421e;

    /* renamed from: f, reason: collision with root package name */
    public int f2422f;

    /* renamed from: g, reason: collision with root package name */
    public O f2423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2424h;

    public P(RecyclerView recyclerView) {
        this.f2424h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2418a = arrayList;
        this.f2419b = null;
        this.f2420c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2421e = 2;
        this.f2422f = 2;
    }

    public final void a(a0 a0Var, boolean z2) {
        RecyclerView.l(a0Var);
        RecyclerView recyclerView = this.f2424h;
        c0 c0Var = recyclerView.l0;
        View view = a0Var.f2455a;
        if (c0Var != null) {
            b0 b0Var = c0Var.f2480e;
            L.T.l(view, b0Var != null ? (C0002b) b0Var.f2475e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f1674n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1659e0 != null) {
                recyclerView.f1662g.H(a0Var);
            }
            if (RecyclerView.f1627y0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + a0Var);
            }
        }
        a0Var.f2471s = null;
        a0Var.f2470r = null;
        O c2 = c();
        c2.getClass();
        int i = a0Var.f2459f;
        ArrayList arrayList2 = c2.a(i).f2412a;
        if (((N) c2.f2415a.get(i)).f2413b <= arrayList2.size()) {
            A1.d.j(view);
        } else {
            if (RecyclerView.f1626x0 && arrayList2.contains(a0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            a0Var.n();
            arrayList2.add(a0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f2424h;
        if (i >= 0 && i < recyclerView.f1659e0.b()) {
            return !recyclerView.f1659e0.f2438g ? i : recyclerView.f1658e.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1659e0.b() + recyclerView.B());
    }

    public final O c() {
        if (this.f2423g == null) {
            O o2 = new O();
            o2.f2415a = new SparseArray();
            o2.f2416b = 0;
            o2.f2417c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2423g = o2;
            d();
        }
        return this.f2423g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0114B abstractC0114B;
        O o2 = this.f2423g;
        if (o2 == null || (abstractC0114B = (recyclerView = this.f2424h).f1671l) == null || !recyclerView.f1681r) {
            return;
        }
        o2.f2417c.add(abstractC0114B);
    }

    public final void e(AbstractC0114B abstractC0114B, boolean z2) {
        O o2 = this.f2423g;
        if (o2 == null) {
            return;
        }
        Set set = o2.f2417c;
        set.remove(abstractC0114B);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = o2.f2415a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((N) sparseArray.get(sparseArray.keyAt(i))).f2412a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                A1.d.j(((a0) arrayList.get(i2)).f2455a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2420c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f1623C0) {
            C0132n c0132n = this.f2424h.f1657d0;
            int[] iArr = c0132n.f2586c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0132n.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f1627y0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f2420c;
        a0 a0Var = (a0) arrayList.get(i);
        if (RecyclerView.f1627y0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + a0Var);
        }
        a(a0Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        a0 L2 = RecyclerView.L(view);
        boolean k2 = L2.k();
        RecyclerView recyclerView = this.f2424h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.j()) {
            L2.f2466n.l(L2);
        } else if (L2.q()) {
            L2.f2462j &= -33;
        }
        i(L2);
        if (recyclerView.f1637J == null || L2.h()) {
            return;
        }
        recyclerView.f1637J.d(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(a0 a0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean j2 = a0Var.j();
        boolean z5 = true;
        RecyclerView recyclerView = this.f2424h;
        View view = a0Var.f2455a;
        if (j2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(a0Var.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (a0Var.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(a0Var);
            throw new IllegalArgumentException(Z.V.d(recyclerView, sb2));
        }
        if (a0Var.p()) {
            throw new IllegalArgumentException(Z.V.d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((a0Var.f2462j & 16) == 0) {
            WeakHashMap weakHashMap = L.T.f490a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0114B abstractC0114B = recyclerView.f1671l;
                z3 = RecyclerView.f1626x0;
                ArrayList arrayList = this.f2420c;
                if (!z3 && arrayList.contains(a0Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(a0Var);
                    throw new IllegalArgumentException(Z.V.d(recyclerView, sb3));
                }
                if (a0Var.h()) {
                    if (RecyclerView.f1627y0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z5 = false;
                } else {
                    if (this.f2422f <= 0 || a0Var.d(526)) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f2422f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.f1623C0 && size > 0) {
                            C0132n c0132n = recyclerView.f1657d0;
                            int i = a0Var.f2457c;
                            if (c0132n.f2586c != null) {
                                int i2 = c0132n.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0132n.f2586c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((a0) arrayList.get(i4)).f2457c;
                                C0132n c0132n2 = recyclerView.f1657d0;
                                if (c0132n2.f2586c == null) {
                                    break;
                                }
                                int i6 = c0132n2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0132n2.f2586c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, a0Var);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(a0Var, true);
                    }
                    r1 = z4;
                }
                recyclerView.f1662g.H(a0Var);
                if (r1 && !z5 && z2) {
                    A1.d.j(view);
                    a0Var.f2471s = null;
                    a0Var.f2470r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0114B abstractC0114B2 = recyclerView.f1671l;
        z3 = RecyclerView.f1626x0;
        ArrayList arrayList2 = this.f2420c;
        if (!z3) {
        }
        if (a0Var.h()) {
        }
        recyclerView.f1662g.H(a0Var);
        if (r1) {
        }
    }

    public final void j(View view) {
        AbstractC0118F abstractC0118F;
        a0 L2 = RecyclerView.L(view);
        boolean d = L2.d(12);
        RecyclerView recyclerView = this.f2424h;
        if (!d && L2.l() && (abstractC0118F = recyclerView.f1637J) != null) {
            C0128j c0128j = (C0128j) abstractC0118F;
            if (L2.c().isEmpty() && c0128j.f2530g && !L2.g()) {
                if (this.f2419b == null) {
                    this.f2419b = new ArrayList();
                }
                L2.f2466n = this;
                L2.f2467o = true;
                this.f2419b.add(L2);
                return;
            }
        }
        if (L2.g() && !L2.i() && !recyclerView.f1671l.f2384b) {
            throw new IllegalArgumentException(Z.V.d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f2466n = this;
        L2.f2467o = false;
        this.f2418a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.g() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f2459f != 0) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 k(int i, long j2) {
        boolean z2;
        a0 a0Var;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        K k2;
        RecyclerView G;
        a0 a0Var2;
        a0 a0Var3;
        View view;
        int b2;
        boolean z5;
        int size;
        int e2;
        RecyclerView recyclerView = this.f2424h;
        if (i < 0 || i >= recyclerView.f1659e0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1659e0.b() + recyclerView.B());
        }
        W w2 = recyclerView.f1659e0;
        boolean z6 = false;
        if (w2.f2438g) {
            ArrayList arrayList = this.f2419b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        a0Var = (a0) this.f2419b.get(i2);
                        if (!a0Var.q() && a0Var.b() == i) {
                            a0Var.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1671l.f2384b && (e2 = recyclerView.f1658e.e(i, 0)) > 0 && e2 < recyclerView.f1671l.a()) {
                        long b3 = recyclerView.f1671l.b(e2);
                        for (int i3 = 0; i3 < size; i3++) {
                            a0 a0Var4 = (a0) this.f2419b.get(i3);
                            if (!a0Var4.q() && a0Var4.f2458e == b3) {
                                a0Var4.a(32);
                                a0Var = a0Var4;
                                break;
                            }
                        }
                    }
                }
                z2 = a0Var == null;
            }
            a0Var = null;
            if (a0Var == null) {
            }
        } else {
            z2 = false;
            a0Var = null;
        }
        ArrayList arrayList2 = this.f2420c;
        ArrayList arrayList3 = this.f2418a;
        if (a0Var == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                a0 a0Var5 = (a0) arrayList3.get(i4);
                if (!a0Var5.q() && a0Var5.b() == i && !a0Var5.g() && (w2.f2438g || !a0Var5.i())) {
                    a0Var5.a(32);
                    a0Var = a0Var5;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1660f.f2478c;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i5);
                a0 L2 = RecyclerView.L(view);
                if (L2.b() == i && !L2.g() && !L2.i()) {
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        a0Var = null;
                        break;
                    }
                    a0Var = (a0) arrayList2.get(i6);
                    if (a0Var.g() || a0Var.b() != i || a0Var.e()) {
                        i6++;
                    } else {
                        arrayList2.remove(i6);
                        if (RecyclerView.f1627y0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + a0Var);
                        }
                    }
                }
            } else {
                a0 L3 = RecyclerView.L(view);
                C0121c c0121c = recyclerView.f1660f;
                int indexOfChild = c0121c.f2476a.f2382a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0120b c0120b = c0121c.f2477b;
                if (!c0120b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0120b.a(indexOfChild);
                c0121c.j(view);
                C0121c c0121c2 = recyclerView.f1660f;
                int indexOfChild2 = c0121c2.f2476a.f2382a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    C0120b c0120b2 = c0121c2.f2477b;
                    if (!c0120b2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0120b2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(Z.V.d(recyclerView, sb));
                        }
                        recyclerView.f1660f.c(b2);
                        j(view);
                        L3.a(8224);
                        a0Var = L3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (a0Var != null) {
                if (!a0Var.i()) {
                    int i7 = a0Var.f2457c;
                    if (i7 < 0 || i7 >= recyclerView.f1671l.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(a0Var);
                        throw new IndexOutOfBoundsException(Z.V.d(recyclerView, sb2));
                    }
                    if (!w2.f2438g) {
                        recyclerView.f1671l.getClass();
                    }
                    AbstractC0114B abstractC0114B = recyclerView.f1671l;
                    if (!abstractC0114B.f2384b || a0Var.f2458e == abstractC0114B.b(a0Var.f2457c)) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (RecyclerView.f1626x0 && !w2.f2438g) {
                        throw new IllegalStateException(Z.V.d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = w2.f2438g;
                }
                if (z5) {
                    z2 = true;
                } else {
                    a0Var.a(4);
                    if (a0Var.j()) {
                        recyclerView.removeDetachedView(a0Var.f2455a, false);
                        a0Var.f2466n.l(a0Var);
                    } else if (a0Var.q()) {
                        a0Var.f2462j &= -33;
                    }
                    i(a0Var);
                    a0Var = null;
                }
            }
        }
        if (a0Var == null) {
            int e3 = recyclerView.f1658e.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1671l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + w2.b() + recyclerView.B());
            }
            recyclerView.f1671l.getClass();
            AbstractC0114B abstractC0114B2 = recyclerView.f1671l;
            if (abstractC0114B2.f2384b) {
                long b4 = abstractC0114B2.b(e3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        a0 a0Var6 = (a0) arrayList3.get(size5);
                        if (a0Var6.f2458e == b4 && !a0Var6.q()) {
                            if (a0Var6.f2459f == 0) {
                                a0Var6.a(32);
                                if (a0Var6.i() && !w2.f2438g) {
                                    a0Var6.f2462j = (a0Var6.f2462j & (-15)) | 2;
                                }
                                a0Var3 = a0Var6;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = a0Var6.f2455a;
                                recyclerView.removeDetachedView(view2, false);
                                a0 L4 = RecyclerView.L(view2);
                                L4.f2466n = null;
                                L4.f2467o = false;
                                L4.f2462j &= -33;
                                i(L4);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            a0Var3 = (a0) arrayList2.get(size6);
                            if (a0Var3.f2458e != b4 || a0Var3.e()) {
                                size6--;
                            } else if (a0Var3.f2459f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        a0Var3 = null;
                    }
                }
                if (a0Var3 != null) {
                    a0Var3.f2457c = e3;
                    a0Var = a0Var3;
                    z2 = true;
                } else {
                    a0Var = a0Var3;
                }
            }
            if (a0Var == null) {
                if (RecyclerView.f1627y0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                N n2 = (N) c().f2415a.get(0);
                if (n2 != null) {
                    ArrayList arrayList5 = n2.f2412a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((a0) arrayList5.get(size7)).e()) {
                                a0Var2 = (a0) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                a0Var2 = null;
                if (a0Var2 != null) {
                    a0Var2.n();
                    boolean z7 = RecyclerView.f1626x0;
                }
                a0Var = a0Var2;
            }
            if (a0Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f2423g.a(0).f2414c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0114B abstractC0114B3 = recyclerView.f1671l;
                abstractC0114B3.getClass();
                try {
                    int i8 = H.h.f295a;
                    Trace.beginSection("RV CreateView");
                    a0Var = abstractC0114B3.d(recyclerView);
                    View view3 = a0Var.f2455a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    a0Var.f2459f = 0;
                    Trace.endSection();
                    if (RecyclerView.f1623C0 && (G = RecyclerView.G(view3)) != null) {
                        a0Var.f2456b = new WeakReference(G);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    N a2 = this.f2423g.a(0);
                    long j4 = a2.f2414c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2414c = nanoTime2;
                    if (RecyclerView.f1627y0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i9 = H.h.f295a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !w2.f2438g && a0Var.d(8192)) {
            a0Var.f2462j &= -8193;
            if (w2.f2440j) {
                AbstractC0118F.b(a0Var);
                AbstractC0118F abstractC0118F = recyclerView.f1637J;
                a0Var.c();
                abstractC0118F.getClass();
                C0019q c0019q = new C0019q();
                c0019q.a(a0Var);
                recyclerView.X(a0Var, c0019q);
            }
        }
        boolean z8 = w2.f2438g;
        View view4 = a0Var.f2455a;
        if (!z8 || !a0Var.f()) {
            if (a0Var.f()) {
                if (!((a0Var.f2462j & 2) != 0)) {
                }
            }
            if (RecyclerView.f1626x0 && a0Var.i()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(a0Var);
                throw new IllegalStateException(Z.V.d(recyclerView, sb3));
            }
            int e4 = recyclerView.f1658e.e(i, 0);
            a0Var.f2471s = null;
            a0Var.f2470r = recyclerView;
            int i10 = a0Var.f2459f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f2423g.a(i10).d;
                if (j5 != 0) {
                }
            }
            if (a0Var.k()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0114B abstractC0114B4 = recyclerView.f1671l;
            abstractC0114B4.getClass();
            boolean z9 = a0Var.f2471s == null;
            if (z9) {
                a0Var.f2457c = e4;
                if (abstractC0114B4.f2384b) {
                    a0Var.f2458e = abstractC0114B4.b(e4);
                }
                a0Var.f2462j = (a0Var.f2462j & (-520)) | 1;
                int i11 = H.h.f295a;
                Trace.beginSection("RV OnBindView");
            }
            a0Var.f2471s = abstractC0114B4;
            if (RecyclerView.f1626x0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = L.T.f490a;
                    if (view4.isAttachedToWindow() != a0Var.k()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + a0Var.k() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + a0Var);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = L.T.f490a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + a0Var);
                    }
                }
            }
            a0Var.c();
            abstractC0114B4.c(a0Var, e4);
            if (z9) {
                ArrayList arrayList6 = a0Var.f2463k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                a0Var.f2462j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof K) {
                    ((K) layoutParams2).f2411c = true;
                }
            }
            if (z3) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            N a3 = this.f2423g.a(a0Var.f2459f);
            long j6 = a3.d;
            if (j6 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
            }
            a3.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f1695z;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = L.T.f490a;
                if (view4.getImportantForAccessibility() == 0) {
                    z4 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z4 = true;
                }
                c0 c0Var = recyclerView.l0;
                if (c0Var != null) {
                    b0 b0Var = c0Var.f2480e;
                    if (b0Var != null) {
                        View.AccessibilityDelegate c2 = L.T.c(view4);
                        C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f502a : new C0002b(c2);
                        if (c0002b != null && c0002b != b0Var) {
                            b0Var.f2475e.put(view4, c0002b);
                        }
                    }
                    L.T.l(view4, b0Var);
                }
            } else {
                z4 = true;
            }
            if (w2.f2438g) {
                a0Var.f2460g = i;
            }
            z6 = z4;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                k2 = (K) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(k2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                k2 = (K) layoutParams;
            } else {
                k2 = (K) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(k2);
            }
            k2.f2409a = a0Var;
            k2.d = (z2 || !z6) ? false : z4;
            return a0Var;
        }
        a0Var.f2460g = i;
        z4 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        k2.f2409a = a0Var;
        k2.d = (z2 || !z6) ? false : z4;
        return a0Var;
    }

    public final void l(a0 a0Var) {
        if (a0Var.f2467o) {
            this.f2419b.remove(a0Var);
        } else {
            this.f2418a.remove(a0Var);
        }
        a0Var.f2466n = null;
        a0Var.f2467o = false;
        a0Var.f2462j &= -33;
    }

    public final void m() {
        J j2 = this.f2424h.f1672m;
        this.f2422f = this.f2421e + (j2 != null ? j2.f2403j : 0);
        ArrayList arrayList = this.f2420c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2422f; size--) {
            g(size);
        }
    }
}
