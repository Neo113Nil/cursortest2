package Y;

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
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.InterfaceC0067h;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.R;
import g.AbstractActivityC0128i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0050q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.S, InterfaceC0067h, j0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1441S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1442A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1444C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1445D;

    /* renamed from: E, reason: collision with root package name */
    public View f1446E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0049p f1448H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1449I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1450J;

    /* renamed from: K, reason: collision with root package name */
    public String f1451K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.v f1453M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1454N;

    /* renamed from: P, reason: collision with root package name */
    public j0.e f1456P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1457Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0047n f1458R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1460b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1461c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1463f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1464g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1466k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1467l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1468m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1469n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1470o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1471p;

    /* renamed from: q, reason: collision with root package name */
    public int f1472q;

    /* renamed from: r, reason: collision with root package name */
    public I f1473r;

    /* renamed from: s, reason: collision with root package name */
    public C0053u f1474s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1476u;

    /* renamed from: v, reason: collision with root package name */
    public int f1477v;

    /* renamed from: w, reason: collision with root package name */
    public int f1478w;

    /* renamed from: x, reason: collision with root package name */
    public String f1479x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1480y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1481z;

    /* renamed from: a, reason: collision with root package name */
    public int f1459a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1462e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1465j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1475t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1443B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1447G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0072m f1452L = EnumC0072m.f1887e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1455O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0050q() {
        new AtomicInteger();
        this.f1457Q = new ArrayList();
        this.f1458R = new C0047n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1444C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1475t.K();
        this.f1471p = true;
        this.f1454N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1446E = t2;
        if (t2 == null) {
            if (this.f1454N.f1359c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1454N = null;
            return;
        }
        this.f1454N.f();
        androidx.lifecycle.J.g(this.f1446E, this.f1454N);
        View view = this.f1446E;
        Q q2 = this.f1454N;
        k1.e.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        AbstractC0091d.t(this.f1446E, this.f1454N);
        this.f1455O.d(this.f1454N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1446E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1448H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1434b = i;
        f().f1435c = i2;
        f().d = i3;
        f().f1436e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1473r;
        if (i != null && (i.f1294E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1463f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final b0.c a() {
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
        b0.c cVar = new b0.c(0);
        LinkedHashMap linkedHashMap = cVar.f2040a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1861a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1862b, this);
        Bundle bundle = this.f1463f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1863c, bundle);
        }
        return cVar;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1456P.f3084b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        if (this.f1473r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1473r.f1300L.d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap.get(this.f1462e);
        if (q2 != null) {
            return q2;
        }
        androidx.lifecycle.Q q3 = new androidx.lifecycle.Q();
        hashMap.put(this.f1462e, q3);
        return q3;
    }

    public H1.l d() {
        return new C0048o(this);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v e() {
        return this.f1453M;
    }

    public final C0049p f() {
        if (this.f1448H == null) {
            C0049p c0049p = new C0049p();
            Object obj = f1441S;
            c0049p.f1438g = obj;
            c0049p.h = obj;
            c0049p.i = obj;
            c0049p.f1439j = 1.0f;
            c0049p.f1440k = null;
            this.f1448H = c0049p;
        }
        return this.f1448H;
    }

    public final I g() {
        if (this.f1474s != null) {
            return this.f1475t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0053u c0053u = this.f1474s;
        if (c0053u == null) {
            return null;
        }
        return c0053u.f1489b;
    }

    public final int i() {
        EnumC0072m enumC0072m = this.f1452L;
        return (enumC0072m == EnumC0072m.f1885b || this.f1476u == null) ? enumC0072m.ordinal() : Math.min(enumC0072m.ordinal(), this.f1476u.i());
    }

    public final I j() {
        I i = this.f1473r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1453M = new androidx.lifecycle.v(this);
        this.f1456P = new j0.e(this);
        ArrayList arrayList = this.f1457Q;
        C0047n c0047n = this.f1458R;
        if (arrayList.contains(c0047n)) {
            return;
        }
        if (this.f1459a < 0) {
            arrayList.add(c0047n);
            return;
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = c0047n.f1431a;
        abstractComponentCallbacksC0050q.f1456P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0050q);
    }

    public final void l() {
        k();
        this.f1451K = this.f1462e;
        this.f1462e = UUID.randomUUID().toString();
        this.f1466k = false;
        this.f1467l = false;
        this.f1468m = false;
        this.f1469n = false;
        this.f1470o = false;
        this.f1472q = 0;
        this.f1473r = null;
        this.f1475t = new I();
        this.f1474s = null;
        this.f1477v = 0;
        this.f1478w = 0;
        this.f1479x = null;
        this.f1480y = false;
        this.f1481z = false;
    }

    public final boolean m() {
        return this.f1474s != null && this.f1466k;
    }

    public final boolean n() {
        if (!this.f1480y) {
            I i = this.f1473r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1476u;
            i.getClass();
            if (!(abstractComponentCallbacksC0050q == null ? false : abstractComponentCallbacksC0050q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1472q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1444C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0053u c0053u = this.f1474s;
        AbstractActivityC0128i abstractActivityC0128i = c0053u == null ? null : c0053u.f1488a;
        if (abstractActivityC0128i != null) {
            abstractActivityC0128i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1444C = true;
    }

    public void p() {
        this.f1444C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0128i abstractActivityC0128i) {
        this.f1444C = true;
        C0053u c0053u = this.f1474s;
        if ((c0053u == null ? null : c0053u.f1488a) != null) {
            this.f1444C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1444C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1475t.Q(parcelable);
            I i = this.f1475t;
            i.f1294E = false;
            i.F = false;
            i.f1300L.f1336g = false;
            i.t(1);
        }
        I i2 = this.f1475t;
        if (i2.f1317s >= 1) {
            return;
        }
        i2.f1294E = false;
        i2.F = false;
        i2.f1300L.f1336g = false;
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
        sb.append(this.f1462e);
        if (this.f1477v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1477v));
        }
        if (this.f1479x != null) {
            sb.append(" tag=");
            sb.append(this.f1479x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1444C = true;
    }

    public void v() {
        this.f1444C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0053u c0053u = this.f1474s;
        if (c0053u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0128i abstractActivityC0128i = c0053u.f1491e;
        LayoutInflater cloneInContext = abstractActivityC0128i.getLayoutInflater().cloneInContext(abstractActivityC0128i);
        cloneInContext.setFactory2(this.f1475t.f1306f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1444C = true;
    }

    public void z() {
        this.f1444C = true;
    }
}
