package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aph implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final ape a;
    final ViewGroup b;

    public aph(ape apeVar, ViewGroup viewGroup) {
        this.a = apeVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01d8 A[EDGE_INSN: B:121:0x01d8->B:122:0x01d8 BREAK  A[LOOP:1: B:17:0x0080->B:28:0x01d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x028b A[EDGE_INSN: B:186:0x028b->B:187:0x028b BREAK  A[LOOP:8: B:143:0x0227->B:174:0x0227], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        ape apeVar;
        int i;
        qi qiVar;
        qi qiVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList2;
        int i6;
        car carVar;
        Object obj;
        int i7;
        apm apmVar;
        int i8;
        a();
        ArrayList arrayList3 = api.a;
        ViewGroup viewGroup = this.b;
        int i9 = 1;
        if (!arrayList3.remove(viewGroup)) {
            return true;
        }
        qi a = api.a();
        ArrayList arrayList4 = (ArrayList) a.get(viewGroup);
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            a.put(viewGroup, arrayList4);
        } else if (arrayList4.size() > 0) {
            arrayList = new ArrayList(arrayList4);
            apeVar = this.a;
            arrayList4.add(apeVar);
            apeVar.x(new apg(this, a));
            i = 0;
            apeVar.n(viewGroup, false);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((ape) arrayList.get(i10)).s(viewGroup);
                }
            }
            apeVar.i = new ArrayList();
            apeVar.j = new ArrayList();
            cfz cfzVar = apeVar.t;
            cfz cfzVar2 = apeVar.u;
            qiVar = new qi((qy) cfzVar.b);
            qiVar2 = new qi((qy) cfzVar2.b);
            i2 = 0;
            while (true) {
                int[] iArr = apeVar.h;
                if (i2 < 4) {
                    break;
                }
                int i11 = iArr[i2];
                if (i11 == i9) {
                    i7 = i2;
                    int i12 = qiVar.d;
                    while (true) {
                        i12--;
                        if (i12 >= 0) {
                            View view = (View) qiVar.c(i12);
                            if (view != null && apeVar.w(view) && (apmVar = (apm) qiVar2.remove(view)) != null && apeVar.w(apmVar.b)) {
                                apeVar.i.add((apm) qiVar.d(i12));
                                apeVar.j.add(apmVar);
                            }
                        }
                    }
                } else if (i11 == 2) {
                    i7 = i2;
                    Object obj2 = cfzVar.a;
                    Object obj3 = cfzVar2.a;
                    qy qyVar = (qy) obj2;
                    int i13 = qyVar.d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        View view2 = (View) qyVar.f(i14);
                        if (view2 != null && apeVar.w(view2)) {
                            View view3 = (View) ((qy) obj3).get((String) qyVar.c(i14));
                            if (view3 != null && apeVar.w(view3)) {
                                apm apmVar2 = (apm) qiVar.get(view2);
                                apm apmVar3 = (apm) qiVar2.get(view3);
                                if (apmVar2 != null && apmVar3 != null) {
                                    apeVar.i.add(apmVar2);
                                    apeVar.j.add(apmVar3);
                                    qiVar.remove(view2);
                                    qiVar2.remove(view3);
                                }
                            }
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        Object obj4 = cfzVar.d;
                        Object obj5 = cfzVar2.d;
                        qq qqVar = (qq) obj4;
                        int b = qqVar.b();
                        int i15 = i;
                        while (i15 < b) {
                            View view4 = (View) qqVar.e(i15);
                            if (view4 == null || !apeVar.w(view4)) {
                                i8 = i2;
                            } else {
                                i8 = i2;
                                View view5 = (View) ((qq) obj5).d(qqVar.c(i15));
                                if (view5 != null && apeVar.w(view5)) {
                                    apm apmVar4 = (apm) qiVar.get(view4);
                                    apm apmVar5 = (apm) qiVar2.get(view5);
                                    if (apmVar4 != null && apmVar5 != null) {
                                        apeVar.i.add(apmVar4);
                                        apeVar.j.add(apmVar5);
                                        qiVar.remove(view4);
                                        qiVar2.remove(view5);
                                    }
                                }
                            }
                            i15++;
                            i2 = i8;
                        }
                    }
                    i7 = i2;
                } else {
                    i7 = i2;
                    Object obj6 = cfzVar.c;
                    Object obj7 = cfzVar2.c;
                    SparseArray sparseArray = (SparseArray) obj6;
                    int size2 = sparseArray.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        View view6 = (View) sparseArray.valueAt(i16);
                        if (view6 != null && apeVar.w(view6)) {
                            View view7 = (View) ((SparseArray) obj7).get(sparseArray.keyAt(i16));
                            if (view7 != null && apeVar.w(view7)) {
                                apm apmVar6 = (apm) qiVar.get(view6);
                                apm apmVar7 = (apm) qiVar2.get(view7);
                                if (apmVar6 != null && apmVar7 != null) {
                                    apeVar.i.add(apmVar6);
                                    apeVar.j.add(apmVar7);
                                    qiVar.remove(view6);
                                    qiVar2.remove(view7);
                                }
                            }
                        }
                    }
                }
                i2 = i7 + 1;
                i = 0;
                i9 = 1;
            }
            for (i3 = 0; i3 < qiVar.d; i3++) {
                apm apmVar8 = (apm) qiVar.f(i3);
                if (apeVar.w(apmVar8.b)) {
                    apeVar.i.add(apmVar8);
                    apeVar.j.add(null);
                }
            }
            for (i4 = 0; i4 < qiVar2.d; i4++) {
                apm apmVar9 = (apm) qiVar2.f(i4);
                if (apeVar.w(apmVar9.b)) {
                    apeVar.j.add(apmVar9);
                    apeVar.i.add(null);
                }
            }
            qi g = ape.g();
            i5 = g.d;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            while (true) {
                i5--;
                if (i5 >= 0) {
                    break;
                }
                Animator animator = (Animator) g.c(i5);
                if (animator != null && (carVar = (car) g.get(animator)) != null && (obj = carVar.f) != null && Objects.equals(windowId, carVar.e)) {
                    Object obj8 = carVar.d;
                    View view8 = (View) obj;
                    apm k = apeVar.k(view8, true);
                    apm j = apeVar.j(view8, true);
                    if (k == null && j == null) {
                        j = (apm) ((qy) apeVar.u.b).get(obj);
                    }
                    if (k != null || j != null) {
                        if (((ape) carVar.c).v((apm) obj8, j)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                g.d(i5);
                            }
                        }
                    }
                }
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                ape apeVar2 = (ape) arrayList2.get(i6);
                apeVar2.q(apeVar2, apd.c, false);
                if (!apeVar2.n) {
                    apeVar2.n = true;
                    apeVar2.q(apeVar2, apd.b, false);
                }
            }
            apeVar.F(viewGroup, apeVar.t, apeVar.u, apeVar.i, apeVar.j);
            apeVar.t();
            return true;
        }
        arrayList = null;
        apeVar = this.a;
        arrayList4.add(apeVar);
        apeVar.x(new apg(this, a));
        i = 0;
        apeVar.n(viewGroup, false);
        if (arrayList != null) {
        }
        apeVar.i = new ArrayList();
        apeVar.j = new ArrayList();
        cfz cfzVar3 = apeVar.t;
        cfz cfzVar22 = apeVar.u;
        qiVar = new qi((qy) cfzVar3.b);
        qiVar2 = new qi((qy) cfzVar22.b);
        i2 = 0;
        while (true) {
            int[] iArr2 = apeVar.h;
            if (i2 < 4) {
            }
            i2 = i7 + 1;
            i = 0;
            i9 = 1;
        }
        while (i3 < qiVar.d) {
        }
        while (i4 < qiVar2.d) {
        }
        qi g2 = ape.g();
        i5 = g2.d;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        while (true) {
            i5--;
            if (i5 >= 0) {
            }
        }
        while (i6 < arrayList2.size()) {
        }
        apeVar.F(viewGroup, apeVar.t, apeVar.u, apeVar.i, apeVar.j);
        apeVar.t();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = api.a;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) api.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((ape) arrayList2.get(i)).s(viewGroup);
            }
        }
        this.a.o(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
