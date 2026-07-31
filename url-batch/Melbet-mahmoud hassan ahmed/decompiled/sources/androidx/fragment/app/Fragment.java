package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.e;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, x, androidx.savedstate.b {

    /* renamed from: c0, reason: collision with root package name */
    static final Object f592c0 = new Object();
    int A;
    int B;
    String C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    private boolean J;
    ViewGroup K;
    View L;
    View M;
    boolean N;
    d P;
    boolean R;
    boolean S;
    float T;
    LayoutInflater U;
    boolean V;
    androidx.lifecycle.j X;
    r Y;

    /* renamed from: a0, reason: collision with root package name */
    androidx.savedstate.a f593a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f594b0;

    /* renamed from: g, reason: collision with root package name */
    Bundle f596g;

    /* renamed from: h, reason: collision with root package name */
    SparseArray<Parcelable> f597h;

    /* renamed from: i, reason: collision with root package name */
    Boolean f598i;

    /* renamed from: k, reason: collision with root package name */
    Bundle f600k;

    /* renamed from: l, reason: collision with root package name */
    Fragment f601l;

    /* renamed from: n, reason: collision with root package name */
    int f603n;

    /* renamed from: p, reason: collision with root package name */
    boolean f605p;

    /* renamed from: q, reason: collision with root package name */
    boolean f606q;

    /* renamed from: r, reason: collision with root package name */
    boolean f607r;

    /* renamed from: s, reason: collision with root package name */
    boolean f608s;

    /* renamed from: t, reason: collision with root package name */
    boolean f609t;

    /* renamed from: u, reason: collision with root package name */
    boolean f610u;

    /* renamed from: v, reason: collision with root package name */
    int f611v;

    /* renamed from: w, reason: collision with root package name */
    j f612w;

    /* renamed from: x, reason: collision with root package name */
    h f613x;

    /* renamed from: z, reason: collision with root package name */
    Fragment f615z;

    /* renamed from: f, reason: collision with root package name */
    int f595f = 0;

    /* renamed from: j, reason: collision with root package name */
    String f599j = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    String f602m = null;

    /* renamed from: o, reason: collision with root package name */
    private Boolean f604o = null;

    /* renamed from: y, reason: collision with root package name */
    j f614y = new j();
    boolean I = true;
    boolean O = true;
    Runnable Q = new a();
    e.c W = e.c.RESUMED;
    androidx.lifecycle.o<androidx.lifecycle.i> Z = new androidx.lifecycle.o<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.j1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.b();
        }
    }

    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View d(int i7) {
            View view = Fragment.this.L;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean e() {
            return Fragment.this.L != null;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        View f620a;

        /* renamed from: b, reason: collision with root package name */
        Animator f621b;

        /* renamed from: c, reason: collision with root package name */
        int f622c;

        /* renamed from: d, reason: collision with root package name */
        int f623d;

        /* renamed from: e, reason: collision with root package name */
        int f624e;

        /* renamed from: f, reason: collision with root package name */
        int f625f;

        /* renamed from: g, reason: collision with root package name */
        Object f626g = null;

        /* renamed from: h, reason: collision with root package name */
        Object f627h;

        /* renamed from: i, reason: collision with root package name */
        Object f628i;

        /* renamed from: j, reason: collision with root package name */
        Object f629j;

        /* renamed from: k, reason: collision with root package name */
        Object f630k;

        /* renamed from: l, reason: collision with root package name */
        Object f631l;

        /* renamed from: m, reason: collision with root package name */
        Boolean f632m;

        /* renamed from: n, reason: collision with root package name */
        Boolean f633n;

        /* renamed from: o, reason: collision with root package name */
        j.k f634o;

        /* renamed from: p, reason: collision with root package name */
        j.k f635p;

        /* renamed from: q, reason: collision with root package name */
        boolean f636q;

        /* renamed from: r, reason: collision with root package name */
        f f637r;

        /* renamed from: s, reason: collision with root package name */
        boolean f638s;

        d() {
            Object obj = Fragment.f592c0;
            this.f627h = obj;
            this.f628i = null;
            this.f629j = obj;
            this.f630k = null;
            this.f631l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        J();
    }

    private void J() {
        this.X = new androidx.lifecycle.j(this);
        this.f593a0 = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.X.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
                @Override // androidx.lifecycle.g
                public void d(androidx.lifecycle.i iVar, e.b bVar) {
                    View view;
                    if (bVar != e.b.ON_STOP || (view = Fragment.this.L) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
    }

    @Deprecated
    public static Fragment L(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.d1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e7) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    private d e() {
        if (this.P == null) {
            this.P = new d();
        }
        return this.P;
    }

    public Object A() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f629j;
        return obj == f592c0 ? r() : obj;
    }

    void A0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f614y.x(configuration);
    }

    public final Resources B() {
        return W0().getResources();
    }

    boolean B0(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        return W(menuItem) || this.f614y.y(menuItem);
    }

    public final boolean C() {
        return this.F;
    }

    void C0(Bundle bundle) {
        this.f614y.R0();
        this.f595f = 1;
        this.J = false;
        this.f593a0.c(bundle);
        X(bundle);
        this.V = true;
        if (this.J) {
            this.X.h(e.b.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object D() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f627h;
        return obj == f592c0 ? p() : obj;
    }

    boolean D0(Menu menu, MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z6 = true;
            a0(menu, menuInflater);
        }
        return z6 | this.f614y.A(menu, menuInflater);
    }

    public Object E() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f630k;
    }

    void E0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f614y.R0();
        this.f610u = true;
        this.Y = new r();
        View b02 = b0(layoutInflater, viewGroup, bundle);
        this.L = b02;
        if (b02 != null) {
            this.Y.c();
            this.Z.h(this.Y);
        } else {
            if (this.Y.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.Y = null;
        }
    }

    public Object F() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f631l;
        return obj == f592c0 ? E() : obj;
    }

    void F0() {
        this.f614y.B();
        this.X.h(e.b.ON_DESTROY);
        this.f595f = 0;
        this.J = false;
        this.V = false;
        c0();
        if (this.J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    int G() {
        d dVar = this.P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f622c;
    }

    void G0() {
        this.f614y.C();
        if (this.L != null) {
            this.Y.b(e.b.ON_DESTROY);
        }
        this.f595f = 1;
        this.J = false;
        e0();
        if (this.J) {
            androidx.loader.app.a.b(this).c();
            this.f610u = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final Fragment H() {
        String str;
        Fragment fragment = this.f601l;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.f612w;
        if (jVar == null || (str = this.f602m) == null) {
            return null;
        }
        return jVar.f692l.get(str);
    }

    void H0() {
        this.J = false;
        f0();
        this.U = null;
        if (this.J) {
            if (this.f614y.C0()) {
                return;
            }
            this.f614y.B();
            this.f614y = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    public View I() {
        return this.L;
    }

    LayoutInflater I0(Bundle bundle) {
        LayoutInflater g02 = g0(bundle);
        this.U = g02;
        return g02;
    }

    void J0() {
        onLowMemory();
        this.f614y.D();
    }

    void K() {
        J();
        this.f599j = UUID.randomUUID().toString();
        this.f605p = false;
        this.f606q = false;
        this.f607r = false;
        this.f608s = false;
        this.f609t = false;
        this.f611v = 0;
        this.f612w = null;
        this.f614y = new j();
        this.f613x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    void K0(boolean z6) {
        k0(z6);
        this.f614y.E(z6);
    }

    boolean L0(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        return (this.H && this.I && l0(menuItem)) || this.f614y.T(menuItem);
    }

    boolean M() {
        d dVar = this.P;
        if (dVar == null) {
            return false;
        }
        return dVar.f638s;
    }

    void M0(Menu menu) {
        if (this.D) {
            return;
        }
        if (this.H && this.I) {
            m0(menu);
        }
        this.f614y.U(menu);
    }

    final boolean N() {
        return this.f611v > 0;
    }

    void N0() {
        this.f614y.W();
        if (this.L != null) {
            this.Y.b(e.b.ON_PAUSE);
        }
        this.X.h(e.b.ON_PAUSE);
        this.f595f = 3;
        this.J = false;
        n0();
        if (this.J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    boolean O() {
        d dVar = this.P;
        if (dVar == null) {
            return false;
        }
        return dVar.f636q;
    }

    void O0(boolean z6) {
        o0(z6);
        this.f614y.X(z6);
    }

    public final boolean P() {
        j jVar = this.f612w;
        if (jVar == null) {
            return false;
        }
        return jVar.G0();
    }

    boolean P0(Menu menu) {
        boolean z6 = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z6 = true;
            p0(menu);
        }
        return z6 | this.f614y.Y(menu);
    }

    void Q() {
        this.f614y.R0();
    }

    void Q0() {
        boolean E0 = this.f612w.E0(this);
        Boolean bool = this.f604o;
        if (bool == null || bool.booleanValue() != E0) {
            this.f604o = Boolean.valueOf(E0);
            q0(E0);
            this.f614y.Z();
        }
    }

    public void R(Bundle bundle) {
        this.J = true;
    }

    void R0() {
        this.f614y.R0();
        this.f614y.j0();
        this.f595f = 4;
        this.J = false;
        s0();
        if (!this.J) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.X;
        e.b bVar = e.b.ON_RESUME;
        jVar.h(bVar);
        if (this.L != null) {
            this.Y.b(bVar);
        }
        this.f614y.a0();
        this.f614y.j0();
    }

    public void S(int i7, int i8, Intent intent) {
    }

    void S0(Bundle bundle) {
        t0(bundle);
        this.f593a0.d(bundle);
        Parcelable d12 = this.f614y.d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
    }

    @Deprecated
    public void T(Activity activity) {
        this.J = true;
    }

    void T0() {
        this.f614y.R0();
        this.f614y.j0();
        this.f595f = 3;
        this.J = false;
        u0();
        if (!this.J) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.X;
        e.b bVar = e.b.ON_START;
        jVar.h(bVar);
        if (this.L != null) {
            this.Y.b(bVar);
        }
        this.f614y.b0();
    }

    public void U(Context context) {
        this.J = true;
        h hVar = this.f613x;
        Activity f7 = hVar == null ? null : hVar.f();
        if (f7 != null) {
            this.J = false;
            T(f7);
        }
    }

    void U0() {
        this.f614y.d0();
        if (this.L != null) {
            this.Y.b(e.b.ON_STOP);
        }
        this.X.h(e.b.ON_STOP);
        this.f595f = 2;
        this.J = false;
        v0();
        if (this.J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void V(Fragment fragment) {
    }

    public final androidx.fragment.app.d V0() {
        androidx.fragment.app.d g7 = g();
        if (g7 != null) {
            return g7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean W(MenuItem menuItem) {
        return false;
    }

    public final Context W0() {
        Context o7 = o();
        if (o7 != null) {
            return o7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void X(Bundle bundle) {
        this.J = true;
        Z0(bundle);
        if (this.f614y.F0(1)) {
            return;
        }
        this.f614y.z();
    }

    public final i X0() {
        i t6 = t();
        if (t6 != null) {
            return t6;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation Y(int i7, boolean z6, int i8) {
        return null;
    }

    public final View Y0() {
        View I = I();
        if (I != null) {
            return I;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator Z(int i7, boolean z6, int i8) {
        return null;
    }

    void Z0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f614y.b1(parcelable);
        this.f614y.z();
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.X;
    }

    public void a0(Menu menu, MenuInflater menuInflater) {
    }

    final void a1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f597h;
        if (sparseArray != null) {
            this.M.restoreHierarchyState(sparseArray);
            this.f597h = null;
        }
        this.J = false;
        x0(bundle);
        if (this.J) {
            if (this.L != null) {
                this.Y.b(e.b.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    void b() {
        d dVar = this.P;
        f fVar = null;
        if (dVar != null) {
            dVar.f636q = false;
            f fVar2 = dVar.f637r;
            dVar.f637r = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f594b0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    void b1(View view) {
        e().f620a = view;
    }

    @Override // androidx.lifecycle.x
    public w c() {
        j jVar = this.f612w;
        if (jVar != null) {
            return jVar.z0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void c0() {
        this.J = true;
    }

    void c1(Animator animator) {
        e().f621b = animator;
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mTag=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f595f);
        printWriter.print(" mWho=");
        printWriter.print(this.f599j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f611v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f605p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f606q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f607r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f608s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.D);
        printWriter.print(" mDetached=");
        printWriter.print(this.E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.O);
        if (this.f612w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f612w);
        }
        if (this.f613x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f613x);
        }
        if (this.f615z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f615z);
        }
        if (this.f600k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f600k);
        }
        if (this.f596g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f596g);
        }
        if (this.f597h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f597h);
        }
        Fragment H = H();
        if (H != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(H);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f603n);
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(w());
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.L);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.L);
        }
        if (l() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(l());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(G());
        }
        if (o() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f614y + ":");
        this.f614y.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void d0() {
    }

    public void d1(Bundle bundle) {
        if (this.f612w != null && P()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f600k = bundle;
    }

    public void e0() {
        this.J = true;
    }

    void e1(boolean z6) {
        e().f638s = z6;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment f(String str) {
        return str.equals(this.f599j) ? this : this.f614y.p0(str);
    }

    public void f0() {
        this.J = true;
    }

    void f1(int i7) {
        if (this.P == null && i7 == 0) {
            return;
        }
        e().f623d = i7;
    }

    public final androidx.fragment.app.d g() {
        h hVar = this.f613x;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.f();
    }

    public LayoutInflater g0(Bundle bundle) {
        return v(bundle);
    }

    void g1(int i7, int i8) {
        if (this.P == null && i7 == 0 && i8 == 0) {
            return;
        }
        e();
        d dVar = this.P;
        dVar.f624e = i7;
        dVar.f625f = i8;
    }

    public void h0(boolean z6) {
    }

    void h1(f fVar) {
        e();
        d dVar = this.P;
        f fVar2 = dVar.f637r;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f636q) {
            dVar.f637r = fVar;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry i() {
        return this.f593a0.b();
    }

    @Deprecated
    public void i0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
    }

    void i1(int i7) {
        e().f622c = i7;
    }

    public boolean j() {
        Boolean bool;
        d dVar = this.P;
        if (dVar == null || (bool = dVar.f633n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void j0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
        h hVar = this.f613x;
        Activity f7 = hVar == null ? null : hVar.f();
        if (f7 != null) {
            this.J = false;
            i0(f7, attributeSet, bundle);
        }
    }

    public void j1() {
        j jVar = this.f612w;
        if (jVar == null || jVar.f702v == null) {
            e().f636q = false;
        } else if (Looper.myLooper() != this.f612w.f702v.j().getLooper()) {
            this.f612w.f702v.j().postAtFrontOfQueue(new b());
        } else {
            b();
        }
    }

    public boolean k() {
        Boolean bool;
        d dVar = this.P;
        if (dVar == null || (bool = dVar.f632m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void k0(boolean z6) {
    }

    View l() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f620a;
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    Animator m() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f621b;
    }

    public void m0(Menu menu) {
    }

    public final i n() {
        if (this.f613x != null) {
            return this.f614y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void n0() {
        this.J = true;
    }

    public Context o() {
        h hVar = this.f613x;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void o0(boolean z6) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        V0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.J = true;
    }

    public Object p() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f626g;
    }

    public void p0(Menu menu) {
    }

    j.k q() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f634o;
    }

    public void q0(boolean z6) {
    }

    public Object r() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f628i;
    }

    public void r0(int i7, String[] strArr, int[] iArr) {
    }

    j.k s() {
        d dVar = this.P;
        if (dVar == null) {
            return null;
        }
        return dVar.f635p;
    }

    public void s0() {
        this.J = true;
    }

    public final i t() {
        return this.f612w;
    }

    public void t0(Bundle bundle) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        q.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f599j);
        sb.append(")");
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" ");
            sb.append(this.C);
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object u() {
        h hVar = this.f613x;
        if (hVar == null) {
            return null;
        }
        return hVar.m();
    }

    public void u0() {
        this.J = true;
    }

    @Deprecated
    public LayoutInflater v(Bundle bundle) {
        h hVar = this.f613x;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater n7 = hVar.n();
        androidx.core.view.c.b(n7, this.f614y.x0());
        return n7;
    }

    public void v0() {
        this.J = true;
    }

    int w() {
        d dVar = this.P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f623d;
    }

    public void w0(View view, Bundle bundle) {
    }

    int x() {
        d dVar = this.P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f624e;
    }

    public void x0(Bundle bundle) {
        this.J = true;
    }

    int y() {
        d dVar = this.P;
        if (dVar == null) {
            return 0;
        }
        return dVar.f625f;
    }

    void y0(Bundle bundle) {
        this.f614y.R0();
        this.f595f = 2;
        this.J = false;
        R(bundle);
        if (this.J) {
            this.f614y.w();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final Fragment z() {
        return this.f615z;
    }

    void z0() {
        this.f614y.n(this.f613x, new c(), this);
        this.J = false;
        U(this.f613x.g());
        if (this.J) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }
}
