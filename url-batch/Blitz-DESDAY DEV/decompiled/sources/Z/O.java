package Z;

import a0.AbstractC0056d;
import a0.C0053a;
import a0.C0055c;
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
import com.winfour.neondrop.R;
import e0.C0083a;
import j0.C0157a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final D.j f1077a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.g f1078b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0047q f1079c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1080e = -1;

    public O(D.j jVar, T0.g gVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q) {
        this.f1077a = jVar;
        this.f1078b = gVar;
        this.f1079c = abstractComponentCallbacksC0047q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0047q);
        }
        Bundle bundle = abstractComponentCallbacksC0047q.f1190b;
        abstractComponentCallbacksC0047q.f1205t.K();
        abstractComponentCallbacksC0047q.f1189a = 3;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.p();
        if (!abstractComponentCallbacksC0047q.f1174C) {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0047q);
        }
        View view = abstractComponentCallbacksC0047q.f1176E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0047q.f1190b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0047q.f1191c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0047q.f1191c = null;
            }
            if (abstractComponentCallbacksC0047q.f1176E != null) {
                abstractComponentCallbacksC0047q.f1184N.d.b(abstractComponentCallbacksC0047q.d);
                abstractComponentCallbacksC0047q.d = null;
            }
            abstractComponentCallbacksC0047q.f1174C = false;
            abstractComponentCallbacksC0047q.A(bundle2);
            if (!abstractComponentCallbacksC0047q.f1174C) {
                throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0047q.f1176E != null) {
                abstractComponentCallbacksC0047q.f1184N.b(EnumC0069l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0047q.f1190b = null;
        I i = abstractComponentCallbacksC0047q.f1205t;
        i.f1024E = false;
        i.f1025F = false;
        i.f1030L.f1066g = false;
        i.t(4);
        this.f1077a.b(false);
    }

    public final void b() {
        View view;
        View view2;
        T0.g gVar = this.f1078b;
        gVar.getClass();
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1175D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) gVar.f824a;
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
                        if (abstractComponentCallbacksC0047q2.f1175D == viewGroup && (view = abstractComponentCallbacksC0047q2.f1176E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = (AbstractComponentCallbacksC0047q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0047q3.f1175D == viewGroup && (view2 = abstractComponentCallbacksC0047q3.f1176E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0047q.f1175D.addView(abstractComponentCallbacksC0047q.f1176E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0047q);
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = abstractComponentCallbacksC0047q.f1194g;
        O o2 = null;
        T0.g gVar = this.f1078b;
        if (abstractComponentCallbacksC0047q2 != null) {
            O o3 = (O) ((HashMap) gVar.f825b).get(abstractComponentCallbacksC0047q2.f1192e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " declared target fragment " + abstractComponentCallbacksC0047q.f1194g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0047q.h = abstractComponentCallbacksC0047q.f1194g.f1192e;
            abstractComponentCallbacksC0047q.f1194g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0047q.h;
            if (str != null && (o2 = (O) ((HashMap) gVar.f825b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0047q + " declared target fragment " + abstractComponentCallbacksC0047q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0047q.f1203r;
        abstractComponentCallbacksC0047q.f1204s = i.f1048t;
        abstractComponentCallbacksC0047q.f1206u = i.f1050v;
        D.j jVar = this.f1077a;
        jVar.k(false);
        ArrayList arrayList = abstractComponentCallbacksC0047q.f1187Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q3 = ((C0044n) it.next()).f1161a;
            abstractComponentCallbacksC0047q3.f1186P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0047q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0047q.f1205t.b(abstractComponentCallbacksC0047q.f1204s, abstractComponentCallbacksC0047q.b(), abstractComponentCallbacksC0047q);
        abstractComponentCallbacksC0047q.f1189a = 0;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.r(abstractComponentCallbacksC0047q.f1204s.f1219b);
        if (!abstractComponentCallbacksC0047q.f1174C) {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0047q.f1203r.f1041m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).e();
        }
        I i2 = abstractComponentCallbacksC0047q.f1205t;
        i2.f1024E = false;
        i2.f1025F = false;
        i2.f1030L.f1066g = false;
        i2.t(0);
        jVar.c(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (abstractComponentCallbacksC0047q.f1203r == null) {
            return abstractComponentCallbacksC0047q.f1189a;
        }
        int i = this.f1080e;
        int ordinal = abstractComponentCallbacksC0047q.f1182L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0047q.f1198m) {
            if (abstractComponentCallbacksC0047q.f1199n) {
                i = Math.max(this.f1080e, 2);
                View view = abstractComponentCallbacksC0047q.f1176E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1080e < 4 ? Math.min(i, abstractComponentCallbacksC0047q.f1189a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0047q.f1196k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1175D;
        if (viewGroup != null) {
            C0039i f2 = C0039i.f(viewGroup, abstractComponentCallbacksC0047q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0047q);
            r6 = d != null ? d.f1096b : 0;
            Iterator it = f2.f1142c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1097c.equals(abstractComponentCallbacksC0047q) && !u2.f1099f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1096b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0047q.f1197l) {
            i = abstractComponentCallbacksC0047q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0047q.f1177F && abstractComponentCallbacksC0047q.f1189a < 5) {
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0047q);
        }
        if (abstractComponentCallbacksC0047q.f1180J) {
            Bundle bundle = abstractComponentCallbacksC0047q.f1190b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0047q.f1205t.Q(parcelable);
                I i = abstractComponentCallbacksC0047q.f1205t;
                i.f1024E = false;
                i.f1025F = false;
                i.f1030L.f1066g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0047q.f1189a = 1;
            return;
        }
        D.j jVar = this.f1077a;
        jVar.m(false);
        Bundle bundle2 = abstractComponentCallbacksC0047q.f1190b;
        abstractComponentCallbacksC0047q.f1205t.K();
        abstractComponentCallbacksC0047q.f1189a = 1;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.f1183M.a(new C0157a(1, abstractComponentCallbacksC0047q));
        abstractComponentCallbacksC0047q.f1186P.b(bundle2);
        abstractComponentCallbacksC0047q.s(bundle2);
        abstractComponentCallbacksC0047q.f1180J = true;
        if (abstractComponentCallbacksC0047q.f1174C) {
            abstractComponentCallbacksC0047q.f1183M.d(EnumC0069l.ON_CREATE);
            jVar.e(false);
        } else {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (abstractComponentCallbacksC0047q.f1198m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0047q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0047q.w(abstractComponentCallbacksC0047q.f1190b);
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1175D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0047q.f1208w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0047q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0047q.f1203r.f1049u.c0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0047q.f1200o) {
                        try {
                            str = abstractComponentCallbacksC0047q.C().getResources().getResourceName(abstractComponentCallbacksC0047q.f1208w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0047q.f1208w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0047q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0055c c0055c = AbstractC0056d.f1311a;
                    AbstractC0056d.b(new C0053a(abstractComponentCallbacksC0047q, "Attempting to add fragment " + abstractComponentCallbacksC0047q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0056d.a(abstractComponentCallbacksC0047q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0047q.f1175D = viewGroup;
        abstractComponentCallbacksC0047q.B(w2, viewGroup, abstractComponentCallbacksC0047q.f1190b);
        View view = abstractComponentCallbacksC0047q.f1176E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0047q.f1176E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0047q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0047q.f1210y) {
                abstractComponentCallbacksC0047q.f1176E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0047q.f1176E;
            WeakHashMap weakHashMap = M.Q.f513a;
            if (view2.isAttachedToWindow()) {
                M.D.c(abstractComponentCallbacksC0047q.f1176E);
            } else {
                View view3 = abstractComponentCallbacksC0047q.f1176E;
                view3.addOnAttachStateChangeListener(new O0.o(1, view3));
            }
            abstractComponentCallbacksC0047q.f1205t.t(2);
            this.f1077a.r(false);
            int visibility = abstractComponentCallbacksC0047q.f1176E.getVisibility();
            abstractComponentCallbacksC0047q.e().f1169j = abstractComponentCallbacksC0047q.f1176E.getAlpha();
            if (abstractComponentCallbacksC0047q.f1175D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0047q.f1176E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0047q.e().f1170k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0047q);
                    }
                }
                abstractComponentCallbacksC0047q.f1176E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0047q.f1189a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0047q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0047q);
        }
        boolean z3 = abstractComponentCallbacksC0047q.f1197l && !abstractComponentCallbacksC0047q.o();
        T0.g gVar = this.f1078b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) gVar.d;
            if (!((l2.f1062b.containsKey(abstractComponentCallbacksC0047q.f1192e) && l2.f1064e) ? l2.f1065f : true)) {
                String str = abstractComponentCallbacksC0047q.h;
                if (str != null && (d = gVar.d(str)) != null && d.f1172A) {
                    abstractComponentCallbacksC0047q.f1194g = d;
                }
                abstractComponentCallbacksC0047q.f1189a = 0;
                return;
            }
        }
        C0050u c0050u = abstractComponentCallbacksC0047q.f1204s;
        if (c0050u != null) {
            z2 = ((L) gVar.d).f1065f;
        } else {
            z2 = c0050u.f1219b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) gVar.d).c(abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1205t.k();
        abstractComponentCallbacksC0047q.f1183M.d(EnumC0069l.ON_DESTROY);
        abstractComponentCallbacksC0047q.f1189a = 0;
        abstractComponentCallbacksC0047q.f1180J = false;
        abstractComponentCallbacksC0047q.f1174C = true;
        this.f1077a.f(false);
        Iterator it = gVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0047q.f1192e;
                AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = o2.f1079c;
                if (str2.equals(abstractComponentCallbacksC0047q2.h)) {
                    abstractComponentCallbacksC0047q2.f1194g = abstractComponentCallbacksC0047q;
                    abstractComponentCallbacksC0047q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0047q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0047q.f1194g = gVar.d(str3);
        }
        gVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0047q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0047q.f1175D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0047q.f1176E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0047q.f1205t.t(1);
        if (abstractComponentCallbacksC0047q.f1176E != null && abstractComponentCallbacksC0047q.f1184N.f().f1578c.compareTo(EnumC0070m.f1570c) >= 0) {
            abstractComponentCallbacksC0047q.f1184N.b(EnumC0069l.ON_DESTROY);
        }
        abstractComponentCallbacksC0047q.f1189a = 1;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.u();
        if (!abstractComponentCallbacksC0047q.f1174C) {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onDestroyView()");
        }
        q.l lVar = ((C0083a) new E.g(abstractComponentCallbacksC0047q.d(), C0083a.f2125c).w(C0083a.class)).f2126b;
        if (lVar.f3375c > 0) {
            lVar.f3374b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0047q.f1201p = false;
        this.f1077a.s(false);
        abstractComponentCallbacksC0047q.f1175D = null;
        abstractComponentCallbacksC0047q.f1176E = null;
        abstractComponentCallbacksC0047q.f1184N = null;
        abstractComponentCallbacksC0047q.f1185O.d(null);
        abstractComponentCallbacksC0047q.f1199n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1189a = -1;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.v();
        if (!abstractComponentCallbacksC0047q.f1174C) {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0047q.f1205t;
        if (!i.f1026G) {
            i.k();
            abstractComponentCallbacksC0047q.f1205t = new I();
        }
        this.f1077a.i(false);
        abstractComponentCallbacksC0047q.f1189a = -1;
        abstractComponentCallbacksC0047q.f1204s = null;
        abstractComponentCallbacksC0047q.f1206u = null;
        abstractComponentCallbacksC0047q.f1203r = null;
        if (!abstractComponentCallbacksC0047q.f1197l || abstractComponentCallbacksC0047q.o()) {
            L l2 = (L) this.f1078b.d;
            boolean z2 = true;
            if (l2.f1062b.containsKey(abstractComponentCallbacksC0047q.f1192e) && l2.f1064e) {
                z2 = l2.f1065f;
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (abstractComponentCallbacksC0047q.f1198m && abstractComponentCallbacksC0047q.f1199n && !abstractComponentCallbacksC0047q.f1201p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0047q);
            }
            abstractComponentCallbacksC0047q.B(abstractComponentCallbacksC0047q.w(abstractComponentCallbacksC0047q.f1190b), null, abstractComponentCallbacksC0047q.f1190b);
            View view = abstractComponentCallbacksC0047q.f1176E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0047q.f1176E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0047q);
                if (abstractComponentCallbacksC0047q.f1210y) {
                    abstractComponentCallbacksC0047q.f1176E.setVisibility(8);
                }
                abstractComponentCallbacksC0047q.f1205t.t(2);
                this.f1077a.r(false);
                abstractComponentCallbacksC0047q.f1189a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T0.g gVar = this.f1078b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
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
                int i = abstractComponentCallbacksC0047q.f1189a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0047q.f1197l && !abstractComponentCallbacksC0047q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0047q);
                        }
                        ((L) gVar.d).c(abstractComponentCallbacksC0047q);
                        gVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0047q);
                        }
                        abstractComponentCallbacksC0047q.l();
                    }
                    if (abstractComponentCallbacksC0047q.f1179I) {
                        if (abstractComponentCallbacksC0047q.f1176E != null && (viewGroup = abstractComponentCallbacksC0047q.f1175D) != null) {
                            C0039i f2 = C0039i.f(viewGroup, abstractComponentCallbacksC0047q.j().D());
                            if (abstractComponentCallbacksC0047q.f1210y) {
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
                        I i2 = abstractComponentCallbacksC0047q.f1203r;
                        if (i2 != null && abstractComponentCallbacksC0047q.f1196k && I.F(abstractComponentCallbacksC0047q)) {
                            i2.f1023D = true;
                        }
                        abstractComponentCallbacksC0047q.f1179I = false;
                        abstractComponentCallbacksC0047q.f1205t.n();
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
                            abstractComponentCallbacksC0047q.f1189a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0047q.f1199n = false;
                            abstractComponentCallbacksC0047q.f1189a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0047q);
                            }
                            if (abstractComponentCallbacksC0047q.f1176E != null && abstractComponentCallbacksC0047q.f1191c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0047q.f1176E != null && (viewGroup2 = abstractComponentCallbacksC0047q.f1175D) != null) {
                                C0039i f3 = C0039i.f(viewGroup2, abstractComponentCallbacksC0047q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0047q.f1189a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0047q.f1189a = 5;
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
                            if (abstractComponentCallbacksC0047q.f1176E != null && (viewGroup3 = abstractComponentCallbacksC0047q.f1175D) != null) {
                                C0039i f4 = C0039i.f(viewGroup3, abstractComponentCallbacksC0047q.j().D());
                                int b2 = X0.a.b(abstractComponentCallbacksC0047q.f1176E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0047q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0047q.f1189a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0047q.f1189a = 6;
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
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1205t.t(5);
        if (abstractComponentCallbacksC0047q.f1176E != null) {
            abstractComponentCallbacksC0047q.f1184N.b(EnumC0069l.ON_PAUSE);
        }
        abstractComponentCallbacksC0047q.f1183M.d(EnumC0069l.ON_PAUSE);
        abstractComponentCallbacksC0047q.f1189a = 6;
        abstractComponentCallbacksC0047q.f1174C = true;
        this.f1077a.j(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        Bundle bundle = abstractComponentCallbacksC0047q.f1190b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0047q.f1191c = abstractComponentCallbacksC0047q.f1190b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0047q.d = abstractComponentCallbacksC0047q.f1190b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0047q.f1190b.getString("android:target_state");
        abstractComponentCallbacksC0047q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0047q.i = abstractComponentCallbacksC0047q.f1190b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0047q.f1190b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0047q.f1178G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0047q.f1177F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0047q);
        }
        C0046p c0046p = abstractComponentCallbacksC0047q.H;
        View view = c0046p == null ? null : c0046p.f1170k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0047q.f1176E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0047q.f1176E) {
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
                sb.append(abstractComponentCallbacksC0047q.f1176E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0047q.e().f1170k = null;
        abstractComponentCallbacksC0047q.f1205t.K();
        abstractComponentCallbacksC0047q.f1205t.y(true);
        abstractComponentCallbacksC0047q.f1189a = 7;
        abstractComponentCallbacksC0047q.f1174C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0047q.f1183M;
        EnumC0069l enumC0069l = EnumC0069l.ON_RESUME;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0047q.f1176E != null) {
            abstractComponentCallbacksC0047q.f1184N.f1089c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0047q.f1205t;
        i.f1024E = false;
        i.f1025F = false;
        i.f1030L.f1066g = false;
        i.t(7);
        this.f1077a.n(false);
        abstractComponentCallbacksC0047q.f1190b = null;
        abstractComponentCallbacksC0047q.f1191c = null;
        abstractComponentCallbacksC0047q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (abstractComponentCallbacksC0047q.f1176E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0047q + " with view " + abstractComponentCallbacksC0047q.f1176E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0047q.f1176E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0047q.f1191c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0047q.f1184N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0047q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0047q);
        }
        abstractComponentCallbacksC0047q.f1205t.K();
        abstractComponentCallbacksC0047q.f1205t.y(true);
        abstractComponentCallbacksC0047q.f1189a = 5;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.y();
        if (!abstractComponentCallbacksC0047q.f1174C) {
            throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0047q.f1183M;
        EnumC0069l enumC0069l = EnumC0069l.ON_START;
        tVar.d(enumC0069l);
        if (abstractComponentCallbacksC0047q.f1176E != null) {
            abstractComponentCallbacksC0047q.f1184N.f1089c.d(enumC0069l);
        }
        I i = abstractComponentCallbacksC0047q.f1205t;
        i.f1024E = false;
        i.f1025F = false;
        i.f1030L.f1066g = false;
        i.t(5);
        this.f1077a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1079c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0047q);
        }
        I i = abstractComponentCallbacksC0047q.f1205t;
        i.f1025F = true;
        i.f1030L.f1066g = true;
        i.t(4);
        if (abstractComponentCallbacksC0047q.f1176E != null) {
            abstractComponentCallbacksC0047q.f1184N.b(EnumC0069l.ON_STOP);
        }
        abstractComponentCallbacksC0047q.f1183M.d(EnumC0069l.ON_STOP);
        abstractComponentCallbacksC0047q.f1189a = 4;
        abstractComponentCallbacksC0047q.f1174C = false;
        abstractComponentCallbacksC0047q.z();
        if (abstractComponentCallbacksC0047q.f1174C) {
            this.f1077a.q(false);
            return;
        }
        throw new V("Fragment " + abstractComponentCallbacksC0047q + " did not call through to super.onStop()");
    }

    public O(D.j jVar, T0.g gVar, ClassLoader classLoader, C c2, N n2) {
        this.f1077a = jVar;
        this.f1078b = gVar;
        AbstractComponentCallbacksC0047q a2 = c2.a(n2.f1067a);
        Bundle bundle = n2.f1073j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1192e = n2.f1068b;
        a2.f1198m = n2.f1069c;
        a2.f1200o = true;
        a2.f1207v = n2.d;
        a2.f1208w = n2.f1070e;
        a2.f1209x = n2.f1071f;
        a2.f1172A = n2.f1072g;
        a2.f1197l = n2.h;
        a2.f1211z = n2.i;
        a2.f1210y = n2.f1074k;
        a2.f1182L = EnumC0070m.values()[n2.f1075l];
        Bundle bundle2 = n2.f1076m;
        if (bundle2 != null) {
            a2.f1190b = bundle2;
        } else {
            a2.f1190b = new Bundle();
        }
        this.f1079c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(D.j jVar, T0.g gVar, AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q, N n2) {
        this.f1077a = jVar;
        this.f1078b = gVar;
        this.f1079c = abstractComponentCallbacksC0047q;
        abstractComponentCallbacksC0047q.f1191c = null;
        abstractComponentCallbacksC0047q.d = null;
        abstractComponentCallbacksC0047q.f1202q = 0;
        abstractComponentCallbacksC0047q.f1199n = false;
        abstractComponentCallbacksC0047q.f1196k = false;
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q2 = abstractComponentCallbacksC0047q.f1194g;
        abstractComponentCallbacksC0047q.h = abstractComponentCallbacksC0047q2 != null ? abstractComponentCallbacksC0047q2.f1192e : null;
        abstractComponentCallbacksC0047q.f1194g = null;
        Bundle bundle = n2.f1076m;
        if (bundle != null) {
            abstractComponentCallbacksC0047q.f1190b = bundle;
        } else {
            abstractComponentCallbacksC0047q.f1190b = new Bundle();
        }
    }
}
