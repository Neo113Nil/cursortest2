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
import com.trembin.nirefon.betfury.R;
import defpackage.a30;
import defpackage.b30;
import defpackage.bi;
import defpackage.gx;
import defpackage.h2;
import defpackage.i5;
import defpackage.kq;
import defpackage.lx;
import defpackage.nx;
import defpackage.qm0;
import defpackage.rb0;
import defpackage.s9;
import defpackage.sb0;
import defpackage.sm0;
import defpackage.tm0;
import defpackage.tp;
import defpackage.u3;
import defpackage.up;
import defpackage.vp;
import defpackage.vq;
import defpackage.ws;
import defpackage.xp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, lx, tm0, ws, sb0 {
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
    public vp M;
    public boolean N;
    public boolean O;
    public String P;
    public nx R;
    public vq S;
    public i5 U;
    public final ArrayList V;
    public final tp W;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public a l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public c w;
    public xp x;
    public a z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public kq y = new kq();
    public final boolean G = true;
    public boolean L = true;
    public gx Q = gx.RESUMED;
    public final b30 T = new b30();

    public a() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new tp(this);
        l();
    }

    public void B(Bundle bundle) {
        this.H = true;
    }

    public void C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.M();
        this.u = true;
        this.S = new vq(this, d());
        View t = t(layoutInflater, viewGroup);
        this.J = t;
        vq vqVar = this.S;
        if (t == null) {
            if (vqVar.h == null) {
                this.S = null;
                return;
            } else {
                s9.u("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        vqVar.f();
        View view = this.J;
        vq vqVar2 = this.S;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, vqVar2);
        View view2 = this.J;
        vq vqVar3 = this.S;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, vqVar3);
        View view3 = this.J;
        vq vqVar4 = this.S;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, vqVar4);
        this.T.h(this.S);
    }

    public final b D() {
        xp xpVar = this.x;
        u3 u3Var = xpVar == null ? null : xpVar.o;
        if (u3Var != null) {
            return u3Var;
        }
        s9.h(this, " not attached to an activity.", "Fragment ");
        return null;
    }

    public final Context E() {
        Context h = h();
        if (h != null) {
            return h;
        }
        s9.h(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final View F() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        s9.h(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        return null;
    }

    public final void G(int i, int i2, int i3, int i4) {
        if (this.M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }

    public final void H(Bundle bundle) {
        c cVar = this.w;
        if (cVar == null || !(cVar.E || cVar.F)) {
            this.k = bundle;
        } else {
            s9.u("Fragment already added and state has been saved");
        }
    }

    @Override // defpackage.sb0
    public final i5 a() {
        return (i5) this.U.h;
    }

    public bi b() {
        return new up(this);
    }

    @Override // defpackage.ws
    public final a30 c() {
        Application application;
        Context applicationContext = E().getApplicationContext();
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
        if (application == null && c.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + E().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        a30 a30Var = new a30(0);
        LinkedHashMap linkedHashMap = a30Var.a;
        if (application != null) {
            linkedHashMap.put(qm0.k, application);
        }
        linkedHashMap.put(bi.k, this);
        linkedHashMap.put(bi.l, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(bi.m, bundle);
        }
        return a30Var;
    }

    @Override // defpackage.tm0
    public final sm0 d() {
        if (this.w == null) {
            s9.u("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i() != gx.INITIALIZED.ordinal()) {
            return this.w.L.getViewModelStore(this);
        }
        s9.u("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        return null;
    }

    @Override // defpackage.lx
    public final nx e() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final vp f() {
        if (this.M == null) {
            vp vpVar = new vp();
            Object obj = X;
            vpVar.g = obj;
            vpVar.h = obj;
            vpVar.i = obj;
            vpVar.j = 1.0f;
            vpVar.k = null;
            this.M = vpVar;
        }
        return this.M;
    }

    public final c g() {
        if (this.x != null) {
            return this.y;
        }
        s9.h(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context h() {
        xp xpVar = this.x;
        if (xpVar == null) {
            return null;
        }
        return xpVar.p;
    }

    public final int i() {
        gx gxVar = this.Q;
        return (gxVar == gx.INITIALIZED || this.z == null) ? gxVar.ordinal() : Math.min(gxVar.ordinal(), this.z.i());
    }

    public final c j() {
        c cVar = this.w;
        if (cVar != null) {
            return cVar;
        }
        s9.h(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String k(int i) {
        return E().getResources().getString(i);
    }

    public final void l() {
        this.R = new nx(this);
        this.U = new i5(new rb0(this, new h2(9, this)));
        ArrayList arrayList = this.V;
        tp tpVar = this.W;
        if (arrayList.contains(tpVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(tpVar);
            return;
        }
        a aVar = tpVar.a;
        ((rb0) aVar.U.g).a();
        bi.x(aVar);
    }

    public final void m() {
        l();
        this.P = this.j;
        this.j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new kq();
        this.x = null;
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
        c cVar = this.w;
        if (cVar != null) {
            a aVar = this.z;
            cVar.getClass();
            if (aVar == null ? false : aVar.n()) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return this.v > 0;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        D().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public void p() {
        this.H = true;
    }

    public final void q(int i, int i2, Intent intent) {
        if (c.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(Context context) {
        this.H = true;
        xp xpVar = this.x;
        if ((xpVar == null ? null : xpVar.o) != null) {
            this.H = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.S(parcelable);
            kq kqVar = this.y;
            kqVar.E = false;
            kqVar.F = false;
            kqVar.L.setIsStateSaved(false);
            kqVar.t(1);
        }
        kq kqVar2 = this.y;
        if (kqVar2.s >= 1) {
            return;
        }
        kqVar2.E = false;
        kqVar2.F = false;
        kqVar2.L.setIsStateSaved(false);
        kqVar2.t(1);
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
        sb.append(this.j);
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
        xp xpVar = this.x;
        if (xpVar == null) {
            s9.u("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        u3 u3Var = xpVar.s;
        LayoutInflater cloneInContext = u3Var.getLayoutInflater().cloneInContext(u3Var);
        cloneInContext.setFactory2(this.y.f);
        return cloneInContext;
    }

    public abstract void x(Bundle bundle);

    public void y() {
        this.H = true;
    }

    public void z() {
        this.H = true;
    }

    public void A(View view) {
    }
}
