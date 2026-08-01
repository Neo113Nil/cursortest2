package k1;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public n f2368f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f2369g;

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
        a0.k kVar;
        q.f fVar;
        q.f fVar2;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        k kVar2;
        a0.k kVar3;
        boolean z4;
        v vVar;
        View view;
        View view2;
        a0.k kVar4;
        boolean z5;
        n nVar = this.f2368f;
        ViewGroup viewGroup = this.f2369g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z6 = true;
        if (!r.f2372c.remove(viewGroup)) {
            return true;
        }
        q.f b2 = r.b();
        ArrayList arrayList2 = (ArrayList) b2.get(viewGroup);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            b2.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(nVar);
            nVar.a(new p(this, b2));
            i = 0;
            nVar.h(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    ((n) obj).y(viewGroup);
                }
            }
            nVar.f2355p = new ArrayList();
            nVar.f2356q = new ArrayList();
            a0.k kVar5 = nVar.f2351l;
            kVar = nVar.f2352m;
            fVar = new q.f((q.f) kVar5.f97f);
            fVar2 = new q.f((q.f) kVar.f97f);
            i4 = 0;
            while (true) {
                iArr = nVar.f2354o;
                if (i4 < iArr.length) {
                    break;
                }
                int i9 = iArr[i4];
                if (i9 == z6) {
                    kVar3 = kVar;
                    z4 = z6;
                    for (int i10 = fVar.h - 1; i10 >= 0; i10--) {
                        View view3 = (View) fVar.f(i10);
                        if (view3 != null && nVar.t(view3) && (vVar = (v) fVar2.remove(view3)) != null && nVar.t(vVar.f2377b)) {
                            nVar.f2355p.add((v) fVar.g(i10));
                            nVar.f2356q.add(vVar);
                        }
                    }
                } else if (i9 == 2) {
                    kVar3 = kVar;
                    z4 = z6;
                    q.f fVar3 = (q.f) kVar5.i;
                    q.f fVar4 = (q.f) kVar3.i;
                    int i11 = fVar3.h;
                    for (int i12 = 0; i12 < i11; i12++) {
                        View view4 = (View) fVar3.i(i12);
                        if (view4 != null && nVar.t(view4) && (view = (View) fVar4.get(fVar3.f(i12))) != null && nVar.t(view)) {
                            v vVar2 = (v) fVar.get(view4);
                            v vVar3 = (v) fVar2.get(view);
                            if (vVar2 != null && vVar3 != null) {
                                nVar.f2355p.add(vVar2);
                                nVar.f2356q.add(vVar3);
                                fVar.remove(view4);
                                fVar2.remove(view);
                            }
                        }
                    }
                } else if (i9 == 3) {
                    z4 = z6;
                    SparseArray sparseArray = (SparseArray) kVar5.f98g;
                    kVar3 = kVar;
                    SparseArray sparseArray2 = (SparseArray) kVar3.f98g;
                    int size2 = sparseArray.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        View view5 = (View) sparseArray.valueAt(i13);
                        if (view5 != null && nVar.t(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && nVar.t(view2)) {
                            v vVar4 = (v) fVar.get(view5);
                            v vVar5 = (v) fVar2.get(view2);
                            if (vVar4 != null && vVar5 != null) {
                                nVar.f2355p.add(vVar4);
                                nVar.f2356q.add(vVar5);
                                fVar.remove(view5);
                                fVar2.remove(view2);
                            }
                        }
                    }
                } else if (i9 != 4) {
                    kVar3 = kVar;
                    z4 = z6;
                } else {
                    q.h hVar = (q.h) kVar5.h;
                    q.h hVar2 = (q.h) kVar.h;
                    int e4 = hVar.e();
                    int i14 = i;
                    while (i14 < e4) {
                        View view6 = (View) hVar.f(i14);
                        if (view6 == null || !nVar.t(view6)) {
                            kVar4 = kVar;
                        } else {
                            kVar4 = kVar;
                            View view7 = (View) hVar2.b(hVar.c(i14));
                            if (view7 != null && nVar.t(view7)) {
                                v vVar6 = (v) fVar.get(view6);
                                v vVar7 = (v) fVar2.get(view7);
                                if (vVar6 != null && vVar7 != null) {
                                    z5 = z6;
                                    nVar.f2355p.add(vVar6);
                                    nVar.f2356q.add(vVar7);
                                    fVar.remove(view6);
                                    fVar2.remove(view7);
                                    i14++;
                                    kVar = kVar4;
                                    z6 = z5;
                                }
                            }
                        }
                        z5 = z6;
                        i14++;
                        kVar = kVar4;
                        z6 = z5;
                    }
                    z4 = z6;
                    kVar3 = kVar;
                }
                i4++;
                kVar = kVar3;
                z6 = z4;
                i = 0;
            }
            boolean z7 = z6;
            for (i5 = 0; i5 < fVar.h; i5++) {
                v vVar8 = (v) fVar.i(i5);
                if (nVar.t(vVar8.f2377b)) {
                    nVar.f2355p.add(vVar8);
                    nVar.f2356q.add(null);
                }
            }
            for (i6 = 0; i6 < fVar2.h; i6++) {
                v vVar9 = (v) fVar2.i(i6);
                if (nVar.t(vVar9.f2377b)) {
                    nVar.f2356q.add(vVar9);
                    nVar.f2355p.add(null);
                }
            }
            q.f p4 = n.p();
            int i15 = p4.h;
            WindowId windowId = viewGroup.getWindowId();
            i7 = i15 - 1;
            while (i7 >= 0) {
                Animator animator = (Animator) p4.f(i7);
                if (animator != null && (kVar2 = (k) p4.get(animator)) != null) {
                    n nVar2 = kVar2.f2341e;
                    View view8 = kVar2.f2338a;
                    if (view8 != null && windowId.equals(kVar2.d)) {
                        v vVar10 = kVar2.f2340c;
                        boolean z8 = z7;
                        v r4 = nVar.r(view8, z8);
                        v n4 = nVar.n(view8, z8);
                        if (r4 == null && n4 == null) {
                            n4 = (v) ((q.f) nVar.f2352m.f97f).get(view8);
                        }
                        if ((r4 != null || n4 != null) && nVar2.s(vVar10, n4)) {
                            nVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p4.remove(animator);
                            }
                        }
                    }
                }
                i7--;
                z7 = true;
            }
            nVar.l(viewGroup, nVar.f2351l, nVar.f2352m, nVar.f2355p, nVar.f2356q);
            nVar.z();
            return true;
        }
        arrayList = null;
        arrayList2.add(nVar);
        nVar.a(new p(this, b2));
        i = 0;
        nVar.h(viewGroup, false);
        if (arrayList != null) {
        }
        nVar.f2355p = new ArrayList();
        nVar.f2356q = new ArrayList();
        a0.k kVar52 = nVar.f2351l;
        kVar = nVar.f2352m;
        fVar = new q.f((q.f) kVar52.f97f);
        fVar2 = new q.f((q.f) kVar.f97f);
        i4 = 0;
        while (true) {
            iArr = nVar.f2354o;
            if (i4 < iArr.length) {
            }
            i4++;
            kVar = kVar3;
            z6 = z4;
            i = 0;
        }
        boolean z72 = z6;
        while (i5 < fVar.h) {
        }
        while (i6 < fVar2.h) {
        }
        q.f p42 = n.p();
        int i152 = p42.h;
        WindowId windowId2 = viewGroup.getWindowId();
        i7 = i152 - 1;
        while (i7 >= 0) {
        }
        nVar.l(viewGroup, nVar.f2351l, nVar.f2352m, nVar.f2355p, nVar.f2356q);
        nVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f2369g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        r.f2372c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) r.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((n) obj).y(viewGroup);
            }
        }
        this.f2368f.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
