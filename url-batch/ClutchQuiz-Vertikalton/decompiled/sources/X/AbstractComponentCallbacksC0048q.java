package X;

import a0.C0059c;
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
import com.clutchquizarena.app.R;
import g.AbstractActivityC0136i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.S, InterfaceC0067h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1088S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1089A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1091C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1092D;

    /* renamed from: E, reason: collision with root package name */
    public View f1093E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f1095H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1096I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1097J;

    /* renamed from: K, reason: collision with root package name */
    public String f1098K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.v f1100M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1101N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f1103P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1104Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f1105R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1107b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1108c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1110f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1111g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1113k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1115m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1116n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1117o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1118p;

    /* renamed from: q, reason: collision with root package name */
    public int f1119q;

    /* renamed from: r, reason: collision with root package name */
    public I f1120r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f1121s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1123u;

    /* renamed from: v, reason: collision with root package name */
    public int f1124v;

    /* renamed from: w, reason: collision with root package name */
    public int f1125w;

    /* renamed from: x, reason: collision with root package name */
    public String f1126x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1127y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1128z;

    /* renamed from: a, reason: collision with root package name */
    public int f1106a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1109e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1112j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1122t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1090B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1094G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0072m f1099L = EnumC0072m.f1506e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.y f1102O = new androidx.lifecycle.y();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f1104Q = new ArrayList();
        this.f1105R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1091C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1122t.K();
        this.f1118p = true;
        this.f1101N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1093E = t2;
        if (t2 == null) {
            if (this.f1101N.f1006c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1101N = null;
            return;
        }
        this.f1101N.f();
        androidx.lifecycle.J.g(this.f1093E, this.f1101N);
        View view = this.f1093E;
        Q q2 = this.f1101N;
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        h0.g.k(this.f1093E, this.f1101N);
        this.f1102O.d(this.f1101N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1093E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1095H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1081b = i;
        f().f1082c = i2;
        f().d = i3;
        f().f1083e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1120r;
        if (i != null && (i.f941E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1110f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0059c a() {
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
        C0059c c0059c = new C0059c(0);
        LinkedHashMap linkedHashMap = c0059c.f1243a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.J.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f1480a, this);
        linkedHashMap.put(androidx.lifecycle.J.f1481b, this);
        Bundle bundle = this.f1110f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.J.f1482c, bundle);
        }
        return c0059c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1103P.f2580b;
    }

    @Override // androidx.lifecycle.S
    public final androidx.lifecycle.Q c() {
        if (this.f1120r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1120r.f947L.d;
        androidx.lifecycle.Q q2 = (androidx.lifecycle.Q) hashMap.get(this.f1109e);
        if (q2 != null) {
            return q2;
        }
        androidx.lifecycle.Q q3 = new androidx.lifecycle.Q();
        hashMap.put(this.f1109e, q3);
        return q3;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v d() {
        return this.f1100M;
    }

    public T.d e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f1095H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f1088S;
            c0047p.f1085g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f1086j = 1.0f;
            c0047p.f1087k = null;
            this.f1095H = c0047p;
        }
        return this.f1095H;
    }

    public final I g() {
        if (this.f1121s != null) {
            return this.f1122t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f1121s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f1136b;
    }

    public final int i() {
        EnumC0072m enumC0072m = this.f1099L;
        return (enumC0072m == EnumC0072m.f1504b || this.f1123u == null) ? enumC0072m.ordinal() : Math.min(enumC0072m.ordinal(), this.f1123u.i());
    }

    public final I j() {
        I i = this.f1120r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1100M = new androidx.lifecycle.v(this);
        this.f1103P = new h0.e(this);
        ArrayList arrayList = this.f1104Q;
        C0045n c0045n = this.f1105R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f1106a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f1078a;
        abstractComponentCallbacksC0048q.f1103P.a();
        androidx.lifecycle.J.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f1098K = this.f1109e;
        this.f1109e = UUID.randomUUID().toString();
        this.f1113k = false;
        this.f1114l = false;
        this.f1115m = false;
        this.f1116n = false;
        this.f1117o = false;
        this.f1119q = 0;
        this.f1120r = null;
        this.f1122t = new I();
        this.f1121s = null;
        this.f1124v = 0;
        this.f1125w = 0;
        this.f1126x = null;
        this.f1127y = false;
        this.f1128z = false;
    }

    public final boolean m() {
        return this.f1121s != null && this.f1113k;
    }

    public final boolean n() {
        if (!this.f1127y) {
            I i = this.f1120r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1123u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1119q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1091C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f1121s;
        AbstractActivityC0136i abstractActivityC0136i = c0051u == null ? null : c0051u.f1135a;
        if (abstractActivityC0136i != null) {
            abstractActivityC0136i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1091C = true;
    }

    public void p() {
        this.f1091C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0136i abstractActivityC0136i) {
        this.f1091C = true;
        C0051u c0051u = this.f1121s;
        if ((c0051u == null ? null : c0051u.f1135a) != null) {
            this.f1091C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1091C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1122t.Q(parcelable);
            I i = this.f1122t;
            i.f941E = false;
            i.F = false;
            i.f947L.f983g = false;
            i.t(1);
        }
        I i2 = this.f1122t;
        if (i2.f964s >= 1) {
            return;
        }
        i2.f941E = false;
        i2.F = false;
        i2.f947L.f983g = false;
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
        sb.append(this.f1109e);
        if (this.f1124v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1124v));
        }
        if (this.f1126x != null) {
            sb.append(" tag=");
            sb.append(this.f1126x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1091C = true;
    }

    public void v() {
        this.f1091C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f1121s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0136i abstractActivityC0136i = c0051u.f1138e;
        LayoutInflater cloneInContext = abstractActivityC0136i.getLayoutInflater().cloneInContext(abstractActivityC0136i);
        cloneInContext.setFactory2(this.f1122t.f953f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1091C = true;
    }

    public void z() {
        this.f1091C = true;
    }
}
