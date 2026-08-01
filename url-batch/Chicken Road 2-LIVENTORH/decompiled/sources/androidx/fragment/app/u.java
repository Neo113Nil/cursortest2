package androidx.fragment.app;

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
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class u implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.p0, androidx.lifecycle.h, g1.e {
    public static final Object X = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public View J;
    public boolean K;
    public s M;
    public boolean N;
    public boolean O;
    public String P;
    public androidx.lifecycle.t R;
    public s0 S;
    public g1.d U;
    public final ArrayList V;
    public final q W;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f536g;

    /* renamed from: h, reason: collision with root package name */
    public SparseArray f537h;
    public Bundle i;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f539k;

    /* renamed from: l, reason: collision with root package name */
    public u f540l;

    /* renamed from: n, reason: collision with root package name */
    public int f542n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f544p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f545q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f546r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f547s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f548t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f549u;

    /* renamed from: v, reason: collision with root package name */
    public int f550v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f551w;

    /* renamed from: x, reason: collision with root package name */
    public w f552x;

    /* renamed from: z, reason: collision with root package name */
    public u f554z;

    /* renamed from: f, reason: collision with root package name */
    public int f535f = -1;

    /* renamed from: j, reason: collision with root package name */
    public String f538j = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    public String f541m = null;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f543o = null;

    /* renamed from: y, reason: collision with root package name */
    public k0 f553y = new k0();
    public final boolean G = true;
    public boolean L = true;
    public androidx.lifecycle.m Q = androidx.lifecycle.m.f620j;
    public final androidx.lifecycle.x T = new androidx.lifecycle.x();

    public u() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new q(this);
        k();
    }

    public void A(Bundle bundle) {
        this.H = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f553y.K();
        this.f549u = true;
        this.S = new s0(this, d());
        View s3 = s(layoutInflater, viewGroup);
        this.J = s3;
        if (s3 == null) {
            if (this.S.f532h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.S = null;
            return;
        }
        this.S.f();
        View view = this.J;
        s0 s0Var = this.S;
        f3.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, s0Var);
        View view2 = this.J;
        s0 s0Var2 = this.S;
        f3.d.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, s0Var2);
        View view3 = this.J;
        s0 s0Var3 = this.S;
        f3.d.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, s0Var3);
        this.T.e(this.S);
    }

    public final Context C() {
        Context h4 = h();
        if (h4 != null) {
            return h4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View D() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void E(int i, int i4, int i5, int i6) {
        if (this.M == null && i == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        f().f522b = i;
        f().f523c = i4;
        f().d = i5;
        f().f524e = i6;
    }

    public final void F(Bundle bundle) {
        k0 k0Var = this.f551w;
        if (k0Var != null && (k0Var.E || k0Var.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f539k = bundle;
    }

    @Override // androidx.lifecycle.h
    public final a1.c a() {
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
        if (application == null && k0.E(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        a1.c cVar = new a1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f106a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f622a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f606a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f607b, this);
        Bundle bundle = this.f539k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f608c, bundle);
        }
        return cVar;
    }

    @Override // g1.e
    public final g1.c b() {
        return this.U.f1703b;
    }

    public a.y c() {
        return new r(this);
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 d() {
        if (this.f551w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f551w.L.f478e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap.get(this.f538j);
        if (o0Var != null) {
            return o0Var;
        }
        androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0();
        hashMap.put(this.f538j, o0Var2);
        return o0Var2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t e() {
        return this.R;
    }

    public final s f() {
        if (this.M == null) {
            s sVar = new s();
            Object obj = X;
            sVar.f526g = obj;
            sVar.f527h = obj;
            sVar.i = obj;
            sVar.f528j = 1.0f;
            sVar.f529k = null;
            this.M = sVar;
        }
        return this.M;
    }

    public final k0 g() {
        if (this.f552x != null) {
            return this.f553y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        w wVar = this.f552x;
        if (wVar == null) {
            return null;
        }
        return wVar.f568o;
    }

    public final int i() {
        androidx.lifecycle.m mVar = this.Q;
        return (mVar == androidx.lifecycle.m.f618g || this.f554z == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.f554z.i());
    }

    public final k0 j() {
        k0 k0Var = this.f551w;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void k() {
        this.R = new androidx.lifecycle.t(this);
        this.U = new g1.d(this);
        ArrayList arrayList = this.V;
        q qVar = this.W;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.f535f < 0) {
            arrayList.add(qVar);
            return;
        }
        u uVar = qVar.f508a;
        uVar.U.a();
        androidx.lifecycle.g0.a(uVar);
    }

    public final void l() {
        k();
        this.P = this.f538j;
        this.f538j = UUID.randomUUID().toString();
        this.f544p = false;
        this.f545q = false;
        this.f546r = false;
        this.f547s = false;
        this.f548t = false;
        this.f550v = 0;
        this.f551w = null;
        this.f553y = new k0();
        this.f552x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean m() {
        if (this.D) {
            return true;
        }
        k0 k0Var = this.f551w;
        if (k0Var != null) {
            u uVar = this.f554z;
            k0Var.getClass();
            if (uVar == null ? false : uVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.f550v > 0;
    }

    public void o() {
        this.H = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        w wVar = this.f552x;
        g.j jVar = wVar == null ? null : wVar.f567n;
        if (jVar != null) {
            jVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public final void p(int i, int i4, Intent intent) {
        if (k0.E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void q(Context context) {
        this.H = true;
        w wVar = this.f552x;
        if ((wVar == null ? null : wVar.f567n) != null) {
            this.H = true;
        }
    }

    public void r(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f553y.Q(parcelable);
            k0 k0Var = this.f553y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.f481h = false;
            k0Var.t(1);
        }
        k0 k0Var2 = this.f553y;
        if (k0Var2.f457s >= 1) {
            return;
        }
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.f481h = false;
        k0Var2.t(1);
    }

    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void t() {
        this.H = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f538j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u() {
        this.H = true;
    }

    public LayoutInflater v(Bundle bundle) {
        w wVar = this.f552x;
        if (wVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        g.j jVar = wVar.f571r;
        LayoutInflater cloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
        cloneInContext.setFactory2(this.f553y.f445f);
        return cloneInContext;
    }

    public void x() {
        this.H = true;
    }

    public void y() {
        this.H = true;
    }

    public void w(Bundle bundle) {
    }

    public void z(View view, Bundle bundle) {
    }
}
