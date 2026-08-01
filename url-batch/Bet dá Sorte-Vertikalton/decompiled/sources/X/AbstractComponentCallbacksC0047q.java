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
import androidx.lifecycle.EnumC0072m;
import androidx.lifecycle.InterfaceC0067h;
import com.glasspulse.glasspulse.R;
import g.AbstractActivityC0128i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0047q implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.P, InterfaceC0067h, h0.f {

    /* renamed from: S, reason: collision with root package name */
    public static final Object f1036S = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1037A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1039C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f1040D;

    /* renamed from: E, reason: collision with root package name */
    public View f1041E;
    public boolean F;

    /* renamed from: H, reason: collision with root package name */
    public C0046p f1043H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1044I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f1045J;

    /* renamed from: K, reason: collision with root package name */
    public String f1046K;

    /* renamed from: M, reason: collision with root package name */
    public androidx.lifecycle.t f1048M;

    /* renamed from: N, reason: collision with root package name */
    public Q f1049N;

    /* renamed from: P, reason: collision with root package name */
    public h0.e f1051P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f1052Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0044n f1053R;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1055b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1056c;
    public Bundle d;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1058f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1059g;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1061k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1062l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1063m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1064n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1065o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1066p;

    /* renamed from: q, reason: collision with root package name */
    public int f1067q;

    /* renamed from: r, reason: collision with root package name */
    public I f1068r;

    /* renamed from: s, reason: collision with root package name */
    public C0050u f1069s;

    /* renamed from: u, reason: collision with root package name */
    public AbstractComponentCallbacksC0047q f1071u;

    /* renamed from: v, reason: collision with root package name */
    public int f1072v;

    /* renamed from: w, reason: collision with root package name */
    public int f1073w;

    /* renamed from: x, reason: collision with root package name */
    public String f1074x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1075y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1076z;

    /* renamed from: a, reason: collision with root package name */
    public int f1054a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1057e = UUID.randomUUID().toString();
    public String h = null;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1060j = null;

    /* renamed from: t, reason: collision with root package name */
    public I f1070t = new I();

    /* renamed from: B, reason: collision with root package name */
    public final boolean f1038B = true;

    /* renamed from: G, reason: collision with root package name */
    public boolean f1042G = true;

    /* renamed from: L, reason: collision with root package name */
    public EnumC0072m f1047L = EnumC0072m.f1441e;

    /* renamed from: O, reason: collision with root package name */
    public final androidx.lifecycle.w f1050O = new androidx.lifecycle.w();

    public AbstractComponentCallbacksC0047q() {
        new AtomicInteger();
        this.f1052Q = new ArrayList();
        this.f1053R = new C0044n(this);
        k();
    }

    public void A(Bundle bundle) {
        this.f1039C = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1070t.K();
        this.f1066p = true;
        this.f1049N = new Q(this, c());
        View t2 = t(layoutInflater, viewGroup);
        this.f1041E = t2;
        if (t2 == null) {
            if (this.f1049N.f954c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1049N = null;
            return;
        }
        this.f1049N.f();
        androidx.lifecycle.H.f(this.f1041E, this.f1049N);
        View view = this.f1041E;
        Q q2 = this.f1049N;
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, q2);
        u1.l.i0(this.f1041E, this.f1049N);
        this.f1050O.d(this.f1049N);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.f1041E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i2, int i3, int i4) {
        if (this.f1043H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().f1029b = i;
        f().f1030c = i2;
        f().d = i3;
        f().f1031e = i4;
    }

    public final void F(Bundle bundle) {
        I i = this.f1068r;
        if (i != null && (i.f889E || i.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1058f = bundle;
    }

    @Override // androidx.lifecycle.InterfaceC0067h
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
        LinkedHashMap linkedHashMap = c0057c.f1179a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.H.d, application);
        }
        linkedHashMap.put(androidx.lifecycle.H.f1415a, this);
        linkedHashMap.put(androidx.lifecycle.H.f1416b, this);
        Bundle bundle = this.f1058f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.H.f1417c, bundle);
        }
        return c0057c;
    }

    @Override // h0.f
    public final h0.d b() {
        return this.f1051P.f2486b;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        if (this.f1068r == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f1068r.f895L.d;
        androidx.lifecycle.O o2 = (androidx.lifecycle.O) hashMap.get(this.f1057e);
        if (o2 != null) {
            return o2;
        }
        androidx.lifecycle.O o3 = new androidx.lifecycle.O();
        hashMap.put(this.f1057e, o3);
        return o3;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.f1048M;
    }

    public u1.l e() {
        return new C0045o(this);
    }

    public final C0046p f() {
        if (this.f1043H == null) {
            C0046p c0046p = new C0046p();
            Object obj = f1036S;
            c0046p.f1033g = obj;
            c0046p.h = obj;
            c0046p.i = obj;
            c0046p.f1034j = 1.0f;
            c0046p.f1035k = null;
            this.f1043H = c0046p;
        }
        return this.f1043H;
    }

    public final I g() {
        if (this.f1069s != null) {
            return this.f1070t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        C0050u c0050u = this.f1069s;
        if (c0050u == null) {
            return null;
        }
        return c0050u.f1084f;
    }

    public final int i() {
        EnumC0072m enumC0072m = this.f1047L;
        return (enumC0072m == EnumC0072m.f1439b || this.f1071u == null) ? enumC0072m.ordinal() : Math.min(enumC0072m.ordinal(), this.f1071u.i());
    }

    public final I j() {
        I i = this.f1068r;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.f1048M = new androidx.lifecycle.t(this);
        this.f1051P = new h0.e(this);
        ArrayList arrayList = this.f1052Q;
        C0044n c0044n = this.f1053R;
        if (arrayList.contains(c0044n)) {
            return;
        }
        if (this.f1054a < 0) {
            arrayList.add(c0044n);
            return;
        }
        AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = c0044n.f1026a;
        abstractComponentCallbacksC0047q.f1051P.a();
        androidx.lifecycle.H.d(abstractComponentCallbacksC0047q);
    }

    public final void l() {
        k();
        this.f1046K = this.f1057e;
        this.f1057e = UUID.randomUUID().toString();
        this.f1061k = false;
        this.f1062l = false;
        this.f1063m = false;
        this.f1064n = false;
        this.f1065o = false;
        this.f1067q = 0;
        this.f1068r = null;
        this.f1070t = new I();
        this.f1069s = null;
        this.f1072v = 0;
        this.f1073w = 0;
        this.f1074x = null;
        this.f1075y = false;
        this.f1076z = false;
    }

    public final boolean m() {
        return this.f1069s != null && this.f1061k;
    }

    public final boolean n() {
        if (!this.f1075y) {
            I i = this.f1068r;
            if (i == null) {
                return false;
            }
            AbstractComponentCallbacksC0047q abstractComponentCallbacksC0047q = this.f1071u;
            i.getClass();
            if (!(abstractComponentCallbacksC0047q == null ? false : abstractComponentCallbacksC0047q.n())) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return this.f1067q > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1039C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0050u c0050u = this.f1069s;
        AbstractActivityC0128i abstractActivityC0128i = c0050u == null ? null : c0050u.f1083e;
        if (abstractActivityC0128i != null) {
            abstractActivityC0128i.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1039C = true;
    }

    public void p() {
        this.f1039C = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(AbstractActivityC0128i abstractActivityC0128i) {
        this.f1039C = true;
        C0050u c0050u = this.f1069s;
        if ((c0050u == null ? null : c0050u.f1083e) != null) {
            this.f1039C = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f1039C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1070t.Q(parcelable);
            I i = this.f1070t;
            i.f889E = false;
            i.F = false;
            i.f895L.f931g = false;
            i.t(1);
        }
        I i2 = this.f1070t;
        if (i2.f912s >= 1) {
            return;
        }
        i2.f889E = false;
        i2.F = false;
        i2.f895L.f931g = false;
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
        sb.append(this.f1057e);
        if (this.f1072v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1072v));
        }
        if (this.f1074x != null) {
            sb.append(" tag=");
            sb.append(this.f1074x);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.f1039C = true;
    }

    public void v() {
        this.f1039C = true;
    }

    public LayoutInflater w(Bundle bundle) {
        C0050u c0050u = this.f1069s;
        if (c0050u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0128i abstractActivityC0128i = c0050u.i;
        LayoutInflater cloneInContext = abstractActivityC0128i.getLayoutInflater().cloneInContext(abstractActivityC0128i);
        cloneInContext.setFactory2(this.f1070t.f901f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.f1039C = true;
    }

    public void z() {
        this.f1039C = true;
    }
}
