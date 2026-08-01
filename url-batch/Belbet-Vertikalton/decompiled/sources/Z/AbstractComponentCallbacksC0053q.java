package Z;

import a.AbstractC0058a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0078m;
import androidx.lifecycle.InterfaceC0073h;
import c0.C0103c;
import com.winpower.neonfit.R;
import h.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0053q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.S, InterfaceC0073h, j0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1590S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1591A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1593C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1594D;

    /* renamed from: E, reason: collision with root package name */
    public View f1595E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1596F;
    public C0052p H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1598I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1599J;

    /* renamed from: K, reason: collision with root package name */
    public String f1600K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.v f1602M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1603N;

    /* renamed from: P, reason: collision with root package name */
    public j0.e f1605P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1606Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0050n f1607R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1609b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1610c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1611d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1612f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0053q f1613g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1615k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1616l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1617m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1618n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1619o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1620p;

    /* renamed from: q, reason: collision with root package name */
    public int f1621q;

    /* renamed from: r, reason: collision with root package name */
    public I f1622r;

    /* renamed from: s, reason: collision with root package name */
    public C0056u f1623s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0053q f1625u;

    /* renamed from: v, reason: collision with root package name */
    public int f1626v;

    /* renamed from: w, reason: collision with root package name */
    public int f1627w;

    /* renamed from: x, reason: collision with root package name */
    public String f1628x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1629y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1630z;

    /* renamed from: a, reason: collision with root package name */
    public int f1608a = -1;
    public String e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f1614h = null;
    public Boolean j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1624t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1592B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1597G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0078m f1601L = EnumC0078m.e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1604O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0053q() {
        new AtomicInteger();
        this.f1606Q = new ArrayList();
        this.f1607R = new C0050n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1593C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1624t.K();
        this.f1620p = true;
        this.f1603N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1595E = t2;
        if (t2 == null) {
            if (this.f1603N.f1505c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1603N = null;
            return;
        }
        this.f1603N.f();
        androidx.lifecycle.J.g(this.f1595E, this.f1603N);
        View view = this.f1595E;
        Q q2 = this.f1603N;
        j1.h.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        AbstractC0058a.Y(this.f1595E, this.f1603N);
        this.f1604O.d(this.f1603N);
    }

    public final Context C() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1595E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1583b = i;
        f().f1584c = i2;
        f().f1585d = i3;
        f().e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1622r;
        if (i != null && (i.f1437E || i.f1438F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1612f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0073h
    public final C0103c a() {
        Application application;
        Context applicationContext = C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0103c c0103c = new C0103c(0);
        LinkedHashMap linkedHashMap = c0103c.f2228a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1912d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1909a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1910b, this);
        Bundle bundle = this.f1612f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1911c, bundle);
        }
        return c0103c;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1605P.f3167b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        if (this.f1622r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1622r.f1443L.f1479d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap.get(this.e);
        if (q2 != null) {
            return q2;
        }
        androidx.lifecycle.Q q3 = new androidx.lifecycle.Q();
        hashMap.put(this.e, q3);
        return q3;
    }

    public H1.d d() {
        return new C0051o(this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1602M;
    }

    public final C0052p f() {
        if (this.H == null) {
            C0052p c0052p = new C0052p();
            Object obj = f1590S;
            c0052p.f1587g = obj;
            c0052p.f1588h = obj;
            c0052p.i = obj;
            c0052p.j = 1.0f;
            c0052p.f1589k = null;
            this.H = c0052p;
        }
        return this.H;
    }

    public final I g() {
        if (this.f1623s != null) {
            return this.f1624t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0056u c0056u = this.f1623s;
        if (c0056u == null) {
            return null;
        }
        return c0056u.f1638c;
    }

    public final int i() {
        EnumC0078m enumC0078m = this.f1601L;
        return (enumC0078m == EnumC0078m.f1935b || this.f1625u == null) ? enumC0078m.ordinal() : Math.min(enumC0078m.ordinal(), this.f1625u.i());
    }

    public final I j() {
        I i = this.f1622r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1602M = new androidx.lifecycle.v(this);
        this.f1605P = new j0.e(this);
        ArrayList arrayList = this.f1606Q;
        C0050n c0050n = this.f1607R;
        if (arrayList.contains(c0050n)) {
            return;
        }
        if (this.f1608a < 0) {
            arrayList.add(c0050n);
            return;
        }
        AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = c0050n.f1580a;
        abstractComponentCallbacksC0053q.f1605P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0053q);
    }

    public final void l() {
        k();
        this.f1600K = this.e;
        this.e = UUID.randomUUID().toString();
        this.f1615k = false;
        this.f1616l = false;
        this.f1617m = false;
        this.f1618n = false;
        this.f1619o = false;
        this.f1621q = 0;
        this.f1622r = null;
        this.f1624t = new I();
        this.f1623s = null;
        this.f1626v = 0;
        this.f1627w = 0;
        this.f1628x = null;
        this.f1629y = false;
        this.f1630z = false;
    }

    public final boolean m() {
        return this.f1623s != null && this.f1615k;
    }

    public final boolean n() {
        if (!this.f1629y) {
            I i = this.f1622r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0053q abstractComponentCallbacksC0053q = this.f1625u;
            i.getClass();
            if (!(abstractComponentCallbacksC0053q == null ? false : abstractComponentCallbacksC0053q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1621q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1593C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0056u c0056u = this.f1623s;
        AbstractActivityC0132i abstractActivityC0132i = c0056u == null ? null : c0056u.f1637b;
        if (abstractActivityC0132i != null) {
            abstractActivityC0132i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1593C = true;
    }

    public void p() {
        this.f1593C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0132i abstractActivityC0132i) {
        this.f1593C = true;
        C0056u c0056u = this.f1623s;
        if ((c0056u == null ? null : c0056u.f1637b) != null) {
            this.f1593C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1593C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1624t.Q(parcelable);
            I i = this.f1624t;
            i.f1437E = false;
            i.f1438F = false;
            i.f1443L.f1481g = false;
            i.t(1);
        }
        I i2 = this.f1624t;
        if (i2.f1460s >= 1) {
            return;
        }
        i2.f1437E = false;
        i2.f1438F = false;
        i2.f1443L.f1481g = false;
        i2.t(1);
    }

    public View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.f1626v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1626v));
        }
        if (this.f1628x != null) {
            sb.append(" tag=");
            sb.append(this.f1628x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1593C = true;
    }

    public void v() {
        this.f1593C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0056u c0056u = this.f1623s;
        if (c0056u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0132i abstractActivityC0132i = c0056u.f1640f;
        LayoutInflater cloneInContext = abstractActivityC0132i.getLayoutInflater().cloneInContext(abstractActivityC0132i);
        cloneInContext.setFactory2(this.f1624t.f1449f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1593C = true;
    }

    public void z() {
        this.f1593C = true;
    }
}
