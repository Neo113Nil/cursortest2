package X;

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
import androidx.lifecycle.EnumC0069m;
import androidx.lifecycle.InterfaceC0064h;
import com.pairspot.fortunetiles.R;
import g.AbstractActivityC0125i;
import h0.C0132d;
import h0.C0133e;
import h0.InterfaceC0134f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0064h, InterfaceC0134f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f944S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f945A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f947C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f948D;

    /* renamed from: E, reason: collision with root package name */
    public View f949E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f951H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f952I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f953J;

    /* renamed from: K, reason: collision with root package name */
    public String f954K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f956M;

    /* renamed from: N, reason: collision with root package name */
    public Q f957N;

    /* renamed from: P, reason: collision with root package name */
    public C0133e f959P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f960Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f961R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f963b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f964c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f966f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f967g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f969k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f970l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f971m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f972n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f973o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f974p;

    /* renamed from: q, reason: collision with root package name */
    public int f975q;

    /* renamed from: r, reason: collision with root package name */
    public I f976r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f977s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f979u;

    /* renamed from: v, reason: collision with root package name */
    public int f980v;

    /* renamed from: w, reason: collision with root package name */
    public int f981w;

    /* renamed from: x, reason: collision with root package name */
    public String f982x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f983y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f984z;

    /* renamed from: a, reason: collision with root package name */
    public int f962a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f965e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f968j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f978t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f946B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f950G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0069m f955L = EnumC0069m.f1360e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f958O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f960Q = new ArrayList();
        this.f961R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f947C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f978t.K();
        this.f974p = true;
        this.f957N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f949E = t2;
        if (t2 == null) {
            if (this.f957N.f862c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f957N = null;
            return;
        }
        this.f957N.f();
        androidx.lifecycle.H.f(this.f949E, this.f957N);
        View view = this.f949E;
        Q q2 = this.f957N;
        X0.e.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.d.j0(this.f949E, this.f957N);
        this.f958O.d(this.f957N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f949E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f951H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f937b = i;
        f().f938c = i2;
        f().d = i3;
        f().f939e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f976r;
        if (i != null && (i.f797E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f966f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0064h
    public final a0.c a() {
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
        a0.c cVar = new a0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1101a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1334a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1335b, this);
        Bundle bundle = this.f966f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1336c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.f959P.f2373b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f976r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f976r.f803L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f965e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f965e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f956M;
    }

    public q1.d e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f951H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f944S;
            c0047p.f941g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f942j = 1.0f;
            c0047p.f943k = null;
            this.f951H = c0047p;
        }
        return this.f951H;
    }

    public final I g() {
        if (this.f977s != null) {
            return this.f978t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f977s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f992f;
    }

    public final int i() {
        EnumC0069m enumC0069m = this.f955L;
        return (enumC0069m == EnumC0069m.f1358b || this.f979u == null) ? enumC0069m.ordinal() : Math.min(enumC0069m.ordinal(), this.f979u.i());
    }

    public final I j() {
        I i = this.f976r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f956M = new androidx.lifecycle.t(this);
        this.f959P = new C0133e(this);
        ArrayList arrayList = this.f960Q;
        C0045n c0045n = this.f961R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f962a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f934a;
        abstractComponentCallbacksC0048q.f959P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f954K = this.f965e;
        this.f965e = UUID.randomUUID().toString();
        this.f969k = false;
        this.f970l = false;
        this.f971m = false;
        this.f972n = false;
        this.f973o = false;
        this.f975q = 0;
        this.f976r = null;
        this.f978t = new I();
        this.f977s = null;
        this.f980v = 0;
        this.f981w = 0;
        this.f982x = null;
        this.f983y = false;
        this.f984z = false;
    }

    public final boolean m() {
        return this.f977s != null && this.f969k;
    }

    public final boolean n() {
        if (!this.f983y) {
            I i = this.f976r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f979u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f975q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f947C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f977s;
        AbstractActivityC0125i abstractActivityC0125i = c0051u == null ? null : c0051u.f991e;
        if (abstractActivityC0125i != null) {
            abstractActivityC0125i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f947C = true;
    }

    public void p() {
        this.f947C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0125i abstractActivityC0125i) {
        this.f947C = true;
        C0051u c0051u = this.f977s;
        if ((c0051u == null ? null : c0051u.f991e) != null) {
            this.f947C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f947C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f978t.Q(parcelable);
            I i = this.f978t;
            i.f797E = false;
            i.F = false;
            i.f803L.f839g = false;
            i.t(1);
        }
        I i2 = this.f978t;
        if (i2.f820s >= 1) {
            return;
        }
        i2.f797E = false;
        i2.F = false;
        i2.f803L.f839g = false;
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
        sb.append(this.f965e);
        if (this.f980v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f980v));
        }
        if (this.f982x != null) {
            sb.append(" tag=");
            sb.append(this.f982x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f947C = true;
    }

    public void v() {
        this.f947C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f977s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0125i abstractActivityC0125i = c0051u.i;
        LayoutInflater cloneInContext = abstractActivityC0125i.getLayoutInflater().cloneInContext(abstractActivityC0125i);
        cloneInContext.setFactory2(this.f978t.f809f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f947C = true;
    }

    public void z() {
        this.f947C = true;
    }
}
