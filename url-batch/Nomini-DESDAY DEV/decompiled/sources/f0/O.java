package f0;

import K.C0000a;
import K.C0002b;
import K.C0012l;
import K.C0017q;
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
    public final ArrayList f1975a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1976b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1977c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f1978e;

    /* renamed from: f, reason: collision with root package name */
    public int f1979f;

    /* renamed from: g, reason: collision with root package name */
    public N f1980g;
    public final /* synthetic */ RecyclerView h;

    public O(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1975a = arrayList;
        this.f1976b = null;
        this.f1977c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f1978e = 2;
        this.f1979f = 2;
    }

    public final void a(X x2, boolean z2) {
        RecyclerView.j(x2);
        RecyclerView recyclerView = this.h;
        Z z3 = recyclerView.j0;
        if (z3 != null) {
            Y y2 = z3.f2022e;
            View view = x2.f2006a;
            K.T.l(view, y2 != null ? (C0002b) y2.f2021e.remove(view) : null);
        }
        if (z2 && recyclerView.f1435c0 != null) {
            recyclerView.f1439f.G(x2);
        }
        x2.f2020r = null;
        N c2 = c();
        c2.getClass();
        int i = x2.f2010f;
        ArrayList arrayList = c2.a(i).f1970a;
        if (((M) c2.f1973a.get(i)).f1971b <= arrayList.size()) {
            return;
        }
        x2.n();
        arrayList.add(x2);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.f1435c0.b()) {
            return !recyclerView.f1435c0.f1993g ? i : recyclerView.d.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f1435c0.b() + recyclerView.y());
    }

    public final N c() {
        if (this.f1980g == null) {
            N n2 = new N();
            n2.f1973a = new SparseArray();
            n2.f1974b = 0;
            this.f1980g = n2;
        }
        return this.f1980g;
    }

    public final void d() {
        ArrayList arrayList = this.f1977c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1405s0;
        C0096m c0096m = this.h.f1433b0;
        int[] iArr2 = c0096m.f2128c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0096m.d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f1977c;
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
            I2.f2016n.j(I2);
        } else if (I2.q()) {
            I2.f2012j &= -33;
        }
        g(I2);
        if (recyclerView.f1414H == null || I2.h()) {
            return;
        }
        recyclerView.f1414H.d(I2);
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
        View view = x2.f2006a;
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
        if ((x2.f2012j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f381a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0083A abstractC0083A = recyclerView.f1446k;
                if (x2.h()) {
                    z4 = false;
                } else {
                    if (this.f1979f <= 0 || x2.d(526)) {
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.f1977c;
                        int size = arrayList.size();
                        if (size >= this.f1979f && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.f1405s0;
                        if (size > 0) {
                            C0096m c0096m = recyclerView.f1433b0;
                            int i = x2.f2008c;
                            if (c0096m.f2128c != null) {
                                int i2 = c0096m.d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0096m.f2128c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((X) arrayList.get(i4)).f2008c;
                                C0096m c0096m2 = recyclerView.f1433b0;
                                if (c0096m2.f2128c == null) {
                                    break;
                                }
                                int i6 = c0096m2.d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0096m2.f2128c[i7] == i5) {
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
                recyclerView.f1439f.G(x2);
                if (r1 && !z4 && z2) {
                    x2.f2020r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0083A abstractC0083A2 = recyclerView.f1446k;
        if (x2.h()) {
        }
        recyclerView.f1439f.G(x2);
        if (r1) {
        }
    }

    public final void h(View view) {
        E e2;
        X I2 = RecyclerView.I(view);
        boolean d = I2.d(12);
        RecyclerView recyclerView = this.h;
        if (!d && I2.l() && (e2 = recyclerView.f1414H) != null) {
            C0092i c0092i = (C0092i) e2;
            if (I2.c().isEmpty() && c0092i.f2086g && !I2.g()) {
                if (this.f1976b == null) {
                    this.f1976b = new ArrayList();
                }
                I2.f2016n = this;
                I2.f2017o = true;
                this.f1976b.add(I2);
                return;
            }
        }
        if (I2.g() && !I2.i() && !recyclerView.f1446k.f1944b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f2016n = this;
        I2.f2017o = false;
        this.f1975a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f2010f != 0) goto L110;
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
        C0002b c0002b;
        boolean z3;
        View view;
        AbstractC0083A abstractC0083A;
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
        if (i < 0 || i >= recyclerView.f1435c0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f1435c0.b() + recyclerView.y());
        }
        U u2 = recyclerView.f1435c0;
        if (u2.f1993g) {
            ArrayList arrayList2 = this.f1976b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        x2 = (X) this.f1976b.get(i2);
                        if (!x2.q() && x2.b() == i) {
                            x2.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f1446k.f1944b && (e2 = recyclerView.d.e(i, 0)) > 0 && e2 < recyclerView.f1446k.a()) {
                        long b3 = recyclerView.f1446k.b(e2);
                        for (int i3 = 0; i3 < size; i3++) {
                            X x4 = (X) this.f1976b.get(i3);
                            if (!x4.q() && x4.f2009e == b3) {
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
        ArrayList arrayList3 = this.f1977c;
        ArrayList arrayList4 = this.f1975a;
        if (x2 == null) {
            int size2 = arrayList4.size();
            for (int i4 = 0; i4 < size2; i4++) {
                X x5 = (X) arrayList4.get(i4);
                if (!x5.q() && x5.b() == i && !x5.g() && (u2.f1993g || !x5.i())) {
                    x5.a(32);
                    x2 = x5;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.f1437e.d;
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
                C0012l c0012l = recyclerView.f1437e;
                int indexOfChild = ((C0108z) c0012l.f431b).f2183a.indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                C0085b c0085b = (C0085b) c0012l.f432c;
                if (!c0085b.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                c0085b.a(indexOfChild);
                c0012l.v(view2);
                C0012l c0012l2 = recyclerView.f1437e;
                int indexOfChild2 = ((C0108z) c0012l2.f431b).f2183a.indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    C0085b c0085b2 = (C0085b) c0012l2.f432c;
                    if (!c0085b2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - c0085b2.b(indexOfChild2);
                        if (b2 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I3 + recyclerView.y());
                        }
                        recyclerView.f1437e.d(b2);
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
                    z6 = u2.f1993g;
                } else {
                    int i7 = x2.f2008c;
                    if (i7 < 0 || i7 >= recyclerView.f1446k.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + x2 + recyclerView.y());
                    }
                    if (!u2.f1993g) {
                        recyclerView.f1446k.getClass();
                    }
                    AbstractC0083A abstractC0083A2 = recyclerView.f1446k;
                    if (!abstractC0083A2.f1944b || x2.f2009e == abstractC0083A2.b(x2.f2008c)) {
                        z6 = true;
                    }
                    z6 = false;
                }
                if (z6) {
                    z2 = true;
                } else {
                    x2.a(4);
                    if (x2.j()) {
                        recyclerView.removeDetachedView(x2.f2006a, false);
                        x2.f2016n.j(x2);
                    } else if (x2.q()) {
                        x2.f2012j &= -33;
                    }
                    g(x2);
                    x2 = null;
                }
            }
        }
        if (x2 == null) {
            int e3 = recyclerView.d.e(i, 0);
            if (e3 < 0 || e3 >= recyclerView.f1446k.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e3 + ").state:" + u2.b() + recyclerView.y());
            }
            recyclerView.f1446k.getClass();
            AbstractC0083A abstractC0083A3 = recyclerView.f1446k;
            if (abstractC0083A3.f1944b) {
                long b4 = abstractC0083A3.b(e3);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        X x7 = (X) arrayList4.get(size5);
                        if (x7.f2009e == b4 && !x7.q()) {
                            if (x7.f2010f == 0) {
                                x7.a(32);
                                if (x7.i() && !u2.f1993g) {
                                    x7.f2012j = (x7.f2012j & (-15)) | 2;
                                }
                                x2 = x7;
                            } else {
                                arrayList4.remove(size5);
                                View view3 = x7.f2006a;
                                recyclerView.removeDetachedView(view3, false);
                                X I4 = RecyclerView.I(view3);
                                I4.f2016n = null;
                                I4.f2017o = false;
                                I4.f2012j &= -33;
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
                            if (x8.f2009e != b4 || x8.e()) {
                                size6--;
                            } else if (x8.f2010f == 0) {
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
                    x2.f2008c = e3;
                    z2 = true;
                }
            }
            if (x2 == null) {
                M m2 = (M) c().f1973a.get(0);
                if (m2 != null) {
                    ArrayList arrayList6 = m2.f1970a;
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
                    int[] iArr = RecyclerView.f1405s0;
                }
                x2 = x3;
            }
            if (x2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j2 != Long.MAX_VALUE) {
                    long j5 = this.f1980g.a(0).f1972c;
                    if (!(j5 == 0 || j5 + nanoTime < j2)) {
                        return null;
                    }
                }
                c0002b = null;
                AbstractC0083A abstractC0083A4 = recyclerView.f1446k;
                abstractC0083A4.getClass();
                try {
                    int i8 = G.h.f194a;
                    Trace.beginSection("RV CreateView");
                    x2 = abstractC0083A4.d(recyclerView);
                    View view4 = x2.f2006a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    x2.f2010f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.f1405s0;
                    RecyclerView D2 = RecyclerView.D(view4);
                    if (D2 != null) {
                        x2.f2007b = new WeakReference(D2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    M a2 = this.f1980g.a(0);
                    long j6 = a2.f1972c;
                    if (j6 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * 3);
                    }
                    a2.f1972c = nanoTime2;
                    if (z2 && !u2.f1993g && x2.d(8192)) {
                        x2.f2012j &= -8193;
                        if (u2.f1994j) {
                            E.b(x2);
                            E e4 = recyclerView.f1414H;
                            x2.c();
                            e4.getClass();
                            C0017q c0017q = new C0017q();
                            c0017q.a(x2);
                            recyclerView.T(x2, c0017q);
                        }
                    }
                    z3 = u2.f1993g;
                    view = x2.f2006a;
                    if (z3 || !x2.f()) {
                        if (x2.f()) {
                            if (!((x2.f2012j & 2) != 0)) {
                            }
                        }
                        int e5 = recyclerView.d.e(i, 0);
                        x2.f2020r = recyclerView;
                        int i9 = x2.f2010f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j2 != Long.MAX_VALUE) {
                            long j7 = this.f1980g.a(i9).d;
                            if (j7 != 0) {
                            }
                        }
                        abstractC0083A = recyclerView.f1446k;
                        abstractC0083A.getClass();
                        x2.f2008c = e5;
                        if (abstractC0083A.f1944b) {
                            x2.f2009e = abstractC0083A.b(e5);
                        }
                        x2.f2012j = (x2.f2012j & (-520)) | 1;
                        int i10 = G.h.f194a;
                        Trace.beginSection("RV OnBindView");
                        x2.c();
                        abstractC0083A.c(x2, e5);
                        arrayList = x2.f2013k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        x2.f2012j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof J) {
                            ((J) layoutParams).f1969c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        M a3 = this.f1980g.a(x2.f2010f);
                        j3 = a3.d;
                        if (j3 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j3 / 4) * 3);
                        }
                        a3.d = nanoTime4;
                        accessibilityManager = recyclerView.f1467x;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = K.T.f381a;
                            if (view.getImportantForAccessibility() == 0) {
                                z4 = true;
                                view.setImportantForAccessibility(1);
                            } else {
                                z4 = true;
                            }
                            Z z7 = recyclerView.j0;
                            if (z7 != null) {
                                Y y2 = z7.f2022e;
                                if (y2 != null) {
                                    View.AccessibilityDelegate c2 = K.T.c(view);
                                    if (c2 != null) {
                                        c0002b = c2 instanceof C0000a ? ((C0000a) c2).f390a : new C0002b(c2);
                                    }
                                    if (c0002b != null && c0002b != y2) {
                                        y2.f2021e.put(view, c0002b);
                                    }
                                }
                                K.T.l(view, y2);
                            }
                        }
                        if (u2.f1993g) {
                            x2.f2011g = i;
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
                        j4.f1967a = x2;
                        j4.d = (z2 || !z5) ? false : z4;
                        return x2;
                    }
                    x2.f2011g = i;
                    z5 = false;
                    z4 = true;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    j4.f1967a = x2;
                    j4.d = (z2 || !z5) ? false : z4;
                    return x2;
                } catch (Throwable th) {
                    int i11 = G.h.f194a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        c0002b = null;
        if (z2) {
            x2.f2012j &= -8193;
            if (u2.f1994j) {
            }
        }
        z3 = u2.f1993g;
        view = x2.f2006a;
        if (z3) {
        }
        if (x2.f()) {
        }
        int e52 = recyclerView.d.e(i, 0);
        x2.f2020r = recyclerView;
        int i92 = x2.f2010f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j2 != Long.MAX_VALUE) {
        }
        abstractC0083A = recyclerView.f1446k;
        abstractC0083A.getClass();
        x2.f2008c = e52;
        if (abstractC0083A.f1944b) {
        }
        x2.f2012j = (x2.f2012j & (-520)) | 1;
        int i102 = G.h.f194a;
        Trace.beginSection("RV OnBindView");
        x2.c();
        abstractC0083A.c(x2, e52);
        arrayList = x2.f2013k;
        if (arrayList != null) {
        }
        x2.f2012j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof J) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        M a32 = this.f1980g.a(x2.f2010f);
        j3 = a32.d;
        if (j3 != 0) {
        }
        a32.d = nanoTime42;
        accessibilityManager = recyclerView.f1467x;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (u2.f1993g) {
        }
        z5 = z4;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
        }
        j4.f1967a = x2;
        j4.d = (z2 || !z5) ? false : z4;
        return x2;
    }

    public final void j(X x2) {
        if (x2.f2017o) {
            this.f1976b.remove(x2);
        } else {
            this.f1975a.remove(x2);
        }
        x2.f2016n = null;
        x2.f2017o = false;
        x2.f2012j &= -33;
    }

    public final void k() {
        I i = this.h.f1448l;
        this.f1979f = this.f1978e + (i != null ? i.f1961j : 0);
        ArrayList arrayList = this.f1977c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1979f; size--) {
            e(size);
        }
    }
}
