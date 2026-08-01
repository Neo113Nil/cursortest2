package androidx.fragment.app;

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
import androidx.lifecycle.AbstractC0082o;
import androidx.lifecycle.C0088v;
import androidx.lifecycle.EnumC0081n;
import androidx.lifecycle.InterfaceC0076i;
import androidx.lifecycle.InterfaceC0086t;
import com.fortuneink.neonpad.R;
import g.AbstractActivityC0158k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.fragment.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0060q implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0086t, androidx.lifecycle.V, InterfaceC0076i, g0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1376S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1377A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1379C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1380D;

    /* renamed from: E, reason: collision with root package name */
    public View f1381E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0059p f1383H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1384I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1385J;

    /* renamed from: K, reason: collision with root package name */
    public String f1386K;

    /* renamed from: M, reason: collision with root package name */
    public C0088v f1388M;

    /* renamed from: N, reason: collision with root package name */
    public U f1389N;

    /* renamed from: P, reason: collision with root package name */
    public g0.e f1391P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1392Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0057n f1393R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1395b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1396c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1397d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1399f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0060q f1400g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1402k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1403l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1404m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1406o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1407p;

    /* renamed from: q, reason: collision with root package name */
    public int f1408q;

    /* renamed from: r, reason: collision with root package name */
    public K f1409r;

    /* renamed from: s, reason: collision with root package name */
    public C0063u f1410s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0060q f1412u;

    /* renamed from: v, reason: collision with root package name */
    public int f1413v;

    /* renamed from: w, reason: collision with root package name */
    public int f1414w;

    /* renamed from: x, reason: collision with root package name */
    public String f1415x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1416y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1417z;

    /* renamed from: a, reason: collision with root package name */
    public int f1394a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1398e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1401j = null;

    /* renamed from: t, reason: collision with root package name */
    public L f1411t = new L();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1378B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1382G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0081n f1387L = EnumC0081n.f1492e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1390O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0060q() {
        new AtomicInteger();
        this.f1392Q = new ArrayList();
        this.f1393R = new C0057n(this);
        g();
    }

    public final void A(int i, int i2, int i3, int i4) {
        if (this.f1383H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        b().f1368b = i;
        b().f1369c = i2;
        b().f1370d = i3;
        b().f1371e = i4;
    }

    public final void B(Bundle bundle) {
        K k2 = this.f1409r;
        if (k2 != null && (k2.f1215E || k2.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1399f = bundle;
    }

    public q1.l a() {
        return new C0058o(this);
    }

    public final C0059p b() {
        if (this.f1383H == null) {
            C0059p c0059p = new C0059p();
            Object obj = f1376S;
            c0059p.f1373g = obj;
            c0059p.h = obj;
            c0059p.i = obj;
            c0059p.f1374j = 1.0f;
            c0059p.f1375k = null;
            this.f1383H = c0059p;
        }
        return this.f1383H;
    }

    public final K c() {
        if (this.f1410s != null) {
            return this.f1411t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context d() {
        C0063u c0063u = this.f1410s;
        if (c0063u == null) {
            return null;
        }
        return c0063u.h;
    }

    public final int e() {
        EnumC0081n enumC0081n = this.f1387L;
        return (enumC0081n == EnumC0081n.f1489b || this.f1412u == null) ? enumC0081n.ordinal() : Math.min(enumC0081n.ordinal(), this.f1412u.e());
    }

    public final K f() {
        K k2 = this.f1409r;
        if (k2 != null) {
            return k2;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void g() {
        this.f1388M = new C0088v(this);
        this.f1391P = new g0.e(this);
        ArrayList arrayList = this.f1392Q;
        C0057n c0057n = this.f1393R;
        if (arrayList.contains(c0057n)) {
            return;
        }
        if (this.f1394a < 0) {
            arrayList.add(c0057n);
            return;
        }
        AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = c0057n.f1365a;
        abstractComponentCallbacksC0060q.f1391P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0060q);
    }

    @Override // androidx.lifecycle.InterfaceC0076i
    public final Z.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = y().getApplicationContext();
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
            Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        Z.c cVar = new Z.c(0);
        LinkedHashMap linkedHashMap = cVar.f882a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.Q.f1472d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1453a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1454b, this);
        Bundle bundle = this.f1399f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1455c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.InterfaceC0086t
    public final AbstractC0082o getLifecycle() {
        return this.f1388M;
    }

    @Override // g0.f
    public final g0.d getSavedStateRegistry() {
        return this.f1391P.f2615b;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U getViewModelStore() {
        if (this.f1409r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (e() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1409r.f1221L.f1257d;
        androidx.lifecycle.U u2 = (androidx.lifecycle.U) hashMap.get(this.f1398e);
        if (u2 != null) {
            return u2;
        }
        androidx.lifecycle.U u3 = new androidx.lifecycle.U();
        hashMap.put(this.f1398e, u3);
        return u3;
    }

    public final void h() {
        g();
        this.f1386K = this.f1398e;
        this.f1398e = UUID.randomUUID().toString();
        this.f1402k = false;
        this.f1403l = false;
        this.f1404m = false;
        this.f1405n = false;
        this.f1406o = false;
        this.f1408q = 0;
        this.f1409r = null;
        this.f1411t = new L();
        this.f1410s = null;
        this.f1413v = 0;
        this.f1414w = 0;
        this.f1415x = null;
        this.f1416y = false;
        this.f1417z = false;
    }

    public final boolean i() {
        return this.f1410s != null && this.f1402k;
    }

    public final boolean j() {
        if (!this.f1416y) {
            K k2 = this.f1409r;
            if (k2 == null) {
                return false;
            }
            AbstractComponentCallbacksC0060q abstractComponentCallbacksC0060q = this.f1412u;
            k2.getClass();
            if (!(abstractComponentCallbacksC0060q == null ? false : abstractComponentCallbacksC0060q.j())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        return this.f1408q > 0;
    }

    public void l() {
        this.f1379C = true;
    }

    public final void m(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void n(AbstractActivityC0064v abstractActivityC0064v) {
        this.f1379C = true;
        C0063u c0063u = this.f1410s;
        if ((c0063u == null ? null : c0063u.f1423g) != null) {
            this.f1379C = true;
        }
    }

    public void o(Bundle bundle) {
        Parcelable parcelable;
        this.f1379C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1411t.Q(parcelable);
            L l2 = this.f1411t;
            l2.f1215E = false;
            l2.F = false;
            l2.f1221L.f1260g = false;
            l2.t(1);
        }
        L l3 = this.f1411t;
        if (l3.f1239s >= 1) {
            return;
        }
        l3.f1215E = false;
        l3.F = false;
        l3.f1221L.f1260g = false;
        l3.t(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1379C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0063u c0063u = this.f1410s;
        AbstractActivityC0064v abstractActivityC0064v = c0063u == null ? null : c0063u.f1423g;
        if (abstractActivityC0064v != null) {
            abstractActivityC0064v.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1379C = true;
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void q() {
        this.f1379C = true;
    }

    public void r() {
        this.f1379C = true;
    }

    public LayoutInflater s(Bundle bundle) {
        C0063u c0063u = this.f1410s;
        if (c0063u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0158k abstractActivityC0158k = c0063u.f1425k;
        LayoutInflater cloneInContext = abstractActivityC0158k.getLayoutInflater().cloneInContext(abstractActivityC0158k);
        cloneInContext.setFactory2(this.f1411t.f1228f);
        return cloneInContext;
    }

    public abstract void t(Bundle bundle);

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1398e);
        if (this.f1413v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1413v));
        }
        if (this.f1415x != null) {
            sb.append(" tag=");
            sb.append(this.f1415x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1379C = true;
    }

    public void v() {
        this.f1379C = true;
    }

    public void w(Bundle bundle) {
        this.f1379C = true;
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1411t.K();
        this.f1407p = true;
        this.f1389N = new U(this, getViewModelStore());
        View p2 = p(layoutInflater, viewGroup);
        this.f1381E = p2;
        if (p2 == null) {
            if (this.f1389N.f1286c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1389N = null;
            return;
        }
        this.f1389N.b();
        androidx.lifecycle.J.f(this.f1381E, this.f1389N);
        View view = this.f1381E;
        U u2 = this.f1389N;
        X0.f.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, u2);
        q1.l.j0(this.f1381E, this.f1389N);
        this.f1390O.d(this.f1389N);
    }

    public final Context y() {
        Context d2 = d();
        if (d2 != null) {
            return d2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View z() {
        View view = this.f1381E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}
