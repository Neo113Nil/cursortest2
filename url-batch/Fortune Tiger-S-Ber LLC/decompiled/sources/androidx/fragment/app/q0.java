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
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.s f498a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.w f499b;
    public final u c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f500d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f501e = -1;

    public q0(a2.s sVar, androidx.emoji2.text.w wVar, u uVar) {
        this.f498a = sVar;
        this.f499b = wVar;
        this.c = uVar;
    }

    public final void a() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + uVar);
        }
        Bundle bundle = uVar.g;
        uVar.f537y.M();
        uVar.f520f = 3;
        uVar.H = false;
        uVar.p();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onActivityCreated()");
        }
        if (k0.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + uVar);
        }
        View view = uVar.J;
        if (view != null) {
            Bundle bundle2 = uVar.g;
            SparseArray<Parcelable> sparseArray = uVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                uVar.h = null;
            }
            if (uVar.J != null) {
                uVar.S.f518i.b(uVar.f521i);
                uVar.f521i = null;
            }
            uVar.H = false;
            uVar.A(bundle2);
            if (!uVar.H) {
                throw new x0("Fragment " + uVar + " did not call through to super.onViewStateRestored()");
            }
            if (uVar.J != null) {
                uVar.S.b(androidx.lifecycle.l.ON_CREATE);
            }
        }
        uVar.g = null;
        k0 k0Var = uVar.f537y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(4);
        this.f498a.e(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f499b.f368f;
        u uVar = this.c;
        ViewGroup viewGroup = uVar.I;
        int i4 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(uVar);
            int i5 = indexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        u uVar2 = (u) arrayList.get(indexOf);
                        if (uVar2.I == viewGroup && (view = uVar2.J) != null) {
                            i4 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    u uVar3 = (u) arrayList.get(i5);
                    if (uVar3.I == viewGroup && (view2 = uVar3.J) != null) {
                        i4 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        uVar.I.addView(uVar.J, i4);
    }

    public final void c() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + uVar);
        }
        u uVar2 = uVar.f524l;
        q0 q0Var = null;
        androidx.emoji2.text.w wVar = this.f499b;
        if (uVar2 != null) {
            q0 q0Var2 = (q0) ((HashMap) wVar.g).get(uVar2.f522j);
            if (q0Var2 == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f524l + " that does not belong to this FragmentManager!");
            }
            uVar.f525m = uVar.f524l.f522j;
            uVar.f524l = null;
            q0Var = q0Var2;
        } else {
            String str = uVar.f525m;
            if (str != null && (q0Var = (q0) ((HashMap) wVar.g).get(str)) == null) {
                throw new IllegalStateException("Fragment " + uVar + " declared target fragment " + uVar.f525m + " that does not belong to this FragmentManager!");
            }
        }
        if (q0Var != null) {
            q0Var.k();
        }
        k0 k0Var = uVar.f535w;
        uVar.f536x = k0Var.f451t;
        uVar.f538z = k0Var.f453v;
        a2.s sVar = this.f498a;
        sVar.l(false);
        ArrayList arrayList = uVar.V;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            u uVar3 = ((q) obj).f497a;
            uVar3.U.a();
            androidx.lifecycle.g0.a(uVar3);
        }
        arrayList.clear();
        uVar.f537y.b(uVar.f536x, uVar.b(), uVar);
        uVar.f520f = 0;
        uVar.H = false;
        uVar.r(uVar.f536x.f548l);
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onAttach()");
        }
        Iterator it = uVar.f535w.f444m.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).d();
        }
        k0 k0Var2 = uVar.f537y;
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.t(0);
        sVar.f(false);
    }

    public final int d() {
        v0 v0Var;
        u uVar = this.c;
        if (uVar.f535w == null) {
            return uVar.f520f;
        }
        int i4 = this.f501e;
        int ordinal = uVar.Q.ordinal();
        int i5 = 0;
        if (ordinal == 1) {
            i4 = Math.min(i4, 0);
        } else if (ordinal == 2) {
            i4 = Math.min(i4, 1);
        } else if (ordinal == 3) {
            i4 = Math.min(i4, 5);
        } else if (ordinal != 4) {
            i4 = Math.min(i4, -1);
        }
        if (uVar.f530r) {
            if (uVar.f531s) {
                i4 = Math.max(this.f501e, 2);
                View view = uVar.J;
                if (view != null && view.getParent() == null) {
                    i4 = Math.min(i4, 2);
                }
            } else {
                i4 = this.f501e < 4 ? Math.min(i4, uVar.f520f) : Math.min(i4, 1);
            }
        }
        if (!uVar.f528p) {
            i4 = Math.min(i4, 1);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null) {
            l f4 = l.f(viewGroup, uVar.j().E());
            v0 d4 = f4.d(uVar);
            int i6 = d4 != null ? d4.f543b : 0;
            ArrayList arrayList = f4.c;
            int size = arrayList.size();
            while (true) {
                if (i5 >= size) {
                    v0Var = null;
                    break;
                }
                Object obj = arrayList.get(i5);
                i5++;
                v0Var = (v0) obj;
                if (v0Var.c.equals(uVar) && !v0Var.f546f) {
                    break;
                }
            }
            i5 = (v0Var == null || !(i6 == 0 || i6 == 1)) ? i6 : v0Var.f543b;
        }
        if (i5 == 2) {
            i4 = Math.min(i4, 6);
        } else if (i5 == 3) {
            i4 = Math.max(i4, 3);
        } else if (uVar.f529q) {
            i4 = uVar.o() ? Math.min(i4, 1) : Math.min(i4, -1);
        }
        if (uVar.K && uVar.f520f < 5) {
            i4 = Math.min(i4, 4);
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i4 + " for " + uVar);
        }
        return i4;
    }

    public final void e() {
        Parcelable parcelable;
        boolean G = k0.G(3);
        final u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + uVar);
        }
        if (uVar.O) {
            Bundle bundle = uVar.g;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                uVar.f537y.S(parcelable);
                k0 k0Var = uVar.f537y;
                k0Var.E = false;
                k0Var.F = false;
                k0Var.L.h = false;
                k0Var.t(1);
            }
            uVar.f520f = 1;
            return;
        }
        a2.s sVar = this.f498a;
        sVar.m(false);
        Bundle bundle2 = uVar.g;
        uVar.f537y.M();
        uVar.f520f = 1;
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
            sVar.g(false);
        } else {
            throw new x0("Fragment " + uVar + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        u uVar = this.c;
        if (uVar.f530r) {
            return;
        }
        if (k0.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
        }
        LayoutInflater w3 = uVar.w(uVar.g);
        ViewGroup viewGroup = uVar.I;
        if (viewGroup == null) {
            int i4 = uVar.B;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + uVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) uVar.f535w.f452u.K(i4);
                if (viewGroup == null) {
                    if (!uVar.f532t) {
                        try {
                            str = uVar.C().getResources().getResourceName(uVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(uVar.B) + " (" + str + ") for fragment " + uVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    v0.b bVar = v0.c.f3579a;
                    v0.c.b(new v0.a(uVar, "Attempting to add fragment " + uVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    v0.c.a(uVar).getClass();
                }
            }
        }
        uVar.I = viewGroup;
        uVar.B(w3, viewGroup, uVar.g);
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
            WeakHashMap weakHashMap = k0.j0.f2752a;
            if (view2.isAttachedToWindow()) {
                k0.z.c(uVar.J);
            } else {
                View view3 = uVar.J;
                view3.addOnAttachStateChangeListener(new p0(0, view3));
            }
            uVar.f537y.t(2);
            this.f498a.r(false);
            int visibility = uVar.J.getVisibility();
            uVar.d().f515j = uVar.J.getAlpha();
            if (uVar.I != null && visibility == 0) {
                View findFocus = uVar.J.findFocus();
                if (findFocus != null) {
                    uVar.d().f516k = findFocus;
                    if (k0.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uVar);
                    }
                }
                uVar.J.setAlpha(0.0f);
            }
        }
        uVar.f520f = 2;
    }

    public final void g() {
        boolean z3;
        u d4;
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + uVar);
        }
        int i4 = 0;
        boolean z4 = uVar.f529q && !uVar.o();
        androidx.emoji2.text.w wVar = this.f499b;
        if (z4) {
        }
        if (!z4) {
            m0 m0Var = (m0) wVar.f369i;
            if (!((m0Var.c.containsKey(uVar.f522j) && m0Var.f472f) ? m0Var.g : true)) {
                String str = uVar.f525m;
                if (str != null && (d4 = wVar.d(str)) != null && d4.F) {
                    uVar.f524l = d4;
                }
                uVar.f520f = 0;
                return;
            }
        }
        w wVar2 = uVar.f536x;
        if (wVar2 != null) {
            z3 = ((m0) wVar.f369i).g;
        } else {
            z3 = wVar2.f548l != null ? !r5.isChangingConfigurations() : true;
        }
        if (z4 || z3) {
            ((m0) wVar.f369i).c(uVar);
        }
        uVar.f537y.k();
        uVar.R.d(androidx.lifecycle.l.ON_DESTROY);
        uVar.f520f = 0;
        uVar.O = false;
        uVar.H = true;
        this.f498a.i(false);
        ArrayList h = wVar.h();
        int size = h.size();
        while (i4 < size) {
            Object obj = h.get(i4);
            i4++;
            q0 q0Var = (q0) obj;
            if (q0Var != null) {
                u uVar2 = q0Var.c;
                if (uVar.f522j.equals(uVar2.f525m)) {
                    uVar2.f524l = uVar;
                    uVar2.f525m = null;
                }
            }
        }
        String str2 = uVar.f525m;
        if (str2 != null) {
            uVar.f524l = wVar.d(str2);
        }
        wVar.m(this);
    }

    public final void h() {
        View view;
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + uVar);
        }
        ViewGroup viewGroup = uVar.I;
        if (viewGroup != null && (view = uVar.J) != null) {
            viewGroup.removeView(view);
        }
        uVar.f537y.t(1);
        if (uVar.J != null) {
            s0 s0Var = uVar.S;
            s0Var.d();
            if (s0Var.h.c.compareTo(androidx.lifecycle.m.h) >= 0) {
                uVar.S.b(androidx.lifecycle.l.ON_DESTROY);
            }
        }
        uVar.f520f = 1;
        uVar.H = false;
        uVar.u();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onDestroyView()");
        }
        androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(uVar.e(), y0.a.f3611d);
        String canonicalName = y0.a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        n.k kVar = ((y0.a) sVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), y0.a.class)).c;
        if (kVar.h > 0) {
            kVar.g[0].getClass();
            throw new ClassCastException();
        }
        uVar.f533u = false;
        this.f498a.s(false);
        uVar.I = null;
        uVar.J = null;
        uVar.S = null;
        uVar.T.e(null);
        uVar.f531s = false;
    }

    public final void i() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + uVar);
        }
        uVar.f520f = -1;
        uVar.H = false;
        uVar.v();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onDetach()");
        }
        k0 k0Var = uVar.f537y;
        if (!k0Var.G) {
            k0Var.k();
            uVar.f537y = new k0();
        }
        this.f498a.j(false);
        uVar.f520f = -1;
        uVar.f536x = null;
        uVar.f538z = null;
        uVar.f535w = null;
        if (!uVar.f529q || uVar.o()) {
            m0 m0Var = (m0) this.f499b.f369i;
            if (!((m0Var.c.containsKey(uVar.f522j) && m0Var.f472f) ? m0Var.g : true)) {
                return;
            }
        }
        if (k0.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + uVar);
        }
        uVar.m();
    }

    public final void j() {
        u uVar = this.c;
        if (uVar.f530r && uVar.f531s && !uVar.f533u) {
            if (k0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + uVar);
            }
            uVar.B(uVar.w(uVar.g), null, uVar.g);
            View view = uVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                uVar.J.setTag(R.id.fragment_container_view_tag, uVar);
                if (uVar.D) {
                    uVar.J.setVisibility(8);
                }
                uVar.f537y.t(2);
                this.f498a.r(false);
                uVar.f520f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        androidx.emoji2.text.w wVar = this.f499b;
        boolean z3 = this.f500d;
        u uVar = this.c;
        if (z3) {
            if (k0.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + uVar);
                return;
            }
            return;
        }
        try {
            this.f500d = true;
            boolean z4 = false;
            while (true) {
                int d4 = d();
                int i4 = uVar.f520f;
                if (d4 == i4) {
                    if (!z4 && i4 == -1 && uVar.f529q && !uVar.o()) {
                        if (k0.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + uVar);
                        }
                        ((m0) wVar.f369i).c(uVar);
                        wVar.m(this);
                        if (k0.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + uVar);
                        }
                        uVar.m();
                    }
                    if (uVar.N) {
                        if (uVar.J != null && (viewGroup = uVar.I) != null) {
                            l f4 = l.f(viewGroup, uVar.j().E());
                            if (uVar.D) {
                                if (k0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar);
                                }
                                f4.a(3, 1, this);
                            } else {
                                if (k0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar);
                                }
                                f4.a(2, 1, this);
                            }
                        }
                        k0 k0Var = uVar.f535w;
                        if (k0Var != null && uVar.f528p && k0.H(uVar)) {
                            k0Var.D = true;
                        }
                        uVar.N = false;
                        uVar.f537y.n();
                    }
                    this.f500d = false;
                    return;
                }
                if (d4 <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            uVar.f520f = 1;
                            break;
                        case 2:
                            uVar.f531s = false;
                            uVar.f520f = 2;
                            break;
                        case 3:
                            if (k0.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + uVar);
                            }
                            if (uVar.J != null && uVar.h == null) {
                                o();
                            }
                            if (uVar.J != null && (viewGroup2 = uVar.I) != null) {
                                l f5 = l.f(viewGroup2, uVar.j().E());
                                if (k0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar);
                                }
                                f5.a(1, 3, this);
                            }
                            uVar.f520f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            uVar.f520f = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i4 + 1) {
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
                                l f6 = l.f(viewGroup3, uVar.j().E());
                                int b2 = w0.b(uVar.J.getVisibility());
                                if (k0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar);
                                }
                                f6.a(b2, 2, this);
                            }
                            uVar.f520f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            uVar.f520f = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z4 = true;
            }
        } catch (Throwable th) {
            this.f500d = false;
            throw th;
        }
    }

    public final void l() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + uVar);
        }
        uVar.f537y.t(5);
        if (uVar.J != null) {
            uVar.S.b(androidx.lifecycle.l.ON_PAUSE);
        }
        uVar.R.d(androidx.lifecycle.l.ON_PAUSE);
        uVar.f520f = 6;
        uVar.H = true;
        this.f498a.k(false);
    }

    public final void m(ClassLoader classLoader) {
        u uVar = this.c;
        Bundle bundle = uVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        uVar.h = uVar.g.getSparseParcelableArray("android:view_state");
        uVar.f521i = uVar.g.getBundle("android:view_registry_state");
        String string = uVar.g.getString("android:target_state");
        uVar.f525m = string;
        if (string != null) {
            uVar.f526n = uVar.g.getInt("android:target_req_state", 0);
        }
        boolean z3 = uVar.g.getBoolean("android:user_visible_hint", true);
        uVar.L = z3;
        if (z3) {
            return;
        }
        uVar.K = true;
    }

    public final void n() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + uVar);
        }
        s sVar = uVar.M;
        View view = sVar == null ? null : sVar.f516k;
        if (view != null) {
            if (view != uVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != uVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (k0.G(2)) {
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
        uVar.d().f516k = null;
        uVar.f537y.M();
        uVar.f537y.y(true);
        uVar.f520f = 7;
        uVar.H = true;
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_RESUME;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.h.d(lVar);
        }
        k0 k0Var = uVar.f537y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(7);
        this.f498a.n(false);
        uVar.g = null;
        uVar.h = null;
        uVar.f521i = null;
    }

    public final void o() {
        u uVar = this.c;
        if (uVar.J == null) {
            return;
        }
        if (k0.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + uVar + " with view " + uVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        uVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            uVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        uVar.S.f518i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        uVar.f521i = bundle;
    }

    public final void p() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + uVar);
        }
        uVar.f537y.M();
        uVar.f537y.y(true);
        uVar.f520f = 5;
        uVar.H = false;
        uVar.y();
        if (!uVar.H) {
            throw new x0("Fragment " + uVar + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = uVar.R;
        androidx.lifecycle.l lVar = androidx.lifecycle.l.ON_START;
        tVar.d(lVar);
        if (uVar.J != null) {
            uVar.S.h.d(lVar);
        }
        k0 k0Var = uVar.f537y;
        k0Var.E = false;
        k0Var.F = false;
        k0Var.L.h = false;
        k0Var.t(5);
        this.f498a.p(false);
    }

    public final void q() {
        boolean G = k0.G(3);
        u uVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + uVar);
        }
        k0 k0Var = uVar.f537y;
        k0Var.F = true;
        k0Var.L.h = true;
        k0Var.t(4);
        if (uVar.J != null) {
            uVar.S.b(androidx.lifecycle.l.ON_STOP);
        }
        uVar.R.d(androidx.lifecycle.l.ON_STOP);
        uVar.f520f = 4;
        uVar.H = false;
        uVar.z();
        if (uVar.H) {
            this.f498a.q(false);
            return;
        }
        throw new x0("Fragment " + uVar + " did not call through to super.onStop()");
    }

    public q0(a2.s sVar, androidx.emoji2.text.w wVar, ClassLoader classLoader, e0 e0Var, o0 o0Var) {
        this.f498a = sVar;
        this.f499b = wVar;
        u a4 = e0Var.a(o0Var.f476f);
        Bundle bundle = o0Var.f483o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a4.F(bundle);
        a4.f522j = o0Var.g;
        a4.f530r = o0Var.h;
        a4.f532t = true;
        a4.A = o0Var.f477i;
        a4.B = o0Var.f478j;
        a4.C = o0Var.f479k;
        a4.F = o0Var.f480l;
        a4.f529q = o0Var.f481m;
        a4.E = o0Var.f482n;
        a4.D = o0Var.f484p;
        a4.Q = androidx.lifecycle.m.values()[o0Var.f485q];
        Bundle bundle2 = o0Var.f486r;
        if (bundle2 != null) {
            a4.g = bundle2;
        } else {
            a4.g = new Bundle();
        }
        this.c = a4;
        if (k0.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a4);
        }
    }

    public q0(a2.s sVar, androidx.emoji2.text.w wVar, u uVar, o0 o0Var) {
        this.f498a = sVar;
        this.f499b = wVar;
        this.c = uVar;
        uVar.h = null;
        uVar.f521i = null;
        uVar.f534v = 0;
        uVar.f531s = false;
        uVar.f528p = false;
        u uVar2 = uVar.f524l;
        uVar.f525m = uVar2 != null ? uVar2.f522j : null;
        uVar.f524l = null;
        Bundle bundle = o0Var.f486r;
        if (bundle != null) {
            uVar.g = bundle;
        } else {
            uVar.g = new Bundle();
        }
    }
}
