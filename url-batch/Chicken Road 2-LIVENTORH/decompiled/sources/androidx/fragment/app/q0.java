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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.q f509a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.j f510b;

    /* renamed from: c, reason: collision with root package name */
    public final u f511c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f512e = -1;

    public q0(androidx.emoji2.text.q qVar, a0.j jVar, u uVar) {
        this.f509a = qVar;
        this.f510b = jVar;
        this.f511c = uVar;
    }

    public final void a() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + uVar);
        }
        Bundle bundle = uVar.f536g;
        uVar.f553y.K();
        uVar.f535f = 3;
        uVar.H = false;
        uVar.o();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onActivityCreated()");
        }
        if (k0.E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + uVar);
        }
        View view = uVar.J;
        if (view != null) {
            Bundle bundle2 = uVar.f536g;
            SparseArray<Parcelable> sparseArray = uVar.f537h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                uVar.f537h = null;
            }
            if (uVar.J != null) {
                uVar.S.i.b(uVar.i);
                uVar.i = null;
            }
            uVar.H = false;
            uVar.A(bundle2);
            if (!uVar.H) {
                throw new x0("Fragment " + uVar + " did not call through to super.onViewStateRestored()");
            }
            if (uVar.J != null) {
                uVar.S.c(androidx.lifecycle.l.ON_CREATE);
            }
        }
        uVar.f536g = null;
        k0 k0Var = uVar.f553y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.f481h = false;
        k0Var.t(4);
        this.f509a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f510b.f102h;
        u uVar = this.f511c;
        ViewGroup viewGroup = uVar.I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(uVar);
            int i4 = indexOf - 1;
            while (true) {
                if (i4 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        u uVar2 = (u) arrayList.get(indexOf);
                        if (uVar2.I == viewGroup && (view = uVar2.J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    u uVar3 = (u) arrayList.get(i4);
                    if (uVar3.I == viewGroup && (view2 = uVar3.J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i4--;
                }
            }
        }
        uVar.I.addView(uVar.J, i);
    }

    public final void c() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "moveto ATTACHED: " + uVar);
        }
        u uVar2 = uVar.f540l;
        q0 q0Var = null;
        a0.j jVar = this.f510b;
        if (uVar2 != null) {
            q0 q0Var2 = (q0) ((HashMap) jVar.f100f).get(uVar2.f538j);
            if (q0Var2 == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f540l + " that does not belong to this FragmentManager!");
            }
            uVar.f541m = uVar.f540l.f538j;
            uVar.f540l = null;
            q0Var = q0Var2;
        } else {
            String str = uVar.f541m;
            if (str != null && (q0Var = (q0) ((HashMap) jVar.f100f).get(str)) == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f541m + " that does not belong to this FragmentManager!");
            }
        }
        if (q0Var != null) {
            q0Var.k();
        }
        k0 k0Var = uVar.f551w;
        uVar.f552x = k0Var.f458t;
        uVar.f554z = k0Var.f460v;
        androidx.emoji2.text.q qVar = this.f509a;
        qVar.j(false);
        ArrayList arrayList = uVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u uVar3 = ((q) obj).f508a;
            uVar3.U.a();
            androidx.lifecycle.g0.a(uVar3);
        }
        arrayList.clear();
        uVar.f553y.b(uVar.f552x, uVar.c(), uVar);
        uVar.f535f = 0;
        uVar.H = false;
        uVar.q(uVar.f552x.f568o);
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onAttach()");
        }
        Iterator it = uVar.f551w.f451m.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).a();
        }
        k0 k0Var2 = uVar.f553y;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.f481h = false;
        k0Var2.t(0);
        qVar.d(false);
    }

    public final int d() {
        v0 v0Var;
        u uVar = this.f511c;
        if (uVar.f551w == null) {
            return uVar.f535f;
        }
        int i = this.f512e;
        int ordinal = uVar.Q.ordinal();
        int i4 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (uVar.f546r) {
            if (uVar.f547s) {
                i = Math.max(this.f512e, 2);
                View view = uVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f512e < 4 ? Math.min(i, uVar.f535f) : Math.min(i, 1);
            }
        }
        if (!uVar.f544p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            l f2 = l.f(viewGroup, uVar.j().C());
            v0 d = f2.d(uVar);
            int i5 = d != null ? d.f561b : 0;
            ArrayList arrayList = f2.f467c;
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    v0Var = null;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                v0Var = (v0) obj;
                if (v0Var.f562c.equals(uVar) && !v0Var.f564f) {
                    break;
                }
            }
            i4 = (v0Var == null || !(i5 == 0 || i5 == 1)) ? i5 : v0Var.f561b;
        }
        if (i4 == 2) {
            i = Math.min(i, 6);
        } else if (i4 == 3) {
            i = Math.max(i, 3);
        } else if (uVar.f545q) {
            i = uVar.n() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (uVar.K && uVar.f535f < 5) {
            i = Math.min(i, 4);
        }
        if (k0.E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + uVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean E = k0.E(3);
        final u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "moveto CREATED: " + uVar);
        }
        if (uVar.O) {
            Bundle bundle = uVar.f536g;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                uVar.f553y.Q(parcelable);
                k0 k0Var = uVar.f553y;
                k0Var.E = false;
                k0Var.F = false;
                k0Var.L.f481h = false;
                k0Var.t(1);
            }
            uVar.f535f = 1;
            return;
        }
        androidx.emoji2.text.q qVar = this.f509a;
        qVar.k(false);
        Bundle bundle2 = uVar.f536g;
        uVar.f553y.K();
        uVar.f535f = 1;
        uVar.H = false;
        uVar.R.a(new androidx.lifecycle.p() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.p
            public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                View view;
                if (lVar != androidx.lifecycle.l.ON_STOP || (view = u.this.J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        uVar.U.b(bundle2);
        uVar.r(bundle2);
        uVar.O = true;
        if (uVar.H) {
            uVar.R.d(androidx.lifecycle.l.ON_CREATE);
            qVar.f(false);
        } else {
            throw new x0("Fragment " + uVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        u uVar = this.f511c;
        if (uVar.f546r) {
            return;
        }
        if (k0.E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
        }
        LayoutInflater v3 = uVar.v(uVar.f536g);
        ViewGroup viewGroup = uVar.I;
        if (viewGroup == null) {
            int i = uVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + uVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) uVar.f551w.f459u.M(i);
                if (viewGroup == null) {
                    if (!uVar.f548t) {
                        try {
                            str = uVar.C().getResources().getResourceName(uVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(uVar.B) + " (" + str + ") for fragment " + uVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    y0.b bVar = y0.c.f3779a;
                    y0.c.b(new y0.a(uVar, "Attempting to add fragment " + uVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    y0.c.a(uVar).getClass();
                }
            }
        }
        uVar.I = viewGroup;
        uVar.B(v3, viewGroup, uVar.f536g);
        View view = uVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
            if (viewGroup != null) {
                b();
            }
            if (uVar.D) {
                uVar.J.setVisibility(8);
            }
            View view2 = uVar.J;
            WeakHashMap weakHashMap = n0.l0.f2757a;
            if (view2.isAttachedToWindow()) {
                n0.b0.c(uVar.J);
            } else {
                View view3 = uVar.J;
                view3.addOnAttachStateChangeListener(new p0(0, view3));
            }
            uVar.z(uVar.J, uVar.f536g);
            uVar.f553y.t(2);
            this.f509a.q(false);
            int visibility = uVar.J.getVisibility();
            uVar.f().f528j = uVar.J.getAlpha();
            if (uVar.I != null && visibility == 0) {
                View findFocus = uVar.J.findFocus();
                if (findFocus != null) {
                    uVar.f().f529k = findFocus;
                    if (k0.E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar);
                    }
                }
                uVar.J.setAlpha(0.0f);
            }
        }
        uVar.f535f = 2;
    }

    public final void g() {
        boolean z3;
        u f2;
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "movefrom CREATED: " + uVar);
        }
        int i = 0;
        boolean z4 = uVar.f545q && !uVar.n();
        a0.j jVar = this.f510b;
        if (z4) {
        }
        if (!z4) {
            m0 m0Var = (m0) jVar.i;
            if (!((m0Var.f477c.containsKey(uVar.f538j) && m0Var.f479f) ? m0Var.f480g : true)) {
                String str = uVar.f541m;
                if (str != null && (f2 = jVar.f(str)) != null && f2.F) {
                    uVar.f540l = f2;
                }
                uVar.f535f = 0;
                return;
            }
        }
        w wVar = uVar.f552x;
        if (wVar != null) {
            z3 = ((m0) jVar.i).f480g;
        } else {
            z3 = wVar.f568o != null ? !r5.isChangingConfigurations() : true;
        }
        if (z4 || z3) {
            ((m0) jVar.i).c(uVar);
        }
        uVar.f553y.k();
        uVar.R.d(androidx.lifecycle.l.ON_DESTROY);
        uVar.f535f = 0;
        uVar.O = false;
        uVar.H = true;
        this.f509a.g(false);
        ArrayList i4 = jVar.i();
        int size = i4.size();
        while (i < size) {
            Object obj = i4.get(i);
            i++;
            q0 q0Var = (q0) obj;
            if (q0Var != null) {
                u uVar2 = q0Var.f511c;
                if (uVar.f538j.equals(uVar2.f541m)) {
                    uVar2.f540l = uVar;
                    uVar2.f541m = null;
                }
            }
        }
        String str2 = uVar.f541m;
        if (str2 != null) {
            uVar.f540l = jVar.f(str2);
        }
        jVar.m(this);
    }

    public final void h() {
        View view;
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + uVar);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null && (view = uVar.J) != null) {
            viewGroup.removeView(view);
        }
        uVar.f553y.t(1);
        if (uVar.J != null) {
            s0 s0Var = uVar.S;
            s0Var.f();
            if (s0Var.f532h.f630c.compareTo(androidx.lifecycle.m.f619h) >= 0) {
                uVar.S.c(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        uVar.f535f = 1;
        uVar.H = false;
        uVar.t();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onDestroyView()");
        }
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(uVar.d(), b1.a.d);
        String canonicalName = b1.a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        q.k kVar = ((b1.a) tVar.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), b1.a.class)).f723c;
        if (kVar.f3039h > 0) {
            kVar.f3038g[0].getClass();
            throw new ClassCastException();
        }
        uVar.f549u = false;
        this.f509a.r(false);
        uVar.I = null;
        uVar.J = null;
        uVar.S = null;
        uVar.T.e(null);
        uVar.f547s = false;
    }

    public final void i() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + uVar);
        }
        uVar.f535f = -1;
        uVar.H = false;
        uVar.u();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onDetach()");
        }
        k0 k0Var = uVar.f553y;
        if (!k0Var.G) {
            k0Var.k();
            uVar.f553y = new k0();
        }
        this.f509a.h(false);
        uVar.f535f = -1;
        uVar.f552x = null;
        uVar.f554z = null;
        uVar.f551w = null;
        if (!uVar.f545q || uVar.n()) {
            m0 m0Var = (m0) this.f510b.i;
            if (!((m0Var.f477c.containsKey(uVar.f538j) && m0Var.f479f) ? m0Var.f480g : true)) {
                return;
            }
        }
        if (k0.E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + uVar);
        }
        uVar.l();
    }

    public final void j() {
        u uVar = this.f511c;
        if (uVar.f546r && uVar.f547s && !uVar.f549u) {
            if (k0.E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
            }
            uVar.B(uVar.v(uVar.f536g), null, uVar.f536g);
            View view = uVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
                if (uVar.D) {
                    uVar.J.setVisibility(8);
                }
                uVar.z(uVar.J, uVar.f536g);
                uVar.f553y.t(2);
                this.f509a.q(false);
                uVar.f535f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        a0.j jVar = this.f510b;
        boolean z3 = this.d;
        u uVar = this.f511c;
        if (z3) {
            if (k0.E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + uVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z4 = false;
            while (true) {
                int d = d();
                int i = uVar.f535f;
                if (d == i) {
                    if (!z4 && i == -1 && uVar.f545q && !uVar.n()) {
                        if (k0.E(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + uVar);
                        }
                        ((m0) jVar.i).c(uVar);
                        jVar.m(this);
                        if (k0.E(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + uVar);
                        }
                        uVar.l();
                    }
                    if (uVar.N) {
                        if (uVar.J != null && (viewGroup = uVar.I) != null) {
                            l f2 = l.f(viewGroup, uVar.j().C());
                            if (uVar.D) {
                                if (k0.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar);
                                }
                                f2.a(3, 1, this);
                            } else {
                                if (k0.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        k0 k0Var = uVar.f551w;
                        if (k0Var != null && uVar.f544p && k0.F(uVar)) {
                            k0Var.D = true;
                        }
                        uVar.N = false;
                        uVar.f553y.n();
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
                            uVar.f535f = 1;
                            break;
                        case 2:
                            uVar.f547s = false;
                            uVar.f535f = 2;
                            break;
                        case 3:
                            if (k0.E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + uVar);
                            }
                            if (uVar.J != null && uVar.f537h == null) {
                                o();
                            }
                            if (uVar.J != null && (viewGroup2 = uVar.I) != null) {
                                l f4 = l.f(viewGroup2, uVar.j().C());
                                if (k0.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar);
                                }
                                f4.a(1, 3, this);
                            }
                            uVar.f535f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            uVar.f535f = 5;
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
                            if (uVar.J != null && (viewGroup3 = uVar.I) != null) {
                                l f5 = l.f(viewGroup3, uVar.j().C());
                                int b4 = w0.b(uVar.J.getVisibility());
                                if (k0.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar);
                                }
                                f5.a(b4, 2, this);
                            }
                            uVar.f535f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            uVar.f535f = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "movefrom RESUMED: " + uVar);
        }
        uVar.f553y.t(5);
        if (uVar.J != null) {
            uVar.S.c(androidx.lifecycle.l.ON_PAUSE);
        }
        uVar.R.d(androidx.lifecycle.l.ON_PAUSE);
        uVar.f535f = 6;
        uVar.H = true;
        this.f509a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        u uVar = this.f511c;
        Bundle bundle = uVar.f536g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        uVar.f537h = uVar.f536g.getSparseParcelableArray("android:view_state");
        uVar.i = uVar.f536g.getBundle("android:view_registry_state");
        String string = uVar.f536g.getString("android:target_state");
        uVar.f541m = string;
        if (string != null) {
            uVar.f542n = uVar.f536g.getInt("android:target_req_state", 0);
        }
        boolean z3 = uVar.f536g.getBoolean("android:user_visible_hint", true);
        uVar.L = z3;
        if (z3) {
            return;
        }
        uVar.K = true;
    }

    public final void n() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "moveto RESUMED: " + uVar);
        }
        s sVar = uVar.M;
        View view = sVar == null ? null : sVar.f529k;
        if (view != null) {
            if (view != uVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != uVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (k0.E(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(uVar);
                sb.append(" resulting in focused view ");
                sb.append(uVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        uVar.f().f529k = null;
        uVar.f553y.K();
        uVar.f553y.x(true);
        uVar.f535f = 7;
        uVar.H = true;
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.f532h.d(lVar);
        }
        k0 k0Var = uVar.f553y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.f481h = false;
        k0Var.t(7);
        this.f509a.l(false);
        uVar.f536g = null;
        uVar.f537h = null;
        uVar.i = null;
    }

    public final void o() {
        u uVar = this.f511c;
        if (uVar.J == null) {
            return;
        }
        if (k0.E(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + uVar + " with view " + uVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        uVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            uVar.f537h = sparseArray;
        }
        Bundle bundle = new Bundle();
        uVar.S.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        uVar.i = bundle;
    }

    public final void p() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "moveto STARTED: " + uVar);
        }
        uVar.f553y.K();
        uVar.f553y.x(true);
        uVar.f535f = 5;
        uVar.H = false;
        uVar.x();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.f532h.d(lVar);
        }
        k0 k0Var = uVar.f553y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.f481h = false;
        k0Var.t(5);
        this.f509a.n(false);
    }

    public final void q() {
        boolean E = k0.E(3);
        u uVar = this.f511c;
        if (E) {
            Log.d("FragmentManager", "movefrom STARTED: " + uVar);
        }
        k0 k0Var = uVar.f553y;
        k0Var.F = true;
        k0Var.L.f481h = true;
        k0Var.t(4);
        if (uVar.J != null) {
            uVar.S.c(androidx.lifecycle.l.ON_STOP);
        }
        uVar.R.d(androidx.lifecycle.l.ON_STOP);
        uVar.f535f = 4;
        uVar.H = false;
        uVar.y();
        if (uVar.H) {
            this.f509a.p(false);
            return;
        }
        throw new x0("Fragment " + uVar + " did not call through to super.onStop()");
    }

    public q0(androidx.emoji2.text.q qVar, a0.j jVar, ClassLoader classLoader, e0 e0Var, o0 o0Var) {
        this.f509a = qVar;
        this.f510b = jVar;
        u a2 = e0Var.a(o0Var.f485f);
        Bundle bundle = o0Var.f493o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f538j = o0Var.f486g;
        a2.f546r = o0Var.f487h;
        a2.f548t = true;
        a2.A = o0Var.i;
        a2.B = o0Var.f488j;
        a2.C = o0Var.f489k;
        a2.F = o0Var.f490l;
        a2.f545q = o0Var.f491m;
        a2.E = o0Var.f492n;
        a2.D = o0Var.f494p;
        a2.Q = androidx.lifecycle.m.values()[o0Var.f495q];
        Bundle bundle2 = o0Var.f496r;
        if (bundle2 != null) {
            a2.f536g = bundle2;
        } else {
            a2.f536g = new Bundle();
        }
        this.f511c = a2;
        if (k0.E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public q0(androidx.emoji2.text.q qVar, a0.j jVar, u uVar, o0 o0Var) {
        this.f509a = qVar;
        this.f510b = jVar;
        this.f511c = uVar;
        uVar.f537h = null;
        uVar.i = null;
        uVar.f550v = 0;
        uVar.f547s = false;
        uVar.f544p = false;
        u uVar2 = uVar.f540l;
        uVar.f541m = uVar2 != null ? uVar2.f538j : null;
        uVar.f540l = null;
        Bundle bundle = o0Var.f496r;
        if (bundle != null) {
            uVar.f536g = bundle;
        } else {
            uVar.f536g = new Bundle();
        }
    }
}
