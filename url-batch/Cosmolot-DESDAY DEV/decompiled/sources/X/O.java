package X;

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
import androidx.lifecycle.EnumC0068l;
import androidx.lifecycle.EnumC0069m;
import com.molarmass.wincalc.R;
import h0.C0129a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f851a;

    /* renamed from: b, reason: collision with root package name */
    public final T.t f852b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f853c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f854e = -1;

    public O(B.j jVar, T.t tVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f851a = jVar;
        this.f852b = tVar;
        this.f853c = abstractComponentCallbacksC0048q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
        }
        Bundle bundle = abstractComponentCallbacksC0048q.f964b;
        abstractComponentCallbacksC0048q.f979t.K();
        abstractComponentCallbacksC0048q.f963a = 3;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.p();
        if (!abstractComponentCallbacksC0048q.f948C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0048q);
        }
        View view = abstractComponentCallbacksC0048q.f950E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0048q.f964b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0048q.f965c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0048q.f965c = null;
            }
            if (abstractComponentCallbacksC0048q.f950E != null) {
                abstractComponentCallbacksC0048q.f958N.d.b(abstractComponentCallbacksC0048q.d);
                abstractComponentCallbacksC0048q.d = null;
            }
            abstractComponentCallbacksC0048q.f948C = false;
            abstractComponentCallbacksC0048q.A(bundle2);
            if (!abstractComponentCallbacksC0048q.f948C) {
                throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0048q.f950E != null) {
                abstractComponentCallbacksC0048q.f958N.e(EnumC0068l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0048q.f964b = null;
        I i = abstractComponentCallbacksC0048q.f979t;
        i.f798E = false;
        i.F = false;
        i.f804L.f840g = false;
        i.t(4);
        this.f851a.b(false);
    }

    public final void b() {
        View view;
        View view2;
        T.t tVar = this.f852b;
        tVar.getClass();
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f949D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) tVar.f742a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0048q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = (AbstractComponentCallbacksC0048q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0048q2.f949D == viewGroup && (view = abstractComponentCallbacksC0048q2.f950E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0048q3.f949D == viewGroup && (view2 = abstractComponentCallbacksC0048q3.f950E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0048q.f949D.addView(abstractComponentCallbacksC0048q.f950E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f968g;
        O o2 = null;
        T.t tVar = this.f852b;
        if (abstractComponentCallbacksC0048q2 != null) {
            O o3 = (O) ((HashMap) tVar.f743b).get(abstractComponentCallbacksC0048q2.f966e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.f968g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q.f968g.f966e;
            abstractComponentCallbacksC0048q.f968g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0048q.h;
            if (str != null && (o2 = (O) ((HashMap) tVar.f743b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0048q.f977r;
        abstractComponentCallbacksC0048q.f978s = i.f822t;
        abstractComponentCallbacksC0048q.f980u = i.f824v;
        B.j jVar = this.f851a;
        jVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0048q.f961Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = ((C0045n) it.next()).f935a;
            abstractComponentCallbacksC0048q3.f960P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0048q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0048q.f979t.b(abstractComponentCallbacksC0048q.f978s, abstractComponentCallbacksC0048q.e(), abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f963a = 0;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.r(abstractComponentCallbacksC0048q.f978s.f993f);
        if (!abstractComponentCallbacksC0048q.f948C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0048q.f977r.f815m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0048q.f979t;
        i2.f798E = false;
        i2.F = false;
        i2.f804L.f840g = false;
        i2.t(0);
        jVar.c(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (abstractComponentCallbacksC0048q.f977r == null) {
            return abstractComponentCallbacksC0048q.f963a;
        }
        int i = this.f854e;
        int ordinal = abstractComponentCallbacksC0048q.f956L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.f972m) {
            if (abstractComponentCallbacksC0048q.f973n) {
                i = Math.max(this.f854e, 2);
                View view = abstractComponentCallbacksC0048q.f950E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f854e < 4 ? Math.min(i, abstractComponentCallbacksC0048q.f963a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0048q.f970k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f949D;
        if (viewGroup != null) {
            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0048q);
            r6 = d != null ? d.f870b : 0;
            Iterator it = f2.f916c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f871c.equals(abstractComponentCallbacksC0048q) && !u2.f873f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f870b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0048q.f971l) {
            i = abstractComponentCallbacksC0048q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.F && abstractComponentCallbacksC0048q.f963a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0048q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f954J) {
            Bundle bundle = abstractComponentCallbacksC0048q.f964b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0048q.f979t.Q(parcelable);
                I i = abstractComponentCallbacksC0048q.f979t;
                i.f798E = false;
                i.F = false;
                i.f804L.f840g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0048q.f963a = 1;
            return;
        }
        B.j jVar = this.f851a;
        jVar.l(false);
        Bundle bundle2 = abstractComponentCallbacksC0048q.f964b;
        abstractComponentCallbacksC0048q.f979t.K();
        abstractComponentCallbacksC0048q.f963a = 1;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.f957M.a(new C0129a(1, abstractComponentCallbacksC0048q));
        abstractComponentCallbacksC0048q.f960P.b(bundle2);
        abstractComponentCallbacksC0048q.s(bundle2);
        abstractComponentCallbacksC0048q.f954J = true;
        if (abstractComponentCallbacksC0048q.f948C) {
            abstractComponentCallbacksC0048q.f957M.d(EnumC0068l.ON_CREATE);
            jVar.f(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (abstractComponentCallbacksC0048q.f972m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f964b);
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f949D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048q.f982w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0048q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048q.f977r.f823u.c0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048q.f974o) {
                        try {
                            str = abstractComponentCallbacksC0048q.C().getResources().getResourceName(abstractComponentCallbacksC0048q.f982w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048q.f982w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0048q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1022a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0048q, "Attempting to add fragment " + abstractComponentCallbacksC0048q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0048q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048q.f949D = viewGroup;
        abstractComponentCallbacksC0048q.B(w2, viewGroup, abstractComponentCallbacksC0048q.f964b);
        View view = abstractComponentCallbacksC0048q.f950E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048q.f950E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0048q.f984y) {
                abstractComponentCallbacksC0048q.f950E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048q.f950E;
            WeakHashMap weakHashMap = K.T.f381a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0048q.f950E);
            } else {
                View view3 = abstractComponentCallbacksC0048q.f950E;
                view3.addOnAttachStateChangeListener(new K0.o(1, view3));
            }
            abstractComponentCallbacksC0048q.f979t.t(2);
            this.f851a.r(false);
            int visibility = abstractComponentCallbacksC0048q.f950E.getVisibility();
            abstractComponentCallbacksC0048q.f().f943j = abstractComponentCallbacksC0048q.f950E.getAlpha();
            if (abstractComponentCallbacksC0048q.f949D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0048q.f950E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0048q.f().f944k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q);
                    }
                }
                abstractComponentCallbacksC0048q.f950E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0048q.f963a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0048q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0048q);
        }
        boolean z3 = abstractComponentCallbacksC0048q.f971l && !abstractComponentCallbacksC0048q.o();
        T.t tVar = this.f852b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) tVar.d;
            if (!((l2.f836b.containsKey(abstractComponentCallbacksC0048q.f966e) && l2.f838e) ? l2.f839f : true)) {
                String str = abstractComponentCallbacksC0048q.h;
                if (str != null && (d = tVar.d(str)) != null && d.f946A) {
                    abstractComponentCallbacksC0048q.f968g = d;
                }
                abstractComponentCallbacksC0048q.f963a = 0;
                return;
            }
        }
        C0051u c0051u = abstractComponentCallbacksC0048q.f978s;
        if (c0051u != null) {
            z2 = ((L) tVar.d).f839f;
        } else {
            z2 = c0051u.f993f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) tVar.d).c(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f979t.k();
        abstractComponentCallbacksC0048q.f957M.d(EnumC0068l.ON_DESTROY);
        abstractComponentCallbacksC0048q.f963a = 0;
        abstractComponentCallbacksC0048q.f954J = false;
        abstractComponentCallbacksC0048q.f948C = true;
        this.f851a.g(false);
        Iterator it = tVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0048q.f966e;
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f853c;
                if (str2.equals(abstractComponentCallbacksC0048q2.h)) {
                    abstractComponentCallbacksC0048q2.f968g = abstractComponentCallbacksC0048q;
                    abstractComponentCallbacksC0048q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0048q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0048q.f968g = tVar.d(str3);
        }
        tVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f949D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048q.f950E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048q.f979t.t(1);
        if (abstractComponentCallbacksC0048q.f950E != null && abstractComponentCallbacksC0048q.f958N.d().f1368c.compareTo(EnumC0069m.f1360c) >= 0) {
            abstractComponentCallbacksC0048q.f958N.e(EnumC0068l.ON_DESTROY);
        }
        abstractComponentCallbacksC0048q.f963a = 1;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.u();
        if (!abstractComponentCallbacksC0048q.f948C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0048q.c(), c0.a.f1513c).u(c0.a.class)).f1514b;
        if (lVar.f3332c > 0) {
            lVar.f3331b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0048q.f975p = false;
        this.f851a.s(false);
        abstractComponentCallbacksC0048q.f949D = null;
        abstractComponentCallbacksC0048q.f950E = null;
        abstractComponentCallbacksC0048q.f958N = null;
        abstractComponentCallbacksC0048q.f959O.d(null);
        abstractComponentCallbacksC0048q.f973n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f963a = -1;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.v();
        if (!abstractComponentCallbacksC0048q.f948C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0048q.f979t;
        if (!i.f799G) {
            i.k();
            abstractComponentCallbacksC0048q.f979t = new I();
        }
        this.f851a.h(false);
        abstractComponentCallbacksC0048q.f963a = -1;
        abstractComponentCallbacksC0048q.f978s = null;
        abstractComponentCallbacksC0048q.f980u = null;
        abstractComponentCallbacksC0048q.f977r = null;
        if (!abstractComponentCallbacksC0048q.f971l || abstractComponentCallbacksC0048q.o()) {
            L l2 = (L) this.f852b.d;
            boolean z2 = true;
            if (l2.f836b.containsKey(abstractComponentCallbacksC0048q.f966e) && l2.f838e) {
                z2 = l2.f839f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (abstractComponentCallbacksC0048q.f972m && abstractComponentCallbacksC0048q.f973n && !abstractComponentCallbacksC0048q.f975p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.B(abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f964b), null, abstractComponentCallbacksC0048q.f964b);
            View view = abstractComponentCallbacksC0048q.f950E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048q.f950E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f984y) {
                    abstractComponentCallbacksC0048q.f950E.setVisibility(8);
                }
                abstractComponentCallbacksC0048q.f979t.t(2);
                this.f851a.r(false);
                abstractComponentCallbacksC0048q.f963a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.t tVar = this.f852b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0048q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0048q.f963a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0048q.f971l && !abstractComponentCallbacksC0048q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0048q);
                        }
                        ((L) tVar.d).c(abstractComponentCallbacksC0048q);
                        tVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0048q);
                        }
                        abstractComponentCallbacksC0048q.l();
                    }
                    if (abstractComponentCallbacksC0048q.f953I) {
                        if (abstractComponentCallbacksC0048q.f950E != null && (viewGroup = abstractComponentCallbacksC0048q.f949D) != null) {
                            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
                            if (abstractComponentCallbacksC0048q.f984y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0048q.f977r;
                        if (i2 != null && abstractComponentCallbacksC0048q.f970k && I.F(abstractComponentCallbacksC0048q)) {
                            i2.f797D = true;
                        }
                        abstractComponentCallbacksC0048q.f953I = false;
                        abstractComponentCallbacksC0048q.f979t.n();
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
                            abstractComponentCallbacksC0048q.f963a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048q.f973n = false;
                            abstractComponentCallbacksC0048q.f963a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
                            }
                            if (abstractComponentCallbacksC0048q.f950E != null && abstractComponentCallbacksC0048q.f965c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0048q.f950E != null && (viewGroup2 = abstractComponentCallbacksC0048q.f949D) != null) {
                                C0040i f3 = C0040i.f(viewGroup2, abstractComponentCallbacksC0048q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0048q.f963a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0048q.f963a = 5;
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
                            if (abstractComponentCallbacksC0048q.f950E != null && (viewGroup3 = abstractComponentCallbacksC0048q.f949D) != null) {
                                C0040i f4 = C0040i.f(viewGroup3, abstractComponentCallbacksC0048q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0048q.f950E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0048q.f963a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0048q.f963a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f979t.t(5);
        if (abstractComponentCallbacksC0048q.f950E != null) {
            abstractComponentCallbacksC0048q.f958N.e(EnumC0068l.ON_PAUSE);
        }
        abstractComponentCallbacksC0048q.f957M.d(EnumC0068l.ON_PAUSE);
        abstractComponentCallbacksC0048q.f963a = 6;
        abstractComponentCallbacksC0048q.f948C = true;
        this.f851a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        Bundle bundle = abstractComponentCallbacksC0048q.f964b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048q.f965c = abstractComponentCallbacksC0048q.f964b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048q.d = abstractComponentCallbacksC0048q.f964b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0048q.f964b.getString("android:target_state");
        abstractComponentCallbacksC0048q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0048q.i = abstractComponentCallbacksC0048q.f964b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0048q.f964b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0048q.f951G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0048q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0048q);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q.f952H;
        View view = c0047p == null ? null : c0047p.f944k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0048q.f950E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0048q.f950E) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0048q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0048q.f950E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0048q.f().f944k = null;
        abstractComponentCallbacksC0048q.f979t.K();
        abstractComponentCallbacksC0048q.f979t.y(true);
        abstractComponentCallbacksC0048q.f963a = 7;
        abstractComponentCallbacksC0048q.f948C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f957M;
        EnumC0068l enumC0068l = EnumC0068l.ON_RESUME;
        tVar.d(enumC0068l);
        if (abstractComponentCallbacksC0048q.f950E != null) {
            abstractComponentCallbacksC0048q.f958N.f863c.d(enumC0068l);
        }
        I i = abstractComponentCallbacksC0048q.f979t;
        i.f798E = false;
        i.F = false;
        i.f804L.f840g = false;
        i.t(7);
        this.f851a.n(false);
        abstractComponentCallbacksC0048q.f964b = null;
        abstractComponentCallbacksC0048q.f965c = null;
        abstractComponentCallbacksC0048q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (abstractComponentCallbacksC0048q.f950E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0048q + " with view " + abstractComponentCallbacksC0048q.f950E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048q.f950E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048q.f965c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048q.f958N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f979t.K();
        abstractComponentCallbacksC0048q.f979t.y(true);
        abstractComponentCallbacksC0048q.f963a = 5;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.y();
        if (!abstractComponentCallbacksC0048q.f948C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f957M;
        EnumC0068l enumC0068l = EnumC0068l.ON_START;
        tVar.d(enumC0068l);
        if (abstractComponentCallbacksC0048q.f950E != null) {
            abstractComponentCallbacksC0048q.f958N.f863c.d(enumC0068l);
        }
        I i = abstractComponentCallbacksC0048q.f979t;
        i.f798E = false;
        i.F = false;
        i.f804L.f840g = false;
        i.t(5);
        this.f851a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f853c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0048q);
        }
        I i = abstractComponentCallbacksC0048q.f979t;
        i.F = true;
        i.f804L.f840g = true;
        i.t(4);
        if (abstractComponentCallbacksC0048q.f950E != null) {
            abstractComponentCallbacksC0048q.f958N.e(EnumC0068l.ON_STOP);
        }
        abstractComponentCallbacksC0048q.f957M.d(EnumC0068l.ON_STOP);
        abstractComponentCallbacksC0048q.f963a = 4;
        abstractComponentCallbacksC0048q.f948C = false;
        abstractComponentCallbacksC0048q.z();
        if (abstractComponentCallbacksC0048q.f948C) {
            this.f851a.q(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.t tVar, ClassLoader classLoader, C c2, N n2) {
        this.f851a = jVar;
        this.f852b = tVar;
        AbstractComponentCallbacksC0048q a2 = c2.a(n2.f841a);
        Bundle bundle = n2.f847j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f966e = n2.f842b;
        a2.f972m = n2.f843c;
        a2.f974o = true;
        a2.f981v = n2.d;
        a2.f982w = n2.f844e;
        a2.f983x = n2.f845f;
        a2.f946A = n2.f846g;
        a2.f971l = n2.h;
        a2.f985z = n2.i;
        a2.f984y = n2.f848k;
        a2.f956L = EnumC0069m.values()[n2.f849l];
        Bundle bundle2 = n2.f850m;
        if (bundle2 != null) {
            a2.f964b = bundle2;
        } else {
            a2.f964b = new Bundle();
        }
        this.f853c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.t tVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, N n2) {
        this.f851a = jVar;
        this.f852b = tVar;
        this.f853c = abstractComponentCallbacksC0048q;
        abstractComponentCallbacksC0048q.f965c = null;
        abstractComponentCallbacksC0048q.d = null;
        abstractComponentCallbacksC0048q.f976q = 0;
        abstractComponentCallbacksC0048q.f973n = false;
        abstractComponentCallbacksC0048q.f970k = false;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f968g;
        abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q2 != null ? abstractComponentCallbacksC0048q2.f966e : null;
        abstractComponentCallbacksC0048q.f968g = null;
        Bundle bundle = n2.f850m;
        if (bundle != null) {
            abstractComponentCallbacksC0048q.f964b = bundle;
        } else {
            abstractComponentCallbacksC0048q.f964b = new Bundle();
        }
    }
}
