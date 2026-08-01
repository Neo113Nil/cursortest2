package g0;

import G1.AbstractC0001b;
import K.C0005a;
import K.C0006b;
import K.C0019o;
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
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2745a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2746b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2747c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2748e;

    /* renamed from: f, reason: collision with root package name */
    public int f2749f;

    /* renamed from: g, reason: collision with root package name */
    public M f2750g;
    public final /* synthetic */ RecyclerView h;

    public N(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2745a = arrayList;
        this.f2746b = null;
        this.f2747c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2748e = 2;
        this.f2749f = 2;
    }

    public final void a(Y y2, boolean z2) {
        RecyclerView.l(y2);
        RecyclerView recyclerView = this.h;
        a0 a0Var = recyclerView.f1988l0;
        View view = y2.f2777a;
        if (a0Var != null) {
            Z z3 = a0Var.f2797e;
            K.Q.l(view, z3 != null ? (C0006b) z3.f2793e.remove(view) : null);
        }
        if (z2) {
            ArrayList arrayList = recyclerView.f1991n;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f1976e0 != null) {
                recyclerView.f1979g.D(y2);
            }
            if (RecyclerView.f1944y0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + y2);
            }
        }
        y2.f2792s = null;
        y2.f2791r = null;
        M c2 = c();
        c2.getClass();
        int i = y2.f2781f;
        ArrayList arrayList2 = c2.a(i).f2739a;
        if (((L) c2.f2742a.get(i)).f2740b <= arrayList2.size()) {
            H1.l.n(view);
        } else {
            if (RecyclerView.f1943x0 && arrayList2.contains(y2)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            y2.n();
            arrayList2.add(y2);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1976e0.b()) {
            return !recyclerView.f1976e0.f2764g ? i : recyclerView.f1975e.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1976e0.b() + recyclerView.B());
    }

    public final M c() {
        if (this.f2750g == null) {
            M m2 = new M();
            m2.f2742a = new SparseArray();
            m2.f2743b = 0;
            m2.f2744c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2750g = m2;
            d();
        }
        return this.f2750g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0161z abstractC0161z;
        M m2 = this.f2750g;
        if (m2 == null || (abstractC0161z = (recyclerView = this.h).f1987l) == null || !recyclerView.f1998r) {
            return;
        }
        m2.f2744c.add(abstractC0161z);
    }

    public final void e(AbstractC0161z abstractC0161z, boolean z2) {
        M m2 = this.f2750g;
        if (m2 == null) {
            return;
        }
        Set set = m2.f2744c;
        set.remove(abstractC0161z);
        if (set.size() != 0 || z2) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = m2.f2742a;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((L) sparseArray.get(sparseArray.keyAt(i))).f2739a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                H1.l.n(((Y) arrayList.get(i2)).f2777a);
            }
            i++;
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2747c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f1939C0) {
            C0149m c0149m = this.h.f1974d0;
            int[] iArr = c0149m.f2901c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0149m.d = 0;
        }
    }

    public final void g(int i) {
        if (RecyclerView.f1944y0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f2747c;
        Y y2 = (Y) arrayList.get(i);
        if (RecyclerView.f1944y0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + y2);
        }
        a(y2, true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        Y L2 = RecyclerView.L(view);
        boolean k2 = L2.k();
        RecyclerView recyclerView = this.h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (L2.j()) {
            L2.f2787n.l(L2);
        } else if (L2.q()) {
            L2.f2783j &= -33;
        }
        i(L2);
        if (recyclerView.f1954J == null || L2.h()) {
            return;
        }
        recyclerView.f1954J.d(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b2, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Y y2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean j2 = y2.j();
        boolean z5 = true;
        RecyclerView recyclerView = this.h;
        View view = y2.f2777a;
        if (j2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(y2.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (y2.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(y2);
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb2));
        }
        if (y2.p()) {
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((y2.f2783j & 16) == 0) {
            WeakHashMap weakHashMap = K.Q.f578a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0161z abstractC0161z = recyclerView.f1987l;
                z3 = RecyclerView.f1943x0;
                ArrayList arrayList = this.f2747c;
                if (!z3 && arrayList.contains(y2)) {
                    StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
                    sb3.append(y2);
                    throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, sb3));
                }
                if (y2.h()) {
                    if (RecyclerView.f1944y0) {
                        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.B());
                    }
                    z5 = false;
                } else {
                    if (this.f2749f <= 0 || y2.d(526)) {
                        z4 = false;
                    } else {
                        int size = arrayList.size();
                        if (size >= this.f2749f && size > 0) {
                            g(0);
                            size--;
                        }
                        if (RecyclerView.f1939C0 && size > 0) {
                            C0149m c0149m = recyclerView.f1974d0;
                            int i = y2.f2779c;
                            if (c0149m.f2901c != null) {
                                int i2 = c0149m.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0149m.f2901c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((Y) arrayList.get(i4)).f2779c;
                                C0149m c0149m2 = recyclerView.f1974d0;
                                if (c0149m2.f2901c == null) {
                                    break;
                                }
                                int i6 = c0149m2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0149m2.f2901c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, y2);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(y2, true);
                    }
                    r1 = z4;
                }
                recyclerView.f1979g.D(y2);
                if (r1 && !z5 && z2) {
                    H1.l.n(view);
                    y2.f2792s = null;
                    y2.f2791r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0161z abstractC0161z2 = recyclerView.f1987l;
        z3 = RecyclerView.f1943x0;
        ArrayList arrayList2 = this.f2747c;
        if (!z3) {
        }
        if (y2.h()) {
        }
        recyclerView.f1979g.D(y2);
        if (r1) {
        }
    }

    public final void j(View view) {
        AbstractC0134D abstractC0134D;
        Y L2 = RecyclerView.L(view);
        boolean d = L2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d && L2.l() && (abstractC0134D = recyclerView.f1954J) != null) {
            C0145i c0145i = (C0145i) abstractC0134D;
            if (L2.c().isEmpty() && c0145i.f2856g && !L2.g()) {
                if (this.f2746b == null) {
                    this.f2746b = new ArrayList();
                }
                L2.f2787n = this;
                L2.f2788o = true;
                this.f2746b.add(L2);
                return;
            }
        }
        if (L2.g() && !L2.i() && !recyclerView.f1987l.f2956b) {
            throw new IllegalArgumentException(AbstractC0001b.e(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        L2.f2787n = this;
        L2.f2788o = false;
        this.f2745a.add(L2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0463, code lost:
    
        if (r11.g() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ac, code lost:
    
        if ((r9 + r12) >= r27) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f5, code lost:
    
        if (r11.f2781f != 0) goto L119;
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
    public final Y k(int i, long j2) {
        boolean z2;
        Y y2;
        boolean z3;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        I i2;
        RecyclerView G2;
        Y y3;
        Y y4;
        View view;
        int b2;
        boolean z5;
        int size;
        int e2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1976e0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1976e0.b() + recyclerView.B());
        }
        U u2 = recyclerView.f1976e0;
        boolean z6 = false;
        if (u2.f2764g) {
            ArrayList arrayList = this.f2746b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        y2 = (Y) this.f2746b.get(i3);
                        if (!y2.q() && y2.b() == i) {
                            y2.a(32);
                            break;
                        }
                        i3++;
                    } else if (recyclerView.f1987l.f2956b && (e2 = recyclerView.f1975e.e(i, 0)) > 0 && e2 < recyclerView.f1987l.a()) {
                        long b3 = recyclerView.f1987l.b(e2);
                        for (int i4 = 0; i4 < size; i4++) {
                            Y y5 = (Y) this.f2746b.get(i4);
                            if (!y5.q() && y5.f2780e == b3) {
                                y5.a(32);
                                y2 = y5;
                                break;
                            }
                        }
                    }
                }
                z2 = y2 == null;
            }
            y2 = null;
            if (y2 == null) {
            }
        } else {
            z2 = false;
            y2 = null;
        }
        ArrayList arrayList2 = this.f2747c;
        ArrayList arrayList3 = this.f2745a;
        if (y2 == null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Y y6 = (Y) arrayList3.get(i5);
                if (!y6.q() && y6.b() == i && !y6.g() && (u2.f2764g || !y6.i())) {
                    y6.a(32);
                    y2 = y6;
                    break;
                }
            }
            ArrayList arrayList4 = recyclerView.f1977f.f2800c;
            int size3 = arrayList4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i6);
                Y L2 = RecyclerView.L(view);
                if (L2.b() == i && !L2.g() && !L2.i()) {
                    break;
                }
                i6++;
            }
            if (view == null) {
                int size4 = arrayList2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        y2 = null;
                        break;
                    }
                    y2 = (Y) arrayList2.get(i7);
                    if (y2.g() || y2.b() != i || y2.e()) {
                        i7++;
                    } else {
                        arrayList2.remove(i7);
                        if (RecyclerView.f1944y0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + y2);
                        }
                    }
                }
            } else {
                Y L3 = RecyclerView.L(view);
                C0138b c0138b = recyclerView.f1977f;
                int indexOfChild = c0138b.f2798a.f2954a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                F1.a aVar = c0138b.f2799b;
                if (!aVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                aVar.a(indexOfChild);
                c0138b.j(view);
                C0138b c0138b2 = recyclerView.f1977f;
                int indexOfChild2 = c0138b2.f2798a.f2954a.indexOfChild(view);
                if (indexOfChild2 != -1) {
                    F1.a aVar2 = c0138b2.f2799b;
                    if (!aVar2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - aVar2.b(indexOfChild2);
                        if (b2 != -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(L3);
                            throw new IllegalStateException(AbstractC0001b.e(recyclerView, sb));
                        }
                        recyclerView.f1977f.c(b2);
                        j(view);
                        L3.a(8224);
                        y2 = L3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (y2 != null) {
                if (!y2.i()) {
                    int i8 = y2.f2779c;
                    if (i8 < 0 || i8 >= recyclerView.f1987l.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(y2);
                        throw new IndexOutOfBoundsException(AbstractC0001b.e(recyclerView, sb2));
                    }
                    if (!u2.f2764g) {
                        recyclerView.f1987l.getClass();
                    }
                    AbstractC0161z abstractC0161z = recyclerView.f1987l;
                    if (!abstractC0161z.f2956b || y2.f2780e == abstractC0161z.b(y2.f2779c)) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (RecyclerView.f1943x0 && !u2.f2764g) {
                        throw new IllegalStateException(AbstractC0001b.e(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z5 = u2.f2764g;
                }
                if (z5) {
                    z2 = true;
                } else {
                    y2.a(4);
                    if (y2.j()) {
                        recyclerView.removeDetachedView(y2.f2777a, false);
                        y2.f2787n.l(y2);
                    } else if (y2.q()) {
                        y2.f2783j &= -33;
                    }
                    i(y2);
                    y2 = null;
                }
            }
        }
        if (y2 == null) {
            int e3 = recyclerView.f1975e.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1987l.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + u2.b() + recyclerView.B());
            }
            recyclerView.f1987l.getClass();
            AbstractC0161z abstractC0161z2 = recyclerView.f1987l;
            if (abstractC0161z2.f2956b) {
                long b4 = abstractC0161z2.b(e3);
                int size5 = arrayList3.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        Y y7 = (Y) arrayList3.get(size5);
                        if (y7.f2780e == b4 && !y7.q()) {
                            if (y7.f2781f == 0) {
                                y7.a(32);
                                if (y7.i() && !u2.f2764g) {
                                    y7.f2783j = (y7.f2783j & (-15)) | 2;
                                }
                                y4 = y7;
                            } else {
                                arrayList3.remove(size5);
                                View view2 = y7.f2777a;
                                recyclerView.removeDetachedView(view2, false);
                                Y L4 = RecyclerView.L(view2);
                                L4.f2787n = null;
                                L4.f2788o = false;
                                L4.f2783j &= -33;
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
                            y4 = (Y) arrayList2.get(size6);
                            if (y4.f2780e != b4 || y4.e()) {
                                size6--;
                            } else if (y4.f2781f == 0) {
                                arrayList2.remove(size6);
                            } else {
                                g(size6);
                            }
                        }
                        y4 = null;
                    }
                }
                if (y4 != null) {
                    y4.f2779c = e3;
                    y2 = y4;
                    z2 = true;
                } else {
                    y2 = y4;
                }
            }
            if (y2 == null) {
                if (RecyclerView.f1944y0) {
                    Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                }
                L l2 = (L) c().f2742a.get(0);
                if (l2 != null) {
                    ArrayList arrayList5 = l2.f2739a;
                    if (!arrayList5.isEmpty()) {
                        for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                            if (!((Y) arrayList5.get(size7)).e()) {
                                y3 = (Y) arrayList5.remove(size7);
                                break;
                            }
                        }
                    }
                }
                y3 = null;
                if (y3 != null) {
                    y3.n();
                    boolean z7 = RecyclerView.f1943x0;
                }
                y2 = y3;
            }
            if (y2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j3 = this.f2750g.a(0).f2741c;
                    if (!(j3 == 0 || j3 + nanoTime < j2)) {
                        return null;
                    }
                }
                AbstractC0161z abstractC0161z3 = recyclerView.f1987l;
                abstractC0161z3.getClass();
                try {
                    int i9 = G.h.f291a;
                    Trace.beginSection("RV CreateView");
                    y2 = abstractC0161z3.d(recyclerView);
                    View view3 = y2.f2777a;
                    if (view3.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    y2.f2781f = 0;
                    Trace.endSection();
                    if (RecyclerView.f1939C0 && (G2 = RecyclerView.G(view3)) != null) {
                        y2.f2778b = new WeakReference(G2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    L a2 = this.f2750g.a(0);
                    long j4 = a2.f2741c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2741c = nanoTime2;
                    if (RecyclerView.f1944y0) {
                        Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } finally {
                    int i10 = G.h.f291a;
                    Trace.endSection();
                }
            }
        }
        if (z2 && !u2.f2764g && y2.d(8192)) {
            y2.f2783j &= -8193;
            if (u2.f2765j) {
                AbstractC0134D.b(y2);
                AbstractC0134D abstractC0134D = recyclerView.f1954J;
                y2.c();
                abstractC0134D.getClass();
                C0019o c0019o = new C0019o();
                c0019o.a(y2);
                recyclerView.X(y2, c0019o);
            }
        }
        boolean z8 = u2.f2764g;
        View view4 = y2.f2777a;
        if (!z8 || !y2.f()) {
            if (y2.f()) {
                if (!((y2.f2783j & 2) != 0)) {
                }
            }
            if (RecyclerView.f1943x0 && y2.i()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(y2);
                throw new IllegalStateException(AbstractC0001b.e(recyclerView, sb3));
            }
            int e4 = recyclerView.f1975e.e(i, 0);
            y2.f2792s = null;
            y2.f2791r = recyclerView;
            int i11 = y2.f2781f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j2 != Long.MAX_VALUE) {
                long j5 = this.f2750g.a(i11).d;
                if (j5 != 0) {
                }
            }
            if (y2.k()) {
                recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0161z abstractC0161z4 = recyclerView.f1987l;
            abstractC0161z4.getClass();
            boolean z9 = y2.f2792s == null;
            if (z9) {
                y2.f2779c = e4;
                if (abstractC0161z4.f2956b) {
                    y2.f2780e = abstractC0161z4.b(e4);
                }
                y2.f2783j = (y2.f2783j & (-520)) | 1;
                int i12 = G.h.f291a;
                Trace.beginSection("RV OnBindView");
            }
            y2.f2792s = abstractC0161z4;
            if (RecyclerView.f1943x0) {
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap = K.Q.f578a;
                    if (view4.isAttachedToWindow() != y2.k()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + y2.k() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + y2);
                    }
                }
                if (view4.getParent() == null) {
                    WeakHashMap weakHashMap2 = K.Q.f578a;
                    if (view4.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + y2);
                    }
                }
            }
            y2.c();
            abstractC0161z4.c(y2, e4);
            if (z9) {
                ArrayList arrayList6 = y2.f2784k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                y2.f2783j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof I) {
                    ((I) layoutParams2).f2738c = true;
                }
            }
            if (z3) {
                recyclerView.detachViewFromParent(view4);
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            L a3 = this.f2750g.a(y2.f2781f);
            long j6 = a3.d;
            if (j6 != 0) {
                nanoTime4 = (nanoTime4 / 4) + ((j6 / 4) * 3);
            }
            a3.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.f2011z;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap3 = K.Q.f578a;
                if (view4.getImportantForAccessibility() == 0) {
                    z4 = true;
                    view4.setImportantForAccessibility(1);
                } else {
                    z4 = true;
                }
                a0 a0Var = recyclerView.f1988l0;
                if (a0Var != null) {
                    Z z10 = a0Var.f2797e;
                    if (z10 != null) {
                        View.AccessibilityDelegate c2 = K.Q.c(view4);
                        C0006b c0006b = c2 == null ? null : c2 instanceof C0005a ? ((C0005a) c2).f592a : new C0006b(c2);
                        if (c0006b != null && c0006b != z10) {
                            z10.f2793e.put(view4, c0006b);
                        }
                    }
                    K.Q.l(view4, z10);
                }
            } else {
                z4 = true;
            }
            if (u2.f2764g) {
                y2.f2782g = i;
            }
            z6 = z4;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                i2 = (I) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(i2);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                i2 = (I) layoutParams;
            } else {
                i2 = (I) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(i2);
            }
            i2.f2736a = y2;
            i2.d = (z2 || !z6) ? false : z4;
            return y2;
        }
        y2.f2782g = i;
        z4 = true;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        i2.f2736a = y2;
        i2.d = (z2 || !z6) ? false : z4;
        return y2;
    }

    public final void l(Y y2) {
        if (y2.f2788o) {
            this.f2746b.remove(y2);
        } else {
            this.f2745a.remove(y2);
        }
        y2.f2787n = null;
        y2.f2788o = false;
        y2.f2783j &= -33;
    }

    public final void m() {
        H h = this.h.f1989m;
        this.f2749f = this.f2748e + (h != null ? h.f2730j : 0);
        ArrayList arrayList = this.f2747c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2749f; size--) {
            g(size);
        }
    }
}
