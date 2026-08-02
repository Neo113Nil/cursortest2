package androidx.fragment.app;

import E.ViewTreeObserverOnPreDrawListenerC0017s;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.C0241b;
import c3.C0292d;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209m extends A0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4911c;

    /* renamed from: d, reason: collision with root package name */
    public final B0 f4912d;

    /* renamed from: e, reason: collision with root package name */
    public final B0 f4913e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f4914f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4915g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4916h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4917i;

    /* renamed from: j, reason: collision with root package name */
    public final p.e f4918j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4919k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4920l;

    /* renamed from: m, reason: collision with root package name */
    public final p.e f4921m;
    public final p.e n;
    public final boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final A.b f4922p = new A.b();

    public C0209m(ArrayList arrayList, B0 b02, B0 b03, w0 w0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, p.e eVar, ArrayList arrayList4, ArrayList arrayList5, p.e eVar2, p.e eVar3, boolean z) {
        this.f4911c = arrayList;
        this.f4912d = b02;
        this.f4913e = b03;
        this.f4914f = w0Var;
        this.f4915g = obj;
        this.f4916h = arrayList2;
        this.f4917i = arrayList3;
        this.f4918j = eVar;
        this.f4919k = arrayList4;
        this.f4920l = arrayList5;
        this.f4921m = eVar2;
        this.n = eVar3;
        this.o = z;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i4 = E.J.f378a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.A0
    public final boolean a() {
        this.f4914f.i();
        return false;
    }

    @Override // androidx.fragment.app.A0
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        A.b bVar = this.f4922p;
        synchronized (bVar) {
            try {
                if (bVar.f0a) {
                    return;
                }
                bVar.f0a = true;
                bVar.f2c = true;
                e0.t tVar = bVar.f1b;
                if (tVar != null) {
                    try {
                        ((p1.q) tVar.f8416a).d();
                    } catch (Throwable th) {
                        synchronized (bVar) {
                            bVar.f2c = false;
                            bVar.notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (bVar) {
                    bVar.f2c = false;
                    bVar.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022f  */
    /* JADX WARN: Type inference failed for: r14v5, types: [p.j] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // androidx.fragment.app.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ViewGroup container) {
        p.e eVar;
        Object obj;
        B0 b02;
        B0 b03;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        w0 w0Var;
        w0 w0Var2;
        Object obj2;
        G3.d dVar;
        ArrayList arrayList3;
        ?? r14;
        int i4;
        int i5;
        w0 w0Var3;
        Object obj3;
        ArrayList arrayList4;
        View view;
        int i6;
        boolean z4;
        kotlin.jvm.internal.i.e(container, "container");
        boolean isLaidOut = container.isLaidOut();
        ArrayList arrayList5 = this.f4911c;
        if (!isLaidOut) {
            int size = arrayList5.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj4 = arrayList5.get(i7);
                i7++;
                C0210n c0210n = (C0210n) obj4;
                B0 b04 = c0210n.f4893a;
                if (f0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + b04);
                }
                c0210n.f4893a.c(this);
            }
            return;
        }
        View view2 = new View(container.getContext());
        Rect rect = new Rect();
        int size2 = arrayList5.size();
        View view3 = null;
        boolean z5 = false;
        int i8 = 0;
        while (true) {
            eVar = this.f4918j;
            obj = this.f4915g;
            b02 = this.f4913e;
            b03 = this.f4912d;
            arrayList = this.f4917i;
            arrayList2 = this.f4916h;
            z = z5;
            w0Var = this.f4914f;
            if (i8 >= size2) {
                break;
            }
            Object obj5 = arrayList5.get(i8);
            int i9 = i8 + 1;
            int i10 = size2;
            if (((C0210n) obj5).f4930d == null || b03 == null || b02 == null || eVar.isEmpty() || obj == null) {
                i6 = i9;
                z5 = z;
            } else {
                F inFragment = b02.f4725c;
                F outFragment = b03.f4725c;
                u0 u0Var = p0.f4951a;
                i6 = i9;
                kotlin.jvm.internal.i.e(inFragment, "inFragment");
                kotlin.jvm.internal.i.e(outFragment, "outFragment");
                if (this.o) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                ViewTreeObserverOnPreDrawListenerC0017s.a(container, new Q1.a(b02, b03, this, 4));
                p.e eVar2 = this.f4921m;
                arrayList2.addAll(eVar2.values());
                ArrayList arrayList6 = this.f4920l;
                if (!arrayList6.isEmpty()) {
                    Object obj6 = arrayList6.get(0);
                    kotlin.jvm.internal.i.d(obj6, "exitingNames[0]");
                    View view4 = (View) eVar2.get((String) obj6);
                    w0Var.o(obj, view4);
                    view3 = view4;
                }
                p.e eVar3 = this.n;
                arrayList.addAll(eVar3.values());
                ArrayList arrayList7 = this.f4919k;
                if (!arrayList7.isEmpty()) {
                    Object obj7 = arrayList7.get(0);
                    kotlin.jvm.internal.i.d(obj7, "enteringNames[0]");
                    View view5 = (View) eVar3.get((String) obj7);
                    if (view5 != null) {
                        ViewTreeObserverOnPreDrawListenerC0017s.a(container, new RunnableC0208l(w0Var, view5, rect));
                        z4 = true;
                        w0Var.q(obj, view2, arrayList2);
                        Object obj8 = this.f4915g;
                        w0Var.m(obj8, null, null, obj8, arrayList);
                        z5 = z4;
                    }
                }
                z4 = z;
                w0Var.q(obj, view2, arrayList2);
                Object obj82 = this.f4915g;
                w0Var.m(obj82, null, null, obj82, arrayList);
                z5 = z4;
            }
            size2 = i10;
            i8 = i6;
        }
        w0 w0Var4 = w0Var;
        ArrayList arrayList8 = new ArrayList();
        int size3 = arrayList5.size();
        p.e eVar4 = eVar;
        Object obj9 = null;
        Object obj10 = null;
        int i11 = 0;
        while (i11 < size3) {
            Object obj11 = arrayList5.get(i11);
            int i12 = i11 + 1;
            int i13 = size3;
            C0210n c0210n2 = (C0210n) obj11;
            B0 b05 = c0210n2.f4893a;
            ArrayList arrayList9 = arrayList5;
            Object f4 = w0Var4.f(c0210n2.f4928b);
            if (f4 != null) {
                Object obj12 = obj;
                ArrayList arrayList10 = new ArrayList();
                Object obj13 = obj10;
                F f5 = b05.f4725c;
                Object obj14 = obj9;
                View view6 = f5.mView;
                kotlin.jvm.internal.i.d(view6, "operation.fragment.mView");
                f(view6, arrayList10);
                if (obj12 != null && (b05 == b03 || b05 == b02)) {
                    if (b05 == b03) {
                        arrayList10.removeAll(d3.i.p0(arrayList2));
                    } else {
                        arrayList10.removeAll(d3.i.p0(arrayList));
                    }
                }
                if (arrayList10.isEmpty()) {
                    w0Var4.a(f4, view2);
                    w0Var3 = w0Var4;
                    obj3 = f4;
                    arrayList4 = arrayList10;
                } else {
                    w0Var4.b(f4, arrayList10);
                    w0 w0Var5 = w0Var4;
                    w0Var5.m(f4, f4, arrayList10, null, null);
                    w0Var3 = w0Var5;
                    obj3 = f4;
                    arrayList4 = arrayList10;
                    if (b05.f4723a == 3) {
                        b05.f4731i = false;
                        ArrayList arrayList11 = new ArrayList(arrayList4);
                        arrayList11.remove(f5.mView);
                        w0Var3.l(obj3, f5.mView, arrayList11);
                        ViewTreeObserverOnPreDrawListenerC0017s.a(container, new RunnableC0216u(1, arrayList4));
                        if (b05.f4723a != 2) {
                            arrayList8.addAll(arrayList4);
                            if (z) {
                                w0Var3.n(obj3, rect);
                            }
                            if (f0.J(2)) {
                                Log.v("FragmentManager", "Entering Transition: " + obj3);
                                Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                                int size4 = arrayList4.size();
                                int i14 = 0;
                                while (i14 < size4) {
                                    Object transitioningViews = arrayList4.get(i14);
                                    i14++;
                                    kotlin.jvm.internal.i.d(transitioningViews, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                                    view2 = view2;
                                }
                            }
                            view = view2;
                        } else {
                            view = view2;
                            w0Var3.o(obj3, view3);
                            if (f0.J(2)) {
                                Log.v("FragmentManager", "Exiting Transition: " + obj3);
                                Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                                int size5 = arrayList4.size();
                                int i15 = 0;
                                while (i15 < size5) {
                                    Object transitioningViews2 = arrayList4.get(i15);
                                    i15++;
                                    kotlin.jvm.internal.i.d(transitioningViews2, "transitioningViews");
                                    Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                                }
                            }
                        }
                        if (c0210n2.f4929c) {
                            obj10 = w0Var3.k(obj13, obj3);
                            obj9 = obj14;
                            w0Var4 = w0Var3;
                            i11 = i12;
                            view2 = view;
                            size3 = i13;
                            arrayList5 = arrayList9;
                            obj = obj12;
                        } else {
                            obj9 = w0Var3.k(obj14, obj3);
                            w0Var4 = w0Var3;
                            i11 = i12;
                            view2 = view;
                            size3 = i13;
                            arrayList5 = arrayList9;
                            obj = obj12;
                            obj10 = obj13;
                        }
                    }
                }
                if (b05.f4723a != 2) {
                }
                if (c0210n2.f4929c) {
                }
            } else {
                i11 = i12;
                view2 = view2;
                size3 = i13;
                arrayList5 = arrayList9;
            }
        }
        ArrayList arrayList12 = arrayList5;
        Object obj15 = obj;
        Object j4 = w0Var4.j(obj9, obj10, obj15);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Final merged transition: " + j4);
        }
        C0292d c0292d = new C0292d(arrayList8, j4);
        ArrayList arrayList13 = (ArrayList) c0292d.f5724a;
        ArrayList arrayList14 = new ArrayList(d3.k.Y(arrayList12));
        int size6 = arrayList12.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj16 = arrayList12.get(i16);
            i16++;
            arrayList14.add(((C0210n) obj16).f4893a);
        }
        int size7 = arrayList14.size();
        int i17 = 0;
        while (true) {
            w0Var2 = this.f4914f;
            obj2 = c0292d.f5725b;
            if (i17 >= size7) {
                break;
            }
            Object obj17 = arrayList14.get(i17);
            i17++;
            B0 b06 = (B0) obj17;
            F f6 = b06.f4725c;
            w0Var2.p(obj2, this.f4922p, new RunnableC0208l(b06, this));
        }
        G3.d dVar2 = new G3.d(this, container, obj2, 2);
        p0.a(4, arrayList13);
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = this.f4917i;
        int size8 = arrayList16.size();
        for (int i18 = 0; i18 < size8; i18++) {
            View view7 = (View) arrayList16.get(i18);
            Field field = E.H.f375a;
            arrayList15.add(E.A.c(view7));
            E.A.f(view7, null);
        }
        boolean J4 = f0.J(2);
        ArrayList arrayList17 = this.f4916h;
        if (J4) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            int size9 = arrayList17.size();
            int i19 = 0;
            while (i19 < size9) {
                G3.d dVar3 = dVar2;
                Object sharedElementFirstOutViews = arrayList17.get(i19);
                i19++;
                int i20 = size9;
                kotlin.jvm.internal.i.d(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view8 = (View) sharedElementFirstOutViews;
                StringBuilder sb = new StringBuilder("View: ");
                sb.append(view8);
                sb.append(" Name: ");
                Field field2 = E.H.f375a;
                sb.append(E.A.c(view8));
                Log.v("FragmentManager", sb.toString());
                dVar2 = dVar3;
                size9 = i20;
            }
            dVar = dVar2;
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            int size10 = arrayList16.size();
            int i21 = 0;
            while (i21 < size10) {
                Object sharedElementLastInViews = arrayList16.get(i21);
                i21++;
                int i22 = size10;
                kotlin.jvm.internal.i.d(sharedElementLastInViews, "sharedElementLastInViews");
                View view9 = (View) sharedElementLastInViews;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view9);
                sb2.append(" Name: ");
                Field field3 = E.H.f375a;
                sb2.append(E.A.c(view9));
                Log.v("FragmentManager", sb2.toString());
                size10 = i22;
            }
        } else {
            dVar = dVar2;
        }
        dVar.invoke();
        int size11 = arrayList16.size();
        ArrayList arrayList18 = new ArrayList();
        int i23 = 0;
        while (i23 < size11) {
            View view10 = (View) arrayList17.get(i23);
            Field field4 = E.H.f375a;
            String c4 = E.A.c(view10);
            arrayList18.add(c4);
            if (c4 == null) {
                i5 = size11;
                arrayList3 = arrayList18;
                i4 = i23;
                r14 = eVar4;
            } else {
                arrayList3 = arrayList18;
                E.A.f(view10, null);
                r14 = eVar4;
                String str = (String) r14.get(c4);
                i4 = i23;
                int i24 = 0;
                while (true) {
                    i5 = size11;
                    if (i24 >= size11) {
                        break;
                    }
                    if (str.equals(arrayList15.get(i24))) {
                        E.A.f((View) arrayList16.get(i24), c4);
                        break;
                    } else {
                        i24++;
                        size11 = i5;
                    }
                }
            }
            i23 = i4 + 1;
            eVar4 = r14;
            size11 = i5;
            arrayList18 = arrayList3;
        }
        ViewTreeObserverOnPreDrawListenerC0017s.a(container, new v0(size11, arrayList16, arrayList15, arrayList17, arrayList18));
        p0.a(0, arrayList13);
        w0Var2.r(obj15, arrayList17, arrayList16);
        if (f0.J(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + b03 + " to " + b02);
        }
    }

    @Override // androidx.fragment.app.A0
    public final void d(C0241b c0241b, ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
    }

    @Override // androidx.fragment.app.A0
    public final void e(ViewGroup container) {
        boolean z;
        Object obj;
        kotlin.jvm.internal.i.e(container, "container");
        if (!container.isLaidOut()) {
            ArrayList arrayList = this.f4911c;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                B0 b02 = ((C0210n) obj2).f4893a;
                if (f0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + b02);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f4911c;
        if (!arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            z = false;
            int i5 = 0;
            while (i5 < size2) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                if (!((C0210n) obj3).f4893a.f4725c.mTransitioning) {
                    break;
                }
            }
        }
        z = true;
        if (z && (obj = this.f4915g) != null) {
            a();
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.f4912d + " and " + this.f4913e + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        a();
    }
}
