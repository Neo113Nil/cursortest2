package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.EnumC0249o;
import c0.AbstractC0285a;
import i.AbstractActivityC0525l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k0.C0590a;
import kotlin.jvm.internal.Intrinsics;
import u.C0940k;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final P0.c f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.i f3669b;

    /* renamed from: c, reason: collision with root package name */
    public final ComponentCallbacksC0228t f3670c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3671d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3672e = -1;

    public Y(P0.c cVar, P0.i iVar, ComponentCallbacksC0228t componentCallbacksC0228t) {
        this.f3668a = cVar;
        this.f3669b = iVar;
        this.f3670c = componentCallbacksC0228t;
    }

    public final void a() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC0228t);
        }
        Bundle bundle = componentCallbacksC0228t.f3800e;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        componentCallbacksC0228t.f3777C.P();
        componentCallbacksC0228t.f3799d = 3;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.k();
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onActivityCreated()");
        }
        if (Q.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3800e = null;
        S s7 = componentCallbacksC0228t.f3777C;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(4);
        this.f3668a.f(componentCallbacksC0228t, bundle2, false);
    }

    public final void b() {
        Y y7;
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC0228t);
        }
        ComponentCallbacksC0228t componentCallbacksC0228t2 = componentCallbacksC0228t.f3805o;
        P0.i iVar = this.f3669b;
        if (componentCallbacksC0228t2 != null) {
            y7 = (Y) ((HashMap) iVar.f2201b).get(componentCallbacksC0228t2.f3803m);
            if (y7 == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC0228t + " declared target fragment " + componentCallbacksC0228t.f3805o + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC0228t.f3806p = componentCallbacksC0228t.f3805o.f3803m;
            componentCallbacksC0228t.f3805o = null;
        } else {
            String str = componentCallbacksC0228t.f3806p;
            if (str != null) {
                y7 = (Y) ((HashMap) iVar.f2201b).get(str);
                if (y7 == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(componentCallbacksC0228t);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(r4.f.f(sb, componentCallbacksC0228t.f3806p, " that does not belong to this FragmentManager!"));
                }
            } else {
                y7 = null;
            }
        }
        if (y7 != null) {
            y7.j();
        }
        Q q4 = componentCallbacksC0228t.f3775A;
        componentCallbacksC0228t.f3776B = q4.f3633v;
        componentCallbacksC0228t.f3778D = q4.f3635x;
        P0.c cVar = this.f3668a;
        cVar.l(componentCallbacksC0228t, false);
        ArrayList arrayList = componentCallbacksC0228t.f3797X;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ComponentCallbacksC0228t componentCallbacksC0228t3 = ((r) obj).f3764a;
            componentCallbacksC0228t3.f3796W.a();
            androidx.lifecycle.O.d(componentCallbacksC0228t3);
            Bundle bundle = componentCallbacksC0228t3.f3800e;
            componentCallbacksC0228t3.f3796W.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        componentCallbacksC0228t.f3777C.b(componentCallbacksC0228t.f3776B, componentCallbacksC0228t.a(), componentCallbacksC0228t);
        componentCallbacksC0228t.f3799d = 0;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.m(componentCallbacksC0228t.f3776B.f3823e);
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onAttach()");
        }
        Iterator it = componentCallbacksC0228t.f3775A.f3626o.iterator();
        while (it.hasNext()) {
            ((W) it.next()).a(componentCallbacksC0228t);
        }
        S s7 = componentCallbacksC0228t.f3777C;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(0);
        cVar.g(componentCallbacksC0228t, false);
    }

    public final int c() {
        Object obj;
        Object obj2;
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (componentCallbacksC0228t.f3775A == null) {
            return componentCallbacksC0228t.f3799d;
        }
        int i2 = this.f3672e;
        int ordinal = componentCallbacksC0228t.f3793T.ordinal();
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        if (componentCallbacksC0228t.f3812v) {
            i2 = componentCallbacksC0228t.f3813w ? Math.max(this.f3672e, 2) : this.f3672e < 4 ? Math.min(i2, componentCallbacksC0228t.f3799d) : Math.min(i2, 1);
        }
        if (!componentCallbacksC0228t.f3809s) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = componentCallbacksC0228t.f3787M;
        if (viewGroup != null) {
            C0222m e7 = C0222m.e(viewGroup, componentCallbacksC0228t.e());
            e7.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC0228t, "fragmentStateManager.fragment");
            ArrayList arrayList = e7.f3742b;
            int size = arrayList.size();
            int i5 = 0;
            while (true) {
                obj = null;
                if (i5 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i5);
                i5++;
                ((d0) obj2).getClass();
                if (Intrinsics.a(null, componentCallbacksC0228t)) {
                    break;
                }
            }
            ArrayList arrayList2 = e7.f3743c;
            int size2 = arrayList2.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList2.get(i7);
                i7++;
                ((d0) obj3).getClass();
                if (Intrinsics.a(null, componentCallbacksC0228t)) {
                    obj = obj3;
                    break;
                }
            }
        }
        if (componentCallbacksC0228t.f3810t) {
            i2 = componentCallbacksC0228t.j() ? Math.min(i2, 1) : Math.min(i2, -1);
        }
        if (componentCallbacksC0228t.f3788N && componentCallbacksC0228t.f3799d < 5) {
            i2 = Math.min(i2, 4);
        }
        if (componentCallbacksC0228t.f3811u && componentCallbacksC0228t.f3787M != null) {
            i2 = Math.max(i2, 3);
        }
        if (Q.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + componentCallbacksC0228t);
        }
        return i2;
    }

    public final void d() {
        Bundle bundle;
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC0228t);
        }
        Bundle bundle2 = componentCallbacksC0228t.f3800e;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (componentCallbacksC0228t.f3791R) {
            componentCallbacksC0228t.f3799d = 1;
            Bundle bundle4 = componentCallbacksC0228t.f3800e;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            componentCallbacksC0228t.f3777C.U(bundle);
            S s7 = componentCallbacksC0228t.f3777C;
            s7.f3604G = false;
            s7.f3605H = false;
            s7.f3611N.f3653f = false;
            s7.u(1);
            return;
        }
        P0.c cVar = this.f3668a;
        cVar.m(componentCallbacksC0228t, bundle3, false);
        componentCallbacksC0228t.f3777C.P();
        componentCallbacksC0228t.f3799d = 1;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.f3794U.a(new C0590a(1, componentCallbacksC0228t));
        componentCallbacksC0228t.n(bundle3);
        componentCallbacksC0228t.f3791R = true;
        if (componentCallbacksC0228t.f3786L) {
            componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_CREATE);
            cVar.h(componentCallbacksC0228t, bundle3, false);
        } else {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onCreate()");
        }
    }

    public final void e() {
        String str;
        ComponentCallbacksC0228t fragment = this.f3670c;
        if (fragment.f3812v) {
            return;
        }
        if (Q.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.f3800e;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater q4 = fragment.q(bundle2);
        ViewGroup viewGroup = fragment.f3787M;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i2 = fragment.f3780F;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id");
                }
                container = (ViewGroup) fragment.f3775A.f3634w.b(i2);
                if (container == null) {
                    if (!fragment.f3814x) {
                        try {
                            str = fragment.v().getResources().getResourceName(fragment.f3780F);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f3780F) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof B)) {
                    Z.c cVar = Z.d.f2934a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Z.g gVar = new Z.g(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                    Z.d.c(gVar);
                    Z.c a7 = Z.d.a(fragment);
                    if (a7.f2932a.contains(Z.b.f2929m) && Z.d.e(a7, fragment.getClass(), Z.g.class)) {
                        Z.d.b(a7, gVar);
                    }
                }
            }
        }
        fragment.f3787M = container;
        fragment.u(q4, container, bundle2);
        fragment.f3799d = 2;
    }

    public final void f() {
        ComponentCallbacksC0228t c7;
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "movefrom CREATED: " + componentCallbacksC0228t);
        }
        boolean z7 = true;
        int i2 = 0;
        boolean z8 = componentCallbacksC0228t.f3810t && !componentCallbacksC0228t.j();
        P0.i iVar = this.f3669b;
        if (z8) {
            iVar.n(componentCallbacksC0228t.f3803m, null);
        }
        if (!z8) {
            V v7 = (V) iVar.f2203d;
            if (!((v7.f3648a.containsKey(componentCallbacksC0228t.f3803m) && v7.f3651d) ? v7.f3652e : true)) {
                String str = componentCallbacksC0228t.f3806p;
                if (str != null && (c7 = iVar.c(str)) != null && c7.f3784J) {
                    componentCallbacksC0228t.f3805o = c7;
                }
                componentCallbacksC0228t.f3799d = 0;
                return;
            }
        }
        C0232x c0232x = componentCallbacksC0228t.f3776B;
        if (c0232x != null) {
            z7 = ((V) iVar.f2203d).f3652e;
        } else {
            AbstractActivityC0525l abstractActivityC0525l = c0232x.f3823e;
            if (abstractActivityC0525l != null) {
                z7 = true ^ abstractActivityC0525l.isChangingConfigurations();
            }
        }
        if (z8 || z7) {
            ((V) iVar.f2203d).b(componentCallbacksC0228t, false);
        }
        componentCallbacksC0228t.f3777C.l();
        componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_DESTROY);
        componentCallbacksC0228t.f3799d = 0;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.f3791R = false;
        componentCallbacksC0228t.f3786L = true;
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onDestroy()");
        }
        this.f3668a.i(componentCallbacksC0228t, false);
        ArrayList e7 = iVar.e();
        int size = e7.size();
        while (i2 < size) {
            Object obj = e7.get(i2);
            i2++;
            Y y7 = (Y) obj;
            if (y7 != null) {
                ComponentCallbacksC0228t componentCallbacksC0228t2 = y7.f3670c;
                if (componentCallbacksC0228t.f3803m.equals(componentCallbacksC0228t2.f3806p)) {
                    componentCallbacksC0228t2.f3805o = componentCallbacksC0228t;
                    componentCallbacksC0228t2.f3806p = null;
                }
            }
        }
        String str2 = componentCallbacksC0228t.f3806p;
        if (str2 != null) {
            componentCallbacksC0228t.f3805o = iVar.c(str2);
        }
        iVar.k(this);
    }

    public final void g() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC0228t);
        }
        ViewGroup viewGroup = componentCallbacksC0228t.f3787M;
        componentCallbacksC0228t.f3777C.u(1);
        componentCallbacksC0228t.f3799d = 1;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.o();
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onDestroyView()");
        }
        C0940k c0940k = AbstractC0285a.a(componentCallbacksC0228t).f4169b.f4167a;
        if (c0940k.f8048i > 0) {
            c0940k.f8047e[0].getClass();
            throw new ClassCastException();
        }
        componentCallbacksC0228t.f3815y = false;
        this.f3668a.s(componentCallbacksC0228t, false);
        componentCallbacksC0228t.f3787M = null;
        componentCallbacksC0228t.f3795V.d(null);
        componentCallbacksC0228t.f3813w = false;
    }

    public final void h() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3799d = -1;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.p();
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onDetach()");
        }
        S s7 = componentCallbacksC0228t.f3777C;
        if (!s7.f3606I) {
            s7.l();
            componentCallbacksC0228t.f3777C = new S();
        }
        this.f3668a.j(componentCallbacksC0228t, false);
        componentCallbacksC0228t.f3799d = -1;
        componentCallbacksC0228t.f3776B = null;
        componentCallbacksC0228t.f3778D = null;
        componentCallbacksC0228t.f3775A = null;
        if (!componentCallbacksC0228t.f3810t || componentCallbacksC0228t.j()) {
            V v7 = (V) this.f3669b.f2203d;
            if (!((v7.f3648a.containsKey(componentCallbacksC0228t.f3803m) && v7.f3651d) ? v7.f3652e : true)) {
                return;
            }
        }
        if (Q.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC0228t);
        }
        componentCallbacksC0228t.g();
    }

    public final void i() {
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (componentCallbacksC0228t.f3812v && componentCallbacksC0228t.f3813w && !componentCallbacksC0228t.f3815y) {
            if (Q.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC0228t);
            }
            Bundle bundle = componentCallbacksC0228t.f3800e;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            componentCallbacksC0228t.u(componentCallbacksC0228t.q(bundle2), null, bundle2);
        }
    }

    public final void j() {
        P0.i iVar = this.f3669b;
        boolean z7 = this.f3671d;
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (z7) {
            if (Q.J(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + componentCallbacksC0228t);
                return;
            }
            return;
        }
        try {
            this.f3671d = true;
            boolean z8 = false;
            while (true) {
                int c7 = c();
                int i2 = componentCallbacksC0228t.f3799d;
                if (c7 == i2) {
                    if (!z8 && i2 == -1 && componentCallbacksC0228t.f3810t && !componentCallbacksC0228t.j()) {
                        if (Q.J(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + componentCallbacksC0228t);
                        }
                        ((V) iVar.f2203d).b(componentCallbacksC0228t, true);
                        iVar.k(this);
                        if (Q.J(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + componentCallbacksC0228t);
                        }
                        componentCallbacksC0228t.g();
                    }
                    if (componentCallbacksC0228t.Q) {
                        Q q4 = componentCallbacksC0228t.f3775A;
                        if (q4 != null && componentCallbacksC0228t.f3809s && Q.K(componentCallbacksC0228t)) {
                            q4.f3603F = true;
                        }
                        componentCallbacksC0228t.Q = false;
                        componentCallbacksC0228t.f3777C.o();
                    }
                    this.f3671d = false;
                    return;
                }
                if (c7 <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            componentCallbacksC0228t.f3799d = 1;
                            break;
                        case 2:
                            componentCallbacksC0228t.f3813w = false;
                            componentCallbacksC0228t.f3799d = 2;
                            break;
                        case 3:
                            if (Q.J(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + componentCallbacksC0228t);
                            }
                            componentCallbacksC0228t.f3799d = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            componentCallbacksC0228t.f3799d = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            componentCallbacksC0228t.f3799d = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            componentCallbacksC0228t.f3799d = 6;
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            m();
                            break;
                    }
                }
                z8 = true;
            }
        } catch (Throwable th) {
            this.f3671d = false;
            throw th;
        }
    }

    public final void k() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3777C.u(5);
        componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_PAUSE);
        componentCallbacksC0228t.f3799d = 6;
        componentCallbacksC0228t.f3786L = true;
        this.f3668a.k(componentCallbacksC0228t, false);
    }

    public final void l(ClassLoader classLoader) {
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        Bundle bundle = componentCallbacksC0228t.f3800e;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (componentCallbacksC0228t.f3800e.getBundle("savedInstanceState") == null) {
            componentCallbacksC0228t.f3800e.putBundle("savedInstanceState", new Bundle());
        }
        try {
            componentCallbacksC0228t.f3801i = componentCallbacksC0228t.f3800e.getSparseParcelableArray("viewState");
            componentCallbacksC0228t.f3802l = componentCallbacksC0228t.f3800e.getBundle("viewRegistryState");
            X x7 = (X) componentCallbacksC0228t.f3800e.getParcelable("state");
            if (x7 != null) {
                componentCallbacksC0228t.f3806p = x7.f3665t;
                componentCallbacksC0228t.f3807q = x7.f3666u;
                componentCallbacksC0228t.f3789O = x7.f3667v;
            }
            if (componentCallbacksC0228t.f3789O) {
                return;
            }
            componentCallbacksC0228t.f3788N = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + componentCallbacksC0228t, e7);
        }
    }

    public final void m() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "moveto RESUMED: " + componentCallbacksC0228t);
        }
        C0227s c0227s = componentCallbacksC0228t.f3790P;
        View view = c0227s == null ? null : c0227s.j;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        componentCallbacksC0228t.b().j = null;
        componentCallbacksC0228t.f3777C.P();
        componentCallbacksC0228t.f3777C.A(true);
        componentCallbacksC0228t.f3799d = 7;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.f3786L = true;
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onResume()");
        }
        componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_RESUME);
        S s7 = componentCallbacksC0228t.f3777C;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(7);
        this.f3668a.n(componentCallbacksC0228t, false);
        this.f3669b.n(componentCallbacksC0228t.f3803m, null);
        componentCallbacksC0228t.f3800e = null;
        componentCallbacksC0228t.f3801i = null;
        componentCallbacksC0228t.f3802l = null;
    }

    public final void n() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC0228t);
        }
        componentCallbacksC0228t.f3777C.P();
        componentCallbacksC0228t.f3777C.A(true);
        componentCallbacksC0228t.f3799d = 5;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.s();
        if (!componentCallbacksC0228t.f3786L) {
            throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onStart()");
        }
        componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_START);
        S s7 = componentCallbacksC0228t.f3777C;
        s7.f3604G = false;
        s7.f3605H = false;
        s7.f3611N.f3653f = false;
        s7.u(5);
        this.f3668a.q(componentCallbacksC0228t, false);
    }

    public final void o() {
        boolean J7 = Q.J(3);
        ComponentCallbacksC0228t componentCallbacksC0228t = this.f3670c;
        if (J7) {
            Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC0228t);
        }
        S s7 = componentCallbacksC0228t.f3777C;
        s7.f3605H = true;
        s7.f3611N.f3653f = true;
        s7.u(4);
        componentCallbacksC0228t.f3794U.e(EnumC0248n.ON_STOP);
        componentCallbacksC0228t.f3799d = 4;
        componentCallbacksC0228t.f3786L = false;
        componentCallbacksC0228t.t();
        if (componentCallbacksC0228t.f3786L) {
            this.f3668a.r(componentCallbacksC0228t, false);
            return;
        }
        throw new h0("Fragment " + componentCallbacksC0228t + " did not call through to super.onStop()");
    }

    public Y(P0.c cVar, P0.i iVar, ClassLoader classLoader, J j, Bundle bundle) {
        this.f3668a = cVar;
        this.f3669b = iVar;
        X x7 = (X) bundle.getParcelable("state");
        ComponentCallbacksC0228t a7 = j.a(x7.f3654d);
        a7.f3803m = x7.f3655e;
        a7.f3812v = x7.f3656i;
        a7.f3814x = true;
        a7.f3779E = x7.f3657l;
        a7.f3780F = x7.f3658m;
        a7.f3781G = x7.f3659n;
        a7.f3784J = x7.f3660o;
        a7.f3810t = x7.f3661p;
        a7.f3783I = x7.f3662q;
        a7.f3782H = x7.f3663r;
        a7.f3793T = EnumC0249o.values()[x7.f3664s];
        a7.f3806p = x7.f3665t;
        a7.f3807q = x7.f3666u;
        a7.f3789O = x7.f3667v;
        this.f3670c = a7;
        a7.f3800e = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        Q q4 = a7.f3775A;
        if (q4 != null && (q4.f3604G || q4.f3605H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a7.f3804n = bundle2;
        if (Q.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a7);
        }
    }

    public Y(P0.c cVar, P0.i iVar, ComponentCallbacksC0228t componentCallbacksC0228t, Bundle bundle) {
        this.f3668a = cVar;
        this.f3669b = iVar;
        this.f3670c = componentCallbacksC0228t;
        componentCallbacksC0228t.f3801i = null;
        componentCallbacksC0228t.f3802l = null;
        componentCallbacksC0228t.f3816z = 0;
        componentCallbacksC0228t.f3813w = false;
        componentCallbacksC0228t.f3809s = false;
        ComponentCallbacksC0228t componentCallbacksC0228t2 = componentCallbacksC0228t.f3805o;
        componentCallbacksC0228t.f3806p = componentCallbacksC0228t2 != null ? componentCallbacksC0228t2.f3803m : null;
        componentCallbacksC0228t.f3805o = null;
        componentCallbacksC0228t.f3800e = bundle;
        componentCallbacksC0228t.f3804n = bundle.getBundle("arguments");
    }
}
