package Z;

import G1.AbstractC0001b;
import a0.AbstractC0062d;
import a0.C0059a;
import a0.C0061c;
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
import androidx.lifecycle.EnumC0077l;
import androidx.lifecycle.EnumC0078m;
import com.winpower.neonfit.R;
import e0.C0114a;
import j0.C0196a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final B1.c f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final V.v f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0053q f1494c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1495d = false;
    public int e = -1;

    public O(B1.c cVar, V.v vVar, AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q) {
        this.f1492a = cVar;
        this.f1493b = vVar;
        this.f1494c = abstractComponentCallbacksC0053q;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0053q);
        }
        Bundle bundle = abstractComponentCallbacksC0053q.f1609b;
        abstractComponentCallbacksC0053q.f1624t.K();
        abstractComponentCallbacksC0053q.f1608a = 3;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.p();
        if (!abstractComponentCallbacksC0053q.f1593C) {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0053q);
        }
        View view = abstractComponentCallbacksC0053q.f1595E;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0053q.f1609b;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0053q.f1610c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0053q.f1610c = null;
            }
            if (abstractComponentCallbacksC0053q.f1595E != null) {
                abstractComponentCallbacksC0053q.f1603N.f1506d.b(abstractComponentCallbacksC0053q.f1611d);
                abstractComponentCallbacksC0053q.f1611d = null;
            }
            abstractComponentCallbacksC0053q.f1593C = false;
            abstractComponentCallbacksC0053q.A(bundle2);
            if (!abstractComponentCallbacksC0053q.f1593C) {
                throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0053q.f1595E != null) {
                abstractComponentCallbacksC0053q.f1603N.d(EnumC0077l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0053q.f1609b = null;
        I i = abstractComponentCallbacksC0053q.f1624t;
        i.f1437E = false;
        i.f1438F = false;
        i.f1443L.f1481g = false;
        i.t(4);
        this.f1492a.f(false);
    }

    public final void b() {
        View view;
        View view2;
        V.v vVar = this.f1493b;
        vVar.getClass();
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        ViewGroup viewGroup = abstractComponentCallbacksC0053q.f1594D;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) vVar.f1305a;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0053q);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = (AbstractComponentCallbacksC0053q) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0053q2.f1594D == viewGroup && (view = abstractComponentCallbacksC0053q2.f1595E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = (AbstractComponentCallbacksC0053q) arrayList.get(i2);
                    if (abstractComponentCallbacksC0053q3.f1594D == viewGroup && (view2 = abstractComponentCallbacksC0053q3.f1595E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0053q.f1594D.addView(abstractComponentCallbacksC0053q.f1595E, i);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0053q);
        }
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = abstractComponentCallbacksC0053q.f1613g;
        O o2 = null;
        V.v vVar = this.f1493b;
        if (abstractComponentCallbacksC0053q2 != null) {
            O o3 = (O) ((HashMap) vVar.f1306b).get(abstractComponentCallbacksC0053q2.e);
            if (o3 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0053q + " declared target fragment " + abstractComponentCallbacksC0053q.f1613g + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0053q.f1614h = abstractComponentCallbacksC0053q.f1613g.e;
            abstractComponentCallbacksC0053q.f1613g = null;
            o2 = o3;
        } else {
            String str = abstractComponentCallbacksC0053q.f1614h;
            if (str != null && (o2 = (O) ((HashMap) vVar.f1306b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0053q);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC0001b.g(sb, abstractComponentCallbacksC0053q.f1614h, " that does not belong to this FragmentManager!"));
            }
        }
        if (o2 != null) {
            o2.k();
        }
        I i = abstractComponentCallbacksC0053q.f1622r;
        abstractComponentCallbacksC0053q.f1623s = i.f1461t;
        abstractComponentCallbacksC0053q.f1625u = i.f1463v;
        B1.c cVar = this.f1492a;
        cVar.m(false);
        ArrayList arrayList = abstractComponentCallbacksC0053q.f1606Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q3 = ((C0050n) it.next()).f1580a;
            abstractComponentCallbacksC0053q3.f1605P.a();
            androidx.lifecycle.J.d(abstractComponentCallbacksC0053q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0053q.f1624t.b(abstractComponentCallbacksC0053q.f1623s, abstractComponentCallbacksC0053q.d(), abstractComponentCallbacksC0053q);
        abstractComponentCallbacksC0053q.f1608a = 0;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.r(abstractComponentCallbacksC0053q.f1623s.f1638c);
        if (!abstractComponentCallbacksC0053q.f1593C) {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0053q.f1622r.f1454m.iterator();
        while (it2.hasNext()) {
            ((M) it2.next()).f();
        }
        I i2 = abstractComponentCallbacksC0053q.f1624t;
        i2.f1437E = false;
        i2.f1438F = false;
        i2.f1443L.f1481g = false;
        i2.t(0);
        cVar.g(false);
    }

    public final int d() {
        U u2;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (abstractComponentCallbacksC0053q.f1622r == null) {
            return abstractComponentCallbacksC0053q.f1608a;
        }
        int i = this.e;
        int ordinal = abstractComponentCallbacksC0053q.f1601L.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0053q.f1617m) {
            if (abstractComponentCallbacksC0053q.f1618n) {
                i = Math.max(this.e, 2);
                View view = abstractComponentCallbacksC0053q.f1595E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, abstractComponentCallbacksC0053q.f1608a) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0053q.f1615k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0053q.f1594D;
        if (viewGroup != null) {
            C0045i f2 = C0045i.f(viewGroup, abstractComponentCallbacksC0053q.j().D());
            f2.getClass();
            U d2 = f2.d(abstractComponentCallbacksC0053q);
            r6 = d2 != null ? d2.f1513b : 0;
            Iterator it = f2.f1561c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    u2 = null;
                    break;
                }
                u2 = (U) it.next();
                if (u2.f1514c.equals(abstractComponentCallbacksC0053q) && !u2.f1516f) {
                    break;
                }
            }
            if (u2 != null && (r6 == 0 || r6 == 1)) {
                r6 = u2.f1513b;
            }
        }
        if (r6 == 2) {
            i = Math.min(i, 6);
        } else if (r6 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0053q.f1616l) {
            i = abstractComponentCallbacksC0053q.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0053q.f1596F && abstractComponentCallbacksC0053q.f1608a < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0053q);
        }
        return i;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0053q);
        }
        if (abstractComponentCallbacksC0053q.f1599J) {
            Bundle bundle = abstractComponentCallbacksC0053q.f1609b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0053q.f1624t.Q(parcelable);
                I i = abstractComponentCallbacksC0053q.f1624t;
                i.f1437E = false;
                i.f1438F = false;
                i.f1443L.f1481g = false;
                i.t(1);
            }
            abstractComponentCallbacksC0053q.f1608a = 1;
            return;
        }
        B1.c cVar = this.f1492a;
        cVar.n(false);
        Bundle bundle2 = abstractComponentCallbacksC0053q.f1609b;
        abstractComponentCallbacksC0053q.f1624t.K();
        abstractComponentCallbacksC0053q.f1608a = 1;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.f1602M.a(new C0196a(1, abstractComponentCallbacksC0053q));
        abstractComponentCallbacksC0053q.f1605P.b(bundle2);
        abstractComponentCallbacksC0053q.s(bundle2);
        abstractComponentCallbacksC0053q.f1599J = true;
        if (abstractComponentCallbacksC0053q.f1593C) {
            abstractComponentCallbacksC0053q.f1602M.d(EnumC0077l.ON_CREATE);
            cVar.h(false);
        } else {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (abstractComponentCallbacksC0053q.f1617m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0053q);
        }
        LayoutInflater w2 = abstractComponentCallbacksC0053q.w(abstractComponentCallbacksC0053q.f1609b);
        ViewGroup viewGroup = abstractComponentCallbacksC0053q.f1594D;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0053q.f1627w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0053q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0053q.f1622r.f1462u.S(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0053q.f1619o) {
                        try {
                            str = abstractComponentCallbacksC0053q.C().getResources().getResourceName(abstractComponentCallbacksC0053q.f1627w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0053q.f1627w) + " (" + str + ") for fragment " + abstractComponentCallbacksC0053q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0061c c0061c = AbstractC0062d.f1665a;
                    AbstractC0062d.b(new C0059a(abstractComponentCallbacksC0053q, "Attempting to add fragment " + abstractComponentCallbacksC0053q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0062d.a(abstractComponentCallbacksC0053q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0053q.f1594D = viewGroup;
        abstractComponentCallbacksC0053q.B(w2, viewGroup, abstractComponentCallbacksC0053q.f1609b);
        View view = abstractComponentCallbacksC0053q.f1595E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0053q.f1595E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0053q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0053q.f1629y) {
                abstractComponentCallbacksC0053q.f1595E.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0053q.f1595E;
            WeakHashMap weakHashMap = M.P.f711a;
            if (view2.isAttachedToWindow()) {
                M.C.c(abstractComponentCallbacksC0053q.f1595E);
            } else {
                View view3 = abstractComponentCallbacksC0053q.f1595E;
                view3.addOnAttachStateChangeListener(new Q0.o(1, view3));
            }
            abstractComponentCallbacksC0053q.f1624t.t(2);
            this.f1492a.t(false);
            int visibility = abstractComponentCallbacksC0053q.f1595E.getVisibility();
            abstractComponentCallbacksC0053q.f().j = abstractComponentCallbacksC0053q.f1595E.getAlpha();
            if (abstractComponentCallbacksC0053q.f1594D != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0053q.f1595E.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0053q.f().f1589k = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0053q);
                    }
                }
                abstractComponentCallbacksC0053q.f1595E.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0053q.f1608a = 2;
    }

    public final void g() {
        boolean z2;
        AbstractComponentCallbacksC0053q d2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0053q);
        }
        boolean z3 = abstractComponentCallbacksC0053q.f1616l && !abstractComponentCallbacksC0053q.o();
        V.v vVar = this.f1493b;
        if (z3) {
        }
        if (!z3) {
            L l2 = (L) vVar.f1308d;
            if (!((l2.f1477b.containsKey(abstractComponentCallbacksC0053q.e) && l2.e) ? l2.f1480f : true)) {
                String str = abstractComponentCallbacksC0053q.f1614h;
                if (str != null && (d2 = vVar.d(str)) != null && d2.f1591A) {
                    abstractComponentCallbacksC0053q.f1613g = d2;
                }
                abstractComponentCallbacksC0053q.f1608a = 0;
                return;
            }
        }
        C0056u c0056u = abstractComponentCallbacksC0053q.f1623s;
        if (c0056u != null) {
            z2 = ((L) vVar.f1308d).f1480f;
        } else {
            z2 = c0056u.f1638c != null ? !r5.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            ((L) vVar.f1308d).c(abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1624t.k();
        abstractComponentCallbacksC0053q.f1602M.d(EnumC0077l.ON_DESTROY);
        abstractComponentCallbacksC0053q.f1608a = 0;
        abstractComponentCallbacksC0053q.f1599J = false;
        abstractComponentCallbacksC0053q.f1593C = true;
        this.f1492a.i(false);
        Iterator it = vVar.h().iterator();
        while (it.hasNext()) {
            O o2 = (O) it.next();
            if (o2 != null) {
                String str2 = abstractComponentCallbacksC0053q.e;
                AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = o2.f1494c;
                if (str2.equals(abstractComponentCallbacksC0053q2.f1614h)) {
                    abstractComponentCallbacksC0053q2.f1613g = abstractComponentCallbacksC0053q;
                    abstractComponentCallbacksC0053q2.f1614h = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0053q.f1614h;
        if (str3 != null) {
            abstractComponentCallbacksC0053q.f1613g = vVar.d(str3);
        }
        vVar.n(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0053q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0053q.f1594D;
        if (viewGroup != null && (view = abstractComponentCallbacksC0053q.f1595E) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0053q.f1624t.t(1);
        if (abstractComponentCallbacksC0053q.f1595E != null) {
            Q q2 = abstractComponentCallbacksC0053q.f1603N;
            q2.f();
            if (q2.f1505c.f1949d.compareTo(EnumC0078m.f1936c) >= 0) {
                abstractComponentCallbacksC0053q.f1603N.d(EnumC0077l.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0053q.f1608a = 1;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.u();
        if (!abstractComponentCallbacksC0053q.f1593C) {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onDestroyView()");
        }
        q.l lVar = ((C0114a) new C1.d(abstractComponentCallbacksC0053q.c(), C0114a.f2652c).s(C0114a.class)).f2653b;
        if (lVar.f3929c > 0) {
            lVar.f3928b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0053q.f1620p = false;
        this.f1492a.u(false);
        abstractComponentCallbacksC0053q.f1594D = null;
        abstractComponentCallbacksC0053q.f1595E = null;
        abstractComponentCallbacksC0053q.f1603N = null;
        abstractComponentCallbacksC0053q.f1604O.d(null);
        abstractComponentCallbacksC0053q.f1618n = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1608a = -1;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.v();
        if (!abstractComponentCallbacksC0053q.f1593C) {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onDetach()");
        }
        I i = abstractComponentCallbacksC0053q.f1624t;
        if (!i.f1439G) {
            i.k();
            abstractComponentCallbacksC0053q.f1624t = new I();
        }
        this.f1492a.j(false);
        abstractComponentCallbacksC0053q.f1608a = -1;
        abstractComponentCallbacksC0053q.f1623s = null;
        abstractComponentCallbacksC0053q.f1625u = null;
        abstractComponentCallbacksC0053q.f1622r = null;
        if (!abstractComponentCallbacksC0053q.f1616l || abstractComponentCallbacksC0053q.o()) {
            L l2 = (L) this.f1493b.f1308d;
            boolean z2 = true;
            if (l2.f1477b.containsKey(abstractComponentCallbacksC0053q.e) && l2.e) {
                z2 = l2.f1480f;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.l();
    }

    public final void j() {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (abstractComponentCallbacksC0053q.f1617m && abstractComponentCallbacksC0053q.f1618n && !abstractComponentCallbacksC0053q.f1620p) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0053q);
            }
            abstractComponentCallbacksC0053q.B(abstractComponentCallbacksC0053q.w(abstractComponentCallbacksC0053q.f1609b), null, abstractComponentCallbacksC0053q.f1609b);
            View view = abstractComponentCallbacksC0053q.f1595E;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0053q.f1595E.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0053q);
                if (abstractComponentCallbacksC0053q.f1629y) {
                    abstractComponentCallbacksC0053q.f1595E.setVisibility(8);
                }
                abstractComponentCallbacksC0053q.f1624t.t(2);
                this.f1492a.t(false);
                abstractComponentCallbacksC0053q.f1608a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        V.v vVar = this.f1493b;
        boolean z2 = this.f1495d;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0053q);
                return;
            }
            return;
        }
        try {
            this.f1495d = true;
            boolean z3 = false;
            while (true) {
                int d2 = d();
                int i = abstractComponentCallbacksC0053q.f1608a;
                if (d2 == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0053q.f1616l && !abstractComponentCallbacksC0053q.o()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0053q);
                        }
                        ((L) vVar.f1308d).c(abstractComponentCallbacksC0053q);
                        vVar.n(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0053q);
                        }
                        abstractComponentCallbacksC0053q.l();
                    }
                    if (abstractComponentCallbacksC0053q.f1598I) {
                        if (abstractComponentCallbacksC0053q.f1595E != null && (viewGroup = abstractComponentCallbacksC0053q.f1594D) != null) {
                            C0045i f2 = C0045i.f(viewGroup, abstractComponentCallbacksC0053q.j().D());
                            if (abstractComponentCallbacksC0053q.f1629y) {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0053q);
                                }
                                f2.a(3, 1, this);
                            } else {
                                f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0053q);
                                }
                                f2.a(2, 1, this);
                            }
                        }
                        I i2 = abstractComponentCallbacksC0053q.f1622r;
                        if (i2 != null && abstractComponentCallbacksC0053q.f1615k && I.F(abstractComponentCallbacksC0053q)) {
                            i2.f1436D = true;
                        }
                        abstractComponentCallbacksC0053q.f1598I = false;
                        abstractComponentCallbacksC0053q.f1624t.n();
                    }
                    this.f1495d = false;
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
                            abstractComponentCallbacksC0053q.f1608a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0053q.f1618n = false;
                            abstractComponentCallbacksC0053q.f1608a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0053q);
                            }
                            if (abstractComponentCallbacksC0053q.f1595E != null && abstractComponentCallbacksC0053q.f1610c == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0053q.f1595E != null && (viewGroup2 = abstractComponentCallbacksC0053q.f1594D) != null) {
                                C0045i f3 = C0045i.f(viewGroup2, abstractComponentCallbacksC0053q.j().D());
                                f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0053q);
                                }
                                f3.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0053q.f1608a = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0053q.f1608a = 5;
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
                            if (abstractComponentCallbacksC0053q.f1595E != null && (viewGroup3 = abstractComponentCallbacksC0053q.f1594D) != null) {
                                C0045i f4 = C0045i.f(viewGroup3, abstractComponentCallbacksC0053q.j().D());
                                int b2 = AbstractC0001b.b(abstractComponentCallbacksC0053q.f1595E.getVisibility());
                                f4.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0053q);
                                }
                                f4.a(b2, 2, this);
                            }
                            abstractComponentCallbacksC0053q.f1608a = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0053q.f1608a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1495d = false;
            throw th;
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1624t.t(5);
        if (abstractComponentCallbacksC0053q.f1595E != null) {
            abstractComponentCallbacksC0053q.f1603N.d(EnumC0077l.ON_PAUSE);
        }
        abstractComponentCallbacksC0053q.f1602M.d(EnumC0077l.ON_PAUSE);
        abstractComponentCallbacksC0053q.f1608a = 6;
        abstractComponentCallbacksC0053q.f1593C = true;
        this.f1492a.l(false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        Bundle bundle = abstractComponentCallbacksC0053q.f1609b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0053q.f1610c = abstractComponentCallbacksC0053q.f1609b.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0053q.f1611d = abstractComponentCallbacksC0053q.f1609b.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0053q.f1609b.getString("android:target_state");
        abstractComponentCallbacksC0053q.f1614h = string;
        if (string != null) {
            abstractComponentCallbacksC0053q.i = abstractComponentCallbacksC0053q.f1609b.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0053q.f1609b.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0053q.f1597G = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0053q.f1596F = true;
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0053q);
        }
        C0052p c0052p = abstractComponentCallbacksC0053q.H;
        View view = c0052p == null ? null : c0052p.f1589k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0053q.f1595E) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0053q.f1595E) {
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
                sb.append(abstractComponentCallbacksC0053q);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0053q.f1595E.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0053q.f().f1589k = null;
        abstractComponentCallbacksC0053q.f1624t.K();
        abstractComponentCallbacksC0053q.f1624t.y(true);
        abstractComponentCallbacksC0053q.f1608a = 7;
        abstractComponentCallbacksC0053q.f1593C = true;
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0053q.f1602M;
        EnumC0077l enumC0077l = EnumC0077l.ON_RESUME;
        vVar.d(enumC0077l);
        if (abstractComponentCallbacksC0053q.f1595E != null) {
            abstractComponentCallbacksC0053q.f1603N.f1505c.d(enumC0077l);
        }
        I i = abstractComponentCallbacksC0053q.f1624t;
        i.f1437E = false;
        i.f1438F = false;
        i.f1443L.f1481g = false;
        i.t(7);
        this.f1492a.o(false);
        abstractComponentCallbacksC0053q.f1609b = null;
        abstractComponentCallbacksC0053q.f1610c = null;
        abstractComponentCallbacksC0053q.f1611d = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (abstractComponentCallbacksC0053q.f1595E == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0053q + " with view " + abstractComponentCallbacksC0053q.f1595E);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0053q.f1595E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0053q.f1610c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0053q.f1603N.f1506d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0053q.f1611d = bundle;
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0053q);
        }
        abstractComponentCallbacksC0053q.f1624t.K();
        abstractComponentCallbacksC0053q.f1624t.y(true);
        abstractComponentCallbacksC0053q.f1608a = 5;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.y();
        if (!abstractComponentCallbacksC0053q.f1593C) {
            throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = abstractComponentCallbacksC0053q.f1602M;
        EnumC0077l enumC0077l = EnumC0077l.ON_START;
        vVar.d(enumC0077l);
        if (abstractComponentCallbacksC0053q.f1595E != null) {
            abstractComponentCallbacksC0053q.f1603N.f1505c.d(enumC0077l);
        }
        I i = abstractComponentCallbacksC0053q.f1624t;
        i.f1437E = false;
        i.f1438F = false;
        i.f1443L.f1481g = false;
        i.t(5);
        this.f1492a.r(false);
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1494c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0053q);
        }
        I i = abstractComponentCallbacksC0053q.f1624t;
        i.f1438F = true;
        i.f1443L.f1481g = true;
        i.t(4);
        if (abstractComponentCallbacksC0053q.f1595E != null) {
            abstractComponentCallbacksC0053q.f1603N.d(EnumC0077l.ON_STOP);
        }
        abstractComponentCallbacksC0053q.f1602M.d(EnumC0077l.ON_STOP);
        abstractComponentCallbacksC0053q.f1608a = 4;
        abstractComponentCallbacksC0053q.f1593C = false;
        abstractComponentCallbacksC0053q.z();
        if (abstractComponentCallbacksC0053q.f1593C) {
            this.f1492a.s(false);
            return;
        }
        throw new V("Fragment " + abstractComponentCallbacksC0053q + " did not call through to super.onStop()");
    }

    public O(B1.c cVar, V.v vVar, ClassLoader classLoader, C c2, N n2) {
        this.f1492a = cVar;
        this.f1493b = vVar;
        AbstractComponentCallbacksC0053q a2 = c2.a(n2.f1482a);
        Bundle bundle = n2.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.F(bundle);
        a2.e = n2.f1483b;
        a2.f1617m = n2.f1484c;
        a2.f1619o = true;
        a2.f1626v = n2.f1485d;
        a2.f1627w = n2.e;
        a2.f1628x = n2.f1486f;
        a2.f1591A = n2.f1487g;
        a2.f1616l = n2.f1488h;
        a2.f1630z = n2.i;
        a2.f1629y = n2.f1489k;
        a2.f1601L = EnumC0078m.values()[n2.f1490l];
        Bundle bundle2 = n2.f1491m;
        if (bundle2 != null) {
            a2.f1609b = bundle2;
        } else {
            a2.f1609b = new Bundle();
        }
        this.f1494c = a2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public O(B1.c cVar, V.v vVar, AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q, N n2) {
        this.f1492a = cVar;
        this.f1493b = vVar;
        this.f1494c = abstractComponentCallbacksC0053q;
        abstractComponentCallbacksC0053q.f1610c = null;
        abstractComponentCallbacksC0053q.f1611d = null;
        abstractComponentCallbacksC0053q.f1621q = 0;
        abstractComponentCallbacksC0053q.f1618n = false;
        abstractComponentCallbacksC0053q.f1615k = false;
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q2 = abstractComponentCallbacksC0053q.f1613g;
        abstractComponentCallbacksC0053q.f1614h = abstractComponentCallbacksC0053q2 != null ? abstractComponentCallbacksC0053q2.e : null;
        abstractComponentCallbacksC0053q.f1613g = null;
        Bundle bundle = n2.f1491m;
        if (bundle != null) {
            abstractComponentCallbacksC0053q.f1609b = bundle;
        } else {
            abstractComponentCallbacksC0053q.f1609b = new Bundle();
        }
    }
}
