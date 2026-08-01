package k0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0193p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0190m f2827a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f2828b;

    /* JADX WARN: Removed duplicated region for block: B:119:0x01e6 A[EDGE_INSN: B:119:0x01e6->B:120:0x01e6 BREAK  A[LOOP:1: B:17:0x0088->B:53:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0190m abstractC0190m;
        int i;
        o.b bVar;
        o.b bVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0187j c0187j;
        View view;
        C0198u c0198u;
        View view2;
        FrameLayout frameLayout = this.f2828b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0194q.f2831c;
        FrameLayout frameLayout2 = this.f2828b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        o.b b2 = AbstractC0194q.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            abstractC0190m = this.f2827a;
            arrayList3.add(abstractC0190m);
            abstractC0190m.a(new C0192o(this, b2));
            i = 0;
            abstractC0190m.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0190m) it.next()).y(frameLayout2);
                }
            }
            abstractC0190m.f2813k = new ArrayList();
            abstractC0190m.f2814l = new ArrayList();
            T.t tVar = abstractC0190m.f2811g;
            T.t tVar2 = abstractC0190m.h;
            bVar = new o.b((o.b) tVar.f748a);
            bVar2 = new o.b((o.b) tVar2.f748a);
            i2 = 0;
            while (true) {
                iArr = abstractC0190m.f2812j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3350c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && abstractC0190m.t(view3) && (c0198u = (C0198u) bVar2.remove(view3)) != null && abstractC0190m.t(c0198u.f2836b)) {
                            abstractC0190m.f2813k.add((C0198u) bVar.i(i8));
                            abstractC0190m.f2814l.add(c0198u);
                        }
                    }
                } else if (i7 == 2) {
                    o.b bVar3 = (o.b) tVar.d;
                    int i9 = bVar3.f3350c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && abstractC0190m.t(view4)) {
                            View view5 = (View) ((o.b) tVar2.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && abstractC0190m.t(view5)) {
                                C0198u c0198u2 = (C0198u) bVar.getOrDefault(view4, null);
                                C0198u c0198u3 = (C0198u) bVar2.getOrDefault(view5, null);
                                if (c0198u2 != null && c0198u3 != null) {
                                    abstractC0190m.f2813k.add(c0198u2);
                                    abstractC0190m.f2814l.add(c0198u3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) tVar.f749b;
                    SparseArray sparseArray2 = (SparseArray) tVar2.f749b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && abstractC0190m.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC0190m.t(view2)) {
                            C0198u c0198u4 = (C0198u) bVar.getOrDefault(view6, null);
                            C0198u c0198u5 = (C0198u) bVar2.getOrDefault(view2, null);
                            if (c0198u4 != null && c0198u5 != null) {
                                abstractC0190m.f2813k.add(c0198u4);
                                abstractC0190m.f2814l.add(c0198u5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    o.e eVar = (o.e) tVar.f750c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && abstractC0190m.t(view7)) {
                            if (eVar.f3328a) {
                                eVar.b();
                            }
                            View view8 = (View) ((o.e) tVar2.f750c).c(eVar.f3329b[i12], l2);
                            abstractC0190m = abstractC0190m;
                            if (view8 != null && abstractC0190m.t(view8)) {
                                C0198u c0198u6 = (C0198u) bVar.getOrDefault(view7, l2);
                                C0198u c0198u7 = (C0198u) bVar2.getOrDefault(view8, l2);
                                if (c0198u6 != null && c0198u7 != null) {
                                    abstractC0190m.f2813k.add(c0198u6);
                                    abstractC0190m.f2814l.add(c0198u7);
                                    bVar.remove(view7);
                                    bVar2.remove(view8);
                                }
                            }
                        }
                        i12++;
                        l2 = null;
                    }
                }
                i2++;
                i = 0;
                l2 = null;
                i6 = 1;
            }
            for (i3 = 0; i3 < bVar.f3350c; i3++) {
                C0198u c0198u8 = (C0198u) bVar.j(i3);
                if (abstractC0190m.t(c0198u8.f2836b)) {
                    abstractC0190m.f2813k.add(c0198u8);
                    abstractC0190m.f2814l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3350c; i4++) {
                C0198u c0198u9 = (C0198u) bVar2.j(i4);
                if (abstractC0190m.t(c0198u9.f2836b)) {
                    abstractC0190m.f2814l.add(c0198u9);
                    abstractC0190m.f2813k.add(null);
                }
            }
            o.b p2 = AbstractC0190m.p();
            int i13 = p2.f3350c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (c0187j = (C0187j) p2.getOrDefault(animator, null)) != null && (view = c0187j.f2793a) != null && windowId.equals(c0187j.d)) {
                    C0198u r2 = abstractC0190m.r(view, true);
                    C0198u n2 = abstractC0190m.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (C0198u) ((o.b) abstractC0190m.h.f748a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        C0198u c0198u10 = c0187j.f2795c;
                        AbstractC0190m abstractC0190m2 = c0187j.f2796e;
                        if (abstractC0190m2.s(c0198u10, n2)) {
                            abstractC0190m2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0190m.l(frameLayout2, abstractC0190m.f2811g, abstractC0190m.h, abstractC0190m.f2813k, abstractC0190m.f2814l);
            abstractC0190m.z();
            return true;
        }
        arrayList = null;
        abstractC0190m = this.f2827a;
        arrayList3.add(abstractC0190m);
        abstractC0190m.a(new C0192o(this, b2));
        i = 0;
        abstractC0190m.h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC0190m.f2813k = new ArrayList();
        abstractC0190m.f2814l = new ArrayList();
        T.t tVar3 = abstractC0190m.f2811g;
        T.t tVar22 = abstractC0190m.h;
        bVar = new o.b((o.b) tVar3.f748a);
        bVar2 = new o.b((o.b) tVar22.f748a);
        i2 = 0;
        while (true) {
            iArr = abstractC0190m.f2812j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3350c) {
        }
        while (i4 < bVar2.f3350c) {
        }
        o.b p22 = AbstractC0190m.p();
        int i132 = p22.f3350c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        abstractC0190m.l(frameLayout2, abstractC0190m.f2811g, abstractC0190m.h, abstractC0190m.f2813k, abstractC0190m.f2814l);
        abstractC0190m.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f2828b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0194q.f2831c;
        FrameLayout frameLayout2 = this.f2828b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC0194q.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0190m) it.next()).y(frameLayout2);
            }
        }
        this.f2827a.i(true);
    }
}
