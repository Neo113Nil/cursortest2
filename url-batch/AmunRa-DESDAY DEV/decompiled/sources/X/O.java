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
import androidx.lifecycle.EnumC0070l;
import androidx.lifecycle.EnumC0071m;
import c0.C0081a;
import com.visualfortune.eyerest.R;
import h0.C0135a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f899a;

    /* renamed from: b, reason: collision with root package name */
    public final T.u f900b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f901c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f902e = -1;

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f899a = jVar;
        this.f900b = uVar;
        this.f901c = abstractComponentCallbacksC0048q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
        }
        Bundle bundle = abstractComponentCallbacksC0048q.f1009b;
        abstractComponentCallbacksC0048q.f1024t.K();
        abstractComponentCallbacksC0048q.f1008a = 3;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.p();
        if (!abstractComponentCallbacksC0048q.f993C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0048q);
        }
        View view = abstractComponentCallbacksC0048q.f995E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0048q.f1009b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0048q.f1010c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0048q.f1010c = null;
            }
            if (abstractComponentCallbacksC0048q.f995E != null) {
                abstractComponentCallbacksC0048q.f1003N.d.b(abstractComponentCallbacksC0048q.d);
                abstractComponentCallbacksC0048q.d = null;
            }
            abstractComponentCallbacksC0048q.f993C = false;
            abstractComponentCallbacksC0048q.A(bundle2);
            if (!abstractComponentCallbacksC0048q.f993C) {
                throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0048q.f995E != null) {
                abstractComponentCallbacksC0048q.f1003N.e(EnumC0070l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0048q.f1009b = null;
        I i = abstractComponentCallbacksC0048q.f1024t;
        i.f846E = false;
        i.F = false;
        i.f852L.f888g = false;
        i.t(4);
        this.f899a.b(false);
    }

    public final void b() {
        View view;
        View view2;
        T.u uVar = this.f900b;
        uVar.getClass();
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f994D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f791a;
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
                        if (abstractComponentCallbacksC0048q2.f994D == viewGroup && (view = abstractComponentCallbacksC0048q2.f995E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0048q3.f994D == viewGroup && (view2 = abstractComponentCallbacksC0048q3.f995E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0048q.f994D.addView(abstractComponentCallbacksC0048q.f995E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1013g;
        O o2 = null;
        T.u uVar = this.f900b;
        if (abstractComponentCallbacksC0048q2 != null) {
            O o3 = (O) ((HashMap) uVar.f792b).get(abstractComponentCallbacksC0048q2.f1011e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.f1013g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q.f1013g.f1011e;
            abstractComponentCallbacksC0048q.f1013g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0048q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f792b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0048q.f1022r;
        abstractComponentCallbacksC0048q.f1023s = i.f870t;
        abstractComponentCallbacksC0048q.f1025u = i.f872v;
        B.j jVar = this.f899a;
        jVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0048q.f1006Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = ((C0045n) it.next()).f981a;
            abstractComponentCallbacksC0048q3.f1005P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0048q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0048q.f1024t.b(abstractComponentCallbacksC0048q.f1023s, abstractComponentCallbacksC0048q.e(), abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f1008a = 0;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.r(abstractComponentCallbacksC0048q.f1023s.i);
        if (!abstractComponentCallbacksC0048q.f993C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0048q.f1022r.f863m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0048q.f1024t;
        i2.f846E = false;
        i2.F = false;
        i2.f852L.f888g = false;
        i2.t(0);
        jVar.d(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (abstractComponentCallbacksC0048q.f1022r == null) {
            return abstractComponentCallbacksC0048q.f1008a;
        }
        int i = this.f902e;
        int ordinal = abstractComponentCallbacksC0048q.f1001L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.f1017m) {
            if (abstractComponentCallbacksC0048q.f1018n) {
                i = Math.max(this.f902e, 2);
                View view = abstractComponentCallbacksC0048q.f995E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f902e < 4 ? Math.min(i, abstractComponentCallbacksC0048q.f1008a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0048q.f1015k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f994D;
        if (viewGroup != null) {
            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0048q);
            r6 = d != null ? d.f918b : 0;
            Iterator it = f2.f964c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f919c.equals(abstractComponentCallbacksC0048q) && !u2.f921f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f918b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0048q.f1016l) {
            i = abstractComponentCallbacksC0048q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.F && abstractComponentCallbacksC0048q.f1008a < 5) {
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f999J) {
            Bundle bundle = abstractComponentCallbacksC0048q.f1009b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0048q.f1024t.Q(parcelable);
                I i = abstractComponentCallbacksC0048q.f1024t;
                i.f846E = false;
                i.F = false;
                i.f852L.f888g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0048q.f1008a = 1;
            return;
        }
        B.j jVar = this.f899a;
        jVar.l(false);
        Bundle bundle2 = abstractComponentCallbacksC0048q.f1009b;
        abstractComponentCallbacksC0048q.f1024t.K();
        abstractComponentCallbacksC0048q.f1008a = 1;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.f1002M.a(new C0135a(1, abstractComponentCallbacksC0048q));
        abstractComponentCallbacksC0048q.f1005P.b(bundle2);
        abstractComponentCallbacksC0048q.s(bundle2);
        abstractComponentCallbacksC0048q.f999J = true;
        if (abstractComponentCallbacksC0048q.f993C) {
            abstractComponentCallbacksC0048q.f1002M.d(EnumC0070l.ON_CREATE);
            jVar.e(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (abstractComponentCallbacksC0048q.f1017m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1009b);
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f994D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048q.f1027w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0048q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048q.f1022r.f871u.O(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048q.f1019o) {
                        try {
                            str = abstractComponentCallbacksC0048q.C().getResources().getResourceName(abstractComponentCallbacksC0048q.f1027w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048q.f1027w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0048q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1056a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0048q, "Attempting to add fragment " + abstractComponentCallbacksC0048q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0048q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048q.f994D = viewGroup;
        abstractComponentCallbacksC0048q.B(w2, viewGroup, abstractComponentCallbacksC0048q.f1009b);
        View view = abstractComponentCallbacksC0048q.f995E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048q.f995E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0048q.f1029y) {
                abstractComponentCallbacksC0048q.f995E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048q.f995E;
            WeakHashMap weakHashMap = K.S.f362a;
            if (view2.isAttachedToWindow()) {
                K.E.c(abstractComponentCallbacksC0048q.f995E);
            } else {
                View view3 = abstractComponentCallbacksC0048q.f995E;
                view3.addOnAttachStateChangeListener(new L0.o(1, view3));
            }
            abstractComponentCallbacksC0048q.f1024t.t(2);
            this.f899a.r(false);
            int visibility = abstractComponentCallbacksC0048q.f995E.getVisibility();
            abstractComponentCallbacksC0048q.f().f988j = abstractComponentCallbacksC0048q.f995E.getAlpha();
            if (abstractComponentCallbacksC0048q.f994D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0048q.f995E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0048q.f().f989k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q);
                    }
                }
                abstractComponentCallbacksC0048q.f995E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0048q.f1008a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0048q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0048q);
        }
        boolean z3 = abstractComponentCallbacksC0048q.f1016l && !abstractComponentCallbacksC0048q.o();
        T.u uVar = this.f900b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f884b.containsKey(abstractComponentCallbacksC0048q.f1011e) && l2.f886e) ? l2.f887f : true)) {
                String str = abstractComponentCallbacksC0048q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f991A) {
                    abstractComponentCallbacksC0048q.f1013g = d;
                }
                abstractComponentCallbacksC0048q.f1008a = 0;
                return;
            }
        }
        C0051u c0051u = abstractComponentCallbacksC0048q.f1023s;
        if (c0051u != null) {
            z2 = ((L) uVar.d).f887f;
        } else {
            z2 = c0051u.i != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1024t.k();
        abstractComponentCallbacksC0048q.f1002M.d(EnumC0070l.ON_DESTROY);
        abstractComponentCallbacksC0048q.f1008a = 0;
        abstractComponentCallbacksC0048q.f999J = false;
        abstractComponentCallbacksC0048q.f993C = true;
        this.f899a.f(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0048q.f1011e;
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f901c;
                if (str2.equals(abstractComponentCallbacksC0048q2.h)) {
                    abstractComponentCallbacksC0048q2.f1013g = abstractComponentCallbacksC0048q;
                    abstractComponentCallbacksC0048q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0048q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0048q.f1013g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f994D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048q.f995E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048q.f1024t.t(1);
        if (abstractComponentCallbacksC0048q.f995E != null && abstractComponentCallbacksC0048q.f1003N.d().f1406c.compareTo(EnumC0071m.f1398c) >= 0) {
            abstractComponentCallbacksC0048q.f1003N.e(EnumC0070l.ON_DESTROY);
        }
        abstractComponentCallbacksC0048q.f1008a = 1;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.u();
        if (!abstractComponentCallbacksC0048q.f993C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0081a) new C.g(abstractComponentCallbacksC0048q.c(), C0081a.f1548c).w(C0081a.class)).f1549b;
        if (lVar.f3336c > 0) {
            lVar.f3335b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0048q.f1020p = false;
        this.f899a.s(false);
        abstractComponentCallbacksC0048q.f994D = null;
        abstractComponentCallbacksC0048q.f995E = null;
        abstractComponentCallbacksC0048q.f1003N = null;
        abstractComponentCallbacksC0048q.f1004O.d(null);
        abstractComponentCallbacksC0048q.f1018n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1008a = -1;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.v();
        if (!abstractComponentCallbacksC0048q.f993C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0048q.f1024t;
        if (!i.f847G) {
            i.k();
            abstractComponentCallbacksC0048q.f1024t = new I();
        }
        this.f899a.h(false);
        abstractComponentCallbacksC0048q.f1008a = -1;
        abstractComponentCallbacksC0048q.f1023s = null;
        abstractComponentCallbacksC0048q.f1025u = null;
        abstractComponentCallbacksC0048q.f1022r = null;
        if (!abstractComponentCallbacksC0048q.f1016l || abstractComponentCallbacksC0048q.o()) {
            L l2 = (L) this.f900b.d;
            boolean z2 = true;
            if (l2.f884b.containsKey(abstractComponentCallbacksC0048q.f1011e) && l2.f886e) {
                z2 = l2.f887f;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (abstractComponentCallbacksC0048q.f1017m && abstractComponentCallbacksC0048q.f1018n && !abstractComponentCallbacksC0048q.f1020p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.B(abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1009b), null, abstractComponentCallbacksC0048q.f1009b);
            View view = abstractComponentCallbacksC0048q.f995E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048q.f995E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f1029y) {
                    abstractComponentCallbacksC0048q.f995E.setVisibility(8);
                }
                abstractComponentCallbacksC0048q.f1024t.t(2);
                this.f899a.r(false);
                abstractComponentCallbacksC0048q.f1008a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.u uVar = this.f900b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
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
                int i = abstractComponentCallbacksC0048q.f1008a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0048q.f1016l && !abstractComponentCallbacksC0048q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0048q);
                        }
                        ((L) uVar.d).c(abstractComponentCallbacksC0048q);
                        uVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0048q);
                        }
                        abstractComponentCallbacksC0048q.l();
                    }
                    if (abstractComponentCallbacksC0048q.f998I) {
                        if (abstractComponentCallbacksC0048q.f995E != null && (viewGroup = abstractComponentCallbacksC0048q.f994D) != null) {
                            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
                            if (abstractComponentCallbacksC0048q.f1029y) {
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
                        I i2 = abstractComponentCallbacksC0048q.f1022r;
                        if (i2 != null && abstractComponentCallbacksC0048q.f1015k && I.F(abstractComponentCallbacksC0048q)) {
                            i2.f845D = true;
                        }
                        abstractComponentCallbacksC0048q.f998I = false;
                        abstractComponentCallbacksC0048q.f1024t.n();
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
                            abstractComponentCallbacksC0048q.f1008a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048q.f1018n = false;
                            abstractComponentCallbacksC0048q.f1008a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
                            }
                            if (abstractComponentCallbacksC0048q.f995E != null && abstractComponentCallbacksC0048q.f1010c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0048q.f995E != null && (viewGroup2 = abstractComponentCallbacksC0048q.f994D) != null) {
                                C0040i f3 = C0040i.f(viewGroup2, abstractComponentCallbacksC0048q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0048q.f1008a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0048q.f1008a = 5;
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
                            if (abstractComponentCallbacksC0048q.f995E != null && (viewGroup3 = abstractComponentCallbacksC0048q.f994D) != null) {
                                C0040i f4 = C0040i.f(viewGroup3, abstractComponentCallbacksC0048q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0048q.f995E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0048q.f1008a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0048q.f1008a = 6;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1024t.t(5);
        if (abstractComponentCallbacksC0048q.f995E != null) {
            abstractComponentCallbacksC0048q.f1003N.e(EnumC0070l.ON_PAUSE);
        }
        abstractComponentCallbacksC0048q.f1002M.d(EnumC0070l.ON_PAUSE);
        abstractComponentCallbacksC0048q.f1008a = 6;
        abstractComponentCallbacksC0048q.f993C = true;
        this.f899a.i(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        Bundle bundle = abstractComponentCallbacksC0048q.f1009b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048q.f1010c = abstractComponentCallbacksC0048q.f1009b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048q.d = abstractComponentCallbacksC0048q.f1009b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0048q.f1009b.getString("android:target_state");
        abstractComponentCallbacksC0048q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0048q.i = abstractComponentCallbacksC0048q.f1009b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0048q.f1009b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0048q.f996G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0048q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0048q);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q.f997H;
        View view = c0047p == null ? null : c0047p.f989k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0048q.f995E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0048q.f995E) {
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
                sb.append(abstractComponentCallbacksC0048q.f995E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0048q.f().f989k = null;
        abstractComponentCallbacksC0048q.f1024t.K();
        abstractComponentCallbacksC0048q.f1024t.y(true);
        abstractComponentCallbacksC0048q.f1008a = 7;
        abstractComponentCallbacksC0048q.f993C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f1002M;
        EnumC0070l enumC0070l = EnumC0070l.ON_RESUME;
        tVar.d(enumC0070l);
        if (abstractComponentCallbacksC0048q.f995E != null) {
            abstractComponentCallbacksC0048q.f1003N.f911c.d(enumC0070l);
        }
        I i = abstractComponentCallbacksC0048q.f1024t;
        i.f846E = false;
        i.F = false;
        i.f852L.f888g = false;
        i.t(7);
        this.f899a.m(false);
        abstractComponentCallbacksC0048q.f1009b = null;
        abstractComponentCallbacksC0048q.f1010c = null;
        abstractComponentCallbacksC0048q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (abstractComponentCallbacksC0048q.f995E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0048q + " with view " + abstractComponentCallbacksC0048q.f995E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048q.f995E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048q.f1010c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048q.f1003N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1024t.K();
        abstractComponentCallbacksC0048q.f1024t.y(true);
        abstractComponentCallbacksC0048q.f1008a = 5;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.y();
        if (!abstractComponentCallbacksC0048q.f993C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f1002M;
        EnumC0070l enumC0070l = EnumC0070l.ON_START;
        tVar.d(enumC0070l);
        if (abstractComponentCallbacksC0048q.f995E != null) {
            abstractComponentCallbacksC0048q.f1003N.f911c.d(enumC0070l);
        }
        I i = abstractComponentCallbacksC0048q.f1024t;
        i.f846E = false;
        i.F = false;
        i.f852L.f888g = false;
        i.t(5);
        this.f899a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f901c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0048q);
        }
        I i = abstractComponentCallbacksC0048q.f1024t;
        i.F = true;
        i.f852L.f888g = true;
        i.t(4);
        if (abstractComponentCallbacksC0048q.f995E != null) {
            abstractComponentCallbacksC0048q.f1003N.e(EnumC0070l.ON_STOP);
        }
        abstractComponentCallbacksC0048q.f1002M.d(EnumC0070l.ON_STOP);
        abstractComponentCallbacksC0048q.f1008a = 4;
        abstractComponentCallbacksC0048q.f993C = false;
        abstractComponentCallbacksC0048q.z();
        if (abstractComponentCallbacksC0048q.f993C) {
            this.f899a.q(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f899a = jVar;
        this.f900b = uVar;
        AbstractComponentCallbacksC0048q a2 = c2.a(n2.f889a);
        Bundle bundle = n2.f895j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1011e = n2.f890b;
        a2.f1017m = n2.f891c;
        a2.f1019o = true;
        a2.f1026v = n2.d;
        a2.f1027w = n2.f892e;
        a2.f1028x = n2.f893f;
        a2.f991A = n2.f894g;
        a2.f1016l = n2.h;
        a2.f1030z = n2.i;
        a2.f1029y = n2.f896k;
        a2.f1001L = EnumC0071m.values()[n2.f897l];
        Bundle bundle2 = n2.f898m;
        if (bundle2 != null) {
            a2.f1009b = bundle2;
        } else {
            a2.f1009b = new Bundle();
        }
        this.f901c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, N n2) {
        this.f899a = jVar;
        this.f900b = uVar;
        this.f901c = abstractComponentCallbacksC0048q;
        abstractComponentCallbacksC0048q.f1010c = null;
        abstractComponentCallbacksC0048q.d = null;
        abstractComponentCallbacksC0048q.f1021q = 0;
        abstractComponentCallbacksC0048q.f1018n = false;
        abstractComponentCallbacksC0048q.f1015k = false;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1013g;
        abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q2 != null ? abstractComponentCallbacksC0048q2.f1011e : null;
        abstractComponentCallbacksC0048q.f1013g = null;
        Bundle bundle = n2.f898m;
        if (bundle != null) {
            abstractComponentCallbacksC0048q.f1009b = bundle;
        } else {
            abstractComponentCallbacksC0048q.f1009b = new Bundle();
        }
    }
}
