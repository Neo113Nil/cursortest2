package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ln {
    public final a5 a;
    public final rg b;
    public final pm c;
    public boolean d = false;
    public int e = -1;

    public ln(a5 a5Var, rg rgVar, ClassLoader classLoader, zm zmVar, kn knVar) {
        this.a = a5Var;
        this.b = rgVar;
        pm a = zmVar.a(knVar.f);
        Bundle bundle = knVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.H(bundle);
        a.j = knVar.g;
        a.r = knVar.h;
        a.t = true;
        a.A = knVar.i;
        a.B = knVar.j;
        a.C = knVar.k;
        a.F = knVar.l;
        a.q = knVar.m;
        a.E = knVar.n;
        a.D = knVar.p;
        a.Q = hs.values()[knVar.q];
        Bundle bundle2 = knVar.r;
        if (bundle2 != null) {
            a.g = bundle2;
        } else {
            a.g = new Bundle();
        }
        this.c = a;
        if (en.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + pmVar);
        }
        Bundle bundle = pmVar.g;
        pmVar.y.M();
        pmVar.f = 3;
        pmVar.H = false;
        pmVar.p();
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (en.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + pmVar);
        }
        View view = pmVar.J;
        if (view != null) {
            Bundle bundle2 = pmVar.g;
            SparseArray<Parcelable> sparseArray = pmVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                pmVar.h = null;
            }
            if (pmVar.J != null) {
                pmVar.S.i.b(pmVar.i);
                pmVar.i = null;
            }
            pmVar.H = false;
            pmVar.B(bundle2);
            if (!pmVar.H) {
                g9.e(pmVar, " did not call through to super.onViewStateRestored()");
                return;
            } else if (pmVar.J != null) {
                pmVar.S.b(gs.ON_CREATE);
            }
        }
        pmVar.g = null;
        en enVar = pmVar.y;
        enVar.E = false;
        enVar.F = false;
        enVar.L.g = false;
        enVar.t(4);
        this.a.j(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.f;
        pm pmVar = this.c;
        ViewGroup viewGroup = pmVar.I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(pmVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        pm pmVar2 = (pm) arrayList.get(indexOf);
                        if (pmVar2.I == viewGroup && (view = pmVar2.J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    pm pmVar3 = (pm) arrayList.get(i2);
                    if (pmVar3.I == viewGroup && (view2 = pmVar3.J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        pmVar.I.addView(pmVar.J, i);
    }

    public final void c() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + pmVar);
        }
        pm pmVar2 = pmVar.l;
        ln lnVar = null;
        rg rgVar = this.b;
        if (pmVar2 != null) {
            ln lnVar2 = (ln) ((HashMap) rgVar.g).get(pmVar2.j);
            if (lnVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(pmVar);
                pm pmVar3 = pmVar.l;
                sb.append(" declared target fragment ");
                sb.append(pmVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            pmVar.m = pmVar.l.j;
            pmVar.l = null;
            lnVar = lnVar2;
        } else {
            String str = pmVar.m;
            if (str != null && (lnVar = (ln) ((HashMap) rgVar.g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(pmVar);
                String str2 = pmVar.m;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (lnVar != null) {
            lnVar.k();
        }
        en enVar = pmVar.w;
        pmVar.x = enVar.t;
        pmVar.z = enVar.v;
        a5 a5Var = this.a;
        a5Var.q(false);
        ArrayList arrayList = pmVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pm pmVar4 = ((mm) obj).a;
            pmVar4.U.a();
            kr.r(pmVar4);
        }
        arrayList.clear();
        pmVar.y.b(pmVar.x, pmVar.b(), pmVar);
        pmVar.f = 0;
        pmVar.H = false;
        pmVar.r(pmVar.x.s);
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = pmVar.w.m.iterator();
        while (it.hasNext()) {
            ((in) it.next()).b();
        }
        en enVar2 = pmVar.y;
        enVar2.E = false;
        enVar2.F = false;
        enVar2.L.g = false;
        enVar2.t(0);
        a5Var.k(false);
    }

    public final int d() {
        m60 m60Var;
        pm pmVar = this.c;
        if (pmVar.w == null) {
            return pmVar.f;
        }
        int i = this.e;
        int ordinal = pmVar.Q.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (pmVar.r) {
            boolean z = pmVar.s;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = pmVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, pmVar.f) : Math.min(i, 1);
            }
        }
        if (!pmVar.p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = pmVar.I;
        if (viewGroup != null) {
            ug f = ug.f(viewGroup, pmVar.j().E());
            m60 d = f.d(pmVar);
            int i4 = d != null ? d.b : 0;
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    m60Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                m60Var = (m60) obj;
                pm pmVar2 = m60Var.c;
                pmVar2.getClass();
                if (pmVar2 == pmVar && !m60Var.f) {
                    break;
                }
            }
            i2 = (m60Var == null || !(i4 == 0 || i4 == 1)) ? i4 : m60Var.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (pmVar.q) {
            i = pmVar.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (pmVar.K && pmVar.f < 5) {
            i = Math.min(i, 4);
        }
        if (en.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + pmVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        int i = 3;
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + pmVar);
        }
        boolean z = pmVar.O;
        Bundle bundle = pmVar.g;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                pmVar.y.S(parcelable);
                en enVar = pmVar.y;
                enVar.E = false;
                enVar.F = false;
                enVar.L.g = false;
                enVar.t(1);
            }
            pmVar.f = 1;
            return;
        }
        a5 a5Var = this.a;
        a5Var.r(false);
        Bundle bundle2 = pmVar.g;
        pmVar.y.M();
        pmVar.f = 1;
        pmVar.H = false;
        pmVar.R.a(new p10(i, pmVar));
        pmVar.U.b(bundle2);
        pmVar.s(bundle2);
        pmVar.O = true;
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onCreate()");
        } else {
            pmVar.R.d(gs.ON_CREATE);
            a5Var.m(false);
        }
    }

    public final void f() {
        String str;
        pm pmVar = this.c;
        if (pmVar.r) {
            return;
        }
        if (en.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + pmVar);
        }
        LayoutInflater w = pmVar.w(pmVar.g);
        ViewGroup viewGroup = pmVar.I;
        if (viewGroup == null) {
            int i = pmVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + pmVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) pmVar.w.u.P(i);
                if (viewGroup == null) {
                    if (!pmVar.t) {
                        try {
                            str = pmVar.E().getResources().getResourceName(pmVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(pmVar.B) + " (" + str + ") for fragment " + pmVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    mn mnVar = nn.a;
                    nn.b(new jn(pmVar, "Attempting to add fragment " + pmVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    nn.a(pmVar).getClass();
                }
            }
        }
        pmVar.I = viewGroup;
        pmVar.C(w, viewGroup, pmVar.g);
        View view = pmVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            pmVar.J.setTag(R.id.fragment_container_view_tag, pmVar);
            if (viewGroup != null) {
                b();
            }
            if (pmVar.D) {
                pmVar.J.setVisibility(8);
            }
            View view2 = pmVar.J;
            WeakHashMap weakHashMap = ic0.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = pmVar.J;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new aa(2, view3));
            }
            pmVar.A(pmVar.J);
            pmVar.y.t(2);
            this.a.w(false);
            int visibility = pmVar.J.getVisibility();
            pmVar.f().j = pmVar.J.getAlpha();
            if (pmVar.I != null && visibility == 0) {
                View findFocus = pmVar.J.findFocus();
                if (findFocus != null) {
                    pmVar.f().k = findFocus;
                    if (en.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + pmVar);
                    }
                }
                pmVar.J.setAlpha(0.0f);
            }
        }
        pmVar.f = 2;
    }

    public final void g() {
        boolean z;
        pm h;
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + pmVar);
        }
        int i = 0;
        boolean z2 = pmVar.q && !pmVar.o();
        rg rgVar = this.b;
        if (z2) {
        }
        if (!z2) {
            hn hnVar = (hn) rgVar.i;
            if (!((hnVar.b.containsKey(pmVar.j) && hnVar.e) ? hnVar.f : true)) {
                String str = pmVar.m;
                if (str != null && (h = rgVar.h(str)) != null && h.F) {
                    pmVar.l = h;
                }
                pmVar.f = 0;
                return;
            }
        }
        rm rmVar = pmVar.x;
        if (rmVar != null) {
            z = ((hn) rgVar.i).f;
        } else {
            z = rmVar.s != null ? !r5.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((hn) rgVar.i).d(pmVar);
        }
        pmVar.y.k();
        pmVar.R.d(gs.ON_DESTROY);
        pmVar.f = 0;
        pmVar.O = false;
        pmVar.H = true;
        this.a.n(false);
        ArrayList l = rgVar.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            ln lnVar = (ln) obj;
            if (lnVar != null) {
                pm pmVar2 = lnVar.c;
                if (pmVar.j.equals(pmVar2.m)) {
                    pmVar2.l = pmVar;
                    pmVar2.m = null;
                }
            }
        }
        String str2 = pmVar.m;
        if (str2 != null) {
            pmVar.l = rgVar.h(str2);
        }
        rgVar.s(this);
    }

    public final void h() {
        View view;
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + pmVar);
        }
        ViewGroup viewGroup = pmVar.I;
        if (viewGroup != null && (view = pmVar.J) != null) {
            viewGroup.removeView(view);
        }
        pmVar.y.t(1);
        if (pmVar.J != null) {
            pn pnVar = pmVar.S;
            pnVar.f();
            if (pnVar.h.c.compareTo(hs.h) >= 0) {
                pmVar.S.b(gs.ON_DESTROY);
            }
        }
        pmVar.f = 1;
        pmVar.H = false;
        pmVar.u();
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onDestroyView()");
            return;
        }
        k60 k60Var = ((vt) new pw(pmVar.d(), vt.c).d(vt.class)).b;
        if (k60Var.h > 0) {
            k60Var.g[0].getClass();
            g9.b();
            return;
        }
        pmVar.u = false;
        this.a.x(false);
        pmVar.I = null;
        pmVar.J = null;
        pmVar.S = null;
        pmVar.T.d(null);
        pmVar.s = false;
    }

    public final void i() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + pmVar);
        }
        pmVar.f = -1;
        pmVar.H = false;
        pmVar.v();
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onDetach()");
            return;
        }
        en enVar = pmVar.y;
        if (!enVar.G) {
            enVar.k();
            pmVar.y = new en();
        }
        this.a.o(false);
        pmVar.f = -1;
        pmVar.x = null;
        pmVar.z = null;
        pmVar.w = null;
        if (!pmVar.q || pmVar.o()) {
            hn hnVar = (hn) this.b.i;
            if (!((hnVar.b.containsKey(pmVar.j) && hnVar.e) ? hnVar.f : true)) {
                return;
            }
        }
        if (en.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + pmVar);
        }
        pmVar.m();
    }

    public final void j() {
        pm pmVar = this.c;
        if (pmVar.r && pmVar.s && !pmVar.u) {
            if (en.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + pmVar);
            }
            pmVar.C(pmVar.w(pmVar.g), null, pmVar.g);
            View view = pmVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                pmVar.J.setTag(R.id.fragment_container_view_tag, pmVar);
                if (pmVar.D) {
                    pmVar.J.setVisibility(8);
                }
                pmVar.A(pmVar.J);
                pmVar.y.t(2);
                this.a.w(false);
                pmVar.f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        rg rgVar = this.b;
        boolean z = this.d;
        pm pmVar = this.c;
        if (z) {
            if (en.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + pmVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = pmVar.f;
                if (d == i) {
                    if (!z2 && i == -1 && pmVar.q && !pmVar.o()) {
                        if (en.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + pmVar);
                        }
                        ((hn) rgVar.i).d(pmVar);
                        rgVar.s(this);
                        if (en.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + pmVar);
                        }
                        pmVar.m();
                    }
                    if (pmVar.N) {
                        if (pmVar.J != null && (viewGroup = pmVar.I) != null) {
                            ug f = ug.f(viewGroup, pmVar.j().E());
                            if (pmVar.D) {
                                if (en.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + pmVar);
                                }
                                f.a(3, 1, this);
                            } else {
                                if (en.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + pmVar);
                                }
                                f.a(2, 1, this);
                            }
                        }
                        en enVar = pmVar.w;
                        if (enVar != null && pmVar.p && en.H(pmVar)) {
                            enVar.D = true;
                        }
                        pmVar.N = false;
                        pmVar.y.n();
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
                            pmVar.f = 1;
                            break;
                        case 2:
                            pmVar.s = false;
                            pmVar.f = 2;
                            break;
                        case 3:
                            if (en.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + pmVar);
                            }
                            if (pmVar.J != null && pmVar.h == null) {
                                o();
                            }
                            if (pmVar.J != null && (viewGroup2 = pmVar.I) != null) {
                                ug f2 = ug.f(viewGroup2, pmVar.j().E());
                                if (en.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + pmVar);
                                }
                                f2.a(1, 3, this);
                            }
                            pmVar.f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            pmVar.f = 5;
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
                            if (pmVar.J != null && (viewGroup3 = pmVar.I) != null) {
                                ug f3 = ug.f(viewGroup3, pmVar.j().E());
                                int b = f60.b(pmVar.J.getVisibility());
                                if (en.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + pmVar);
                                }
                                f3.a(b, 2, this);
                            }
                            pmVar.f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            pmVar.f = 6;
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
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + pmVar);
        }
        pmVar.y.t(5);
        if (pmVar.J != null) {
            pmVar.S.b(gs.ON_PAUSE);
        }
        pmVar.R.d(gs.ON_PAUSE);
        pmVar.f = 6;
        pmVar.H = true;
        this.a.p(false);
    }

    public final void m(ClassLoader classLoader) {
        pm pmVar = this.c;
        Bundle bundle = pmVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        pmVar.h = pmVar.g.getSparseParcelableArray("android:view_state");
        pmVar.i = pmVar.g.getBundle("android:view_registry_state");
        String string = pmVar.g.getString("android:target_state");
        pmVar.m = string;
        if (string != null) {
            pmVar.n = pmVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = pmVar.g.getBoolean("android:user_visible_hint", true);
        pmVar.L = z;
        if (z) {
            return;
        }
        pmVar.K = true;
    }

    public final void n() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + pmVar);
        }
        om omVar = pmVar.M;
        View view = omVar == null ? null : omVar.k;
        if (view != null) {
            if (view != pmVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != pmVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (en.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(pmVar);
                sb.append(" resulting in focused view ");
                sb.append(pmVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        pmVar.f().k = null;
        pmVar.y.M();
        pmVar.y.y(true);
        pmVar.f = 7;
        pmVar.H = true;
        os osVar = pmVar.R;
        gs gsVar = gs.ON_RESUME;
        osVar.d(gsVar);
        if (pmVar.J != null) {
            pmVar.S.h.d(gsVar);
        }
        en enVar = pmVar.y;
        enVar.E = false;
        enVar.F = false;
        enVar.L.g = false;
        enVar.t(7);
        this.a.s(false);
        pmVar.g = null;
        pmVar.h = null;
        pmVar.i = null;
    }

    public final void o() {
        pm pmVar = this.c;
        if (pmVar.J == null) {
            return;
        }
        if (en.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + pmVar + " with view " + pmVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        pmVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            pmVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        pmVar.S.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        pmVar.i = bundle;
    }

    public final void p() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + pmVar);
        }
        pmVar.y.M();
        pmVar.y.y(true);
        pmVar.f = 5;
        pmVar.H = false;
        pmVar.y();
        if (!pmVar.H) {
            g9.e(pmVar, " did not call through to super.onStart()");
            return;
        }
        os osVar = pmVar.R;
        gs gsVar = gs.ON_START;
        osVar.d(gsVar);
        if (pmVar.J != null) {
            pmVar.S.h.d(gsVar);
        }
        en enVar = pmVar.y;
        enVar.E = false;
        enVar.F = false;
        enVar.L.g = false;
        enVar.t(5);
        this.a.u(false);
    }

    public final void q() {
        boolean G = en.G(3);
        pm pmVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + pmVar);
        }
        en enVar = pmVar.y;
        enVar.F = true;
        enVar.L.g = true;
        enVar.t(4);
        if (pmVar.J != null) {
            pmVar.S.b(gs.ON_STOP);
        }
        pmVar.R.d(gs.ON_STOP);
        pmVar.f = 4;
        pmVar.H = false;
        pmVar.z();
        if (pmVar.H) {
            this.a.v(false);
        } else {
            g9.e(pmVar, " did not call through to super.onStop()");
        }
    }

    public ln(a5 a5Var, rg rgVar, pm pmVar) {
        this.a = a5Var;
        this.b = rgVar;
        this.c = pmVar;
    }

    public ln(a5 a5Var, rg rgVar, pm pmVar, kn knVar) {
        this.a = a5Var;
        this.b = rgVar;
        this.c = pmVar;
        pmVar.h = null;
        pmVar.i = null;
        pmVar.v = 0;
        pmVar.s = false;
        pmVar.p = false;
        pm pmVar2 = pmVar.l;
        pmVar.m = pmVar2 != null ? pmVar2.j : null;
        pmVar.l = null;
        Bundle bundle = knVar.r;
        if (bundle != null) {
            pmVar.g = bundle;
        } else {
            pmVar.g = new Bundle();
        }
    }
}
