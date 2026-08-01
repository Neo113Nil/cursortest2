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
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class u implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.p0, androidx.lifecycle.h, c1.f {
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
    public c1.e U;
    public final ArrayList V;
    public final q W;
    public Bundle g;
    public SparseArray h;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f521i;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f523k;

    /* renamed from: l, reason: collision with root package name */
    public u f524l;

    /* renamed from: n, reason: collision with root package name */
    public int f526n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f528p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f529q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f530r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f531s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f532t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f533u;

    /* renamed from: v, reason: collision with root package name */
    public int f534v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f535w;

    /* renamed from: x, reason: collision with root package name */
    public w f536x;

    /* renamed from: z, reason: collision with root package name */
    public u f538z;

    /* renamed from: f, reason: collision with root package name */
    public int f520f = -1;

    /* renamed from: j, reason: collision with root package name */
    public String f522j = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    public String f525m = null;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f527o = null;

    /* renamed from: y, reason: collision with root package name */
    public k0 f537y = new k0();
    public final boolean G = true;
    public boolean L = true;
    public androidx.lifecycle.m Q = androidx.lifecycle.m.f592j;
    public final androidx.lifecycle.x T = new androidx.lifecycle.x();

    public u() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new q(this);
        l();
    }

    public void A(Bundle bundle) {
        this.H = true;
    }

    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f537y.M();
        this.f533u = true;
        this.S = new s0(this, e());
        View t3 = t(layoutInflater, viewGroup);
        this.J = t3;
        if (t3 == null) {
            if (this.S.h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.S = null;
            return;
        }
        this.S.d();
        View view = this.J;
        s0 s0Var = this.S;
        u2.c.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, s0Var);
        View view2 = this.J;
        s0 s0Var2 = this.S;
        u2.c.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, s0Var2);
        View view3 = this.J;
        s0 s0Var3 = this.S;
        u2.c.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, s0Var3);
        this.T.e(this.S);
    }

    public final Context C() {
        Context h = h();
        if (h != null) {
            return h;
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

    public final void E(int i4, int i5, int i6, int i7) {
        if (this.M == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        d().f510b = i4;
        d().c = i5;
        d().f511d = i6;
        d().f512e = i7;
    }

    public final void F(Bundle bundle) {
        k0 k0Var = this.f535w;
        if (k0Var != null && (k0Var.E || k0Var.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f523k = bundle;
    }

    @Override // c1.f
    public final c1.d a() {
        return this.U.f1004b;
    }

    public k3.m b() {
        return new r(this);
    }

    @Override // androidx.lifecycle.h
    public final x0.b c() {
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
        if (application == null && k0.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        x0.b bVar = new x0.b(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f2763a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f594a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f581a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f582b, this);
        Bundle bundle = this.f523k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.c, bundle);
        }
        return bVar;
    }

    public final s d() {
        if (this.M == null) {
            s sVar = new s();
            Object obj = X;
            sVar.g = obj;
            sVar.h = obj;
            sVar.f514i = obj;
            sVar.f515j = 1.0f;
            sVar.f516k = null;
            this.M = sVar;
        }
        return this.M;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        if (this.f535w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f535w.L.f471e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap.get(this.f522j);
        if (o0Var != null) {
            return o0Var;
        }
        androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0();
        hashMap.put(this.f522j, o0Var2);
        return o0Var2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.R;
    }

    public final k0 g() {
        if (this.f536x != null) {
            return this.f537y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        w wVar = this.f536x;
        if (wVar == null) {
            return null;
        }
        return wVar.f548l;
    }

    public final int i() {
        androidx.lifecycle.m mVar = this.Q;
        return (mVar == androidx.lifecycle.m.g || this.f538z == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.f538z.i());
    }

    public final k0 j() {
        k0 k0Var = this.f535w;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String k(int i4) {
        return C().getResources().getString(i4);
    }

    public final void l() {
        this.R = new androidx.lifecycle.t(this);
        this.U = new c1.e(this);
        ArrayList arrayList = this.V;
        q qVar = this.W;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.f520f < 0) {
            arrayList.add(qVar);
            return;
        }
        u uVar = qVar.f497a;
        uVar.U.a();
        androidx.lifecycle.g0.a(uVar);
    }

    public final void m() {
        l();
        this.P = this.f522j;
        this.f522j = UUID.randomUUID().toString();
        this.f528p = false;
        this.f529q = false;
        this.f530r = false;
        this.f531s = false;
        this.f532t = false;
        this.f534v = 0;
        this.f535w = null;
        this.f537y = new k0();
        this.f536x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean n() {
        if (this.D) {
            return true;
        }
        k0 k0Var = this.f535w;
        if (k0Var != null) {
            u uVar = this.f538z;
            k0Var.getClass();
            if (uVar == null ? false : uVar.n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return this.f534v > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        w wVar = this.f536x;
        f.i iVar = wVar == null ? null : wVar.f547k;
        if (iVar != null) {
            iVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public void p() {
        this.H = true;
    }

    public final void q(int i4, int i5, Intent intent) {
        if (k0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void r(Context context) {
        this.H = true;
        w wVar = this.f536x;
        if ((wVar == null ? null : wVar.f547k) != null) {
            this.H = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f537y.S(parcelable);
            k0 k0Var = this.f537y;
            k0Var.E = false;
            k0Var.F = false;
            k0Var.L.h = false;
            k0Var.t(1);
        }
        k0 k0Var2 = this.f537y;
        if (k0Var2.f450s >= 1) {
            return;
        }
        k0Var2.E = false;
        k0Var2.F = false;
        k0Var2.L.h = false;
        k0Var2.t(1);
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
        sb.append(this.f522j);
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

    public void v() {
        this.H = true;
    }

    public LayoutInflater w(Bundle bundle) {
        w wVar = this.f536x;
        if (wVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        f.i iVar = wVar.f551o;
        LayoutInflater cloneInContext = iVar.getLayoutInflater().cloneInContext(iVar);
        cloneInContext.setFactory2(this.f537y.f439f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.H = true;
    }

    public void z() {
        this.H = true;
    }
}
