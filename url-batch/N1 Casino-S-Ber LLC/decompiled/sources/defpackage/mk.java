package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a;
import androidx.lifecycle.b;
import com.derinko.gbini.n1casino.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class mk implements ComponentCallbacks, View.OnCreateContextMenuListener, aq, j90, tm, g10 {
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
    public kk M;
    public boolean N;
    public boolean O;
    public String P;
    public a R;
    public kl S;
    public f10 U;
    public final ArrayList V;
    public final ik W;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public mk l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public bl w;
    public ok x;
    public mk z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public bl y = new bl();
    public final boolean G = true;
    public boolean L = true;
    public vp Q = vp.j;
    public final b T = new b();

    public mk() {
        new AtomicInteger();
        this.V = new ArrayList();
        this.W = new ik(this);
        m();
    }

    public void A() {
        this.H = true;
    }

    public void C(Bundle bundle) {
        this.H = true;
    }

    public void D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.M();
        this.u = true;
        this.S = new kl(this, d());
        View u = u(layoutInflater, viewGroup);
        this.J = u;
        kl klVar = this.S;
        if (u == null) {
            if (klVar.h == null) {
                this.S = null;
                return;
            } else {
                t8.t("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        klVar.f();
        View view = this.J;
        kl klVar2 = this.S;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, klVar2);
        View view2 = this.J;
        kl klVar3 = this.S;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, klVar3);
        View view3 = this.J;
        kl klVar4 = this.S;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, klVar4);
        this.T.e(this.S);
    }

    public final Context E() {
        Context h = h();
        if (h != null) {
            return h;
        }
        t8.h(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final View F() {
        View view = this.J;
        if (view != null) {
            return view;
        }
        t8.h(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
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
        bl blVar = this.w;
        if (blVar == null || !(blVar.E || blVar.F)) {
            this.k = bundle;
        } else {
            t8.t("Fragment already added and state has been saved");
        }
    }

    @Override // defpackage.g10
    public final i3 a() {
        return this.U.b;
    }

    public jw b() {
        return new jk(this);
    }

    @Override // defpackage.tm
    public final pu c() {
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
        if (application == null && bl.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + E().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        pu puVar = new pu(0);
        LinkedHashMap linkedHashMap = (LinkedHashMap) puVar.a;
        if (application != null) {
            linkedHashMap.put(dh.n, application);
        }
        linkedHashMap.put(jw.k, this);
        linkedHashMap.put(jw.l, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(jw.m, bundle);
        }
        return puVar;
    }

    @Override // defpackage.j90
    public final i90 d() {
        if (this.w == null) {
            t8.t("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i() == 1) {
            t8.t("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.w.L.e;
        i90 i90Var = (i90) hashMap.get(this.j);
        if (i90Var != null) {
            return i90Var;
        }
        i90 i90Var2 = new i90();
        hashMap.put(this.j, i90Var2);
        return i90Var2;
    }

    @Override // defpackage.aq
    public final a e() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final kk f() {
        if (this.M == null) {
            kk kkVar = new kk();
            Object obj = X;
            kkVar.g = obj;
            kkVar.h = obj;
            kkVar.i = obj;
            kkVar.j = 1.0f;
            kkVar.k = null;
            this.M = kkVar;
        }
        return this.M;
    }

    public final bl g() {
        if (this.x != null) {
            return this.y;
        }
        t8.h(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final Context h() {
        ok okVar = this.x;
        if (okVar == null) {
            return null;
        }
        return okVar.p;
    }

    public final int i() {
        vp vpVar = this.Q;
        return (vpVar == vp.g || this.z == null) ? vpVar.ordinal() : Math.min(vpVar.ordinal(), this.z.i());
    }

    public final bl j() {
        bl blVar = this.w;
        if (blVar != null) {
            return blVar;
        }
        t8.h(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final Resources k() {
        return E().getResources();
    }

    public final String l(int i) {
        return k().getString(i);
    }

    public final void m() {
        this.R = new a(this);
        this.U = new f10(this);
        ArrayList arrayList = this.V;
        ik ikVar = this.W;
        if (arrayList.contains(ikVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(ikVar);
            return;
        }
        mk mkVar = ikVar.a;
        mkVar.U.a();
        jw.q(mkVar);
    }

    public final void n() {
        m();
        this.P = this.j;
        this.j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new bl();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean o() {
        if (this.D) {
            return true;
        }
        bl blVar = this.w;
        if (blVar != null) {
            mk mkVar = this.z;
            blVar.getClass();
            if (mkVar == null ? false : mkVar.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ok okVar = this.x;
        c3 c3Var = okVar == null ? null : okVar.o;
        if (c3Var != null) {
            c3Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            t8.h(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public final boolean p() {
        return this.v > 0;
    }

    public void q() {
        this.H = true;
    }

    public final void r(int i, int i2, Intent intent) {
        if (bl.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void s(Context context) {
        this.H = true;
        ok okVar = this.x;
        if ((okVar == null ? null : okVar.o) != null) {
            this.H = true;
        }
    }

    public void t(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.S(parcelable);
            bl blVar = this.y;
            blVar.E = false;
            blVar.F = false;
            blVar.L.h = false;
            blVar.t(1);
        }
        bl blVar2 = this.y;
        if (blVar2.s >= 1) {
            return;
        }
        blVar2.E = false;
        blVar2.F = false;
        blVar2.L.h = false;
        blVar2.t(1);
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

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void v() {
        this.H = true;
    }

    public void w() {
        this.H = true;
    }

    public LayoutInflater x(Bundle bundle) {
        ok okVar = this.x;
        if (okVar == null) {
            t8.t("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        c3 c3Var = okVar.s;
        LayoutInflater cloneInContext = c3Var.getLayoutInflater().cloneInContext(c3Var);
        cloneInContext.setFactory2(this.y.f);
        return cloneInContext;
    }

    public abstract void y(Bundle bundle);

    public void z() {
        this.H = true;
    }

    public void B(View view) {
    }
}
