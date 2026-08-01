package f0;

import K.C0000a;
import K.C0001b;
import K.C0011l;
import K.C0016q;
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
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2045a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2046b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2047c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f2048e;

    /* renamed from: f, reason: collision with root package name */
    public int f2049f;

    /* renamed from: g, reason: collision with root package name */
    public N f2050g;
    public final /* synthetic */ RecyclerView h;

    public O(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2045a = arrayList;
        this.f2046b = null;
        this.f2047c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f2048e = 2;
        this.f2049f = 2;
    }

    public final void a(X x2, boolean z2) {
        RecyclerView.j(x2);
        RecyclerView recyclerView = this.h;
        Z z3 = recyclerView.f1510j0;
        if (z3 != null) {
            Y y2 = z3.f2092e;
            View view = x2.f2076a;
            K.S.l(view, y2 != null ? (C0001b) y2.f2091e.remove(view) : null);
        }
        if (z2 && recyclerView.f1499c0 != null) {
            recyclerView.f1503f.I(x2);
        }
        x2.f2090r = null;
        N c2 = c();
        c2.getClass();
        int i = x2.f2080f;
        ArrayList arrayList = c2.a(i).f2040a;
        if (((M) c2.f2043a.get(i)).f2041b <= arrayList.size()) {
            return;
        }
        x2.n();
        arrayList.add(x2);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1499c0.b()) {
            return !recyclerView.f1499c0.f2063g ? i : recyclerView.d.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1499c0.b() + recyclerView.y());
    }

    public final N c() {
        if (this.f2050g == null) {
            N n2 = new N();
            n2.f2043a = new SparseArray();
            n2.f2044b = 0;
            this.f2050g = n2;
        }
        return this.f2050g;
    }

    public final void d() {
        ArrayList arrayList = this.f2047c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1469s0;
        C0104m c0104m = this.h.f1497b0;
        int[] iArr2 = c0104m.f2198c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0104m.d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f2047c;
        a((X) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        X I2 = RecyclerView.I(view);
        boolean k2 = I2.k();
        RecyclerView recyclerView = this.h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.j()) {
            I2.f2086n.j(I2);
        } else if (I2.q()) {
            I2.f2082j &= -33;
        }
        g(I2);
        if (recyclerView.f1478H == null || I2.h()) {
            return;
        }
        recyclerView.f1478H.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(X x2) {
        boolean z2;
        boolean z3;
        boolean j2 = x2.j();
        boolean z4 = true;
        RecyclerView recyclerView = this.h;
        View view = x2.f2076a;
        if (j2 || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(x2.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (x2.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + x2 + recyclerView.y());
        }
        if (x2.p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((x2.f2082j & 16) == 0) {
            WeakHashMap weakHashMap = K.S.f369a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0086A abstractC0086A = recyclerView.f1511k;
                if (x2.h()) {
                    z4 = false;
                } else {
                    if (this.f2049f <= 0 || x2.d(526)) {
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.f2047c;
                        int size = arrayList.size();
                        if (size >= this.f2049f && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f1469s0;
                        if (size > 0) {
                            C0104m c0104m = recyclerView.f1497b0;
                            int i = x2.f2078c;
                            if (c0104m.f2198c != null) {
                                int i2 = c0104m.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0104m.f2198c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((X) arrayList.get(i4)).f2078c;
                                C0104m c0104m2 = recyclerView.f1497b0;
                                if (c0104m2.f2198c == null) {
                                    break;
                                }
                                int i6 = c0104m2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0104m2.f2198c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, x2);
                        z3 = true;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        a(x2, true);
                    }
                    r1 = z3;
                }
                recyclerView.f1503f.I(x2);
                if (r1 && !z4 && z2) {
                    x2.f2090r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0086A abstractC0086A2 = recyclerView.f1511k;
        if (x2.h()) {
        }
        recyclerView.f1503f.I(x2);
        if (r1) {
        }
    }

    public final void h(View view) {
        AbstractC0090E abstractC0090E;
        X I2 = RecyclerView.I(view);
        boolean d = I2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d && I2.l() && (abstractC0090E = recyclerView.f1478H) != null) {
            C0100i c0100i = (C0100i) abstractC0090E;
            if (I2.c().isEmpty() && c0100i.f2156g && !I2.g()) {
                if (this.f2046b == null) {
                    this.f2046b = new ArrayList();
                }
                I2.f2086n = this;
                I2.f2087o = true;
                this.f2046b.add(I2);
                return;
            }
        }
        if (I2.g() && !I2.i() && !recyclerView.f1511k.f2014b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f2086n = this;
        I2.f2087o = false;
        this.f2045a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f2080f != 0) goto L110;
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
    public final X i(int i, long j2) {
        boolean z2;
        X x2;
        C0001b c0001b;
        boolean z3;
        View view;
        AbstractC0086A abstractC0086A;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j3;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams2;
        J j4;
        X x3;
        View view2;
        int b2;
        boolean z6;
        int size;
        int e2;
        RecyclerView recyclerView = this.h;
        if (i < 0 || i >= recyclerView.f1499c0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1499c0.b() + recyclerView.y());
        }
        U u2 = recyclerView.f1499c0;
        if (u2.f2063g) {
            ArrayList arrayList2 = this.f2046b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        x2 = (X) this.f2046b.get(i2);
                        if (!x2.q() && x2.b() == i) {
                            x2.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1511k.f2014b && (e2 = recyclerView.d.e(i, 0)) > 0 && e2 < recyclerView.f1511k.a()) {
                        long b3 = recyclerView.f1511k.b(e2);
                        for (int i3 = 0; i3 < size; i3++) {
                            X x4 = (X) this.f2046b.get(i3);
                            if (!x4.q() && x4.f2079e == b3) {
                                x4.a(32);
                                x2 = x4;
                                break;
                            }
                        }
                    }
                }
                z2 = x2 == null;
            }
            x2 = null;
            if (x2 == null) {
            }
        } else {
            z2 = false;
            x2 = null;
        }
        ArrayList arrayList3 = this.f2047c;
        ArrayList arrayList4 = this.f2045a;
        if (x2 == null) {
            int size2 = arrayList4.size();
            for (int i4 = 0; i4 < size2; i4++) {
                X x5 = (X) arrayList4.get(i4);
                if (!x5.q() && x5.b() == i && !x5.g() && (u2.f2063g || !x5.i())) {
                    x5.a(32);
                    x2 = x5;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f1501e.d;
            int size3 = arrayList5.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i5);
                X I2 = RecyclerView.I(view2);
                if (I2.b() == i && !I2.g() && !I2.i()) {
                    break;
                }
                i5++;
            }
            if (view2 == null) {
                int size4 = arrayList3.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        x2 = null;
                        break;
                    }
                    X x6 = (X) arrayList3.get(i6);
                    if (!x6.g() && x6.b() == i && !x6.e()) {
                        arrayList3.remove(i6);
                        x2 = x6;
                        break;
                    }
                    i6++;
                }
            } else {
                X I3 = RecyclerView.I(view2);
                C0011l c0011l = recyclerView.f1501e;
                int indexOfChild = ((C0116z) c0011l.f422b).f2253a.indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C0093b c0093b = (C0093b) c0011l.f423c;
                if (!c0093b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c0093b.a(indexOfChild);
                c0011l.v(view2);
                C0011l c0011l2 = recyclerView.f1501e;
                int indexOfChild2 = ((C0116z) c0011l2.f422b).f2253a.indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C0093b c0093b2 = (C0093b) c0011l2.f423c;
                    if (!c0093b2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0093b2.b(indexOfChild2);
                        if (b2 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I3 + recyclerView.y());
                        }
                        recyclerView.f1501e.d(b2);
                        h(view2);
                        I3.a(8224);
                        x2 = I3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (x2 != null) {
                if (x2.i()) {
                    z6 = u2.f2063g;
                } else {
                    int i7 = x2.f2078c;
                    if (i7 < 0 || i7 >= recyclerView.f1511k.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + x2 + recyclerView.y());
                    }
                    if (!u2.f2063g) {
                        recyclerView.f1511k.getClass();
                    }
                    AbstractC0086A abstractC0086A2 = recyclerView.f1511k;
                    if (!abstractC0086A2.f2014b || x2.f2079e == abstractC0086A2.b(x2.f2078c)) {
                        z6 = true;
                    }
                    z6 = false;
                }
                if (z6) {
                    z2 = true;
                } else {
                    x2.a(4);
                    if (x2.j()) {
                        recyclerView.removeDetachedView(x2.f2076a, false);
                        x2.f2086n.j(x2);
                    } else if (x2.q()) {
                        x2.f2082j &= -33;
                    }
                    g(x2);
                    x2 = null;
                }
            }
        }
        if (x2 == null) {
            int e3 = recyclerView.d.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1511k.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + u2.b() + recyclerView.y());
            }
            recyclerView.f1511k.getClass();
            AbstractC0086A abstractC0086A3 = recyclerView.f1511k;
            if (abstractC0086A3.f2014b) {
                long b4 = abstractC0086A3.b(e3);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        X x7 = (X) arrayList4.get(size5);
                        if (x7.f2079e == b4 && !x7.q()) {
                            if (x7.f2080f == 0) {
                                x7.a(32);
                                if (x7.i() && !u2.f2063g) {
                                    x7.f2082j = (x7.f2082j & (-15)) | 2;
                                }
                                x2 = x7;
                            } else {
                                arrayList4.remove(size5);
                                View view3 = x7.f2076a;
                                recyclerView.removeDetachedView(view3, false);
                                X I4 = RecyclerView.I(view3);
                                I4.f2086n = null;
                                I4.f2087o = false;
                                I4.f2082j &= -33;
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
                            X x8 = (X) arrayList3.get(size6);
                            if (x8.f2079e != b4 || x8.e()) {
                                size6--;
                            } else if (x8.f2080f == 0) {
                                arrayList3.remove(size6);
                                x2 = x8;
                            } else {
                                e(size6);
                            }
                        }
                        x2 = null;
                    }
                }
                if (x2 != null) {
                    x2.f2078c = e3;
                    z2 = true;
                }
            }
            if (x2 == null) {
                M m2 = (M) c().f2043a.get(0);
                if (m2 != null) {
                    ArrayList arrayList6 = m2.f2040a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((X) arrayList6.get(size7)).e()) {
                                x3 = (X) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                x3 = null;
                if (x3 != null) {
                    x3.n();
                    int[] iArr = RecyclerView.f1469s0;
                }
                x2 = x3;
            }
            if (x2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j5 = this.f2050g.a(0).f2042c;
                    if (!(j5 == 0 || j5 + nanoTime < j2)) {
                        return null;
                    }
                }
                c0001b = null;
                AbstractC0086A abstractC0086A4 = recyclerView.f1511k;
                abstractC0086A4.getClass();
                try {
                    int i8 = G.h.f194a;
                    Trace.beginSection("RV CreateView");
                    x2 = abstractC0086A4.d(recyclerView);
                    View view4 = x2.f2076a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    x2.f2080f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f1469s0;
                    RecyclerView D2 = RecyclerView.D(view4);
                    if (D2 != null) {
                        x2.f2077b = new WeakReference(D2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    M a2 = this.f2050g.a(0);
                    long j6 = a2.f2042c;
                    if (j6 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                    }
                    a2.f2042c = nanoTime2;
                    if (z2 && !u2.f2063g && x2.d(8192)) {
                        x2.f2082j &= -8193;
                        if (u2.f2064j) {
                            AbstractC0090E.b(x2);
                            AbstractC0090E abstractC0090E = recyclerView.f1478H;
                            x2.c();
                            abstractC0090E.getClass();
                            C0016q c0016q = new C0016q();
                            c0016q.a(x2);
                            recyclerView.T(x2, c0016q);
                        }
                    }
                    z3 = u2.f2063g;
                    view = x2.f2076a;
                    if (z3 || !x2.f()) {
                        if (x2.f()) {
                            if (!((x2.f2082j & 2) != 0)) {
                            }
                        }
                        int e4 = recyclerView.d.e(i, 0);
                        x2.f2090r = recyclerView;
                        int i9 = x2.f2080f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j7 = this.f2050g.a(i9).d;
                            if (j7 != 0) {
                            }
                        }
                        abstractC0086A = recyclerView.f1511k;
                        abstractC0086A.getClass();
                        x2.f2078c = e4;
                        if (abstractC0086A.f2014b) {
                            x2.f2079e = abstractC0086A.b(e4);
                        }
                        x2.f2082j = (x2.f2082j & (-520)) | 1;
                        int i10 = G.h.f194a;
                        Trace.beginSection("RV OnBindView");
                        x2.c();
                        abstractC0086A.c(x2, e4);
                        arrayList = x2.f2083k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        x2.f2082j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof J) {
                            ((J) layoutParams).f2039c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        M a3 = this.f2050g.a(x2.f2080f);
                        j3 = a3.d;
                        if (j3 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j3 / 4) * 3);
                        }
                        a3.d = nanoTime4;
                        accessibilityManager = recyclerView.f1531x;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = K.S.f369a;
                            if (view.getImportantForAccessibility() == 0) {
                                z4 = true;
                                view.setImportantForAccessibility(1);
                            } else {
                                z4 = true;
                            }
                            Z z7 = recyclerView.f1510j0;
                            if (z7 != null) {
                                Y y2 = z7.f2092e;
                                if (y2 != null) {
                                    View.AccessibilityDelegate c2 = K.S.c(view);
                                    if (c2 != null) {
                                        c0001b = c2 instanceof C0000a ? ((C0000a) c2).f379a : new C0001b(c2);
                                    }
                                    if (c0001b != null && c0001b != y2) {
                                        y2.f2091e.put(view, c0001b);
                                    }
                                }
                                K.S.l(view, y2);
                            }
                        }
                        if (u2.f2063g) {
                            x2.f2081g = i;
                        }
                        z5 = z4;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            j4 = (J) recyclerView.generateDefaultLayoutParams();
                            view.setLayoutParams(j4);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                            j4 = (J) layoutParams2;
                        } else {
                            j4 = (J) recyclerView.generateLayoutParams(layoutParams2);
                            view.setLayoutParams(j4);
                        }
                        j4.f2037a = x2;
                        j4.d = (z2 || !z5) ? false : z4;
                        return x2;
                    }
                    x2.f2081g = i;
                    z5 = false;
                    z4 = true;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    j4.f2037a = x2;
                    j4.d = (z2 || !z5) ? false : z4;
                    return x2;
                } catch (Throwable th) {
                    int i11 = G.h.f194a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        c0001b = null;
        if (z2) {
            x2.f2082j &= -8193;
            if (u2.f2064j) {
            }
        }
        z3 = u2.f2063g;
        view = x2.f2076a;
        if (z3) {
        }
        if (x2.f()) {
        }
        int e42 = recyclerView.d.e(i, 0);
        x2.f2090r = recyclerView;
        int i92 = x2.f2080f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j2 != Long.MAX_VALUE) {
        }
        abstractC0086A = recyclerView.f1511k;
        abstractC0086A.getClass();
        x2.f2078c = e42;
        if (abstractC0086A.f2014b) {
        }
        x2.f2082j = (x2.f2082j & (-520)) | 1;
        int i102 = G.h.f194a;
        Trace.beginSection("RV OnBindView");
        x2.c();
        abstractC0086A.c(x2, e42);
        arrayList = x2.f2083k;
        if (arrayList != null) {
        }
        x2.f2082j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof J) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        M a32 = this.f2050g.a(x2.f2080f);
        j3 = a32.d;
        if (j3 != 0) {
        }
        a32.d = nanoTime42;
        accessibilityManager = recyclerView.f1531x;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (u2.f2063g) {
        }
        z5 = z4;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
        }
        j4.f2037a = x2;
        j4.d = (z2 || !z5) ? false : z4;
        return x2;
    }

    public final void j(X x2) {
        if (x2.f2087o) {
            this.f2046b.remove(x2);
        } else {
            this.f2045a.remove(x2);
        }
        x2.f2086n = null;
        x2.f2087o = false;
        x2.f2082j &= -33;
    }

    public final void k() {
        I i = this.h.f1513l;
        this.f2049f = this.f2048e + (i != null ? i.f2031j : 0);
        ArrayList arrayList = this.f2047c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2049f; size--) {
            e(size);
        }
    }
}
