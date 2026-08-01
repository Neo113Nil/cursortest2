package X;

import a0.C0057c;
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
import com.neonpulse.gridlogic.R;
import g.AbstractActivityC0132i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0048q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0065h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1062S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1063A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1065C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1066D;

    /* renamed from: E, reason: collision with root package name */
    public View f1067E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0047p f1069H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1070I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1071J;

    /* renamed from: K, reason: collision with root package name */
    public String f1072K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1074M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1075N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f1077P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1078Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0045n f1079R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1081b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1082c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1084f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1085g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1087k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1088l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1089m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1090n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1091o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1092p;

    /* renamed from: q, reason: collision with root package name */
    public int f1093q;

    /* renamed from: r, reason: collision with root package name */
    public I f1094r;

    /* renamed from: s, reason: collision with root package name */
    public C0051u f1095s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0048q f1097u;

    /* renamed from: v, reason: collision with root package name */
    public int f1098v;

    /* renamed from: w, reason: collision with root package name */
    public int f1099w;

    /* renamed from: x, reason: collision with root package name */
    public String f1100x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1101y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1102z;

    /* renamed from: a, reason: collision with root package name */
    public int f1080a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1083e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1086j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1096t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1064B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1068G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0070m f1073L = EnumC0070m.f1469e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1076O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0048q() {
        new AtomicInteger();
        this.f1078Q = new ArrayList();
        this.f1079R = new C0045n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1065C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1096t.K();
        this.f1092p = true;
        this.f1075N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1067E = t2;
        if (t2 == null) {
            if (this.f1075N.f980c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1075N = null;
            return;
        }
        this.f1075N.f();
        androidx.lifecycle.H.f(this.f1067E, this.f1075N);
        View view = this.f1067E;
        Q q2 = this.f1075N;
        e1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        x1.d.d0(this.f1067E, this.f1075N);
        this.f1076O.d(this.f1075N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1067E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1069H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1055b = i;
        f().f1056c = i2;
        f().d = i3;
        f().f1057e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1094r;
        if (i != null && (i.f915E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1084f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0065h
    public final C0057c a() {
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
        C0057c c0057c = new C0057c(0);
        LinkedHashMap linkedHashMap = c0057c.f1209a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1443a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1444b, this);
        Bundle bundle = this.f1084f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1445c, bundle);
        }
        return c0057c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1077P.f2512b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1094r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1094r.f921L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1083e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1083e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1074M;
    }

    public x1.d e() {
        return new C0046o(this);
    }

    public final C0047p f() {
        if (this.f1069H == null) {
            C0047p c0047p = new C0047p();
            Object obj = f1062S;
            c0047p.f1059g = obj;
            c0047p.h = obj;
            c0047p.i = obj;
            c0047p.f1060j = 1.0f;
            c0047p.f1061k = null;
            this.f1069H = c0047p;
        }
        return this.f1069H;
    }

    public final I g() {
        if (this.f1095s != null) {
            return this.f1096t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0051u c0051u = this.f1095s;
        if (c0051u == null) {
            return null;
        }
        return c0051u.f1110f;
    }

    public final int i() {
        EnumC0070m enumC0070m = this.f1073L;
        return (enumC0070m == EnumC0070m.f1467b || this.f1097u == null) ? enumC0070m.ordinal() : Math.min(enumC0070m.ordinal(), this.f1097u.i());
    }

    public final I j() {
        I i = this.f1094r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1074M = new androidx.lifecycle.t(this);
        this.f1077P = new h0.e(this);
        ArrayList arrayList = this.f1078Q;
        C0045n c0045n = this.f1079R;
        if (arrayList.contains(c0045n)) {
            return;
        }
        if (this.f1080a < 0) {
            arrayList.add(c0045n);
            return;
        }
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = c0045n.f1052a;
        abstractComponentCallbacksC0048q.f1077P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0048q);
    }

    public final void l() {
        k();
        this.f1072K = this.f1083e;
        this.f1083e = UUID.randomUUID().toString();
        this.f1087k = false;
        this.f1088l = false;
        this.f1089m = false;
        this.f1090n = false;
        this.f1091o = false;
        this.f1093q = 0;
        this.f1094r = null;
        this.f1096t = new I();
        this.f1095s = null;
        this.f1098v = 0;
        this.f1099w = 0;
        this.f1100x = null;
        this.f1101y = false;
        this.f1102z = false;
    }

    public final boolean m() {
        return this.f1095s != null && this.f1087k;
    }

    public final boolean n() {
        if (!this.f1101y) {
            I i = this.f1094r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = this.f1097u;
            i.getClass();
            if (!(abstractComponentCallbacksC0048q == null ? false : abstractComponentCallbacksC0048q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1093q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1065C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0051u c0051u = this.f1095s;
        AbstractActivityC0132i abstractActivityC0132i = c0051u == null ? null : c0051u.f1109e;
        if (abstractActivityC0132i != null) {
            abstractActivityC0132i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1065C = true;
    }

    public void p() {
        this.f1065C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0132i abstractActivityC0132i) {
        this.f1065C = true;
        C0051u c0051u = this.f1095s;
        if ((c0051u == null ? null : c0051u.f1109e) != null) {
            this.f1065C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1065C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1096t.Q(parcelable);
            I i = this.f1096t;
            i.f915E = false;
            i.F = false;
            i.f921L.f957g = false;
            i.t(1);
        }
        I i2 = this.f1096t;
        if (i2.f938s >= 1) {
            return;
        }
        i2.f915E = false;
        i2.F = false;
        i2.f921L.f957g = false;
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
        sb.append(this.f1083e);
        if (this.f1098v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1098v));
        }
        if (this.f1100x != null) {
            sb.append(" tag=");
            sb.append(this.f1100x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1065C = true;
    }

    public void v() {
        this.f1065C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0051u c0051u = this.f1095s;
        if (c0051u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0132i abstractActivityC0132i = c0051u.i;
        LayoutInflater cloneInContext = abstractActivityC0132i.getLayoutInflater().cloneInContext(abstractActivityC0132i);
        cloneInContext.setFactory2(this.f1096t.f927f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1065C = true;
    }

    public void z() {
        this.f1065C = true;
    }
}
