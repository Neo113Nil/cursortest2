package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0250p;
import androidx.lifecycle.C0258y;
import androidx.lifecycle.EnumC0249o;
import androidx.lifecycle.InterfaceC0244j;
import androidx.lifecycle.InterfaceC0256w;
import i.AbstractActivityC0525l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ComponentCallbacksC0228t implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0256w, androidx.lifecycle.c0, InterfaceC0244j, k0.f {

    /* renamed from: Z, reason: collision with root package name */
    public static final Object f3774Z = new Object();

    /* renamed from: A, reason: collision with root package name */
    public Q f3775A;

    /* renamed from: B, reason: collision with root package name */
    public C0232x f3776B;

    /* renamed from: D, reason: collision with root package name */
    public ComponentCallbacksC0228t f3778D;

    /* renamed from: E, reason: collision with root package name */
    public int f3779E;

    /* renamed from: F, reason: collision with root package name */
    public int f3780F;

    /* renamed from: G, reason: collision with root package name */
    public String f3781G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3782H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3783I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3784J;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3786L;

    /* renamed from: M, reason: collision with root package name */
    public ViewGroup f3787M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3788N;

    /* renamed from: P, reason: collision with root package name */
    public C0227s f3790P;
    public boolean Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3791R;

    /* renamed from: S, reason: collision with root package name */
    public String f3792S;

    /* renamed from: T, reason: collision with root package name */
    public EnumC0249o f3793T;

    /* renamed from: U, reason: collision with root package name */
    public C0258y f3794U;

    /* renamed from: V, reason: collision with root package name */
    public final androidx.lifecycle.C f3795V;

    /* renamed from: W, reason: collision with root package name */
    public k0.e f3796W;

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f3797X;

    /* renamed from: Y, reason: collision with root package name */
    public final r f3798Y;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f3800e;

    /* renamed from: i, reason: collision with root package name */
    public SparseArray f3801i;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f3802l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f3804n;

    /* renamed from: o, reason: collision with root package name */
    public ComponentCallbacksC0228t f3805o;

    /* renamed from: q, reason: collision with root package name */
    public int f3807q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3809s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3810t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3811u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3812v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3813w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3814x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3815y;

    /* renamed from: z, reason: collision with root package name */
    public int f3816z;

    /* renamed from: d, reason: collision with root package name */
    public int f3799d = -1;

    /* renamed from: m, reason: collision with root package name */
    public String f3803m = UUID.randomUUID().toString();

    /* renamed from: p, reason: collision with root package name */
    public String f3806p = null;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f3808r = null;

    /* renamed from: C, reason: collision with root package name */
    public S f3777C = new S();

    /* renamed from: K, reason: collision with root package name */
    public final boolean f3785K = true;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3789O = true;

    public ComponentCallbacksC0228t() {
        new F.b(9, this);
        this.f3793T = EnumC0249o.f3910m;
        this.f3795V = new androidx.lifecycle.C();
        new AtomicInteger();
        this.f3797X = new ArrayList();
        this.f3798Y = new r(this);
        f();
    }

    public A a() {
        return new C0225p(this);
    }

    public final C0227s b() {
        if (this.f3790P == null) {
            C0227s c0227s = new C0227s();
            Object obj = f3774Z;
            c0227s.f3771g = obj;
            c0227s.f3772h = obj;
            c0227s.f3773i = obj;
            c0227s.j = null;
            this.f3790P = c0227s;
        }
        return this.f3790P;
    }

    public final Q c() {
        if (this.f3776B != null) {
            return this.f3777C;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int d() {
        EnumC0249o enumC0249o = this.f3793T;
        return (enumC0249o == EnumC0249o.f3907e || this.f3778D == null) ? enumC0249o.ordinal() : Math.min(enumC0249o.ordinal(), this.f3778D.d());
    }

    public final Q e() {
        Q q4 = this.f3775A;
        if (q4 != null) {
            return q4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void f() {
        this.f3794U = new C0258y(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.f3796W = new k0.e(this);
        ArrayList arrayList = this.f3797X;
        r rVar = this.f3798Y;
        if (arrayList.contains(rVar)) {
            return;
        }
        if (this.f3799d < 0) {
            arrayList.add(rVar);
            return;
        }
        ComponentCallbacksC0228t componentCallbacksC0228t = rVar.f3764a;
        componentCallbacksC0228t.f3796W.a();
        androidx.lifecycle.O.d(componentCallbacksC0228t);
        Bundle bundle = componentCallbacksC0228t.f3800e;
        componentCallbacksC0228t.f3796W.b(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void g() {
        f();
        this.f3792S = this.f3803m;
        this.f3803m = UUID.randomUUID().toString();
        this.f3809s = false;
        this.f3810t = false;
        this.f3812v = false;
        this.f3813w = false;
        this.f3814x = false;
        this.f3816z = 0;
        this.f3775A = null;
        this.f3777C = new S();
        this.f3776B = null;
        this.f3779E = 0;
        this.f3780F = 0;
        this.f3781G = null;
        this.f3782H = false;
        this.f3783I = false;
    }

    @Override // androidx.lifecycle.InterfaceC0244j
    public final b0.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = v().getApplicationContext();
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
        if (application == null && Q.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + v().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        b0.d dVar = new b0.d(0);
        if (application != null) {
            dVar.b(androidx.lifecycle.X.f3887a, application);
        }
        dVar.b(androidx.lifecycle.O.f3869a, this);
        dVar.b(androidx.lifecycle.O.f3870b, this);
        Bundle bundle = this.f3804n;
        if (bundle != null) {
            dVar.b(androidx.lifecycle.O.f3871c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.InterfaceC0256w
    public final AbstractC0250p getLifecycle() {
        return this.f3794U;
    }

    @Override // k0.f
    public final C0593d getSavedStateRegistry() {
        return this.f3796W.f6029b;
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 getViewModelStore() {
        if (this.f3775A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (d() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f3775A.f3611N.f3650c;
        androidx.lifecycle.b0 b0Var = (androidx.lifecycle.b0) hashMap.get(this.f3803m);
        if (b0Var != null) {
            return b0Var;
        }
        androidx.lifecycle.b0 b0Var2 = new androidx.lifecycle.b0();
        hashMap.put(this.f3803m, b0Var2);
        return b0Var2;
    }

    public final boolean h() {
        return this.f3776B != null && this.f3809s;
    }

    public final boolean i() {
        if (this.f3782H) {
            return true;
        }
        Q q4 = this.f3775A;
        if (q4 != null) {
            ComponentCallbacksC0228t componentCallbacksC0228t = this.f3778D;
            q4.getClass();
            if (componentCallbacksC0228t == null ? false : componentCallbacksC0228t.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.f3816z > 0;
    }

    public void k() {
        this.f3786L = true;
    }

    public void l(int i2, int i5, Intent intent) {
        if (Q.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void m(Context context) {
        this.f3786L = true;
        C0232x c0232x = this.f3776B;
        if ((c0232x == null ? null : c0232x.f3822d) != null) {
            this.f3786L = true;
        }
    }

    public void n(Bundle bundle) {
        Bundle bundle2;
        this.f3786L = true;
        Bundle bundle3 = this.f3800e;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f3777C.U(bundle2);
            S s7 = this.f3777C;
            s7.f3604G = false;
            s7.f3605H = false;
            s7.f3611N.f3653f = false;
            s7.u(1);
        }
        S s8 = this.f3777C;
        if (s8.f3632u >= 1) {
            return;
        }
        s8.f3604G = false;
        s8.f3605H = false;
        s8.f3611N.f3653f = false;
        s8.u(1);
    }

    public void o() {
        this.f3786L = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f3786L = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0232x c0232x = this.f3776B;
        AbstractActivityC0525l abstractActivityC0525l = c0232x == null ? null : c0232x.f3822d;
        if (abstractActivityC0525l != null) {
            abstractActivityC0525l.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f3786L = true;
    }

    public void p() {
        this.f3786L = true;
    }

    public LayoutInflater q(Bundle bundle) {
        C0232x c0232x = this.f3776B;
        if (c0232x == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0525l abstractActivityC0525l = c0232x.f3826m;
        LayoutInflater cloneInContext = abstractActivityC0525l.getLayoutInflater().cloneInContext(abstractActivityC0525l);
        cloneInContext.setFactory2(this.f3777C.f3618f);
        return cloneInContext;
    }

    public void r(Bundle bundle) {
    }

    public void s() {
        this.f3786L = true;
    }

    public void t() {
        this.f3786L = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f3803m);
        if (this.f3779E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3779E));
        }
        if (this.f3781G != null) {
            sb.append(" tag=");
            sb.append(this.f3781G);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3777C.P();
        this.f3815y = true;
        getViewModelStore();
    }

    public final Context v() {
        C0232x c0232x = this.f3776B;
        AbstractActivityC0525l abstractActivityC0525l = c0232x == null ? null : c0232x.f3823e;
        if (abstractActivityC0525l != null) {
            return abstractActivityC0525l;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void w(int i2, int i5, int i7, int i8) {
        if (this.f3790P == null && i2 == 0 && i5 == 0 && i7 == 0 && i8 == 0) {
            return;
        }
        b().f3766b = i2;
        b().f3767c = i5;
        b().f3768d = i7;
        b().f3769e = i8;
    }
}
