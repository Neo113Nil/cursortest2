package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0080m;
import androidx.lifecycle.EnumC0081n;
import b0.AbstractC0091a;
import com.luckyarcade.spinthrow.GameConfig;
import com.luckyarcade.spinthrow.R;
import g0.C0164a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final B.j f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final T.v f1274b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0060q f1275c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1276d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1277e = -1;

    public S(B.j jVar, T.v vVar, AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q) {
        this.f1273a = jVar;
        this.f1274b = vVar;
        this.f1275c = abstractComponentCallbacksC0060q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0060q);
        }
        Bundle bundle = abstractComponentCallbacksC0060q.f1396b;
        abstractComponentCallbacksC0060q.f1412t.K();
        abstractComponentCallbacksC0060q.f1395a = 3;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.l();
        if (!abstractComponentCallbacksC0060q.f1380C) {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0060q);
        }
        View view = abstractComponentCallbacksC0060q.f1382E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0060q.f1396b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0060q.f1397c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0060q.f1397c = null;
            }
            if (abstractComponentCallbacksC0060q.f1382E != null) {
                abstractComponentCallbacksC0060q.f1390N.f1288d.b(abstractComponentCallbacksC0060q.f1398d);
                abstractComponentCallbacksC0060q.f1398d = null;
            }
            abstractComponentCallbacksC0060q.f1380C = false;
            abstractComponentCallbacksC0060q.w(bundle2);
            if (!abstractComponentCallbacksC0060q.f1380C) {
                throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0060q.f1382E != null) {
                abstractComponentCallbacksC0060q.f1390N.a(EnumC0080m.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0060q.f1396b = null;
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(4);
        this.f1273a.g(false);
    }

    public final void b() {
        View view;
        View view2;
        T.v vVar = this.f1274b;
        vVar.getClass();
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        ViewGroup viewGroup = abstractComponentCallbacksC0060q.f1381D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) vVar.f824a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0060q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = (AbstractComponentCallbacksC0060q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0060q2.f1381D == viewGroup && (view = abstractComponentCallbacksC0060q2.f1382E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = (AbstractComponentCallbacksC0060q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0060q3.f1381D == viewGroup && (view2 = abstractComponentCallbacksC0060q3.f1382E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0060q.f1381D.addView(abstractComponentCallbacksC0060q.f1382E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0060q);
        }
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = abstractComponentCallbacksC0060q.f1401g;
        S s2 = null;
        T.v vVar = this.f1274b;
        if (abstractComponentCallbacksC0060q2 != null) {
            S s3 = (S) ((HashMap) vVar.f825b).get(abstractComponentCallbacksC0060q2.f1399e);
            if (s3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0060q + " declared target fragment " + abstractComponentCallbacksC0060q.f1401g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0060q.h = abstractComponentCallbacksC0060q.f1401g.f1399e;
            abstractComponentCallbacksC0060q.f1401g = null;
            s2 = s3;
        } else {
            String str = abstractComponentCallbacksC0060q.h;
            if (str != null && (s2 = (S) ((HashMap) vVar.f825b).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0060q + " declared target fragment " + abstractComponentCallbacksC0060q.h + " that does not belong to this FragmentManager!");
            }
        }
        if (s2 != null) {
            s2.k();
        }
        K k2 = abstractComponentCallbacksC0060q.f1410r;
        abstractComponentCallbacksC0060q.f1411s = k2.f1241t;
        abstractComponentCallbacksC0060q.f1413u = k2.f1243v;
        B.j jVar = this.f1273a;
        jVar.o(false);
        ArrayList arrayList = abstractComponentCallbacksC0060q.f1393Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q3 = ((C0057n) it.next()).f1366a;
            abstractComponentCallbacksC0060q3.f1392P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0060q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0060q.f1412t.b(abstractComponentCallbacksC0060q.f1411s, abstractComponentCallbacksC0060q.a(), abstractComponentCallbacksC0060q);
        abstractComponentCallbacksC0060q.f1395a = 0;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.n(abstractComponentCallbacksC0060q.f1411s.h);
        if (!abstractComponentCallbacksC0060q.f1380C) {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0060q.f1410r.f1234m.iterator();
        while (it2.hasNext()) {
            ((P) it2.next()).a(abstractComponentCallbacksC0060q);
        }
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(0);
        jVar.i(false);
    }

    public final int d() {
        X x2;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (abstractComponentCallbacksC0060q.f1410r == null) {
            return abstractComponentCallbacksC0060q.f1395a;
        }
        int i = this.f1277e;
        int ordinal = abstractComponentCallbacksC0060q.f1388L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0060q.f1405m) {
            if (abstractComponentCallbacksC0060q.f1406n) {
                i = Math.max(this.f1277e, 2);
                View view = abstractComponentCallbacksC0060q.f1382E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f1277e < 4 ? Math.min(i, abstractComponentCallbacksC0060q.f1395a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0060q.f1403k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0060q.f1381D;
        if (viewGroup != null) {
            C0052i f2 = C0052i.f(viewGroup, abstractComponentCallbacksC0060q.f().D());
            f2.getClass();
            X d2 = f2.d(abstractComponentCallbacksC0060q);
            r6 = d2 != null ? d2.f1295b : 0;
            Iterator it = f2.f1347c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    x2 = null;
                    break;
                }
                x2 = (X) it.next();
                if (x2.f1296c.equals(abstractComponentCallbacksC0060q) && !x2.f1299f) {
                    break;
                }
            }
            if (x2 != null && (r6 == 0 || r6 == 1)) {
                r6 = x2.f1295b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0060q.f1404l) {
            i = abstractComponentCallbacksC0060q.k() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0060q.F && abstractComponentCallbacksC0060q.f1395a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0060q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0060q);
        }
        if (abstractComponentCallbacksC0060q.f1386J) {
            Bundle bundle = abstractComponentCallbacksC0060q.f1396b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0060q.f1412t.Q(parcelable);
                L l2 = abstractComponentCallbacksC0060q.f1412t;
                l2.f1216E = false;
                l2.F = false;
                l2.f1222L.f1261g = false;
                l2.t(1);
            }
            abstractComponentCallbacksC0060q.f1395a = 1;
            return;
        }
        B.j jVar = this.f1273a;
        jVar.p(false);
        Bundle bundle2 = abstractComponentCallbacksC0060q.f1396b;
        abstractComponentCallbacksC0060q.f1412t.K();
        abstractComponentCallbacksC0060q.f1395a = 1;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.f1389M.a(new C0164a(2, abstractComponentCallbacksC0060q));
        abstractComponentCallbacksC0060q.f1392P.b(bundle2);
        abstractComponentCallbacksC0060q.o(bundle2);
        abstractComponentCallbacksC0060q.f1386J = true;
        if (abstractComponentCallbacksC0060q.f1380C) {
            abstractComponentCallbacksC0060q.f1389M.e(EnumC0080m.ON_CREATE);
            jVar.j(false);
        } else {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (abstractComponentCallbacksC0060q.f1405m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0060q);
        }
        LayoutInflater s2 = abstractComponentCallbacksC0060q.s(abstractComponentCallbacksC0060q.f1396b);
        ViewGroup viewGroup = abstractComponentCallbacksC0060q.f1381D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0060q.f1415w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0060q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0060q.f1410r.f1242u.Q(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0060q.f1407o) {
                        try {
                            str = abstractComponentCallbacksC0060q.y().getResources().getResourceName(abstractComponentCallbacksC0060q.f1415w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0060q.f1415w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0060q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    X.c cVar = X.d.f868a;
                    X.d.b(new X.a(abstractComponentCallbacksC0060q, "Attempting to add fragment " + abstractComponentCallbacksC0060q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    X.d.a(abstractComponentCallbacksC0060q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0060q.f1381D = viewGroup;
        abstractComponentCallbacksC0060q.x(s2, viewGroup, abstractComponentCallbacksC0060q.f1396b);
        View view = abstractComponentCallbacksC0060q.f1382E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0060q.f1382E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0060q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0060q.f1417y) {
                abstractComponentCallbacksC0060q.f1382E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0060q.f1382E;
            WeakHashMap weakHashMap = K.X.f419a;
            if (view2.isAttachedToWindow()) {
                K.J.c(abstractComponentCallbacksC0060q.f1382E);
            } else {
                View view3 = abstractComponentCallbacksC0060q.f1382E;
                view3.addOnAttachStateChangeListener(new K0.o(1, view3));
            }
            abstractComponentCallbacksC0060q.f1412t.t(2);
            this.f1273a.v(false);
            int visibility = abstractComponentCallbacksC0060q.f1382E.getVisibility();
            abstractComponentCallbacksC0060q.b().f1375j = abstractComponentCallbacksC0060q.f1382E.getAlpha();
            if (abstractComponentCallbacksC0060q.f1381D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0060q.f1382E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0060q.b().f1376k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0060q);
                    }
                }
                abstractComponentCallbacksC0060q.f1382E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0060q.f1395a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0060q h;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0060q);
        }
        boolean z3 = abstractComponentCallbacksC0060q.f1404l && !abstractComponentCallbacksC0060q.k();
        T.v vVar = this.f1274b;
        if (z3) {
        }
        if (!z3) {
            O o2 = (O) vVar.f827d;
            if (!((o2.f1256b.containsKey(abstractComponentCallbacksC0060q.f1399e) && o2.f1259e) ? o2.f1260f : true)) {
                String str = abstractComponentCallbacksC0060q.h;
                if (str != null && (h = vVar.h(str)) != null && h.f1378A) {
                    abstractComponentCallbacksC0060q.f1401g = h;
                }
                abstractComponentCallbacksC0060q.f1395a = 0;
                return;
            }
        }
        C0063u c0063u = abstractComponentCallbacksC0060q.f1411s;
        if (c0063u != null) {
            z2 = ((O) vVar.f827d).f1260f;
        } else {
            z2 = c0063u.h != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((O) vVar.f827d).c(abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1412t.k();
        abstractComponentCallbacksC0060q.f1389M.e(EnumC0080m.ON_DESTROY);
        abstractComponentCallbacksC0060q.f1395a = 0;
        abstractComponentCallbacksC0060q.f1386J = false;
        abstractComponentCallbacksC0060q.f1380C = true;
        this.f1273a.k(false);
        Iterator it = vVar.m().iterator();
        while (it.hasNext()) {
            S s2 = (S) it.next();
            if (s2 != null) {
                String str2 = abstractComponentCallbacksC0060q.f1399e;
                AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = s2.f1275c;
                if (str2.equals(abstractComponentCallbacksC0060q2.h)) {
                    abstractComponentCallbacksC0060q2.f1401g = abstractComponentCallbacksC0060q;
                    abstractComponentCallbacksC0060q2.h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0060q.h;
        if (str3 != null) {
            abstractComponentCallbacksC0060q.f1401g = vVar.h(str3);
        }
        vVar.r(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0060q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0060q.f1381D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0060q.f1382E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0060q.f1412t.t(1);
        if (abstractComponentCallbacksC0060q.f1382E != null) {
            U u2 = abstractComponentCallbacksC0060q.f1390N;
            u2.b();
            if (u2.f1287c.f1500c.compareTo(EnumC0081n.f1491c) >= 0) {
                abstractComponentCallbacksC0060q.f1390N.a(EnumC0080m.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0060q.f1395a = 1;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.q();
        if (!abstractComponentCallbacksC0060q.f1380C) {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onDestroyView()");
        }
        o.l lVar = AbstractC0091a.a(abstractComponentCallbacksC0060q).f1637b.f1635b;
        if (lVar.f3715c > 0) {
            lVar.f3714b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0060q.f1408p = false;
        this.f1273a.w(false);
        abstractComponentCallbacksC0060q.f1381D = null;
        abstractComponentCallbacksC0060q.f1382E = null;
        abstractComponentCallbacksC0060q.f1390N = null;
        abstractComponentCallbacksC0060q.f1391O.d(null);
        abstractComponentCallbacksC0060q.f1406n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1395a = -1;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.r();
        if (!abstractComponentCallbacksC0060q.f1380C) {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onDetach()");
        }
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        if (!l2.f1217G) {
            l2.k();
            abstractComponentCallbacksC0060q.f1412t = new L();
        }
        this.f1273a.m(false);
        abstractComponentCallbacksC0060q.f1395a = -1;
        abstractComponentCallbacksC0060q.f1411s = null;
        abstractComponentCallbacksC0060q.f1413u = null;
        abstractComponentCallbacksC0060q.f1410r = null;
        if (!abstractComponentCallbacksC0060q.f1404l || abstractComponentCallbacksC0060q.k()) {
            O o2 = (O) this.f1274b.f827d;
            boolean z2 = true;
            if (o2.f1256b.containsKey(abstractComponentCallbacksC0060q.f1399e) && o2.f1259e) {
                z2 = o2.f1260f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.h();
    }

    public final void j() {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (abstractComponentCallbacksC0060q.f1405m && abstractComponentCallbacksC0060q.f1406n && !abstractComponentCallbacksC0060q.f1408p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0060q);
            }
            abstractComponentCallbacksC0060q.x(abstractComponentCallbacksC0060q.s(abstractComponentCallbacksC0060q.f1396b), null, abstractComponentCallbacksC0060q.f1396b);
            View view = abstractComponentCallbacksC0060q.f1382E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0060q.f1382E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0060q);
                if (abstractComponentCallbacksC0060q.f1417y) {
                    abstractComponentCallbacksC0060q.f1382E.setVisibility(8);
                }
                abstractComponentCallbacksC0060q.f1412t.t(2);
                this.f1273a.v(false);
                abstractComponentCallbacksC0060q.f1395a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        T.v vVar = this.f1274b;
        boolean z2 = this.f1276d;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0060q);
                return;
            }
            return;
        }
        try {
            this.f1276d = true;
            boolean z3 = false;
            while (true) {
                int d2 = d();
                int i = abstractComponentCallbacksC0060q.f1395a;
                if (d2 == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0060q.f1404l && !abstractComponentCallbacksC0060q.k()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0060q);
                        }
                        ((O) vVar.f827d).c(abstractComponentCallbacksC0060q);
                        vVar.r(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0060q);
                        }
                        abstractComponentCallbacksC0060q.h();
                    }
                    if (abstractComponentCallbacksC0060q.f1385I) {
                        if (abstractComponentCallbacksC0060q.f1382E != null && (viewGroup = abstractComponentCallbacksC0060q.f1381D) != null) {
                            C0052i f2 = C0052i.f(viewGroup, abstractComponentCallbacksC0060q.f().D());
                            if (abstractComponentCallbacksC0060q.f1417y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0060q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0060q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        K k2 = abstractComponentCallbacksC0060q.f1410r;
                        if (k2 != null && abstractComponentCallbacksC0060q.f1403k && K.F(abstractComponentCallbacksC0060q)) {
                            k2.f1215D = true;
                        }
                        abstractComponentCallbacksC0060q.f1385I = false;
                        abstractComponentCallbacksC0060q.f1412t.n();
                    }
                    this.f1276d = false;
                    return;
                }
                if (d2 <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0060q.f1395a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0060q.f1406n = false;
                            abstractComponentCallbacksC0060q.f1395a = 2;
                            break;
                        case GameConfig.COMBO_EVERY /* 3 */:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0060q);
                            }
                            if (abstractComponentCallbacksC0060q.f1382E != null && abstractComponentCallbacksC0060q.f1397c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0060q.f1382E != null && (viewGroup2 = abstractComponentCallbacksC0060q.f1381D) != null) {
                                C0052i f3 = C0052i.f(viewGroup2, abstractComponentCallbacksC0060q.f().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0060q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0060q.f1395a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0060q.f1395a = 5;
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
                        case GameConfig.COMBO_EVERY /* 3 */:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0060q.f1382E != null && (viewGroup3 = abstractComponentCallbacksC0060q.f1381D) != null) {
                                C0052i f4 = C0052i.f(viewGroup3, abstractComponentCallbacksC0060q.f().D());
                                int b2 = X0.e.b(abstractComponentCallbacksC0060q.f1382E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0060q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0060q.f1395a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0060q.f1395a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1276d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1412t.t(5);
        if (abstractComponentCallbacksC0060q.f1382E != null) {
            abstractComponentCallbacksC0060q.f1390N.a(EnumC0080m.ON_PAUSE);
        }
        abstractComponentCallbacksC0060q.f1389M.e(EnumC0080m.ON_PAUSE);
        abstractComponentCallbacksC0060q.f1395a = 6;
        abstractComponentCallbacksC0060q.f1380C = true;
        this.f1273a.n(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        Bundle bundle = abstractComponentCallbacksC0060q.f1396b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0060q.f1397c = abstractComponentCallbacksC0060q.f1396b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0060q.f1398d = abstractComponentCallbacksC0060q.f1396b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0060q.f1396b.getString("android:target_state");
        abstractComponentCallbacksC0060q.h = string;
        if (string != null) {
            abstractComponentCallbacksC0060q.i = abstractComponentCallbacksC0060q.f1396b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0060q.f1396b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0060q.f1383G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0060q.F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0060q);
        }
        C0059p c0059p = abstractComponentCallbacksC0060q.f1384H;
        View view = c0059p == null ? null : c0059p.f1376k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0060q.f1382E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0060q.f1382E) {
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
                sb.append(abstractComponentCallbacksC0060q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0060q.f1382E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0060q.b().f1376k = null;
        abstractComponentCallbacksC0060q.f1412t.K();
        abstractComponentCallbacksC0060q.f1412t.y(true);
        abstractComponentCallbacksC0060q.f1395a = 7;
        abstractComponentCallbacksC0060q.f1380C = true;
        C0088v c0088v = abstractComponentCallbacksC0060q.f1389M;
        EnumC0080m enumC0080m = EnumC0080m.ON_RESUME;
        c0088v.e(enumC0080m);
        if (abstractComponentCallbacksC0060q.f1382E != null) {
            abstractComponentCallbacksC0060q.f1390N.f1287c.e(enumC0080m);
        }
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(7);
        this.f1273a.r(false);
        abstractComponentCallbacksC0060q.f1396b = null;
        abstractComponentCallbacksC0060q.f1397c = null;
        abstractComponentCallbacksC0060q.f1398d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (abstractComponentCallbacksC0060q.f1382E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0060q + " with view " + abstractComponentCallbacksC0060q.f1382E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0060q.f1382E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0060q.f1397c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0060q.f1390N.f1288d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0060q.f1398d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0060q);
        }
        abstractComponentCallbacksC0060q.f1412t.K();
        abstractComponentCallbacksC0060q.f1412t.y(true);
        abstractComponentCallbacksC0060q.f1395a = 5;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.u();
        if (!abstractComponentCallbacksC0060q.f1380C) {
            throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onStart()");
        }
        C0088v c0088v = abstractComponentCallbacksC0060q.f1389M;
        EnumC0080m enumC0080m = EnumC0080m.ON_START;
        c0088v.e(enumC0080m);
        if (abstractComponentCallbacksC0060q.f1382E != null) {
            abstractComponentCallbacksC0060q.f1390N.f1287c.e(enumC0080m);
        }
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        l2.f1216E = false;
        l2.F = false;
        l2.f1222L.f1261g = false;
        l2.t(5);
        this.f1273a.t(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1275c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0060q);
        }
        L l2 = abstractComponentCallbacksC0060q.f1412t;
        l2.F = true;
        l2.f1222L.f1261g = true;
        l2.t(4);
        if (abstractComponentCallbacksC0060q.f1382E != null) {
            abstractComponentCallbacksC0060q.f1390N.a(EnumC0080m.ON_STOP);
        }
        abstractComponentCallbacksC0060q.f1389M.e(EnumC0080m.ON_STOP);
        abstractComponentCallbacksC0060q.f1395a = 4;
        abstractComponentCallbacksC0060q.f1380C = false;
        abstractComponentCallbacksC0060q.v();
        if (abstractComponentCallbacksC0060q.f1380C) {
            this.f1273a.u(false);
            return;
        }
        throw new Y("Fragment " + abstractComponentCallbacksC0060q + " did not call through to super.onStop()");
    }

    public S(B.j jVar, T.v vVar, ClassLoader classLoader, E e2, Q q2) {
        this.f1273a = jVar;
        this.f1274b = vVar;
        AbstractComponentCallbacksC0060q a2 = e2.a(q2.f1262a);
        Bundle bundle = q2.f1269j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.B(bundle);
        a2.f1399e = q2.f1263b;
        a2.f1405m = q2.f1264c;
        a2.f1407o = true;
        a2.f1414v = q2.f1265d;
        a2.f1415w = q2.f1266e;
        a2.f1416x = q2.f1267f;
        a2.f1378A = q2.f1268g;
        a2.f1404l = q2.h;
        a2.f1418z = q2.i;
        a2.f1417y = q2.f1270k;
        a2.f1388L = EnumC0081n.values()[q2.f1271l];
        Bundle bundle2 = q2.f1272m;
        if (bundle2 != null) {
            a2.f1396b = bundle2;
        } else {
            a2.f1396b = new Bundle();
        }
        this.f1275c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public S(B.j jVar, T.v vVar, AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q, Q q2) {
        this.f1273a = jVar;
        this.f1274b = vVar;
        this.f1275c = abstractComponentCallbacksC0060q;
        abstractComponentCallbacksC0060q.f1397c = null;
        abstractComponentCallbacksC0060q.f1398d = null;
        abstractComponentCallbacksC0060q.f1409q = 0;
        abstractComponentCallbacksC0060q.f1406n = false;
        abstractComponentCallbacksC0060q.f1403k = false;
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q2 = abstractComponentCallbacksC0060q.f1401g;
        abstractComponentCallbacksC0060q.h = abstractComponentCallbacksC0060q2 != null ? abstractComponentCallbacksC0060q2.f1399e : null;
        abstractComponentCallbacksC0060q.f1401g = null;
        Bundle bundle = q2.f1272m;
        if (bundle != null) {
            abstractComponentCallbacksC0060q.f1396b = bundle;
        } else {
            abstractComponentCallbacksC0060q.f1396b = new Bundle();
        }
    }
}
