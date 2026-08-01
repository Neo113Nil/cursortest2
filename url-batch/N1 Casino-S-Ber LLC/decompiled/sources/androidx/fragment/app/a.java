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
import com.derinko.gbini.n1casino.R;
import defpackage.a6;
import defpackage.aq;
import defpackage.bl;
import defpackage.d30;
import defpackage.dl;
import defpackage.dr;
import defpackage.el;
import defpackage.fl;
import defpackage.gl;
import defpackage.hl;
import defpackage.i30;
import defpackage.ik;
import defpackage.il;
import defpackage.jw;
import defpackage.k30;
import defpackage.kk;
import defpackage.kl;
import defpackage.mk;
import defpackage.n9;
import defpackage.ok;
import defpackage.q4;
import defpackage.t8;
import defpackage.up;
import defpackage.vp;
import defpackage.we;
import defpackage.wk;
import defpackage.x80;
import defpackage.yp;
import defpackage.ze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class a {
    public final q4 a;
    public final we b;
    public final mk c;
    public boolean d = false;
    public int e = -1;

    public a(q4 q4Var, we weVar, ClassLoader classLoader, wk wkVar, gl glVar) {
        this.a = q4Var;
        this.b = weVar;
        mk a = wkVar.a(glVar.f);
        Bundle bundle = glVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.H(bundle);
        a.j = glVar.g;
        a.r = glVar.h;
        a.t = true;
        a.A = glVar.i;
        a.B = glVar.j;
        a.C = glVar.k;
        a.F = glVar.l;
        a.q = glVar.m;
        a.E = glVar.n;
        a.D = glVar.p;
        a.Q = vp.values()[glVar.q];
        Bundle bundle2 = glVar.r;
        if (bundle2 != null) {
            a.g = bundle2;
        } else {
            a.g = new Bundle();
        }
        this.c = a;
        if (bl.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + mkVar);
        }
        Bundle bundle = mkVar.g;
        mkVar.y.M();
        mkVar.f = 3;
        mkVar.H = false;
        mkVar.q();
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (bl.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + mkVar);
        }
        View view = mkVar.J;
        if (view != null) {
            Bundle bundle2 = mkVar.g;
            SparseArray<Parcelable> sparseArray = mkVar.h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                mkVar.h = null;
            }
            if (mkVar.J != null) {
                mkVar.S.i.b(mkVar.i);
                mkVar.i = null;
            }
            mkVar.H = false;
            mkVar.C(bundle2);
            if (!mkVar.H) {
                t8.f(mkVar, " did not call through to super.onViewStateRestored()");
                return;
            } else if (mkVar.J != null) {
                mkVar.S.b(up.ON_CREATE);
            }
        }
        mkVar.g = null;
        bl blVar = mkVar.y;
        blVar.E = false;
        blVar.F = false;
        blVar.L.h = false;
        blVar.t(4);
        this.a.e(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.f;
        mk mkVar = this.c;
        ViewGroup viewGroup = mkVar.I;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(mkVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        mk mkVar2 = (mk) arrayList.get(indexOf);
                        if (mkVar2.I == viewGroup && (view = mkVar2.J) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    mk mkVar3 = (mk) arrayList.get(i2);
                    if (mkVar3.I == viewGroup && (view2 = mkVar3.J) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        mkVar.I.addView(mkVar.J, i);
    }

    public final void c() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto ATTACHED: " + mkVar);
        }
        mk mkVar2 = mkVar.l;
        a aVar = null;
        we weVar = this.b;
        if (mkVar2 != null) {
            a aVar2 = (a) ((HashMap) weVar.g).get(mkVar2.j);
            if (aVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(mkVar);
                mk mkVar3 = mkVar.l;
                sb.append(" declared target fragment ");
                sb.append(mkVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            mkVar.m = mkVar.l.j;
            mkVar.l = null;
            aVar = aVar2;
        } else {
            String str = mkVar.m;
            if (str != null && (aVar = (a) ((HashMap) weVar.g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(mkVar);
                String str2 = mkVar.m;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (aVar != null) {
            aVar.k();
        }
        bl blVar = mkVar.w;
        mkVar.x = blVar.t;
        mkVar.z = blVar.v;
        q4 q4Var = this.a;
        q4Var.k(false);
        ArrayList arrayList = mkVar.V;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mk mkVar4 = ((ik) obj).a;
            mkVar4.U.a();
            jw.q(mkVar4);
        }
        arrayList.clear();
        mkVar.y.b(mkVar.x, mkVar.b(), mkVar);
        mkVar.f = 0;
        mkVar.H = false;
        mkVar.s(mkVar.x.p);
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = mkVar.w.m.iterator();
        while (it.hasNext()) {
            ((el) it.next()).b();
        }
        bl blVar2 = mkVar.y;
        blVar2.E = false;
        blVar2.F = false;
        blVar2.L.h = false;
        blVar2.t(0);
        q4Var.f(false);
    }

    public final int d() {
        k30 k30Var;
        mk mkVar = this.c;
        if (mkVar.w == null) {
            return mkVar.f;
        }
        int i = this.e;
        int ordinal = mkVar.Q.ordinal();
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
        if (mkVar.r) {
            boolean z = mkVar.s;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = mkVar.J;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, mkVar.f) : Math.min(i, 1);
            }
        }
        if (!mkVar.p) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = mkVar.I;
        if (viewGroup != null) {
            ze f = ze.f(viewGroup, mkVar.j().E());
            k30 d = f.d(mkVar);
            int i4 = d != null ? d.b : 0;
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    k30Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                k30Var = (k30) obj;
                mk mkVar2 = k30Var.c;
                mkVar2.getClass();
                if (mkVar2 == mkVar && !k30Var.f) {
                    break;
                }
            }
            i2 = (k30Var == null || !(i4 == 0 || i4 == 1)) ? i4 : k30Var.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (mkVar.q) {
            i = mkVar.p() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (mkVar.K && mkVar.f < 5) {
            i = Math.min(i, 4);
        }
        if (bl.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + mkVar);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean G = bl.G(3);
        final mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto CREATED: " + mkVar);
        }
        boolean z = mkVar.O;
        Bundle bundle = mkVar.g;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                mkVar.y.S(parcelable);
                bl blVar = mkVar.y;
                blVar.E = false;
                blVar.F = false;
                blVar.L.h = false;
                blVar.t(1);
            }
            mkVar.f = 1;
            return;
        }
        q4 q4Var = this.a;
        q4Var.l(false);
        Bundle bundle2 = mkVar.g;
        mkVar.y.M();
        mkVar.f = 1;
        mkVar.H = false;
        mkVar.R.a(new yp() { // from class: androidx.fragment.app.Fragment$6
            @Override // defpackage.yp
            public final void b(aq aqVar, up upVar) {
                View view;
                if (upVar != up.ON_STOP || (view = mk.this.J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        mkVar.U.b(bundle2);
        mkVar.t(bundle2);
        mkVar.O = true;
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onCreate()");
        } else {
            mkVar.R.d(up.ON_CREATE);
            q4Var.g(false);
        }
    }

    public final void f() {
        String str;
        mk mkVar = this.c;
        if (mkVar.r) {
            return;
        }
        if (bl.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + mkVar);
        }
        LayoutInflater x = mkVar.x(mkVar.g);
        ViewGroup viewGroup = mkVar.I;
        if (viewGroup == null) {
            int i = mkVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + mkVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) mkVar.w.u.L(i);
                if (viewGroup == null) {
                    if (!mkVar.t) {
                        try {
                            str = mkVar.k().getResourceName(mkVar.B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(mkVar.B) + " (" + str + ") for fragment " + mkVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    hl hlVar = il.a;
                    il.b(new fl(mkVar, "Attempting to add fragment " + mkVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    il.a(mkVar).getClass();
                }
            }
        }
        mkVar.I = viewGroup;
        mkVar.D(x, viewGroup, mkVar.g);
        View view = mkVar.J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            mkVar.J.setTag(R.id.fragment_container_view_tag, mkVar);
            if (viewGroup != null) {
                b();
            }
            if (mkVar.D) {
                mkVar.J.setVisibility(8);
            }
            View view2 = mkVar.J;
            WeakHashMap weakHashMap = x80.a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = mkVar.J;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new n9(2, view3));
            }
            mkVar.B(mkVar.J);
            mkVar.y.t(2);
            this.a.r(false);
            int visibility = mkVar.J.getVisibility();
            mkVar.f().j = mkVar.J.getAlpha();
            if (mkVar.I != null && visibility == 0) {
                View findFocus = mkVar.J.findFocus();
                if (findFocus != null) {
                    mkVar.f().k = findFocus;
                    if (bl.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + mkVar);
                    }
                }
                mkVar.J.setAlpha(0.0f);
            }
        }
        mkVar.f = 2;
    }

    public final void g() {
        boolean z;
        mk h;
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATED: " + mkVar);
        }
        int i = 0;
        boolean z2 = mkVar.q && !mkVar.p();
        we weVar = this.b;
        if (z2) {
        }
        if (!z2) {
            dl dlVar = (dl) weVar.i;
            if (!((dlVar.c.containsKey(mkVar.j) && dlVar.f) ? dlVar.g : true)) {
                String str = mkVar.m;
                if (str != null && (h = weVar.h(str)) != null && h.F) {
                    mkVar.l = h;
                }
                mkVar.f = 0;
                return;
            }
        }
        ok okVar = mkVar.x;
        if (okVar != null) {
            z = ((dl) weVar.i).g;
        } else {
            z = okVar.p != null ? !r5.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((dl) weVar.i).c(mkVar);
        }
        mkVar.y.k();
        mkVar.R.d(up.ON_DESTROY);
        mkVar.f = 0;
        mkVar.O = false;
        mkVar.H = true;
        this.a.h(false);
        ArrayList l = weVar.l();
        int size = l.size();
        while (i < size) {
            Object obj = l.get(i);
            i++;
            a aVar = (a) obj;
            if (aVar != null) {
                mk mkVar2 = aVar.c;
                if (mkVar.j.equals(mkVar2.m)) {
                    mkVar2.l = mkVar;
                    mkVar2.m = null;
                }
            }
        }
        String str2 = mkVar.m;
        if (str2 != null) {
            mkVar.l = weVar.h(str2);
        }
        weVar.s(this);
    }

    public final void h() {
        View view;
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + mkVar);
        }
        ViewGroup viewGroup = mkVar.I;
        if (viewGroup != null && (view = mkVar.J) != null) {
            viewGroup.removeView(view);
        }
        mkVar.y.t(1);
        if (mkVar.J != null) {
            kl klVar = mkVar.S;
            klVar.f();
            if (klVar.h.c.compareTo(vp.h) >= 0) {
                mkVar.S.b(up.ON_DESTROY);
            }
        }
        mkVar.f = 1;
        mkVar.H = false;
        mkVar.v();
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onDestroyView()");
            return;
        }
        a6 a6Var = new a6(mkVar.d(), dr.d);
        String canonicalName = dr.class.getCanonicalName();
        if (canonicalName == null) {
            t8.k("Local and anonymous classes can not be ViewModels");
            return;
        }
        i30 i30Var = ((dr) a6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), dr.class)).c;
        if (i30Var.h > 0) {
            i30Var.g[0].getClass();
            t8.c();
            return;
        }
        mkVar.u = false;
        this.a.t(false);
        mkVar.I = null;
        mkVar.J = null;
        mkVar.S = null;
        mkVar.T.e(null);
        mkVar.s = false;
    }

    public final void i() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + mkVar);
        }
        mkVar.f = -1;
        mkVar.H = false;
        mkVar.w();
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onDetach()");
            return;
        }
        bl blVar = mkVar.y;
        if (!blVar.G) {
            blVar.k();
            mkVar.y = new bl();
        }
        this.a.i(false);
        mkVar.f = -1;
        mkVar.x = null;
        mkVar.z = null;
        mkVar.w = null;
        if (!mkVar.q || mkVar.p()) {
            dl dlVar = (dl) this.b.i;
            if (!((dlVar.c.containsKey(mkVar.j) && dlVar.f) ? dlVar.g : true)) {
                return;
            }
        }
        if (bl.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + mkVar);
        }
        mkVar.n();
    }

    public final void j() {
        mk mkVar = this.c;
        if (mkVar.r && mkVar.s && !mkVar.u) {
            if (bl.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + mkVar);
            }
            mkVar.D(mkVar.x(mkVar.g), null, mkVar.g);
            View view = mkVar.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                mkVar.J.setTag(R.id.fragment_container_view_tag, mkVar);
                if (mkVar.D) {
                    mkVar.J.setVisibility(8);
                }
                mkVar.B(mkVar.J);
                mkVar.y.t(2);
                this.a.r(false);
                mkVar.f = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        we weVar = this.b;
        boolean z = this.d;
        mk mkVar = this.c;
        if (z) {
            if (bl.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + mkVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = mkVar.f;
                if (d == i) {
                    if (!z2 && i == -1 && mkVar.q && !mkVar.p()) {
                        if (bl.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + mkVar);
                        }
                        ((dl) weVar.i).c(mkVar);
                        weVar.s(this);
                        if (bl.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + mkVar);
                        }
                        mkVar.n();
                    }
                    if (mkVar.N) {
                        if (mkVar.J != null && (viewGroup = mkVar.I) != null) {
                            ze f = ze.f(viewGroup, mkVar.j().E());
                            if (mkVar.D) {
                                if (bl.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + mkVar);
                                }
                                f.a(3, 1, this);
                            } else {
                                if (bl.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + mkVar);
                                }
                                f.a(2, 1, this);
                            }
                        }
                        bl blVar = mkVar.w;
                        if (blVar != null && mkVar.p && bl.H(mkVar)) {
                            blVar.D = true;
                        }
                        mkVar.N = false;
                        mkVar.y.n();
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
                            mkVar.f = 1;
                            break;
                        case 2:
                            mkVar.s = false;
                            mkVar.f = 2;
                            break;
                        case 3:
                            if (bl.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + mkVar);
                            }
                            if (mkVar.J != null && mkVar.h == null) {
                                o();
                            }
                            if (mkVar.J != null && (viewGroup2 = mkVar.I) != null) {
                                ze f2 = ze.f(viewGroup2, mkVar.j().E());
                                if (bl.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + mkVar);
                                }
                                f2.a(1, 3, this);
                            }
                            mkVar.f = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            mkVar.f = 5;
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
                            if (mkVar.J != null && (viewGroup3 = mkVar.I) != null) {
                                ze f3 = ze.f(viewGroup3, mkVar.j().E());
                                int b = d30.b(mkVar.J.getVisibility());
                                if (bl.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + mkVar);
                                }
                                f3.a(b, 2, this);
                            }
                            mkVar.f = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            mkVar.f = 6;
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
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom RESUMED: " + mkVar);
        }
        mkVar.y.t(5);
        if (mkVar.J != null) {
            mkVar.S.b(up.ON_PAUSE);
        }
        mkVar.R.d(up.ON_PAUSE);
        mkVar.f = 6;
        mkVar.H = true;
        this.a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        mk mkVar = this.c;
        Bundle bundle = mkVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        mkVar.h = mkVar.g.getSparseParcelableArray("android:view_state");
        mkVar.i = mkVar.g.getBundle("android:view_registry_state");
        String string = mkVar.g.getString("android:target_state");
        mkVar.m = string;
        if (string != null) {
            mkVar.n = mkVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = mkVar.g.getBoolean("android:user_visible_hint", true);
        mkVar.L = z;
        if (z) {
            return;
        }
        mkVar.K = true;
    }

    public final void n() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto RESUMED: " + mkVar);
        }
        kk kkVar = mkVar.M;
        View view = kkVar == null ? null : kkVar.k;
        if (view != null) {
            if (view != mkVar.J) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != mkVar.J) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (bl.G(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(mkVar);
                sb.append(" resulting in focused view ");
                sb.append(mkVar.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        mkVar.f().k = null;
        mkVar.y.M();
        mkVar.y.y(true);
        mkVar.f = 7;
        mkVar.H = true;
        androidx.lifecycle.a aVar = mkVar.R;
        up upVar = up.ON_RESUME;
        aVar.d(upVar);
        if (mkVar.J != null) {
            mkVar.S.h.d(upVar);
        }
        bl blVar = mkVar.y;
        blVar.E = false;
        blVar.F = false;
        blVar.L.h = false;
        blVar.t(7);
        this.a.n(false);
        mkVar.g = null;
        mkVar.h = null;
        mkVar.i = null;
    }

    public final void o() {
        mk mkVar = this.c;
        if (mkVar.J == null) {
            return;
        }
        if (bl.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + mkVar + " with view " + mkVar.J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        mkVar.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            mkVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        mkVar.S.i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        mkVar.i = bundle;
    }

    public final void p() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "moveto STARTED: " + mkVar);
        }
        mkVar.y.M();
        mkVar.y.y(true);
        mkVar.f = 5;
        mkVar.H = false;
        mkVar.z();
        if (!mkVar.H) {
            t8.f(mkVar, " did not call through to super.onStart()");
            return;
        }
        androidx.lifecycle.a aVar = mkVar.R;
        up upVar = up.ON_START;
        aVar.d(upVar);
        if (mkVar.J != null) {
            mkVar.S.h.d(upVar);
        }
        bl blVar = mkVar.y;
        blVar.E = false;
        blVar.F = false;
        blVar.L.h = false;
        blVar.t(5);
        this.a.p(false);
    }

    public final void q() {
        boolean G = bl.G(3);
        mk mkVar = this.c;
        if (G) {
            Log.d("FragmentManager", "movefrom STARTED: " + mkVar);
        }
        bl blVar = mkVar.y;
        blVar.F = true;
        blVar.L.h = true;
        blVar.t(4);
        if (mkVar.J != null) {
            mkVar.S.b(up.ON_STOP);
        }
        mkVar.R.d(up.ON_STOP);
        mkVar.f = 4;
        mkVar.H = false;
        mkVar.A();
        if (mkVar.H) {
            this.a.q(false);
        } else {
            t8.f(mkVar, " did not call through to super.onStop()");
        }
    }

    public a(q4 q4Var, we weVar, mk mkVar) {
        this.a = q4Var;
        this.b = weVar;
        this.c = mkVar;
    }

    public a(q4 q4Var, we weVar, mk mkVar, gl glVar) {
        this.a = q4Var;
        this.b = weVar;
        this.c = mkVar;
        mkVar.h = null;
        mkVar.i = null;
        mkVar.v = 0;
        mkVar.s = false;
        mkVar.p = false;
        mk mkVar2 = mkVar.l;
        mkVar.m = mkVar2 != null ? mkVar2.j : null;
        mkVar.l = null;
        Bundle bundle = glVar.r;
        if (bundle != null) {
            mkVar.g = bundle;
        } else {
            mkVar.g = new Bundle();
        }
    }
}
