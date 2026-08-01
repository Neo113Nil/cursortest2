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
import androidx.lifecycle.EnumC0071l;
import androidx.lifecycle.EnumC0072m;
import com.glasspulse.glasspulse.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f942a;

    /* renamed from: b, reason: collision with root package name */
    public final T.u f943b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f944c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f945e = -1;

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f942a = jVar;
        this.f943b = uVar;
        this.f944c = abstractComponentCallbacksC0047q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0047q);
        }
        Bundle bundle = abstractComponentCallbacksC0047q.f1055b;
        abstractComponentCallbacksC0047q.f1070t.K();
        abstractComponentCallbacksC0047q.f1054a = 3;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.p();
        if (!abstractComponentCallbacksC0047q.f1039C) {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0047q);
        }
        View view = abstractComponentCallbacksC0047q.f1041E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0047q.f1055b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0047q.f1056c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0047q.f1056c = null;
            }
            if (abstractComponentCallbacksC0047q.f1041E != null) {
                abstractComponentCallbacksC0047q.f1049N.d.b(abstractComponentCallbacksC0047q.d);
                abstractComponentCallbacksC0047q.d = null;
            }
            abstractComponentCallbacksC0047q.f1039C = false;
            abstractComponentCallbacksC0047q.A(bundle2);
            if (!abstractComponentCallbacksC0047q.f1039C) {
                throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0047q.f1041E != null) {
                abstractComponentCallbacksC0047q.f1049N.e(EnumC0071l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0047q.f1055b = null;
        I i = abstractComponentCallbacksC0047q.f1070t;
        i.f889E = false;
        i.F = false;
        i.f895L.f931g = false;
        i.t(4);
        this.f942a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        T.u uVar = this.f943b;
        uVar.getClass();
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1040D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f816a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0047q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = (AbstractComponentCallbacksC0047q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0047q2.f1040D == viewGroup && (view = abstractComponentCallbacksC0047q2.f1041E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0047q3.f1040D == viewGroup && (view2 = abstractComponentCallbacksC0047q3.f1041E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0047q.f1040D.addView(abstractComponentCallbacksC0047q.f1041E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0047q);
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = abstractComponentCallbacksC0047q.f1059g;
        O o2 = null;
        T.u uVar = this.f943b;
        if (abstractComponentCallbacksC0047q2 != null) {
            O o3 = (O) ((HashMap) uVar.f817b).get(abstractComponentCallbacksC0047q2.f1057e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " declared target fragment " + abstractComponentCallbacksC0047q.f1059g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0047q.h = abstractComponentCallbacksC0047q.f1059g.f1057e;
            abstractComponentCallbacksC0047q.f1059g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0047q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f817b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " declared target fragment " + abstractComponentCallbacksC0047q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0047q.f1068r;
        abstractComponentCallbacksC0047q.f1069s = i.f913t;
        abstractComponentCallbacksC0047q.f1071u = i.f915v;
        B.j jVar = this.f942a;
        jVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0047q.f1052Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = ((C0044n) it.next()).f1026a;
            abstractComponentCallbacksC0047q3.f1051P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0047q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0047q.f1070t.b(abstractComponentCallbacksC0047q.f1069s, abstractComponentCallbacksC0047q.e(), abstractComponentCallbacksC0047q);
        abstractComponentCallbacksC0047q.f1054a = 0;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.r(abstractComponentCallbacksC0047q.f1069s.f1084f);
        if (!abstractComponentCallbacksC0047q.f1039C) {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0047q.f1068r.f906m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0047q.f1070t;
        i2.f889E = false;
        i2.F = false;
        i2.f895L.f931g = false;
        i2.t(0);
        jVar.d(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (abstractComponentCallbacksC0047q.f1068r == null) {
            return abstractComponentCallbacksC0047q.f1054a;
        }
        int i = this.f945e;
        int ordinal = abstractComponentCallbacksC0047q.f1047L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0047q.f1063m) {
            if (abstractComponentCallbacksC0047q.f1064n) {
                i = Math.max(this.f945e, 2);
                View view = abstractComponentCallbacksC0047q.f1041E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f945e < 4 ? Math.min(i, abstractComponentCallbacksC0047q.f1054a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0047q.f1061k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1040D;
        if (viewGroup != null) {
            C0039i f2 = C0039i.f(viewGroup, abstractComponentCallbacksC0047q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0047q);
            r6 = d != null ? d.f961b : 0;
            Iterator it = f2.f1007c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f962c.equals(abstractComponentCallbacksC0047q) && !u2.f964f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f961b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0047q.f1062l) {
            i = abstractComponentCallbacksC0047q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0047q.F && abstractComponentCallbacksC0047q.f1054a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0047q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1045J) {
            Bundle bundle = abstractComponentCallbacksC0047q.f1055b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0047q.f1070t.Q(parcelable);
                I i = abstractComponentCallbacksC0047q.f1070t;
                i.f889E = false;
                i.F = false;
                i.f895L.f931g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0047q.f1054a = 1;
            return;
        }
        B.j jVar = this.f942a;
        jVar.k(false);
        Bundle bundle2 = abstractComponentCallbacksC0047q.f1055b;
        abstractComponentCallbacksC0047q.f1070t.K();
        abstractComponentCallbacksC0047q.f1054a = 1;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.f1048M.a(new h0.a(1, abstractComponentCallbacksC0047q));
        abstractComponentCallbacksC0047q.f1051P.b(bundle2);
        abstractComponentCallbacksC0047q.s(bundle2);
        abstractComponentCallbacksC0047q.f1045J = true;
        if (abstractComponentCallbacksC0047q.f1039C) {
            abstractComponentCallbacksC0047q.f1048M.d(EnumC0071l.ON_CREATE);
            jVar.e(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (abstractComponentCallbacksC0047q.f1063m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0047q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0047q.w(abstractComponentCallbacksC0047q.f1055b);
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1040D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0047q.f1073w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0047q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0047q.f1068r.f914u.V(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0047q.f1065o) {
                        try {
                            str = abstractComponentCallbacksC0047q.C().getResources().getResourceName(abstractComponentCallbacksC0047q.f1073w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0047q.f1073w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0047q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1103a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0047q, "Attempting to add fragment " + abstractComponentCallbacksC0047q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0047q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0047q.f1040D = viewGroup;
        abstractComponentCallbacksC0047q.B(w2, viewGroup, abstractComponentCallbacksC0047q.f1055b);
        View view = abstractComponentCallbacksC0047q.f1041E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0047q.f1041E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0047q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0047q.f1075y) {
                abstractComponentCallbacksC0047q.f1041E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0047q.f1041E;
            WeakHashMap weakHashMap = K.S.f351a;
            if (view2.isAttachedToWindow()) {
                K.E.c(abstractComponentCallbacksC0047q.f1041E);
            } else {
                View view3 = abstractComponentCallbacksC0047q.f1041E;
                view3.addOnAttachStateChangeListener(new P0.n(1, view3));
            }
            abstractComponentCallbacksC0047q.f1070t.t(2);
            this.f942a.q(false);
            int visibility = abstractComponentCallbacksC0047q.f1041E.getVisibility();
            abstractComponentCallbacksC0047q.f().f1034j = abstractComponentCallbacksC0047q.f1041E.getAlpha();
            if (abstractComponentCallbacksC0047q.f1040D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0047q.f1041E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0047q.f().f1035k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0047q);
                    }
                }
                abstractComponentCallbacksC0047q.f1041E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0047q.f1054a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0047q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0047q);
        }
        boolean z3 = abstractComponentCallbacksC0047q.f1062l && !abstractComponentCallbacksC0047q.o();
        T.u uVar = this.f943b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f927b.containsKey(abstractComponentCallbacksC0047q.f1057e) && l2.f929e) ? l2.f930f : true)) {
                String str = abstractComponentCallbacksC0047q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f1037A) {
                    abstractComponentCallbacksC0047q.f1059g = d;
                }
                abstractComponentCallbacksC0047q.f1054a = 0;
                return;
            }
        }
        C0050u c0050u = abstractComponentCallbacksC0047q.f1069s;
        if (c0050u != null) {
            z2 = ((L) uVar.d).f930f;
        } else {
            z2 = c0050u.f1084f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1070t.k();
        abstractComponentCallbacksC0047q.f1048M.d(EnumC0071l.ON_DESTROY);
        abstractComponentCallbacksC0047q.f1054a = 0;
        abstractComponentCallbacksC0047q.f1045J = false;
        abstractComponentCallbacksC0047q.f1039C = true;
        this.f942a.f(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0047q.f1057e;
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f944c;
                if (str2.equals(abstractComponentCallbacksC0047q2.h)) {
                    abstractComponentCallbacksC0047q2.f1059g = abstractComponentCallbacksC0047q;
                    abstractComponentCallbacksC0047q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0047q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0047q.f1059g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0047q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1040D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0047q.f1041E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0047q.f1070t.t(1);
        if (abstractComponentCallbacksC0047q.f1041E != null && abstractComponentCallbacksC0047q.f1049N.d().f1448c.compareTo(EnumC0072m.f1440c) >= 0) {
            abstractComponentCallbacksC0047q.f1049N.e(EnumC0071l.ON_DESTROY);
        }
        abstractComponentCallbacksC0047q.f1054a = 1;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.u();
        if (!abstractComponentCallbacksC0047q.f1039C) {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((c0.a) new C.h(abstractComponentCallbacksC0047q.c(), c0.a.f1594c).z(c0.a.class)).f1595b;
        if (lVar.f3364c > 0) {
            lVar.f3363b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0047q.f1066p = false;
        this.f942a.s(false);
        abstractComponentCallbacksC0047q.f1040D = null;
        abstractComponentCallbacksC0047q.f1041E = null;
        abstractComponentCallbacksC0047q.f1049N = null;
        abstractComponentCallbacksC0047q.f1050O.d(null);
        abstractComponentCallbacksC0047q.f1064n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1054a = -1;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.v();
        if (!abstractComponentCallbacksC0047q.f1039C) {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0047q.f1070t;
        if (!i.f890G) {
            i.k();
            abstractComponentCallbacksC0047q.f1070t = new I();
        }
        this.f942a.g(false);
        abstractComponentCallbacksC0047q.f1054a = -1;
        abstractComponentCallbacksC0047q.f1069s = null;
        abstractComponentCallbacksC0047q.f1071u = null;
        abstractComponentCallbacksC0047q.f1068r = null;
        if (!abstractComponentCallbacksC0047q.f1062l || abstractComponentCallbacksC0047q.o()) {
            L l2 = (L) this.f943b.d;
            boolean z2 = true;
            if (l2.f927b.containsKey(abstractComponentCallbacksC0047q.f1057e) && l2.f929e) {
                z2 = l2.f930f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (abstractComponentCallbacksC0047q.f1063m && abstractComponentCallbacksC0047q.f1064n && !abstractComponentCallbacksC0047q.f1066p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0047q);
            }
            abstractComponentCallbacksC0047q.B(abstractComponentCallbacksC0047q.w(abstractComponentCallbacksC0047q.f1055b), null, abstractComponentCallbacksC0047q.f1055b);
            View view = abstractComponentCallbacksC0047q.f1041E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0047q.f1041E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0047q);
                if (abstractComponentCallbacksC0047q.f1075y) {
                    abstractComponentCallbacksC0047q.f1041E.setVisibility(8);
                }
                abstractComponentCallbacksC0047q.f1070t.t(2);
                this.f942a.q(false);
                abstractComponentCallbacksC0047q.f1054a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.u uVar = this.f943b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0047q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0047q.f1054a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0047q.f1062l && !abstractComponentCallbacksC0047q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0047q);
                        }
                        ((L) uVar.d).c(abstractComponentCallbacksC0047q);
                        uVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0047q);
                        }
                        abstractComponentCallbacksC0047q.l();
                    }
                    if (abstractComponentCallbacksC0047q.f1044I) {
                        if (abstractComponentCallbacksC0047q.f1041E != null && (viewGroup = abstractComponentCallbacksC0047q.f1040D) != null) {
                            C0039i f2 = C0039i.f(viewGroup, abstractComponentCallbacksC0047q.j().D());
                            if (abstractComponentCallbacksC0047q.f1075y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0047q.f1068r;
                        if (i2 != null && abstractComponentCallbacksC0047q.f1061k && I.F(abstractComponentCallbacksC0047q)) {
                            i2.f888D = true;
                        }
                        abstractComponentCallbacksC0047q.f1044I = false;
                        abstractComponentCallbacksC0047q.f1070t.n();
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
                            abstractComponentCallbacksC0047q.f1054a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0047q.f1064n = false;
                            abstractComponentCallbacksC0047q.f1054a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0047q);
                            }
                            if (abstractComponentCallbacksC0047q.f1041E != null && abstractComponentCallbacksC0047q.f1056c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0047q.f1041E != null && (viewGroup2 = abstractComponentCallbacksC0047q.f1040D) != null) {
                                C0039i f3 = C0039i.f(viewGroup2, abstractComponentCallbacksC0047q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0047q.f1054a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0047q.f1054a = 5;
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
                            if (abstractComponentCallbacksC0047q.f1041E != null && (viewGroup3 = abstractComponentCallbacksC0047q.f1040D) != null) {
                                C0039i f4 = C0039i.f(viewGroup3, abstractComponentCallbacksC0047q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0047q.f1041E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0047q.f1054a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0047q.f1054a = 6;
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1070t.t(5);
        if (abstractComponentCallbacksC0047q.f1041E != null) {
            abstractComponentCallbacksC0047q.f1049N.e(EnumC0071l.ON_PAUSE);
        }
        abstractComponentCallbacksC0047q.f1048M.d(EnumC0071l.ON_PAUSE);
        abstractComponentCallbacksC0047q.f1054a = 6;
        abstractComponentCallbacksC0047q.f1039C = true;
        this.f942a.h(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        Bundle bundle = abstractComponentCallbacksC0047q.f1055b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0047q.f1056c = abstractComponentCallbacksC0047q.f1055b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0047q.d = abstractComponentCallbacksC0047q.f1055b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0047q.f1055b.getString("android:target_state");
        abstractComponentCallbacksC0047q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0047q.i = abstractComponentCallbacksC0047q.f1055b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0047q.f1055b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0047q.f1042G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0047q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0047q);
        }
        C0046p c0046p = abstractComponentCallbacksC0047q.f1043H;
        View view = c0046p == null ? null : c0046p.f1035k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0047q.f1041E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0047q.f1041E) {
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
                sb.append(abstractComponentCallbacksC0047q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0047q.f1041E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0047q.f().f1035k = null;
        abstractComponentCallbacksC0047q.f1070t.K();
        abstractComponentCallbacksC0047q.f1070t.y(true);
        abstractComponentCallbacksC0047q.f1054a = 7;
        abstractComponentCallbacksC0047q.f1039C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0047q.f1048M;
        EnumC0071l enumC0071l = EnumC0071l.ON_RESUME;
        tVar.d(enumC0071l);
        if (abstractComponentCallbacksC0047q.f1041E != null) {
            abstractComponentCallbacksC0047q.f1049N.f954c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0047q.f1070t;
        i.f889E = false;
        i.F = false;
        i.f895L.f931g = false;
        i.t(7);
        this.f942a.l(false);
        abstractComponentCallbacksC0047q.f1055b = null;
        abstractComponentCallbacksC0047q.f1056c = null;
        abstractComponentCallbacksC0047q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (abstractComponentCallbacksC0047q.f1041E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0047q + " with view " + abstractComponentCallbacksC0047q.f1041E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0047q.f1041E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0047q.f1056c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0047q.f1049N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0047q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1070t.K();
        abstractComponentCallbacksC0047q.f1070t.y(true);
        abstractComponentCallbacksC0047q.f1054a = 5;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.y();
        if (!abstractComponentCallbacksC0047q.f1039C) {
            throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0047q.f1048M;
        EnumC0071l enumC0071l = EnumC0071l.ON_START;
        tVar.d(enumC0071l);
        if (abstractComponentCallbacksC0047q.f1041E != null) {
            abstractComponentCallbacksC0047q.f1049N.f954c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0047q.f1070t;
        i.f889E = false;
        i.F = false;
        i.f895L.f931g = false;
        i.t(5);
        this.f942a.o(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f944c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0047q);
        }
        I i = abstractComponentCallbacksC0047q.f1070t;
        i.F = true;
        i.f895L.f931g = true;
        i.t(4);
        if (abstractComponentCallbacksC0047q.f1041E != null) {
            abstractComponentCallbacksC0047q.f1049N.e(EnumC0071l.ON_STOP);
        }
        abstractComponentCallbacksC0047q.f1048M.d(EnumC0071l.ON_STOP);
        abstractComponentCallbacksC0047q.f1054a = 4;
        abstractComponentCallbacksC0047q.f1039C = false;
        abstractComponentCallbacksC0047q.z();
        if (abstractComponentCallbacksC0047q.f1039C) {
            this.f942a.p(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f942a = jVar;
        this.f943b = uVar;
        AbstractComponentCallbacksC0047q a2 = c2.a(n2.f932a);
        Bundle bundle = n2.f938j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1057e = n2.f933b;
        a2.f1063m = n2.f934c;
        a2.f1065o = true;
        a2.f1072v = n2.d;
        a2.f1073w = n2.f935e;
        a2.f1074x = n2.f936f;
        a2.f1037A = n2.f937g;
        a2.f1062l = n2.h;
        a2.f1076z = n2.i;
        a2.f1075y = n2.f939k;
        a2.f1047L = EnumC0072m.values()[n2.f940l];
        Bundle bundle2 = n2.f941m;
        if (bundle2 != null) {
            a2.f1055b = bundle2;
        } else {
            a2.f1055b = new Bundle();
        }
        this.f944c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, N n2) {
        this.f942a = jVar;
        this.f943b = uVar;
        this.f944c = abstractComponentCallbacksC0047q;
        abstractComponentCallbacksC0047q.f1056c = null;
        abstractComponentCallbacksC0047q.d = null;
        abstractComponentCallbacksC0047q.f1067q = 0;
        abstractComponentCallbacksC0047q.f1064n = false;
        abstractComponentCallbacksC0047q.f1061k = false;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = abstractComponentCallbacksC0047q.f1059g;
        abstractComponentCallbacksC0047q.h = abstractComponentCallbacksC0047q2 != null ? abstractComponentCallbacksC0047q2.f1057e : null;
        abstractComponentCallbacksC0047q.f1059g = null;
        Bundle bundle = n2.f941m;
        if (bundle != null) {
            abstractComponentCallbacksC0047q.f1055b = bundle;
        } else {
            abstractComponentCallbacksC0047q.f1055b = new Bundle();
        }
    }
}
