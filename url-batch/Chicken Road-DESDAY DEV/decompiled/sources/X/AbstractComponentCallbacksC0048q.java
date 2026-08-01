package X;

import a0.C0058c;
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
import androidx.lifecycle.EnumC0073m;
import androidx.lifecycle.InterfaceC0068h;
import com.playgen.securelock.R;
import g.AbstractActivityC0133i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0068h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1022S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1023A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1025C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1026D;

    /* renamed from: E, reason: collision with root package name */
    public View f1027E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f1029H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1030I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1031J;

    /* renamed from: K, reason: collision with root package name */
    public String f1032K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1034M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1035N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f1037P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1038Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f1039R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1041b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1042c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1044f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1045g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1047k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1048l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1049m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1050n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1051o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1052p;

    /* renamed from: q, reason: collision with root package name */
    public int f1053q;

    /* renamed from: r, reason: collision with root package name */
    public I f1054r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f1055s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1057u;

    /* renamed from: v, reason: collision with root package name */
    public int f1058v;

    /* renamed from: w, reason: collision with root package name */
    public int f1059w;

    /* renamed from: x, reason: collision with root package name */
    public String f1060x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1061y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1062z;

    /* renamed from: a, reason: collision with root package name */
    public int f1040a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1043e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1046j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1056t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1024B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1028G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0073m f1033L = EnumC0073m.f1424e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1036O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f1038Q = new ArrayList();
        this.f1039R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1025C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1056t.K();
        this.f1052p = true;
        this.f1035N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1027E = t2;
        if (t2 == null) {
            if (this.f1035N.f940c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1035N = null;
            return;
        }
        this.f1035N.f();
        androidx.lifecycle.H.f(this.f1027E, this.f1035N);
        View view = this.f1027E;
        Q q2 = this.f1035N;
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        u1.l.X(this.f1027E, this.f1035N);
        this.f1036O.d(this.f1035N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1027E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1029H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1015b = i;
        f().f1016c = i2;
        f().d = i3;
        f().f1017e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1054r;
        if (i != null && (i.f875E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1044f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0058c a() {
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
        C0058c c0058c = new C0058c(0);
        LinkedHashMap linkedHashMap = c0058c.f1165a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1398a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1399b, this);
        Bundle bundle = this.f1044f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1400c, bundle);
        }
        return c0058c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1037P.f2447b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1054r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1054r.f881L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1043e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1043e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1034M;
    }

    public u1.l e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f1029H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f1022S;
            c0047p.f1019g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f1020j = 1.0f;
            c0047p.f1021k = null;
            this.f1029H = c0047p;
        }
        return this.f1029H;
    }

    public final I g() {
        if (this.f1055s != null) {
            return this.f1056t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f1055s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f1070f;
    }

    public final int i() {
        EnumC0073m enumC0073m = this.f1033L;
        return (enumC0073m == EnumC0073m.f1422b || this.f1057u == null) ? enumC0073m.ordinal() : Math.min(enumC0073m.ordinal(), this.f1057u.i());
    }

    public final I j() {
        I i = this.f1054r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1034M = new androidx.lifecycle.t(this);
        this.f1037P = new h0.e(this);
        ArrayList arrayList = this.f1038Q;
        C0045n c0045n = this.f1039R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f1040a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f1012a;
        abstractComponentCallbacksC0048q.f1037P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f1032K = this.f1043e;
        this.f1043e = UUID.randomUUID().toString();
        this.f1047k = false;
        this.f1048l = false;
        this.f1049m = false;
        this.f1050n = false;
        this.f1051o = false;
        this.f1053q = 0;
        this.f1054r = null;
        this.f1056t = new I();
        this.f1055s = null;
        this.f1058v = 0;
        this.f1059w = 0;
        this.f1060x = null;
        this.f1061y = false;
        this.f1062z = false;
    }

    public final boolean m() {
        return this.f1055s != null && this.f1047k;
    }

    public final boolean n() {
        if (!this.f1061y) {
            I i = this.f1054r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1057u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1053q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1025C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f1055s;
        AbstractActivityC0133i abstractActivityC0133i = c0051u == null ? null : c0051u.f1069e;
        if (abstractActivityC0133i != null) {
            abstractActivityC0133i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1025C = true;
    }

    public void p() {
        this.f1025C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0133i abstractActivityC0133i) {
        this.f1025C = true;
        C0051u c0051u = this.f1055s;
        if ((c0051u == null ? null : c0051u.f1069e) != null) {
            this.f1025C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1025C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1056t.Q(parcelable);
            I i = this.f1056t;
            i.f875E = false;
            i.F = false;
            i.f881L.f917g = false;
            i.t(1);
        }
        I i2 = this.f1056t;
        if (i2.f898s >= 1) {
            return;
        }
        i2.f875E = false;
        i2.F = false;
        i2.f881L.f917g = false;
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
        sb.append(this.f1043e);
        if (this.f1058v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1058v));
        }
        if (this.f1060x != null) {
            sb.append(" tag=");
            sb.append(this.f1060x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1025C = true;
    }

    public void v() {
        this.f1025C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f1055s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0133i abstractActivityC0133i = c0051u.i;
        LayoutInflater cloneInContext = abstractActivityC0133i.getLayoutInflater().cloneInContext(abstractActivityC0133i);
        cloneInContext.setFactory2(this.f1056t.f887f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1025C = true;
    }

    public void z() {
        this.f1025C = true;
    }
}
