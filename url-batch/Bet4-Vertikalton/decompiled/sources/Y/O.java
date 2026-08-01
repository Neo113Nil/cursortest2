package Y;

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
import androidx.recyclerview.widget.RecyclerView;
import com.playbag.tripgear.R;
import d0.C0087a;
import i0.C0141a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f988a;

    /* renamed from: b, reason: collision with root package name */
    public final U.u f989b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f990c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f991e = -1;

    public O(B.j jVar, U.u uVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f988a = jVar;
        this.f989b = uVar;
        this.f990c = abstractComponentCallbacksC0051q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0051q);
        }
        Bundle bundle = abstractComponentCallbacksC0051q.f1101b;
        abstractComponentCallbacksC0051q.f1116t.K();
        abstractComponentCallbacksC0051q.f1100a = 3;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.p();
        if (!abstractComponentCallbacksC0051q.f1085C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0051q);
        }
        View view = abstractComponentCallbacksC0051q.f1087E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0051q.f1101b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0051q.f1102c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0051q.f1102c = null;
            }
            if (abstractComponentCallbacksC0051q.f1087E != null) {
                abstractComponentCallbacksC0051q.f1095N.d.b(abstractComponentCallbacksC0051q.d);
                abstractComponentCallbacksC0051q.d = null;
            }
            abstractComponentCallbacksC0051q.f1085C = false;
            abstractComponentCallbacksC0051q.A(bundle2);
            if (!abstractComponentCallbacksC0051q.f1085C) {
                throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0051q.f1087E != null) {
                abstractComponentCallbacksC0051q.f1095N.e(EnumC0071l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0051q.f1101b = null;
        I i = abstractComponentCallbacksC0051q.f1116t;
        i.f935E = false;
        i.F = false;
        i.f941L.f977g = false;
        i.t(4);
        this.f988a.d(false);
    }

    public final void b() {
        View view;
        View view2;
        U.u uVar = this.f989b;
        uVar.getClass();
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1086D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f874a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0051q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = (AbstractComponentCallbacksC0051q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0051q2.f1086D == viewGroup && (view = abstractComponentCallbacksC0051q2.f1087E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0051q3.f1086D == viewGroup && (view2 = abstractComponentCallbacksC0051q3.f1087E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0051q.f1086D.addView(abstractComponentCallbacksC0051q.f1087E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0051q);
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = abstractComponentCallbacksC0051q.f1105g;
        O o2 = null;
        U.u uVar = this.f989b;
        if (abstractComponentCallbacksC0051q2 != null) {
            O o3 = (O) ((HashMap) uVar.f875b).get(abstractComponentCallbacksC0051q2.f1103e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " declared target fragment " + abstractComponentCallbacksC0051q.f1105g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0051q.h = abstractComponentCallbacksC0051q.f1105g.f1103e;
            abstractComponentCallbacksC0051q.f1105g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0051q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f875b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " declared target fragment " + abstractComponentCallbacksC0051q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0051q.f1114r;
        abstractComponentCallbacksC0051q.f1115s = i.f959t;
        abstractComponentCallbacksC0051q.f1117u = i.f961v;
        B.j jVar = this.f988a;
        jVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0051q.f1098Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = ((C0048n) it.next()).f1072a;
            abstractComponentCallbacksC0051q3.f1097P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0051q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0051q.f1116t.b(abstractComponentCallbacksC0051q.f1115s, abstractComponentCallbacksC0051q.e(), abstractComponentCallbacksC0051q);
        abstractComponentCallbacksC0051q.f1100a = 0;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.r(abstractComponentCallbacksC0051q.f1115s.f1130f);
        if (!abstractComponentCallbacksC0051q.f1085C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0051q.f1114r.f952m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0051q.f1116t;
        i2.f935E = false;
        i2.F = false;
        i2.f941L.f977g = false;
        i2.t(0);
        jVar.e(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (abstractComponentCallbacksC0051q.f1114r == null) {
            return abstractComponentCallbacksC0051q.f1100a;
        }
        int i = this.f991e;
        int ordinal = abstractComponentCallbacksC0051q.f1093L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0051q.f1109m) {
            if (abstractComponentCallbacksC0051q.f1110n) {
                i = Math.max(this.f991e, 2);
                View view = abstractComponentCallbacksC0051q.f1087E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f991e < 4 ? Math.min(i, abstractComponentCallbacksC0051q.f1100a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0051q.f1107k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1086D;
        if (viewGroup != null) {
            C0043i f2 = C0043i.f(viewGroup, abstractComponentCallbacksC0051q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0051q);
            r6 = d != null ? d.f1007b : 0;
            Iterator it = f2.f1053c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1008c.equals(abstractComponentCallbacksC0051q) && !u2.f1010f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1007b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0051q.f1108l) {
            i = abstractComponentCallbacksC0051q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0051q.F && abstractComponentCallbacksC0051q.f1100a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0051q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1091J) {
            Bundle bundle = abstractComponentCallbacksC0051q.f1101b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0051q.f1116t.Q(parcelable);
                I i = abstractComponentCallbacksC0051q.f1116t;
                i.f935E = false;
                i.F = false;
                i.f941L.f977g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0051q.f1100a = 1;
            return;
        }
        B.j jVar = this.f988a;
        jVar.m(false);
        Bundle bundle2 = abstractComponentCallbacksC0051q.f1101b;
        abstractComponentCallbacksC0051q.f1116t.K();
        abstractComponentCallbacksC0051q.f1100a = 1;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.f1094M.a(new C0141a(1, abstractComponentCallbacksC0051q));
        abstractComponentCallbacksC0051q.f1097P.b(bundle2);
        abstractComponentCallbacksC0051q.s(bundle2);
        abstractComponentCallbacksC0051q.f1091J = true;
        if (abstractComponentCallbacksC0051q.f1085C) {
            abstractComponentCallbacksC0051q.f1094M.d(EnumC0071l.ON_CREATE);
            jVar.f(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (abstractComponentCallbacksC0051q.f1109m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0051q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0051q.w(abstractComponentCallbacksC0051q.f1101b);
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1086D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0051q.f1119w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0051q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0051q.f1114r.f960u.I(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0051q.f1111o) {
                        try {
                            str = abstractComponentCallbacksC0051q.C().getResources().getResourceName(abstractComponentCallbacksC0051q.f1119w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0051q.f1119w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0051q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1149a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0051q, "Attempting to add fragment " + abstractComponentCallbacksC0051q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0051q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0051q.f1086D = viewGroup;
        abstractComponentCallbacksC0051q.B(w2, viewGroup, abstractComponentCallbacksC0051q.f1101b);
        View view = abstractComponentCallbacksC0051q.f1087E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0051q.f1087E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0051q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0051q.f1121y) {
                abstractComponentCallbacksC0051q.f1087E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0051q.f1087E;
            WeakHashMap weakHashMap = K.T.f423a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0051q.f1087E);
            } else {
                View view3 = abstractComponentCallbacksC0051q.f1087E;
                view3.addOnAttachStateChangeListener(new M0.o(1, view3));
            }
            abstractComponentCallbacksC0051q.f1116t.t(2);
            this.f988a.s(false);
            int visibility = abstractComponentCallbacksC0051q.f1087E.getVisibility();
            abstractComponentCallbacksC0051q.f().f1080j = abstractComponentCallbacksC0051q.f1087E.getAlpha();
            if (abstractComponentCallbacksC0051q.f1086D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0051q.f1087E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0051q.f().f1081k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0051q);
                    }
                }
                abstractComponentCallbacksC0051q.f1087E.setAlpha(RecyclerView.f1530C0);
            }
        }
        abstractComponentCallbacksC0051q.f1100a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0051q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0051q);
        }
        boolean z3 = abstractComponentCallbacksC0051q.f1108l && !abstractComponentCallbacksC0051q.o();
        U.u uVar = this.f989b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f973b.containsKey(abstractComponentCallbacksC0051q.f1103e) && l2.f975e) ? l2.f976f : true)) {
                String str = abstractComponentCallbacksC0051q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f1083A) {
                    abstractComponentCallbacksC0051q.f1105g = d;
                }
                abstractComponentCallbacksC0051q.f1100a = 0;
                return;
            }
        }
        C0054u c0054u = abstractComponentCallbacksC0051q.f1115s;
        if (c0054u != null) {
            z2 = ((L) uVar.d).f976f;
        } else {
            z2 = c0054u.f1130f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1116t.k();
        abstractComponentCallbacksC0051q.f1094M.d(EnumC0071l.ON_DESTROY);
        abstractComponentCallbacksC0051q.f1100a = 0;
        abstractComponentCallbacksC0051q.f1091J = false;
        abstractComponentCallbacksC0051q.f1085C = true;
        this.f988a.g(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0051q.f1103e;
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f990c;
                if (str2.equals(abstractComponentCallbacksC0051q2.h)) {
                    abstractComponentCallbacksC0051q2.f1105g = abstractComponentCallbacksC0051q;
                    abstractComponentCallbacksC0051q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0051q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0051q.f1105g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0051q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1086D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0051q.f1087E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0051q.f1116t.t(1);
        if (abstractComponentCallbacksC0051q.f1087E != null && abstractComponentCallbacksC0051q.f1095N.d().f1490c.compareTo(EnumC0072m.f1482c) >= 0) {
            abstractComponentCallbacksC0051q.f1095N.e(EnumC0071l.ON_DESTROY);
        }
        abstractComponentCallbacksC0051q.f1100a = 1;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.u();
        if (!abstractComponentCallbacksC0051q.f1085C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0087a) new C.g(abstractComponentCallbacksC0051q.c(), C0087a.f2011c).x(C0087a.class)).f2012b;
        if (lVar.f3249c > 0) {
            lVar.f3248b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0051q.f1112p = false;
        this.f988a.t(false);
        abstractComponentCallbacksC0051q.f1086D = null;
        abstractComponentCallbacksC0051q.f1087E = null;
        abstractComponentCallbacksC0051q.f1095N = null;
        abstractComponentCallbacksC0051q.f1096O.d(null);
        abstractComponentCallbacksC0051q.f1110n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1100a = -1;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.v();
        if (!abstractComponentCallbacksC0051q.f1085C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0051q.f1116t;
        if (!i.f936G) {
            i.k();
            abstractComponentCallbacksC0051q.f1116t = new I();
        }
        this.f988a.i(false);
        abstractComponentCallbacksC0051q.f1100a = -1;
        abstractComponentCallbacksC0051q.f1115s = null;
        abstractComponentCallbacksC0051q.f1117u = null;
        abstractComponentCallbacksC0051q.f1114r = null;
        if (!abstractComponentCallbacksC0051q.f1108l || abstractComponentCallbacksC0051q.o()) {
            L l2 = (L) this.f989b.d;
            boolean z2 = true;
            if (l2.f973b.containsKey(abstractComponentCallbacksC0051q.f1103e) && l2.f975e) {
                z2 = l2.f976f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (abstractComponentCallbacksC0051q.f1109m && abstractComponentCallbacksC0051q.f1110n && !abstractComponentCallbacksC0051q.f1112p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0051q);
            }
            abstractComponentCallbacksC0051q.B(abstractComponentCallbacksC0051q.w(abstractComponentCallbacksC0051q.f1101b), null, abstractComponentCallbacksC0051q.f1101b);
            View view = abstractComponentCallbacksC0051q.f1087E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0051q.f1087E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0051q);
                if (abstractComponentCallbacksC0051q.f1121y) {
                    abstractComponentCallbacksC0051q.f1087E.setVisibility(8);
                }
                abstractComponentCallbacksC0051q.f1116t.t(2);
                this.f988a.s(false);
                abstractComponentCallbacksC0051q.f1100a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        U.u uVar = this.f989b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0051q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0051q.f1100a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0051q.f1108l && !abstractComponentCallbacksC0051q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0051q);
                        }
                        ((L) uVar.d).c(abstractComponentCallbacksC0051q);
                        uVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0051q);
                        }
                        abstractComponentCallbacksC0051q.l();
                    }
                    if (abstractComponentCallbacksC0051q.f1090I) {
                        if (abstractComponentCallbacksC0051q.f1087E != null && (viewGroup = abstractComponentCallbacksC0051q.f1086D) != null) {
                            C0043i f2 = C0043i.f(viewGroup, abstractComponentCallbacksC0051q.j().D());
                            if (abstractComponentCallbacksC0051q.f1121y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0051q.f1114r;
                        if (i2 != null && abstractComponentCallbacksC0051q.f1107k && I.F(abstractComponentCallbacksC0051q)) {
                            i2.f934D = true;
                        }
                        abstractComponentCallbacksC0051q.f1090I = false;
                        abstractComponentCallbacksC0051q.f1116t.n();
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
                            abstractComponentCallbacksC0051q.f1100a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0051q.f1110n = false;
                            abstractComponentCallbacksC0051q.f1100a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0051q);
                            }
                            if (abstractComponentCallbacksC0051q.f1087E != null && abstractComponentCallbacksC0051q.f1102c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0051q.f1087E != null && (viewGroup2 = abstractComponentCallbacksC0051q.f1086D) != null) {
                                C0043i f3 = C0043i.f(viewGroup2, abstractComponentCallbacksC0051q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0051q.f1100a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0051q.f1100a = 5;
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
                            if (abstractComponentCallbacksC0051q.f1087E != null && (viewGroup3 = abstractComponentCallbacksC0051q.f1086D) != null) {
                                C0043i f4 = C0043i.f(viewGroup3, abstractComponentCallbacksC0051q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0051q.f1087E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0051q.f1100a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0051q.f1100a = 6;
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1116t.t(5);
        if (abstractComponentCallbacksC0051q.f1087E != null) {
            abstractComponentCallbacksC0051q.f1095N.e(EnumC0071l.ON_PAUSE);
        }
        abstractComponentCallbacksC0051q.f1094M.d(EnumC0071l.ON_PAUSE);
        abstractComponentCallbacksC0051q.f1100a = 6;
        abstractComponentCallbacksC0051q.f1085C = true;
        this.f988a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        Bundle bundle = abstractComponentCallbacksC0051q.f1101b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0051q.f1102c = abstractComponentCallbacksC0051q.f1101b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0051q.d = abstractComponentCallbacksC0051q.f1101b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0051q.f1101b.getString("android:target_state");
        abstractComponentCallbacksC0051q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0051q.i = abstractComponentCallbacksC0051q.f1101b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0051q.f1101b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0051q.f1088G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0051q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0051q);
        }
        C0050p c0050p = abstractComponentCallbacksC0051q.f1089H;
        View view = c0050p == null ? null : c0050p.f1081k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0051q.f1087E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0051q.f1087E) {
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
                sb.append(abstractComponentCallbacksC0051q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0051q.f1087E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0051q.f().f1081k = null;
        abstractComponentCallbacksC0051q.f1116t.K();
        abstractComponentCallbacksC0051q.f1116t.y(true);
        abstractComponentCallbacksC0051q.f1100a = 7;
        abstractComponentCallbacksC0051q.f1085C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0051q.f1094M;
        EnumC0071l enumC0071l = EnumC0071l.ON_RESUME;
        tVar.d(enumC0071l);
        if (abstractComponentCallbacksC0051q.f1087E != null) {
            abstractComponentCallbacksC0051q.f1095N.f1000c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0051q.f1116t;
        i.f935E = false;
        i.F = false;
        i.f941L.f977g = false;
        i.t(7);
        this.f988a.n(false);
        abstractComponentCallbacksC0051q.f1101b = null;
        abstractComponentCallbacksC0051q.f1102c = null;
        abstractComponentCallbacksC0051q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (abstractComponentCallbacksC0051q.f1087E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0051q + " with view " + abstractComponentCallbacksC0051q.f1087E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0051q.f1087E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0051q.f1102c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0051q.f1095N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0051q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1116t.K();
        abstractComponentCallbacksC0051q.f1116t.y(true);
        abstractComponentCallbacksC0051q.f1100a = 5;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.y();
        if (!abstractComponentCallbacksC0051q.f1085C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0051q.f1094M;
        EnumC0071l enumC0071l = EnumC0071l.ON_START;
        tVar.d(enumC0071l);
        if (abstractComponentCallbacksC0051q.f1087E != null) {
            abstractComponentCallbacksC0051q.f1095N.f1000c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0051q.f1116t;
        i.f935E = false;
        i.F = false;
        i.f941L.f977g = false;
        i.t(5);
        this.f988a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f990c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0051q);
        }
        I i = abstractComponentCallbacksC0051q.f1116t;
        i.F = true;
        i.f941L.f977g = true;
        i.t(4);
        if (abstractComponentCallbacksC0051q.f1087E != null) {
            abstractComponentCallbacksC0051q.f1095N.e(EnumC0071l.ON_STOP);
        }
        abstractComponentCallbacksC0051q.f1094M.d(EnumC0071l.ON_STOP);
        abstractComponentCallbacksC0051q.f1100a = 4;
        abstractComponentCallbacksC0051q.f1085C = false;
        abstractComponentCallbacksC0051q.z();
        if (abstractComponentCallbacksC0051q.f1085C) {
            this.f988a.r(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, U.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f988a = jVar;
        this.f989b = uVar;
        AbstractComponentCallbacksC0051q a2 = c2.a(n2.f978a);
        Bundle bundle = n2.f984j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1103e = n2.f979b;
        a2.f1109m = n2.f980c;
        a2.f1111o = true;
        a2.f1118v = n2.d;
        a2.f1119w = n2.f981e;
        a2.f1120x = n2.f982f;
        a2.f1083A = n2.f983g;
        a2.f1108l = n2.h;
        a2.f1122z = n2.i;
        a2.f1121y = n2.f985k;
        a2.f1093L = EnumC0072m.values()[n2.f986l];
        Bundle bundle2 = n2.f987m;
        if (bundle2 != null) {
            a2.f1101b = bundle2;
        } else {
            a2.f1101b = new Bundle();
        }
        this.f990c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, U.u uVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, N n2) {
        this.f988a = jVar;
        this.f989b = uVar;
        this.f990c = abstractComponentCallbacksC0051q;
        abstractComponentCallbacksC0051q.f1102c = null;
        abstractComponentCallbacksC0051q.d = null;
        abstractComponentCallbacksC0051q.f1113q = 0;
        abstractComponentCallbacksC0051q.f1110n = false;
        abstractComponentCallbacksC0051q.f1107k = false;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = abstractComponentCallbacksC0051q.f1105g;
        abstractComponentCallbacksC0051q.h = abstractComponentCallbacksC0051q2 != null ? abstractComponentCallbacksC0051q2.f1103e : null;
        abstractComponentCallbacksC0051q.f1105g = null;
        Bundle bundle = n2.f987m;
        if (bundle != null) {
            abstractComponentCallbacksC0051q.f1101b = bundle;
        } else {
            abstractComponentCallbacksC0051q.f1101b = new Bundle();
        }
    }
}
