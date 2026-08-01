package defpackage;

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
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class pm implements ComponentCallbacks, View.OnCreateContextMenuListener, ms, uc0, fp, n40 {
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
    public om M;
    public boolean N;
    public boolean O;
    public String P;
    public os R;
    public pn S;
    public m40 U;
    public final ArrayList V;
    public final mm W;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public pm l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public en w;
    public rm x;
    public pm z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public en y = new en();
    public final boolean G = true;
    public boolean L = true;
    public hs Q = hs.j;
    public final rx T = new rx();

    public pm() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new mm(this);
        l();
    }

    public void B(Bundle bundle) {
        this.H = true;
    }

    public void C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.M();
        this.u = true;
        this.S = new pn(this, d());
        View t = t(layoutInflater, viewGroup);
        this.J = t;
        pn pnVar = this.S;
        if (t == null) {
            if (pnVar.h == null) {
                this.S = null;
                return;
            } else {
                g9.s("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        pnVar.f();
        View view = this.J;
        pn pnVar2 = this.S;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, pnVar2);
        View view2 = this.J;
        pn pnVar3 = this.S;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, pnVar3);
        View view3 = this.J;
        pn pnVar4 = this.S;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, pnVar4);
        this.T.d(this.S);
    }

    public final m3 D() {
        rm rmVar = this.x;
        m3 m3Var = rmVar == null ? null : rmVar.r;
        if (m3Var != null) {
            return m3Var;
        }
        g9.g(this, " not attached to an activity.", "Fragment ");
        return null;
    }

    public final Context E() {
        Context h = h();
        if (h != null) {
            return h;
        }
        g9.g(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final View F() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        g9.g(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
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
        en enVar = this.w;
        if (enVar == null || !(enVar.E || enVar.F)) {
            this.k = bundle;
        } else {
            g9.s("Fragment already added and state has been saved");
        }
    }

    @Override // defpackage.n40
    public final s3 a() {
        return this.U.b;
    }

    public la0 b() {
        return new nm(this);
    }

    @Override // defpackage.fp
    public final qx c() {
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
        if (application == null && en.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + E().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        qx qxVar = new qx(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) qxVar.a;
        if (application != null) {
            linkedHashMap.put(rc0.i, application);
        }
        linkedHashMap.put(kr.k, this);
        linkedHashMap.put(kr.l, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(kr.m, bundle);
        }
        return qxVar;
    }

    @Override // defpackage.uc0
    public final tc0 d() {
        if (this.w == null) {
            g9.s("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i() == 1) {
            g9.s("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.w.L.d;
        tc0 tc0Var = (tc0) hashMap.get(this.j);
        if (tc0Var != null) {
            return tc0Var;
        }
        tc0 tc0Var2 = new tc0();
        hashMap.put(this.j, tc0Var2);
        return tc0Var2;
    }

    @Override // defpackage.ms
    public final os e() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final om f() {
        if (this.M == null) {
            om omVar = new om();
            Object obj = X;
            omVar.g = obj;
            omVar.h = obj;
            omVar.i = obj;
            omVar.j = 1.0f;
            omVar.k = null;
            this.M = omVar;
        }
        return this.M;
    }

    public final en g() {
        if (this.x != null) {
            return this.y;
        }
        g9.g(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context h() {
        rm rmVar = this.x;
        if (rmVar == null) {
            return null;
        }
        return rmVar.s;
    }

    public final int i() {
        hs hsVar = this.Q;
        return (hsVar == hs.g || this.z == null) ? hsVar.ordinal() : Math.min(hsVar.ordinal(), this.z.i());
    }

    public final en j() {
        en enVar = this.w;
        if (enVar != null) {
            return enVar;
        }
        g9.g(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String k(int i) {
        return E().getResources().getString(i);
    }

    public final void l() {
        this.R = new os(this);
        this.U = new m40(this);
        ArrayList arrayList = this.V;
        mm mmVar = this.W;
        if (arrayList.contains(mmVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(mmVar);
            return;
        }
        pm pmVar = mmVar.a;
        pmVar.U.a();
        kr.r(pmVar);
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
        this.y = new en();
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
        en enVar = this.w;
        if (enVar != null) {
            pm pmVar = this.z;
            enVar.getClass();
            if (pmVar == null ? false : pmVar.n()) {
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
        if (en.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void r(Context context) {
        this.H = true;
        rm rmVar = this.x;
        if ((rmVar == null ? null : rmVar.r) != null) {
            this.H = true;
        }
    }

    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.S(parcelable);
            en enVar = this.y;
            enVar.E = false;
            enVar.F = false;
            enVar.L.g = false;
            enVar.t(1);
        }
        en enVar2 = this.y;
        if (enVar2.s >= 1) {
            return;
        }
        enVar2.E = false;
        enVar2.F = false;
        enVar2.L.g = false;
        enVar2.t(1);
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
        rm rmVar = this.x;
        if (rmVar == null) {
            g9.s("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        m3 m3Var = rmVar.v;
        LayoutInflater cloneInContext = m3Var.getLayoutInflater().cloneInContext(m3Var);
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
