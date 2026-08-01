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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.q f621a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.k f622b;

    /* renamed from: c, reason: collision with root package name */
    public final u f623c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f624e = -1;

    public q0(androidx.emoji2.text.q qVar, a0.k kVar, u uVar) {
        this.f621a = qVar;
        this.f622b = kVar;
        this.f623c = uVar;
    }

    public final void a() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + uVar);
        }
        Bundle bundle = uVar.f645g;
        uVar.f661y.N();
        uVar.f644f = 3;
        uVar.H = false;
        uVar.p();
        if (!uVar.H) {
            throw new w0("Fragment " + uVar + " did not call through to super.onActivityCreated()");
        }
        if (k0.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + uVar);
        }
        View view = uVar.J;
        if (view != null) {
            Bundle bundle2 = uVar.f645g;
            SparseArray<Parcelable> sparseArray = uVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                uVar.h = null;
            }
            if (uVar.J != null) {
                uVar.S.i.b(uVar.i);
                uVar.i = null;
            }
            uVar.H = false;
            uVar.A(bundle2);
            if (!uVar.H) {
                throw new w0("Fragment " + uVar + " did not call through to super.onViewStateRestored()");
            }
            if (uVar.J != null) {
                uVar.S.b(androidx.lifecycle.l.ON_CREATE);
            }
        }
        uVar.f645g = null;
        k0 k0Var = uVar.f661y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.u(4);
        this.f621a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f622b.h;
        u uVar = this.f623c;
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
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "moveto ATTACHED: " + uVar);
        }
        u uVar2 = uVar.f648l;
        q0 q0Var = null;
        a0.k kVar = this.f622b;
        if (uVar2 != null) {
            q0 q0Var2 = (q0) ((HashMap) kVar.f97f).get(uVar2.f646j);
            if (q0Var2 == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f648l + " that does not belong to this FragmentManager!");
            }
            uVar.f649m = uVar.f648l.f646j;
            uVar.f648l = null;
            q0Var = q0Var2;
        } else {
            String str = uVar.f649m;
            if (str != null && (q0Var = (q0) ((HashMap) kVar.f97f).get(str)) == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f649m + " that does not belong to this FragmentManager!");
            }
        }
        if (q0Var != null) {
            q0Var.k();
        }
        k0 k0Var = uVar.f659w;
        uVar.f660x = k0Var.f570t;
        uVar.f662z = k0Var.f572v;
        androidx.emoji2.text.q qVar = this.f621a;
        qVar.j(false);
        ArrayList arrayList = uVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u uVar3 = ((q) obj).f620a;
            uVar3.U.a();
            androidx.lifecycle.g0.a(uVar3);
        }
        arrayList.clear();
        uVar.f661y.b(uVar.f660x, uVar.b(), uVar);
        uVar.f644f = 0;
        uVar.H = false;
        uVar.r(uVar.f660x.f674p);
        if (!uVar.H) {
            throw new w0("Fragment " + uVar + " did not call through to super.onAttach()");
        }
        Iterator it = uVar.f659w.f563m.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).d();
        }
        k0 k0Var2 = uVar.f661y;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.u(0);
        qVar.e(false);
    }

    public final int d() {
        v0 v0Var;
        u uVar = this.f623c;
        if (uVar.f659w == null) {
            return uVar.f644f;
        }
        int i = this.f624e;
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
        if (uVar.f654r) {
            if (uVar.f655s) {
                i = Math.max(this.f624e, 2);
                View view = uVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f624e < 4 ? Math.min(i, uVar.f644f) : Math.min(i, 1);
            }
        }
        if (!uVar.f652p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            l f5 = l.f(viewGroup, uVar.j().F());
            v0 d = f5.d(uVar);
            int i5 = d != null ? d.f668b : 0;
            ArrayList arrayList = f5.f579c;
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    v0Var = null;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                v0Var = (v0) obj;
                if (v0Var.f669c.equals(uVar) && !v0Var.f671f) {
                    break;
                }
            }
            i4 = (v0Var == null || !(i5 == 0 || i5 == 1)) ? i5 : v0Var.f668b;
        }
        if (i4 == 2) {
            i = Math.min(i, 6);
        } else if (i4 == 3) {
            i = Math.max(i, 3);
        } else if (uVar.f653q) {
            i = uVar.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (uVar.K && uVar.f644f < 5) {
            i = Math.min(i, 4);
        }
        if (k0.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + uVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean H = k0.H(3);
        final u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "moveto CREATED: " + uVar);
        }
        if (uVar.O) {
            Bundle bundle = uVar.f645g;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                uVar.f661y.T(parcelable);
                uVar.f661y.j();
            }
            uVar.f644f = 1;
            return;
        }
        androidx.emoji2.text.q qVar = this.f621a;
        qVar.m(false);
        Bundle bundle2 = uVar.f645g;
        uVar.f661y.N();
        uVar.f644f = 1;
        uVar.H = false;
        uVar.R.a(new androidx.lifecycle.p() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.p
            public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
                View view;
                if (lVar != androidx.lifecycle.l.ON_STOP || (view = u.this.J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        uVar.U.b(bundle2);
        uVar.s(bundle2);
        uVar.O = true;
        if (uVar.H) {
            uVar.R.d(androidx.lifecycle.l.ON_CREATE);
            qVar.f(false);
        } else {
            throw new w0("Fragment " + uVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        u uVar = this.f623c;
        if (uVar.f654r) {
            return;
        }
        if (k0.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
        }
        LayoutInflater w4 = uVar.w(uVar.f645g);
        ViewGroup viewGroup = uVar.I;
        if (viewGroup == null) {
            int i = uVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + uVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) uVar.f659w.f571u.G(i);
                if (viewGroup == null) {
                    if (!uVar.f656t) {
                        try {
                            str = uVar.C().getResources().getResourceName(uVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(uVar.B) + " (" + str + ") for fragment " + uVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    z0.b bVar = z0.c.f4126a;
                    z0.c.b(new z0.a(uVar, "Attempting to add fragment " + uVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    z0.c.a(uVar).getClass();
                }
            }
        }
        uVar.I = viewGroup;
        uVar.B(w4, viewGroup, uVar.f645g);
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
            WeakHashMap weakHashMap = n0.p0.f2816a;
            if (view2.isAttachedToWindow()) {
                uVar.J.requestApplyInsets();
            } else {
                View view3 = uVar.J;
                view3.addOnAttachStateChangeListener(new p0(0, view3));
            }
            uVar.f661y.u(2);
            this.f621a.r(false);
            int visibility = uVar.J.getVisibility();
            uVar.d().f638j = uVar.J.getAlpha();
            if (uVar.I != null && visibility == 0) {
                View findFocus = uVar.J.findFocus();
                if (findFocus != null) {
                    uVar.d().f639k = findFocus;
                    if (k0.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar);
                    }
                }
                uVar.J.setAlpha(0.0f);
            }
        }
        uVar.f644f = 2;
    }

    public final void g() {
        boolean z4;
        u g3;
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "movefrom CREATED: " + uVar);
        }
        int i = 0;
        boolean z5 = uVar.f653q && !uVar.o();
        a0.k kVar = this.f622b;
        if (z5) {
        }
        if (!z5) {
            m0 m0Var = (m0) kVar.i;
            if (!((m0Var.f588c.containsKey(uVar.f646j) && m0Var.f590f) ? m0Var.f591g : true)) {
                String str = uVar.f649m;
                if (str != null && (g3 = kVar.g(str)) != null && g3.F) {
                    uVar.f648l = g3;
                }
                uVar.f644f = 0;
                return;
            }
        }
        w wVar = uVar.f660x;
        if (wVar != null) {
            z4 = ((m0) kVar.i).f591g;
        } else {
            z4 = wVar.f674p != null ? !r5.isChangingConfigurations() : true;
        }
        if (z5 || z4) {
            ((m0) kVar.i).c(uVar);
        }
        uVar.f661y.l();
        uVar.R.d(androidx.lifecycle.l.ON_DESTROY);
        uVar.f644f = 0;
        uVar.O = false;
        uVar.H = true;
        this.f621a.g(false);
        ArrayList k4 = kVar.k();
        int size = k4.size();
        while (i < size) {
            Object obj = k4.get(i);
            i++;
            q0 q0Var = (q0) obj;
            if (q0Var != null) {
                u uVar2 = q0Var.f623c;
                if (uVar.f646j.equals(uVar2.f649m)) {
                    uVar2.f648l = uVar;
                    uVar2.f649m = null;
                }
            }
        }
        String str2 = uVar.f649m;
        if (str2 != null) {
            uVar.f648l = kVar.g(str2);
        }
        kVar.p(this);
    }

    public final void h() {
        View view;
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + uVar);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null && (view = uVar.J) != null) {
            viewGroup.removeView(view);
        }
        uVar.f661y.u(1);
        if (uVar.J != null) {
            s0 s0Var = uVar.S;
            s0Var.d();
            if (s0Var.h.f734c.compareTo(androidx.lifecycle.m.h) >= 0) {
                uVar.S.b(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        uVar.f644f = 1;
        uVar.H = false;
        uVar.u();
        if (!uVar.H) {
            throw new w0("Fragment " + uVar + " did not call through to super.onDestroyView()");
        }
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(uVar.e(), c1.a.d);
        String canonicalName = c1.a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        q.k kVar = ((c1.a) tVar.b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), c1.a.class)).f874c;
        if (kVar.h > 0) {
            kVar.f3117g[0].getClass();
            throw new ClassCastException();
        }
        uVar.f657u = false;
        this.f621a.s(false);
        uVar.I = null;
        uVar.J = null;
        uVar.S = null;
        uVar.T.e(null);
        uVar.f655s = false;
    }

    public final void i() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + uVar);
        }
        uVar.f644f = -1;
        uVar.H = false;
        uVar.v();
        if (!uVar.H) {
            throw new w0("Fragment " + uVar + " did not call through to super.onDetach()");
        }
        k0 k0Var = uVar.f661y;
        if (!k0Var.G) {
            k0Var.l();
            uVar.f661y = new k0();
        }
        this.f621a.h(false);
        uVar.f644f = -1;
        uVar.f660x = null;
        uVar.f662z = null;
        uVar.f659w = null;
        if (!uVar.f653q || uVar.o()) {
            m0 m0Var = (m0) this.f622b.i;
            if (!((m0Var.f588c.containsKey(uVar.f646j) && m0Var.f590f) ? m0Var.f591g : true)) {
                return;
            }
        }
        if (k0.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + uVar);
        }
        uVar.m();
    }

    public final void j() {
        u uVar = this.f623c;
        if (uVar.f654r && uVar.f655s && !uVar.f657u) {
            if (k0.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
            }
            uVar.B(uVar.w(uVar.f645g), null, uVar.f645g);
            View view = uVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
                if (uVar.D) {
                    uVar.J.setVisibility(8);
                }
                uVar.f661y.u(2);
                this.f621a.r(false);
                uVar.f644f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        a0.k kVar = this.f622b;
        boolean z4 = this.d;
        u uVar = this.f623c;
        if (z4) {
            if (k0.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + uVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z5 = false;
            while (true) {
                int d = d();
                int i = uVar.f644f;
                if (d == i) {
                    if (!z5 && i == -1 && uVar.f653q && !uVar.o()) {
                        if (k0.H(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + uVar);
                        }
                        ((m0) kVar.i).c(uVar);
                        kVar.p(this);
                        if (k0.H(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + uVar);
                        }
                        uVar.m();
                    }
                    if (uVar.N) {
                        if (uVar.J != null && (viewGroup = uVar.I) != null) {
                            l f5 = l.f(viewGroup, uVar.j().F());
                            if (uVar.D) {
                                if (k0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar);
                                }
                                f5.a(3, 1, this);
                            } else {
                                if (k0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar);
                                }
                                f5.a(2, 1, this);
                            }
                        }
                        k0 k0Var = uVar.f659w;
                        if (k0Var != null && uVar.f652p && k0.I(uVar)) {
                            k0Var.D = true;
                        }
                        uVar.N = false;
                        uVar.f661y.o();
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
                            uVar.f644f = 1;
                            break;
                        case 2:
                            uVar.f655s = false;
                            uVar.f644f = 2;
                            break;
                        case 3:
                            if (k0.H(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + uVar);
                            }
                            if (uVar.J != null && uVar.h == null) {
                                o();
                            }
                            if (uVar.J != null && (viewGroup2 = uVar.I) != null) {
                                l f6 = l.f(viewGroup2, uVar.j().F());
                                if (k0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar);
                                }
                                f6.a(1, 3, this);
                            }
                            uVar.f644f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            uVar.f644f = 5;
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
                                l f7 = l.f(viewGroup3, uVar.j().F());
                                int b2 = a4.b.b(uVar.J.getVisibility());
                                if (k0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar);
                                }
                                f7.a(b2, 2, this);
                            }
                            uVar.f644f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            uVar.f644f = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z5 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "movefrom RESUMED: " + uVar);
        }
        uVar.f661y.u(5);
        if (uVar.J != null) {
            uVar.S.b(androidx.lifecycle.l.ON_PAUSE);
        }
        uVar.R.d(androidx.lifecycle.l.ON_PAUSE);
        uVar.f644f = 6;
        uVar.H = true;
        this.f621a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        u uVar = this.f623c;
        Bundle bundle = uVar.f645g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        uVar.h = uVar.f645g.getSparseParcelableArray("android:view_state");
        uVar.i = uVar.f645g.getBundle("android:view_registry_state");
        String string = uVar.f645g.getString("android:target_state");
        uVar.f649m = string;
        if (string != null) {
            uVar.f650n = uVar.f645g.getInt("android:target_req_state", 0);
        }
        boolean z4 = uVar.f645g.getBoolean("android:user_visible_hint", true);
        uVar.L = z4;
        if (z4) {
            return;
        }
        uVar.K = true;
    }

    public final void n() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "moveto RESUMED: " + uVar);
        }
        s sVar = uVar.M;
        View view = sVar == null ? null : sVar.f639k;
        if (view != null) {
            if (view != uVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != uVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (k0.H(2)) {
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
        uVar.d().f639k = null;
        uVar.f661y.N();
        uVar.f661y.y(true);
        uVar.f644f = 7;
        uVar.H = true;
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.h.d(lVar);
        }
        k0 k0Var = uVar.f661y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.u(7);
        this.f621a.n(false);
        uVar.f645g = null;
        uVar.h = null;
        uVar.i = null;
    }

    public final void o() {
        u uVar = this.f623c;
        if (uVar.J == null) {
            return;
        }
        if (k0.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + uVar + " with view " + uVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        uVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            uVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        uVar.S.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        uVar.i = bundle;
    }

    public final void p() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "moveto STARTED: " + uVar);
        }
        uVar.f661y.N();
        uVar.f661y.y(true);
        uVar.f644f = 5;
        uVar.H = false;
        uVar.y();
        if (!uVar.H) {
            throw new w0("Fragment " + uVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.h.d(lVar);
        }
        k0 k0Var = uVar.f661y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.u(5);
        this.f621a.p(false);
    }

    public final void q() {
        boolean H = k0.H(3);
        u uVar = this.f623c;
        if (H) {
            Log.d("FragmentManager", "movefrom STARTED: " + uVar);
        }
        k0 k0Var = uVar.f661y;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.u(4);
        if (uVar.J != null) {
            uVar.S.b(androidx.lifecycle.l.ON_STOP);
        }
        uVar.R.d(androidx.lifecycle.l.ON_STOP);
        uVar.f644f = 4;
        uVar.H = false;
        uVar.z();
        if (uVar.H) {
            this.f621a.q(false);
            return;
        }
        throw new w0("Fragment " + uVar + " did not call through to super.onStop()");
    }

    public q0(androidx.emoji2.text.q qVar, a0.k kVar, ClassLoader classLoader, e0 e0Var, o0 o0Var) {
        this.f621a = qVar;
        this.f622b = kVar;
        u a5 = e0Var.a(o0Var.f595f);
        Bundle bundle = o0Var.f602o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a5.F(bundle);
        a5.f646j = o0Var.f596g;
        a5.f654r = o0Var.h;
        a5.f656t = true;
        a5.A = o0Var.i;
        a5.B = o0Var.f597j;
        a5.C = o0Var.f598k;
        a5.F = o0Var.f599l;
        a5.f653q = o0Var.f600m;
        a5.E = o0Var.f601n;
        a5.D = o0Var.f603p;
        a5.Q = androidx.lifecycle.m.values()[o0Var.f604q];
        Bundle bundle2 = o0Var.f605r;
        if (bundle2 != null) {
            a5.f645g = bundle2;
        } else {
            a5.f645g = new Bundle();
        }
        this.f623c = a5;
        if (k0.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a5);
        }
    }

    public q0(androidx.emoji2.text.q qVar, a0.k kVar, u uVar, o0 o0Var) {
        this.f621a = qVar;
        this.f622b = kVar;
        this.f623c = uVar;
        uVar.h = null;
        uVar.i = null;
        uVar.f658v = 0;
        uVar.f655s = false;
        uVar.f652p = false;
        u uVar2 = uVar.f648l;
        uVar.f649m = uVar2 != null ? uVar2.f646j : null;
        uVar.f648l = null;
        Bundle bundle = o0Var.f605r;
        if (bundle != null) {
            uVar.f645g = bundle;
        } else {
            uVar.f645g = new Bundle();
        }
    }
}
