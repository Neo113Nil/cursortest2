package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ca0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public z90 f;
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
        x6 x6Var;
        x6 x6Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        w90 w90Var;
        boolean z;
        ha0 ha0Var;
        View view;
        View view2;
        boolean z2;
        z90 z90Var = this.f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!da0.c.remove(viewGroup)) {
            return true;
        }
        x6 b = da0.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(z90Var);
            z90Var.a(new ba0(this, b));
            i = 0;
            z90Var.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((z90) obj).y(viewGroup);
                }
            }
            z90Var.p = new ArrayList();
            z90Var.q = new ArrayList();
            rg rgVar = z90Var.l;
            rg rgVar2 = z90Var.m;
            x6Var = new x6((x6) rgVar.f);
            x6Var2 = new x6((x6) rgVar2.f);
            i2 = 0;
            while (true) {
                iArr = z90Var.o;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = x6Var.h - 1; i8 >= 0; i8--) {
                        View view3 = (View) x6Var.f(i8);
                        if (view3 != null && z90Var.t(view3) && (ha0Var = (ha0) x6Var2.remove(view3)) != null && z90Var.t(ha0Var.b)) {
                            z90Var.p.add((ha0) x6Var.g(i8));
                            z90Var.q.add(ha0Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    x6 x6Var3 = (x6) rgVar.i;
                    x6 x6Var4 = (x6) rgVar2.i;
                    int i9 = x6Var3.h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) x6Var3.i(i10);
                        if (view4 != null && z90Var.t(view4) && (view = (View) x6Var4.get(x6Var3.f(i10))) != null && z90Var.t(view)) {
                            ha0 ha0Var2 = (ha0) x6Var.get(view4);
                            ha0 ha0Var3 = (ha0) x6Var2.get(view);
                            if (ha0Var2 != null && ha0Var3 != null) {
                                z90Var.p.add(ha0Var2);
                                z90Var.q.add(ha0Var3);
                                x6Var.remove(view4);
                                x6Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        eu euVar = (eu) rgVar.h;
                        eu euVar2 = (eu) rgVar2.h;
                        int e = euVar.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view5 = (View) euVar.f(i11);
                            if (view5 == null || !z90Var.t(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) euVar2.b(euVar.c(i11));
                                if (view6 != null && z90Var.t(view6)) {
                                    ha0 ha0Var4 = (ha0) x6Var.get(view5);
                                    ha0 ha0Var5 = (ha0) x6Var2.get(view6);
                                    if (ha0Var4 != null && ha0Var5 != null) {
                                        z2 = z4;
                                        z90Var.p.add(ha0Var4);
                                        z90Var.q.add(ha0Var5);
                                        x6Var.remove(view5);
                                        x6Var2.remove(view6);
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
                    SparseArray sparseArray = (SparseArray) rgVar.g;
                    SparseArray sparseArray2 = (SparseArray) rgVar2.g;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && z90Var.t(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && z90Var.t(view2)) {
                            ha0 ha0Var6 = (ha0) x6Var.get(view7);
                            ha0 ha0Var7 = (ha0) x6Var2.get(view2);
                            if (ha0Var6 != null && ha0Var7 != null) {
                                z90Var.p.add(ha0Var6);
                                z90Var.q.add(ha0Var7);
                                x6Var.remove(view7);
                                x6Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < x6Var.h; i3++) {
                ha0 ha0Var8 = (ha0) x6Var.i(i3);
                if (z90Var.t(ha0Var8.b)) {
                    z90Var.p.add(ha0Var8);
                    z90Var.q.add(null);
                }
            }
            for (i4 = 0; i4 < x6Var2.h; i4++) {
                ha0 ha0Var9 = (ha0) x6Var2.i(i4);
                if (z90Var.t(ha0Var9.b)) {
                    z90Var.q.add(ha0Var9);
                    z90Var.p.add(null);
                }
            }
            x6 p = z90.p();
            int i13 = p.h;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) p.f(i5);
                if (animator != null && (w90Var = (w90) p.get(animator)) != null) {
                    z90 z90Var2 = w90Var.e;
                    View view8 = w90Var.a;
                    if (view8 != null && windowId.equals(w90Var.d)) {
                        ha0 ha0Var10 = w90Var.c;
                        boolean z6 = z5;
                        ha0 r = z90Var.r(view8, z6);
                        ha0 n = z90Var.n(view8, z6);
                        if (r == null && n == null) {
                            n = (ha0) ((x6) z90Var.m.f).get(view8);
                        }
                        if ((r != null || n != null) && z90Var2.s(ha0Var10, n)) {
                            z90Var2.o().getClass();
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
            z90Var.l(viewGroup, z90Var.l, z90Var.m, z90Var.p, z90Var.q);
            z90Var.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(z90Var);
        z90Var.a(new ba0(this, b));
        i = 0;
        z90Var.h(viewGroup, false);
        if (arrayList != null) {
        }
        z90Var.p = new ArrayList();
        z90Var.q = new ArrayList();
        rg rgVar3 = z90Var.l;
        rg rgVar22 = z90Var.m;
        x6Var = new x6((x6) rgVar3.f);
        x6Var2 = new x6((x6) rgVar22.f);
        i2 = 0;
        while (true) {
            iArr = z90Var.o;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < x6Var.h) {
        }
        while (i4 < x6Var2.h) {
        }
        x6 p2 = z90.p();
        int i132 = p2.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        z90Var.l(viewGroup, z90Var.l, z90Var.m, z90Var.p, z90Var.q);
        z90Var.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        da0.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) da0.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((z90) obj).y(viewGroup);
            }
        }
        this.f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
