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
import androidx.lifecycle.EnumC0069l;
import androidx.lifecycle.EnumC0070m;
import c0.C0080a;
import com.neonpulse.gridlogic.R;
import h0.C0136a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f968a;

    /* renamed from: b, reason: collision with root package name */
    public final T.u f969b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f970c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f971e = -1;

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f968a = jVar;
        this.f969b = uVar;
        this.f970c = abstractComponentCallbacksC0048q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
        }
        Bundle bundle = abstractComponentCallbacksC0048q.f1081b;
        abstractComponentCallbacksC0048q.f1096t.K();
        abstractComponentCallbacksC0048q.f1080a = 3;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.p();
        if (!abstractComponentCallbacksC0048q.f1065C) {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0048q);
        }
        View view = abstractComponentCallbacksC0048q.f1067E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0048q.f1081b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0048q.f1082c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0048q.f1082c = null;
            }
            if (abstractComponentCallbacksC0048q.f1067E != null) {
                abstractComponentCallbacksC0048q.f1075N.d.b(abstractComponentCallbacksC0048q.d);
                abstractComponentCallbacksC0048q.d = null;
            }
            abstractComponentCallbacksC0048q.f1065C = false;
            abstractComponentCallbacksC0048q.A(bundle2);
            if (!abstractComponentCallbacksC0048q.f1065C) {
                throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0048q.f1067E != null) {
                abstractComponentCallbacksC0048q.f1075N.e(EnumC0069l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0048q.f1081b = null;
        I i = abstractComponentCallbacksC0048q.f1096t;
        i.f915E = false;
        i.F = false;
        i.f921L.f957g = false;
        i.t(4);
        this.f968a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        T.u uVar = this.f969b;
        uVar.getClass();
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1066D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f828a;
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
                        if (abstractComponentCallbacksC0048q2.f1066D == viewGroup && (view = abstractComponentCallbacksC0048q2.f1067E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0048q3.f1066D == viewGroup && (view2 = abstractComponentCallbacksC0048q3.f1067E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0048q.f1066D.addView(abstractComponentCallbacksC0048q.f1067E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1085g;
        O o2 = null;
        T.u uVar = this.f969b;
        if (abstractComponentCallbacksC0048q2 != null) {
            O o3 = (O) ((HashMap) uVar.f829b).get(abstractComponentCallbacksC0048q2.f1083e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.f1085g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q.f1085g.f1083e;
            abstractComponentCallbacksC0048q.f1085g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0048q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f829b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0048q.f1094r;
        abstractComponentCallbacksC0048q.f1095s = i.f939t;
        abstractComponentCallbacksC0048q.f1097u = i.f941v;
        B.j jVar = this.f968a;
        jVar.j(false);
        ArrayList arrayList = abstractComponentCallbacksC0048q.f1078Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = ((C0045n) it.next()).f1052a;
            abstractComponentCallbacksC0048q3.f1077P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0048q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0048q.f1096t.b(abstractComponentCallbacksC0048q.f1095s, abstractComponentCallbacksC0048q.e(), abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f1080a = 0;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.r(abstractComponentCallbacksC0048q.f1095s.f1110f);
        if (!abstractComponentCallbacksC0048q.f1065C) {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0048q.f1094r.f932m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0048q.f1096t;
        i2.f915E = false;
        i2.F = false;
        i2.f921L.f957g = false;
        i2.t(0);
        jVar.d(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (abstractComponentCallbacksC0048q.f1094r == null) {
            return abstractComponentCallbacksC0048q.f1080a;
        }
        int i = this.f971e;
        int ordinal = abstractComponentCallbacksC0048q.f1073L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.f1089m) {
            if (abstractComponentCallbacksC0048q.f1090n) {
                i = Math.max(this.f971e, 2);
                View view = abstractComponentCallbacksC0048q.f1067E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f971e < 4 ? Math.min(i, abstractComponentCallbacksC0048q.f1080a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0048q.f1087k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1066D;
        if (viewGroup != null) {
            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0048q);
            r6 = d != null ? d.f987b : 0;
            Iterator it = f2.f1033c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f988c.equals(abstractComponentCallbacksC0048q) && !u2.f990f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f987b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0048q.f1088l) {
            i = abstractComponentCallbacksC0048q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.F && abstractComponentCallbacksC0048q.f1080a < 5) {
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1071J) {
            Bundle bundle = abstractComponentCallbacksC0048q.f1081b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0048q.f1096t.Q(parcelable);
                I i = abstractComponentCallbacksC0048q.f1096t;
                i.f915E = false;
                i.F = false;
                i.f921L.f957g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0048q.f1080a = 1;
            return;
        }
        B.j jVar = this.f968a;
        jVar.k(false);
        Bundle bundle2 = abstractComponentCallbacksC0048q.f1081b;
        abstractComponentCallbacksC0048q.f1096t.K();
        abstractComponentCallbacksC0048q.f1080a = 1;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.f1074M.a(new C0136a(1, abstractComponentCallbacksC0048q));
        abstractComponentCallbacksC0048q.f1077P.b(bundle2);
        abstractComponentCallbacksC0048q.s(bundle2);
        abstractComponentCallbacksC0048q.f1071J = true;
        if (abstractComponentCallbacksC0048q.f1065C) {
            abstractComponentCallbacksC0048q.f1074M.d(EnumC0069l.ON_CREATE);
            jVar.e(false);
        } else {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (abstractComponentCallbacksC0048q.f1089m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1081b);
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1066D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048q.f1099w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0048q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048q.f1094r.f940u.N(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048q.f1091o) {
                        try {
                            str = abstractComponentCallbacksC0048q.C().getResources().getResourceName(abstractComponentCallbacksC0048q.f1099w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048q.f1099w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0048q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1131a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0048q, "Attempting to add fragment " + abstractComponentCallbacksC0048q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0048q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048q.f1066D = viewGroup;
        abstractComponentCallbacksC0048q.B(w2, viewGroup, abstractComponentCallbacksC0048q.f1081b);
        View view = abstractComponentCallbacksC0048q.f1067E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048q.f1067E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0048q.f1101y) {
                abstractComponentCallbacksC0048q.f1067E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048q.f1067E;
            WeakHashMap weakHashMap = K.S.f422a;
            if (view2.isAttachedToWindow()) {
                K.E.c(abstractComponentCallbacksC0048q.f1067E);
            } else {
                View view3 = abstractComponentCallbacksC0048q.f1067E;
                view3.addOnAttachStateChangeListener(new L0.o(1, view3));
            }
            abstractComponentCallbacksC0048q.f1096t.t(2);
            this.f968a.q(false);
            int visibility = abstractComponentCallbacksC0048q.f1067E.getVisibility();
            abstractComponentCallbacksC0048q.f().f1060j = abstractComponentCallbacksC0048q.f1067E.getAlpha();
            if (abstractComponentCallbacksC0048q.f1066D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0048q.f1067E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0048q.f().f1061k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q);
                    }
                }
                abstractComponentCallbacksC0048q.f1067E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0048q.f1080a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0048q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0048q);
        }
        boolean z3 = abstractComponentCallbacksC0048q.f1088l && !abstractComponentCallbacksC0048q.o();
        T.u uVar = this.f969b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f953b.containsKey(abstractComponentCallbacksC0048q.f1083e) && l2.f955e) ? l2.f956f : true)) {
                String str = abstractComponentCallbacksC0048q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f1063A) {
                    abstractComponentCallbacksC0048q.f1085g = d;
                }
                abstractComponentCallbacksC0048q.f1080a = 0;
                return;
            }
        }
        C0051u c0051u = abstractComponentCallbacksC0048q.f1095s;
        if (c0051u != null) {
            z2 = ((L) uVar.d).f956f;
        } else {
            z2 = c0051u.f1110f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1096t.k();
        abstractComponentCallbacksC0048q.f1074M.d(EnumC0069l.ON_DESTROY);
        abstractComponentCallbacksC0048q.f1080a = 0;
        abstractComponentCallbacksC0048q.f1071J = false;
        abstractComponentCallbacksC0048q.f1065C = true;
        this.f968a.f(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0048q.f1083e;
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f970c;
                if (str2.equals(abstractComponentCallbacksC0048q2.h)) {
                    abstractComponentCallbacksC0048q2.f1085g = abstractComponentCallbacksC0048q;
                    abstractComponentCallbacksC0048q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0048q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0048q.f1085g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1066D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048q.f1067E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048q.f1096t.t(1);
        if (abstractComponentCallbacksC0048q.f1067E != null && abstractComponentCallbacksC0048q.f1075N.d().f1476c.compareTo(EnumC0070m.f1468c) >= 0) {
            abstractComponentCallbacksC0048q.f1075N.e(EnumC0069l.ON_DESTROY);
        }
        abstractComponentCallbacksC0048q.f1080a = 1;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.u();
        if (!abstractComponentCallbacksC0048q.f1065C) {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0080a) new C.g(abstractComponentCallbacksC0048q.c(), C0080a.f1615c).z(C0080a.class)).f1616b;
        if (lVar.f3237c > 0) {
            lVar.f3236b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0048q.f1092p = false;
        this.f968a.s(false);
        abstractComponentCallbacksC0048q.f1066D = null;
        abstractComponentCallbacksC0048q.f1067E = null;
        abstractComponentCallbacksC0048q.f1075N = null;
        abstractComponentCallbacksC0048q.f1076O.d(null);
        abstractComponentCallbacksC0048q.f1090n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1080a = -1;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.v();
        if (!abstractComponentCallbacksC0048q.f1065C) {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0048q.f1096t;
        if (!i.f916G) {
            i.k();
            abstractComponentCallbacksC0048q.f1096t = new I();
        }
        this.f968a.g(false);
        abstractComponentCallbacksC0048q.f1080a = -1;
        abstractComponentCallbacksC0048q.f1095s = null;
        abstractComponentCallbacksC0048q.f1097u = null;
        abstractComponentCallbacksC0048q.f1094r = null;
        if (!abstractComponentCallbacksC0048q.f1088l || abstractComponentCallbacksC0048q.o()) {
            L l2 = (L) this.f969b.d;
            boolean z2 = true;
            if (l2.f953b.containsKey(abstractComponentCallbacksC0048q.f1083e) && l2.f955e) {
                z2 = l2.f956f;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (abstractComponentCallbacksC0048q.f1089m && abstractComponentCallbacksC0048q.f1090n && !abstractComponentCallbacksC0048q.f1092p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.B(abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1081b), null, abstractComponentCallbacksC0048q.f1081b);
            View view = abstractComponentCallbacksC0048q.f1067E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048q.f1067E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f1101y) {
                    abstractComponentCallbacksC0048q.f1067E.setVisibility(8);
                }
                abstractComponentCallbacksC0048q.f1096t.t(2);
                this.f968a.q(false);
                abstractComponentCallbacksC0048q.f1080a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.u uVar = this.f969b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
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
                int i = abstractComponentCallbacksC0048q.f1080a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0048q.f1088l && !abstractComponentCallbacksC0048q.o()) {
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
                    if (abstractComponentCallbacksC0048q.f1070I) {
                        if (abstractComponentCallbacksC0048q.f1067E != null && (viewGroup = abstractComponentCallbacksC0048q.f1066D) != null) {
                            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
                            if (abstractComponentCallbacksC0048q.f1101y) {
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
                        I i2 = abstractComponentCallbacksC0048q.f1094r;
                        if (i2 != null && abstractComponentCallbacksC0048q.f1087k && I.F(abstractComponentCallbacksC0048q)) {
                            i2.f914D = true;
                        }
                        abstractComponentCallbacksC0048q.f1070I = false;
                        abstractComponentCallbacksC0048q.f1096t.n();
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
                            abstractComponentCallbacksC0048q.f1080a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048q.f1090n = false;
                            abstractComponentCallbacksC0048q.f1080a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
                            }
                            if (abstractComponentCallbacksC0048q.f1067E != null && abstractComponentCallbacksC0048q.f1082c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0048q.f1067E != null && (viewGroup2 = abstractComponentCallbacksC0048q.f1066D) != null) {
                                C0040i f3 = C0040i.f(viewGroup2, abstractComponentCallbacksC0048q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0048q.f1080a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0048q.f1080a = 5;
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
                            if (abstractComponentCallbacksC0048q.f1067E != null && (viewGroup3 = abstractComponentCallbacksC0048q.f1066D) != null) {
                                C0040i f4 = C0040i.f(viewGroup3, abstractComponentCallbacksC0048q.j().D());
                                int b2 = T0.c.b(abstractComponentCallbacksC0048q.f1067E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0048q.f1080a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0048q.f1080a = 6;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1096t.t(5);
        if (abstractComponentCallbacksC0048q.f1067E != null) {
            abstractComponentCallbacksC0048q.f1075N.e(EnumC0069l.ON_PAUSE);
        }
        abstractComponentCallbacksC0048q.f1074M.d(EnumC0069l.ON_PAUSE);
        abstractComponentCallbacksC0048q.f1080a = 6;
        abstractComponentCallbacksC0048q.f1065C = true;
        this.f968a.h(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        Bundle bundle = abstractComponentCallbacksC0048q.f1081b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048q.f1082c = abstractComponentCallbacksC0048q.f1081b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048q.d = abstractComponentCallbacksC0048q.f1081b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0048q.f1081b.getString("android:target_state");
        abstractComponentCallbacksC0048q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0048q.i = abstractComponentCallbacksC0048q.f1081b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0048q.f1081b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0048q.f1068G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0048q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0048q);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q.f1069H;
        View view = c0047p == null ? null : c0047p.f1061k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0048q.f1067E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0048q.f1067E) {
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
                sb.append(abstractComponentCallbacksC0048q.f1067E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0048q.f().f1061k = null;
        abstractComponentCallbacksC0048q.f1096t.K();
        abstractComponentCallbacksC0048q.f1096t.y(true);
        abstractComponentCallbacksC0048q.f1080a = 7;
        abstractComponentCallbacksC0048q.f1065C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f1074M;
        EnumC0069l enumC0069l = EnumC0069l.ON_RESUME;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0048q.f1067E != null) {
            abstractComponentCallbacksC0048q.f1075N.f980c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0048q.f1096t;
        i.f915E = false;
        i.F = false;
        i.f921L.f957g = false;
        i.t(7);
        this.f968a.l(false);
        abstractComponentCallbacksC0048q.f1081b = null;
        abstractComponentCallbacksC0048q.f1082c = null;
        abstractComponentCallbacksC0048q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (abstractComponentCallbacksC0048q.f1067E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0048q + " with view " + abstractComponentCallbacksC0048q.f1067E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048q.f1067E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048q.f1082c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048q.f1075N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1096t.K();
        abstractComponentCallbacksC0048q.f1096t.y(true);
        abstractComponentCallbacksC0048q.f1080a = 5;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.y();
        if (!abstractComponentCallbacksC0048q.f1065C) {
            throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0048q.f1074M;
        EnumC0069l enumC0069l = EnumC0069l.ON_START;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0048q.f1067E != null) {
            abstractComponentCallbacksC0048q.f1075N.f980c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0048q.f1096t;
        i.f915E = false;
        i.F = false;
        i.f921L.f957g = false;
        i.t(5);
        this.f968a.o(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f970c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0048q);
        }
        I i = abstractComponentCallbacksC0048q.f1096t;
        i.F = true;
        i.f921L.f957g = true;
        i.t(4);
        if (abstractComponentCallbacksC0048q.f1067E != null) {
            abstractComponentCallbacksC0048q.f1075N.e(EnumC0069l.ON_STOP);
        }
        abstractComponentCallbacksC0048q.f1074M.d(EnumC0069l.ON_STOP);
        abstractComponentCallbacksC0048q.f1080a = 4;
        abstractComponentCallbacksC0048q.f1065C = false;
        abstractComponentCallbacksC0048q.z();
        if (abstractComponentCallbacksC0048q.f1065C) {
            this.f968a.p(false);
            return;
        }
        throw new V("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f968a = jVar;
        this.f969b = uVar;
        AbstractComponentCallbacksC0048q a2 = c2.a(n2.f958a);
        Bundle bundle = n2.f964j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1083e = n2.f959b;
        a2.f1089m = n2.f960c;
        a2.f1091o = true;
        a2.f1098v = n2.d;
        a2.f1099w = n2.f961e;
        a2.f1100x = n2.f962f;
        a2.f1063A = n2.f963g;
        a2.f1088l = n2.h;
        a2.f1102z = n2.i;
        a2.f1101y = n2.f965k;
        a2.f1073L = EnumC0070m.values()[n2.f966l];
        Bundle bundle2 = n2.f967m;
        if (bundle2 != null) {
            a2.f1081b = bundle2;
        } else {
            a2.f1081b = new Bundle();
        }
        this.f970c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.u uVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, N n2) {
        this.f968a = jVar;
        this.f969b = uVar;
        this.f970c = abstractComponentCallbacksC0048q;
        abstractComponentCallbacksC0048q.f1082c = null;
        abstractComponentCallbacksC0048q.d = null;
        abstractComponentCallbacksC0048q.f1093q = 0;
        abstractComponentCallbacksC0048q.f1090n = false;
        abstractComponentCallbacksC0048q.f1087k = false;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1085g;
        abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q2 != null ? abstractComponentCallbacksC0048q2.f1083e : null;
        abstractComponentCallbacksC0048q.f1085g = null;
        Bundle bundle = n2.f967m;
        if (bundle != null) {
            abstractComponentCallbacksC0048q.f1081b = bundle;
        } else {
            abstractComponentCallbacksC0048q.f1081b = new Bundle();
        }
    }
}
