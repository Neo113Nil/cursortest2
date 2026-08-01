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
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2296a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2298c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2299e;

    /* renamed from: f, reason: collision with root package name */
    public int f2300f;

    /* renamed from: g, reason: collision with root package name */
    public Q f2301g;
    public final /* synthetic */ RecyclerView h;

    public S(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2296a = arrayList;
        this.f2297b = null;
        this.f2298c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2299e = 2;
        this.f2300f = 2;
    }

    public final void a(c0 c0Var, boolean z2) {
        RecyclerView.l(c0Var);
        RecyclerView recyclerView = this.h;
        e0 e0Var = recyclerView.f1581n0;
        View view = c0Var.f2339a;
        if (e0Var != null) {
            d0 d0Var = e0Var.f2363e;
            K.T.l(view, d0Var != null ? (C0002b) d0Var.f2359e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f1582o;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1570g0 != null) {
                recyclerView.f1569g.J(c0Var);
            }
            if (RecyclerView.f1528A0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + c0Var);
            }
        }
        c0Var.f2354s = null;
        c0Var.f2353r = null;
        Q c2 = c();
        c2.getClass();
        int i = c0Var.f2343f;
        ArrayList arrayList2 = c2.a(i).f2290a;
        if (((P) c2.f2293a.get(i)).f2291b <= arrayList2.size()) {
            w1.l.h(view);
        } else {
            if (RecyclerView.z0 && arrayList2.contains(c0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            c0Var.o();
            arrayList2.add(c0Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1570g0.b()) {
            return !recyclerView.f1570g0.f2315g ? i : recyclerView.f1565e.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1570g0.b() + recyclerView.B());
    }

    public final Q c() {
        if (this.f2301g == null) {
            Q q2 = new Q();
            q2.f2293a = new SparseArray();
            q2.f2294b = 0;
            q2.f2295c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2301g = q2;
            d();
        }
        return this.f2301g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0112D abstractC0112D;
        Q q2 = this.f2301g;
        if (q2 == null || (abstractC0112D = (recyclerView = this.h).f1578m) == null || !recyclerView.f1589s) {
            return;
        }
        q2.f2295c.add(abstractC0112D);
    }

    public final void e(AbstractC0112D abstractC0112D, boolean z2) {
        Q q2 = this.f2301g;
        if (q2 == null) {
            return;
        }
        Set set = q2.f2295c;
        set.remove(abstractC0112D);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = q2.f2293a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((P) sparseArray.get(sparseArray.keyAt(i))).f2290a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                w1.l.h(((c0) arrayList.get(i2)).f2339a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2298c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f1532F0) {
            C0129o c0129o = this.h.f1568f0;
            int[] iArr = c0129o.f2460c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0129o.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f1528A0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f2298c;
        c0 c0Var = (c0) arrayList.get(i);
        if (RecyclerView.f1528A0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + c0Var);
        }
        a(c0Var, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        c0 L2 = RecyclerView.L(view);
        boolean l2 = L2.l();
        RecyclerView recyclerView = this.h;
        if (l2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.k()) {
            L2.f2349n.l(L2);
        } else if (L2.r()) {
            L2.f2345j &= -33;
        }
        i(L2);
        if (recyclerView.f1546L == null || L2.i()) {
            return;
        }
        recyclerView.f1546L.d(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(c0 c0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean k2 = c0Var.k();
        boolean z5 = true;
        RecyclerView recyclerView = this.h;
        View view = c0Var.f2339a;
        if (k2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(c0Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (c0Var.l()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(c0Var);
            throw new IllegalArgumentException(Y.V.d(recyclerView, sb2));
        }
        if (c0Var.q()) {
            throw new IllegalArgumentException(Y.V.d(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((c0Var.f2345j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f423a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0112D abstractC0112D = recyclerView.f1578m;
                z3 = RecyclerView.z0;
                ArrayList arrayList = this.f2298c;
                if (!z3 && arrayList.contains(c0Var)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(c0Var);
                    throw new IllegalArgumentException(Y.V.d(recyclerView, sb3));
                }
                if (c0Var.i()) {
                    if (RecyclerView.f1528A0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z5 = false;
                } else {
                    if (this.f2300f <= 0 || c0Var.e(526)) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f2300f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.f1532F0 && size > 0) {
                            C0129o c0129o = recyclerView.f1568f0;
                            int i = c0Var.f2341c;
                            if (c0129o.f2460c != null) {
                                int i2 = c0129o.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0129o.f2460c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((c0) arrayList.get(i4)).f2341c;
                                C0129o c0129o2 = recyclerView.f1568f0;
                                if (c0129o2.f2460c == null) {
                                    break;
                                }
                                int i6 = c0129o2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0129o2.f2460c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, c0Var);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(c0Var, true);
                    }
                    r1 = z4;
                }
                recyclerView.f1569g.J(c0Var);
                if (r1 && !z5 && z2) {
                    w1.l.h(view);
                    c0Var.f2354s = null;
                    c0Var.f2353r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0112D abstractC0112D2 = recyclerView.f1578m;
        z3 = RecyclerView.z0;
        ArrayList arrayList2 = this.f2298c;
        if (!z3) {
        }
        if (c0Var.i()) {
        }
        recyclerView.f1569g.J(c0Var);
        if (r1) {
        }
    }

    public final void j(View view) {
        H h;
        c0 L2 = RecyclerView.L(view);
        boolean e2 = L2.e(12);
        RecyclerView recyclerView = this.h;
        if (!e2 && L2.m() && (h = recyclerView.f1546L) != null) {
            C0125k c0125k = (C0125k) h;
            if (L2.d().isEmpty() && c0125k.f2406g && !L2.h()) {
                if (this.f2297b == null) {
                    this.f2297b = new ArrayList();
                }
                L2.f2349n = this;
                L2.f2350o = true;
                this.f2297b.add(L2);
                return;
            }
        }
        if (L2.h() && !L2.j() && !recyclerView.f1578m.f2263b) {
            throw new IllegalArgumentException(Y.V.d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f2349n = this;
        L2.f2350o = false;
        this.f2296a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.h() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f2343f != 0) goto L119;
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
    public final c0 k(int i, long j2) {
        boolean z2;
        c0 c0Var;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        M m2;
        RecyclerView G2;
        c0 c0Var2;
        c0 c0Var3;
        View view;
        int b2;
        boolean z5;
        int size;
        int g2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1570g0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1570g0.b() + recyclerView.B());
        }
        Y y2 = recyclerView.f1570g0;
        boolean z6 = false;
        if (y2.f2315g) {
            ArrayList arrayList = this.f2297b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        c0Var = (c0) this.f2297b.get(i2);
                        if (!c0Var.r() && c0Var.c() == i) {
                            c0Var.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1578m.f2263b && (g2 = recyclerView.f1565e.g(i, 0)) > 0 && g2 < recyclerView.f1578m.a()) {
                        long b3 = recyclerView.f1578m.b(g2);
                        for (int i3 = 0; i3 < size; i3++) {
                            c0 c0Var4 = (c0) this.f2297b.get(i3);
                            if (!c0Var4.r() && c0Var4.f2342e == b3) {
                                c0Var4.a(32);
                                c0Var = c0Var4;
                                break;
                            }
                        }
                    }
                }
                z2 = c0Var == null;
            }
            c0Var = null;
            if (c0Var == null) {
            }
        } else {
            z2 = false;
            c0Var = null;
        }
        ArrayList arrayList2 = this.f2298c;
        ArrayList arrayList3 = this.f2296a;
        if (c0Var == null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                c0 c0Var5 = (c0) arrayList3.get(i4);
                if (!c0Var5.r() && c0Var5.c() == i && !c0Var5.h() && (y2.f2315g || !c0Var5.j())) {
                    c0Var5.a(32);
                    c0Var = c0Var5;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1567f.f2357c;
            int size3 = arrayList4.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i5);
                c0 L2 = RecyclerView.L(view);
                if (L2.c() == i && !L2.h() && !L2.j()) {
                    break;
                }
                i5++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        c0Var = null;
                        break;
                    }
                    c0Var = (c0) arrayList2.get(i6);
                    if (c0Var.h() || c0Var.c() != i || c0Var.f()) {
                        i6++;
                    } else {
                        arrayList2.remove(i6);
                        if (RecyclerView.f1528A0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + c0Var);
                        }
                    }
                }
            } else {
                c0 L3 = RecyclerView.L(view);
                C0118d c0118d = recyclerView.f1567f;
                int indexOfChild = c0118d.f2355a.f2261a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                C0117c c0117c = c0118d.f2356b;
                if (!c0117c.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c0117c.a(indexOfChild);
                c0118d.j(view);
                C0118d c0118d2 = recyclerView.f1567f;
                int indexOfChild2 = c0118d2.f2355a.f2261a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    C0117c c0117c2 = c0118d2.f2356b;
                    if (!c0117c2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0117c2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(Y.V.d(recyclerView, sb));
                        }
                        recyclerView.f1567f.c(b2);
                        j(view);
                        L3.a(8224);
                        c0Var = L3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (c0Var != null) {
                if (!c0Var.j()) {
                    int i7 = c0Var.f2341c;
                    if (i7 < 0 || i7 >= recyclerView.f1578m.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(c0Var);
                        throw new IndexOutOfBoundsException(Y.V.d(recyclerView, sb2));
                    }
                    if (!y2.f2315g) {
                        recyclerView.f1578m.getClass();
                    }
                    AbstractC0112D abstractC0112D = recyclerView.f1578m;
                    if (!abstractC0112D.f2263b || c0Var.f2342e == abstractC0112D.b(c0Var.f2341c)) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (RecyclerView.z0 && !y2.f2315g) {
                        throw new IllegalStateException(Y.V.d(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = y2.f2315g;
                }
                if (z5) {
                    z2 = true;
                } else {
                    c0Var.a(4);
                    if (c0Var.k()) {
                        recyclerView.removeDetachedView(c0Var.f2339a, false);
                        c0Var.f2349n.l(c0Var);
                    } else if (c0Var.r()) {
                        c0Var.f2345j &= -33;
                    }
                    i(c0Var);
                    c0Var = null;
                }
            }
        }
        if (c0Var == null) {
            int g3 = recyclerView.f1565e.g(i, 0);
            if (g3 < 0 || g3 >= recyclerView.f1578m.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g3 + ").state:" + y2.b() + recyclerView.B());
            }
            recyclerView.f1578m.getClass();
            AbstractC0112D abstractC0112D2 = recyclerView.f1578m;
            if (abstractC0112D2.f2263b) {
                long b4 = abstractC0112D2.b(g3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        c0 c0Var6 = (c0) arrayList3.get(size5);
                        if (c0Var6.f2342e == b4 && !c0Var6.r()) {
                            if (c0Var6.f2343f == 0) {
                                c0Var6.a(32);
                                if (c0Var6.j() && !y2.f2315g) {
                                    c0Var6.f2345j = (c0Var6.f2345j & (-15)) | 2;
                                }
                                c0Var3 = c0Var6;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = c0Var6.f2339a;
                                recyclerView.removeDetachedView(view2, false);
                                c0 L4 = RecyclerView.L(view2);
                                L4.f2349n = null;
                                L4.f2350o = false;
                                L4.f2345j &= -33;
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
                            c0Var3 = (c0) arrayList2.get(size6);
                            if (c0Var3.f2342e != b4 || c0Var3.f()) {
                                size6--;
                            } else if (c0Var3.f2343f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        c0Var3 = null;
                    }
                }
                if (c0Var3 != null) {
                    c0Var3.f2341c = g3;
                    c0Var = c0Var3;
                    z2 = true;
                } else {
                    c0Var = c0Var3;
                }
            }
            if (c0Var == null) {
                if (RecyclerView.f1528A0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                P p2 = (P) c().f2293a.get(0);
                if (p2 != null) {
                    ArrayList arrayList5 = p2.f2290a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((c0) arrayList5.get(size7)).f()) {
                                c0Var2 = (c0) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                c0Var2 = null;
                if (c0Var2 != null) {
                    c0Var2.o();
                    boolean z7 = RecyclerView.z0;
                }
                c0Var = c0Var2;
            }
            if (c0Var == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f2301g.a(0).f2292c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0112D abstractC0112D3 = recyclerView.f1578m;
                abstractC0112D3.getClass();
                try {
                    int i8 = G.h.f234a;
                    Trace.beginSection("RV CreateView");
                    c0Var = abstractC0112D3.d(recyclerView);
                    View view3 = c0Var.f2339a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    c0Var.f2343f = 0;
                    Trace.endSection();
                    if (RecyclerView.f1532F0 && (G2 = RecyclerView.G(view3)) != null) {
                        c0Var.f2340b = new WeakReference(G2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    P a2 = this.f2301g.a(0);
                    long j4 = a2.f2292c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2292c = nanoTime2;
                    if (RecyclerView.f1528A0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i9 = G.h.f234a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !y2.f2315g && c0Var.e(8192)) {
            c0Var.f2345j &= -8193;
            if (y2.f2316j) {
                H.b(c0Var);
                H h = recyclerView.f1546L;
                c0Var.d();
                h.getClass();
                C0019q c0019q = new C0019q();
                c0019q.a(c0Var);
                recyclerView.Y(c0Var, c0019q);
            }
        }
        boolean z8 = y2.f2315g;
        View view4 = c0Var.f2339a;
        if (!z8 || !c0Var.g()) {
            if (c0Var.g()) {
                if (!((c0Var.f2345j & 2) != 0)) {
                }
            }
            if (RecyclerView.z0 && c0Var.j()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(c0Var);
                throw new IllegalStateException(Y.V.d(recyclerView, sb3));
            }
            int g4 = recyclerView.f1565e.g(i, 0);
            c0Var.f2354s = null;
            c0Var.f2353r = recyclerView;
            int i10 = c0Var.f2343f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f2301g.a(i10).d;
                if (j5 != 0) {
                }
            }
            if (c0Var.l()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0112D abstractC0112D4 = recyclerView.f1578m;
            abstractC0112D4.getClass();
            boolean z9 = c0Var.f2354s == null;
            if (z9) {
                c0Var.f2341c = g4;
                if (abstractC0112D4.f2263b) {
                    c0Var.f2342e = abstractC0112D4.b(g4);
                }
                c0Var.f2345j = (c0Var.f2345j & (-520)) | 1;
                int i11 = G.h.f234a;
                Trace.beginSection("RV OnBindView");
            }
            c0Var.f2354s = abstractC0112D4;
            if (RecyclerView.z0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = K.T.f423a;
                    if (view4.isAttachedToWindow() != c0Var.l()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + c0Var.l() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + c0Var);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = K.T.f423a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + c0Var);
                    }
                }
            }
            c0Var.d();
            abstractC0112D4.c(c0Var, g4);
            if (z9) {
                ArrayList arrayList6 = c0Var.f2346k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                c0Var.f2345j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof M) {
                    ((M) layoutParams2).f2289c = true;
                }
            }
            if (z3) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            P a3 = this.f2301g.a(c0Var.f2343f);
            long j6 = a3.d;
            if (j6 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
            }
            a3.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f1537B;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = K.T.f423a;
                if (view4.getImportantForAccessibility() == 0) {
                    z4 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z4 = true;
                }
                e0 e0Var = recyclerView.f1581n0;
                if (e0Var != null) {
                    d0 d0Var = e0Var.f2363e;
                    if (d0Var != null) {
                        View.AccessibilityDelegate c2 = K.T.c(view4);
                        C0002b c0002b = c2 == null ? null : c2 instanceof C0000a ? ((C0000a) c2).f435a : new C0002b(c2);
                        if (c0002b != null && c0002b != d0Var) {
                            d0Var.f2359e.put(view4, c0002b);
                        }
                    }
                    K.T.l(view4, d0Var);
                }
            } else {
                z4 = true;
            }
            if (y2.f2315g) {
                c0Var.f2344g = i;
            }
            z6 = z4;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                m2 = (M) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(m2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                m2 = (M) layoutParams;
            } else {
                m2 = (M) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(m2);
            }
            m2.f2287a = c0Var;
            m2.d = (z2 || !z6) ? false : z4;
            return c0Var;
        }
        c0Var.f2344g = i;
        z4 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        m2.f2287a = c0Var;
        m2.d = (z2 || !z6) ? false : z4;
        return c0Var;
    }

    public final void l(c0 c0Var) {
        if (c0Var.f2350o) {
            this.f2297b.remove(c0Var);
        } else {
            this.f2296a.remove(c0Var);
        }
        c0Var.f2349n = null;
        c0Var.f2350o = false;
        c0Var.f2345j &= -33;
    }

    public final void m() {
        L l2 = this.h.f1580n;
        this.f2300f = this.f2299e + (l2 != null ? l2.f2281j : 0);
        ArrayList arrayList = this.f2298c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2300f; size--) {
            g(size);
        }
    }
}
