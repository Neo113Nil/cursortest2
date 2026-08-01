package k0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public n f2758a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f2759b;

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
        n nVar;
        int i;
        o.b bVar;
        o.b bVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        j jVar;
        View view;
        v vVar;
        View view2;
        FrameLayout frameLayout = this.f2759b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = r.f2762c;
        FrameLayout frameLayout2 = this.f2759b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        o.b b2 = r.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            nVar = this.f2758a;
            arrayList3.add(nVar);
            nVar.a(new p(this, b2));
            i = 0;
            nVar.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).y(frameLayout2);
                }
            }
            nVar.f2744k = new ArrayList();
            nVar.f2745l = new ArrayList();
            T.u uVar = nVar.f2742g;
            T.u uVar2 = nVar.h;
            bVar = new o.b((o.b) uVar.f801a);
            bVar2 = new o.b((o.b) uVar2.f801a);
            i2 = 0;
            while (true) {
                iArr = nVar.f2743j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3328c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && nVar.t(view3) && (vVar = (v) bVar2.remove(view3)) != null && nVar.t(vVar.f2767b)) {
                            nVar.f2744k.add((v) bVar.i(i8));
                            nVar.f2745l.add(vVar);
                        }
                    }
                } else if (i7 == 2) {
                    o.b bVar3 = (o.b) uVar.d;
                    int i9 = bVar3.f3328c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && nVar.t(view4)) {
                            View view5 = (View) ((o.b) uVar2.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && nVar.t(view5)) {
                                v vVar2 = (v) bVar.getOrDefault(view4, null);
                                v vVar3 = (v) bVar2.getOrDefault(view5, null);
                                if (vVar2 != null && vVar3 != null) {
                                    nVar.f2744k.add(vVar2);
                                    nVar.f2745l.add(vVar3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) uVar.f802b;
                    SparseArray sparseArray2 = (SparseArray) uVar2.f802b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && nVar.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && nVar.t(view2)) {
                            v vVar4 = (v) bVar.getOrDefault(view6, null);
                            v vVar5 = (v) bVar2.getOrDefault(view2, null);
                            if (vVar4 != null && vVar5 != null) {
                                nVar.f2744k.add(vVar4);
                                nVar.f2745l.add(vVar5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    o.e eVar = (o.e) uVar.f803c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && nVar.t(view7)) {
                            if (eVar.f3306a) {
                                eVar.b();
                            }
                            View view8 = (View) ((o.e) uVar2.f803c).c(eVar.f3307b[i12], l2);
                            nVar = nVar;
                            if (view8 != null && nVar.t(view8)) {
                                v vVar6 = (v) bVar.getOrDefault(view7, l2);
                                v vVar7 = (v) bVar2.getOrDefault(view8, l2);
                                if (vVar6 != null && vVar7 != null) {
                                    nVar.f2744k.add(vVar6);
                                    nVar.f2745l.add(vVar7);
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
            for (i3 = 0; i3 < bVar.f3328c; i3++) {
                v vVar8 = (v) bVar.j(i3);
                if (nVar.t(vVar8.f2767b)) {
                    nVar.f2744k.add(vVar8);
                    nVar.f2745l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3328c; i4++) {
                v vVar9 = (v) bVar2.j(i4);
                if (nVar.t(vVar9.f2767b)) {
                    nVar.f2745l.add(vVar9);
                    nVar.f2744k.add(null);
                }
            }
            o.b p2 = n.p();
            int i13 = p2.f3328c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (jVar = (j) p2.getOrDefault(animator, null)) != null && (view = jVar.f2721a) != null && windowId.equals(jVar.d)) {
                    v r2 = nVar.r(view, true);
                    v n2 = nVar.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (v) ((o.b) nVar.h.f801a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        v vVar10 = jVar.f2723c;
                        n nVar2 = jVar.f2724e;
                        if (nVar2.s(vVar10, n2)) {
                            nVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            nVar.l(frameLayout2, nVar.f2742g, nVar.h, nVar.f2744k, nVar.f2745l);
            nVar.z();
            return true;
        }
        arrayList = null;
        nVar = this.f2758a;
        arrayList3.add(nVar);
        nVar.a(new p(this, b2));
        i = 0;
        nVar.h(frameLayout2, false);
        if (arrayList != null) {
        }
        nVar.f2744k = new ArrayList();
        nVar.f2745l = new ArrayList();
        T.u uVar3 = nVar.f2742g;
        T.u uVar22 = nVar.h;
        bVar = new o.b((o.b) uVar3.f801a);
        bVar2 = new o.b((o.b) uVar22.f801a);
        i2 = 0;
        while (true) {
            iArr = nVar.f2743j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3328c) {
        }
        while (i4 < bVar2.f3328c) {
        }
        o.b p22 = n.p();
        int i132 = p22.f3328c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        nVar.l(frameLayout2, nVar.f2742g, nVar.h, nVar.f2744k, nVar.f2745l);
        nVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f2759b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = r.f2762c;
        FrameLayout frameLayout2 = this.f2759b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) r.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((n) it.next()).y(frameLayout2);
            }
        }
        this.f2758a.i(true);
    }
}
