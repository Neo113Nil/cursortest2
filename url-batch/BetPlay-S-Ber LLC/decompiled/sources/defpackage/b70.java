package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class b70 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public y60 f;
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
        e7 e7Var;
        e7 e7Var2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        u60 u60Var;
        boolean z;
        h70 h70Var;
        View view;
        View view2;
        boolean z2;
        y60 y60Var = this.f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!c70.c.remove(viewGroup)) {
            return true;
        }
        e7 b = c70.b();
        ArrayList arrayList2 = (ArrayList) b.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(y60Var);
            y60Var.a(new a70(this, b));
            i = 0;
            y60Var.i(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    ((y60) obj).A(viewGroup);
                }
            }
            y60Var.p = new ArrayList();
            y60Var.q = new ArrayList();
            h8 h8Var = y60Var.l;
            h8 h8Var2 = y60Var.m;
            e7Var = new e7((e7) h8Var.f);
            e7Var2 = new e7((e7) h8Var2.f);
            i2 = 0;
            while (true) {
                iArr = y60Var.o;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = e7Var.h - 1; i8 >= 0; i8--) {
                        View view3 = (View) e7Var.f(i8);
                        if (view3 != null && y60Var.u(view3) && (h70Var = (h70) e7Var2.remove(view3)) != null && y60Var.u(h70Var.b)) {
                            y60Var.p.add((h70) e7Var.g(i8));
                            y60Var.q.add(h70Var);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    e7 e7Var3 = (e7) h8Var.i;
                    e7 e7Var4 = (e7) h8Var2.i;
                    int i9 = e7Var3.h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) e7Var3.i(i10);
                        if (view4 != null && y60Var.u(view4) && (view = (View) e7Var4.get(e7Var3.f(i10))) != null && y60Var.u(view)) {
                            h70 h70Var2 = (h70) e7Var.get(view4);
                            h70 h70Var3 = (h70) e7Var2.get(view);
                            if (h70Var2 != null && h70Var3 != null) {
                                y60Var.p.add(h70Var2);
                                y60Var.q.add(h70Var3);
                                e7Var.remove(view4);
                                e7Var2.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        vr vrVar = (vr) h8Var.h;
                        vr vrVar2 = (vr) h8Var2.h;
                        int e = vrVar.e();
                        int i11 = i;
                        while (i11 < e) {
                            View view5 = (View) vrVar.f(i11);
                            if (view5 == null || !y60Var.u(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) vrVar2.b(vrVar.c(i11));
                                if (view6 != null && y60Var.u(view6)) {
                                    h70 h70Var4 = (h70) e7Var.get(view5);
                                    h70 h70Var5 = (h70) e7Var2.get(view6);
                                    if (h70Var4 != null && h70Var5 != null) {
                                        z2 = z4;
                                        y60Var.p.add(h70Var4);
                                        y60Var.q.add(h70Var5);
                                        e7Var.remove(view5);
                                        e7Var2.remove(view6);
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
                    SparseArray sparseArray = (SparseArray) h8Var.g;
                    SparseArray sparseArray2 = (SparseArray) h8Var2.g;
                    int size2 = sparseArray.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && y60Var.u(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && y60Var.u(view2)) {
                            h70 h70Var6 = (h70) e7Var.get(view7);
                            h70 h70Var7 = (h70) e7Var2.get(view2);
                            if (h70Var6 != null && h70Var7 != null) {
                                y60Var.p.add(h70Var6);
                                y60Var.q.add(h70Var7);
                                e7Var.remove(view7);
                                e7Var2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < e7Var.h; i3++) {
                h70 h70Var8 = (h70) e7Var.i(i3);
                if (y60Var.u(h70Var8.b)) {
                    y60Var.p.add(h70Var8);
                    y60Var.q.add(null);
                }
            }
            for (i4 = 0; i4 < e7Var2.h; i4++) {
                h70 h70Var9 = (h70) e7Var2.i(i4);
                if (y60Var.u(h70Var9.b)) {
                    y60Var.q.add(h70Var9);
                    y60Var.p.add(null);
                }
            }
            e7 q = y60.q();
            int i13 = q.h;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) q.f(i5);
                if (animator != null && (u60Var = (u60) q.get(animator)) != null) {
                    y60 y60Var2 = u60Var.e;
                    View view8 = u60Var.a;
                    if (view8 != null && windowId.equals(u60Var.d)) {
                        h70 h70Var10 = u60Var.c;
                        boolean z6 = z5;
                        h70 s = y60Var.s(view8, z6);
                        h70 o = y60Var.o(view8, z6);
                        if (s == null && o == null) {
                            o = (h70) ((e7) y60Var.m.f).get(view8);
                        }
                        if ((s != null || o != null) && y60Var2.t(h70Var10, o)) {
                            y60Var2.p().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                q.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            y60Var.m(viewGroup, y60Var.l, y60Var.m, y60Var.p, y60Var.q);
            y60Var.B();
            return true;
        }
        arrayList = null;
        arrayList2.add(y60Var);
        y60Var.a(new a70(this, b));
        i = 0;
        y60Var.i(viewGroup, false);
        if (arrayList != null) {
        }
        y60Var.p = new ArrayList();
        y60Var.q = new ArrayList();
        h8 h8Var3 = y60Var.l;
        h8 h8Var22 = y60Var.m;
        e7Var = new e7((e7) h8Var3.f);
        e7Var2 = new e7((e7) h8Var22.f);
        i2 = 0;
        while (true) {
            iArr = y60Var.o;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < e7Var.h) {
        }
        while (i4 < e7Var2.h) {
        }
        e7 q2 = y60.q();
        int i132 = q2.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        y60Var.m(viewGroup, y60Var.l, y60Var.m, y60Var.p, y60Var.q);
        y60Var.B();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        c70.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c70.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((y60) obj).A(viewGroup);
            }
        }
        this.f.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
