package c5;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public o f1726d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f1727e;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5 A[EDGE_INSN: B:115:0x01f5->B:116:0x01f5 BREAK  A[LOOP:1: B:16:0x0084->B:28:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        x xVar;
        o.e eVar;
        o.e eVar2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        l lVar;
        x xVar2;
        boolean z3;
        w wVar;
        View view;
        View view2;
        x xVar3;
        boolean z7;
        o oVar = this.f1726d;
        ViewGroup viewGroup = this.f1727e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z8 = true;
        if (!s.f1730c.remove(viewGroup)) {
            return true;
        }
        o.e b8 = s.b();
        ArrayList arrayList2 = (ArrayList) b8.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b8.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(oVar);
            oVar.a(new q(this, b8));
            i = 0;
            oVar.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((o) obj).y(viewGroup);
                }
            }
            oVar.f1712n = new ArrayList();
            oVar.f1713o = new ArrayList();
            x xVar4 = oVar.f1708j;
            xVar = oVar.f1709k;
            eVar = new o.e((o.e) xVar4.f1737d);
            eVar2 = new o.e((o.e) xVar.f1737d);
            i8 = 0;
            while (true) {
                iArr = oVar.f1711m;
                if (i8 < iArr.length) {
                    break;
                }
                int i13 = iArr[i8];
                if (i13 == z8) {
                    xVar2 = xVar;
                    z3 = z8;
                    for (int i14 = eVar.f5542f - 1; i14 >= 0; i14--) {
                        View view3 = (View) eVar.f(i14);
                        if (view3 != null && oVar.t(view3) && (wVar = (w) eVar2.remove(view3)) != null && oVar.t(wVar.f1735b)) {
                            oVar.f1712n.add((w) eVar.g(i14));
                            oVar.f1713o.add(wVar);
                        }
                    }
                } else if (i13 == 2) {
                    xVar2 = xVar;
                    z3 = z8;
                    o.e eVar3 = (o.e) xVar4.f1738e;
                    o.e eVar4 = (o.e) xVar2.f1738e;
                    int i15 = eVar3.f5542f;
                    for (int i16 = 0; i16 < i15; i16++) {
                        View view4 = (View) eVar3.i(i16);
                        if (view4 != null && oVar.t(view4) && (view = (View) eVar4.get(eVar3.f(i16))) != null && oVar.t(view)) {
                            w wVar2 = (w) eVar.get(view4);
                            w wVar3 = (w) eVar2.get(view);
                            if (wVar2 != null && wVar3 != null) {
                                oVar.f1712n.add(wVar2);
                                oVar.f1713o.add(wVar3);
                                eVar.remove(view4);
                                eVar2.remove(view);
                            }
                        }
                    }
                } else if (i13 == 3) {
                    z3 = z8;
                    SparseArray sparseArray = (SparseArray) xVar4.f1739f;
                    xVar2 = xVar;
                    SparseArray sparseArray2 = (SparseArray) xVar2.f1739f;
                    int size2 = sparseArray.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        View view5 = (View) sparseArray.valueAt(i17);
                        if (view5 != null && oVar.t(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i17))) != null && oVar.t(view2)) {
                            w wVar4 = (w) eVar.get(view5);
                            w wVar5 = (w) eVar2.get(view2);
                            if (wVar4 != null && wVar5 != null) {
                                oVar.f1712n.add(wVar4);
                                oVar.f1713o.add(wVar5);
                                eVar.remove(view5);
                                eVar2.remove(view2);
                            }
                        }
                    }
                } else if (i13 != 4) {
                    xVar2 = xVar;
                    z3 = z8;
                } else {
                    o.q qVar = (o.q) xVar4.f1740g;
                    o.q qVar2 = (o.q) xVar.f1740g;
                    int g3 = qVar.g();
                    int i18 = i;
                    while (i18 < g3) {
                        View view6 = (View) qVar.h(i18);
                        if (view6 == null || !oVar.t(view6)) {
                            xVar3 = xVar;
                        } else {
                            xVar3 = xVar;
                            View view7 = (View) qVar2.b(qVar.d(i18));
                            if (view7 != null && oVar.t(view7)) {
                                w wVar6 = (w) eVar.get(view6);
                                w wVar7 = (w) eVar2.get(view7);
                                if (wVar6 != null && wVar7 != null) {
                                    z7 = z8;
                                    oVar.f1712n.add(wVar6);
                                    oVar.f1713o.add(wVar7);
                                    eVar.remove(view6);
                                    eVar2.remove(view7);
                                    i18++;
                                    xVar = xVar3;
                                    z8 = z7;
                                }
                            }
                        }
                        z7 = z8;
                        i18++;
                        xVar = xVar3;
                        z8 = z7;
                    }
                    z3 = z8;
                    xVar2 = xVar;
                }
                i8++;
                xVar = xVar2;
                z8 = z3;
                i = 0;
            }
            boolean z9 = z8;
            for (i9 = 0; i9 < eVar.f5542f; i9++) {
                w wVar8 = (w) eVar.i(i9);
                if (oVar.t(wVar8.f1735b)) {
                    oVar.f1712n.add(wVar8);
                    oVar.f1713o.add(null);
                }
            }
            for (i10 = 0; i10 < eVar2.f5542f; i10++) {
                w wVar9 = (w) eVar2.i(i10);
                if (oVar.t(wVar9.f1735b)) {
                    oVar.f1713o.add(wVar9);
                    oVar.f1712n.add(null);
                }
            }
            o.e p7 = o.p();
            int i19 = p7.f5542f;
            WindowId windowId = viewGroup.getWindowId();
            i11 = i19 - 1;
            while (i11 >= 0) {
                Animator animator = (Animator) p7.f(i11);
                if (animator != null && (lVar = (l) p7.get(animator)) != null) {
                    o oVar2 = lVar.f1694e;
                    View view8 = lVar.f1690a;
                    if (view8 != null && windowId.equals(lVar.f1693d)) {
                        w wVar10 = lVar.f1692c;
                        boolean z10 = z9;
                        w r7 = oVar.r(view8, z10);
                        w n6 = oVar.n(view8, z10);
                        if (r7 == null && n6 == null) {
                            n6 = (w) ((o.e) oVar.f1709k.f1737d).get(view8);
                        }
                        if ((r7 != null || n6 != null) && oVar2.s(wVar10, n6)) {
                            oVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p7.remove(animator);
                            }
                        }
                    }
                }
                i11--;
                z9 = true;
            }
            oVar.l(viewGroup, oVar.f1708j, oVar.f1709k, oVar.f1712n, oVar.f1713o);
            oVar.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(oVar);
        oVar.a(new q(this, b8));
        i = 0;
        oVar.h(viewGroup, false);
        if (arrayList != null) {
        }
        oVar.f1712n = new ArrayList();
        oVar.f1713o = new ArrayList();
        x xVar42 = oVar.f1708j;
        xVar = oVar.f1709k;
        eVar = new o.e((o.e) xVar42.f1737d);
        eVar2 = new o.e((o.e) xVar.f1737d);
        i8 = 0;
        while (true) {
            iArr = oVar.f1711m;
            if (i8 < iArr.length) {
            }
            i8++;
            xVar = xVar2;
            z8 = z3;
            i = 0;
        }
        boolean z92 = z8;
        while (i9 < eVar.f5542f) {
        }
        while (i10 < eVar2.f5542f) {
        }
        o.e p72 = o.p();
        int i192 = p72.f5542f;
        WindowId windowId2 = viewGroup.getWindowId();
        i11 = i192 - 1;
        while (i11 >= 0) {
        }
        oVar.l(viewGroup, oVar.f1708j, oVar.f1709k, oVar.f1712n, oVar.f1713o);
        oVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1727e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.f1730c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o) obj).y(viewGroup);
            }
        }
        this.f1726d.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
