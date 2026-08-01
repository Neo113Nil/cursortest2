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
import androidx.lifecycle.EnumC0071m;
import androidx.lifecycle.InterfaceC0066h;
import com.visualfortune.eyerest.R;
import g.AbstractActivityC0131i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0066h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f990S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f991A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f993C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f994D;

    /* renamed from: E, reason: collision with root package name */
    public View f995E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f997H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f998I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f999J;

    /* renamed from: K, reason: collision with root package name */
    public String f1000K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1002M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1003N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f1005P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1006Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f1007R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1009b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1010c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1012f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1013g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1015k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1016l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1017m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1018n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1019o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1020p;

    /* renamed from: q, reason: collision with root package name */
    public int f1021q;

    /* renamed from: r, reason: collision with root package name */
    public I f1022r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f1023s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1025u;

    /* renamed from: v, reason: collision with root package name */
    public int f1026v;

    /* renamed from: w, reason: collision with root package name */
    public int f1027w;

    /* renamed from: x, reason: collision with root package name */
    public String f1028x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1029y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1030z;

    /* renamed from: a, reason: collision with root package name */
    public int f1008a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1011e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1014j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1024t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f992B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f996G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0071m f1001L = EnumC0071m.f1399e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1004O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f1006Q = new ArrayList();
        this.f1007R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f993C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1024t.K();
        this.f1020p = true;
        this.f1003N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f995E = t2;
        if (t2 == null) {
            if (this.f1003N.f911c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1003N = null;
            return;
        }
        this.f1003N.f();
        androidx.lifecycle.H.f(this.f995E, this.f1003N);
        View view = this.f995E;
        Q q2 = this.f1003N;
        Z0.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        s1.d.d0(this.f995E, this.f1003N);
        this.f1004O.d(this.f1003N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f995E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f997H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f983b = i;
        f().f984c = i2;
        f().d = i3;
        f().f985e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1022r;
        if (i != null && (i.f846E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1012f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0066h
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
        LinkedHashMap linkedHashMap = c0058c.f1140a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1373a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1374b, this);
        Bundle bundle = this.f1012f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1375c, bundle);
        }
        return c0058c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1005P.f2459b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1022r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1022r.f852L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1011e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1011e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1002M;
    }

    public s1.l e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f997H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f990S;
            c0047p.f987g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f988j = 1.0f;
            c0047p.f989k = null;
            this.f997H = c0047p;
        }
        return this.f997H;
    }

    public final I g() {
        if (this.f1023s != null) {
            return this.f1024t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f1023s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.i;
    }

    public final int i() {
        EnumC0071m enumC0071m = this.f1001L;
        return (enumC0071m == EnumC0071m.f1397b || this.f1025u == null) ? enumC0071m.ordinal() : Math.min(enumC0071m.ordinal(), this.f1025u.i());
    }

    public final I j() {
        I i = this.f1022r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1002M = new androidx.lifecycle.t(this);
        this.f1005P = new h0.e(this);
        ArrayList arrayList = this.f1006Q;
        C0045n c0045n = this.f1007R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f1008a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f981a;
        abstractComponentCallbacksC0048q.f1005P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f1000K = this.f1011e;
        this.f1011e = UUID.randomUUID().toString();
        this.f1015k = false;
        this.f1016l = false;
        this.f1017m = false;
        this.f1018n = false;
        this.f1019o = false;
        this.f1021q = 0;
        this.f1022r = null;
        this.f1024t = new I();
        this.f1023s = null;
        this.f1026v = 0;
        this.f1027w = 0;
        this.f1028x = null;
        this.f1029y = false;
        this.f1030z = false;
    }

    public final boolean m() {
        return this.f1023s != null && this.f1015k;
    }

    public final boolean n() {
        if (!this.f1029y) {
            I i = this.f1022r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1025u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1021q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f993C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f1023s;
        AbstractActivityC0131i abstractActivityC0131i = c0051u == null ? null : c0051u.h;
        if (abstractActivityC0131i != null) {
            abstractActivityC0131i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f993C = true;
    }

    public void p() {
        this.f993C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0131i abstractActivityC0131i) {
        this.f993C = true;
        C0051u c0051u = this.f1023s;
        if ((c0051u == null ? null : c0051u.h) != null) {
            this.f993C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f993C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1024t.Q(parcelable);
            I i = this.f1024t;
            i.f846E = false;
            i.F = false;
            i.f852L.f888g = false;
            i.t(1);
        }
        I i2 = this.f1024t;
        if (i2.f869s >= 1) {
            return;
        }
        i2.f846E = false;
        i2.F = false;
        i2.f852L.f888g = false;
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
        sb.append(this.f1011e);
        if (this.f1026v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1026v));
        }
        if (this.f1028x != null) {
            sb.append(" tag=");
            sb.append(this.f1028x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f993C = true;
    }

    public void v() {
        this.f993C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f1023s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0131i abstractActivityC0131i = c0051u.f1039l;
        LayoutInflater cloneInContext = abstractActivityC0131i.getLayoutInflater().cloneInContext(abstractActivityC0131i);
        cloneInContext.setFactory2(this.f1024t.f858f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f993C = true;
    }

    public void z() {
        this.f993C = true;
    }
}
