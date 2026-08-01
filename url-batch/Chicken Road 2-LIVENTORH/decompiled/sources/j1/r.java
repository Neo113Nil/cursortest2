package j1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public o f1959f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f1960g;

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
        a0.j jVar;
        q.f fVar;
        q.f fVar2;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        l lVar;
        a0.j jVar2;
        boolean z3;
        w wVar;
        View view;
        View view2;
        a0.j jVar3;
        boolean z4;
        o oVar = this.f1959f;
        ViewGroup viewGroup = this.f1960g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z5 = true;
        if (!s.f1963c.remove(viewGroup)) {
            return true;
        }
        q.f b4 = s.b();
        ArrayList arrayList2 = (ArrayList) b4.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b4.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(oVar);
            oVar.a(new q(this, b4));
            i = 0;
            oVar.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    ((o) obj).z(viewGroup);
                }
            }
            oVar.f1947q = new ArrayList();
            oVar.f1948r = new ArrayList();
            a0.j jVar4 = oVar.f1943m;
            jVar = oVar.f1944n;
            fVar = new q.f((q.f) jVar4.f100f);
            fVar2 = new q.f((q.f) jVar.f100f);
            i4 = 0;
            while (true) {
                iArr = oVar.f1946p;
                if (i4 < iArr.length) {
                    break;
                }
                int i9 = iArr[i4];
                if (i9 == z5) {
                    jVar2 = jVar;
                    z3 = z5;
                    for (int i10 = fVar.f3036h - 1; i10 >= 0; i10--) {
                        View view3 = (View) fVar.f(i10);
                        if (view3 != null && oVar.u(view3) && (wVar = (w) fVar2.remove(view3)) != null && oVar.u(wVar.f1968b)) {
                            oVar.f1947q.add((w) fVar.g(i10));
                            oVar.f1948r.add(wVar);
                        }
                    }
                } else if (i9 == 2) {
                    jVar2 = jVar;
                    z3 = z5;
                    q.f fVar3 = (q.f) jVar4.i;
                    q.f fVar4 = (q.f) jVar2.i;
                    int i11 = fVar3.f3036h;
                    for (int i12 = 0; i12 < i11; i12++) {
                        View view4 = (View) fVar3.i(i12);
                        if (view4 != null && oVar.u(view4) && (view = (View) fVar4.get(fVar3.f(i12))) != null && oVar.u(view)) {
                            w wVar2 = (w) fVar.get(view4);
                            w wVar3 = (w) fVar2.get(view);
                            if (wVar2 != null && wVar3 != null) {
                                oVar.f1947q.add(wVar2);
                                oVar.f1948r.add(wVar3);
                                fVar.remove(view4);
                                fVar2.remove(view);
                            }
                        }
                    }
                } else if (i9 == 3) {
                    z3 = z5;
                    SparseArray sparseArray = (SparseArray) jVar4.f101g;
                    jVar2 = jVar;
                    SparseArray sparseArray2 = (SparseArray) jVar2.f101g;
                    int size2 = sparseArray.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        View view5 = (View) sparseArray.valueAt(i13);
                        if (view5 != null && oVar.u(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && oVar.u(view2)) {
                            w wVar4 = (w) fVar.get(view5);
                            w wVar5 = (w) fVar2.get(view2);
                            if (wVar4 != null && wVar5 != null) {
                                oVar.f1947q.add(wVar4);
                                oVar.f1948r.add(wVar5);
                                fVar.remove(view5);
                                fVar2.remove(view2);
                            }
                        }
                    }
                } else if (i9 != 4) {
                    jVar2 = jVar;
                    z3 = z5;
                } else {
                    q.h hVar = (q.h) jVar4.f102h;
                    q.h hVar2 = (q.h) jVar.f102h;
                    int e4 = hVar.e();
                    int i14 = i;
                    while (i14 < e4) {
                        View view6 = (View) hVar.f(i14);
                        if (view6 == null || !oVar.u(view6)) {
                            jVar3 = jVar;
                        } else {
                            jVar3 = jVar;
                            View view7 = (View) hVar2.b(hVar.c(i14));
                            if (view7 != null && oVar.u(view7)) {
                                w wVar6 = (w) fVar.get(view6);
                                w wVar7 = (w) fVar2.get(view7);
                                if (wVar6 != null && wVar7 != null) {
                                    z4 = z5;
                                    oVar.f1947q.add(wVar6);
                                    oVar.f1948r.add(wVar7);
                                    fVar.remove(view6);
                                    fVar2.remove(view7);
                                    i14++;
                                    jVar = jVar3;
                                    z5 = z4;
                                }
                            }
                        }
                        z4 = z5;
                        i14++;
                        jVar = jVar3;
                        z5 = z4;
                    }
                    z3 = z5;
                    jVar2 = jVar;
                }
                i4++;
                jVar = jVar2;
                z5 = z3;
                i = 0;
            }
            boolean z6 = z5;
            for (i5 = 0; i5 < fVar.f3036h; i5++) {
                w wVar8 = (w) fVar.i(i5);
                if (oVar.u(wVar8.f1968b)) {
                    oVar.f1947q.add(wVar8);
                    oVar.f1948r.add(null);
                }
            }
            for (i6 = 0; i6 < fVar2.f3036h; i6++) {
                w wVar9 = (w) fVar2.i(i6);
                if (oVar.u(wVar9.f1968b)) {
                    oVar.f1948r.add(wVar9);
                    oVar.f1947q.add(null);
                }
            }
            q.f q3 = o.q();
            int i15 = q3.f3036h;
            WindowId windowId = viewGroup.getWindowId();
            i7 = i15 - 1;
            while (i7 >= 0) {
                Animator animator = (Animator) q3.f(i7);
                if (animator != null && (lVar = (l) q3.get(animator)) != null) {
                    o oVar2 = lVar.f1931e;
                    View view8 = lVar.f1928a;
                    if (view8 != null && windowId.equals(lVar.d)) {
                        w wVar10 = lVar.f1930c;
                        boolean z7 = z6;
                        w s3 = oVar.s(view8, z7);
                        w o4 = oVar.o(view8, z7);
                        if (s3 == null && o4 == null) {
                            o4 = (w) ((q.f) oVar.f1944n.f100f).get(view8);
                        }
                        if ((s3 != null || o4 != null) && oVar2.t(wVar10, o4)) {
                            oVar2.p().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                q3.remove(animator);
                            }
                        }
                    }
                }
                i7--;
                z6 = true;
            }
            oVar.l(viewGroup, oVar.f1943m, oVar.f1944n, oVar.f1947q, oVar.f1948r);
            oVar.A();
            return true;
        }
        arrayList = null;
        arrayList2.add(oVar);
        oVar.a(new q(this, b4));
        i = 0;
        oVar.h(viewGroup, false);
        if (arrayList != null) {
        }
        oVar.f1947q = new ArrayList();
        oVar.f1948r = new ArrayList();
        a0.j jVar42 = oVar.f1943m;
        jVar = oVar.f1944n;
        fVar = new q.f((q.f) jVar42.f100f);
        fVar2 = new q.f((q.f) jVar.f100f);
        i4 = 0;
        while (true) {
            iArr = oVar.f1946p;
            if (i4 < iArr.length) {
            }
            i4++;
            jVar = jVar2;
            z5 = z3;
            i = 0;
        }
        boolean z62 = z5;
        while (i5 < fVar.f3036h) {
        }
        while (i6 < fVar2.f3036h) {
        }
        q.f q32 = o.q();
        int i152 = q32.f3036h;
        WindowId windowId2 = viewGroup.getWindowId();
        i7 = i152 - 1;
        while (i7 >= 0) {
        }
        oVar.l(viewGroup, oVar.f1943m, oVar.f1944n, oVar.f1947q, oVar.f1948r);
        oVar.A();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1960g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        s.f1963c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) s.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o) obj).z(viewGroup);
            }
        }
        this.f1959f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
