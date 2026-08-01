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
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.InterfaceC0067h;
import b0.C0080c;
import com.playbag.tripgear.R;
import g.AbstractActivityC0106i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import m.C0260a;

/* renamed from: Y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0051q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0067h, i0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1082S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1083A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1085C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1086D;

    /* renamed from: E, reason: collision with root package name */
    public View f1087E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0050p f1089H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1090I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1091J;

    /* renamed from: K, reason: collision with root package name */
    public String f1092K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1094M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1095N;

    /* renamed from: P, reason: collision with root package name */
    public i0.e f1097P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1098Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0048n f1099R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1101b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1102c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1104f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f1105g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1107k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1108l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1109m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1110n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1111o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1112p;

    /* renamed from: q, reason: collision with root package name */
    public int f1113q;

    /* renamed from: r, reason: collision with root package name */
    public I f1114r;

    /* renamed from: s, reason: collision with root package name */
    public C0054u f1115s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0051q f1117u;

    /* renamed from: v, reason: collision with root package name */
    public int f1118v;

    /* renamed from: w, reason: collision with root package name */
    public int f1119w;

    /* renamed from: x, reason: collision with root package name */
    public String f1120x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1121y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1122z;

    /* renamed from: a, reason: collision with root package name */
    public int f1100a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1103e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1106j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1116t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1084B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1088G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0072m f1093L = EnumC0072m.f1483e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1096O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0051q() {
        new AtomicInteger();
        this.f1098Q = new ArrayList();
        this.f1099R = new C0048n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1085C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1116t.K();
        this.f1112p = true;
        this.f1095N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1087E = t2;
        if (t2 == null) {
            if (this.f1095N.f1000c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1095N = null;
            return;
        }
        this.f1095N.f();
        androidx.lifecycle.H.f(this.f1087E, this.f1095N);
        View view = this.f1087E;
        Q q2 = this.f1095N;
        d1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        C0260a.r(this.f1087E, this.f1095N);
        this.f1096O.d(this.f1095N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1087E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1089H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1075b = i;
        f().f1076c = i2;
        f().d = i3;
        f().f1077e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1114r;
        if (i != null && (i.f935E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1104f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
    public final C0080c a() {
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
        C0080c c0080c = new C0080c(0);
        LinkedHashMap linkedHashMap = c0080c.f1632a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1457a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1458b, this);
        Bundle bundle = this.f1104f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1459c, bundle);
        }
        return c0080c;
    }

    @Override // i0.f
    public final i0.d b() {
        return this.f1097P.f2535b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1114r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1114r.f941L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1103e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1103e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1094M;
    }

    public w1.l e() {
        return new C0049o(this);
    }

    public final C0050p f() {
        if (this.f1089H == null) {
            C0050p c0050p = new C0050p();
            Object obj = f1082S;
            c0050p.f1079g = obj;
            c0050p.h = obj;
            c0050p.i = obj;
            c0050p.f1080j = 1.0f;
            c0050p.f1081k = null;
            this.f1089H = c0050p;
        }
        return this.f1089H;
    }

    public final I g() {
        if (this.f1115s != null) {
            return this.f1116t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0054u c0054u = this.f1115s;
        if (c0054u == null) {
            return null;
        }
        return c0054u.f1130f;
    }

    public final int i() {
        EnumC0072m enumC0072m = this.f1093L;
        return (enumC0072m == EnumC0072m.f1481b || this.f1117u == null) ? enumC0072m.ordinal() : Math.min(enumC0072m.ordinal(), this.f1117u.i());
    }

    public final I j() {
        I i = this.f1114r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1094M = new androidx.lifecycle.t(this);
        this.f1097P = new i0.e(this);
        ArrayList arrayList = this.f1098Q;
        C0048n c0048n = this.f1099R;
        if (arrayList.contains(c0048n)) {
            return;
        }
        if (this.f1100a < 0) {
            arrayList.add(c0048n);
            return;
        }
        AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = c0048n.f1072a;
        abstractComponentCallbacksC0051q.f1097P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0051q);
    }

    public final void l() {
        k();
        this.f1092K = this.f1103e;
        this.f1103e = UUID.randomUUID().toString();
        this.f1107k = false;
        this.f1108l = false;
        this.f1109m = false;
        this.f1110n = false;
        this.f1111o = false;
        this.f1113q = 0;
        this.f1114r = null;
        this.f1116t = new I();
        this.f1115s = null;
        this.f1118v = 0;
        this.f1119w = 0;
        this.f1120x = null;
        this.f1121y = false;
        this.f1122z = false;
    }

    public final boolean m() {
        return this.f1115s != null && this.f1107k;
    }

    public final boolean n() {
        if (!this.f1121y) {
            I i = this.f1114r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0051q abstractComponentCallbacksC0051q = this.f1117u;
            i.getClass();
            if (!(abstractComponentCallbacksC0051q == null ? false : abstractComponentCallbacksC0051q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1113q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1085C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0054u c0054u = this.f1115s;
        AbstractActivityC0106i abstractActivityC0106i = c0054u == null ? null : c0054u.f1129e;
        if (abstractActivityC0106i != null) {
            abstractActivityC0106i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1085C = true;
    }

    public void p() {
        this.f1085C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0106i abstractActivityC0106i) {
        this.f1085C = true;
        C0054u c0054u = this.f1115s;
        if ((c0054u == null ? null : c0054u.f1129e) != null) {
            this.f1085C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1085C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1116t.Q(parcelable);
            I i = this.f1116t;
            i.f935E = false;
            i.F = false;
            i.f941L.f977g = false;
            i.t(1);
        }
        I i2 = this.f1116t;
        if (i2.f958s >= 1) {
            return;
        }
        i2.f935E = false;
        i2.F = false;
        i2.f941L.f977g = false;
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
        sb.append(this.f1103e);
        if (this.f1118v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1118v));
        }
        if (this.f1120x != null) {
            sb.append(" tag=");
            sb.append(this.f1120x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1085C = true;
    }

    public void v() {
        this.f1085C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0054u c0054u = this.f1115s;
        if (c0054u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0106i abstractActivityC0106i = c0054u.i;
        LayoutInflater cloneInContext = abstractActivityC0106i.getLayoutInflater().cloneInContext(abstractActivityC0106i);
        cloneInContext.setFactory2(this.f1116t.f947f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1085C = true;
    }

    public void z() {
        this.f1085C = true;
    }
}
