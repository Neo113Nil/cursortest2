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
import androidx.lifecycle.EnumC0070m;
import androidx.lifecycle.InterfaceC0065h;
import com.winfour.neondrop.R;
import g.AbstractActivityC0110i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0227a;

/* renamed from: Z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0047q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0065h, j0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1171S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1172A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1174C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1175D;

    /* renamed from: E, reason: collision with root package name */
    public View f1176E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1177F;
    public C0046p H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1179I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1180J;

    /* renamed from: K, reason: collision with root package name */
    public String f1181K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1183M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1184N;

    /* renamed from: P, reason: collision with root package name */
    public j0.e f1186P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1187Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0044n f1188R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1190b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1191c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1193f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1194g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1196k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1197l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1198m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1199n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1200o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1201p;

    /* renamed from: q, reason: collision with root package name */
    public int f1202q;

    /* renamed from: r, reason: collision with root package name */
    public I f1203r;

    /* renamed from: s, reason: collision with root package name */
    public C0050u f1204s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1206u;

    /* renamed from: v, reason: collision with root package name */
    public int f1207v;

    /* renamed from: w, reason: collision with root package name */
    public int f1208w;

    /* renamed from: x, reason: collision with root package name */
    public String f1209x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1210y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1211z;

    /* renamed from: a, reason: collision with root package name */
    public int f1189a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1192e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1195j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1205t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1173B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1178G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0070m f1182L = EnumC0070m.f1571e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1185O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0047q() {
        new AtomicInteger();
        this.f1187Q = new ArrayList();
        this.f1188R = new C0044n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1174C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1205t.K();
        this.f1201p = true;
        this.f1184N = new Q(this, d());
        View t2 = t(layoutInflater, viewGroup);
        this.f1176E = t2;
        if (t2 == null) {
            if (this.f1184N.f1089c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1184N = null;
            return;
        }
        this.f1184N.e();
        androidx.lifecycle.H.f(this.f1176E, this.f1184N);
        View view = this.f1176E;
        Q q2 = this.f1184N;
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        C0227a.p(this.f1176E, this.f1184N);
        this.f1185O.d(this.f1184N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1176E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        e().f1164b = i;
        e().f1165c = i2;
        e().d = i3;
        e().f1166e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1203r;
        if (i != null && (i.f1024E || i.f1025F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1193f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final c0.c a() {
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
        c0.c cVar = new c0.c(0);
        LinkedHashMap linkedHashMap = cVar.f1719a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1545a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1546b, this);
        Bundle bundle = this.f1193f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1547c, bundle);
        }
        return cVar;
    }

    public z1.l b() {
        return new C0045o(this);
    }

    @Override // j0.f
    public final j0.d c() {
        return this.f1186P.f2686b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O d() {
        if (this.f1203r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1203r.f1030L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1192e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1192e, o3);
        return o3;
    }

    public final C0046p e() {
        if (this.H == null) {
            C0046p c0046p = new C0046p();
            Object obj = f1171S;
            c0046p.f1168g = obj;
            c0046p.h = obj;
            c0046p.i = obj;
            c0046p.f1169j = 1.0f;
            c0046p.f1170k = null;
            this.H = c0046p;
        }
        return this.H;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f1183M;
    }

    public final I g() {
        if (this.f1204s != null) {
            return this.f1205t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0050u c0050u = this.f1204s;
        if (c0050u == null) {
            return null;
        }
        return c0050u.f1219b;
    }

    public final int i() {
        EnumC0070m enumC0070m = this.f1182L;
        return (enumC0070m == EnumC0070m.f1569b || this.f1206u == null) ? enumC0070m.ordinal() : Math.min(enumC0070m.ordinal(), this.f1206u.i());
    }

    public final I j() {
        I i = this.f1203r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1183M = new androidx.lifecycle.t(this);
        this.f1186P = new j0.e(this);
        ArrayList arrayList = this.f1187Q;
        C0044n c0044n = this.f1188R;
        if (arrayList.contains(c0044n)) {
            return;
        }
        if (this.f1189a < 0) {
            arrayList.add(c0044n);
            return;
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = c0044n.f1161a;
        abstractComponentCallbacksC0047q.f1186P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0047q);
    }

    public final void l() {
        k();
        this.f1181K = this.f1192e;
        this.f1192e = UUID.randomUUID().toString();
        this.f1196k = false;
        this.f1197l = false;
        this.f1198m = false;
        this.f1199n = false;
        this.f1200o = false;
        this.f1202q = 0;
        this.f1203r = null;
        this.f1205t = new I();
        this.f1204s = null;
        this.f1207v = 0;
        this.f1208w = 0;
        this.f1209x = null;
        this.f1210y = false;
        this.f1211z = false;
    }

    public final boolean m() {
        return this.f1204s != null && this.f1196k;
    }

    public final boolean n() {
        if (!this.f1210y) {
            I i = this.f1203r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1206u;
            i.getClass();
            if (!(abstractComponentCallbacksC0047q == null ? false : abstractComponentCallbacksC0047q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1202q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1174C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0050u c0050u = this.f1204s;
        AbstractActivityC0110i abstractActivityC0110i = c0050u == null ? null : c0050u.f1218a;
        if (abstractActivityC0110i != null) {
            abstractActivityC0110i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1174C = true;
    }

    public void p() {
        this.f1174C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0110i abstractActivityC0110i) {
        this.f1174C = true;
        C0050u c0050u = this.f1204s;
        if ((c0050u == null ? null : c0050u.f1218a) != null) {
            this.f1174C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1174C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1205t.Q(parcelable);
            I i = this.f1205t;
            i.f1024E = false;
            i.f1025F = false;
            i.f1030L.f1066g = false;
            i.t(1);
        }
        I i2 = this.f1205t;
        if (i2.f1047s >= 1) {
            return;
        }
        i2.f1024E = false;
        i2.f1025F = false;
        i2.f1030L.f1066g = false;
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
        sb.append(this.f1192e);
        if (this.f1207v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1207v));
        }
        if (this.f1209x != null) {
            sb.append(" tag=");
            sb.append(this.f1209x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1174C = true;
    }

    public void v() {
        this.f1174C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0050u c0050u = this.f1204s;
        if (c0050u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0110i abstractActivityC0110i = c0050u.f1221e;
        LayoutInflater cloneInContext = abstractActivityC0110i.getLayoutInflater().cloneInContext(abstractActivityC0110i);
        cloneInContext.setFactory2(this.f1205t.f1036f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1174C = true;
    }

    public void z() {
        this.f1174C = true;
    }
}
