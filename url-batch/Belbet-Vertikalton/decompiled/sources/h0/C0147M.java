package h0;

import M.C0005a;
import M.C0006b;
import M.C0019o;
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

/* renamed from: h0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147M {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2926a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2927b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2928c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2929d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f2930f;

    /* renamed from: g, reason: collision with root package name */
    public C0146L f2931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2932h;

    public C0147M(RecyclerView recyclerView) {
        this.f2932h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2926a = arrayList;
        this.f2927b = null;
        this.f2928c = new ArrayList();
        this.f2929d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f2930f = 2;
    }

    public final void a(V v2, boolean z2) {
        RecyclerView.j(v2);
        RecyclerView recyclerView = this.f2932h;
        X x2 = recyclerView.f2028j0;
        if (x2 != null) {
            W w2 = x2.e;
            View view = v2.f2958a;
            M.P.l(view, w2 != null ? (C0006b) w2.e.remove(view) : null);
        }
        if (z2 && recyclerView.f2017c0 != null) {
            recyclerView.f2021f.K(v2);
        }
        v2.f2972r = null;
        C0146L c2 = c();
        c2.getClass();
        int i = v2.f2962f;
        ArrayList arrayList = c2.a(i).f2920a;
        if (((C0145K) c2.f2924a.get(i)).f2921b <= arrayList.size()) {
            return;
        }
        v2.n();
        arrayList.add(v2);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f2932h;
        if (i >= 0 && i < recyclerView.f2017c0.b()) {
            return !recyclerView.f2017c0.f2945g ? i : recyclerView.f2018d.e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2017c0.b() + recyclerView.y());
    }

    public final C0146L c() {
        if (this.f2931g == null) {
            C0146L c0146l = new C0146L();
            c0146l.f2924a = new SparseArray();
            c0146l.f2925b = 0;
            this.f2931g = c0146l;
        }
        return this.f2931g;
    }

    public final void d() {
        ArrayList arrayList = this.f2928c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.s0;
        C0162l c0162l = this.f2932h.f2015b0;
        int[] iArr2 = c0162l.f3078c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0162l.f3079d = 0;
    }

    public final void e(int i) {
        ArrayList arrayList = this.f2928c;
        a((V) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void f(View view) {
        V I2 = RecyclerView.I(view);
        boolean k2 = I2.k();
        RecyclerView recyclerView = this.f2932h;
        if (k2) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I2.j()) {
            I2.f2968n.j(I2);
        } else if (I2.q()) {
            I2.j &= -33;
        }
        g(I2);
        if (recyclerView.H == null || I2.h()) {
            return;
        }
        recyclerView.H.d(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(V v2) {
        boolean z2;
        boolean z3;
        boolean j = v2.j();
        boolean z4 = true;
        RecyclerView recyclerView = this.f2932h;
        View view = v2.f2958a;
        if (j || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(v2.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (v2.k()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + v2 + recyclerView.y());
        }
        if (v2.p()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((v2.j & 16) == 0) {
            WeakHashMap weakHashMap = M.P.f711a;
            if (view.hasTransientState()) {
                z2 = true;
                AbstractC0174y abstractC0174y = recyclerView.f2029k;
                if (v2.h()) {
                    z4 = false;
                } else {
                    if (this.f2930f <= 0 || v2.d(526)) {
                        z3 = false;
                    } else {
                        ArrayList arrayList = this.f2928c;
                        int size = arrayList.size();
                        if (size >= this.f2930f && size > 0) {
                            e(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.s0;
                        if (size > 0) {
                            C0162l c0162l = recyclerView.f2015b0;
                            int i = v2.f2960c;
                            if (c0162l.f3078c != null) {
                                int i2 = c0162l.f3079d * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (c0162l.f3078c[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((V) arrayList.get(i4)).f2960c;
                                C0162l c0162l2 = recyclerView.f2015b0;
                                if (c0162l2.f3078c == null) {
                                    break;
                                }
                                int i6 = c0162l2.f3079d * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (c0162l2.f3078c[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, v2);
                        z3 = true;
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        a(v2, true);
                    }
                    r1 = z3;
                }
                recyclerView.f2021f.K(v2);
                if (r1 && !z4 && z2) {
                    v2.f2972r = null;
                    return;
                }
                return;
            }
        }
        z2 = false;
        AbstractC0174y abstractC0174y2 = recyclerView.f2029k;
        if (v2.h()) {
        }
        recyclerView.f2021f.K(v2);
        if (r1) {
        }
    }

    public final void h(View view) {
        AbstractC0137C abstractC0137C;
        V I2 = RecyclerView.I(view);
        boolean d2 = I2.d(12);
        RecyclerView recyclerView = this.f2932h;
        if (!d2 && I2.l() && (abstractC0137C = recyclerView.H) != null) {
            C0158h c0158h = (C0158h) abstractC0137C;
            if (I2.c().isEmpty() && c0158h.f3036g && !I2.g()) {
                if (this.f2927b == null) {
                    this.f2927b = new ArrayList();
                }
                I2.f2968n = this;
                I2.f2969o = true;
                this.f2927b.add(I2);
                return;
            }
        }
        if (I2.g() && !I2.i() && !recyclerView.f2029k.f3137b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I2.f2968n = this;
        I2.f2969o = false;
        this.f2926a.add(I2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0416, code lost:
    
        if (r11.g() == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x043e, code lost:
    
        if ((r14 + r12) >= r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01cb, code lost:
    
        if (r11.f2962f != 0) goto L110;
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
    public final V i(int i, long j) {
        boolean z2;
        V v2;
        C0006b c0006b;
        boolean z3;
        View view;
        AbstractC0174y abstractC0174y;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j2;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams2;
        C0142H c0142h;
        V v3;
        View view2;
        int b2;
        boolean z6;
        int size;
        int e;
        RecyclerView recyclerView = this.f2932h;
        if (i < 0 || i >= recyclerView.f2017c0.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + recyclerView.f2017c0.b() + recyclerView.y());
        }
        S s2 = recyclerView.f2017c0;
        if (s2.f2945g) {
            ArrayList arrayList2 = this.f2927b;
            if (arrayList2 != null && (size = arrayList2.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        v2 = (V) this.f2927b.get(i2);
                        if (!v2.q() && v2.b() == i) {
                            v2.a(32);
                            break;
                        }
                        i2++;
                    } else if (recyclerView.f2029k.f3137b && (e = recyclerView.f2018d.e(i, 0)) > 0 && e < recyclerView.f2029k.a()) {
                        long b3 = recyclerView.f2029k.b(e);
                        for (int i3 = 0; i3 < size; i3++) {
                            V v4 = (V) this.f2927b.get(i3);
                            if (!v4.q() && v4.e == b3) {
                                v4.a(32);
                                v2 = v4;
                                break;
                            }
                        }
                    }
                }
                z2 = v2 == null;
            }
            v2 = null;
            if (v2 == null) {
            }
        } else {
            z2 = false;
            v2 = null;
        }
        ArrayList arrayList3 = this.f2928c;
        ArrayList arrayList4 = this.f2926a;
        if (v2 == null) {
            int size2 = arrayList4.size();
            for (int i4 = 0; i4 < size2; i4++) {
                V v5 = (V) arrayList4.get(i4);
                if (!v5.q() && v5.b() == i && !v5.g() && (s2.f2945g || !v5.i())) {
                    v5.a(32);
                    v2 = v5;
                    break;
                }
            }
            ArrayList arrayList5 = (ArrayList) recyclerView.e.f593d;
            int size3 = arrayList5.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    view2 = null;
                    break;
                }
                view2 = (View) arrayList5.get(i5);
                V I2 = RecyclerView.I(view2);
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
                        v2 = null;
                        break;
                    }
                    V v6 = (V) arrayList3.get(i6);
                    if (!v6.g() && v6.b() == i && !v6.e()) {
                        arrayList3.remove(i6);
                        v2 = v6;
                        break;
                    }
                    i6++;
                }
            } else {
                V I3 = RecyclerView.I(view2);
                I0.h hVar = recyclerView.e;
                int indexOfChild = ((C0173x) hVar.f591b).f3135a.indexOfChild(view2);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view2);
                }
                F1.a aVar = (F1.a) hVar.f592c;
                if (!aVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                }
                aVar.a(indexOfChild);
                hVar.v(view2);
                I0.h hVar2 = recyclerView.e;
                int indexOfChild2 = ((C0173x) hVar2.f591b).f3135a.indexOfChild(view2);
                if (indexOfChild2 != -1) {
                    F1.a aVar2 = (F1.a) hVar2.f592c;
                    if (!aVar2.d(indexOfChild2)) {
                        b2 = indexOfChild2 - aVar2.b(indexOfChild2);
                        if (b2 != -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I3 + recyclerView.y());
                        }
                        recyclerView.e.d(b2);
                        h(view2);
                        I3.a(8224);
                        v2 = I3;
                    }
                }
                b2 = -1;
                if (b2 != -1) {
                }
            }
            if (v2 != null) {
                if (v2.i()) {
                    z6 = s2.f2945g;
                } else {
                    int i7 = v2.f2960c;
                    if (i7 < 0 || i7 >= recyclerView.f2029k.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + v2 + recyclerView.y());
                    }
                    if (!s2.f2945g) {
                        recyclerView.f2029k.getClass();
                    }
                    AbstractC0174y abstractC0174y2 = recyclerView.f2029k;
                    if (!abstractC0174y2.f3137b || v2.e == abstractC0174y2.b(v2.f2960c)) {
                        z6 = true;
                    }
                    z6 = false;
                }
                if (z6) {
                    z2 = true;
                } else {
                    v2.a(4);
                    if (v2.j()) {
                        recyclerView.removeDetachedView(v2.f2958a, false);
                        v2.f2968n.j(v2);
                    } else if (v2.q()) {
                        v2.j &= -33;
                    }
                    g(v2);
                    v2 = null;
                }
            }
        }
        if (v2 == null) {
            int e2 = recyclerView.f2018d.e(i, 0);
            if (e2 < 0 || e2 >= recyclerView.f2029k.a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + e2 + ").state:" + s2.b() + recyclerView.y());
            }
            recyclerView.f2029k.getClass();
            AbstractC0174y abstractC0174y3 = recyclerView.f2029k;
            if (abstractC0174y3.f3137b) {
                long b4 = abstractC0174y3.b(e2);
                int size5 = arrayList4.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        V v7 = (V) arrayList4.get(size5);
                        if (v7.e == b4 && !v7.q()) {
                            if (v7.f2962f == 0) {
                                v7.a(32);
                                if (v7.i() && !s2.f2945g) {
                                    v7.j = (v7.j & (-15)) | 2;
                                }
                                v2 = v7;
                            } else {
                                arrayList4.remove(size5);
                                View view3 = v7.f2958a;
                                recyclerView.removeDetachedView(view3, false);
                                V I4 = RecyclerView.I(view3);
                                I4.f2968n = null;
                                I4.f2969o = false;
                                I4.j &= -33;
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
                            V v8 = (V) arrayList3.get(size6);
                            if (v8.e != b4 || v8.e()) {
                                size6--;
                            } else if (v8.f2962f == 0) {
                                arrayList3.remove(size6);
                                v2 = v8;
                            } else {
                                e(size6);
                            }
                        }
                        v2 = null;
                    }
                }
                if (v2 != null) {
                    v2.f2960c = e2;
                    z2 = true;
                }
            }
            if (v2 == null) {
                C0145K c0145k = (C0145K) c().f2924a.get(0);
                if (c0145k != null) {
                    ArrayList arrayList6 = c0145k.f2920a;
                    if (!arrayList6.isEmpty()) {
                        for (int size7 = arrayList6.size() - 1; size7 >= 0; size7--) {
                            if (!((V) arrayList6.get(size7)).e()) {
                                v3 = (V) arrayList6.remove(size7);
                                break;
                            }
                        }
                    }
                }
                v3 = null;
                if (v3 != null) {
                    v3.n();
                    int[] iArr = RecyclerView.s0;
                }
                v2 = v3;
            }
            if (v2 == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j3 = this.f2931g.a(0).f2922c;
                    if (!(j3 == 0 || j3 + nanoTime < j)) {
                        return null;
                    }
                }
                c0006b = null;
                AbstractC0174y abstractC0174y4 = recyclerView.f2029k;
                abstractC0174y4.getClass();
                try {
                    int i8 = I.h.f579a;
                    Trace.beginSection("RV CreateView");
                    v2 = abstractC0174y4.d(recyclerView);
                    View view4 = v2.f2958a;
                    if (view4.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    v2.f2962f = 0;
                    Trace.endSection();
                    int[] iArr2 = RecyclerView.s0;
                    RecyclerView D2 = RecyclerView.D(view4);
                    if (D2 != null) {
                        v2.f2959b = new WeakReference(D2);
                    }
                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                    C0145K a2 = this.f2931g.a(0);
                    long j4 = a2.f2922c;
                    if (j4 != 0) {
                        nanoTime2 = (nanoTime2 / 4) + ((j4 / 4) * 3);
                    }
                    a2.f2922c = nanoTime2;
                    if (z2 && !s2.f2945g && v2.d(8192)) {
                        v2.j &= -8193;
                        if (s2.j) {
                            AbstractC0137C.b(v2);
                            AbstractC0137C abstractC0137C = recyclerView.H;
                            v2.c();
                            abstractC0137C.getClass();
                            C0019o c0019o = new C0019o();
                            c0019o.a(v2);
                            recyclerView.T(v2, c0019o);
                        }
                    }
                    z3 = s2.f2945g;
                    view = v2.f2958a;
                    if (z3 || !v2.f()) {
                        if (v2.f()) {
                            if (!((v2.j & 2) != 0)) {
                            }
                        }
                        int e3 = recyclerView.f2018d.e(i, 0);
                        v2.f2972r = recyclerView;
                        int i9 = v2.f2962f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j5 = this.f2931g.a(i9).f2923d;
                            if (j5 != 0) {
                            }
                        }
                        abstractC0174y = recyclerView.f2029k;
                        abstractC0174y.getClass();
                        v2.f2960c = e3;
                        if (abstractC0174y.f3137b) {
                            v2.e = abstractC0174y.b(e3);
                        }
                        v2.j = (v2.j & (-520)) | 1;
                        int i10 = I.h.f579a;
                        Trace.beginSection("RV OnBindView");
                        v2.c();
                        abstractC0174y.c(v2, e3);
                        arrayList = v2.f2965k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        v2.j &= -1025;
                        layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof C0142H) {
                            ((C0142H) layoutParams).f2918c = true;
                        }
                        Trace.endSection();
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        C0145K a3 = this.f2931g.a(v2.f2962f);
                        j2 = a3.f2923d;
                        if (j2 != 0) {
                            nanoTime4 = (nanoTime4 / 4) + ((j2 / 4) * 3);
                        }
                        a3.f2923d = nanoTime4;
                        accessibilityManager = recyclerView.f2049x;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = M.P.f711a;
                            if (view.getImportantForAccessibility() == 0) {
                                z4 = true;
                                view.setImportantForAccessibility(1);
                            } else {
                                z4 = true;
                            }
                            X x2 = recyclerView.f2028j0;
                            if (x2 != null) {
                                W w2 = x2.e;
                                if (w2 != null) {
                                    View.AccessibilityDelegate c2 = M.P.c(view);
                                    if (c2 != null) {
                                        c0006b = c2 instanceof C0005a ? ((C0005a) c2).f723a : new C0006b(c2);
                                    }
                                    if (c0006b != null && c0006b != w2) {
                                        w2.e.put(view, c0006b);
                                    }
                                }
                                M.P.l(view, w2);
                            }
                        }
                        if (s2.f2945g) {
                            v2.f2963g = i;
                        }
                        z5 = z4;
                        layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 == null) {
                            c0142h = (C0142H) recyclerView.generateDefaultLayoutParams();
                            view.setLayoutParams(c0142h);
                        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                            c0142h = (C0142H) layoutParams2;
                        } else {
                            c0142h = (C0142H) recyclerView.generateLayoutParams(layoutParams2);
                            view.setLayoutParams(c0142h);
                        }
                        c0142h.f2916a = v2;
                        c0142h.f2919d = (z2 || !z5) ? false : z4;
                        return v2;
                    }
                    v2.f2963g = i;
                    z5 = false;
                    z4 = true;
                    layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                    }
                    c0142h.f2916a = v2;
                    c0142h.f2919d = (z2 || !z5) ? false : z4;
                    return v2;
                } catch (Throwable th) {
                    int i11 = I.h.f579a;
                    Trace.endSection();
                    throw th;
                }
            }
        }
        c0006b = null;
        if (z2) {
            v2.j &= -8193;
            if (s2.j) {
            }
        }
        z3 = s2.f2945g;
        view = v2.f2958a;
        if (z3) {
        }
        if (v2.f()) {
        }
        int e32 = recyclerView.f2018d.e(i, 0);
        v2.f2972r = recyclerView;
        int i92 = v2.f2962f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        abstractC0174y = recyclerView.f2029k;
        abstractC0174y.getClass();
        v2.f2960c = e32;
        if (abstractC0174y.f3137b) {
        }
        v2.j = (v2.j & (-520)) | 1;
        int i102 = I.h.f579a;
        Trace.beginSection("RV OnBindView");
        v2.c();
        abstractC0174y.c(v2, e32);
        arrayList = v2.f2965k;
        if (arrayList != null) {
        }
        v2.j &= -1025;
        layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0142H) {
        }
        Trace.endSection();
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        C0145K a32 = this.f2931g.a(v2.f2962f);
        j2 = a32.f2923d;
        if (j2 != 0) {
        }
        a32.f2923d = nanoTime42;
        accessibilityManager = recyclerView.f2049x;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (s2.f2945g) {
        }
        z5 = z4;
        layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
        }
        c0142h.f2916a = v2;
        c0142h.f2919d = (z2 || !z5) ? false : z4;
        return v2;
    }

    public final void j(V v2) {
        if (v2.f2969o) {
            this.f2927b.remove(v2);
        } else {
            this.f2926a.remove(v2);
        }
        v2.f2968n = null;
        v2.f2969o = false;
        v2.j &= -33;
    }

    public final void k() {
        AbstractC0141G abstractC0141G = this.f2932h.f2031l;
        this.f2930f = this.e + (abstractC0141G != null ? abstractC0141G.j : 0);
        ArrayList arrayList = this.f2928c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2930f; size--) {
            e(size);
        }
    }
}
