package p0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public m f3698a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f3699b;

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
        m mVar;
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
        u uVar;
        View view2;
        FrameLayout frameLayout = this.f3699b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = q.f3702c;
        FrameLayout frameLayout2 = this.f3699b;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        o.b b2 = q.b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) b2.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b2.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            mVar = this.f3698a;
            arrayList3.add(mVar);
            mVar.a(new o(this, b2));
            i = 0;
            mVar.h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).y(frameLayout2);
                }
            }
            mVar.f3684k = new ArrayList();
            mVar.f3685l = new ArrayList();
            T0.m mVar2 = mVar.f3682g;
            T0.m mVar3 = mVar.h;
            bVar = new o.b((o.b) mVar2.f1073a);
            bVar2 = new o.b((o.b) mVar3.f1073a);
            i2 = 0;
            while (true) {
                iArr = mVar.f3683j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    for (int i8 = bVar.f3591c - 1; i8 >= 0; i8--) {
                        View view3 = (View) bVar.h(i8);
                        if (view3 != null && mVar.t(view3) && (uVar = (u) bVar2.remove(view3)) != null && mVar.t(uVar.f3707b)) {
                            mVar.f3684k.add((u) bVar.i(i8));
                            mVar.f3685l.add(uVar);
                        }
                    }
                } else if (i7 == 2) {
                    o.b bVar3 = (o.b) mVar2.d;
                    int i9 = bVar3.f3591c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) bVar3.j(i10);
                        if (view4 != null && mVar.t(view4)) {
                            View view5 = (View) ((o.b) mVar3.d).getOrDefault(bVar3.h(i10), null);
                            if (view5 != null && mVar.t(view5)) {
                                u uVar2 = (u) bVar.getOrDefault(view4, null);
                                u uVar3 = (u) bVar2.getOrDefault(view5, null);
                                if (uVar2 != null && uVar3 != null) {
                                    mVar.f3684k.add(uVar2);
                                    mVar.f3685l.add(uVar3);
                                    bVar.remove(view4);
                                    bVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 == 3) {
                    SparseArray sparseArray = (SparseArray) mVar2.f1074b;
                    SparseArray sparseArray2 = (SparseArray) mVar3.f1074b;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        View view6 = (View) sparseArray.valueAt(i11);
                        if (view6 != null && mVar.t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && mVar.t(view2)) {
                            u uVar4 = (u) bVar.getOrDefault(view6, null);
                            u uVar5 = (u) bVar2.getOrDefault(view2, null);
                            if (uVar4 != null && uVar5 != null) {
                                mVar.f3684k.add(uVar4);
                                mVar.f3685l.add(uVar5);
                                bVar.remove(view6);
                                bVar2.remove(view2);
                            }
                        }
                    }
                } else if (i7 == 4) {
                    o.e eVar = (o.e) mVar2.f1075c;
                    int e2 = eVar.e();
                    int i12 = i;
                    while (i12 < e2) {
                        View view7 = (View) eVar.f(i12);
                        if (view7 != null && mVar.t(view7)) {
                            if (eVar.f3569a) {
                                eVar.b();
                            }
                            View view8 = (View) ((o.e) mVar3.f1075c).c(eVar.f3570b[i12], l2);
                            mVar = mVar;
                            if (view8 != null && mVar.t(view8)) {
                                u uVar6 = (u) bVar.getOrDefault(view7, l2);
                                u uVar7 = (u) bVar2.getOrDefault(view8, l2);
                                if (uVar6 != null && uVar7 != null) {
                                    mVar.f3684k.add(uVar6);
                                    mVar.f3685l.add(uVar7);
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
            for (i3 = 0; i3 < bVar.f3591c; i3++) {
                u uVar8 = (u) bVar.j(i3);
                if (mVar.t(uVar8.f3707b)) {
                    mVar.f3684k.add(uVar8);
                    mVar.f3685l.add(null);
                }
            }
            for (i4 = 0; i4 < bVar2.f3591c; i4++) {
                u uVar9 = (u) bVar2.j(i4);
                if (mVar.t(uVar9.f3707b)) {
                    mVar.f3685l.add(uVar9);
                    mVar.f3684k.add(null);
                }
            }
            o.b p2 = m.p();
            int i13 = p2.f3591c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) p2.h(i5);
                if (animator != null && (jVar = (j) p2.getOrDefault(animator, null)) != null && (view = jVar.f3664a) != null && windowId.equals(jVar.d)) {
                    u r2 = mVar.r(view, true);
                    u n2 = mVar.n(view, true);
                    if (r2 == null && n2 == null) {
                        n2 = (u) ((o.b) mVar.h.f1073a).getOrDefault(view, null);
                    }
                    if (r2 != null || n2 != null) {
                        u uVar10 = jVar.f3666c;
                        m mVar4 = jVar.f3667e;
                        if (mVar4.s(uVar10, n2)) {
                            mVar4.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                p2.remove(animator);
                            }
                        }
                    }
                }
            }
            mVar.l(frameLayout2, mVar.f3682g, mVar.h, mVar.f3684k, mVar.f3685l);
            mVar.z();
            return true;
        }
        arrayList = null;
        mVar = this.f3698a;
        arrayList3.add(mVar);
        mVar.a(new o(this, b2));
        i = 0;
        mVar.h(frameLayout2, false);
        if (arrayList != null) {
        }
        mVar.f3684k = new ArrayList();
        mVar.f3685l = new ArrayList();
        T0.m mVar22 = mVar.f3682g;
        T0.m mVar32 = mVar.h;
        bVar = new o.b((o.b) mVar22.f1073a);
        bVar2 = new o.b((o.b) mVar32.f1073a);
        i2 = 0;
        while (true) {
            iArr = mVar.f3683j;
            if (i2 < iArr.length) {
            }
            i2++;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        while (i3 < bVar.f3591c) {
        }
        while (i4 < bVar2.f3591c) {
        }
        o.b p22 = m.p();
        int i132 = p22.f3591c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        mVar.l(frameLayout2, mVar.f3682g, mVar.h, mVar.f3684k, mVar.f3685l);
        mVar.z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f3699b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f3702c;
        FrameLayout frameLayout2 = this.f3699b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) q.b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).y(frameLayout2);
            }
        }
        this.f3698a.i(true);
    }
}
