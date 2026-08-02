package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bd implements ComponentCallbacks, View.OnCreateContextMenuListener, aer, agl, aeh, ame {
    static final Object g = new Object();
    public boolean A;
    public int B;
    public by C;
    public bl D;
    public bd F;
    public int G;
    public int H;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    boolean M;
    boolean N;
    public boolean P;
    public ViewGroup Q;
    public View R;
    public boolean S;
    public az U;
    public boolean V;
    public LayoutInflater W;
    public boolean X;
    public String Y;
    public ci ab;
    agh ad;
    public ael ag;
    public brr ai;
    public Bundle i;
    public SparseArray j;
    public Bundle k;
    public Boolean l;
    public Bundle n;
    public bd o;
    public int q;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int h = -1;
    public String m = UUID.randomUUID().toString();
    public String p = null;
    public Boolean r = null;
    public by E = new by();
    boolean O = true;
    public boolean T = true;
    public aek Z = aek.e;
    public final ny aa = new ny();
    public final afc ac = new afc();
    public final e ah = new e();
    public final AtomicInteger ae = new AtomicInteger();
    public final ArrayList af = new ArrayList();
    private final bb a = new aw(this);
    private final bb b = new ax(this);

    public bd() {
        d();
    }

    @Deprecated
    public static bd au(Context context, String str) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = bk.a;
            try {
                return (bd) bk.a(classLoader, str).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                throw new ba("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new ba("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new ba(a.Z(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new ba(a.Z(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new ba(a.Z(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new ba(a.Z(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private final int bn() {
        aek aekVar = this.Z;
        return (aekVar == aek.b || this.F == null) ? aekVar.ordinal() : Math.min(aekVar.ordinal(), this.F.bn());
    }

    private final void d() {
        this.ag = new ael(this);
        this.ai = yi.j(this);
        this.ad = null;
        ArrayList arrayList = this.af;
        bb bbVar = this.a;
        if (!arrayList.contains(bbVar)) {
            n(bbVar);
        }
        bb bbVar2 = this.b;
        if (arrayList.contains(bbVar2)) {
            return;
        }
        n(bbVar2);
    }

    private final void n(bb bbVar) {
        if (this.h >= 0) {
            bbVar.a();
        } else {
            this.af.add(bbVar);
        }
    }

    public final Bundle A() {
        Bundle bundle = this.n;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " does not have any arguments."));
    }

    public final az B() {
        az azVar = this.U;
        if (azVar != null) {
            return azVar;
        }
        az azVar2 = new az();
        this.U = azVar2;
        return azVar2;
    }

    public final bg D() {
        bl blVar = this.D;
        if (blVar == null) {
            return null;
        }
        return (bg) blVar.b;
    }

    public final bg E() {
        bg D = D();
        if (D != null) {
            return D;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " not attached to an activity."));
    }

    public final by F() {
        if (this.D != null) {
            return this.E;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " has not been attached yet."));
    }

    public final by G() {
        by byVar = this.C;
        if (byVar != null) {
            return byVar;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater H(Bundle bundle) {
        LayoutInflater bv = bv(bundle);
        this.W = bv;
        return bv;
    }

    public View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final View J() {
        View view = this.R;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final oc K(ok okVar, ob obVar) {
        kee keeVar = new kee(this);
        if (this.h > 1) {
            throw new IllegalStateException(a.ab(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        n(new au(this, keeVar, atomicReference, okVar, obVar));
        return new av(atomicReference);
    }

    @Override // defpackage.aer
    public ael L() {
        return this.ag;
    }

    public final aer M() {
        ci ciVar = this.ab;
        if (ciVar != null) {
            return ciVar;
        }
        throw new IllegalStateException(a.ab(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @Override // defpackage.aeh
    public agh N() {
        Application application;
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.ad == null) {
            Context applicationContext = y().getApplicationContext();
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
            if (application == null && by.U(3)) {
                Objects.toString(y().getApplicationContext());
            }
            this.ad = new aga(application, this, this.n);
        }
        return this.ad;
    }

    @Override // defpackage.agl
    public final agk O() {
        if (this.C == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (bn() == aek.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.C.v.d;
        agk agkVar = (agk) hashMap.get(this.m);
        if (agkVar != null) {
            return agkVar;
        }
        agk agkVar2 = new agk();
        hashMap.put(this.m, agkVar2);
        return agkVar2;
    }

    @Override // defpackage.aeh
    public ago P() {
        Application application;
        Context applicationContext = y().getApplicationContext();
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
        if (application == null && by.U(3)) {
            Objects.toString(y().getApplicationContext());
        }
        agp agpVar = new agp();
        if (application != null) {
            agpVar.b(agg.b, application);
        }
        agpVar.b(afx.a, this);
        agpVar.b(afx.b, this);
        Bundle bundle = this.n;
        if (bundle != null) {
            agpVar.b(afx.c, bundle);
        }
        return agpVar;
    }

    public final Object Q() {
        bl blVar = this.D;
        if (blVar == null) {
            return null;
        }
        return ((bf) blVar).a;
    }

    public final String R(int i) {
        return bs().getString(i);
    }

    public final String S(int i, Object... objArr) {
        return bs().getString(i, objArr);
    }

    public void T(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.H));
        printWriter.print(" mTag=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.h);
        printWriter.print(" mWho=");
        printWriter.print(this.m);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.s);
        printWriter.print(" mRemoving=");
        printWriter.print(this.t);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.w);
        printWriter.print(" mInLayout=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.J);
        printWriter.print(" mDetached=");
        printWriter.print(this.K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.L);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.T);
        if (this.C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.C);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.D);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.F);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.n);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.j);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.k);
        }
        bd bt = bt(false);
        if (bt != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bt);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(an());
        if (t() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(t());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(u());
        }
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(v());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(w());
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.R);
        }
        if (x() != null) {
            agt.a(this).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.E + ":");
        this.E.D(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final void U() {
        d();
        this.Y = this.m;
        this.m = UUID.randomUUID().toString();
        this.s = false;
        this.t = false;
        this.w = false;
        this.x = false;
        this.z = false;
        this.B = 0;
        this.C = null;
        this.E = new by();
        this.D = null;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.J = false;
        this.K = false;
    }

    @Deprecated
    public void V(Bundle bundle) {
        this.P = true;
    }

    @Deprecated
    public void W(int i, int i2, Intent intent) {
        if (by.U(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void X(Activity activity) {
        this.P = true;
    }

    public void Z() {
        this.P = true;
    }

    public boolean aC() {
        return false;
    }

    @Override // defpackage.ame
    public final boe aE() {
        return (boe) this.ai.a;
    }

    public void aa() {
        this.P = true;
    }

    public void ac() {
        this.P = true;
    }

    public final void ae() {
        Bundle bundle = this.i;
        e.c(new at(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 4));
        this.E.B(2);
    }

    public final void af() {
        Bundle bundle;
        Bundle bundle2 = this.i;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.E.K(bundle);
        this.E.q();
    }

    public final void ag(int i, int i2, int i3, int i4) {
        if (this.U == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        B().b = i;
        B().c = i2;
        B().d = i3;
        B().e = i4;
    }

    public void ah(Bundle bundle) {
        if (this.C != null && ar()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.n = bundle;
    }

    public final void ai(View view) {
        B().m = view;
    }

    public final void aj(boolean z) {
        if (this.O != z) {
            this.O = z;
            if (this.N && ao() && !ap()) {
                this.D.d();
            }
        }
    }

    final void ak(int i) {
        if (this.U == null && i == 0) {
            return;
        }
        B();
        this.U.f = i;
    }

    final void al(boolean z) {
        if (this.U == null) {
            return;
        }
        B().a = z;
    }

    final void am(ArrayList arrayList, ArrayList arrayList2) {
        B();
        az azVar = this.U;
        azVar.g = arrayList;
        azVar.h = arrayList2;
    }

    final boolean an() {
        az azVar = this.U;
        if (azVar == null) {
            return false;
        }
        return azVar.a;
    }

    public final boolean ao() {
        return this.D != null && this.s;
    }

    public final boolean ap() {
        bd bdVar;
        if (this.J) {
            return true;
        }
        return (this.C == null || (bdVar = this.F) == null || !bdVar.ap()) ? false : true;
    }

    public final boolean aq() {
        return this.B > 0;
    }

    public final boolean ar() {
        by byVar = this.C;
        if (byVar == null) {
            return false;
        }
        return byVar.X();
    }

    @Deprecated
    public boolean as(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final LayoutInflater at() {
        bl blVar = this.D;
        if (blVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        bg bgVar = ((bf) blVar).a;
        LayoutInflater cloneInContext = bgVar.getLayoutInflater().cloneInContext(bgVar);
        cloneInContext.setFactory2(this.E.d);
        return cloneInContext;
    }

    public final void av() {
        this.P = true;
    }

    @Deprecated
    public final void aw() {
        if (!this.N) {
            this.N = true;
            if (!ao() || ap()) {
                return;
            }
            this.D.d();
        }
    }

    @Deprecated
    public final void ax(bd bdVar) {
        int i = ado.a;
        adr adrVar = new adr(this, bdVar);
        ado.d(adrVar);
        adn b = ado.b(this);
        if (b.b.contains(adm.h) && ado.e(b, getClass(), adrVar.getClass())) {
            ado.c(b, adrVar);
        }
        by byVar = this.C;
        by byVar2 = bdVar.C;
        if (byVar != null && byVar2 != null && byVar != byVar2) {
            throw new IllegalArgumentException(a.ab(bdVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (bd bdVar2 = bdVar; bdVar2 != null; bdVar2 = bdVar2.bt(false)) {
            if (bdVar2.equals(this)) {
                throw new IllegalArgumentException(a.ac(this, bdVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (this.C == null || bdVar.C == null) {
            this.p = null;
            this.o = bdVar;
        } else {
            this.p = bdVar.m;
            this.o = null;
        }
        this.q = 0;
    }

    public void ay(Intent intent) {
        bl blVar = this.D;
        if (blVar == null) {
            throw new IllegalStateException(a.ab(this, "Fragment ", " not attached to Activity"));
        }
        blVar.g(intent, -1);
    }

    @Deprecated
    public final void az(Intent intent, int i) {
        if (this.D == null) {
            throw new IllegalStateException(a.ab(this, "Fragment ", " not attached to Activity"));
        }
        by G = G();
        if (G.p == null) {
            G.l.g(intent, i);
            return;
        }
        G.q.addLast(new bu(this.m, i));
        G.p.b(intent);
    }

    public final Resources bs() {
        return y().getResources();
    }

    public final bd bt(boolean z) {
        String str;
        if (z) {
            int i = ado.a;
            adq adqVar = new adq(this);
            ado.d(adqVar);
            adn b = ado.b(this);
            if (b.b.contains(adm.h) && ado.e(b, getClass(), adqVar.getClass())) {
                ado.c(b, adqVar);
            }
        }
        bd bdVar = this.o;
        if (bdVar != null) {
            return bdVar;
        }
        by byVar = this.C;
        if (byVar == null || (str = this.p) == null) {
            return null;
        }
        return byVar.b(str);
    }

    public bi bu() {
        return new ay(this);
    }

    public LayoutInflater bv(Bundle bundle) {
        return at();
    }

    public void e(Context context) {
        this.P = true;
        bl blVar = this.D;
        Activity activity = blVar == null ? null : blVar.b;
        if (activity != null) {
            this.P = false;
            X(activity);
        }
    }

    public void f(Bundle bundle) {
        this.P = true;
        af();
        by byVar = this.E;
        if (byVar.k > 0) {
            return;
        }
        byVar.q();
    }

    public void g() {
        this.P = true;
    }

    public void h() {
        this.P = true;
    }

    public void j() {
        this.P = true;
    }

    public void k() {
        this.P = true;
    }

    public void l(Bundle bundle) {
        this.P = true;
    }

    public void m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.E.noteStateNotSaved();
        this.A = true;
        this.ab = new ci(this, O(), new as(this, 7));
        e.c(new fv(this, layoutInflater, viewGroup, bundle, 1));
        View view = this.R;
        ci ciVar = this.ab;
        if (view == null) {
            if (ciVar.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.ab = null;
            return;
        }
        ciVar.b();
        if (by.U(3)) {
            Objects.toString(this.R);
            toString();
        }
        yl.d(this.R, this.ab);
        ym.j(this.R, this.ab);
        yi.i(this.R, this.ab);
        this.ac.i(this.ab);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.P = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.P = true;
    }

    final float s() {
        az azVar = this.U;
        if (azVar == null) {
            return 1.0f;
        }
        return azVar.l;
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        az(intent, i);
    }

    public final int t() {
        az azVar = this.U;
        if (azVar == null) {
            return 0;
        }
        return azVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.m);
        if (this.G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.G));
        }
        if (this.I != null) {
            sb.append(" tag=");
            sb.append(this.I);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int u() {
        az azVar = this.U;
        if (azVar == null) {
            return 0;
        }
        return azVar.c;
    }

    public final int v() {
        az azVar = this.U;
        if (azVar == null) {
            return 0;
        }
        return azVar.d;
    }

    public final int w() {
        az azVar = this.U;
        if (azVar == null) {
            return 0;
        }
        return azVar.e;
    }

    public Context x() {
        bl blVar = this.D;
        if (blVar == null) {
            return null;
        }
        return blVar.c;
    }

    public final Context y() {
        Context x = x();
        if (x != null) {
            return x;
        }
        throw new IllegalStateException(a.ab(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public void aD() {
    }

    @Deprecated
    public void ab(Menu menu) {
    }

    public void i(Bundle bundle) {
    }

    @Deprecated
    public void Y(Menu menu, MenuInflater menuInflater) {
    }

    public void aA(int i, int i2) {
    }

    public void aB(int i, int i2) {
    }

    public void ad(View view, Bundle bundle) {
    }
}
