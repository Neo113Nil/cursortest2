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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class u implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.p0, androidx.lifecycle.h, h1.e {
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
    public h1.d U;
    public final ArrayList V;
    public final q W;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f645g;
    public SparseArray h;
    public Bundle i;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f647k;

    /* renamed from: l, reason: collision with root package name */
    public u f648l;

    /* renamed from: n, reason: collision with root package name */
    public int f650n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f652p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f653q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f654r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f655s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f656t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f657u;

    /* renamed from: v, reason: collision with root package name */
    public int f658v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f659w;

    /* renamed from: x, reason: collision with root package name */
    public w f660x;

    /* renamed from: z, reason: collision with root package name */
    public u f662z;

    /* renamed from: f, reason: collision with root package name */
    public int f644f = -1;

    /* renamed from: j, reason: collision with root package name */
    public String f646j = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    public String f649m = null;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f651o = null;

    /* renamed from: y, reason: collision with root package name */
    public k0 f661y = new k0();
    public final boolean G = true;
    public boolean L = true;
    public androidx.lifecycle.m Q = androidx.lifecycle.m.f724j;
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
        this.f661y.N();
        this.f657u = true;
        this.S = new s0(this, e());
        View t4 = t(layoutInflater, viewGroup);
        this.J = t4;
        if (t4 == null) {
            if (this.S.h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.S = null;
            return;
        }
        this.S.d();
        View view = this.J;
        s0 s0Var = this.S;
        i3.d.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, s0Var);
        View view2 = this.J;
        s0 s0Var2 = this.S;
        i3.d.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, s0Var2);
        View view3 = this.J;
        s0 s0Var3 = this.S;
        i3.d.e(view3, "<this>");
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

    public final void E(int i, int i4, int i5, int i6) {
        if (this.M == null && i == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        d().f633b = i;
        d().f634c = i4;
        d().d = i5;
        d().f635e = i6;
    }

    public final void F(Bundle bundle) {
        k0 k0Var = this.f659w;
        if (k0Var != null && (k0Var.E || k0Var.F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f647k = bundle;
    }

    @Override // h1.e
    public final h1.c a() {
        return this.U.f1972b;
    }

    public b4.d b() {
        return new r(this);
    }

    @Override // androidx.lifecycle.h
    public final b1.c c() {
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
        if (application == null && k0.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        b1.c cVar = new b1.c(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f825a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f726a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f710a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f711b, this);
        Bundle bundle = this.f647k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f712c, bundle);
        }
        return cVar;
    }

    public final s d() {
        if (this.M == null) {
            s sVar = new s();
            Object obj = X;
            sVar.f637g = obj;
            sVar.h = obj;
            sVar.i = obj;
            sVar.f638j = 1.0f;
            sVar.f639k = null;
            this.M = sVar;
        }
        return this.M;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        if (this.f659w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f659w.L.f589e;
        androidx.lifecycle.o0 o0Var = (androidx.lifecycle.o0) hashMap.get(this.f646j);
        if (o0Var != null) {
            return o0Var;
        }
        androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0();
        hashMap.put(this.f646j, o0Var2);
        return o0Var2;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.R;
    }

    public final k0 g() {
        if (this.f660x != null) {
            return this.f661y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        w wVar = this.f660x;
        if (wVar == null) {
            return null;
        }
        return wVar.f674p;
    }

    public final int i() {
        androidx.lifecycle.m mVar = this.Q;
        return (mVar == androidx.lifecycle.m.f723g || this.f662z == null) ? mVar.ordinal() : Math.min(mVar.ordinal(), this.f662z.i());
    }

    public final k0 j() {
        k0 k0Var = this.f659w;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String k(int i) {
        return C().getResources().getString(i);
    }

    public final void l() {
        this.R = new androidx.lifecycle.t(this);
        this.U = new h1.d(this);
        ArrayList arrayList = this.V;
        q qVar = this.W;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.f644f < 0) {
            arrayList.add(qVar);
            return;
        }
        u uVar = qVar.f620a;
        uVar.U.a();
        androidx.lifecycle.g0.a(uVar);
    }

    public final void m() {
        l();
        this.P = this.f646j;
        this.f646j = UUID.randomUUID().toString();
        this.f652p = false;
        this.f653q = false;
        this.f654r = false;
        this.f655s = false;
        this.f656t = false;
        this.f658v = 0;
        this.f659w = null;
        this.f661y = new k0();
        this.f660x = null;
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
        k0 k0Var = this.f659w;
        if (k0Var != null) {
            u uVar = this.f662z;
            k0Var.getClass();
            if (uVar == null ? false : uVar.n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return this.f658v > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        w wVar = this.f660x;
        g.i iVar = wVar == null ? null : wVar.f673o;
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

    public final void q(int i, int i4, Intent intent) {
        if (k0.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i4 + " data: " + intent);
        }
    }

    public void r(Context context) {
        this.H = true;
        w wVar = this.f660x;
        if ((wVar == null ? null : wVar.f673o) != null) {
            this.H = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f661y.T(parcelable);
            this.f661y.j();
        }
        k0 k0Var = this.f661y;
        if (k0Var.f569s >= 1) {
            return;
        }
        k0Var.j();
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
        sb.append(this.f646j);
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
        w wVar = this.f660x;
        if (wVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        g.i iVar = wVar.f677s;
        LayoutInflater cloneInContext = iVar.getLayoutInflater().cloneInContext(iVar);
        cloneInContext.setFactory2(this.f661y.f558f);
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
