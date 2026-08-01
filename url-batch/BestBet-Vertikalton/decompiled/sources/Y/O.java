package Y;

import G1.AbstractC0001b;
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
import com.fortunequest.neontrack.R;
import d0.C0092a;
import j0.C0167a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import u0.C0385x;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C0385x f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.m f1348b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0050q f1349c;
    public boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1350e = -1;

    public O(C0385x c0385x, T0.m mVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q) {
        this.f1347a = c0385x;
        this.f1348b = mVar;
        this.f1349c = abstractComponentCallbacksC0050q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0050q);
        }
        Bundle bundle = abstractComponentCallbacksC0050q.f1460b;
        abstractComponentCallbacksC0050q.f1475t.K();
        abstractComponentCallbacksC0050q.f1459a = 3;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.p();
        if (!abstractComponentCallbacksC0050q.f1444C) {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0050q);
        }
        View view = abstractComponentCallbacksC0050q.f1446E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0050q.f1460b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0050q.f1461c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0050q.f1461c = null;
            }
            if (abstractComponentCallbacksC0050q.f1446E != null) {
                abstractComponentCallbacksC0050q.f1454N.d.b(abstractComponentCallbacksC0050q.d);
                abstractComponentCallbacksC0050q.d = null;
            }
            abstractComponentCallbacksC0050q.f1444C = false;
            abstractComponentCallbacksC0050q.A(bundle2);
            if (!abstractComponentCallbacksC0050q.f1444C) {
                throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0050q.f1446E != null) {
                abstractComponentCallbacksC0050q.f1454N.d(EnumC0071l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0050q.f1460b = null;
        I i = abstractComponentCallbacksC0050q.f1475t;
        i.f1294E = false;
        i.F = false;
        i.f1300L.f1336g = false;
        i.t(4);
        this.f1347a.e(false);
    }

    public final void b() {
        View view;
        View view2;
        T0.m mVar = this.f1348b;
        mVar.getClass();
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1445D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) mVar.f1073a;
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
                        if (abstractComponentCallbacksC0050q2.f1445D == viewGroup && (view = abstractComponentCallbacksC0050q2.f1446E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = (AbstractComponentCallbacksC0050q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0050q3.f1445D == viewGroup && (view2 = abstractComponentCallbacksC0050q3.f1446E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0050q.f1445D.addView(abstractComponentCallbacksC0050q.f1446E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0050q);
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = abstractComponentCallbacksC0050q.f1464g;
        O o2 = null;
        T0.m mVar = this.f1348b;
        if (abstractComponentCallbacksC0050q2 != null) {
            O o3 = (O) ((HashMap) mVar.f1074b).get(abstractComponentCallbacksC0050q2.f1462e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " declared target fragment " + abstractComponentCallbacksC0050q.f1464g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0050q.h = abstractComponentCallbacksC0050q.f1464g.f1462e;
            abstractComponentCallbacksC0050q.f1464g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0050q.h;
            if (str != null && (o2 = (O) ((HashMap) mVar.f1074b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050q + " declared target fragment " + abstractComponentCallbacksC0050q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0050q.f1473r;
        abstractComponentCallbacksC0050q.f1474s = i.f1318t;
        abstractComponentCallbacksC0050q.f1476u = i.f1320v;
        C0385x c0385x = this.f1347a;
        c0385x.l(false);
        ArrayList arrayList = abstractComponentCallbacksC0050q.f1457Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q3 = ((C0047n) it.next()).f1431a;
            abstractComponentCallbacksC0050q3.f1456P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0050q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0050q.f1475t.b(abstractComponentCallbacksC0050q.f1474s, abstractComponentCallbacksC0050q.d(), abstractComponentCallbacksC0050q);
        abstractComponentCallbacksC0050q.f1459a = 0;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.r(abstractComponentCallbacksC0050q.f1474s.f1489b);
        if (!abstractComponentCallbacksC0050q.f1444C) {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0050q.f1473r.f1311m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).f();
        }
        I i2 = abstractComponentCallbacksC0050q.f1475t;
        i2.f1294E = false;
        i2.F = false;
        i2.f1300L.f1336g = false;
        i2.t(0);
        c0385x.f(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (abstractComponentCallbacksC0050q.f1473r == null) {
            return abstractComponentCallbacksC0050q.f1459a;
        }
        int i = this.f1350e;
        int ordinal = abstractComponentCallbacksC0050q.f1452L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0050q.f1468m) {
            if (abstractComponentCallbacksC0050q.f1469n) {
                i = Math.max(this.f1350e, 2);
                View view = abstractComponentCallbacksC0050q.f1446E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1350e < 4 ? Math.min(i, abstractComponentCallbacksC0050q.f1459a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0050q.f1466k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1445D;
        if (viewGroup != null) {
            C0042i f2 = C0042i.f(viewGroup, abstractComponentCallbacksC0050q.j().D());
            f2.getClass();
            U d = f2.d(abstractComponentCallbacksC0050q);
            r6 = d != null ? d.f1366b : 0;
            Iterator it = f2.f1412c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1367c.equals(abstractComponentCallbacksC0050q) && !u2.f1369f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1366b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0050q.f1467l) {
            i = abstractComponentCallbacksC0050q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0050q.F && abstractComponentCallbacksC0050q.f1459a < 5) {
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0050q);
        }
        if (abstractComponentCallbacksC0050q.f1450J) {
            Bundle bundle = abstractComponentCallbacksC0050q.f1460b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0050q.f1475t.Q(parcelable);
                I i = abstractComponentCallbacksC0050q.f1475t;
                i.f1294E = false;
                i.F = false;
                i.f1300L.f1336g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0050q.f1459a = 1;
            return;
        }
        C0385x c0385x = this.f1347a;
        c0385x.m(false);
        Bundle bundle2 = abstractComponentCallbacksC0050q.f1460b;
        abstractComponentCallbacksC0050q.f1475t.K();
        abstractComponentCallbacksC0050q.f1459a = 1;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.f1453M.a(new C0167a(1, abstractComponentCallbacksC0050q));
        abstractComponentCallbacksC0050q.f1456P.b(bundle2);
        abstractComponentCallbacksC0050q.s(bundle2);
        abstractComponentCallbacksC0050q.f1450J = true;
        if (abstractComponentCallbacksC0050q.f1444C) {
            abstractComponentCallbacksC0050q.f1453M.d(EnumC0071l.ON_CREATE);
            c0385x.g(false);
        } else {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (abstractComponentCallbacksC0050q.f1468m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0050q.w(abstractComponentCallbacksC0050q.f1460b);
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1445D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0050q.f1478w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0050q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0050q.f1473r.f1319u.V(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0050q.f1470o) {
                        try {
                            str = abstractComponentCallbacksC0050q.C().getResources().getResourceName(abstractComponentCallbacksC0050q.f1478w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0050q.f1478w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0050q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Z.c cVar = Z.d.f1524a;
                    Z.d.b(new Z.a(abstractComponentCallbacksC0050q, "Attempting to add fragment " + abstractComponentCallbacksC0050q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    Z.d.a(abstractComponentCallbacksC0050q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0050q.f1445D = viewGroup;
        abstractComponentCallbacksC0050q.B(w2, viewGroup, abstractComponentCallbacksC0050q.f1460b);
        View view = abstractComponentCallbacksC0050q.f1446E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0050q.f1446E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0050q.f1480y) {
                abstractComponentCallbacksC0050q.f1446E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0050q.f1446E;
            WeakHashMap weakHashMap = K.Q.f578a;
            if (view2.isAttachedToWindow()) {
                K.D.c(abstractComponentCallbacksC0050q.f1446E);
            } else {
                View view3 = abstractComponentCallbacksC0050q.f1446E;
                view3.addOnAttachStateChangeListener(new U0.n(1, view3));
            }
            abstractComponentCallbacksC0050q.f1475t.t(2);
            this.f1347a.r(false);
            int visibility = abstractComponentCallbacksC0050q.f1446E.getVisibility();
            abstractComponentCallbacksC0050q.f().f1439j = abstractComponentCallbacksC0050q.f1446E.getAlpha();
            if (abstractComponentCallbacksC0050q.f1445D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0050q.f1446E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0050q.f().f1440k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0050q);
                    }
                }
                abstractComponentCallbacksC0050q.f1446E.setAlpha(RecyclerView.f1937A0);
            }
        }
        abstractComponentCallbacksC0050q.f1459a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0050q e2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0050q);
        }
        boolean z3 = abstractComponentCallbacksC0050q.f1467l && !abstractComponentCallbacksC0050q.o();
        T0.m mVar = this.f1348b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) mVar.d;
            if (!((l2.f1332b.containsKey(abstractComponentCallbacksC0050q.f1462e) && l2.f1334e) ? l2.f1335f : true)) {
                String str = abstractComponentCallbacksC0050q.h;
                if (str != null && (e2 = mVar.e(str)) != null && e2.f1442A) {
                    abstractComponentCallbacksC0050q.f1464g = e2;
                }
                abstractComponentCallbacksC0050q.f1459a = 0;
                return;
            }
        }
        C0053u c0053u = abstractComponentCallbacksC0050q.f1474s;
        if (c0053u != null) {
            z2 = ((L) mVar.d).f1335f;
        } else {
            z2 = c0053u.f1489b != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) mVar.d).c(abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1475t.k();
        abstractComponentCallbacksC0050q.f1453M.d(EnumC0071l.ON_DESTROY);
        abstractComponentCallbacksC0050q.f1459a = 0;
        abstractComponentCallbacksC0050q.f1450J = false;
        abstractComponentCallbacksC0050q.f1444C = true;
        this.f1347a.h(false);
        Iterator it = mVar.i().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0050q.f1462e;
                AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = o2.f1349c;
                if (str2.equals(abstractComponentCallbacksC0050q2.h)) {
                    abstractComponentCallbacksC0050q2.f1464g = abstractComponentCallbacksC0050q;
                    abstractComponentCallbacksC0050q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0050q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0050q.f1464g = mVar.e(str3);
        }
        mVar.q(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0050q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0050q.f1445D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0050q.f1446E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0050q.f1475t.t(1);
        if (abstractComponentCallbacksC0050q.f1446E != null) {
            Q q2 = abstractComponentCallbacksC0050q.f1454N;
            q2.f();
            if (q2.f1359c.d.compareTo(EnumC0072m.f1886c) >= 0) {
                abstractComponentCallbacksC0050q.f1454N.d(EnumC0071l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0050q.f1459a = 1;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.u();
        if (!abstractComponentCallbacksC0050q.f1444C) {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = ((C0092a) new A0.c(abstractComponentCallbacksC0050q.c(), C0092a.f2470c).r(C0092a.class)).f2471b;
        if (lVar.f3594c > 0) {
            lVar.f3593b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0050q.f1471p = false;
        this.f1347a.s(false);
        abstractComponentCallbacksC0050q.f1445D = null;
        abstractComponentCallbacksC0050q.f1446E = null;
        abstractComponentCallbacksC0050q.f1454N = null;
        abstractComponentCallbacksC0050q.f1455O.d(null);
        abstractComponentCallbacksC0050q.f1469n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1459a = -1;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.v();
        if (!abstractComponentCallbacksC0050q.f1444C) {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0050q.f1475t;
        if (!i.f1295G) {
            i.k();
            abstractComponentCallbacksC0050q.f1475t = new I();
        }
        this.f1347a.i(false);
        abstractComponentCallbacksC0050q.f1459a = -1;
        abstractComponentCallbacksC0050q.f1474s = null;
        abstractComponentCallbacksC0050q.f1476u = null;
        abstractComponentCallbacksC0050q.f1473r = null;
        if (!abstractComponentCallbacksC0050q.f1467l || abstractComponentCallbacksC0050q.o()) {
            L l2 = (L) this.f1348b.d;
            boolean z2 = true;
            if (l2.f1332b.containsKey(abstractComponentCallbacksC0050q.f1462e) && l2.f1334e) {
                z2 = l2.f1335f;
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (abstractComponentCallbacksC0050q.f1468m && abstractComponentCallbacksC0050q.f1469n && !abstractComponentCallbacksC0050q.f1471p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0050q);
            }
            abstractComponentCallbacksC0050q.B(abstractComponentCallbacksC0050q.w(abstractComponentCallbacksC0050q.f1460b), null, abstractComponentCallbacksC0050q.f1460b);
            View view = abstractComponentCallbacksC0050q.f1446E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0050q.f1446E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0050q);
                if (abstractComponentCallbacksC0050q.f1480y) {
                    abstractComponentCallbacksC0050q.f1446E.setVisibility(8);
                }
                abstractComponentCallbacksC0050q.f1475t.t(2);
                this.f1347a.r(false);
                abstractComponentCallbacksC0050q.f1459a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T0.m mVar = this.f1348b;
        boolean z2 = this.d;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
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
                int i = abstractComponentCallbacksC0050q.f1459a;
                if (d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0050q.f1467l && !abstractComponentCallbacksC0050q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0050q);
                        }
                        ((L) mVar.d).c(abstractComponentCallbacksC0050q);
                        mVar.q(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0050q);
                        }
                        abstractComponentCallbacksC0050q.l();
                    }
                    if (abstractComponentCallbacksC0050q.f1449I) {
                        if (abstractComponentCallbacksC0050q.f1446E != null && (viewGroup = abstractComponentCallbacksC0050q.f1445D) != null) {
                            C0042i f2 = C0042i.f(viewGroup, abstractComponentCallbacksC0050q.j().D());
                            if (abstractComponentCallbacksC0050q.f1480y) {
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
                        I i2 = abstractComponentCallbacksC0050q.f1473r;
                        if (i2 != null && abstractComponentCallbacksC0050q.f1466k && I.F(abstractComponentCallbacksC0050q)) {
                            i2.f1293D = true;
                        }
                        abstractComponentCallbacksC0050q.f1449I = false;
                        abstractComponentCallbacksC0050q.f1475t.n();
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
                            abstractComponentCallbacksC0050q.f1459a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0050q.f1469n = false;
                            abstractComponentCallbacksC0050q.f1459a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0050q);
                            }
                            if (abstractComponentCallbacksC0050q.f1446E != null && abstractComponentCallbacksC0050q.f1461c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0050q.f1446E != null && (viewGroup2 = abstractComponentCallbacksC0050q.f1445D) != null) {
                                C0042i f3 = C0042i.f(viewGroup2, abstractComponentCallbacksC0050q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0050q.f1459a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0050q.f1459a = 5;
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
                            if (abstractComponentCallbacksC0050q.f1446E != null && (viewGroup3 = abstractComponentCallbacksC0050q.f1445D) != null) {
                                C0042i f4 = C0042i.f(viewGroup3, abstractComponentCallbacksC0050q.j().D());
                                int b2 = AbstractC0001b.b(abstractComponentCallbacksC0050q.f1446E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0050q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0050q.f1459a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0050q.f1459a = 6;
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
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1475t.t(5);
        if (abstractComponentCallbacksC0050q.f1446E != null) {
            abstractComponentCallbacksC0050q.f1454N.d(EnumC0071l.ON_PAUSE);
        }
        abstractComponentCallbacksC0050q.f1453M.d(EnumC0071l.ON_PAUSE);
        abstractComponentCallbacksC0050q.f1459a = 6;
        abstractComponentCallbacksC0050q.f1444C = true;
        this.f1347a.k(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        Bundle bundle = abstractComponentCallbacksC0050q.f1460b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0050q.f1461c = abstractComponentCallbacksC0050q.f1460b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0050q.d = abstractComponentCallbacksC0050q.f1460b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0050q.f1460b.getString("android:target_state");
        abstractComponentCallbacksC0050q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0050q.i = abstractComponentCallbacksC0050q.f1460b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0050q.f1460b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0050q.f1447G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0050q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0050q);
        }
        C0049p c0049p = abstractComponentCallbacksC0050q.f1448H;
        View view = c0049p == null ? null : c0049p.f1440k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0050q.f1446E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0050q.f1446E) {
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
                sb.append(abstractComponentCallbacksC0050q.f1446E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0050q.f().f1440k = null;
        abstractComponentCallbacksC0050q.f1475t.K();
        abstractComponentCallbacksC0050q.f1475t.y(true);
        abstractComponentCallbacksC0050q.f1459a = 7;
        abstractComponentCallbacksC0050q.f1444C = true;
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0050q.f1453M;
        EnumC0071l enumC0071l = EnumC0071l.ON_RESUME;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0050q.f1446E != null) {
            abstractComponentCallbacksC0050q.f1454N.f1359c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0050q.f1475t;
        i.f1294E = false;
        i.F = false;
        i.f1300L.f1336g = false;
        i.t(7);
        this.f1347a.n(false);
        abstractComponentCallbacksC0050q.f1460b = null;
        abstractComponentCallbacksC0050q.f1461c = null;
        abstractComponentCallbacksC0050q.d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (abstractComponentCallbacksC0050q.f1446E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0050q + " with view " + abstractComponentCallbacksC0050q.f1446E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0050q.f1446E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0050q.f1461c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0050q.f1454N.d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0050q.d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0050q);
        }
        abstractComponentCallbacksC0050q.f1475t.K();
        abstractComponentCallbacksC0050q.f1475t.y(true);
        abstractComponentCallbacksC0050q.f1459a = 5;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.y();
        if (!abstractComponentCallbacksC0050q.f1444C) {
            throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0050q.f1453M;
        EnumC0071l enumC0071l = EnumC0071l.ON_START;
        vVar.d(enumC0071l);
        if (abstractComponentCallbacksC0050q.f1446E != null) {
            abstractComponentCallbacksC0050q.f1454N.f1359c.d(enumC0071l);
        }
        I i = abstractComponentCallbacksC0050q.f1475t;
        i.f1294E = false;
        i.F = false;
        i.f1300L.f1336g = false;
        i.t(5);
        this.f1347a.p(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1349c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0050q);
        }
        I i = abstractComponentCallbacksC0050q.f1475t;
        i.F = true;
        i.f1300L.f1336g = true;
        i.t(4);
        if (abstractComponentCallbacksC0050q.f1446E != null) {
            abstractComponentCallbacksC0050q.f1454N.d(EnumC0071l.ON_STOP);
        }
        abstractComponentCallbacksC0050q.f1453M.d(EnumC0071l.ON_STOP);
        abstractComponentCallbacksC0050q.f1459a = 4;
        abstractComponentCallbacksC0050q.f1444C = false;
        abstractComponentCallbacksC0050q.z();
        if (abstractComponentCallbacksC0050q.f1444C) {
            this.f1347a.q(false);
            return;
        }
        throw new V("Fragment " + abstractComponentCallbacksC0050q + " did not call through to super.onStop()");
    }

    public O(C0385x c0385x, T0.m mVar, ClassLoader classLoader, C c2, N n2) {
        this.f1347a = c0385x;
        this.f1348b = mVar;
        AbstractComponentCallbacksC0050q a2 = c2.a(n2.f1337a);
        Bundle bundle = n2.f1343j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.f1462e = n2.f1338b;
        a2.f1468m = n2.f1339c;
        a2.f1470o = true;
        a2.f1477v = n2.d;
        a2.f1478w = n2.f1340e;
        a2.f1479x = n2.f1341f;
        a2.f1442A = n2.f1342g;
        a2.f1467l = n2.h;
        a2.f1481z = n2.i;
        a2.f1480y = n2.f1344k;
        a2.f1452L = EnumC0072m.values()[n2.f1345l];
        Bundle bundle2 = n2.f1346m;
        if (bundle2 != null) {
            a2.f1460b = bundle2;
        } else {
            a2.f1460b = new Bundle();
        }
        this.f1349c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(C0385x c0385x, T0.m mVar, AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q, N n2) {
        this.f1347a = c0385x;
        this.f1348b = mVar;
        this.f1349c = abstractComponentCallbacksC0050q;
        abstractComponentCallbacksC0050q.f1461c = null;
        abstractComponentCallbacksC0050q.d = null;
        abstractComponentCallbacksC0050q.f1472q = 0;
        abstractComponentCallbacksC0050q.f1469n = false;
        abstractComponentCallbacksC0050q.f1466k = false;
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q2 = abstractComponentCallbacksC0050q.f1464g;
        abstractComponentCallbacksC0050q.h = abstractComponentCallbacksC0050q2 != null ? abstractComponentCallbacksC0050q2.f1462e : null;
        abstractComponentCallbacksC0050q.f1464g = null;
        Bundle bundle = n2.f1346m;
        if (bundle != null) {
            abstractComponentCallbacksC0050q.f1460b = bundle;
        } else {
            abstractComponentCallbacksC0050q.f1460b = new Bundle();
        }
    }
}
