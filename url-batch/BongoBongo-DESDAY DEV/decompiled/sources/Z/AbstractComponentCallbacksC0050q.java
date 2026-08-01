package Z;

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
import androidx.lifecycle.EnumC0079m;
import androidx.lifecycle.InterfaceC0074h;
import c0.C0092c;
import com.winfour.winrandom.R;
import g.AbstractActivityC0106i;
import h.AbstractC0112a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0050q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0074h, j0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1161S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1162A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1164C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1165D;

    /* renamed from: E, reason: collision with root package name */
    public View f1166E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1167F;

    /* renamed from: H, reason: collision with root package name */
    public C0049p f1168H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1169I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1170J;

    /* renamed from: K, reason: collision with root package name */
    public String f1171K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1173M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1174N;

    /* renamed from: P, reason: collision with root package name */
    public j0.e f1176P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1177Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0047n f1178R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1180b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1181c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1183f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1184g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1187k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1188l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1189m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1190n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1191o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1192p;

    /* renamed from: q, reason: collision with root package name */
    public int f1193q;

    /* renamed from: r, reason: collision with root package name */
    public I f1194r;

    /* renamed from: s, reason: collision with root package name */
    public C0053u f1195s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0050q f1197u;

    /* renamed from: v, reason: collision with root package name */
    public int f1198v;

    /* renamed from: w, reason: collision with root package name */
    public int f1199w;

    /* renamed from: x, reason: collision with root package name */
    public String f1200x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1201y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1202z;

    /* renamed from: a, reason: collision with root package name */
    public int f1179a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1182e = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    public String f1185h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1186j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1196t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1163B = true;
    public boolean G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0079m f1172L = EnumC0079m.f1575e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1175O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0050q() {
        new AtomicInteger();
        this.f1177Q = new ArrayList();
        this.f1178R = new C0047n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1164C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1196t.K();
        this.f1192p = true;
        this.f1174N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1166E = t2;
        if (t2 == null) {
            if (this.f1174N.f1075c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1174N = null;
            return;
        }
        this.f1174N.f();
        androidx.lifecycle.H.f(this.f1166E, this.f1174N);
        View view = this.f1166E;
        Q q2 = this.f1174N;
        h1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        AbstractC0112a.q(this.f1166E, this.f1174N);
        this.f1175O.d(this.f1174N);
    }

    public final Context C() {
        Context h2 = h();
        if (h2 != null) {
            return h2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1166E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1168H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1153b = i;
        f().f1154c = i2;
        f().d = i3;
        f().f1155e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1194r;
        if (i != null && (i.f1005E || i.f1006F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1183f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0074h
    public final C0092c a() {
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
        C0092c c0092c = new C0092c(0);
        LinkedHashMap linkedHashMap = c0092c.f1734a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1549a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1550b, this);
        Bundle bundle = this.f1183f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1551c, bundle);
        }
        return c0092c;
    }

    @Override // j0.f
    public final j0.d b() {
        return this.f1176P.f2666b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1194r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1194r.f1011L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1182e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1182e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1173M;
    }

    public A1.d e() {
        return new C0048o(this);
    }

    public final C0049p f() {
        if (this.f1168H == null) {
            C0049p c0049p = new C0049p();
            Object obj = f1161S;
            c0049p.f1157g = obj;
            c0049p.f1158h = obj;
            c0049p.i = obj;
            c0049p.f1159j = 1.0f;
            c0049p.f1160k = null;
            this.f1168H = c0049p;
        }
        return this.f1168H;
    }

    public final I g() {
        if (this.f1195s != null) {
            return this.f1196t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0053u c0053u = this.f1195s;
        if (c0053u == null) {
            return null;
        }
        return c0053u.f1210f;
    }

    public final int i() {
        EnumC0079m enumC0079m = this.f1172L;
        return (enumC0079m == EnumC0079m.f1573b || this.f1197u == null) ? enumC0079m.ordinal() : Math.min(enumC0079m.ordinal(), this.f1197u.i());
    }

    public final I j() {
        I i = this.f1194r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1173M = new androidx.lifecycle.t(this);
        this.f1176P = new j0.e(this);
        ArrayList arrayList = this.f1177Q;
        C0047n c0047n = this.f1178R;
        if (arrayList.contains(c0047n)) {
            return;
        }
        if (this.f1179a < 0) {
            arrayList.add(c0047n);
            return;
        }
        AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = c0047n.f1150a;
        abstractComponentCallbacksC0050q.f1176P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0050q);
    }

    public final void l() {
        k();
        this.f1171K = this.f1182e;
        this.f1182e = UUID.randomUUID().toString();
        this.f1187k = false;
        this.f1188l = false;
        this.f1189m = false;
        this.f1190n = false;
        this.f1191o = false;
        this.f1193q = 0;
        this.f1194r = null;
        this.f1196t = new I();
        this.f1195s = null;
        this.f1198v = 0;
        this.f1199w = 0;
        this.f1200x = null;
        this.f1201y = false;
        this.f1202z = false;
    }

    public final boolean m() {
        return this.f1195s != null && this.f1187k;
    }

    public final boolean n() {
        if (!this.f1201y) {
            I i = this.f1194r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0050q abstractComponentCallbacksC0050q = this.f1197u;
            i.getClass();
            if (!(abstractComponentCallbacksC0050q == null ? false : abstractComponentCallbacksC0050q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1193q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1164C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0053u c0053u = this.f1195s;
        AbstractActivityC0106i abstractActivityC0106i = c0053u == null ? null : c0053u.f1209e;
        if (abstractActivityC0106i != null) {
            abstractActivityC0106i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1164C = true;
    }

    public void p() {
        this.f1164C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0106i abstractActivityC0106i) {
        this.f1164C = true;
        C0053u c0053u = this.f1195s;
        if ((c0053u == null ? null : c0053u.f1209e) != null) {
            this.f1164C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1164C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1196t.Q(parcelable);
            I i = this.f1196t;
            i.f1005E = false;
            i.f1006F = false;
            i.f1011L.f1050g = false;
            i.t(1);
        }
        I i2 = this.f1196t;
        if (i2.f1029s >= 1) {
            return;
        }
        i2.f1005E = false;
        i2.f1006F = false;
        i2.f1011L.f1050g = false;
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
        sb.append(this.f1182e);
        if (this.f1198v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1198v));
        }
        if (this.f1200x != null) {
            sb.append(" tag=");
            sb.append(this.f1200x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1164C = true;
    }

    public void v() {
        this.f1164C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0053u c0053u = this.f1195s;
        if (c0053u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0106i abstractActivityC0106i = c0053u.i;
        LayoutInflater cloneInContext = abstractActivityC0106i.getLayoutInflater().cloneInContext(abstractActivityC0106i);
        cloneInContext.setFactory2(this.f1196t.f1017f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1164C = true;
    }

    public void z() {
        this.f1164C = true;
    }
}
