package f1;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1490a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1492c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f1493e;

    /* renamed from: f, reason: collision with root package name */
    public int f1494f;

    /* renamed from: g, reason: collision with root package name */
    public r0 f1495g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1496h;

    public s0(RecyclerView recyclerView) {
        this.f1496h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1490a = arrayList;
        this.f1491b = null;
        this.f1492c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f1493e = 2;
        this.f1494f = 2;
    }

    public final void a(b1 b1Var, boolean z3) {
        RecyclerView.j(b1Var);
        View view = b1Var.f1309a;
        RecyclerView recyclerView = this.f1496h;
        d1 d1Var = recyclerView.f686r0;
        if (d1Var != null) {
            c1 c1Var = d1Var.f1336e;
            n0.l0.m(view, c1Var != null ? (n0.b) c1Var.f1329e.remove(view) : null);
        }
        if (z3) {
            ArrayList arrayList = recyclerView.f687s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.f672k0 != null) {
                recyclerView.f671k.G(b1Var);
            }
        }
        b1Var.f1325s = null;
        b1Var.f1324r = null;
        r0 c4 = c();
        c4.getClass();
        int i = b1Var.f1313f;
        ArrayList arrayList2 = c4.a(i).f1474a;
        if (((q0) c4.f1484a.get(i)).f1475b <= arrayList2.size()) {
            return;
        }
        b1Var.m();
        arrayList2.add(b1Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.f1496h;
        if (i >= 0 && i < recyclerView.f672k0.b()) {
            return !recyclerView.f672k0.f1541g ? i : recyclerView.i.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f672k0.b() + recyclerView.y());
    }

    public final r0 c() {
        if (this.f1495g == null) {
            r0 r0Var = new r0();
            r0Var.f1484a = new SparseArray();
            r0Var.f1485b = 0;
            this.f1495g = r0Var;
        }
        return this.f1495g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).f1309a;
    }

    public final void e() {
        ArrayList arrayList = this.f1492c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        n nVar = this.f1496h.f670j0;
        int[] iArr2 = nVar.f1459c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        nVar.d = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.f1492c;
        a((b1) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        b1 I = RecyclerView.I(view);
        boolean j4 = I.j();
        RecyclerView recyclerView = this.f1496h;
        if (j4) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.f1320n.k(I);
        } else if (I.p()) {
            I.f1316j &= -33;
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
    public final void h(b1 b1Var) {
        boolean z3;
        boolean z4;
        RecyclerView recyclerView = this.f1496h;
        n nVar = recyclerView.f670j0;
        boolean i = b1Var.i();
        View view = b1Var.f1309a;
        boolean z5 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(b1Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (b1Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b1Var + recyclerView.y());
        }
        if (b1Var.o()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.y());
        }
        if ((b1Var.f1316j & 16) == 0) {
            WeakHashMap weakHashMap = n0.l0.f2757a;
            if (view.hasTransientState()) {
                z3 = true;
                if (b1Var.g()) {
                    z5 = false;
                } else {
                    if (this.f1494f <= 0 || (b1Var.f1316j & 526) != 0) {
                        z4 = false;
                    } else {
                        ArrayList arrayList = this.f1492c;
                        int size = arrayList.size();
                        if (size >= this.f1494f && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.D0;
                        if (size > 0) {
                            int i4 = b1Var.f1311c;
                            if (nVar.f1459c != null) {
                                int i5 = nVar.d * 2;
                                for (int i6 = 0; i6 < i5; i6 += 2) {
                                    if (nVar.f1459c[i6] == i4) {
                                        break;
                                    }
                                }
                            }
                            int i7 = size - 1;
                            loop1: while (i7 >= 0) {
                                int i8 = ((b1) arrayList.get(i7)).f1311c;
                                if (nVar.f1459c == null) {
                                    break;
                                }
                                int i9 = nVar.d * 2;
                                for (int i10 = 0; i10 < i9; i10 += 2) {
                                    if (nVar.f1459c[i10] == i8) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i7 + 1;
                        }
                        arrayList.add(size, b1Var);
                        z4 = true;
                    }
                    if (z4) {
                        z5 = false;
                    } else {
                        a(b1Var, true);
                    }
                    r4 = z4;
                }
                recyclerView.f671k.G(b1Var);
                if (r4 && !z5 && z3) {
                    b1Var.f1325s = null;
                    b1Var.f1324r = null;
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (b1Var.g()) {
        }
        recyclerView.f671k.G(b1Var);
        if (r4) {
        }
    }

    public final void i(View view) {
        i0 i0Var;
        b1 I = RecyclerView.I(view);
        int i = I.f1316j & 12;
        RecyclerView recyclerView = this.f1496h;
        if (i == 0 && I.k() && (i0Var = recyclerView.P) != null) {
            j jVar = (j) i0Var;
            if (I.c().isEmpty() && jVar.f1388g && !I.f()) {
                if (this.f1491b == null) {
                    this.f1491b = new ArrayList();
                }
                I.f1320n = this;
                I.f1321o = true;
                this.f1491b.add(I);
                return;
            }
        }
        if (I.f() && !I.h() && !recyclerView.f683q.f1334b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
        }
        I.f1320n = this;
        I.f1321o = false;
        this.f1490a.add(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0435, code lost:
    
        if (r10.f() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0461, code lost:
    
        if ((r13 + r11) >= r28) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d3, code lost:
    
        if (r10.f1313f != 0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0080  */
    /* JADX WARN: Type inference failed for: r11v4, types: [n0.b] */
    /* JADX WARN: Type inference failed for: r9v10, types: [n0.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b1 j(int i, long j4) {
        boolean z3;
        b1 b1Var;
        boolean z4;
        long j5;
        long j6;
        boolean z5;
        boolean z6;
        ViewGroup.LayoutParams layoutParams;
        n0 n0Var;
        b1 b1Var2;
        int i4;
        View view;
        boolean z7;
        int size;
        int g4;
        RecyclerView recyclerView = this.f1496h;
        y0 y0Var = recyclerView.f672k0;
        if (i < 0 || i >= y0Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + y0Var.b() + recyclerView.y());
        }
        if (y0Var.f1541g) {
            ArrayList arrayList = this.f1491b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        b1Var = (b1) this.f1491b.get(i5);
                        if (!b1Var.p() && b1Var.b() == i) {
                            b1Var.a(32);
                            break;
                        }
                        i5++;
                    } else if (recyclerView.f683q.f1334b && (g4 = recyclerView.i.g(i, 0)) > 0 && g4 < recyclerView.f683q.a()) {
                        long b4 = recyclerView.f683q.b(g4);
                        for (int i6 = 0; i6 < size; i6++) {
                            b1 b1Var3 = (b1) this.f1491b.get(i6);
                            if (!b1Var3.p() && b1Var3.f1312e == b4) {
                                b1Var3.a(32);
                                b1Var = b1Var3;
                                break;
                            }
                        }
                    }
                }
                z3 = b1Var == null;
            }
            b1Var = null;
            if (b1Var == null) {
            }
        } else {
            z3 = false;
            b1Var = null;
        }
        ArrayList arrayList2 = this.f1490a;
        ArrayList arrayList3 = this.f1492c;
        if (b1Var == null) {
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                b1 b1Var4 = (b1) arrayList2.get(i7);
                if (!b1Var4.p() && b1Var4.b() == i && !b1Var4.f() && (y0Var.f1541g || !b1Var4.h())) {
                    b1Var4.a(32);
                    b1Var = b1Var4;
                    z4 = true;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.f669j.d;
            int size3 = arrayList4.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    z4 = true;
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i8);
                b1 I = RecyclerView.I(view);
                z4 = true;
                if (I.b() == i && !I.f() && !I.h()) {
                    break;
                }
                i8++;
            }
            if (view == null) {
                int size4 = arrayList3.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        b1Var = null;
                        break;
                    }
                    b1 b1Var5 = (b1) arrayList3.get(i9);
                    if (!b1Var5.f() && b1Var5.b() == i && !b1Var5.d()) {
                        arrayList3.remove(i9);
                        b1Var = b1Var5;
                        break;
                    }
                    i9++;
                }
            } else {
                b1 I2 = RecyclerView.I(view);
                androidx.emoji2.text.t tVar = recyclerView.f669j;
                c cVar = (c) tVar.f356c;
                int indexOfChild = ((c0) tVar.f355b).f1328a.indexOfChild(view);
                if (indexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!cVar.d(indexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                cVar.a(indexOfChild);
                tVar.A(view);
                androidx.emoji2.text.t tVar2 = recyclerView.f669j;
                c cVar2 = (c) tVar2.f356c;
                int indexOfChild2 = ((c0) tVar2.f355b).f1328a.indexOfChild(view);
                int b5 = (indexOfChild2 == -1 || cVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - cVar2.b(indexOfChild2);
                if (b5 == -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I2 + recyclerView.y());
                }
                recyclerView.f669j.i(b5);
                i(view);
                I2.a(8224);
                b1Var = I2;
            }
            if (b1Var != null) {
                if (b1Var.h()) {
                    z7 = y0Var.f1541g;
                } else {
                    int i10 = b1Var.f1311c;
                    if (i10 < 0 || i10 >= recyclerView.f683q.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b1Var + recyclerView.y());
                    }
                    if (!y0Var.f1541g) {
                        recyclerView.f683q.getClass();
                    }
                    d0 d0Var = recyclerView.f683q;
                    if (!d0Var.f1334b || b1Var.f1312e == d0Var.b(b1Var.f1311c)) {
                        z7 = z4;
                    }
                    z7 = false;
                }
                if (z7) {
                    z3 = z4;
                } else {
                    b1Var.a(4);
                    if (b1Var.i()) {
                        recyclerView.removeDetachedView(b1Var.f1309a, false);
                        b1Var.f1320n.k(b1Var);
                    } else if (b1Var.p()) {
                        b1Var.f1316j &= -33;
                    }
                    h(b1Var);
                    b1Var = null;
                }
            }
        } else {
            z4 = true;
        }
        if (b1Var == null) {
            int g5 = recyclerView.i.g(i, 0);
            if (g5 >= 0) {
                j5 = 3;
                if (g5 < recyclerView.f683q.a()) {
                    recyclerView.f683q.getClass();
                    d0 d0Var2 = recyclerView.f683q;
                    if (d0Var2.f1334b) {
                        long b6 = d0Var2.b(g5);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j6 = 4;
                                b1 b1Var6 = (b1) arrayList2.get(size5);
                                i4 = g5;
                                long j7 = b1Var6.f1312e;
                                View view2 = b1Var6.f1309a;
                                if (j7 == b6 && !b1Var6.p()) {
                                    if (b1Var6.f1313f == 0) {
                                        b1Var6.a(32);
                                        if (b1Var6.h() && !y0Var.f1541g) {
                                            b1Var6.f1316j = (b1Var6.f1316j & (-15)) | 2;
                                        }
                                        b1Var = b1Var6;
                                    } else {
                                        arrayList2.remove(size5);
                                        recyclerView.removeDetachedView(view2, false);
                                        b1 I3 = RecyclerView.I(view2);
                                        I3.f1320n = null;
                                        I3.f1321o = false;
                                        I3.f1316j &= -33;
                                        h(I3);
                                    }
                                }
                                size5--;
                                g5 = i4;
                            } else {
                                i4 = g5;
                                j6 = 4;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    b1 b1Var7 = (b1) arrayList3.get(size6);
                                    if (b1Var7.f1312e != b6 || b1Var7.d()) {
                                        size6--;
                                    } else if (b1Var7.f1313f == 0) {
                                        arrayList3.remove(size6);
                                        b1Var = b1Var7;
                                    } else {
                                        f(size6);
                                    }
                                }
                                b1Var = null;
                            }
                        }
                        if (b1Var != null) {
                            b1Var.f1311c = i4;
                            z3 = z4;
                        }
                    } else {
                        j6 = 4;
                    }
                    if (b1Var == null) {
                        q0 q0Var = (q0) c().f1484a.get(0);
                        if (q0Var != null) {
                            ArrayList arrayList5 = q0Var.f1474a;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((b1) arrayList5.get(size7)).d()) {
                                        b1Var2 = (b1) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        b1Var2 = null;
                        if (b1Var2 != null) {
                            b1Var2.m();
                            int[] iArr = RecyclerView.D0;
                        }
                        b1Var = b1Var2;
                    }
                    if (b1Var == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j4 != Long.MAX_VALUE) {
                            long j8 = this.f1495g.a(0).f1476c;
                            if (!((j8 == 0 || j8 + nanoTime < j4) ? z4 : false)) {
                                return null;
                            }
                        }
                        d0 d0Var3 = recyclerView.f683q;
                        d0Var3.getClass();
                        try {
                            int i11 = j0.g.f1893a;
                            Trace.beginSection("RV CreateView");
                            b1Var = d0Var3.d(recyclerView);
                            View view3 = b1Var.f1309a;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            b1Var.f1313f = 0;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.D0;
                            RecyclerView D = RecyclerView.D(view3);
                            if (D != null) {
                                b1Var.f1310b = new WeakReference(D);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            q0 a2 = this.f1495g.a(0);
                            long j9 = a2.f1476c;
                            if (j9 != 0) {
                                nanoTime2 = (nanoTime2 / j6) + ((j9 / j6) * 3);
                            }
                            a2.f1476c = nanoTime2;
                        } finally {
                            int i12 = j0.g.f1893a;
                            Trace.endSection();
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g5 + ").state:" + y0Var.b() + recyclerView.y());
        }
        j5 = 3;
        j6 = 4;
        View view4 = b1Var.f1309a;
        if (z3 && !y0Var.f1541g) {
            int i13 = b1Var.f1316j;
            if ((i13 & 8192) != 0 ? z4 : false) {
                b1Var.f1316j = i13 & (-8193);
                if (y0Var.f1543j) {
                    i0.b(b1Var);
                    i0 i0Var = recyclerView.P;
                    b1Var.c();
                    i0Var.getClass();
                    h0 h0Var = new h0();
                    h0Var.a(b1Var);
                    recyclerView.U(b1Var, h0Var);
                }
            }
        }
        if (!y0Var.f1541g || !b1Var.e()) {
            if (b1Var.e()) {
                if (!((b1Var.f1316j & 2) != 0 ? z4 : false)) {
                }
            }
            int g6 = recyclerView.i.g(i, 0);
            b1Var.f1325s = null;
            b1Var.f1324r = recyclerView;
            int i14 = b1Var.f1313f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j4 != Long.MAX_VALUE) {
                long j10 = this.f1495g.a(i14).d;
                if (j10 != 0) {
                }
            }
            d0 d0Var4 = recyclerView.f683q;
            d0Var4.getClass();
            boolean z8 = b1Var.f1325s == null ? z4 : false;
            if (z8) {
                b1Var.f1311c = g6;
                if (d0Var4.f1334b) {
                    b1Var.f1312e = d0Var4.b(g6);
                }
                b1Var.f1316j = (b1Var.f1316j & (-520)) | 1;
                int i15 = j0.g.f1893a;
                Trace.beginSection("RV OnBindView");
            }
            b1Var.f1325s = d0Var4;
            b1Var.c();
            d0Var4.c(b1Var, g6);
            if (z8) {
                ArrayList arrayList6 = b1Var.f1317k;
                if (arrayList6 != null) {
                    arrayList6.clear();
                }
                b1Var.f1316j &= -1025;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 instanceof n0) {
                    ((n0) layoutParams2).f1462c = z4;
                }
            }
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            q0 a4 = this.f1495g.a(b1Var.f1313f);
            long j11 = a4.d;
            if (j11 != 0) {
                nanoTime4 = (nanoTime4 / j6) + ((j11 / j6) * j5);
            }
            a4.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.F;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = n0.l0.f2757a;
                z5 = true;
                if (view4.getImportantForAccessibility() == 0) {
                    view4.setImportantForAccessibility(1);
                }
                d1 d1Var = recyclerView.f686r0;
                if (d1Var != null) {
                    c1 c1Var = d1Var.f1336e;
                    if (c1Var != null) {
                        View.AccessibilityDelegate d = n0.l0.d(view4);
                        c1 bVar = d != null ? d instanceof n0.a ? ((n0.a) d).f2709a : new n0.b(d) : null;
                        if (bVar != null && bVar != c1Var) {
                            c1Var.f1329e.put(view4, bVar);
                        }
                    }
                    n0.l0.m(view4, c1Var);
                }
            } else {
                z5 = true;
            }
            if (y0Var.f1541g) {
                b1Var.f1314g = i;
            }
            z6 = z5;
            layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                n0Var = (n0) recyclerView.generateDefaultLayoutParams();
                view4.setLayoutParams(n0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                n0Var = (n0) layoutParams;
            } else {
                n0Var = (n0) recyclerView.generateLayoutParams(layoutParams);
                view4.setLayoutParams(n0Var);
            }
            n0Var.f1460a = b1Var;
            if (z3 || !z6) {
                z5 = false;
            }
            n0Var.d = z5;
            return b1Var;
        }
        b1Var.f1314g = i;
        z6 = false;
        z5 = z4;
        layoutParams = view4.getLayoutParams();
        if (layoutParams != null) {
        }
        n0Var.f1460a = b1Var;
        if (z3) {
        }
        z5 = false;
        n0Var.d = z5;
        return b1Var;
    }

    public final void k(b1 b1Var) {
        if (b1Var.f1321o) {
            this.f1491b.remove(b1Var);
        } else {
            this.f1490a.remove(b1Var);
        }
        b1Var.f1320n = null;
        b1Var.f1321o = false;
        b1Var.f1316j &= -33;
    }

    public final void l() {
        m0 m0Var = this.f1496h.f685r;
        this.f1494f = this.f1493e + (m0Var != null ? m0Var.f1451j : 0);
        ArrayList arrayList = this.f1492c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1494f; size--) {
            f(size);
        }
    }
}
