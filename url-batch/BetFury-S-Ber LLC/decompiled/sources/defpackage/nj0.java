package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nj0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public kj0 f;
    public ViewGroup g;

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0 A[EDGE_INSN: B:114:0x01e0->B:115:0x01e0 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        g7 g7Var;
        g7 g7Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        gj0 gj0Var;
        boolean z;
        sj0 sj0Var;
        View view;
        View view2;
        boolean z2;
        kj0 kj0Var = this.f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!oj0.c.remove(viewGroup)) {
            return true;
        }
        g7 b = oj0.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(kj0Var);
            kj0Var.a(new mj0(this, b));
            i = 0;
            kj0Var.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((kj0) obj).y(viewGroup);
                }
            }
            kj0Var.p = new ArrayList();
            kj0Var.q = new ArrayList();
            wi wiVar = kj0Var.l;
            wi wiVar2 = kj0Var.m;
            g7Var = new g7((g7) wiVar.f);
            g7Var2 = new g7((g7) wiVar2.f);
            i2 = 0;
            while (true) {
                iArr = kj0Var.o;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = g7Var.h - 1; i8 >= 0; i8--) {
                        View view3 = (View) g7Var.f(i8);
                        if (view3 != null && kj0Var.t(view3) && (sj0Var = (sj0) g7Var2.remove(view3)) != null && kj0Var.t(sj0Var.b)) {
                            kj0Var.p.add((sj0) g7Var.g(i8));
                            kj0Var.q.add(sj0Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    g7 g7Var3 = (g7) wiVar.i;
                    g7 g7Var4 = (g7) wiVar2.i;
                    int i9 = g7Var3.h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) g7Var3.i(i10);
                        if (view4 != null && kj0Var.t(view4) && (view = (View) g7Var4.get(g7Var3.f(i10))) != null && kj0Var.t(view)) {
                            sj0 sj0Var2 = (sj0) g7Var.get(view4);
                            sj0 sj0Var3 = (sj0) g7Var2.get(view);
                            if (sj0Var2 != null && sj0Var3 != null) {
                                kj0Var.p.add(sj0Var2);
                                kj0Var.q.add(sj0Var3);
                                g7Var.remove(view4);
                                g7Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        ez ezVar = (ez) wiVar.h;
                        ez ezVar2 = (ez) wiVar2.h;
                        int e = ezVar.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view5 = (View) ezVar.f(i11);
                            if (view5 == null || !kj0Var.t(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) ezVar2.b(ezVar.c(i11));
                                if (view6 != null && kj0Var.t(view6)) {
                                    sj0 sj0Var4 = (sj0) g7Var.get(view5);
                                    sj0 sj0Var5 = (sj0) g7Var2.get(view6);
                                    if (sj0Var4 != null && sj0Var5 != null) {
                                        z2 = z4;
                                        kj0Var.p.add(sj0Var4);
                                        kj0Var.q.add(sj0Var5);
                                        g7Var.remove(view5);
                                        g7Var2.remove(view6);
                                    }
                                }
                                z2 = z4;
                            }
                            i11++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) wiVar.g;
                    SparseArray sparseArray2 = (SparseArray) wiVar2.g;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && kj0Var.t(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && kj0Var.t(view2)) {
                            sj0 sj0Var6 = (sj0) g7Var.get(view7);
                            sj0 sj0Var7 = (sj0) g7Var2.get(view2);
                            if (sj0Var6 != null && sj0Var7 != null) {
                                kj0Var.p.add(sj0Var6);
                                kj0Var.q.add(sj0Var7);
                                g7Var.remove(view7);
                                g7Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < g7Var.h; i3++) {
                sj0 sj0Var8 = (sj0) g7Var.i(i3);
                if (kj0Var.t(sj0Var8.b)) {
                    kj0Var.p.add(sj0Var8);
                    kj0Var.q.add(null);
                }
            }
            for (i4 = 0; i4 < g7Var2.h; i4++) {
                sj0 sj0Var9 = (sj0) g7Var2.i(i4);
                if (kj0Var.t(sj0Var9.b)) {
                    kj0Var.q.add(sj0Var9);
                    kj0Var.p.add(null);
                }
            }
            g7 p = kj0.p();
            int i13 = p.h;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) p.f(i5);
                if (animator != null && (gj0Var = (gj0) p.get(animator)) != null) {
                    kj0 kj0Var2 = gj0Var.e;
                    View view8 = gj0Var.a;
                    if (view8 != null && windowId.equals(gj0Var.d)) {
                        sj0 sj0Var10 = gj0Var.c;
                        boolean z6 = z5;
                        sj0 r = kj0Var.r(view8, z6);
                        sj0 n = kj0Var.n(view8, z6);
                        if (r == null && n == null) {
                            n = (sj0) ((g7) kj0Var.m.f).get(view8);
                        }
                        if ((r != null || n != null) && kj0Var2.s(sj0Var10, n)) {
                            kj0Var2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            kj0Var.l(viewGroup, kj0Var.l, kj0Var.m, kj0Var.p, kj0Var.q);
            kj0Var.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(kj0Var);
        kj0Var.a(new mj0(this, b));
        i = 0;
        kj0Var.h(viewGroup, false);
        if (arrayList != null) {
        }
        kj0Var.p = new ArrayList();
        kj0Var.q = new ArrayList();
        wi wiVar3 = kj0Var.l;
        wi wiVar22 = kj0Var.m;
        g7Var = new g7((g7) wiVar3.f);
        g7Var2 = new g7((g7) wiVar22.f);
        i2 = 0;
        while (true) {
            iArr = kj0Var.o;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < g7Var.h) {
        }
        while (i4 < g7Var2.h) {
        }
        g7 p2 = kj0.p();
        int i132 = p2.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        kj0Var.l(viewGroup, kj0Var.l, kj0Var.m, kj0Var.p, kj0Var.q);
        kj0Var.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        oj0.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) oj0.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((kj0) obj).y(viewGroup);
            }
        }
        this.f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
