package f0;

import K.C0000a;
import K.C0001b;
import K.C0012m;
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

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2162a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2163b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2164c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2165e;

    /* renamed from: f, reason: collision with root package name */
    public int f2166f;

    /* renamed from: g, reason: collision with root package name */
    public M f2167g;
    public final /* synthetic */ RecyclerView h;

    public N(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2162a = arrayList;
        this.f2163b = null;
        this.f2164c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2165e = 2;
        this.f2166f = 2;
    }

    public final void a(W w2, boolean z2) {
        RecyclerView.j(w2);
        RecyclerView recyclerView = this.h;
        Y y2 = recyclerView.f1597j0;
        if (y2 != null) {
            X x2 = y2.f2209e;
            View view = w2.f2193a;
            K.S.l(view, x2 != null ? (C0001b) x2.f2208e.remove(view) : null);
        }
        if (z2 && recyclerView.f1586c0 != null) {
            recyclerView.f1590f.I(w2);
        }
        w2.f2207r = null;
        M c2 = c();
        c2.getClass();
        int i = w2.f2197f;
        ArrayList arrayList = c2.a(i).f2157a;
        if (((L) c2.f2160a.get(i)).f2158b <= arrayList.size()) {
            return;
        }
        w2.n();
        arrayList.add(w2);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1586c0.b()) {
            return !recyclerView.f1586c0.f2180g ? i : recyclerView.d.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1586c0.b() + recyclerView.y());
    }

    public final M c() {
        if (this.f2167g == null) {
            M m2 = new M();
            m2.f2160a = new SparseArray();
            m2.f2161b = 0;
            this.f2167g = m2;
        }
        return this.f2167g;
    }

    public final void d() {
        ArrayList arrayList = this.f2164c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1556s0;
        C0107m c0107m = this.h.f1584b0;
        int[] iArr2 = c0107m.f2314c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0107m.d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f2164c;
        a((W) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        W I2 = RecyclerView.I(view);
        boolean k2 = I2.k();
        RecyclerView recyclerView = this.h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.j()) {
            I2.f2203n.j(I2);
        } else if (I2.q()) {
            I2.f2199j &= -33;
        }
        g(I2);
        if (recyclerView.f1565H == null || I2.h()) {
            return;
        }
        recyclerView.f1565H.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(W w2) {
        boolean z2;
        boolean z3;
        boolean j2 = w2.j();
        boolean z4 = true;
        RecyclerView recyclerView = this.h;
        View view = w2.f2193a;
        if (j2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(w2.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (w2.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + w2 + recyclerView.y());
        }
        if (w2.p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((w2.f2199j & 16) == 0) {
            WeakHashMap weakHashMap = K.S.f365a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0119z abstractC0119z = recyclerView.f1598k;
                if (w2.h()) {
                    z4 = false;
                } else {
                    if (this.f2166f <= 0 || w2.d(526)) {
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.f2164c;
                        int size = arrayList.size();
                        if (size >= this.f2166f && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f1556s0;
                        if (size > 0) {
                            C0107m c0107m = recyclerView.f1584b0;
                            int i = w2.f2195c;
                            if (c0107m.f2314c != null) {
                                int i2 = c0107m.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0107m.f2314c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((W) arrayList.get(i4)).f2195c;
                                C0107m c0107m2 = recyclerView.f1584b0;
                                if (c0107m2.f2314c == null) {
                                    break;
                                }
                                int i6 = c0107m2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0107m2.f2314c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, w2);
                        z3 = true;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        a(w2, true);
                    }
                    r1 = z3;
                }
                recyclerView.f1590f.I(w2);
                if (r1 && !z4 && z2) {
                    w2.f2207r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0119z abstractC0119z2 = recyclerView.f1598k;
        if (w2.h()) {
        }
        recyclerView.f1590f.I(w2);
        if (r1) {
        }
    }

    public final void h(View view) {
        D d;
        W I2 = RecyclerView.I(view);
        boolean d2 = I2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d2 && I2.l() && (d = recyclerView.f1565H) != null) {
            C0103i c0103i = (C0103i) d;
            if (I2.c().isEmpty() && c0103i.f2272g && !I2.g()) {
                if (this.f2163b == null) {
                    this.f2163b = new ArrayList();
                }
                I2.f2203n = this;
                I2.f2204o = true;
                this.f2163b.add(I2);
                return;
            }
        }
        if (I2.g() && !I2.i() && !recyclerView.f1598k.f2369b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f2203n = this;
        I2.f2204o = false;
        this.f2162a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f2197f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x051b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final W i(int i, long j2) {
        boolean z2;
        W w2;
        C0001b c0001b;
        boolean z3;
        View view;
        AbstractC0119z abstractC0119z;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j3;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams2;
        I i2;
        W w3;
        View view2;
        int b2;
        boolean z6;
        int size;
        int e2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1586c0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1586c0.b() + recyclerView.y());
        }
        T t2 = recyclerView.f1586c0;
        if (t2.f2180g) {
            ArrayList arrayList2 = this.f2163b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        w2 = (W) this.f2163b.get(i3);
                        if (!w2.q() && w2.b() == i) {
                            w2.a(32);
                            break;
                        }
                        i3++;
                    } else if (recyclerView.f1598k.f2369b && (e2 = recyclerView.d.e(i, 0)) > 0 && e2 < recyclerView.f1598k.a()) {
                        long b3 = recyclerView.f1598k.b(e2);
                        for (int i4 = 0; i4 < size; i4++) {
                            W w4 = (W) this.f2163b.get(i4);
                            if (!w4.q() && w4.f2196e == b3) {
                                w4.a(32);
                                w2 = w4;
                                break;
                            }
                        }
                    }
                }
                z2 = w2 == null;
            }
            w2 = null;
            if (w2 == null) {
            }
        } else {
            z2 = false;
            w2 = null;
        }
        ArrayList arrayList3 = this.f2164c;
        ArrayList arrayList4 = this.f2162a;
        if (w2 == null) {
            int size2 = arrayList4.size();
            for (int i5 = 0; i5 < size2; i5++) {
                W w5 = (W) arrayList4.get(i5);
                if (!w5.q() && w5.b() == i && !w5.g() && (t2.f2180g || !w5.i())) {
                    w5.a(32);
                    w2 = w5;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f1588e.d;
            int size3 = arrayList5.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i6);
                W I2 = RecyclerView.I(view2);
                if (I2.b() == i && !I2.g() && !I2.i()) {
                    break;
                }
                i6++;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        w2 = null;
                        break;
                    }
                    W w6 = (W) arrayList3.get(i7);
                    if (!w6.g() && w6.b() == i && !w6.e()) {
                        arrayList3.remove(i7);
                        w2 = w6;
                        break;
                    }
                    i7++;
                }
            } else {
                W I3 = RecyclerView.I(view2);
                C0012m c0012m = recyclerView.f1588e;
                int indexOfChild = ((C0118y) c0012m.f422b).f2367a.indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C0096b c0096b = (C0096b) c0012m.f423c;
                if (!c0096b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c0096b.a(indexOfChild);
                c0012m.v(view2);
                C0012m c0012m2 = recyclerView.f1588e;
                int indexOfChild2 = ((C0118y) c0012m2.f422b).f2367a.indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C0096b c0096b2 = (C0096b) c0012m2.f423c;
                    if (!c0096b2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0096b2.b(indexOfChild2);
                        if (b2 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I3 + recyclerView.y());
                        }
                        recyclerView.f1588e.d(b2);
                        h(view2);
                        I3.a(8224);
                        w2 = I3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (w2 != null) {
                if (w2.i()) {
                    z6 = t2.f2180g;
                } else {
                    int i8 = w2.f2195c;
                    if (i8 < 0 || i8 >= recyclerView.f1598k.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + w2 + recyclerView.y());
                    }
                    if (!t2.f2180g) {
                        recyclerView.f1598k.getClass();
                    }
                    AbstractC0119z abstractC0119z2 = recyclerView.f1598k;
                    if (!abstractC0119z2.f2369b || w2.f2196e == abstractC0119z2.b(w2.f2195c)) {
                        z6 = true;
                    }
                    z6 = false;
                }
                if (z6) {
                    z2 = true;
                } else {
                    w2.a(4);
                    if (w2.j()) {
                        recyclerView.removeDetachedView(w2.f2193a, false);
                        w2.f2203n.j(w2);
                    } else if (w2.q()) {
                        w2.f2199j &= -33;
                    }
                    g(w2);
                    w2 = null;
                }
            }
        }
        if (w2 == null) {
            int e3 = recyclerView.d.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1598k.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + t2.b() + recyclerView.y());
            }
            recyclerView.f1598k.getClass();
            AbstractC0119z abstractC0119z3 = recyclerView.f1598k;
            if (abstractC0119z3.f2369b) {
                long b4 = abstractC0119z3.b(e3);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        W w7 = (W) arrayList4.get(size5);
                        if (w7.f2196e == b4 && !w7.q()) {
                            if (w7.f2197f == 0) {
                                w7.a(32);
                                if (w7.i() && !t2.f2180g) {
                                    w7.f2199j = (w7.f2199j & (-15)) | 2;
                                }
                                w2 = w7;
                            } else {
                                arrayList4.remove(size5);
                                View view3 = w7.f2193a;
                                recyclerView.removeDetachedView(view3, false);
                                W I4 = RecyclerView.I(view3);
                                I4.f2203n = null;
                                I4.f2204o = false;
                                I4.f2199j &= -33;
                                g(I4);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            W w8 = (W) arrayList3.get(size6);
                            if (w8.f2196e != b4 || w8.e()) {
                                size6--;
                            } else if (w8.f2197f == 0) {
                                arrayList3.remove(size6);
                                w2 = w8;
                            } else {
                                e(size6);
                            }
                        }
                        w2 = null;
                    }
                }
                if (w2 != null) {
                    w2.f2195c = e3;
                    z2 = true;
                }
            }
            if (w2 == null) {
                L l2 = (L) c().f2160a.get(0);
                if (l2 != null) {
                    ArrayList arrayList6 = l2.f2157a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((W) arrayList6.get(size7)).e()) {
                                w3 = (W) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                w3 = null;
                if (w3 != null) {
                    w3.n();
                    int[] iArr = RecyclerView.f1556s0;
                }
                w2 = w3;
            }
            if (w2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j4 = this.f2167g.a(0).f2159c;
                    if (!(j4 == 0 || j4 + nanoTime < j2)) {
                        return null;
                    }
                }
                c0001b = null;
                AbstractC0119z abstractC0119z4 = recyclerView.f1598k;
                abstractC0119z4.getClass();
                try {
                    int i9 = G.h.f211a;
                    Trace.beginSection("RV CreateView");
                    w2 = abstractC0119z4.d(recyclerView);
                    View view4 = w2.f2193a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    w2.f2197f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f1556s0;
                    RecyclerView D2 = RecyclerView.D(view4);
                    if (D2 != null) {
                        w2.f2194b = new WeakReference(D2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    L a2 = this.f2167g.a(0);
                    long j5 = a2.f2159c;
                    if (j5 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j5 / 4) * 3);
                    }
                    a2.f2159c = nanoTime2;
                    if (z2 && !t2.f2180g && w2.d(8192)) {
                        w2.f2199j &= -8193;
                        if (t2.f2181j) {
                            D.b(w2);
                            D d = recyclerView.f1565H;
                            w2.c();
                            d.getClass();
                            K.r rVar = new K.r();
                            rVar.a(w2);
                            recyclerView.T(w2, rVar);
                        }
                    }
                    z3 = t2.f2180g;
                    view = w2.f2193a;
                    if (z3 || !w2.f()) {
                        if (w2.f()) {
                            if (!((w2.f2199j & 2) != 0)) {
                            }
                        }
                        int e4 = recyclerView.d.e(i, 0);
                        w2.f2207r = recyclerView;
                        int i10 = w2.f2197f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j6 = this.f2167g.a(i10).d;
                            if (j6 != 0) {
                            }
                        }
                        abstractC0119z = recyclerView.f1598k;
                        abstractC0119z.getClass();
                        w2.f2195c = e4;
                        if (abstractC0119z.f2369b) {
                            w2.f2196e = abstractC0119z.b(e4);
                        }
                        w2.f2199j = (w2.f2199j & (-520)) | 1;
                        int i11 = G.h.f211a;
                        Trace.beginSection("RV OnBindView");
                        w2.c();
                        abstractC0119z.c(w2, e4);
                        arrayList = w2.f2200k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        w2.f2199j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof I) {
                            ((I) layoutParams).f2156c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        L a3 = this.f2167g.a(w2.f2197f);
                        j3 = a3.d;
                        if (j3 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j3 / 4) * 3);
                        }
                        a3.d = nanoTime4;
                        accessibilityManager = recyclerView.f1617x;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = K.S.f365a;
                            if (view.getImportantForAccessibility() == 0) {
                                z4 = true;
                                view.setImportantForAccessibility(1);
                            } else {
                                z4 = true;
                            }
                            Y y2 = recyclerView.f1597j0;
                            if (y2 != null) {
                                X x2 = y2.f2209e;
                                if (x2 != null) {
                                    View.AccessibilityDelegate c2 = K.S.c(view);
                                    if (c2 != null) {
                                        c0001b = c2 instanceof C0000a ? ((C0000a) c2).f375a : new C0001b(c2);
                                    }
                                    if (c0001b != null && c0001b != x2) {
                                        x2.f2208e.put(view, c0001b);
                                    }
                                }
                                K.S.l(view, x2);
                            }
                        }
                        if (t2.f2180g) {
                            w2.f2198g = i;
                        }
                        z5 = z4;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            i2 = (I) recyclerView.generateDefaultLayoutParams();
                            view.setLayoutParams(i2);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                            i2 = (I) layoutParams2;
                        } else {
                            i2 = (I) recyclerView.generateLayoutParams(layoutParams2);
                            view.setLayoutParams(i2);
                        }
                        i2.f2154a = w2;
                        i2.d = (z2 || !z5) ? false : z4;
                        return w2;
                    }
                    w2.f2198g = i;
                    z5 = false;
                    z4 = true;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    i2.f2154a = w2;
                    i2.d = (z2 || !z5) ? false : z4;
                    return w2;
                } catch (Throwable th) {
                    int i12 = G.h.f211a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        c0001b = null;
        if (z2) {
            w2.f2199j &= -8193;
            if (t2.f2181j) {
            }
        }
        z3 = t2.f2180g;
        view = w2.f2193a;
        if (z3) {
        }
        if (w2.f()) {
        }
        int e42 = recyclerView.d.e(i, 0);
        w2.f2207r = recyclerView;
        int i102 = w2.f2197f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j2 != Long.MAX_VALUE) {
        }
        abstractC0119z = recyclerView.f1598k;
        abstractC0119z.getClass();
        w2.f2195c = e42;
        if (abstractC0119z.f2369b) {
        }
        w2.f2199j = (w2.f2199j & (-520)) | 1;
        int i112 = G.h.f211a;
        Trace.beginSection("RV OnBindView");
        w2.c();
        abstractC0119z.c(w2, e42);
        arrayList = w2.f2200k;
        if (arrayList != null) {
        }
        w2.f2199j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof I) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        L a32 = this.f2167g.a(w2.f2197f);
        j3 = a32.d;
        if (j3 != 0) {
        }
        a32.d = nanoTime42;
        accessibilityManager = recyclerView.f1617x;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (t2.f2180g) {
        }
        z5 = z4;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
        }
        i2.f2154a = w2;
        i2.d = (z2 || !z5) ? false : z4;
        return w2;
    }

    public final void j(W w2) {
        if (w2.f2204o) {
            this.f2163b.remove(w2);
        } else {
            this.f2162a.remove(w2);
        }
        w2.f2203n = null;
        w2.f2204o = false;
        w2.f2199j &= -33;
    }

    public final void k() {
        H h = this.h.f1600l;
        this.f2166f = this.f2165e + (h != null ? h.f2148j : 0);
        ArrayList arrayList = this.f2164c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2166f; size--) {
            e(size);
        }
    }
}
