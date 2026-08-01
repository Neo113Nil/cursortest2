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
import com.shotwins.games.R;
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
    public static final Object f950S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f951A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f953C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f954D;

    /* renamed from: E, reason: collision with root package name */
    public View f955E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f957H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f958I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f959J;

    /* renamed from: K, reason: collision with root package name */
    public String f960K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f962M;

    /* renamed from: N, reason: collision with root package name */
    public Q f963N;

    /* renamed from: P, reason: collision with root package name */
    public C0133e f965P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f966Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f967R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f969b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f970c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f972f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f973g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f975k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f976l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f977m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f978n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f979o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f980p;

    /* renamed from: q, reason: collision with root package name */
    public int f981q;

    /* renamed from: r, reason: collision with root package name */
    public I f982r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f983s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f985u;

    /* renamed from: v, reason: collision with root package name */
    public int f986v;

    /* renamed from: w, reason: collision with root package name */
    public int f987w;

    /* renamed from: x, reason: collision with root package name */
    public String f988x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f989y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f990z;

    /* renamed from: a, reason: collision with root package name */
    public int f968a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f971e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f974j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f984t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f952B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f956G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0069m f961L = EnumC0069m.f1363e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f964O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f966Q = new ArrayList();
        this.f967R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f953C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f984t.K();
        this.f980p = true;
        this.f963N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f955E = t2;
        if (t2 == null) {
            if (this.f963N.f868c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f963N = null;
            return;
        }
        this.f963N.f();
        androidx.lifecycle.H.f(this.f955E, this.f963N);
        View view = this.f955E;
        Q q2 = this.f963N;
        X0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        q1.d.k0(this.f955E, this.f963N);
        this.f964O.d(this.f963N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f955E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f957H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f943b = i;
        f().f944c = i2;
        f().d = i3;
        f().f945e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f982r;
        if (i != null && (i.f803E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f972f = bundle;
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
        LinkedHashMap linkedHashMap = cVar.f1104a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1337a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1338b, this);
        Bundle bundle = this.f972f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1339c, bundle);
        }
        return cVar;
    }

    @Override // h0.InterfaceC0134f
    public final C0132d b() {
        return this.f965P.f2376b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f982r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f982r.f809L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f971e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f971e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f962M;
    }

    public q1.d e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f957H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f950S;
            c0047p.f947g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f948j = 1.0f;
            c0047p.f949k = null;
            this.f957H = c0047p;
        }
        return this.f957H;
    }

    public final I g() {
        if (this.f983s != null) {
            return this.f984t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f983s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f998f;
    }

    public final int i() {
        EnumC0069m enumC0069m = this.f961L;
        return (enumC0069m == EnumC0069m.f1361b || this.f985u == null) ? enumC0069m.ordinal() : Math.min(enumC0069m.ordinal(), this.f985u.i());
    }

    public final I j() {
        I i = this.f982r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f962M = new androidx.lifecycle.t(this);
        this.f965P = new C0133e(this);
        ArrayList arrayList = this.f966Q;
        C0045n c0045n = this.f967R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f968a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f940a;
        abstractComponentCallbacksC0048q.f965P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f960K = this.f971e;
        this.f971e = UUID.randomUUID().toString();
        this.f975k = false;
        this.f976l = false;
        this.f977m = false;
        this.f978n = false;
        this.f979o = false;
        this.f981q = 0;
        this.f982r = null;
        this.f984t = new I();
        this.f983s = null;
        this.f986v = 0;
        this.f987w = 0;
        this.f988x = null;
        this.f989y = false;
        this.f990z = false;
    }

    public final boolean m() {
        return this.f983s != null && this.f975k;
    }

    public final boolean n() {
        if (!this.f989y) {
            I i = this.f982r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f985u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f981q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f953C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f983s;
        AbstractActivityC0125i abstractActivityC0125i = c0051u == null ? null : c0051u.f997e;
        if (abstractActivityC0125i != null) {
            abstractActivityC0125i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f953C = true;
    }

    public void p() {
        this.f953C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0125i abstractActivityC0125i) {
        this.f953C = true;
        C0051u c0051u = this.f983s;
        if ((c0051u == null ? null : c0051u.f997e) != null) {
            this.f953C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f953C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f984t.Q(parcelable);
            I i = this.f984t;
            i.f803E = false;
            i.F = false;
            i.f809L.f845g = false;
            i.t(1);
        }
        I i2 = this.f984t;
        if (i2.f826s >= 1) {
            return;
        }
        i2.f803E = false;
        i2.F = false;
        i2.f809L.f845g = false;
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
        sb.append(this.f971e);
        if (this.f986v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f986v));
        }
        if (this.f988x != null) {
            sb.append(" tag=");
            sb.append(this.f988x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f953C = true;
    }

    public void v() {
        this.f953C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f983s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0125i abstractActivityC0125i = c0051u.i;
        LayoutInflater cloneInContext = abstractActivityC0125i.getLayoutInflater().cloneInContext(abstractActivityC0125i);
        cloneInContext.setFactory2(this.f984t.f815f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f953C = true;
    }

    public void z() {
        this.f953C = true;
    }
}
