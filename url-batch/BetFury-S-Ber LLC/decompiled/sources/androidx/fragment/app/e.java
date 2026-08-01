package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.trembin.nirefon.betfury.R;
import defpackage.bi;
import defpackage.fq;
import defpackage.fx;
import defpackage.gx;
import defpackage.hm0;
import defpackage.i5;
import defpackage.kq;
import defpackage.nq;
import defpackage.nx;
import defpackage.oq;
import defpackage.pq;
import defpackage.qe0;
import defpackage.qq;
import defpackage.r7;
import defpackage.rb0;
import defpackage.re0;
import defpackage.rq;
import defpackage.s9;
import defpackage.se0;
import defpackage.sq;
import defpackage.ta;
import defpackage.tp;
import defpackage.tq;
import defpackage.u70;
import defpackage.vp;
import defpackage.vq;
import defpackage.xp;
import defpackage.zi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class e {
    public final i5 a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(i5 i5Var, f fVar, ClassLoader classLoader, fq fqVar, pq pqVar) {
        this.a = i5Var;
        this.b = fVar;
        a a = fqVar.a(pqVar.f);
        Bundle bundle = pqVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.H(bundle);
        a.j = pqVar.g;
        a.r = pqVar.h;
        a.t = true;
        a.A = pqVar.i;
        a.B = pqVar.j;
        a.C = pqVar.k;
        a.F = pqVar.l;
        a.q = pqVar.m;
        a.E = pqVar.n;
        a.D = pqVar.p;
        a.Q = gx.values()[pqVar.q];
        Bundle bundle2 = pqVar.r;
        if (bundle2 != null) {
            a.g = bundle2;
        } else {
            a.g = new Bundle();
        }
        this.c = a;
        if (c.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + aVar);
        }
        Bundle bundle = aVar.g;
        aVar.y.M();
        aVar.f = 3;
        aVar.H = false;
        aVar.p();
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (c.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + aVar);
        }
        View view = aVar.J;
        if (view != null) {
            Bundle bundle2 = aVar.g;
            SparseArray<Parcelable> sparseArray = aVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                aVar.h = null;
            }
            if (aVar.J != null) {
                aVar.S.i.L(aVar.i);
                aVar.i = null;
            }
            aVar.H = false;
            aVar.B(bundle2);
            if (!aVar.H) {
                s9.f(aVar, " did not call through to super.onViewStateRestored()");
                return;
            } else if (aVar.J != null) {
                aVar.S.b(fx.ON_CREATE);
            }
        }
        aVar.g = null;
        kq kqVar = aVar.y;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(4);
        this.a.h(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = this.b.a;
        a aVar = this.c;
        ViewGroup viewGroup = aVar.I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(aVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar2 = (a) arrayList.get(indexOf);
                        if (aVar2.I == viewGroup && (view = aVar2.J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar3 = (a) arrayList.get(i2);
                    if (aVar3.I == viewGroup && (view2 = aVar3.J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        aVar.I.addView(aVar.J, i);
    }

    public final void c() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + aVar);
        }
        a aVar2 = aVar.l;
        e eVar = null;
        f fVar = this.b;
        if (aVar2 != null) {
            e eVar2 = (e) fVar.b.get(aVar2.j);
            if (eVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(aVar);
                a aVar3 = aVar.l;
                sb.append(" declared target fragment ");
                sb.append(aVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            aVar.m = aVar.l.j;
            aVar.l = null;
            eVar = eVar2;
        } else {
            String str = aVar.m;
            if (str != null && (eVar = (e) fVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(aVar);
                sb2.append(" declared target fragment ");
                s9.u(r7.d(sb2, aVar.m, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        c cVar = aVar.w;
        aVar.x = cVar.t;
        aVar.z = cVar.v;
        i5 i5Var = this.a;
        i5Var.n(false);
        ArrayList arrayList = aVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar4 = ((tp) obj).a;
            ((rb0) aVar4.U.g).a();
            bi.x(aVar4);
        }
        arrayList.clear();
        aVar.y.b(aVar.x, aVar.b(), aVar);
        aVar.f = 0;
        aVar.H = false;
        aVar.r(aVar.x.p);
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = aVar.w.m.iterator();
        while (it.hasNext()) {
            ((nq) it.next()).b();
        }
        kq kqVar = aVar.y;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(0);
        i5Var.i(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [re0] */
    /* JADX WARN: Type inference failed for: r14v15, types: [re0] */
    public final int d() {
        a aVar = this.c;
        if (aVar.w == null) {
            return aVar.f;
        }
        int i = this.e;
        int i2 = qq.a[aVar.Q.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        if (aVar.r) {
            boolean z = aVar.s;
            int i4 = this.e;
            if (z) {
                i = Math.max(i4, 2);
                View view = aVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i4 < 4 ? Math.min(i, aVar.f) : Math.min(i, 1);
            }
        }
        if (!aVar.p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = aVar.I;
        qe0 qe0Var = null;
        if (viewGroup != null) {
            zi f = zi.f(viewGroup, aVar.j().E());
            qe0 d = f.d(aVar);
            qe0 qe0Var2 = d != null ? d.b : null;
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                qe0 qe0Var3 = (qe0) obj;
                a aVar2 = qe0Var3.c;
                aVar2.getClass();
                if (aVar2 == aVar && !qe0Var3.f) {
                    qe0Var = qe0Var3;
                    break;
                }
            }
            qe0Var = (qe0Var == null || !(qe0Var2 == null || qe0Var2 == re0.NONE)) ? qe0Var2 : qe0Var.b;
        }
        if (qe0Var == re0.ADDING) {
            i = Math.min(i, 6);
        } else if (qe0Var == re0.REMOVING) {
            i = Math.max(i, 3);
        } else if (aVar.q) {
            i = aVar.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (aVar.K && aVar.f < 5) {
            i = Math.min(i, 4);
        }
        if (c.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + aVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        int i = 3;
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + aVar);
        }
        boolean z = aVar.O;
        Bundle bundle = aVar.g;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                aVar.y.S(parcelable);
                kq kqVar = aVar.y;
                kqVar.E = false;
                kqVar.F = false;
                kqVar.L.setIsStateSaved(false);
                kqVar.t(1);
            }
            aVar.f = 1;
            return;
        }
        i5 i5Var = this.a;
        i5Var.o(false);
        Bundle bundle2 = aVar.g;
        aVar.y.M();
        aVar.f = 1;
        aVar.H = false;
        aVar.R.a(new u70(i, aVar));
        aVar.U.L(bundle2);
        aVar.s(bundle2);
        aVar.O = true;
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onCreate()");
        } else {
            aVar.R.d(fx.ON_CREATE);
            i5Var.j(false);
        }
    }

    public final void f() {
        String str;
        a aVar = this.c;
        if (aVar.r) {
            return;
        }
        if (c.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
        }
        LayoutInflater w = aVar.w(aVar.g);
        ViewGroup viewGroup = aVar.I;
        if (viewGroup == null) {
            int i = aVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + aVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) aVar.w.u.M(i);
                if (viewGroup == null) {
                    if (!aVar.t) {
                        try {
                            str = aVar.E().getResources().getResourceName(aVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.B) + " (" + str + ") for fragment " + aVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    sq sqVar = tq.a;
                    tq.b(new oq(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    tq.a(aVar).getClass();
                    rq rqVar = rq.PENALTY_LOG;
                }
            }
        }
        aVar.I = viewGroup;
        aVar.C(w, viewGroup, aVar.g);
        View view = aVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            aVar.J.setTag(R.id.fragment_container_view_tag, aVar);
            if (viewGroup != null) {
                b();
            }
            if (aVar.D) {
                aVar.J.setVisibility(8);
            }
            View view2 = aVar.J;
            WeakHashMap weakHashMap = hm0.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = aVar.J;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new ta(2, view3));
            }
            aVar.A(aVar.J);
            aVar.y.t(2);
            this.a.t(false);
            int visibility = aVar.J.getVisibility();
            aVar.f().j = aVar.J.getAlpha();
            if (aVar.I != null && visibility == 0) {
                View findFocus = aVar.J.findFocus();
                if (findFocus != null) {
                    aVar.f().k = findFocus;
                    if (c.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + aVar);
                    }
                }
                aVar.J.setAlpha(0.0f);
            }
        }
        aVar.f = 2;
    }

    public final void g() {
        boolean z;
        a b;
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + aVar);
        }
        int i = 0;
        boolean z2 = aVar.q && !aVar.o();
        f fVar = this.b;
        if (z2) {
        }
        if (!z2 && !fVar.d.shouldDestroy(aVar)) {
            String str = aVar.m;
            if (str != null && (b = fVar.b(str)) != null && b.F) {
                aVar.l = b;
            }
            aVar.f = 0;
            return;
        }
        xp xpVar = aVar.x;
        if (xpVar != null) {
            z = fVar.d.isCleared();
        } else {
            z = xpVar.p != null ? !r5.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            fVar.d.clearNonConfigState(aVar);
        }
        aVar.y.k();
        aVar.R.d(fx.ON_DESTROY);
        aVar.f = 0;
        aVar.O = false;
        aVar.H = true;
        this.a.k(false);
        ArrayList d = fVar.d();
        int size = d.size();
        while (i < size) {
            Object obj = d.get(i);
            i++;
            e eVar = (e) obj;
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar.j.equals(aVar2.m)) {
                    aVar2.l = aVar;
                    aVar2.m = null;
                }
            }
        }
        String str2 = aVar.m;
        if (str2 != null) {
            aVar.l = fVar.b(str2);
        }
        fVar.h(this);
    }

    public final void h() {
        View view;
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + aVar);
        }
        ViewGroup viewGroup = aVar.I;
        if (viewGroup != null && (view = aVar.J) != null) {
            viewGroup.removeView(view);
        }
        aVar.y.t(1);
        if (aVar.J != null) {
            vq vqVar = aVar.S;
            vqVar.f();
            if (vqVar.h.c.isAtLeast(gx.CREATED)) {
                aVar.S.b(fx.ON_DESTROY);
            }
        }
        aVar.f = 1;
        aVar.H = false;
        aVar.u();
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onDestroyView()");
            return;
        }
        new androidx.loader.app.b(aVar, aVar.d()).b();
        aVar.u = false;
        this.a.u(false);
        aVar.I = null;
        aVar.J = null;
        aVar.S = null;
        aVar.T.h(null);
        aVar.s = false;
    }

    public final void i() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + aVar);
        }
        aVar.f = -1;
        aVar.H = false;
        aVar.v();
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onDetach()");
            return;
        }
        kq kqVar = aVar.y;
        if (!kqVar.G) {
            kqVar.k();
            aVar.y = new kq();
        }
        this.a.l(false);
        aVar.f = -1;
        aVar.x = null;
        aVar.z = null;
        aVar.w = null;
        if ((!aVar.q || aVar.o()) && !this.b.d.shouldDestroy(aVar)) {
            return;
        }
        if (c.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + aVar);
        }
        aVar.m();
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.r && aVar.s && !aVar.u) {
            if (c.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + aVar);
            }
            aVar.C(aVar.w(aVar.g), null, aVar.g);
            View view = aVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.J.setTag(R.id.fragment_container_view_tag, aVar);
                if (aVar.D) {
                    aVar.J.setVisibility(8);
                }
                aVar.A(aVar.J);
                aVar.y.t(2);
                this.a.t(false);
                aVar.f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (z) {
            if (c.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + aVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = aVar.f;
                if (d == i) {
                    if (!z2 && i == -1 && aVar.q && !aVar.o()) {
                        if (c.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + aVar);
                        }
                        fVar.d.clearNonConfigState(aVar);
                        fVar.h(this);
                        if (c.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + aVar);
                        }
                        aVar.m();
                    }
                    if (aVar.N) {
                        if (aVar.J != null && (viewGroup = aVar.I) != null) {
                            zi f = zi.f(viewGroup, aVar.j().E());
                            if (aVar.D) {
                                if (c.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + aVar);
                                }
                                f.a(se0.GONE, re0.NONE, this);
                            } else {
                                if (c.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + aVar);
                                }
                                f.a(se0.VISIBLE, re0.NONE, this);
                            }
                        }
                        c cVar = aVar.w;
                        if (cVar != null && aVar.p && c.H(aVar)) {
                            cVar.D = true;
                        }
                        aVar.N = false;
                        aVar.y.n();
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            aVar.f = 1;
                            break;
                        case 2:
                            aVar.s = false;
                            aVar.f = 2;
                            break;
                        case 3:
                            if (c.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + aVar);
                            }
                            if (aVar.J != null && aVar.h == null) {
                                o();
                            }
                            if (aVar.J != null && (viewGroup2 = aVar.I) != null) {
                                zi f2 = zi.f(viewGroup2, aVar.j().E());
                                if (c.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + aVar);
                                }
                                f2.a(se0.REMOVED, re0.REMOVING, this);
                            }
                            aVar.f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            aVar.f = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (aVar.J != null && (viewGroup3 = aVar.I) != null) {
                                zi f3 = zi.f(viewGroup3, aVar.j().E());
                                se0 from = se0.from(aVar.J.getVisibility());
                                if (c.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + aVar);
                                }
                                f3.a(from, re0.ADDING, this);
                            }
                            aVar.f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            aVar.f = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + aVar);
        }
        aVar.y.t(5);
        if (aVar.J != null) {
            aVar.S.b(fx.ON_PAUSE);
        }
        aVar.R.d(fx.ON_PAUSE);
        aVar.f = 6;
        aVar.H = true;
        this.a.m(false);
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        aVar.h = aVar.g.getSparseParcelableArray("android:view_state");
        aVar.i = aVar.g.getBundle("android:view_registry_state");
        String string = aVar.g.getString("android:target_state");
        aVar.m = string;
        if (string != null) {
            aVar.n = aVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = aVar.g.getBoolean("android:user_visible_hint", true);
        aVar.L = z;
        if (z) {
            return;
        }
        aVar.K = true;
    }

    public final void n() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + aVar);
        }
        vp vpVar = aVar.M;
        View view = vpVar == null ? null : vpVar.k;
        if (view != null) {
            if (view != aVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != aVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (c.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(aVar);
                sb.append(" resulting in focused view ");
                sb.append(aVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        aVar.f().k = null;
        aVar.y.M();
        aVar.y.y(true);
        aVar.f = 7;
        aVar.H = true;
        nx nxVar = aVar.R;
        fx fxVar = fx.ON_RESUME;
        nxVar.d(fxVar);
        if (aVar.J != null) {
            aVar.S.h.d(fxVar);
        }
        kq kqVar = aVar.y;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(7);
        this.a.p(false);
        aVar.g = null;
        aVar.h = null;
        aVar.i = null;
    }

    public final void o() {
        a aVar = this.c;
        if (aVar.J == null) {
            return;
        }
        if (c.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + aVar + " with view " + aVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        aVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            aVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        aVar.S.i.M(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        aVar.i = bundle;
    }

    public final void p() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + aVar);
        }
        aVar.y.M();
        aVar.y.y(true);
        aVar.f = 5;
        aVar.H = false;
        aVar.y();
        if (!aVar.H) {
            s9.f(aVar, " did not call through to super.onStart()");
            return;
        }
        nx nxVar = aVar.R;
        fx fxVar = fx.ON_START;
        nxVar.d(fxVar);
        if (aVar.J != null) {
            aVar.S.h.d(fxVar);
        }
        kq kqVar = aVar.y;
        kqVar.E = false;
        kqVar.F = false;
        kqVar.L.setIsStateSaved(false);
        kqVar.t(5);
        this.a.r(false);
    }

    public final void q() {
        boolean G = c.G(3);
        a aVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + aVar);
        }
        kq kqVar = aVar.y;
        kqVar.F = true;
        kqVar.L.setIsStateSaved(true);
        kqVar.t(4);
        if (aVar.J != null) {
            aVar.S.b(fx.ON_STOP);
        }
        aVar.R.d(fx.ON_STOP);
        aVar.f = 4;
        aVar.H = false;
        aVar.z();
        if (aVar.H) {
            this.a.s(false);
        } else {
            s9.f(aVar, " did not call through to super.onStop()");
        }
    }

    public e(i5 i5Var, f fVar, a aVar) {
        this.a = i5Var;
        this.b = fVar;
        this.c = aVar;
    }

    public e(i5 i5Var, f fVar, a aVar, pq pqVar) {
        this.a = i5Var;
        this.b = fVar;
        this.c = aVar;
        aVar.h = null;
        aVar.i = null;
        aVar.v = 0;
        aVar.s = false;
        aVar.p = false;
        a aVar2 = aVar.l;
        aVar.m = aVar2 != null ? aVar2.j : null;
        aVar.l = null;
        Bundle bundle = pqVar.r;
        if (bundle != null) {
            aVar.g = bundle;
        } else {
            aVar.g = new Bundle();
        }
    }
}
