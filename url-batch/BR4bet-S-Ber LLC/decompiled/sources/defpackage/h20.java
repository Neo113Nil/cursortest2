package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h20 {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public g20 g;
    public final /* synthetic */ RecyclerView h;

    public h20(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(q20 q20Var, boolean z) {
        RecyclerView.j(q20Var);
        View view = q20Var.a;
        RecyclerView recyclerView = this.h;
        s20 s20Var = recyclerView.r0;
        if (s20Var != null) {
            r20 r20Var = s20Var.e;
            ic0.m(view, r20Var != null ? (y) r20Var.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                g9.b();
                return;
            } else if (recyclerView.k0 != null) {
                recyclerView.k.Q(q20Var);
            }
        }
        q20Var.s = null;
        q20Var.r = null;
        g20 c = c();
        c.getClass();
        int i = q20Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((f20) c.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        q20Var.m();
        arrayList2.add(q20Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        n20 n20Var = recyclerView.k0;
        if (i >= 0 && i < n20Var.b()) {
            return !n20Var.g ? i : recyclerView.i.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + n20Var.b() + recyclerView.y());
    }

    public final g20 c() {
        if (this.g == null) {
            g20 g20Var = new g20();
            g20Var.a = new SparseArray();
            g20Var.b = 0;
            this.g = g20Var;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        ro roVar = this.h.j0;
        int[] iArr2 = (int[]) roVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        roVar.c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((q20) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        q20 I = RecyclerView.I(view);
        boolean j = I.j();
        RecyclerView recyclerView = this.h;
        if (j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I.i()) {
            I.n.k(I);
        } else if (I.p()) {
            I.j &= -33;
        }
        h(I);
        if (recyclerView.P == null || I.g()) {
            return;
        }
        recyclerView.P.d(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(q20 q20Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        ro roVar = recyclerView.j0;
        boolean i = q20Var.i();
        View view = q20Var.a;
        boolean z3 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(q20Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (q20Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + q20Var + recyclerView.y());
        }
        if (q20Var.o()) {
            g9.i("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.y()));
            return;
        }
        if ((q20Var.j & 16) == 0) {
            WeakHashMap weakHashMap = ic0.a;
            if (view.hasTransientState()) {
                z = true;
                if (q20Var.g()) {
                    z3 = false;
                } else {
                    if (this.f <= 0 || (q20Var.j & 526) != 0) {
                        z2 = false;
                    } else {
                        ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.f && size > 0) {
                            f(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.D0;
                        if (size > 0) {
                            int i2 = q20Var.c;
                            if (((int[]) roVar.d) != null) {
                                int i3 = roVar.c * 2;
                                for (int i4 = 0; i4 < i3; i4 += 2) {
                                    if (((int[]) roVar.d)[i4] == i2) {
                                        break;
                                    }
                                }
                            }
                            int i5 = size - 1;
                            loop1: while (i5 >= 0) {
                                int i6 = ((q20) arrayList.get(i5)).c;
                                if (((int[]) roVar.d) == null) {
                                    break;
                                }
                                int i7 = roVar.c * 2;
                                for (int i8 = 0; i8 < i7; i8 += 2) {
                                    if (((int[]) roVar.d)[i8] == i6) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i5 + 1;
                        }
                        arrayList.add(size, q20Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(q20Var, true);
                    }
                    r4 = z2;
                }
                recyclerView.k.Q(q20Var);
                if (r4 && !z3 && z) {
                    q20Var.s = null;
                    q20Var.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (q20Var.g()) {
        }
        recyclerView.k.Q(q20Var);
        if (r4) {
        }
    }

    public final void i(View view) {
        x10 x10Var;
        q20 I = RecyclerView.I(view);
        int i = I.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && I.k() && (x10Var = recyclerView.P) != null) {
            lg lgVar = (lg) x10Var;
            if (I.c().isEmpty() && lgVar.g && !I.f()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                I.n = this;
                I.o = true;
                this.b.add(I);
                return;
            }
        }
        if (I.f() && !I.h() && !recyclerView.q.b) {
            g9.i("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
            return;
        }
        I.n = this;
        I.o = false;
        this.a.add(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0426, code lost:
    
        if (r10.f() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0452, code lost:
    
        if ((r13 + r11) >= r28) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c4, code lost:
    
        if (r10.f != 0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q20 j(int i, long j) {
        q20 q20Var;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        boolean z5;
        ViewGroup.LayoutParams layoutParams;
        c20 c20Var;
        int i2;
        q20 q20Var2;
        int i3;
        View view;
        boolean z6;
        int size;
        int g;
        RecyclerView recyclerView = this.h;
        n20 n20Var = recyclerView.k0;
        if (i < 0 || i >= n20Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + n20Var.b() + recyclerView.y());
        }
        if (n20Var.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        q20Var = (q20) this.b.get(i4);
                        if (!q20Var.p() && q20Var.b() == i) {
                            q20Var.a(32);
                            break;
                        }
                        i4++;
                    } else if (recyclerView.q.b && (g = recyclerView.i.g(i, 0)) > 0 && g < recyclerView.q.a()) {
                        long b = recyclerView.q.b(g);
                        for (int i5 = 0; i5 < size; i5++) {
                            q20 q20Var3 = (q20) this.b.get(i5);
                            if (!q20Var3.p() && q20Var3.e == b) {
                                q20Var3.a(32);
                                q20Var = q20Var3;
                                break;
                            }
                        }
                    }
                }
                if (q20Var != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (q20Var != null) {
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            q20 q20Var4 = (q20) arrayList2.get(i6);
                            if (!q20Var4.p() && q20Var4.b() == i && !q20Var4.f() && (n20Var.g || !q20Var4.h())) {
                                q20Var4.a(32);
                                q20Var = q20Var4;
                                z2 = true;
                                break;
                            }
                        }
                        ArrayList arrayList4 = (ArrayList) recyclerView.j.i;
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size3) {
                                z2 = true;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i7);
                            q20 I = RecyclerView.I(view);
                            z2 = true;
                            if (I.b() == i && !I.f() && !I.h()) {
                                break;
                            }
                            i7++;
                        }
                        if (view == null) {
                            int size4 = arrayList3.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size4) {
                                    q20Var = null;
                                    break;
                                }
                                q20 q20Var5 = (q20) arrayList3.get(i8);
                                if (!q20Var5.f() && q20Var5.b() == i && !q20Var5.d()) {
                                    arrayList3.remove(i8);
                                    q20Var = q20Var5;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            q20 I2 = RecyclerView.I(view);
                            k6 k6Var = recyclerView.j;
                            ra raVar = (ra) k6Var.h;
                            int indexOfChild = ((s10) k6Var.g).a.indexOfChild(view);
                            if (indexOfChild < 0) {
                                g9.v(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!raVar.d(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            raVar.a(indexOfChild);
                            k6Var.D(view);
                            k6 k6Var2 = recyclerView.j;
                            ra raVar2 = (ra) k6Var2.h;
                            int indexOfChild2 = ((s10) k6Var2.g).a.indexOfChild(view);
                            int b2 = (indexOfChild2 == -1 || raVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - raVar2.b(indexOfChild2);
                            if (b2 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I2 + recyclerView.y());
                            }
                            recyclerView.j.i(b2);
                            i(view);
                            I2.a(8224);
                            q20Var = I2;
                        }
                        if (q20Var != null) {
                            if (q20Var.h()) {
                                z6 = n20Var.g;
                            } else {
                                int i9 = q20Var.c;
                                if (i9 < 0 || i9 >= recyclerView.q.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + q20Var + recyclerView.y());
                                }
                                if (!n20Var.g) {
                                    recyclerView.q.getClass();
                                }
                                t10 t10Var = recyclerView.q;
                                if (!t10Var.b || q20Var.e == t10Var.b(q20Var.c)) {
                                    z6 = z2;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                z = z2;
                            } else {
                                q20Var.a(4);
                                if (q20Var.i()) {
                                    recyclerView.removeDetachedView(q20Var.a, false);
                                    q20Var.n.k(q20Var);
                                } else if (q20Var.p()) {
                                    q20Var.j &= -33;
                                }
                                h(q20Var);
                                q20Var = null;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (q20Var != null) {
                        int g2 = recyclerView.i.g(i, 0);
                        if (g2 >= 0) {
                            j2 = 3;
                            if (g2 < recyclerView.q.a()) {
                                recyclerView.q.getClass();
                                t10 t10Var2 = recyclerView.q;
                                if (t10Var2.b) {
                                    long b3 = t10Var2.b(g2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            j3 = 4;
                                            q20 q20Var6 = (q20) arrayList2.get(size5);
                                            i3 = g2;
                                            long j5 = q20Var6.e;
                                            View view2 = q20Var6.a;
                                            if (j5 == b3 && !q20Var6.p()) {
                                                if (q20Var6.f == 0) {
                                                    q20Var6.a(32);
                                                    if (q20Var6.h() && !n20Var.g) {
                                                        q20Var6.j = (q20Var6.j & (-15)) | 2;
                                                    }
                                                    q20Var = q20Var6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    q20 I3 = RecyclerView.I(view2);
                                                    I3.n = null;
                                                    I3.o = false;
                                                    I3.j &= -33;
                                                    h(I3);
                                                }
                                            }
                                            size5--;
                                            g2 = i3;
                                        } else {
                                            i3 = g2;
                                            j3 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                q20 q20Var7 = (q20) arrayList3.get(size6);
                                                if (q20Var7.e != b3 || q20Var7.d()) {
                                                    size6--;
                                                } else if (q20Var7.f == 0) {
                                                    arrayList3.remove(size6);
                                                    q20Var = q20Var7;
                                                } else {
                                                    f(size6);
                                                }
                                            }
                                            q20Var = null;
                                        }
                                    }
                                    if (q20Var != null) {
                                        q20Var.c = i3;
                                        z = z2;
                                    }
                                } else {
                                    j3 = 4;
                                }
                                if (q20Var == null) {
                                    f20 f20Var = (f20) c().a.get(0);
                                    if (f20Var != null) {
                                        ArrayList arrayList5 = f20Var.a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((q20) arrayList5.get(size7)).d()) {
                                                    q20Var2 = (q20) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    q20Var2 = null;
                                    if (q20Var2 != null) {
                                        q20Var2.m();
                                        int[] iArr = RecyclerView.D0;
                                    }
                                    q20Var = q20Var2;
                                }
                                if (q20Var == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j6 = this.g.a(0).c;
                                        if (!((j6 == 0 || j6 + nanoTime < j) ? z2 : false)) {
                                            return null;
                                        }
                                    }
                                    t10 t10Var3 = recyclerView.q;
                                    t10Var3.getClass();
                                    try {
                                        int i10 = v90.a;
                                        Trace.beginSection("RV CreateView");
                                        q20Var = t10Var3.d(recyclerView);
                                        View view3 = q20Var.a;
                                        if (view3.getParent() != null) {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                        q20Var.f = 0;
                                        Trace.endSection();
                                        int[] iArr2 = RecyclerView.D0;
                                        RecyclerView D = RecyclerView.D(view3);
                                        if (D != null) {
                                            q20Var.b = new WeakReference(D);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        f20 a = this.g.a(0);
                                        long j7 = a.c;
                                        if (j7 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j7 / j3) * 3);
                                        }
                                        a.c = nanoTime2;
                                    } finally {
                                        int i11 = v90.a;
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + g2 + ").state:" + n20Var.b() + recyclerView.y());
                    }
                    j2 = 3;
                    j3 = 4;
                    View view4 = q20Var.a;
                    if (z && !n20Var.g) {
                        i2 = q20Var.j;
                        if ((i2 & 8192) == 0 ? z2 : false) {
                            q20Var.j = i2 & (-8193);
                            if (n20Var.j) {
                                x10.b(q20Var);
                                x10 x10Var = recyclerView.P;
                                q20Var.c();
                                x10Var.getClass();
                                hy hyVar = new hy();
                                hyVar.a(q20Var);
                                recyclerView.U(q20Var, hyVar);
                            }
                        }
                    }
                    if (n20Var.g || !q20Var.e()) {
                        if (q20Var.e()) {
                            if (!((q20Var.j & 2) != 0 ? z2 : false)) {
                            }
                        }
                        int g3 = recyclerView.i.g(i, 0);
                        q20Var.s = null;
                        q20Var.r = recyclerView;
                        int i12 = q20Var.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j8 = this.g.a(i12).d;
                            if (j8 != 0) {
                            }
                        }
                        t10 t10Var4 = recyclerView.q;
                        t10Var4.getClass();
                        z3 = q20Var.s != null ? z2 : false;
                        if (z3) {
                            q20Var.c = g3;
                            if (t10Var4.b) {
                                q20Var.e = t10Var4.b(g3);
                            }
                            q20Var.j = (q20Var.j & (-520)) | 1;
                            int i13 = v90.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        q20Var.s = t10Var4;
                        q20Var.c();
                        t10Var4.c(q20Var, g3);
                        if (z3) {
                            ArrayList arrayList6 = q20Var.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            q20Var.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof c20) {
                                ((c20) layoutParams2).c = z2;
                            }
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        f20 a2 = this.g.a(q20Var.f);
                        j4 = a2.d;
                        if (j4 != 0) {
                            nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        accessibilityManager = recyclerView.F;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = ic0.a;
                            z4 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            s20 s20Var = recyclerView.r0;
                            if (s20Var != null) {
                                r20 r20Var = s20Var.e;
                                if (r20Var != null) {
                                    View.AccessibilityDelegate d = ic0.d(view4);
                                    y yVar = d == null ? null : d instanceof x ? ((x) d).a : new y(d);
                                    if (yVar != null && yVar != r20Var) {
                                        r20Var.e.put(view4, yVar);
                                    }
                                }
                                ic0.m(view4, r20Var);
                            }
                        }
                        if (n20Var.g) {
                            q20Var.g = i;
                        }
                        z5 = z4;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams == null) {
                            c20Var = (c20) recyclerView.generateDefaultLayoutParams();
                            view4.setLayoutParams(c20Var);
                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                            c20Var = (c20) layoutParams;
                        } else {
                            c20Var = (c20) recyclerView.generateLayoutParams(layoutParams);
                            view4.setLayoutParams(c20Var);
                        }
                        c20Var.a = q20Var;
                        if (z || !z5) {
                            z4 = false;
                        }
                        c20Var.d = z4;
                        return q20Var;
                    }
                    q20Var.g = i;
                    z5 = false;
                    z4 = z2;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    c20Var.a = q20Var;
                    if (z) {
                    }
                    z4 = false;
                    c20Var.d = z4;
                    return q20Var;
                }
            }
            q20Var = null;
            if (q20Var != null) {
            }
        } else {
            q20Var = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (q20Var != null) {
        }
        if (q20Var != null) {
        }
        View view42 = q20Var.a;
        if (z) {
            i2 = q20Var.j;
            if ((i2 & 8192) == 0 ? z2 : false) {
            }
        }
        if (n20Var.g) {
        }
        if (q20Var.e()) {
        }
        int g32 = recyclerView.i.g(i, 0);
        q20Var.s = null;
        q20Var.r = recyclerView;
        int i122 = q20Var.f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        t10 t10Var42 = recyclerView.q;
        t10Var42.getClass();
        if (q20Var.s != null) {
        }
        if (z3) {
        }
        q20Var.s = t10Var42;
        q20Var.c();
        t10Var42.c(q20Var, g32);
        if (z3) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        f20 a22 = this.g.a(q20Var.f);
        j4 = a22.d;
        if (j4 != 0) {
        }
        a22.d = nanoTime42;
        accessibilityManager = recyclerView.F;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (n20Var.g) {
        }
        z5 = z4;
        layoutParams = view42.getLayoutParams();
        if (layoutParams == null) {
        }
        c20Var.a = q20Var;
        if (z) {
        }
        z4 = false;
        c20Var.d = z4;
        return q20Var;
    }

    public final void k(q20 q20Var) {
        if (q20Var.o) {
            this.b.remove(q20Var);
        } else {
            this.a.remove(q20Var);
        }
        q20Var.n = null;
        q20Var.o = false;
        q20Var.j &= -33;
    }

    public final void l() {
        b20 b20Var = this.h.r;
        this.f = this.e + (b20Var != null ? b20Var.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
