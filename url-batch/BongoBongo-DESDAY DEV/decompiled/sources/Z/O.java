package Z;

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
import androidx.lifecycle.EnumC0078l;
import androidx.lifecycle.EnumC0079m;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;
import e0.C0096a;
import j0.C0146a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C.j f1062a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.g f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1064c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1065e = -1;

    public O(C.j jVar, S0.g gVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1062a = jVar;
        this.f1063b = gVar;
        this.f1064c = abstractComponentCallbacksC0050q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0050q);
        }
        Bundle bundle = abstractComponentCallbacksC0050q.f1180b;
        abstractComponentCallbacksC0050q.f1196t.K();
        abstractComponentCallbacksC0050q.f1179a = 3;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.p();
        if (!abstractComponentCallbacksC0050q.f1164C) {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0050q);
        }
        View view = abstractComponentCallbacksC0050q.f1166E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0050q.f1180b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0050q.f1181c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0050q.f1181c = null;
            }
            if (abstractComponentCallbacksC0050q.f1166E != null) {
                abstractComponentCallbacksC0050q.f1174N.d.b(abstractComponentCallbacksC0050q.d);
                abstractComponentCallbacksC0050q.d = null;
            }
            abstractComponentCallbacksC0050q.f1164C = false;
            abstractComponentCallbacksC0050q.A(bundle2);
            if (!abstractComponentCallbacksC0050q.f1164C) {
                throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0050q.f1166E != null) {
                abstractComponentCallbacksC0050q.f1174N.e(EnumC0078l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0050q.f1180b = null;
        I i = abstractComponentCallbacksC0050q.f1196t;
        i.f1005E = false;
        i.f1006F = false;
        i.f1011L.f1050g = false;
        i.t(4);
        this.f1062a.c(false);
    }

    public final void b() {
        View view;
        View view2;
        S0.g gVar = this.f1063b;
        gVar.getClass();
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1165D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) gVar.f822a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0050q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = (AbstractComponentCallbacksC0050q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0050q2.f1165D == viewGroup && (view = abstractComponentCallbacksC0050q2.f1166E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0050q3.f1165D == viewGroup && (view2 = abstractComponentCallbacksC0050q3.f1166E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0050q.f1165D.addView(abstractComponentCallbacksC0050q.f1166E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0050q);
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = abstractComponentCallbacksC0050q.f1184g;
        O o2 = null;
        S0.g gVar = this.f1063b;
        if (abstractComponentCallbacksC0050q2 != null) {
            O o3 = (O) ((HashMap) gVar.f823b).get(abstractComponentCallbacksC0050q2.f1182e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " declared target fragment " + abstractComponentCallbacksC0050q.f1184g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0050q.f1185h = abstractComponentCallbacksC0050q.f1184g.f1182e;
            abstractComponentCallbacksC0050q.f1184g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0050q.f1185h;
            if (str != null && (o2 = (O) ((HashMap) gVar.f823b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " declared target fragment " + abstractComponentCallbacksC0050q.f1185h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0050q.f1194r;
        abstractComponentCallbacksC0050q.f1195s = i.f1030t;
        abstractComponentCallbacksC0050q.f1197u = i.f1032v;
        C.j jVar = this.f1062a;
        jVar.l(false);
        ArrayList arrayList = abstractComponentCallbacksC0050q.f1177Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = ((C0047n) it.next()).f1150a;
            abstractComponentCallbacksC0050q3.f1176P.a();
            androidx.lifecycle.H.d(abstractComponentCallbacksC0050q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0050q.f1196t.b(abstractComponentCallbacksC0050q.f1195s, abstractComponentCallbacksC0050q.e(), abstractComponentCallbacksC0050q);
        abstractComponentCallbacksC0050q.f1179a = 0;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.r(abstractComponentCallbacksC0050q.f1195s.f1210f);
        if (!abstractComponentCallbacksC0050q.f1164C) {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0050q.f1194r.f1023m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).a();
        }
        I i2 = abstractComponentCallbacksC0050q.f1196t;
        i2.f1005E = false;
        i2.f1006F = false;
        i2.f1011L.f1050g = false;
        i2.t(0);
        jVar.e(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (abstractComponentCallbacksC0050q.f1194r == null) {
            return abstractComponentCallbacksC0050q.f1179a;
        }
        int i = this.f1065e;
        int ordinal = abstractComponentCallbacksC0050q.f1172L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0050q.f1189m) {
            if (abstractComponentCallbacksC0050q.f1190n) {
                i = Math.max(this.f1065e, 2);
                View view = abstractComponentCallbacksC0050q.f1166E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1065e < 4 ? Math.min(i, abstractComponentCallbacksC0050q.f1179a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0050q.f1187k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1165D;
        if (viewGroup != null) {
            C0042i f2 = C0042i.f(viewGroup, abstractComponentCallbacksC0050q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0050q);
            r6 = d != null ? d.f1082b : 0;
            Iterator it = f2.f1131c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1083c.equals(abstractComponentCallbacksC0050q) && !u2.f1085f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1082b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0050q.f1188l) {
            i = abstractComponentCallbacksC0050q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0050q.f1167F && abstractComponentCallbacksC0050q.f1179a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0050q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1170J) {
            Bundle bundle = abstractComponentCallbacksC0050q.f1180b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0050q.f1196t.Q(parcelable);
                I i = abstractComponentCallbacksC0050q.f1196t;
                i.f1005E = false;
                i.f1006F = false;
                i.f1011L.f1050g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0050q.f1179a = 1;
            return;
        }
        C.j jVar = this.f1062a;
        jVar.n(false);
        Bundle bundle2 = abstractComponentCallbacksC0050q.f1180b;
        abstractComponentCallbacksC0050q.f1196t.K();
        abstractComponentCallbacksC0050q.f1179a = 1;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.f1173M.a(new C0146a(1, abstractComponentCallbacksC0050q));
        abstractComponentCallbacksC0050q.f1176P.b(bundle2);
        abstractComponentCallbacksC0050q.s(bundle2);
        abstractComponentCallbacksC0050q.f1170J = true;
        if (abstractComponentCallbacksC0050q.f1164C) {
            abstractComponentCallbacksC0050q.f1173M.d(EnumC0078l.ON_CREATE);
            jVar.h(false);
        } else {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (abstractComponentCallbacksC0050q.f1189m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0050q.w(abstractComponentCallbacksC0050q.f1180b);
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1165D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0050q.f1199w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0050q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0050q.f1194r.f1031u.Y(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0050q.f1191o) {
                        try {
                            str = abstractComponentCallbacksC0050q.C().getResources().getResourceName(abstractComponentCallbacksC0050q.f1199w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0050q.f1199w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0050q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    a0.c cVar = a0.d.f1302a;
                    a0.d.b(new a0.a(abstractComponentCallbacksC0050q, "Attempting to add fragment " + abstractComponentCallbacksC0050q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    a0.d.a(abstractComponentCallbacksC0050q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0050q.f1165D = viewGroup;
        abstractComponentCallbacksC0050q.B(w2, viewGroup, abstractComponentCallbacksC0050q.f1180b);
        View view = abstractComponentCallbacksC0050q.f1166E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0050q.f1166E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0050q.f1201y) {
                abstractComponentCallbacksC0050q.f1166E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0050q.f1166E;
            WeakHashMap weakHashMap = L.T.f490a;
            if (view2.isAttachedToWindow()) {
                L.F.c(abstractComponentCallbacksC0050q.f1166E);
            } else {
                View view3 = abstractComponentCallbacksC0050q.f1166E;
                view3.addOnAttachStateChangeListener(new N0.o(1, view3));
            }
            abstractComponentCallbacksC0050q.f1196t.t(2);
            this.f1062a.s(false);
            int visibility = abstractComponentCallbacksC0050q.f1166E.getVisibility();
            abstractComponentCallbacksC0050q.f().f1159j = abstractComponentCallbacksC0050q.f1166E.getAlpha();
            if (abstractComponentCallbacksC0050q.f1165D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0050q.f1166E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0050q.f().f1160k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0050q);
                    }
                }
                abstractComponentCallbacksC0050q.f1166E.setAlpha(RecyclerView.A0);
            }
        }
        abstractComponentCallbacksC0050q.f1179a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0050q d;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0050q);
        }
        boolean z3 = abstractComponentCallbacksC0050q.f1188l && !abstractComponentCallbacksC0050q.o();
        S0.g gVar = this.f1063b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) gVar.d;
            if (!((l2.f1046b.containsKey(abstractComponentCallbacksC0050q.f1182e) && l2.f1048e) ? l2.f1049f : true)) {
                String str = abstractComponentCallbacksC0050q.f1185h;
                if (str != null && (d = gVar.d(str)) != null && d.f1162A) {
                    abstractComponentCallbacksC0050q.f1184g = d;
                }
                abstractComponentCallbacksC0050q.f1179a = 0;
                return;
            }
        }
        C0053u c0053u = abstractComponentCallbacksC0050q.f1195s;
        if (c0053u != null) {
            z2 = ((L) gVar.d).f1049f;
        } else {
            z2 = c0053u.f1210f != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) gVar.d).c(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1196t.k();
        abstractComponentCallbacksC0050q.f1173M.d(EnumC0078l.ON_DESTROY);
        abstractComponentCallbacksC0050q.f1179a = 0;
        abstractComponentCallbacksC0050q.f1170J = false;
        abstractComponentCallbacksC0050q.f1164C = true;
        this.f1062a.i(false);
        Iterator it = gVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0050q.f1182e;
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1064c;
                if (str2.equals(abstractComponentCallbacksC0050q2.f1185h)) {
                    abstractComponentCallbacksC0050q2.f1184g = abstractComponentCallbacksC0050q;
                    abstractComponentCallbacksC0050q2.f1185h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0050q.f1185h;
        if (str3 != null) {
            abstractComponentCallbacksC0050q.f1184g = gVar.d(str3);
        }
        gVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0050q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1165D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0050q.f1166E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0050q.f1196t.t(1);
        if (abstractComponentCallbacksC0050q.f1166E != null && abstractComponentCallbacksC0050q.f1174N.d().f1582c.compareTo(EnumC0079m.f1574c) >= 0) {
            abstractComponentCallbacksC0050q.f1174N.e(EnumC0078l.ON_DESTROY);
        }
        abstractComponentCallbacksC0050q.f1179a = 1;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.u();
        if (!abstractComponentCallbacksC0050q.f1164C) {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onDestroyView()");
        }
        p.l lVar = ((C0096a) new D.g(abstractComponentCallbacksC0050q.c(), C0096a.f2133c).w(C0096a.class)).f2134b;
        if (lVar.f3476c > 0) {
            lVar.f3475b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0050q.f1192p = false;
        this.f1062a.t(false);
        abstractComponentCallbacksC0050q.f1165D = null;
        abstractComponentCallbacksC0050q.f1166E = null;
        abstractComponentCallbacksC0050q.f1174N = null;
        abstractComponentCallbacksC0050q.f1175O.d(null);
        abstractComponentCallbacksC0050q.f1190n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1179a = -1;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.v();
        if (!abstractComponentCallbacksC0050q.f1164C) {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0050q.f1196t;
        if (!i.G) {
            i.k();
            abstractComponentCallbacksC0050q.f1196t = new I();
        }
        this.f1062a.j(false);
        abstractComponentCallbacksC0050q.f1179a = -1;
        abstractComponentCallbacksC0050q.f1195s = null;
        abstractComponentCallbacksC0050q.f1197u = null;
        abstractComponentCallbacksC0050q.f1194r = null;
        if (!abstractComponentCallbacksC0050q.f1188l || abstractComponentCallbacksC0050q.o()) {
            L l2 = (L) this.f1063b.d;
            boolean z2 = true;
            if (l2.f1046b.containsKey(abstractComponentCallbacksC0050q.f1182e) && l2.f1048e) {
                z2 = l2.f1049f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (abstractComponentCallbacksC0050q.f1189m && abstractComponentCallbacksC0050q.f1190n && !abstractComponentCallbacksC0050q.f1192p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050q);
            }
            abstractComponentCallbacksC0050q.B(abstractComponentCallbacksC0050q.w(abstractComponentCallbacksC0050q.f1180b), null, abstractComponentCallbacksC0050q.f1180b);
            View view = abstractComponentCallbacksC0050q.f1166E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0050q.f1166E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050q);
                if (abstractComponentCallbacksC0050q.f1201y) {
                    abstractComponentCallbacksC0050q.f1166E.setVisibility(8);
                }
                abstractComponentCallbacksC0050q.f1196t.t(2);
                this.f1062a.s(false);
                abstractComponentCallbacksC0050q.f1179a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        S0.g gVar = this.f1063b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0050q);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z3 = false;
            while (true) {
                int d = d();
                int i = abstractComponentCallbacksC0050q.f1179a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0050q.f1188l && !abstractComponentCallbacksC0050q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0050q);
                        }
                        ((L) gVar.d).c(abstractComponentCallbacksC0050q);
                        gVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0050q);
                        }
                        abstractComponentCallbacksC0050q.l();
                    }
                    if (abstractComponentCallbacksC0050q.f1169I) {
                        if (abstractComponentCallbacksC0050q.f1166E != null && (viewGroup = abstractComponentCallbacksC0050q.f1165D) != null) {
                            C0042i f2 = C0042i.f(viewGroup, abstractComponentCallbacksC0050q.j().D());
                            if (abstractComponentCallbacksC0050q.f1201y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0050q.f1194r;
                        if (i2 != null && abstractComponentCallbacksC0050q.f1187k && I.F(abstractComponentCallbacksC0050q)) {
                            i2.f1004D = true;
                        }
                        abstractComponentCallbacksC0050q.f1169I = false;
                        abstractComponentCallbacksC0050q.f1196t.n();
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
                            abstractComponentCallbacksC0050q.f1179a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0050q.f1190n = false;
                            abstractComponentCallbacksC0050q.f1179a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0050q);
                            }
                            if (abstractComponentCallbacksC0050q.f1166E != null && abstractComponentCallbacksC0050q.f1181c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0050q.f1166E != null && (viewGroup2 = abstractComponentCallbacksC0050q.f1165D) != null) {
                                C0042i f3 = C0042i.f(viewGroup2, abstractComponentCallbacksC0050q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0050q.f1179a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0050q.f1179a = 5;
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
                            if (abstractComponentCallbacksC0050q.f1166E != null && (viewGroup3 = abstractComponentCallbacksC0050q.f1165D) != null) {
                                C0042i f4 = C0042i.f(viewGroup3, abstractComponentCallbacksC0050q.j().D());
                                int b2 = V.b(abstractComponentCallbacksC0050q.f1166E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0050q.f1179a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0050q.f1179a = 6;
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1196t.t(5);
        if (abstractComponentCallbacksC0050q.f1166E != null) {
            abstractComponentCallbacksC0050q.f1174N.e(EnumC0078l.ON_PAUSE);
        }
        abstractComponentCallbacksC0050q.f1173M.d(EnumC0078l.ON_PAUSE);
        abstractComponentCallbacksC0050q.f1179a = 6;
        abstractComponentCallbacksC0050q.f1164C = true;
        this.f1062a.k(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        Bundle bundle = abstractComponentCallbacksC0050q.f1180b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0050q.f1181c = abstractComponentCallbacksC0050q.f1180b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0050q.d = abstractComponentCallbacksC0050q.f1180b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0050q.f1180b.getString("android:target_state");
        abstractComponentCallbacksC0050q.f1185h = string;
        if (string != null) {
            abstractComponentCallbacksC0050q.i = abstractComponentCallbacksC0050q.f1180b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0050q.f1180b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0050q.G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0050q.f1167F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0050q);
        }
        C0049p c0049p = abstractComponentCallbacksC0050q.f1168H;
        View view = c0049p == null ? null : c0049p.f1160k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0050q.f1166E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0050q.f1166E) {
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
                sb.append(abstractComponentCallbacksC0050q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0050q.f1166E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0050q.f().f1160k = null;
        abstractComponentCallbacksC0050q.f1196t.K();
        abstractComponentCallbacksC0050q.f1196t.y(true);
        abstractComponentCallbacksC0050q.f1179a = 7;
        abstractComponentCallbacksC0050q.f1164C = true;
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0050q.f1173M;
        EnumC0078l enumC0078l = EnumC0078l.ON_RESUME;
        tVar.d(enumC0078l);
        if (abstractComponentCallbacksC0050q.f1166E != null) {
            abstractComponentCallbacksC0050q.f1174N.f1075c.d(enumC0078l);
        }
        I i = abstractComponentCallbacksC0050q.f1196t;
        i.f1005E = false;
        i.f1006F = false;
        i.f1011L.f1050g = false;
        i.t(7);
        this.f1062a.o(false);
        abstractComponentCallbacksC0050q.f1180b = null;
        abstractComponentCallbacksC0050q.f1181c = null;
        abstractComponentCallbacksC0050q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (abstractComponentCallbacksC0050q.f1166E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0050q + " with view " + abstractComponentCallbacksC0050q.f1166E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0050q.f1166E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0050q.f1181c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0050q.f1174N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0050q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1196t.K();
        abstractComponentCallbacksC0050q.f1196t.y(true);
        abstractComponentCallbacksC0050q.f1179a = 5;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.y();
        if (!abstractComponentCallbacksC0050q.f1164C) {
            throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.t tVar = abstractComponentCallbacksC0050q.f1173M;
        EnumC0078l enumC0078l = EnumC0078l.ON_START;
        tVar.d(enumC0078l);
        if (abstractComponentCallbacksC0050q.f1166E != null) {
            abstractComponentCallbacksC0050q.f1174N.f1075c.d(enumC0078l);
        }
        I i = abstractComponentCallbacksC0050q.f1196t;
        i.f1005E = false;
        i.f1006F = false;
        i.f1011L.f1050g = false;
        i.t(5);
        this.f1062a.q(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1064c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0050q);
        }
        I i = abstractComponentCallbacksC0050q.f1196t;
        i.f1006F = true;
        i.f1011L.f1050g = true;
        i.t(4);
        if (abstractComponentCallbacksC0050q.f1166E != null) {
            abstractComponentCallbacksC0050q.f1174N.e(EnumC0078l.ON_STOP);
        }
        abstractComponentCallbacksC0050q.f1173M.d(EnumC0078l.ON_STOP);
        abstractComponentCallbacksC0050q.f1179a = 4;
        abstractComponentCallbacksC0050q.f1164C = false;
        abstractComponentCallbacksC0050q.z();
        if (abstractComponentCallbacksC0050q.f1164C) {
            this.f1062a.r(false);
            return;
        }
        throw new W("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onStop()");
    }

    public O(C.j jVar, S0.g gVar, ClassLoader classLoader, C c2, N n2) {
        this.f1062a = jVar;
        this.f1063b = gVar;
        AbstractComponentCallbacksC0050q a2 = c2.a(n2.f1051a);
        Bundle bundle = n2.f1058j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1182e = n2.f1052b;
        a2.f1189m = n2.f1053c;
        a2.f1191o = true;
        a2.f1198v = n2.d;
        a2.f1199w = n2.f1054e;
        a2.f1200x = n2.f1055f;
        a2.f1162A = n2.f1056g;
        a2.f1188l = n2.f1057h;
        a2.f1202z = n2.i;
        a2.f1201y = n2.f1059k;
        a2.f1172L = EnumC0079m.values()[n2.f1060l];
        Bundle bundle2 = n2.f1061m;
        if (bundle2 != null) {
            a2.f1180b = bundle2;
        } else {
            a2.f1180b = new Bundle();
        }
        this.f1064c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(C.j jVar, S0.g gVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, N n2) {
        this.f1062a = jVar;
        this.f1063b = gVar;
        this.f1064c = abstractComponentCallbacksC0050q;
        abstractComponentCallbacksC0050q.f1181c = null;
        abstractComponentCallbacksC0050q.d = null;
        abstractComponentCallbacksC0050q.f1193q = 0;
        abstractComponentCallbacksC0050q.f1190n = false;
        abstractComponentCallbacksC0050q.f1187k = false;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = abstractComponentCallbacksC0050q.f1184g;
        abstractComponentCallbacksC0050q.f1185h = abstractComponentCallbacksC0050q2 != null ? abstractComponentCallbacksC0050q2.f1182e : null;
        abstractComponentCallbacksC0050q.f1184g = null;
        Bundle bundle = n2.f1061m;
        if (bundle != null) {
            abstractComponentCallbacksC0050q.f1180b = bundle;
        } else {
            abstractComponentCallbacksC0050q.f1180b = new Bundle();
        }
    }
}
