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
import com.luckyreads.bookshelf.R;
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
    public static final Object f945S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f946A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f948C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f949D;

    /* renamed from: E, reason: collision with root package name */
    public View f950E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f952H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f953I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f954J;

    /* renamed from: K, reason: collision with root package name */
    public String f955K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f957M;

    /* renamed from: N, reason: collision with root package name */
    public Q f958N;

    /* renamed from: P, reason: collision with root package name */
    public C0133e f960P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f961Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f962R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f964b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f965c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f967f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f968g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f970k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f971l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f972m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f973n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f974o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f975p;

    /* renamed from: q, reason: collision with root package name */
    public int f976q;

    /* renamed from: r, reason: collision with root package name */
    public I f977r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f978s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f980u;

    /* renamed from: v, reason: collision with root package name */
    public int f981v;

    /* renamed from: w, reason: collision with root package name */
    public int f982w;

    /* renamed from: x, reason: collision with root package name */
    public String f983x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f984y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f985z;

    /* renamed from: a, reason: collision with root package name */
    public int f963a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f966e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f969j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f979t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f947B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f951G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0069m f956L = EnumC0069m.f1361e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f959O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f961Q = new ArrayList();
        this.f962R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f948C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f979t.K();
        this.f975p = true;
        this.f958N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f950E = t2;
        if (t2 == null) {
            if (this.f958N.f863c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f958N = null;
            return;
        }
        this.f958N.f();
        androidx.lifecycle.H.f(this.f950E, this.f958N);
        View view = this.f950E;
        Q q2 = this.f958N;
        X0.e.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.d.j0(this.f950E, this.f958N);
        this.f959O.d(this.f958N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f950E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f952H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f938b = i;
        f().f939c = i2;
        f().d = i3;
        f().f940e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f977r;
        if (i != null && (i.f798E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f967f = bundle;
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
        LinkedHashMap linkedHashMap = cVar.f1102a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1335a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1336b, this);
        Bundle bundle = this.f967f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1337c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.f960P.f2374b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f977r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f977r.f804L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f966e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f966e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f957M;
    }

    public q1.d e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f952H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f945S;
            c0047p.f942g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f943j = 1.0f;
            c0047p.f944k = null;
            this.f952H = c0047p;
        }
        return this.f952H;
    }

    public final I g() {
        if (this.f978s != null) {
            return this.f979t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f978s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f993f;
    }

    public final int i() {
        EnumC0069m enumC0069m = this.f956L;
        return (enumC0069m == EnumC0069m.f1359b || this.f980u == null) ? enumC0069m.ordinal() : Math.min(enumC0069m.ordinal(), this.f980u.i());
    }

    public final I j() {
        I i = this.f977r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f957M = new androidx.lifecycle.t(this);
        this.f960P = new C0133e(this);
        ArrayList arrayList = this.f961Q;
        C0045n c0045n = this.f962R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f963a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f935a;
        abstractComponentCallbacksC0048q.f960P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f955K = this.f966e;
        this.f966e = UUID.randomUUID().toString();
        this.f970k = false;
        this.f971l = false;
        this.f972m = false;
        this.f973n = false;
        this.f974o = false;
        this.f976q = 0;
        this.f977r = null;
        this.f979t = new I();
        this.f978s = null;
        this.f981v = 0;
        this.f982w = 0;
        this.f983x = null;
        this.f984y = false;
        this.f985z = false;
    }

    public final boolean m() {
        return this.f978s != null && this.f970k;
    }

    public final boolean n() {
        if (!this.f984y) {
            I i = this.f977r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f980u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f976q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f948C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f978s;
        AbstractActivityC0125i abstractActivityC0125i = c0051u == null ? null : c0051u.f992e;
        if (abstractActivityC0125i != null) {
            abstractActivityC0125i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f948C = true;
    }

    public void p() {
        this.f948C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0125i abstractActivityC0125i) {
        this.f948C = true;
        C0051u c0051u = this.f978s;
        if ((c0051u == null ? null : c0051u.f992e) != null) {
            this.f948C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f948C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f979t.Q(parcelable);
            I i = this.f979t;
            i.f798E = false;
            i.F = false;
            i.f804L.f840g = false;
            i.t(1);
        }
        I i2 = this.f979t;
        if (i2.f821s >= 1) {
            return;
        }
        i2.f798E = false;
        i2.F = false;
        i2.f804L.f840g = false;
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
        sb.append(this.f966e);
        if (this.f981v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f981v));
        }
        if (this.f983x != null) {
            sb.append(" tag=");
            sb.append(this.f983x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f948C = true;
    }

    public void v() {
        this.f948C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f978s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0125i abstractActivityC0125i = c0051u.i;
        LayoutInflater cloneInContext = abstractActivityC0125i.getLayoutInflater().cloneInContext(abstractActivityC0125i);
        cloneInContext.setFactory2(this.f979t.f810f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f948C = true;
    }

    public void z() {
        this.f948C = true;
    }
}
