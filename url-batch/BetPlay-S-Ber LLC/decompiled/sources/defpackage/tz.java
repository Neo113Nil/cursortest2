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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class tz {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public sz g;
    public final /* synthetic */ RecyclerView h;

    public tz(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(c00 c00Var, boolean z) {
        RecyclerView.j(c00Var);
        View view = c00Var.a;
        RecyclerView recyclerView = this.h;
        e00 e00Var = recyclerView.r0;
        if (e00Var != null) {
            d00 d00Var = e00Var.b;
            e90.m(view, d00Var != null ? (w) d00Var.b.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                o8.c();
                return;
            } else if (recyclerView.k0 != null) {
                recyclerView.k.K(c00Var);
            }
        }
        c00Var.s = null;
        c00Var.r = null;
        sz c = c();
        c.getClass();
        int i = c00Var.f;
        ArrayList arrayList2 = c.a(i).a;
        if (((rz) c.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        c00Var.m();
        arrayList2.add(c00Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        zz zzVar = recyclerView.k0;
        if (i >= 0 && i < zzVar.b()) {
            return !zzVar.g ? i : recyclerView.i.f(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + zzVar.b() + recyclerView.y());
    }

    public final sz c() {
        if (this.g == null) {
            sz szVar = new sz();
            szVar.a = new SparseArray();
            szVar.b = 0;
            this.g = szVar;
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
        sm smVar = this.h.j0;
        int[] iArr2 = smVar.c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        smVar.d = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((c00) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        c00 I = RecyclerView.I(view);
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

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(c00 c00Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.h;
        sm smVar = recyclerView.j0;
        boolean i = c00Var.i();
        View view = c00Var.a;
        boolean z3 = true;
        if (i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(c00Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (c00Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c00Var + recyclerView.y());
        }
        if (c00Var.o()) {
            o8.j("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.y()));
            return;
        }
        if ((c00Var.j & 16) == 0) {
            WeakHashMap weakHashMap = e90.a;
            if (view.hasTransientState()) {
                z = true;
                if (c00Var.g()) {
                    z3 = false;
                } else {
                    if (this.f <= 0 || (c00Var.j & 526) != 0) {
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
                            int i2 = c00Var.c;
                            if (smVar.c != null) {
                                int i3 = smVar.d * 2;
                                for (int i4 = 0; i4 < i3; i4 += 2) {
                                    if (smVar.c[i4] == i2) {
                                        break;
                                    }
                                }
                            }
                            int i5 = size - 1;
                            loop1: while (i5 >= 0) {
                                int i6 = ((c00) arrayList.get(i5)).c;
                                if (smVar.c == null) {
                                    break;
                                }
                                int i7 = smVar.d * 2;
                                for (int i8 = 0; i8 < i7; i8 += 2) {
                                    if (smVar.c[i8] == i6) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i5 + 1;
                        }
                        arrayList.add(size, c00Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        a(c00Var, true);
                    }
                    r4 = z2;
                }
                recyclerView.k.K(c00Var);
                if (r4 && !z3 && z) {
                    c00Var.s = null;
                    c00Var.r = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (c00Var.g()) {
        }
        recyclerView.k.K(c00Var);
        if (r4) {
        }
    }

    public final void i(View view) {
        jz jzVar;
        c00 I = RecyclerView.I(view);
        int i = I.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && I.k() && (jzVar = recyclerView.P) != null) {
            se seVar = (se) jzVar;
            if (I.c().isEmpty() && seVar.g && !I.f()) {
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
            o8.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
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
    public final c00 j(int i, long j) {
        c00 c00Var;
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
        oz ozVar;
        int i2;
        c00 c00Var2;
        int i3;
        View view;
        boolean z6;
        int size;
        int f;
        RecyclerView recyclerView = this.h;
        zz zzVar = recyclerView.k0;
        if (i < 0 || i >= zzVar.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + zzVar.b() + recyclerView.y());
        }
        if (zzVar.g) {
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 < size) {
                        c00Var = (c00) this.b.get(i4);
                        if (!c00Var.p() && c00Var.b() == i) {
                            c00Var.a(32);
                            break;
                        }
                        i4++;
                    } else if (recyclerView.q.b && (f = recyclerView.i.f(i, 0)) > 0 && f < recyclerView.q.a()) {
                        long b = recyclerView.q.b(f);
                        for (int i5 = 0; i5 < size; i5++) {
                            c00 c00Var3 = (c00) this.b.get(i5);
                            if (!c00Var3.p() && c00Var3.e == b) {
                                c00Var3.a(32);
                                c00Var = c00Var3;
                                break;
                            }
                        }
                    }
                }
                if (c00Var != null) {
                    z = true;
                    ArrayList arrayList2 = this.a;
                    ArrayList arrayList3 = this.c;
                    if (c00Var != null) {
                        int size2 = arrayList2.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            c00 c00Var4 = (c00) arrayList2.get(i6);
                            if (!c00Var4.p() && c00Var4.b() == i && !c00Var4.f() && (zzVar.g || !c00Var4.h())) {
                                c00Var4.a(32);
                                c00Var = c00Var4;
                                z2 = true;
                                break;
                            }
                        }
                        ArrayList arrayList4 = (ArrayList) recyclerView.j.d;
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size3) {
                                z2 = true;
                                view = null;
                                break;
                            }
                            view = (View) arrayList4.get(i7);
                            c00 I = RecyclerView.I(view);
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
                                    c00Var = null;
                                    break;
                                }
                                c00 c00Var5 = (c00) arrayList3.get(i8);
                                if (!c00Var5.f() && c00Var5.b() == i && !c00Var5.d()) {
                                    arrayList3.remove(i8);
                                    c00Var = c00Var5;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            c00 I2 = RecyclerView.I(view);
                            r6 r6Var = recyclerView.j;
                            aa aaVar = (aa) r6Var.c;
                            int indexOfChild = ((ez) r6Var.b).a.indexOfChild(view);
                            if (indexOfChild < 0) {
                                o8.v(view, "view is not a child, cannot hide ");
                                return null;
                            }
                            if (!aaVar.d(indexOfChild)) {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                            aaVar.a(indexOfChild);
                            r6Var.y(view);
                            r6 r6Var2 = recyclerView.j;
                            aa aaVar2 = (aa) r6Var2.c;
                            int indexOfChild2 = ((ez) r6Var2.b).a.indexOfChild(view);
                            int b2 = (indexOfChild2 == -1 || aaVar2.d(indexOfChild2)) ? -1 : indexOfChild2 - aaVar2.b(indexOfChild2);
                            if (b2 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + I2 + recyclerView.y());
                            }
                            recyclerView.j.d(b2);
                            i(view);
                            I2.a(8224);
                            c00Var = I2;
                        }
                        if (c00Var != null) {
                            if (c00Var.h()) {
                                z6 = zzVar.g;
                            } else {
                                int i9 = c00Var.c;
                                if (i9 < 0 || i9 >= recyclerView.q.a()) {
                                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c00Var + recyclerView.y());
                                }
                                if (!zzVar.g) {
                                    recyclerView.q.getClass();
                                }
                                fz fzVar = recyclerView.q;
                                if (!fzVar.b || c00Var.e == fzVar.b(c00Var.c)) {
                                    z6 = z2;
                                }
                                z6 = false;
                            }
                            if (z6) {
                                z = z2;
                            } else {
                                c00Var.a(4);
                                if (c00Var.i()) {
                                    recyclerView.removeDetachedView(c00Var.a, false);
                                    c00Var.n.k(c00Var);
                                } else if (c00Var.p()) {
                                    c00Var.j &= -33;
                                }
                                h(c00Var);
                                c00Var = null;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    if (c00Var != null) {
                        int f2 = recyclerView.i.f(i, 0);
                        if (f2 >= 0) {
                            j2 = 3;
                            if (f2 < recyclerView.q.a()) {
                                recyclerView.q.getClass();
                                fz fzVar2 = recyclerView.q;
                                if (fzVar2.b) {
                                    long b3 = fzVar2.b(f2);
                                    int size5 = arrayList2.size() - 1;
                                    while (true) {
                                        if (size5 >= 0) {
                                            j3 = 4;
                                            c00 c00Var6 = (c00) arrayList2.get(size5);
                                            i3 = f2;
                                            long j5 = c00Var6.e;
                                            View view2 = c00Var6.a;
                                            if (j5 == b3 && !c00Var6.p()) {
                                                if (c00Var6.f == 0) {
                                                    c00Var6.a(32);
                                                    if (c00Var6.h() && !zzVar.g) {
                                                        c00Var6.j = (c00Var6.j & (-15)) | 2;
                                                    }
                                                    c00Var = c00Var6;
                                                } else {
                                                    arrayList2.remove(size5);
                                                    recyclerView.removeDetachedView(view2, false);
                                                    c00 I3 = RecyclerView.I(view2);
                                                    I3.n = null;
                                                    I3.o = false;
                                                    I3.j &= -33;
                                                    h(I3);
                                                }
                                            }
                                            size5--;
                                            f2 = i3;
                                        } else {
                                            i3 = f2;
                                            j3 = 4;
                                            int size6 = arrayList3.size() - 1;
                                            while (true) {
                                                if (size6 < 0) {
                                                    break;
                                                }
                                                c00 c00Var7 = (c00) arrayList3.get(size6);
                                                if (c00Var7.e != b3 || c00Var7.d()) {
                                                    size6--;
                                                } else if (c00Var7.f == 0) {
                                                    arrayList3.remove(size6);
                                                    c00Var = c00Var7;
                                                } else {
                                                    f(size6);
                                                }
                                            }
                                            c00Var = null;
                                        }
                                    }
                                    if (c00Var != null) {
                                        c00Var.c = i3;
                                        z = z2;
                                    }
                                } else {
                                    j3 = 4;
                                }
                                if (c00Var == null) {
                                    rz rzVar = (rz) c().a.get(0);
                                    if (rzVar != null) {
                                        ArrayList arrayList5 = rzVar.a;
                                        if (!arrayList5.isEmpty()) {
                                            for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                                if (!((c00) arrayList5.get(size7)).d()) {
                                                    c00Var2 = (c00) arrayList5.remove(size7);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    c00Var2 = null;
                                    if (c00Var2 != null) {
                                        c00Var2.m();
                                        int[] iArr = RecyclerView.D0;
                                    }
                                    c00Var = c00Var2;
                                }
                                if (c00Var == null) {
                                    long nanoTime = recyclerView.getNanoTime();
                                    if (j != Long.MAX_VALUE) {
                                        long j6 = this.g.a(0).c;
                                        if (!((j6 == 0 || j6 + nanoTime < j) ? z2 : false)) {
                                            return null;
                                        }
                                    }
                                    fz fzVar3 = recyclerView.q;
                                    fzVar3.getClass();
                                    try {
                                        int i10 = t60.a;
                                        Trace.beginSection("RV CreateView");
                                        c00Var = fzVar3.d(recyclerView);
                                        View view3 = c00Var.a;
                                        if (view3.getParent() != null) {
                                            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                        }
                                        c00Var.f = 0;
                                        Trace.endSection();
                                        int[] iArr2 = RecyclerView.D0;
                                        RecyclerView D = RecyclerView.D(view3);
                                        if (D != null) {
                                            c00Var.b = new WeakReference(D);
                                        }
                                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                        rz a = this.g.a(0);
                                        long j7 = a.c;
                                        if (j7 != 0) {
                                            nanoTime2 = (nanoTime2 / j3) + ((j7 / j3) * 3);
                                        }
                                        a.c = nanoTime2;
                                    } finally {
                                        int i11 = t60.a;
                                        Trace.endSection();
                                    }
                                }
                            }
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + f2 + ").state:" + zzVar.b() + recyclerView.y());
                    }
                    j2 = 3;
                    j3 = 4;
                    View view4 = c00Var.a;
                    if (z && !zzVar.g) {
                        i2 = c00Var.j;
                        if ((i2 & 8192) == 0 ? z2 : false) {
                            c00Var.j = i2 & (-8193);
                            if (zzVar.j) {
                                jz.b(c00Var);
                                jz jzVar = recyclerView.P;
                                c00Var.c();
                                jzVar.getClass();
                                uv uvVar = new uv();
                                uvVar.a(c00Var);
                                recyclerView.U(c00Var, uvVar);
                            }
                        }
                    }
                    if (zzVar.g || !c00Var.e()) {
                        if (c00Var.e()) {
                            if (!((c00Var.j & 2) != 0 ? z2 : false)) {
                            }
                        }
                        int f3 = recyclerView.i.f(i, 0);
                        c00Var.s = null;
                        c00Var.r = recyclerView;
                        int i12 = c00Var.f;
                        long nanoTime3 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j8 = this.g.a(i12).d;
                            if (j8 != 0) {
                            }
                        }
                        fz fzVar4 = recyclerView.q;
                        fzVar4.getClass();
                        z3 = c00Var.s != null ? z2 : false;
                        if (z3) {
                            c00Var.c = f3;
                            if (fzVar4.b) {
                                c00Var.e = fzVar4.b(f3);
                            }
                            c00Var.j = (c00Var.j & (-520)) | 1;
                            int i13 = t60.a;
                            Trace.beginSection("RV OnBindView");
                        }
                        c00Var.s = fzVar4;
                        c00Var.c();
                        fzVar4.c(c00Var, f3);
                        if (z3) {
                            ArrayList arrayList6 = c00Var.k;
                            if (arrayList6 != null) {
                                arrayList6.clear();
                            }
                            c00Var.j &= -1025;
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            if (layoutParams2 instanceof oz) {
                                ((oz) layoutParams2).c = z2;
                            }
                        }
                        long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                        rz a2 = this.g.a(c00Var.f);
                        j4 = a2.d;
                        if (j4 != 0) {
                            nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                        }
                        a2.d = nanoTime4;
                        accessibilityManager = recyclerView.F;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z4 = true;
                        } else {
                            WeakHashMap weakHashMap = e90.a;
                            z4 = true;
                            if (view4.getImportantForAccessibility() == 0) {
                                view4.setImportantForAccessibility(1);
                            }
                            e00 e00Var = recyclerView.r0;
                            if (e00Var != null) {
                                d00 d00Var = e00Var.b;
                                if (d00Var != null) {
                                    View.AccessibilityDelegate d = e90.d(view4);
                                    w wVar = d == null ? null : d instanceof v ? ((v) d).a : new w(d);
                                    if (wVar != null && wVar != d00Var) {
                                        d00Var.b.put(view4, wVar);
                                    }
                                }
                                e90.m(view4, d00Var);
                            }
                        }
                        if (zzVar.g) {
                            c00Var.g = i;
                        }
                        z5 = z4;
                        layoutParams = view4.getLayoutParams();
                        if (layoutParams == null) {
                            ozVar = (oz) recyclerView.generateDefaultLayoutParams();
                            view4.setLayoutParams(ozVar);
                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                            ozVar = (oz) layoutParams;
                        } else {
                            ozVar = (oz) recyclerView.generateLayoutParams(layoutParams);
                            view4.setLayoutParams(ozVar);
                        }
                        ozVar.a = c00Var;
                        if (z || !z5) {
                            z4 = false;
                        }
                        ozVar.d = z4;
                        return c00Var;
                    }
                    c00Var.g = i;
                    z5 = false;
                    z4 = z2;
                    layoutParams = view4.getLayoutParams();
                    if (layoutParams == null) {
                    }
                    ozVar.a = c00Var;
                    if (z) {
                    }
                    z4 = false;
                    ozVar.d = z4;
                    return c00Var;
                }
            }
            c00Var = null;
            if (c00Var != null) {
            }
        } else {
            c00Var = null;
        }
        z = false;
        ArrayList arrayList22 = this.a;
        ArrayList arrayList32 = this.c;
        if (c00Var != null) {
        }
        if (c00Var != null) {
        }
        View view42 = c00Var.a;
        if (z) {
            i2 = c00Var.j;
            if ((i2 & 8192) == 0 ? z2 : false) {
            }
        }
        if (zzVar.g) {
        }
        if (c00Var.e()) {
        }
        int f32 = recyclerView.i.f(i, 0);
        c00Var.s = null;
        c00Var.r = recyclerView;
        int i122 = c00Var.f;
        long nanoTime32 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        fz fzVar42 = recyclerView.q;
        fzVar42.getClass();
        if (c00Var.s != null) {
        }
        if (z3) {
        }
        c00Var.s = fzVar42;
        c00Var.c();
        fzVar42.c(c00Var, f32);
        if (z3) {
        }
        long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
        rz a22 = this.g.a(c00Var.f);
        j4 = a22.d;
        if (j4 != 0) {
        }
        a22.d = nanoTime42;
        accessibilityManager = recyclerView.F;
        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
        }
        if (zzVar.g) {
        }
        z5 = z4;
        layoutParams = view42.getLayoutParams();
        if (layoutParams == null) {
        }
        ozVar.a = c00Var;
        if (z) {
        }
        z4 = false;
        ozVar.d = z4;
        return c00Var;
    }

    public final void k(c00 c00Var) {
        if (c00Var.o) {
            this.b.remove(c00Var);
        } else {
            this.a.remove(c00Var);
        }
        c00Var.n = null;
        c00Var.o = false;
        c00Var.j &= -33;
    }

    public final void l() {
        nz nzVar = this.h.r;
        this.f = this.e + (nzVar != null ? nzVar.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
