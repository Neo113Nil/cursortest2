package f1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public o f1718f;
    public ViewGroup g;

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
        int i4;
        androidx.emoji2.text.w wVar;
        n.f fVar;
        n.f fVar2;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        l lVar;
        androidx.emoji2.text.w wVar2;
        boolean z3;
        w wVar3;
        View view;
        View view2;
        androidx.emoji2.text.w wVar4;
        boolean z4;
        o oVar = this.f1718f;
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z5 = true;
        if (!s.c.remove(viewGroup)) {
            return true;
        }
        n.f b2 = s.b();
        ArrayList arrayList2 = (ArrayList) b2.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b2.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(oVar);
            oVar.a(new q(this, b2));
            i4 = 0;
            oVar.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((o) obj).y(viewGroup);
                }
            }
            oVar.f1705p = new ArrayList();
            oVar.f1706q = new ArrayList();
            androidx.emoji2.text.w wVar5 = oVar.f1701l;
            wVar = oVar.f1702m;
            fVar = new n.f((n.f) wVar5.f368f);
            fVar2 = new n.f((n.f) wVar.f368f);
            i5 = 0;
            while (true) {
                iArr = oVar.f1704o;
                if (i5 < iArr.length) {
                    break;
                }
                int i10 = iArr[i5];
                if (i10 == z5) {
                    wVar2 = wVar;
                    z3 = z5;
                    for (int i11 = fVar.h - 1; i11 >= 0; i11--) {
                        View view3 = (View) fVar.f(i11);
                        if (view3 != null && oVar.t(view3) && (wVar3 = (w) fVar2.remove(view3)) != null && oVar.t(wVar3.f1725b)) {
                            oVar.f1705p.add((w) fVar.g(i11));
                            oVar.f1706q.add(wVar3);
                        }
                    }
                } else if (i10 == 2) {
                    wVar2 = wVar;
                    z3 = z5;
                    n.f fVar3 = (n.f) wVar5.f369i;
                    n.f fVar4 = (n.f) wVar2.f369i;
                    int i12 = fVar3.h;
                    for (int i13 = 0; i13 < i12; i13++) {
                        View view4 = (View) fVar3.i(i13);
                        if (view4 != null && oVar.t(view4) && (view = (View) fVar4.get(fVar3.f(i13))) != null && oVar.t(view)) {
                            w wVar6 = (w) fVar.get(view4);
                            w wVar7 = (w) fVar2.get(view);
                            if (wVar6 != null && wVar7 != null) {
                                oVar.f1705p.add(wVar6);
                                oVar.f1706q.add(wVar7);
                                fVar.remove(view4);
                                fVar2.remove(view);
                            }
                        }
                    }
                } else if (i10 == 3) {
                    z3 = z5;
                    SparseArray sparseArray = (SparseArray) wVar5.g;
                    wVar2 = wVar;
                    SparseArray sparseArray2 = (SparseArray) wVar2.g;
                    int size2 = sparseArray.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        View view5 = (View) sparseArray.valueAt(i14);
                        if (view5 != null && oVar.t(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && oVar.t(view2)) {
                            w wVar8 = (w) fVar.get(view5);
                            w wVar9 = (w) fVar2.get(view2);
                            if (wVar8 != null && wVar9 != null) {
                                oVar.f1705p.add(wVar8);
                                oVar.f1706q.add(wVar9);
                                fVar.remove(view5);
                                fVar2.remove(view2);
                            }
                        }
                    }
                } else if (i10 != 4) {
                    wVar2 = wVar;
                    z3 = z5;
                } else {
                    n.h hVar = (n.h) wVar5.h;
                    n.h hVar2 = (n.h) wVar.h;
                    int e4 = hVar.e();
                    int i15 = i4;
                    while (i15 < e4) {
                        View view6 = (View) hVar.f(i15);
                        if (view6 == null || !oVar.t(view6)) {
                            wVar4 = wVar;
                        } else {
                            wVar4 = wVar;
                            View view7 = (View) hVar2.b(hVar.c(i15));
                            if (view7 != null && oVar.t(view7)) {
                                w wVar10 = (w) fVar.get(view6);
                                w wVar11 = (w) fVar2.get(view7);
                                if (wVar10 != null && wVar11 != null) {
                                    z4 = z5;
                                    oVar.f1705p.add(wVar10);
                                    oVar.f1706q.add(wVar11);
                                    fVar.remove(view6);
                                    fVar2.remove(view7);
                                    i15++;
                                    wVar = wVar4;
                                    z5 = z4;
                                }
                            }
                        }
                        z4 = z5;
                        i15++;
                        wVar = wVar4;
                        z5 = z4;
                    }
                    z3 = z5;
                    wVar2 = wVar;
                }
                i5++;
                wVar = wVar2;
                z5 = z3;
                i4 = 0;
            }
            boolean z6 = z5;
            for (i6 = 0; i6 < fVar.h; i6++) {
                w wVar12 = (w) fVar.i(i6);
                if (oVar.t(wVar12.f1725b)) {
                    oVar.f1705p.add(wVar12);
                    oVar.f1706q.add(null);
                }
            }
            for (i7 = 0; i7 < fVar2.h; i7++) {
                w wVar13 = (w) fVar2.i(i7);
                if (oVar.t(wVar13.f1725b)) {
                    oVar.f1706q.add(wVar13);
                    oVar.f1705p.add(null);
                }
            }
            n.f p4 = o.p();
            int i16 = p4.h;
            WindowId windowId = viewGroup.getWindowId();
            i8 = i16 - 1;
            while (i8 >= 0) {
                Animator animator = (Animator) p4.f(i8);
                if (animator != null && (lVar = (l) p4.get(animator)) != null) {
                    o oVar2 = lVar.f1691e;
                    View view8 = lVar.f1688a;
                    if (view8 != null && windowId.equals(lVar.f1690d)) {
                        w wVar14 = lVar.c;
                        boolean z7 = z6;
                        w r3 = oVar.r(view8, z7);
                        w n3 = oVar.n(view8, z7);
                        if (r3 == null && n3 == null) {
                            n3 = (w) ((n.f) oVar.f1702m.f368f).get(view8);
                        }
                        if ((r3 != null || n3 != null) && oVar2.s(wVar14, n3)) {
                            oVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p4.remove(animator);
                            }
                        }
                    }
                }
                i8--;
                z6 = true;
            }
            oVar.l(viewGroup, oVar.f1701l, oVar.f1702m, oVar.f1705p, oVar.f1706q);
            oVar.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(oVar);
        oVar.a(new q(this, b2));
        i4 = 0;
        oVar.h(viewGroup, false);
        if (arrayList != null) {
        }
        oVar.f1705p = new ArrayList();
        oVar.f1706q = new ArrayList();
        androidx.emoji2.text.w wVar52 = oVar.f1701l;
        wVar = oVar.f1702m;
        fVar = new n.f((n.f) wVar52.f368f);
        fVar2 = new n.f((n.f) wVar.f368f);
        i5 = 0;
        while (true) {
            iArr = oVar.f1704o;
            if (i5 < iArr.length) {
            }
            i5++;
            wVar = wVar2;
            z5 = z3;
            i4 = 0;
        }
        boolean z62 = z5;
        while (i6 < fVar.h) {
        }
        while (i7 < fVar2.h) {
        }
        n.f p42 = o.p();
        int i162 = p42.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i8 = i162 - 1;
        while (i8 >= 0) {
        }
        oVar.l(viewGroup, oVar.f1701l, oVar.f1702m, oVar.f1705p, oVar.f1706q);
        oVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((o) obj).y(viewGroup);
            }
        }
        this.f1718f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
