package g0;

import K.C0000a;
import K.C0002b;
import K.C0019q;
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
    public final ArrayList f2331a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2332b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2333c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2334e;

    /* renamed from: f, reason: collision with root package name */
    public int f2335f;

    /* renamed from: g, reason: collision with root package name */
    public O f2336g;
    public final /* synthetic */ RecyclerView h;

    public P(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2331a = arrayList;
        this.f2332b = null;
        this.f2333c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2334e = 2;
        this.f2335f = 2;
    }

    public final void a(a0 a0Var, boolean z2) {
        RecyclerView.l(a0Var);
        RecyclerView recyclerView = this.h;
        c0 c0Var = recyclerView.f1608l0;
        View view = a0Var.f2366a;
        if (c0Var != null) {
            b0 b0Var = c0Var.f2390e;
            K.T.l(view, b0Var != null ? (C0002b) b0Var.f2385e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f1611n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1596e0 != null) {
                recyclerView.f1599g.J(a0Var);
            }
            if (RecyclerView.f1565y0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + a0Var);
            }
        }
        a0Var.f2381s = null;
        a0Var.f2380r = null;
        O c2 = c();
        c2.getClass();
        int i = a0Var.f2370f;
        ArrayList arrayList2 = c2.a(i).f2325a;
        if (((N) c2.f2328a.get(i)).f2326b <= arrayList2.size()) {
            z1.l.c(view);
        } else {
            if (RecyclerView.f1564x0 && arrayList2.contains(a0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            a0Var.n();
            arrayList2.add(a0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1596e0.b()) {
            return !recyclerView.f1596e0.f2350g ? i : recyclerView.f1595e.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1596e0.b() + recyclerView.B());
    }

    public final O c() {
        if (this.f2336g == null) {
            O o2 = new O();
            o2.f2328a = new SparseArray();
            o2.f2329b = 0;
            o2.f2330c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2336g = o2;
            d();
        }
        return this.f2336g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0112B abstractC0112B;
        O o2 = this.f2336g;
        if (o2 == null || (abstractC0112B = (recyclerView = this.h).f1607l) == null || !recyclerView.f1618r) {
            return;
        }
        o2.f2330c.add(abstractC0112B);
    }

    public final void e(AbstractC0112B abstractC0112B, boolean z2) {
        O o2 = this.f2336g;
        if (o2 == null) {
            return;
        }
        Set set = o2.f2330c;
        set.remove(abstractC0112B);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = o2.f2328a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((N) sparseArray.get(sparseArray.keyAt(i))).f2325a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                z1.l.c(((a0) arrayList.get(i2)).f2366a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2333c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f1561C0) {
            C0130n c0130n = this.h.f1594d0;
            int[] iArr = c0130n.f2490c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0130n.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f1565y0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f2333c;
        a0 a0Var = (a0) arrayList.get(i);
        if (RecyclerView.f1565y0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + a0Var);
        }
        a(a0Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        a0 L2 = RecyclerView.L(view);
        boolean k2 = L2.k();
        RecyclerView recyclerView = this.h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.j()) {
            L2.f2376n.l(L2);
        } else if (L2.q()) {
            L2.f2372j &= -33;
        }
        i(L2);
        if (recyclerView.f1574J == null || L2.h()) {
            return;
        }
        recyclerView.f1574J.d(L2);
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
        RecyclerView recyclerView = this.h;
        View view = a0Var.f2366a;
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
            throw new IllegalArgumentException(Y.V.d(recyclerView, sb2));
        }
        if (a0Var.p()) {
            throw new IllegalArgumentException(Y.V.d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((a0Var.f2372j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f440a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0112B abstractC0112B = recyclerView.f1607l;
                z3 = RecyclerView.f1564x0;
                ArrayList arrayList = this.f2333c;
                if (!z3 && arrayList.contains(a0Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(a0Var);
                    throw new IllegalArgumentException(Y.V.d(recyclerView, sb3));
                }
                if (a0Var.h()) {
                    if (RecyclerView.f1565y0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z5 = false;
                } else {
                    if (this.f2335f <= 0 || a0Var.d(526)) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f2335f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.f1561C0 && size > 0) {
                            C0130n c0130n = recyclerView.f1594d0;
                            int i = a0Var.f2368c;
                            if (c0130n.f2490c != null) {
                                int i2 = c0130n.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0130n.f2490c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((a0) arrayList.get(i4)).f2368c;
                                C0130n c0130n2 = recyclerView.f1594d0;
                                if (c0130n2.f2490c == null) {
                                    break;
                                }
                                int i6 = c0130n2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0130n2.f2490c[i7] == i5) {
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
                recyclerView.f1599g.J(a0Var);
                if (r1 && !z5 && z2) {
                    z1.l.c(view);
                    a0Var.f2381s = null;
                    a0Var.f2380r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0112B abstractC0112B2 = recyclerView.f1607l;
        z3 = RecyclerView.f1564x0;
        ArrayList arrayList2 = this.f2333c;
        if (!z3) {
        }
        if (a0Var.h()) {
        }
        recyclerView.f1599g.J(a0Var);
        if (r1) {
        }
    }

    public final void j(View view) {
        AbstractC0116F abstractC0116F;
        a0 L2 = RecyclerView.L(view);
        boolean d = L2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d && L2.l() && (abstractC0116F = recyclerView.f1574J) != null) {
            C0126j c0126j = (C0126j) abstractC0116F;
            if (L2.c().isEmpty() && c0126j.f2441g && !L2.g()) {
                if (this.f2332b == null) {
                    this.f2332b = new ArrayList();
                }
                L2.f2376n = this;
                L2.f2377o = true;
                this.f2332b.add(L2);
                return;
            }
        }
        if (L2.g() && !L2.i() && !recyclerView.f1607l.f2298b) {
            throw new IllegalArgumentException(Y.V.d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f2376n = this;
        L2.f2377o = false;
        this.f2331a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.g() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f2370f != 0) goto L119;
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
        RecyclerView G2;
        a0 a0Var2;
        a0 a0Var3;
        View view;
        int b2;
        boolean z5;
        int size;
        int e2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1596e0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1596e0.b() + recyclerView.B());
        }
        W w2 = recyclerView.f1596e0;
        boolean z6 = false;
        if (w2.f2350g) {
            ArrayList arrayList = this.f2332b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        a0Var = (a0) this.f2332b.get(i2);
                        if (!a0Var.q() && a0Var.b() == i) {
                            a0Var.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1607l.f2298b && (e2 = recyclerView.f1595e.e(i, 0)) > 0 && e2 < recyclerView.f1607l.a()) {
                        long b3 = recyclerView.f1607l.b(e2);
                        for (int i3 = 0; i3 < size; i3++) {
                            a0 a0Var4 = (a0) this.f2332b.get(i3);
                            if (!a0Var4.q() && a0Var4.f2369e == b3) {
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
        ArrayList arrayList2 = this.f2333c;
        ArrayList arrayList3 = this.f2331a;
        if (a0Var == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                a0 a0Var5 = (a0) arrayList3.get(i4);
                if (!a0Var5.q() && a0Var5.b() == i && !a0Var5.g() && (w2.f2350g || !a0Var5.i())) {
                    a0Var5.a(32);
                    a0Var = a0Var5;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1597f.f2388c;
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
                        if (RecyclerView.f1565y0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + a0Var);
                        }
                    }
                }
            } else {
                a0 L3 = RecyclerView.L(view);
                C0119c c0119c = recyclerView.f1597f;
                int indexOfChild = c0119c.f2386a.f2296a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0118b c0118b = c0119c.f2387b;
                if (!c0118b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0118b.a(indexOfChild);
                c0119c.j(view);
                C0119c c0119c2 = recyclerView.f1597f;
                int indexOfChild2 = c0119c2.f2386a.f2296a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    C0118b c0118b2 = c0119c2.f2387b;
                    if (!c0118b2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0118b2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(Y.V.d(recyclerView, sb));
                        }
                        recyclerView.f1597f.c(b2);
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
                    int i7 = a0Var.f2368c;
                    if (i7 < 0 || i7 >= recyclerView.f1607l.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(a0Var);
                        throw new IndexOutOfBoundsException(Y.V.d(recyclerView, sb2));
                    }
                    if (!w2.f2350g) {
                        recyclerView.f1607l.getClass();
                    }
                    AbstractC0112B abstractC0112B = recyclerView.f1607l;
                    if (!abstractC0112B.f2298b || a0Var.f2369e == abstractC0112B.b(a0Var.f2368c)) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (RecyclerView.f1564x0 && !w2.f2350g) {
                        throw new IllegalStateException(Y.V.d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = w2.f2350g;
                }
                if (z5) {
                    z2 = true;
                } else {
                    a0Var.a(4);
                    if (a0Var.j()) {
                        recyclerView.removeDetachedView(a0Var.f2366a, false);
                        a0Var.f2376n.l(a0Var);
                    } else if (a0Var.q()) {
                        a0Var.f2372j &= -33;
                    }
                    i(a0Var);
                    a0Var = null;
                }
            }
        }
        if (a0Var == null) {
            int e3 = recyclerView.f1595e.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1607l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + w2.b() + recyclerView.B());
            }
            recyclerView.f1607l.getClass();
            AbstractC0112B abstractC0112B2 = recyclerView.f1607l;
            if (abstractC0112B2.f2298b) {
                long b4 = abstractC0112B2.b(e3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        a0 a0Var6 = (a0) arrayList3.get(size5);
                        if (a0Var6.f2369e == b4 && !a0Var6.q()) {
                            if (a0Var6.f2370f == 0) {
                                a0Var6.a(32);
                                if (a0Var6.i() && !w2.f2350g) {
                                    a0Var6.f2372j = (a0Var6.f2372j & (-15)) | 2;
                                }
                                a0Var3 = a0Var6;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = a0Var6.f2366a;
                                recyclerView.removeDetachedView(view2, false);
                                a0 L4 = RecyclerView.L(view2);
                                L4.f2376n = null;
                                L4.f2377o = false;
                                L4.f2372j &= -33;
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
                            if (a0Var3.f2369e != b4 || a0Var3.e()) {
                                size6--;
                            } else if (a0Var3.f2370f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        a0Var3 = null;
                    }
                }
                if (a0Var3 != null) {
                    a0Var3.f2368c = e3;
                    a0Var = a0Var3;
                    z2 = true;
                } else {
                    a0Var = a0Var3;
                }
            }
            if (a0Var == null) {
                if (RecyclerView.f1565y0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                N n2 = (N) c().f2328a.get(0);
                if (n2 != null) {
                    ArrayList arrayList5 = n2.f2325a;
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
                    boolean z7 = RecyclerView.f1564x0;
                }
                a0Var = a0Var2;
            }
            if (a0Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f2336g.a(0).f2327c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0112B abstractC0112B3 = recyclerView.f1607l;
                abstractC0112B3.getClass();
                try {
                    int i8 = G.h.f251a;
                    Trace.beginSection("RV CreateView");
                    a0Var = abstractC0112B3.d(recyclerView);
                    View view3 = a0Var.f2366a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    a0Var.f2370f = 0;
                    Trace.endSection();
                    if (RecyclerView.f1561C0 && (G2 = RecyclerView.G(view3)) != null) {
                        a0Var.f2367b = new WeakReference(G2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    N a2 = this.f2336g.a(0);
                    long j4 = a2.f2327c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2327c = nanoTime2;
                    if (RecyclerView.f1565y0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i9 = G.h.f251a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !w2.f2350g && a0Var.d(8192)) {
            a0Var.f2372j &= -8193;
            if (w2.f2351j) {
                AbstractC0116F.b(a0Var);
                AbstractC0116F abstractC0116F = recyclerView.f1574J;
                a0Var.c();
                abstractC0116F.getClass();
                C0019q c0019q = new C0019q();
                c0019q.a(a0Var);
                recyclerView.X(a0Var, c0019q);
            }
        }
        boolean z8 = w2.f2350g;
        View view4 = a0Var.f2366a;
        if (!z8 || !a0Var.f()) {
            if (a0Var.f()) {
                if (!((a0Var.f2372j & 2) != 0)) {
                }
            }
            if (RecyclerView.f1564x0 && a0Var.i()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(a0Var);
                throw new IllegalStateException(Y.V.d(recyclerView, sb3));
            }
            int e4 = recyclerView.f1595e.e(i, 0);
            a0Var.f2381s = null;
            a0Var.f2380r = recyclerView;
            int i10 = a0Var.f2370f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f2336g.a(i10).d;
                if (j5 != 0) {
                }
            }
            if (a0Var.k()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0112B abstractC0112B4 = recyclerView.f1607l;
            abstractC0112B4.getClass();
            boolean z9 = a0Var.f2381s == null;
            if (z9) {
                a0Var.f2368c = e4;
                if (abstractC0112B4.f2298b) {
                    a0Var.f2369e = abstractC0112B4.b(e4);
                }
                a0Var.f2372j = (a0Var.f2372j & (-520)) | 1;
                int i11 = G.h.f251a;
                Trace.beginSection("RV OnBindView");
            }
            a0Var.f2381s = abstractC0112B4;
            if (RecyclerView.f1564x0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = K.T.f440a;
                    if (view4.isAttachedToWindow() != a0Var.k()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + a0Var.k() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + a0Var);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = K.T.f440a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + a0Var);
                    }
                }
            }
            a0Var.c();
            abstractC0112B4.c(a0Var, e4);
            if (z9) {
                ArrayList arrayList6 = a0Var.f2373k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                a0Var.f2372j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof K) {
                    ((K) layoutParams2).f2324c = true;
                }
            }
            if (z3) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            N a3 = this.f2336g.a(a0Var.f2370f);
            long j6 = a3.d;
            if (j6 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
            }
            a3.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f1632z;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = K.T.f440a;
                if (view4.getImportantForAccessibility() == 0) {
                    z4 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z4 = true;
                }
                c0 c0Var = recyclerView.f1608l0;
                if (c0Var != null) {
                    b0 b0Var = c0Var.f2390e;
                    if (b0Var != null) {
                        View.AccessibilityDelegate c2 = K.T.c(view4);
                        C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f452a : new C0002b(c2);
                        if (c0002b != null && c0002b != b0Var) {
                            b0Var.f2385e.put(view4, c0002b);
                        }
                    }
                    K.T.l(view4, b0Var);
                }
            } else {
                z4 = true;
            }
            if (w2.f2350g) {
                a0Var.f2371g = i;
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
            k2.f2322a = a0Var;
            k2.d = (z2 || !z6) ? false : z4;
            return a0Var;
        }
        a0Var.f2371g = i;
        z4 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        k2.f2322a = a0Var;
        k2.d = (z2 || !z6) ? false : z4;
        return a0Var;
    }

    public final void l(a0 a0Var) {
        if (a0Var.f2377o) {
            this.f2332b.remove(a0Var);
        } else {
            this.f2331a.remove(a0Var);
        }
        a0Var.f2376n = null;
        a0Var.f2377o = false;
        a0Var.f2372j &= -33;
    }

    public final void m() {
        J j2 = this.h.f1609m;
        this.f2335f = this.f2334e + (j2 != null ? j2.f2316j : 0);
        ArrayList arrayList = this.f2333c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2335f; size--) {
            g(size);
        }
    }
}
