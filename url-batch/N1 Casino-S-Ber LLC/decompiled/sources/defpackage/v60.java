package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class v60 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public s60 f;
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
        n6 n6Var;
        n6 n6Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        o60 o60Var;
        boolean z;
        a70 a70Var;
        View view;
        View view2;
        boolean z2;
        s60 s60Var = this.f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!w60.c.remove(viewGroup)) {
            return true;
        }
        n6 b = w60.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(s60Var);
            s60Var.a(new u60(this, b));
            i = 0;
            s60Var.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((s60) obj).y(viewGroup);
                }
            }
            s60Var.p = new ArrayList();
            s60Var.q = new ArrayList();
            we weVar = s60Var.l;
            we weVar2 = s60Var.m;
            n6Var = new n6((n6) weVar.f);
            n6Var2 = new n6((n6) weVar2.f);
            i2 = 0;
            while (true) {
                iArr = s60Var.o;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = n6Var.h - 1; i8 >= 0; i8--) {
                        View view3 = (View) n6Var.f(i8);
                        if (view3 != null && s60Var.t(view3) && (a70Var = (a70) n6Var2.remove(view3)) != null && s60Var.t(a70Var.b)) {
                            s60Var.p.add((a70) n6Var.g(i8));
                            s60Var.q.add(a70Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    n6 n6Var3 = (n6) weVar.i;
                    n6 n6Var4 = (n6) weVar2.i;
                    int i9 = n6Var3.h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) n6Var3.i(i10);
                        if (view4 != null && s60Var.t(view4) && (view = (View) n6Var4.get(n6Var3.f(i10))) != null && s60Var.t(view)) {
                            a70 a70Var2 = (a70) n6Var.get(view4);
                            a70 a70Var3 = (a70) n6Var2.get(view);
                            if (a70Var2 != null && a70Var3 != null) {
                                s60Var.p.add(a70Var2);
                                s60Var.q.add(a70Var3);
                                n6Var.remove(view4);
                                n6Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        hr hrVar = (hr) weVar.h;
                        hr hrVar2 = (hr) weVar2.h;
                        int e = hrVar.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view5 = (View) hrVar.f(i11);
                            if (view5 == null || !s60Var.t(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) hrVar2.b(hrVar.c(i11));
                                if (view6 != null && s60Var.t(view6)) {
                                    a70 a70Var4 = (a70) n6Var.get(view5);
                                    a70 a70Var5 = (a70) n6Var2.get(view6);
                                    if (a70Var4 != null && a70Var5 != null) {
                                        z2 = z4;
                                        s60Var.p.add(a70Var4);
                                        s60Var.q.add(a70Var5);
                                        n6Var.remove(view5);
                                        n6Var2.remove(view6);
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
                    SparseArray sparseArray = (SparseArray) weVar.g;
                    SparseArray sparseArray2 = (SparseArray) weVar2.g;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && s60Var.t(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && s60Var.t(view2)) {
                            a70 a70Var6 = (a70) n6Var.get(view7);
                            a70 a70Var7 = (a70) n6Var2.get(view2);
                            if (a70Var6 != null && a70Var7 != null) {
                                s60Var.p.add(a70Var6);
                                s60Var.q.add(a70Var7);
                                n6Var.remove(view7);
                                n6Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < n6Var.h; i3++) {
                a70 a70Var8 = (a70) n6Var.i(i3);
                if (s60Var.t(a70Var8.b)) {
                    s60Var.p.add(a70Var8);
                    s60Var.q.add(null);
                }
            }
            for (i4 = 0; i4 < n6Var2.h; i4++) {
                a70 a70Var9 = (a70) n6Var2.i(i4);
                if (s60Var.t(a70Var9.b)) {
                    s60Var.q.add(a70Var9);
                    s60Var.p.add(null);
                }
            }
            n6 p = s60.p();
            int i13 = p.h;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) p.f(i5);
                if (animator != null && (o60Var = (o60) p.get(animator)) != null) {
                    s60 s60Var2 = o60Var.e;
                    View view8 = o60Var.a;
                    if (view8 != null && windowId.equals(o60Var.d)) {
                        a70 a70Var10 = o60Var.c;
                        boolean z6 = z5;
                        a70 r = s60Var.r(view8, z6);
                        a70 n = s60Var.n(view8, z6);
                        if (r == null && n == null) {
                            n = (a70) ((n6) s60Var.m.f).get(view8);
                        }
                        if ((r != null || n != null) && s60Var2.s(a70Var10, n)) {
                            s60Var2.o().getClass();
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
            s60Var.l(viewGroup, s60Var.l, s60Var.m, s60Var.p, s60Var.q);
            s60Var.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(s60Var);
        s60Var.a(new u60(this, b));
        i = 0;
        s60Var.h(viewGroup, false);
        if (arrayList != null) {
        }
        s60Var.p = new ArrayList();
        s60Var.q = new ArrayList();
        we weVar3 = s60Var.l;
        we weVar22 = s60Var.m;
        n6Var = new n6((n6) weVar3.f);
        n6Var2 = new n6((n6) weVar22.f);
        i2 = 0;
        while (true) {
            iArr = s60Var.o;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < n6Var.h) {
        }
        while (i4 < n6Var2.h) {
        }
        n6 p2 = s60.p();
        int i132 = p2.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        s60Var.l(viewGroup, s60Var.l, s60Var.m, s60Var.p, s60Var.q);
        s60Var.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        w60.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) w60.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((s60) obj).y(viewGroup);
            }
        }
        this.f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
