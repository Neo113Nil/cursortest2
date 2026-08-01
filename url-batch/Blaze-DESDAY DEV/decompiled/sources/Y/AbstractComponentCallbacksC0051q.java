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
import androidx.lifecycle.EnumC0073m;
import androidx.lifecycle.InterfaceC0068h;
import b0.C0081c;
import com.winworm.neongrid.R;
import g.AbstractActivityC0108i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0051q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0068h, i0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1109S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1110A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1112C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1113D;

    /* renamed from: E, reason: collision with root package name */
    public View f1114E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0050p f1116H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1117I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1118J;

    /* renamed from: K, reason: collision with root package name */
    public String f1119K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1121M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1122N;

    /* renamed from: P, reason: collision with root package name */
    public i0.e f1124P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1125Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0048n f1126R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1128b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1129c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1131f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f1132g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1134k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1135l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1136m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1137n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1138o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1139p;

    /* renamed from: q, reason: collision with root package name */
    public int f1140q;

    /* renamed from: r, reason: collision with root package name */
    public I f1141r;

    /* renamed from: s, reason: collision with root package name */
    public C0054u f1142s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f1144u;

    /* renamed from: v, reason: collision with root package name */
    public int f1145v;

    /* renamed from: w, reason: collision with root package name */
    public int f1146w;

    /* renamed from: x, reason: collision with root package name */
    public String f1147x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1148y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1149z;

    /* renamed from: a, reason: collision with root package name */
    public int f1127a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1130e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1133j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1143t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1111B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1115G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0073m f1120L = EnumC0073m.f1514e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1123O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0051q() {
        new AtomicInteger();
        this.f1125Q = new ArrayList();
        this.f1126R = new C0048n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1112C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1143t.K();
        this.f1139p = true;
        this.f1122N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1114E = t2;
        if (t2 == null) {
            if (this.f1122N.f1027c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1122N = null;
            return;
        }
        this.f1122N.f();
        androidx.lifecycle.H.f(this.f1114E, this.f1122N);
        View view = this.f1114E;
        Q q2 = this.f1122N;
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        i0.g.p(this.f1114E, this.f1122N);
        this.f1123O.d(this.f1122N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1114E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1116H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1102b = i;
        f().f1103c = i2;
        f().d = i3;
        f().f1104e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1141r;
        if (i != null && (i.f962E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1131f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0068h
    public final C0081c a() {
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
        C0081c c0081c = new C0081c(0);
        LinkedHashMap linkedHashMap = c0081c.f1661a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1488a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1489b, this);
        Bundle bundle = this.f1131f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1490c, bundle);
        }
        return c0081c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1124P.f2566b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1141r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1141r.f968L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1130e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1130e, o3);
        return o3;
    }

    public z1.d d() {
        return new C0049o(this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.f1121M;
    }

    public final C0050p f() {
        if (this.f1116H == null) {
            C0050p c0050p = new C0050p();
            Object obj = f1109S;
            c0050p.f1106g = obj;
            c0050p.h = obj;
            c0050p.i = obj;
            c0050p.f1107j = 1.0f;
            c0050p.f1108k = null;
            this.f1116H = c0050p;
        }
        return this.f1116H;
    }

    public final I g() {
        if (this.f1142s != null) {
            return this.f1143t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0054u c0054u = this.f1142s;
        if (c0054u == null) {
            return null;
        }
        return c0054u.f1157b;
    }

    public final int i() {
        EnumC0073m enumC0073m = this.f1120L;
        return (enumC0073m == EnumC0073m.f1512b || this.f1144u == null) ? enumC0073m.ordinal() : Math.min(enumC0073m.ordinal(), this.f1144u.i());
    }

    public final I j() {
        I i = this.f1141r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1121M = new androidx.lifecycle.t(this);
        this.f1124P = new i0.e(this);
        ArrayList arrayList = this.f1125Q;
        C0048n c0048n = this.f1126R;
        if (arrayList.contains(c0048n)) {
            return;
        }
        if (this.f1127a < 0) {
            arrayList.add(c0048n);
            return;
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = c0048n.f1099a;
        abstractComponentCallbacksC0051q.f1124P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0051q);
    }

    public final void l() {
        k();
        this.f1119K = this.f1130e;
        this.f1130e = UUID.randomUUID().toString();
        this.f1134k = false;
        this.f1135l = false;
        this.f1136m = false;
        this.f1137n = false;
        this.f1138o = false;
        this.f1140q = 0;
        this.f1141r = null;
        this.f1143t = new I();
        this.f1142s = null;
        this.f1145v = 0;
        this.f1146w = 0;
        this.f1147x = null;
        this.f1148y = false;
        this.f1149z = false;
    }

    public final boolean m() {
        return this.f1142s != null && this.f1134k;
    }

    public final boolean n() {
        if (!this.f1148y) {
            I i = this.f1141r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1144u;
            i.getClass();
            if (!(abstractComponentCallbacksC0051q == null ? false : abstractComponentCallbacksC0051q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1140q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1112C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0054u c0054u = this.f1142s;
        AbstractActivityC0108i abstractActivityC0108i = c0054u == null ? null : c0054u.f1156a;
        if (abstractActivityC0108i != null) {
            abstractActivityC0108i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1112C = true;
    }

    public void p() {
        this.f1112C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0108i abstractActivityC0108i) {
        this.f1112C = true;
        C0054u c0054u = this.f1142s;
        if ((c0054u == null ? null : c0054u.f1156a) != null) {
            this.f1112C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1112C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1143t.Q(parcelable);
            I i = this.f1143t;
            i.f962E = false;
            i.F = false;
            i.f968L.f1004g = false;
            i.t(1);
        }
        I i2 = this.f1143t;
        if (i2.f985s >= 1) {
            return;
        }
        i2.f962E = false;
        i2.F = false;
        i2.f968L.f1004g = false;
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
        sb.append(this.f1130e);
        if (this.f1145v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1145v));
        }
        if (this.f1147x != null) {
            sb.append(" tag=");
            sb.append(this.f1147x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1112C = true;
    }

    public void v() {
        this.f1112C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0054u c0054u = this.f1142s;
        if (c0054u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0108i abstractActivityC0108i = c0054u.f1159e;
        LayoutInflater cloneInContext = abstractActivityC0108i.getLayoutInflater().cloneInContext(abstractActivityC0108i);
        cloneInContext.setFactory2(this.f1143t.f974f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1112C = true;
    }

    public void z() {
        this.f1112C = true;
    }
}
