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
import c0.C0086a;
import com.clutchquizarena.app.R;
import h0.C0141a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f994a;

    /* renamed from: b, reason: collision with root package name */
    public final T.w f995b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0048q f996c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f997e = -1;

    public O(B.j jVar, T.w wVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        this.f994a = jVar;
        this.f995b = wVar;
        this.f996c = abstractComponentCallbacksC0048q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
        }
        Bundle bundle = abstractComponentCallbacksC0048q.f1107b;
        abstractComponentCallbacksC0048q.f1122t.K();
        abstractComponentCallbacksC0048q.f1106a = 3;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.p();
        if (!abstractComponentCallbacksC0048q.f1091C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0048q);
        }
        View view = abstractComponentCallbacksC0048q.f1093E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0048q.f1107b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0048q.f1108c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0048q.f1108c = null;
            }
            if (abstractComponentCallbacksC0048q.f1093E != null) {
                abstractComponentCallbacksC0048q.f1101N.d.b(abstractComponentCallbacksC0048q.d);
                abstractComponentCallbacksC0048q.d = null;
            }
            abstractComponentCallbacksC0048q.f1091C = false;
            abstractComponentCallbacksC0048q.A(bundle2);
            if (!abstractComponentCallbacksC0048q.f1091C) {
                throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0048q.f1093E != null) {
                abstractComponentCallbacksC0048q.f1101N.e(EnumC0071l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0048q.f1107b = null;
        I i = abstractComponentCallbacksC0048q.f1122t;
        i.f941E = false;
        i.F = false;
        i.f947L.f983g = false;
        i.t(4);
        this.f994a.e(false);
    }

    public final void b() {
        View view;
        View view2;
        T.w wVar = this.f995b;
        wVar.getClass();
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1092D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) wVar.f845a;
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
                        if (abstractComponentCallbacksC0048q2.f1092D == viewGroup && (view = abstractComponentCallbacksC0048q2.f1093E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = (AbstractComponentCallbacksC0048q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0048q3.f1092D == viewGroup && (view2 = abstractComponentCallbacksC0048q3.f1093E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0048q.f1092D.addView(abstractComponentCallbacksC0048q.f1093E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1111g;
        O o2 = null;
        T.w wVar = this.f995b;
        if (abstractComponentCallbacksC0048q2 != null) {
            O o3 = (O) ((HashMap) wVar.f846b).get(abstractComponentCallbacksC0048q2.f1109e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.f1111g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q.f1111g.f1109e;
            abstractComponentCallbacksC0048q.f1111g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0048q.h;
            if (str != null && (o2 = (O) ((HashMap) wVar.f846b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0048q + " declared target fragment " + abstractComponentCallbacksC0048q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0048q.f1120r;
        abstractComponentCallbacksC0048q.f1121s = i.f965t;
        abstractComponentCallbacksC0048q.f1123u = i.f967v;
        B.j jVar = this.f994a;
        jVar.n(false);
        ArrayList arrayList = abstractComponentCallbacksC0048q.f1104Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q3 = ((C0045n) it.next()).f1078a;
            abstractComponentCallbacksC0048q3.f1103P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0048q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0048q.f1122t.b(abstractComponentCallbacksC0048q.f1121s, abstractComponentCallbacksC0048q.e(), abstractComponentCallbacksC0048q);
        abstractComponentCallbacksC0048q.f1106a = 0;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.r(abstractComponentCallbacksC0048q.f1121s.f1136b);
        if (!abstractComponentCallbacksC0048q.f1091C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0048q.f1120r.f958m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0048q.f1122t;
        i2.f941E = false;
        i2.F = false;
        i2.f947L.f983g = false;
        i2.t(0);
        jVar.f(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (abstractComponentCallbacksC0048q.f1120r == null) {
            return abstractComponentCallbacksC0048q.f1106a;
        }
        int i = this.f997e;
        int ordinal = abstractComponentCallbacksC0048q.f1099L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.f1115m) {
            if (abstractComponentCallbacksC0048q.f1116n) {
                i = Math.max(this.f997e, 2);
                View view = abstractComponentCallbacksC0048q.f1093E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f997e < 4 ? Math.min(i, abstractComponentCallbacksC0048q.f1106a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0048q.f1113k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1092D;
        if (viewGroup != null) {
            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0048q);
            r6 = d != null ? d.f1013b : 0;
            Iterator it = f2.f1059c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1014c.equals(abstractComponentCallbacksC0048q) && !u2.f1016f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1013b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0048q.f1114l) {
            i = abstractComponentCallbacksC0048q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0048q.F && abstractComponentCallbacksC0048q.f1106a < 5) {
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0048q);
        }
        if (abstractComponentCallbacksC0048q.f1097J) {
            Bundle bundle = abstractComponentCallbacksC0048q.f1107b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0048q.f1122t.Q(parcelable);
                I i = abstractComponentCallbacksC0048q.f1122t;
                i.f941E = false;
                i.F = false;
                i.f947L.f983g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0048q.f1106a = 1;
            return;
        }
        B.j jVar = this.f994a;
        jVar.o(false);
        Bundle bundle2 = abstractComponentCallbacksC0048q.f1107b;
        abstractComponentCallbacksC0048q.f1122t.K();
        abstractComponentCallbacksC0048q.f1106a = 1;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.f1100M.a(new C0141a(1, abstractComponentCallbacksC0048q));
        abstractComponentCallbacksC0048q.f1103P.b(bundle2);
        abstractComponentCallbacksC0048q.s(bundle2);
        abstractComponentCallbacksC0048q.f1097J = true;
        if (abstractComponentCallbacksC0048q.f1091C) {
            abstractComponentCallbacksC0048q.f1100M.d(EnumC0071l.ON_CREATE);
            jVar.g(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (abstractComponentCallbacksC0048q.f1115m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1107b);
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1092D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0048q.f1125w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0048q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0048q.f1120r.f966u.C(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0048q.f1117o) {
                        try {
                            str = abstractComponentCallbacksC0048q.C().getResources().getResourceName(abstractComponentCallbacksC0048q.f1125w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0048q.f1125w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0048q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Y.c cVar = Y.d.f1162a;
                    Y.d.b(new Y.a(abstractComponentCallbacksC0048q, "Attempting to add fragment " + abstractComponentCallbacksC0048q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Y.d.a(abstractComponentCallbacksC0048q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0048q.f1092D = viewGroup;
        abstractComponentCallbacksC0048q.B(w2, viewGroup, abstractComponentCallbacksC0048q.f1107b);
        View view = abstractComponentCallbacksC0048q.f1093E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0048q.f1093E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0048q.f1127y) {
                abstractComponentCallbacksC0048q.f1093E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0048q.f1093E;
            WeakHashMap weakHashMap = K.S.f365a;
            if (view2.isAttachedToWindow()) {
                K.E.c(abstractComponentCallbacksC0048q.f1093E);
            } else {
                View view3 = abstractComponentCallbacksC0048q.f1093E;
                view3.addOnAttachStateChangeListener(new R0.n(1, view3));
            }
            abstractComponentCallbacksC0048q.f1122t.t(2);
            this.f994a.t(false);
            int visibility = abstractComponentCallbacksC0048q.f1093E.getVisibility();
            abstractComponentCallbacksC0048q.f().f1086j = abstractComponentCallbacksC0048q.f1093E.getAlpha();
            if (abstractComponentCallbacksC0048q.f1092D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0048q.f1093E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0048q.f().f1087k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0048q);
                    }
                }
                abstractComponentCallbacksC0048q.f1093E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0048q.f1106a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0048q c2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0048q);
        }
        boolean z3 = abstractComponentCallbacksC0048q.f1114l && !abstractComponentCallbacksC0048q.o();
        T.w wVar = this.f995b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) wVar.d;
            if (!((l2.f979b.containsKey(abstractComponentCallbacksC0048q.f1109e) && l2.f981e) ? l2.f982f : true)) {
                String str = abstractComponentCallbacksC0048q.h;
                if (str != null && (c2 = wVar.c(str)) != null && c2.f1089A) {
                    abstractComponentCallbacksC0048q.f1111g = c2;
                }
                abstractComponentCallbacksC0048q.f1106a = 0;
                return;
            }
        }
        C0051u c0051u = abstractComponentCallbacksC0048q.f1121s;
        if (c0051u != null) {
            z2 = ((L) wVar.d).f982f;
        } else {
            z2 = c0051u.f1136b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) wVar.d).c(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1122t.k();
        abstractComponentCallbacksC0048q.f1100M.d(EnumC0071l.ON_DESTROY);
        abstractComponentCallbacksC0048q.f1106a = 0;
        abstractComponentCallbacksC0048q.f1097J = false;
        abstractComponentCallbacksC0048q.f1091C = true;
        this.f994a.h(false);
        Iterator it = wVar.f().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0048q.f1109e;
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = o2.f996c;
                if (str2.equals(abstractComponentCallbacksC0048q2.h)) {
                    abstractComponentCallbacksC0048q2.f1111g = abstractComponentCallbacksC0048q;
                    abstractComponentCallbacksC0048q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0048q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0048q.f1111g = wVar.c(str3);
        }
        wVar.j(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0048q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0048q.f1092D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0048q.f1093E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0048q.f1122t.t(1);
        if (abstractComponentCallbacksC0048q.f1093E != null && abstractComponentCallbacksC0048q.f1101N.d().d.compareTo(EnumC0072m.f1505c) >= 0) {
            abstractComponentCallbacksC0048q.f1101N.e(EnumC0071l.ON_DESTROY);
        }
        abstractComponentCallbacksC0048q.f1106a = 1;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.u();
        if (!abstractComponentCallbacksC0048q.f1091C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0086a) new A0.h(abstractComponentCallbacksC0048q.c(), C0086a.f1708c).x(C0086a.class)).f1709b;
        if (lVar.f3240c > 0) {
            lVar.f3239b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0048q.f1118p = false;
        this.f994a.u(false);
        abstractComponentCallbacksC0048q.f1092D = null;
        abstractComponentCallbacksC0048q.f1093E = null;
        abstractComponentCallbacksC0048q.f1101N = null;
        abstractComponentCallbacksC0048q.f1102O.d(null);
        abstractComponentCallbacksC0048q.f1116n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1106a = -1;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.v();
        if (!abstractComponentCallbacksC0048q.f1091C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0048q.f1122t;
        if (!i.f942G) {
            i.k();
            abstractComponentCallbacksC0048q.f1122t = new I();
        }
        this.f994a.i(false);
        abstractComponentCallbacksC0048q.f1106a = -1;
        abstractComponentCallbacksC0048q.f1121s = null;
        abstractComponentCallbacksC0048q.f1123u = null;
        abstractComponentCallbacksC0048q.f1120r = null;
        if (!abstractComponentCallbacksC0048q.f1114l || abstractComponentCallbacksC0048q.o()) {
            L l2 = (L) this.f995b.d;
            boolean z2 = true;
            if (l2.f979b.containsKey(abstractComponentCallbacksC0048q.f1109e) && l2.f981e) {
                z2 = l2.f982f;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (abstractComponentCallbacksC0048q.f1115m && abstractComponentCallbacksC0048q.f1116n && !abstractComponentCallbacksC0048q.f1118p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0048q);
            }
            abstractComponentCallbacksC0048q.B(abstractComponentCallbacksC0048q.w(abstractComponentCallbacksC0048q.f1107b), null, abstractComponentCallbacksC0048q.f1107b);
            View view = abstractComponentCallbacksC0048q.f1093E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0048q.f1093E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0048q);
                if (abstractComponentCallbacksC0048q.f1127y) {
                    abstractComponentCallbacksC0048q.f1093E.setVisibility(8);
                }
                abstractComponentCallbacksC0048q.f1122t.t(2);
                this.f994a.t(false);
                abstractComponentCallbacksC0048q.f1106a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.w wVar = this.f995b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
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
                int i = abstractComponentCallbacksC0048q.f1106a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0048q.f1114l && !abstractComponentCallbacksC0048q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0048q);
                        }
                        ((L) wVar.d).c(abstractComponentCallbacksC0048q);
                        wVar.j(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0048q);
                        }
                        abstractComponentCallbacksC0048q.l();
                    }
                    if (abstractComponentCallbacksC0048q.f1096I) {
                        if (abstractComponentCallbacksC0048q.f1093E != null && (viewGroup = abstractComponentCallbacksC0048q.f1092D) != null) {
                            C0040i f2 = C0040i.f(viewGroup, abstractComponentCallbacksC0048q.j().D());
                            if (abstractComponentCallbacksC0048q.f1127y) {
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
                        I i2 = abstractComponentCallbacksC0048q.f1120r;
                        if (i2 != null && abstractComponentCallbacksC0048q.f1113k && I.F(abstractComponentCallbacksC0048q)) {
                            i2.f940D = true;
                        }
                        abstractComponentCallbacksC0048q.f1096I = false;
                        abstractComponentCallbacksC0048q.f1122t.n();
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
                            abstractComponentCallbacksC0048q.f1106a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0048q.f1116n = false;
                            abstractComponentCallbacksC0048q.f1106a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0048q);
                            }
                            if (abstractComponentCallbacksC0048q.f1093E != null && abstractComponentCallbacksC0048q.f1108c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0048q.f1093E != null && (viewGroup2 = abstractComponentCallbacksC0048q.f1092D) != null) {
                                C0040i f3 = C0040i.f(viewGroup2, abstractComponentCallbacksC0048q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0048q.f1106a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0048q.f1106a = 5;
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
                            if (abstractComponentCallbacksC0048q.f1093E != null && (viewGroup3 = abstractComponentCallbacksC0048q.f1092D) != null) {
                                C0040i f4 = C0040i.f(viewGroup3, abstractComponentCallbacksC0048q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0048q.f1093E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0048q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0048q.f1106a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0048q.f1106a = 6;
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1122t.t(5);
        if (abstractComponentCallbacksC0048q.f1093E != null) {
            abstractComponentCallbacksC0048q.f1101N.e(EnumC0071l.ON_PAUSE);
        }
        abstractComponentCallbacksC0048q.f1100M.d(EnumC0071l.ON_PAUSE);
        abstractComponentCallbacksC0048q.f1106a = 6;
        abstractComponentCallbacksC0048q.f1091C = true;
        this.f994a.m(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        Bundle bundle = abstractComponentCallbacksC0048q.f1107b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0048q.f1108c = abstractComponentCallbacksC0048q.f1107b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0048q.d = abstractComponentCallbacksC0048q.f1107b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0048q.f1107b.getString("android:target_state");
        abstractComponentCallbacksC0048q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0048q.i = abstractComponentCallbacksC0048q.f1107b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0048q.f1107b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0048q.f1094G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0048q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0048q);
        }
        C0047p c0047p = abstractComponentCallbacksC0048q.f1095H;
        View view = c0047p == null ? null : c0047p.f1087k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0048q.f1093E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0048q.f1093E) {
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
                sb.append(abstractComponentCallbacksC0048q.f1093E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0048q.f().f1087k = null;
        abstractComponentCallbacksC0048q.f1122t.K();
        abstractComponentCallbacksC0048q.f1122t.y(true);
        abstractComponentCallbacksC0048q.f1106a = 7;
        abstractComponentCallbacksC0048q.f1091C = true;
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0048q.f1100M;
        EnumC0071l enumC0071l = EnumC0071l.ON_RESUME;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0048q.f1093E != null) {
            abstractComponentCallbacksC0048q.f1101N.f1006c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0048q.f1122t;
        i.f941E = false;
        i.F = false;
        i.f947L.f983g = false;
        i.t(7);
        this.f994a.p(false);
        abstractComponentCallbacksC0048q.f1107b = null;
        abstractComponentCallbacksC0048q.f1108c = null;
        abstractComponentCallbacksC0048q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (abstractComponentCallbacksC0048q.f1093E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0048q + " with view " + abstractComponentCallbacksC0048q.f1093E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0048q.f1093E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0048q.f1108c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0048q.f1101N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0048q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f1122t.K();
        abstractComponentCallbacksC0048q.f1122t.y(true);
        abstractComponentCallbacksC0048q.f1106a = 5;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.y();
        if (!abstractComponentCallbacksC0048q.f1091C) {
            throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0048q.f1100M;
        EnumC0071l enumC0071l = EnumC0071l.ON_START;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0048q.f1093E != null) {
            abstractComponentCallbacksC0048q.f1101N.f1006c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0048q.f1122t;
        i.f941E = false;
        i.F = false;
        i.f947L.f983g = false;
        i.t(5);
        this.f994a.r(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f996c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0048q);
        }
        I i = abstractComponentCallbacksC0048q.f1122t;
        i.F = true;
        i.f947L.f983g = true;
        i.t(4);
        if (abstractComponentCallbacksC0048q.f1093E != null) {
            abstractComponentCallbacksC0048q.f1101N.e(EnumC0071l.ON_STOP);
        }
        abstractComponentCallbacksC0048q.f1100M.d(EnumC0071l.ON_STOP);
        abstractComponentCallbacksC0048q.f1106a = 4;
        abstractComponentCallbacksC0048q.f1091C = false;
        abstractComponentCallbacksC0048q.z();
        if (abstractComponentCallbacksC0048q.f1091C) {
            this.f994a.s(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0048q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, T.w wVar, ClassLoader classLoader, C c2, N n2) {
        this.f994a = jVar;
        this.f995b = wVar;
        AbstractComponentCallbacksC0048q a2 = c2.a(n2.f984a);
        Bundle bundle = n2.f990j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1109e = n2.f985b;
        a2.f1115m = n2.f986c;
        a2.f1117o = true;
        a2.f1124v = n2.d;
        a2.f1125w = n2.f987e;
        a2.f1126x = n2.f988f;
        a2.f1089A = n2.f989g;
        a2.f1114l = n2.h;
        a2.f1128z = n2.i;
        a2.f1127y = n2.f991k;
        a2.f1099L = EnumC0072m.values()[n2.f992l];
        Bundle bundle2 = n2.f993m;
        if (bundle2 != null) {
            a2.f1107b = bundle2;
        } else {
            a2.f1107b = new Bundle();
        }
        this.f996c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, T.w wVar, AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q, N n2) {
        this.f994a = jVar;
        this.f995b = wVar;
        this.f996c = abstractComponentCallbacksC0048q;
        abstractComponentCallbacksC0048q.f1108c = null;
        abstractComponentCallbacksC0048q.d = null;
        abstractComponentCallbacksC0048q.f1119q = 0;
        abstractComponentCallbacksC0048q.f1116n = false;
        abstractComponentCallbacksC0048q.f1113k = false;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q2 = abstractComponentCallbacksC0048q.f1111g;
        abstractComponentCallbacksC0048q.h = abstractComponentCallbacksC0048q2 != null ? abstractComponentCallbacksC0048q2.f1109e : null;
        abstractComponentCallbacksC0048q.f1111g = null;
        Bundle bundle = n2.f993m;
        if (bundle != null) {
            abstractComponentCallbacksC0048q.f1107b = bundle;
        } else {
            abstractComponentCallbacksC0048q.f1107b = new Bundle();
        }
    }
}
