package p1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public q f14793a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f14794b;

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0 A[EDGE_INSN: B:115:0x01f0->B:116:0x01f0 BREAK  A[LOOP:1: B:16:0x0086->B:28:0x01e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i4;
        p.e eVar;
        p.e eVar2;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        o oVar;
        View view;
        ViewGroup viewGroup;
        boolean z;
        x xVar;
        View view2;
        View view3;
        ViewGroup viewGroup2;
        boolean z4;
        q qVar = this.f14793a;
        ViewGroup viewGroup3 = this.f14794b;
        viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup3.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = u.f14797c;
        ViewGroup viewGroup4 = this.f14794b;
        boolean z5 = true;
        if (!arrayList2.remove(viewGroup4)) {
            return true;
        }
        p.e a3 = u.a();
        ArrayList arrayList3 = (ArrayList) a3.get(viewGroup4);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            a3.put(viewGroup4, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(qVar);
            qVar.a(new s(this, a3));
            i4 = 0;
            qVar.i(viewGroup4, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((q) obj).y(viewGroup4);
                }
            }
            qVar.f14783i = new ArrayList();
            qVar.f14784j = new ArrayList();
            G1.c cVar = qVar.f14779e;
            G1.c cVar2 = qVar.f14780f;
            eVar = new p.e((p.e) cVar.f835b);
            eVar2 = new p.e((p.e) cVar2.f835b);
            i5 = 0;
            while (true) {
                iArr = qVar.f14782h;
                if (i5 < iArr.length) {
                    break;
                }
                int i10 = iArr[i5];
                if (i10 == z5) {
                    viewGroup = viewGroup4;
                    z = z5;
                    for (int i11 = eVar.f14667c - 1; i11 >= 0; i11--) {
                        View view4 = (View) eVar.f(i11);
                        if (view4 != null && qVar.t(view4) && (xVar = (x) eVar2.remove(view4)) != null && qVar.t(xVar.f14805b)) {
                            qVar.f14783i.add((x) eVar.g(i11));
                            qVar.f14784j.add(xVar);
                        }
                    }
                } else if (i10 == 2) {
                    viewGroup = viewGroup4;
                    z = z5;
                    p.e eVar3 = (p.e) cVar.f838e;
                    p.e eVar4 = (p.e) cVar2.f838e;
                    int i12 = eVar3.f14667c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        View view5 = (View) eVar3.i(i13);
                        if (view5 != null && qVar.t(view5) && (view2 = (View) eVar4.get(eVar3.f(i13))) != null && qVar.t(view2)) {
                            x xVar2 = (x) eVar.get(view5);
                            x xVar3 = (x) eVar2.get(view2);
                            if (xVar2 != null && xVar3 != null) {
                                qVar.f14783i.add(xVar2);
                                qVar.f14784j.add(xVar3);
                                eVar.remove(view5);
                                eVar2.remove(view2);
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        p.g gVar = (p.g) cVar.f837d;
                        p.g gVar2 = (p.g) cVar2.f837d;
                        int e4 = gVar.e();
                        int i14 = i4;
                        while (i14 < e4) {
                            View view6 = (View) gVar.f(i14);
                            if (view6 == null || !qVar.t(view6)) {
                                viewGroup2 = viewGroup4;
                            } else {
                                viewGroup2 = viewGroup4;
                                View view7 = (View) gVar2.b(gVar.c(i14));
                                if (view7 != null && qVar.t(view7)) {
                                    x xVar4 = (x) eVar.get(view6);
                                    z4 = z5;
                                    x xVar5 = (x) eVar2.get(view7);
                                    if (xVar4 != null && xVar5 != null) {
                                        qVar.f14783i.add(xVar4);
                                        qVar.f14784j.add(xVar5);
                                        eVar.remove(view6);
                                        eVar2.remove(view7);
                                    }
                                    i14++;
                                    viewGroup4 = viewGroup2;
                                    z5 = z4;
                                }
                            }
                            z4 = z5;
                            i14++;
                            viewGroup4 = viewGroup2;
                            z5 = z4;
                        }
                    }
                    viewGroup = viewGroup4;
                    z = z5;
                } else {
                    viewGroup = viewGroup4;
                    z = z5;
                    SparseArray sparseArray = (SparseArray) cVar.f836c;
                    SparseArray sparseArray2 = (SparseArray) cVar2.f836c;
                    int size2 = sparseArray.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        View view8 = (View) sparseArray.valueAt(i15);
                        if (view8 != null && qVar.t(view8) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i15))) != null && qVar.t(view3)) {
                            x xVar6 = (x) eVar.get(view8);
                            x xVar7 = (x) eVar2.get(view3);
                            if (xVar6 != null && xVar7 != null) {
                                qVar.f14783i.add(xVar6);
                                qVar.f14784j.add(xVar7);
                                eVar.remove(view8);
                                eVar2.remove(view3);
                            }
                        }
                    }
                }
                i5++;
                viewGroup4 = viewGroup;
                z5 = z;
                i4 = 0;
            }
            ViewGroup viewGroup5 = viewGroup4;
            boolean z6 = z5;
            for (i6 = 0; i6 < eVar.f14667c; i6++) {
                x xVar8 = (x) eVar.i(i6);
                if (qVar.t(xVar8.f14805b)) {
                    qVar.f14783i.add(xVar8);
                    qVar.f14784j.add(null);
                }
            }
            for (i7 = 0; i7 < eVar2.f14667c; i7++) {
                x xVar9 = (x) eVar2.i(i7);
                if (qVar.t(xVar9.f14805b)) {
                    qVar.f14784j.add(xVar9);
                    qVar.f14783i.add(null);
                }
            }
            p.e p2 = q.p();
            int i16 = p2.f14667c;
            A a4 = y.f14807a;
            WindowId windowId = viewGroup5.getWindowId();
            i8 = i16 - 1;
            while (i8 >= 0) {
                Animator animator = (Animator) p2.f(i8);
                if (animator != null && (oVar = (o) p2.get(animator)) != null && (view = oVar.f14767a) != null && oVar.f14770d.f14739a.equals(windowId)) {
                    x xVar10 = oVar.f14769c;
                    boolean z7 = z6;
                    x r4 = qVar.r(view, z7);
                    x o = qVar.o(view, z7);
                    if (r4 == null && o == null) {
                        o = (x) ((p.e) qVar.f14780f.f835b).get(view);
                    }
                    if ((r4 != null || o != null) && oVar.f14771e.s(xVar10, o)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            p2.remove(animator);
                        }
                    }
                }
                i8--;
                z6 = true;
            }
            qVar.m(viewGroup5, qVar.f14779e, qVar.f14780f, qVar.f14783i, qVar.f14784j);
            qVar.z();
            return true;
        }
        arrayList = null;
        arrayList3.add(qVar);
        qVar.a(new s(this, a3));
        i4 = 0;
        qVar.i(viewGroup4, false);
        if (arrayList != null) {
        }
        qVar.f14783i = new ArrayList();
        qVar.f14784j = new ArrayList();
        G1.c cVar3 = qVar.f14779e;
        G1.c cVar22 = qVar.f14780f;
        eVar = new p.e((p.e) cVar3.f835b);
        eVar2 = new p.e((p.e) cVar22.f835b);
        i5 = 0;
        while (true) {
            iArr = qVar.f14782h;
            if (i5 < iArr.length) {
            }
            i5++;
            viewGroup4 = viewGroup;
            z5 = z;
            i4 = 0;
        }
        ViewGroup viewGroup52 = viewGroup4;
        boolean z62 = z5;
        while (i6 < eVar.f14667c) {
        }
        while (i7 < eVar2.f14667c) {
        }
        p.e p22 = q.p();
        int i162 = p22.f14667c;
        A a42 = y.f14807a;
        WindowId windowId2 = viewGroup52.getWindowId();
        i8 = i162 - 1;
        while (i8 >= 0) {
        }
        qVar.m(viewGroup52, qVar.f14779e, qVar.f14780f, qVar.f14783i, qVar.f14784j);
        qVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f14794b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = u.f14797c;
        ViewGroup viewGroup2 = this.f14794b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) u.a().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ((q) obj).y(viewGroup2);
            }
        }
        this.f14793a.j(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
