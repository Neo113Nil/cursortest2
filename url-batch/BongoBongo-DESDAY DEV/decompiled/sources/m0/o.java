package m0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public l f3300a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f3301b;

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
        l lVar;
        int i;
        p.b bVar;
        p.b bVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        i iVar;
        View view;
        t tVar;
        View view2;
        FrameLayout frameLayout = this.f3301b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = p.f3304c;
        FrameLayout frameLayout2 = this.f3301b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        p.b b2 = p.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            lVar = this.f3300a;
            arrayList3.add(lVar);
            lVar.a(new n(this, b2));
            i = 0;
            lVar.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).y(frameLayout2);
                }
            }
            lVar.f3286k = new ArrayList();
            lVar.f3287l = new ArrayList();
            S0.g gVar = lVar.f3283g;
            S0.g gVar2 = lVar.f3284h;
            bVar = new p.b((p.b) gVar.f822a);
            bVar2 = new p.b((p.b) gVar2.f822a);
            i2 = 0;
            while (true) {
                iArr = lVar.f3285j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3473c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && lVar.t(view3) && (tVar = (t) bVar2.remove(view3)) != null && lVar.t(tVar.f3309b)) {
                            lVar.f3286k.add((t) bVar.i(i8));
                            lVar.f3287l.add(tVar);
                        }
                    }
                } else if (i7 == 2) {
                    p.b bVar3 = (p.b) gVar.d;
                    int i9 = bVar3.f3473c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && lVar.t(view4)) {
                            View view5 = (View) ((p.b) gVar2.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && lVar.t(view5)) {
                                t tVar2 = (t) bVar.getOrDefault(view4, null);
                                t tVar3 = (t) bVar2.getOrDefault(view5, null);
                                if (tVar2 != null && tVar3 != null) {
                                    lVar.f3286k.add(tVar2);
                                    lVar.f3287l.add(tVar3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) gVar.f823b;
                    SparseArray sparseArray2 = (SparseArray) gVar2.f823b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && lVar.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && lVar.t(view2)) {
                            t tVar4 = (t) bVar.getOrDefault(view6, null);
                            t tVar5 = (t) bVar2.getOrDefault(view2, null);
                            if (tVar4 != null && tVar5 != null) {
                                lVar.f3286k.add(tVar4);
                                lVar.f3287l.add(tVar5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    p.e eVar = (p.e) gVar.f824c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && lVar.t(view7)) {
                            if (eVar.f3451a) {
                                eVar.b();
                            }
                            View view8 = (View) ((p.e) gVar2.f824c).c(eVar.f3452b[i12], l2);
                            lVar = lVar;
                            if (view8 != null && lVar.t(view8)) {
                                t tVar6 = (t) bVar.getOrDefault(view7, l2);
                                t tVar7 = (t) bVar2.getOrDefault(view8, l2);
                                if (tVar6 != null && tVar7 != null) {
                                    lVar.f3286k.add(tVar6);
                                    lVar.f3287l.add(tVar7);
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
            for (i3 = 0; i3 < bVar.f3473c; i3++) {
                t tVar8 = (t) bVar.j(i3);
                if (lVar.t(tVar8.f3309b)) {
                    lVar.f3286k.add(tVar8);
                    lVar.f3287l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3473c; i4++) {
                t tVar9 = (t) bVar2.j(i4);
                if (lVar.t(tVar9.f3309b)) {
                    lVar.f3287l.add(tVar9);
                    lVar.f3286k.add(null);
                }
            }
            p.b p2 = l.p();
            int i13 = p2.f3473c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (iVar = (i) p2.getOrDefault(animator, null)) != null && (view = iVar.f3265a) != null && windowId.equals(iVar.d)) {
                    t r2 = lVar.r(view, true);
                    t n2 = lVar.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (t) ((p.b) lVar.f3284h.f822a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        t tVar10 = iVar.f3267c;
                        l lVar2 = iVar.f3268e;
                        if (lVar2.s(tVar10, n2)) {
                            lVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            lVar.l(frameLayout2, lVar.f3283g, lVar.f3284h, lVar.f3286k, lVar.f3287l);
            lVar.z();
            return true;
        }
        arrayList = null;
        lVar = this.f3300a;
        arrayList3.add(lVar);
        lVar.a(new n(this, b2));
        i = 0;
        lVar.h(frameLayout2, false);
        if (arrayList != null) {
        }
        lVar.f3286k = new ArrayList();
        lVar.f3287l = new ArrayList();
        S0.g gVar3 = lVar.f3283g;
        S0.g gVar22 = lVar.f3284h;
        bVar = new p.b((p.b) gVar3.f822a);
        bVar2 = new p.b((p.b) gVar22.f822a);
        i2 = 0;
        while (true) {
            iArr = lVar.f3285j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3473c) {
        }
        while (i4 < bVar2.f3473c) {
        }
        p.b p22 = l.p();
        int i132 = p22.f3473c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        lVar.l(frameLayout2, lVar.f3283g, lVar.f3284h, lVar.f3286k, lVar.f3287l);
        lVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f3301b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = p.f3304c;
        FrameLayout frameLayout2 = this.f3301b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) p.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((l) it.next()).y(frameLayout2);
            }
        }
        this.f3300a.i(true);
    }
}
