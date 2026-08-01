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
import com.lasercut.dash.R;
import h0.C0129a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f857a;

    /* renamed from: b, reason: collision with root package name */
    public final T.t f858b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f859c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f860e = -1;

    public O(B.j jVar, T.t tVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f857a = jVar;
        this.f858b = tVar;
        this.f859c = abstractComponentCallbacksC0048q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
        }
        Bundle bundle = abstractComponentCallbacksC0048q.f970b;
        abstractComponentCallbacksC0048q.f985t.K();
        abstractComponentCallbacksC0048q.f969a = 3;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.p();
        if (!abstractComponentCallbacksC0048q.f954C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0048q);
        }
        View view = abstractComponentCallbacksC0048q.f956E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0048q.f970b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0048q.f971c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0048q.f971c = null;
            }
            if (abstractComponentCallbacksC0048q.f956E != null) {
                abstractComponentCallbacksC0048q.f964N.d.b(abstractComponentCallbacksC0048q.d);
                abstractComponentCallbacksC0048q.d = null;
            }
            abstractComponentCallbacksC0048q.f954C = false;
            abstractComponentCallbacksC0048q.A(bundle2);
            if (!abstractComponentCallbacksC0048q.f954C) {
                throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0048q.f956E != null) {
                abstractComponentCallbacksC0048q.f964N.e(EnumC0068l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0048q.f970b = null;
        I i = abstractComponentCallbacksC0048q.f985t;
        i.f804E = false;
        i.F = false;
        i.f810L.f846g = false;
        i.t(4);
        this.f857a.b(false);
    }

    public final void b() {
        View view;
        View view2;
        T.t tVar = this.f858b;
        tVar.getClass();
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f955D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) tVar.f748a;
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
                        if (abstractComponentCallbacksC0048q2.f955D == viewGroup && (view = abstractComponentCallbacksC0048q2.f956E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0048q3.f955D == viewGroup && (view2 = abstractComponentCallbacksC0048q3.f956E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0048q.f955D.addView(abstractComponentCallbacksC0048q.f956E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f974g;
        O o2 = null;
        T.t tVar = this.f858b;
        if (abstractComponentCallbacksC0048q2 != null) {
            O o3 = (O) ((HashMap) tVar.f749b).get(abstractComponentCallbacksC0048q2.f972e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.f974g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q.f974g.f972e;
            abstractComponentCallbacksC0048q.f974g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0048q.h;
            if (str != null && (o2 = (O) ((HashMap) tVar.f749b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0048q.f983r;
        abstractComponentCallbacksC0048q.f984s = i.f828t;
        abstractComponentCallbacksC0048q.f986u = i.f830v;
        B.j jVar = this.f857a;
        jVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0048q.f967Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = ((C0045n) it.next()).f941a;
            abstractComponentCallbacksC0048q3.f966P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0048q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0048q.f985t.b(abstractComponentCallbacksC0048q.f984s, abstractComponentCallbacksC0048q.e(), abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f969a = 0;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.r(abstractComponentCallbacksC0048q.f984s.f999f);
        if (!abstractComponentCallbacksC0048q.f954C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0048q.f983r.f821m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0048q.f985t;
        i2.f804E = false;
        i2.F = false;
        i2.f810L.f846g = false;
        i2.t(0);
        jVar.c(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (abstractComponentCallbacksC0048q.f983r == null) {
            return abstractComponentCallbacksC0048q.f969a;
        }
        int i = this.f860e;
        int ordinal = abstractComponentCallbacksC0048q.f962L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.f978m) {
            if (abstractComponentCallbacksC0048q.f979n) {
                i = Math.max(this.f860e, 2);
                View view = abstractComponentCallbacksC0048q.f956E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f860e < 4 ? Math.min(i, abstractComponentCallbacksC0048q.f969a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0048q.f976k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f955D;
        if (viewGroup != null) {
            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0048q);
            r6 = d != null ? d.f876b : 0;
            Iterator it = f2.f922c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f877c.equals(abstractComponentCallbacksC0048q) && !u2.f879f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f876b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0048q.f977l) {
            i = abstractComponentCallbacksC0048q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.F && abstractComponentCallbacksC0048q.f969a < 5) {
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f960J) {
            Bundle bundle = abstractComponentCallbacksC0048q.f970b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0048q.f985t.Q(parcelable);
                I i = abstractComponentCallbacksC0048q.f985t;
                i.f804E = false;
                i.F = false;
                i.f810L.f846g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0048q.f969a = 1;
            return;
        }
        B.j jVar = this.f857a;
        jVar.l(false);
        Bundle bundle2 = abstractComponentCallbacksC0048q.f970b;
        abstractComponentCallbacksC0048q.f985t.K();
        abstractComponentCallbacksC0048q.f969a = 1;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.f963M.a(new C0129a(1, abstractComponentCallbacksC0048q));
        abstractComponentCallbacksC0048q.f966P.b(bundle2);
        abstractComponentCallbacksC0048q.s(bundle2);
        abstractComponentCallbacksC0048q.f960J = true;
        if (abstractComponentCallbacksC0048q.f954C) {
            abstractComponentCallbacksC0048q.f963M.d(EnumC0068l.ON_CREATE);
            jVar.f(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (abstractComponentCallbacksC0048q.f978m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f970b);
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f955D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048q.f988w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0048q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048q.f983r.f829u.d0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048q.f980o) {
                        try {
                            str = abstractComponentCallbacksC0048q.C().getResources().getResourceName(abstractComponentCallbacksC0048q.f988w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048q.f988w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0048q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1025a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0048q, "Attempting to add fragment " + abstractComponentCallbacksC0048q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0048q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048q.f955D = viewGroup;
        abstractComponentCallbacksC0048q.B(w2, viewGroup, abstractComponentCallbacksC0048q.f970b);
        View view = abstractComponentCallbacksC0048q.f956E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048q.f956E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0048q.f990y) {
                abstractComponentCallbacksC0048q.f956E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048q.f956E;
            WeakHashMap weakHashMap = K.T.f381a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0048q.f956E);
            } else {
                View view3 = abstractComponentCallbacksC0048q.f956E;
                view3.addOnAttachStateChangeListener(new K0.o(1, view3));
            }
            abstractComponentCallbacksC0048q.f985t.t(2);
            this.f857a.r(false);
            int visibility = abstractComponentCallbacksC0048q.f956E.getVisibility();
            abstractComponentCallbacksC0048q.f().f949j = abstractComponentCallbacksC0048q.f956E.getAlpha();
            if (abstractComponentCallbacksC0048q.f955D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0048q.f956E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0048q.f().f950k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q);
                    }
                }
                abstractComponentCallbacksC0048q.f956E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0048q.f969a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0048q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0048q);
        }
        boolean z3 = abstractComponentCallbacksC0048q.f977l && !abstractComponentCallbacksC0048q.o();
        T.t tVar = this.f858b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) tVar.d;
            if (!((l2.f842b.containsKey(abstractComponentCallbacksC0048q.f972e) && l2.f844e) ? l2.f845f : true)) {
                String str = abstractComponentCallbacksC0048q.h;
                if (str != null && (d = tVar.d(str)) != null && d.f952A) {
                    abstractComponentCallbacksC0048q.f974g = d;
                }
                abstractComponentCallbacksC0048q.f969a = 0;
                return;
            }
        }
        C0051u c0051u = abstractComponentCallbacksC0048q.f984s;
        if (c0051u != null) {
            z2 = ((L) tVar.d).f845f;
        } else {
            z2 = c0051u.f999f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) tVar.d).c(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f985t.k();
        abstractComponentCallbacksC0048q.f963M.d(EnumC0068l.ON_DESTROY);
        abstractComponentCallbacksC0048q.f969a = 0;
        abstractComponentCallbacksC0048q.f960J = false;
        abstractComponentCallbacksC0048q.f954C = true;
        this.f857a.g(false);
        Iterator it = tVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0048q.f972e;
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f859c;
                if (str2.equals(abstractComponentCallbacksC0048q2.h)) {
                    abstractComponentCallbacksC0048q2.f974g = abstractComponentCallbacksC0048q;
                    abstractComponentCallbacksC0048q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0048q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0048q.f974g = tVar.d(str3);
        }
        tVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f955D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048q.f956E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048q.f985t.t(1);
        if (abstractComponentCallbacksC0048q.f956E != null && abstractComponentCallbacksC0048q.f964N.d().f1371c.compareTo(EnumC0069m.f1363c) >= 0) {
            abstractComponentCallbacksC0048q.f964N.e(EnumC0068l.ON_DESTROY);
        }
        abstractComponentCallbacksC0048q.f969a = 1;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.u();
        if (!abstractComponentCallbacksC0048q.f954C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((c0.a) new B0.d(abstractComponentCallbacksC0048q.c(), c0.a.f1516c).u(c0.a.class)).f1517b;
        if (lVar.f3353c > 0) {
            lVar.f3352b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0048q.f981p = false;
        this.f857a.s(false);
        abstractComponentCallbacksC0048q.f955D = null;
        abstractComponentCallbacksC0048q.f956E = null;
        abstractComponentCallbacksC0048q.f964N = null;
        abstractComponentCallbacksC0048q.f965O.d(null);
        abstractComponentCallbacksC0048q.f979n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f969a = -1;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.v();
        if (!abstractComponentCallbacksC0048q.f954C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0048q.f985t;
        if (!i.f805G) {
            i.k();
            abstractComponentCallbacksC0048q.f985t = new I();
        }
        this.f857a.h(false);
        abstractComponentCallbacksC0048q.f969a = -1;
        abstractComponentCallbacksC0048q.f984s = null;
        abstractComponentCallbacksC0048q.f986u = null;
        abstractComponentCallbacksC0048q.f983r = null;
        if (!abstractComponentCallbacksC0048q.f977l || abstractComponentCallbacksC0048q.o()) {
            L l2 = (L) this.f858b.d;
            boolean z2 = true;
            if (l2.f842b.containsKey(abstractComponentCallbacksC0048q.f972e) && l2.f844e) {
                z2 = l2.f845f;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (abstractComponentCallbacksC0048q.f978m && abstractComponentCallbacksC0048q.f979n && !abstractComponentCallbacksC0048q.f981p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.B(abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f970b), null, abstractComponentCallbacksC0048q.f970b);
            View view = abstractComponentCallbacksC0048q.f956E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048q.f956E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f990y) {
                    abstractComponentCallbacksC0048q.f956E.setVisibility(8);
                }
                abstractComponentCallbacksC0048q.f985t.t(2);
                this.f857a.r(false);
                abstractComponentCallbacksC0048q.f969a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.t tVar = this.f858b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
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
                int i = abstractComponentCallbacksC0048q.f969a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0048q.f977l && !abstractComponentCallbacksC0048q.o()) {
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
                    if (abstractComponentCallbacksC0048q.f959I) {
                        if (abstractComponentCallbacksC0048q.f956E != null && (viewGroup = abstractComponentCallbacksC0048q.f955D) != null) {
                            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
                            if (abstractComponentCallbacksC0048q.f990y) {
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
                        I i2 = abstractComponentCallbacksC0048q.f983r;
                        if (i2 != null && abstractComponentCallbacksC0048q.f976k && I.F(abstractComponentCallbacksC0048q)) {
                            i2.f803D = true;
                        }
                        abstractComponentCallbacksC0048q.f959I = false;
                        abstractComponentCallbacksC0048q.f985t.n();
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
                            abstractComponentCallbacksC0048q.f969a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048q.f979n = false;
                            abstractComponentCallbacksC0048q.f969a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
                            }
                            if (abstractComponentCallbacksC0048q.f956E != null && abstractComponentCallbacksC0048q.f971c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0048q.f956E != null && (viewGroup2 = abstractComponentCallbacksC0048q.f955D) != null) {
                                C0040i f3 = C0040i.f(viewGroup2, abstractComponentCallbacksC0048q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0048q.f969a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0048q.f969a = 5;
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
                            if (abstractComponentCallbacksC0048q.f956E != null && (viewGroup3 = abstractComponentCallbacksC0048q.f955D) != null) {
                                C0040i f4 = C0040i.f(viewGroup3, abstractComponentCallbacksC0048q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0048q.f956E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0048q.f969a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0048q.f969a = 6;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f985t.t(5);
        if (abstractComponentCallbacksC0048q.f956E != null) {
            abstractComponentCallbacksC0048q.f964N.e(EnumC0068l.ON_PAUSE);
        }
        abstractComponentCallbacksC0048q.f963M.d(EnumC0068l.ON_PAUSE);
        abstractComponentCallbacksC0048q.f969a = 6;
        abstractComponentCallbacksC0048q.f954C = true;
        this.f857a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        Bundle bundle = abstractComponentCallbacksC0048q.f970b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048q.f971c = abstractComponentCallbacksC0048q.f970b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048q.d = abstractComponentCallbacksC0048q.f970b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0048q.f970b.getString("android:target_state");
        abstractComponentCallbacksC0048q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0048q.i = abstractComponentCallbacksC0048q.f970b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0048q.f970b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0048q.f957G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0048q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0048q);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q.f958H;
        View view = c0047p == null ? null : c0047p.f950k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0048q.f956E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0048q.f956E) {
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
                sb.append(abstractComponentCallbacksC0048q.f956E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0048q.f().f950k = null;
        abstractComponentCallbacksC0048q.f985t.K();
        abstractComponentCallbacksC0048q.f985t.y(true);
        abstractComponentCallbacksC0048q.f969a = 7;
        abstractComponentCallbacksC0048q.f954C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f963M;
        EnumC0068l enumC0068l = EnumC0068l.ON_RESUME;
        tVar.d(enumC0068l);
        if (abstractComponentCallbacksC0048q.f956E != null) {
            abstractComponentCallbacksC0048q.f964N.f869c.d(enumC0068l);
        }
        I i = abstractComponentCallbacksC0048q.f985t;
        i.f804E = false;
        i.F = false;
        i.f810L.f846g = false;
        i.t(7);
        this.f857a.n(false);
        abstractComponentCallbacksC0048q.f970b = null;
        abstractComponentCallbacksC0048q.f971c = null;
        abstractComponentCallbacksC0048q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (abstractComponentCallbacksC0048q.f956E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0048q + " with view " + abstractComponentCallbacksC0048q.f956E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048q.f956E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048q.f971c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048q.f964N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f985t.K();
        abstractComponentCallbacksC0048q.f985t.y(true);
        abstractComponentCallbacksC0048q.f969a = 5;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.y();
        if (!abstractComponentCallbacksC0048q.f954C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f963M;
        EnumC0068l enumC0068l = EnumC0068l.ON_START;
        tVar.d(enumC0068l);
        if (abstractComponentCallbacksC0048q.f956E != null) {
            abstractComponentCallbacksC0048q.f964N.f869c.d(enumC0068l);
        }
        I i = abstractComponentCallbacksC0048q.f985t;
        i.f804E = false;
        i.F = false;
        i.f810L.f846g = false;
        i.t(5);
        this.f857a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f859c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0048q);
        }
        I i = abstractComponentCallbacksC0048q.f985t;
        i.F = true;
        i.f810L.f846g = true;
        i.t(4);
        if (abstractComponentCallbacksC0048q.f956E != null) {
            abstractComponentCallbacksC0048q.f964N.e(EnumC0068l.ON_STOP);
        }
        abstractComponentCallbacksC0048q.f963M.d(EnumC0068l.ON_STOP);
        abstractComponentCallbacksC0048q.f969a = 4;
        abstractComponentCallbacksC0048q.f954C = false;
        abstractComponentCallbacksC0048q.z();
        if (abstractComponentCallbacksC0048q.f954C) {
            this.f857a.q(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.t tVar, ClassLoader classLoader, C c2, N n2) {
        this.f857a = jVar;
        this.f858b = tVar;
        AbstractComponentCallbacksC0048q a2 = c2.a(n2.f847a);
        Bundle bundle = n2.f853j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f972e = n2.f848b;
        a2.f978m = n2.f849c;
        a2.f980o = true;
        a2.f987v = n2.d;
        a2.f988w = n2.f850e;
        a2.f989x = n2.f851f;
        a2.f952A = n2.f852g;
        a2.f977l = n2.h;
        a2.f991z = n2.i;
        a2.f990y = n2.f854k;
        a2.f962L = EnumC0069m.values()[n2.f855l];
        Bundle bundle2 = n2.f856m;
        if (bundle2 != null) {
            a2.f970b = bundle2;
        } else {
            a2.f970b = new Bundle();
        }
        this.f859c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.t tVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, N n2) {
        this.f857a = jVar;
        this.f858b = tVar;
        this.f859c = abstractComponentCallbacksC0048q;
        abstractComponentCallbacksC0048q.f971c = null;
        abstractComponentCallbacksC0048q.d = null;
        abstractComponentCallbacksC0048q.f982q = 0;
        abstractComponentCallbacksC0048q.f979n = false;
        abstractComponentCallbacksC0048q.f976k = false;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f974g;
        abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q2 != null ? abstractComponentCallbacksC0048q2.f972e : null;
        abstractComponentCallbacksC0048q.f974g = null;
        Bundle bundle = n2.f856m;
        if (bundle != null) {
            abstractComponentCallbacksC0048q.f970b = bundle;
        } else {
            abstractComponentCallbacksC0048q.f970b = new Bundle();
        }
    }
}
