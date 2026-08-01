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
import androidx.lifecycle.EnumC0072l;
import androidx.lifecycle.EnumC0073m;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import d0.C0087a;
import i0.C0143a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f1015a;

    /* renamed from: b, reason: collision with root package name */
    public final U.u f1016b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0051q f1017c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1018e = -1;

    public O(B.j jVar, U.u uVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q) {
        this.f1015a = jVar;
        this.f1016b = uVar;
        this.f1017c = abstractComponentCallbacksC0051q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0051q);
        }
        Bundle bundle = abstractComponentCallbacksC0051q.f1128b;
        abstractComponentCallbacksC0051q.f1143t.K();
        abstractComponentCallbacksC0051q.f1127a = 3;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.p();
        if (!abstractComponentCallbacksC0051q.f1112C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0051q);
        }
        View view = abstractComponentCallbacksC0051q.f1114E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0051q.f1128b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0051q.f1129c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0051q.f1129c = null;
            }
            if (abstractComponentCallbacksC0051q.f1114E != null) {
                abstractComponentCallbacksC0051q.f1122N.d.b(abstractComponentCallbacksC0051q.d);
                abstractComponentCallbacksC0051q.d = null;
            }
            abstractComponentCallbacksC0051q.f1112C = false;
            abstractComponentCallbacksC0051q.A(bundle2);
            if (!abstractComponentCallbacksC0051q.f1112C) {
                throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0051q.f1114E != null) {
                abstractComponentCallbacksC0051q.f1122N.d(EnumC0072l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0051q.f1128b = null;
        I i = abstractComponentCallbacksC0051q.f1143t;
        i.f962E = false;
        i.F = false;
        i.f968L.f1004g = false;
        i.t(4);
        this.f1015a.d(false);
    }

    public final void b() {
        View view;
        View view2;
        U.u uVar = this.f1016b;
        uVar.getClass();
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1113D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) uVar.f883a;
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
                        if (abstractComponentCallbacksC0051q2.f1113D == viewGroup && (view = abstractComponentCallbacksC0051q2.f1114E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = (AbstractComponentCallbacksC0051q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0051q3.f1113D == viewGroup && (view2 = abstractComponentCallbacksC0051q3.f1114E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0051q.f1113D.addView(abstractComponentCallbacksC0051q.f1114E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0051q);
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = abstractComponentCallbacksC0051q.f1132g;
        O o2 = null;
        U.u uVar = this.f1016b;
        if (abstractComponentCallbacksC0051q2 != null) {
            O o3 = (O) ((HashMap) uVar.f884b).get(abstractComponentCallbacksC0051q2.f1130e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " declared target fragment " + abstractComponentCallbacksC0051q.f1132g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0051q.h = abstractComponentCallbacksC0051q.f1132g.f1130e;
            abstractComponentCallbacksC0051q.f1132g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0051q.h;
            if (str != null && (o2 = (O) ((HashMap) uVar.f884b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0051q + " declared target fragment " + abstractComponentCallbacksC0051q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0051q.f1141r;
        abstractComponentCallbacksC0051q.f1142s = i.f986t;
        abstractComponentCallbacksC0051q.f1144u = i.f988v;
        B.j jVar = this.f1015a;
        jVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0051q.f1125Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q3 = ((C0048n) it.next()).f1099a;
            abstractComponentCallbacksC0051q3.f1124P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0051q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0051q.f1143t.b(abstractComponentCallbacksC0051q.f1142s, abstractComponentCallbacksC0051q.d(), abstractComponentCallbacksC0051q);
        abstractComponentCallbacksC0051q.f1127a = 0;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.r(abstractComponentCallbacksC0051q.f1142s.f1157b);
        if (!abstractComponentCallbacksC0051q.f1112C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0051q.f1141r.f979m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).f();
        }
        I i2 = abstractComponentCallbacksC0051q.f1143t;
        i2.f962E = false;
        i2.F = false;
        i2.f968L.f1004g = false;
        i2.t(0);
        jVar.e(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (abstractComponentCallbacksC0051q.f1141r == null) {
            return abstractComponentCallbacksC0051q.f1127a;
        }
        int i = this.f1018e;
        int ordinal = abstractComponentCallbacksC0051q.f1120L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0051q.f1136m) {
            if (abstractComponentCallbacksC0051q.f1137n) {
                i = Math.max(this.f1018e, 2);
                View view = abstractComponentCallbacksC0051q.f1114E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1018e < 4 ? Math.min(i, abstractComponentCallbacksC0051q.f1127a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0051q.f1134k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1113D;
        if (viewGroup != null) {
            C0043i f2 = C0043i.f(viewGroup, abstractComponentCallbacksC0051q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0051q);
            r6 = d != null ? d.f1034b : 0;
            Iterator it = f2.f1080c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1035c.equals(abstractComponentCallbacksC0051q) && !u2.f1037f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1034b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0051q.f1135l) {
            i = abstractComponentCallbacksC0051q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0051q.F && abstractComponentCallbacksC0051q.f1127a < 5) {
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0051q);
        }
        if (abstractComponentCallbacksC0051q.f1118J) {
            Bundle bundle = abstractComponentCallbacksC0051q.f1128b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0051q.f1143t.Q(parcelable);
                I i = abstractComponentCallbacksC0051q.f1143t;
                i.f962E = false;
                i.F = false;
                i.f968L.f1004g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0051q.f1127a = 1;
            return;
        }
        B.j jVar = this.f1015a;
        jVar.m(false);
        Bundle bundle2 = abstractComponentCallbacksC0051q.f1128b;
        abstractComponentCallbacksC0051q.f1143t.K();
        abstractComponentCallbacksC0051q.f1127a = 1;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.f1121M.a(new C0143a(1, abstractComponentCallbacksC0051q));
        abstractComponentCallbacksC0051q.f1124P.b(bundle2);
        abstractComponentCallbacksC0051q.s(bundle2);
        abstractComponentCallbacksC0051q.f1118J = true;
        if (abstractComponentCallbacksC0051q.f1112C) {
            abstractComponentCallbacksC0051q.f1121M.d(EnumC0072l.ON_CREATE);
            jVar.f(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (abstractComponentCallbacksC0051q.f1136m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0051q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0051q.w(abstractComponentCallbacksC0051q.f1128b);
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1113D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0051q.f1146w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0051q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0051q.f1141r.f987u.b0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0051q.f1138o) {
                        try {
                            str = abstractComponentCallbacksC0051q.C().getResources().getResourceName(abstractComponentCallbacksC0051q.f1146w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0051q.f1146w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0051q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1178a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0051q, "Attempting to add fragment " + abstractComponentCallbacksC0051q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0051q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0051q.f1113D = viewGroup;
        abstractComponentCallbacksC0051q.B(w2, viewGroup, abstractComponentCallbacksC0051q.f1128b);
        View view = abstractComponentCallbacksC0051q.f1114E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0051q.f1114E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0051q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0051q.f1148y) {
                abstractComponentCallbacksC0051q.f1114E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0051q.f1114E;
            WeakHashMap weakHashMap = K.T.f440a;
            if (view2.isAttachedToWindow()) {
                K.F.c(abstractComponentCallbacksC0051q.f1114E);
            } else {
                View view3 = abstractComponentCallbacksC0051q.f1114E;
                view3.addOnAttachStateChangeListener(new M0.o(1, view3));
            }
            abstractComponentCallbacksC0051q.f1143t.t(2);
            this.f1015a.r(false);
            int visibility = abstractComponentCallbacksC0051q.f1114E.getVisibility();
            abstractComponentCallbacksC0051q.f().f1107j = abstractComponentCallbacksC0051q.f1114E.getAlpha();
            if (abstractComponentCallbacksC0051q.f1113D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0051q.f1114E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0051q.f().f1108k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0051q);
                    }
                }
                abstractComponentCallbacksC0051q.f1114E.setAlpha(RecyclerView.f1559A0);
            }
        }
        abstractComponentCallbacksC0051q.f1127a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0051q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0051q);
        }
        boolean z3 = abstractComponentCallbacksC0051q.f1135l && !abstractComponentCallbacksC0051q.o();
        U.u uVar = this.f1016b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) uVar.d;
            if (!((l2.f1000b.containsKey(abstractComponentCallbacksC0051q.f1130e) && l2.f1002e) ? l2.f1003f : true)) {
                String str = abstractComponentCallbacksC0051q.h;
                if (str != null && (d = uVar.d(str)) != null && d.f1110A) {
                    abstractComponentCallbacksC0051q.f1132g = d;
                }
                abstractComponentCallbacksC0051q.f1127a = 0;
                return;
            }
        }
        C0054u c0054u = abstractComponentCallbacksC0051q.f1142s;
        if (c0054u != null) {
            z2 = ((L) uVar.d).f1003f;
        } else {
            z2 = c0054u.f1157b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) uVar.d).c(abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1143t.k();
        abstractComponentCallbacksC0051q.f1121M.d(EnumC0072l.ON_DESTROY);
        abstractComponentCallbacksC0051q.f1127a = 0;
        abstractComponentCallbacksC0051q.f1118J = false;
        abstractComponentCallbacksC0051q.f1112C = true;
        this.f1015a.g(false);
        Iterator it = uVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0051q.f1130e;
                AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = o2.f1017c;
                if (str2.equals(abstractComponentCallbacksC0051q2.h)) {
                    abstractComponentCallbacksC0051q2.f1132g = abstractComponentCallbacksC0051q;
                    abstractComponentCallbacksC0051q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0051q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0051q.f1132g = uVar.d(str3);
        }
        uVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0051q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0051q.f1113D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0051q.f1114E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0051q.f1143t.t(1);
        if (abstractComponentCallbacksC0051q.f1114E != null && abstractComponentCallbacksC0051q.f1122N.e().f1521c.compareTo(EnumC0073m.f1513c) >= 0) {
            abstractComponentCallbacksC0051q.f1122N.d(EnumC0072l.ON_DESTROY);
        }
        abstractComponentCallbacksC0051q.f1127a = 1;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.u();
        if (!abstractComponentCallbacksC0051q.f1112C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0087a) new C.g(abstractComponentCallbacksC0051q.c(), C0087a.f2062c).z(C0087a.class)).f2063b;
        if (lVar.f3295c > 0) {
            lVar.f3294b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0051q.f1139p = false;
        this.f1015a.t(false);
        abstractComponentCallbacksC0051q.f1113D = null;
        abstractComponentCallbacksC0051q.f1114E = null;
        abstractComponentCallbacksC0051q.f1122N = null;
        abstractComponentCallbacksC0051q.f1123O.d(null);
        abstractComponentCallbacksC0051q.f1137n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1127a = -1;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.v();
        if (!abstractComponentCallbacksC0051q.f1112C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0051q.f1143t;
        if (!i.f963G) {
            i.k();
            abstractComponentCallbacksC0051q.f1143t = new I();
        }
        this.f1015a.i(false);
        abstractComponentCallbacksC0051q.f1127a = -1;
        abstractComponentCallbacksC0051q.f1142s = null;
        abstractComponentCallbacksC0051q.f1144u = null;
        abstractComponentCallbacksC0051q.f1141r = null;
        if (!abstractComponentCallbacksC0051q.f1135l || abstractComponentCallbacksC0051q.o()) {
            L l2 = (L) this.f1016b.d;
            boolean z2 = true;
            if (l2.f1000b.containsKey(abstractComponentCallbacksC0051q.f1130e) && l2.f1002e) {
                z2 = l2.f1003f;
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (abstractComponentCallbacksC0051q.f1136m && abstractComponentCallbacksC0051q.f1137n && !abstractComponentCallbacksC0051q.f1139p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0051q);
            }
            abstractComponentCallbacksC0051q.B(abstractComponentCallbacksC0051q.w(abstractComponentCallbacksC0051q.f1128b), null, abstractComponentCallbacksC0051q.f1128b);
            View view = abstractComponentCallbacksC0051q.f1114E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0051q.f1114E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0051q);
                if (abstractComponentCallbacksC0051q.f1148y) {
                    abstractComponentCallbacksC0051q.f1114E.setVisibility(8);
                }
                abstractComponentCallbacksC0051q.f1143t.t(2);
                this.f1015a.r(false);
                abstractComponentCallbacksC0051q.f1127a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        U.u uVar = this.f1016b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
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
                int i = abstractComponentCallbacksC0051q.f1127a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0051q.f1135l && !abstractComponentCallbacksC0051q.o()) {
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
                    if (abstractComponentCallbacksC0051q.f1117I) {
                        if (abstractComponentCallbacksC0051q.f1114E != null && (viewGroup = abstractComponentCallbacksC0051q.f1113D) != null) {
                            C0043i f2 = C0043i.f(viewGroup, abstractComponentCallbacksC0051q.j().D());
                            if (abstractComponentCallbacksC0051q.f1148y) {
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
                        I i2 = abstractComponentCallbacksC0051q.f1141r;
                        if (i2 != null && abstractComponentCallbacksC0051q.f1134k && I.F(abstractComponentCallbacksC0051q)) {
                            i2.f961D = true;
                        }
                        abstractComponentCallbacksC0051q.f1117I = false;
                        abstractComponentCallbacksC0051q.f1143t.n();
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
                            abstractComponentCallbacksC0051q.f1127a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0051q.f1137n = false;
                            abstractComponentCallbacksC0051q.f1127a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0051q);
                            }
                            if (abstractComponentCallbacksC0051q.f1114E != null && abstractComponentCallbacksC0051q.f1129c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0051q.f1114E != null && (viewGroup2 = abstractComponentCallbacksC0051q.f1113D) != null) {
                                C0043i f3 = C0043i.f(viewGroup2, abstractComponentCallbacksC0051q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0051q.f1127a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0051q.f1127a = 5;
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
                            if (abstractComponentCallbacksC0051q.f1114E != null && (viewGroup3 = abstractComponentCallbacksC0051q.f1113D) != null) {
                                C0043i f4 = C0043i.f(viewGroup3, abstractComponentCallbacksC0051q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0051q.f1114E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0051q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0051q.f1127a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0051q.f1127a = 6;
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
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1143t.t(5);
        if (abstractComponentCallbacksC0051q.f1114E != null) {
            abstractComponentCallbacksC0051q.f1122N.d(EnumC0072l.ON_PAUSE);
        }
        abstractComponentCallbacksC0051q.f1121M.d(EnumC0072l.ON_PAUSE);
        abstractComponentCallbacksC0051q.f1127a = 6;
        abstractComponentCallbacksC0051q.f1112C = true;
        this.f1015a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        Bundle bundle = abstractComponentCallbacksC0051q.f1128b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0051q.f1129c = abstractComponentCallbacksC0051q.f1128b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0051q.d = abstractComponentCallbacksC0051q.f1128b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0051q.f1128b.getString("android:target_state");
        abstractComponentCallbacksC0051q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0051q.i = abstractComponentCallbacksC0051q.f1128b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0051q.f1128b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0051q.f1115G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0051q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0051q);
        }
        C0050p c0050p = abstractComponentCallbacksC0051q.f1116H;
        View view = c0050p == null ? null : c0050p.f1108k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0051q.f1114E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0051q.f1114E) {
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
                sb.append(abstractComponentCallbacksC0051q.f1114E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0051q.f().f1108k = null;
        abstractComponentCallbacksC0051q.f1143t.K();
        abstractComponentCallbacksC0051q.f1143t.y(true);
        abstractComponentCallbacksC0051q.f1127a = 7;
        abstractComponentCallbacksC0051q.f1112C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0051q.f1121M;
        EnumC0072l enumC0072l = EnumC0072l.ON_RESUME;
        tVar.d(enumC0072l);
        if (abstractComponentCallbacksC0051q.f1114E != null) {
            abstractComponentCallbacksC0051q.f1122N.f1027c.d(enumC0072l);
        }
        I i = abstractComponentCallbacksC0051q.f1143t;
        i.f962E = false;
        i.F = false;
        i.f968L.f1004g = false;
        i.t(7);
        this.f1015a.n(false);
        abstractComponentCallbacksC0051q.f1128b = null;
        abstractComponentCallbacksC0051q.f1129c = null;
        abstractComponentCallbacksC0051q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (abstractComponentCallbacksC0051q.f1114E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0051q + " with view " + abstractComponentCallbacksC0051q.f1114E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0051q.f1114E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0051q.f1129c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0051q.f1122N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0051q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0051q);
        }
        abstractComponentCallbacksC0051q.f1143t.K();
        abstractComponentCallbacksC0051q.f1143t.y(true);
        abstractComponentCallbacksC0051q.f1127a = 5;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.y();
        if (!abstractComponentCallbacksC0051q.f1112C) {
            throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0051q.f1121M;
        EnumC0072l enumC0072l = EnumC0072l.ON_START;
        tVar.d(enumC0072l);
        if (abstractComponentCallbacksC0051q.f1114E != null) {
            abstractComponentCallbacksC0051q.f1122N.f1027c.d(enumC0072l);
        }
        I i = abstractComponentCallbacksC0051q.f1143t;
        i.f962E = false;
        i.F = false;
        i.f968L.f1004g = false;
        i.t(5);
        this.f1015a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1017c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0051q);
        }
        I i = abstractComponentCallbacksC0051q.f1143t;
        i.F = true;
        i.f968L.f1004g = true;
        i.t(4);
        if (abstractComponentCallbacksC0051q.f1114E != null) {
            abstractComponentCallbacksC0051q.f1122N.d(EnumC0072l.ON_STOP);
        }
        abstractComponentCallbacksC0051q.f1121M.d(EnumC0072l.ON_STOP);
        abstractComponentCallbacksC0051q.f1127a = 4;
        abstractComponentCallbacksC0051q.f1112C = false;
        abstractComponentCallbacksC0051q.z();
        if (abstractComponentCallbacksC0051q.f1112C) {
            this.f1015a.q(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0051q + " did not call through to super.onStop()");
    }

    public O(B.j jVar, U.u uVar, ClassLoader classLoader, C c2, N n2) {
        this.f1015a = jVar;
        this.f1016b = uVar;
        AbstractComponentCallbacksC0051q a2 = c2.a(n2.f1005a);
        Bundle bundle = n2.f1011j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1130e = n2.f1006b;
        a2.f1136m = n2.f1007c;
        a2.f1138o = true;
        a2.f1145v = n2.d;
        a2.f1146w = n2.f1008e;
        a2.f1147x = n2.f1009f;
        a2.f1110A = n2.f1010g;
        a2.f1135l = n2.h;
        a2.f1149z = n2.i;
        a2.f1148y = n2.f1012k;
        a2.f1120L = EnumC0073m.values()[n2.f1013l];
        Bundle bundle2 = n2.f1014m;
        if (bundle2 != null) {
            a2.f1128b = bundle2;
        } else {
            a2.f1128b = new Bundle();
        }
        this.f1017c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B.j jVar, U.u uVar, AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q, N n2) {
        this.f1015a = jVar;
        this.f1016b = uVar;
        this.f1017c = abstractComponentCallbacksC0051q;
        abstractComponentCallbacksC0051q.f1129c = null;
        abstractComponentCallbacksC0051q.d = null;
        abstractComponentCallbacksC0051q.f1140q = 0;
        abstractComponentCallbacksC0051q.f1137n = false;
        abstractComponentCallbacksC0051q.f1134k = false;
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q2 = abstractComponentCallbacksC0051q.f1132g;
        abstractComponentCallbacksC0051q.h = abstractComponentCallbacksC0051q2 != null ? abstractComponentCallbacksC0051q2.f1130e : null;
        abstractComponentCallbacksC0051q.f1132g = null;
        Bundle bundle = n2.f1014m;
        if (bundle != null) {
            abstractComponentCallbacksC0051q.f1128b = bundle;
        } else {
            abstractComponentCallbacksC0051q.f1128b = new Bundle();
        }
    }
}
