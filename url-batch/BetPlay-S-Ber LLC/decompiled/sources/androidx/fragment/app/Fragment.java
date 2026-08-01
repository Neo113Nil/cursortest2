package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.awerser.monnit.betplay.R;
import defpackage.al;
import defpackage.b2;
import defpackage.bl;
import defpackage.cl;
import defpackage.dk;
import defpackage.ek;
import defpackage.ev;
import defpackage.fk;
import defpackage.fv;
import defpackage.g2;
import defpackage.gq;
import defpackage.hk;
import defpackage.hq;
import defpackage.i2;
import defpackage.ik;
import defpackage.iq;
import defpackage.j1;
import defpackage.j8;
import defpackage.kk;
import defpackage.ln;
import defpackage.lq;
import defpackage.mk;
import defpackage.mp;
import defpackage.n7;
import defpackage.nk;
import defpackage.nq;
import defpackage.o30;
import defpackage.o8;
import defpackage.p90;
import defpackage.pr;
import defpackage.q90;
import defpackage.qr;
import defpackage.r3;
import defpackage.r6;
import defpackage.r90;
import defpackage.rm;
import defpackage.rr;
import defpackage.sk;
import defpackage.t30;
import defpackage.tl;
import defpackage.uk;
import defpackage.v10;
import defpackage.vg;
import defpackage.w10;
import defpackage.w40;
import defpackage.x1;
import defpackage.x10;
import defpackage.xk;
import defpackage.xm;
import defpackage.y10;
import defpackage.ym;
import defpackage.z1;
import defpackage.z20;
import defpackage.zd;
import defpackage.zk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, nq, r90, ln, x10 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    fk mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    n mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    p90 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    n mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    nk mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.a mLifecycleRegistry;
    hq mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<hk> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final hk mSavedStateAttachListener;
    w10 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    tl mViewLifecycleOwner;
    fv mViewLifecycleOwnerLiveData;
    String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new xk();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new dk(this, 0);
        this.mMaxState = hq.j;
        this.mViewLifecycleOwnerLiveData = new fv();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new h(this);
        d();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) sk.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e) {
            o8.h(str, ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (InstantiationException e2) {
            o8.h(str, ": make sure class name exists, is public, and has an empty constructor that is public", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            o8.h(str, ": could not find Fragment constructor", e3);
            return null;
        } catch (InvocationTargetException e4) {
            o8.h(str, ": calling Fragment constructor caused an exception", e4);
            return null;
        }
    }

    public final fk a() {
        if (this.mAnimationInfo == null) {
            fk fkVar = new fk();
            fkVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            fkVar.j = obj;
            fkVar.k = null;
            fkVar.l = obj;
            fkVar.m = null;
            fkVar.n = obj;
            fkVar.q = 1.0f;
            fkVar.r = null;
            this.mAnimationInfo = fkVar;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        hq hqVar = this.mMaxState;
        return (hqVar == hq.g || this.mParentFragment == null) ? hqVar.ordinal() : Math.min(hqVar.ordinal(), this.mParentFragment.b());
    }

    public final Fragment c(boolean z) {
        String str;
        if (z) {
            bl blVar = cl.a;
            cl.b(new ym(this, "Attempting to get target fragment from fragment " + this));
            cl.a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.mFragmentManager;
        if (nVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return nVar.c.b(str);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        n nVar;
        fk fkVar = this.mAnimationInfo;
        if (fkVar != null) {
            fkVar.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (nVar = this.mFragmentManager) == null) {
            return;
        }
        f h = f.h(viewGroup, nVar.E());
        h.j();
        if (z) {
            this.mHost.h.post(new n7(6, h));
        } else {
            h.d();
        }
    }

    public mk createFragmentContainer() {
        return new i(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new androidx.lifecycle.a(this);
        this.mSavedStateRegistryController = new w10(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        hk hkVar = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            hkVar.a();
        } else {
            this.mOnPreAttachedListeners.add(hkVar);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment c = c(false);
        if (c != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            r6 r6Var = new r6(getViewModelStore(), qr.e);
            String canonicalName = qr.class.getCanonicalName();
            if (canonicalName == null) {
                o8.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            t30 t30Var = ((qr) r6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), qr.class)).d;
            if (t30Var.h > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (t30Var.h > 0) {
                    if (t30Var.g[0] != null) {
                        o8.c();
                        return;
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(t30Var.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final g2 e(z1 z1Var, rm rmVar, x1 x1Var) {
        if (this.mState > 1) {
            o8.t(o30.f("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        ek ekVar = new ek(this, rmVar, new AtomicReference(), z1Var, x1Var);
        if (this.mState >= 0) {
            ekVar.a();
        } else {
            this.mOnPreAttachedListeners.add(ekVar);
        }
        return new g2();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final k getActivity() {
        nk nkVar = this.mHost;
        if (nkVar == null) {
            return null;
        }
        return nkVar.f;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null || (bool = fkVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null || (bool = fkVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        fkVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final n getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        o8.t(o30.f("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        nk nkVar = this.mHost;
        if (nkVar == null) {
            return null;
        }
        return nkVar.g;
    }

    @Override // defpackage.ln
    public zd getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
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
        if (application == null && n.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ev evVar = new ev(0);
        LinkedHashMap linkedHashMap = evVar.a;
        if (application != null) {
            linkedHashMap.put(vg.n, application);
        }
        linkedHashMap.put(j8.e, this);
        linkedHashMap.put(j8.f, this);
        if (getArguments() != null) {
            linkedHashMap.put(j8.g, getArguments());
        }
        return evVar;
    }

    public p90 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            o8.t("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && n.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new y10(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.b;
    }

    public Object getEnterTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        return fkVar.i;
    }

    public z20 getEnterTransitionCallback() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        fkVar.getClass();
        return null;
    }

    public int getExitAnim() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.c;
    }

    public Object getExitTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        return fkVar.k;
    }

    public z20 getExitTransitionCallback() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        fkVar.getClass();
        return null;
    }

    public View getFocusedView() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        return fkVar.r;
    }

    @Deprecated
    public final n getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        nk nkVar = this.mHost;
        if (nkVar == null) {
            return null;
        }
        return ((kk) nkVar).j;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        nk nkVar = this.mHost;
        if (nkVar == null) {
            o8.t("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        r3 r3Var = ((kk) nkVar).j;
        LayoutInflater cloneInContext = r3Var.getLayoutInflater().cloneInContext(r3Var);
        cloneInContext.setFactory2(this.mChildFragmentManager.f);
        return cloneInContext;
    }

    @Override // defpackage.nq
    public iq getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public pr getLoaderManager() {
        return new rr(this, getViewModelStore());
    }

    public int getNextTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final n getParentFragmentManager() {
        n nVar = this.mFragmentManager;
        if (nVar != null) {
            return nVar;
        }
        o8.t(o30.f("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return false;
        }
        return fkVar.a;
    }

    public int getPopEnterAnim() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.d;
    }

    public int getPopExitAnim() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return 1.0f;
        }
        return fkVar.q;
    }

    public Object getReenterTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        Object obj = fkVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        bl blVar = cl.a;
        cl.b(new xm(this, "Attempting to get retain instance for fragment " + this));
        cl.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        Object obj = fkVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.x10
    public final v10 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        return fkVar.m;
    }

    public Object getSharedElementReturnTransition() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return null;
        }
        Object obj = fkVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        fk fkVar = this.mAnimationInfo;
        return (fkVar == null || (arrayList = fkVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        fk fkVar = this.mAnimationInfo;
        return (fkVar == null || (arrayList = fkVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        bl blVar = cl.a;
        cl.b(new ym(this, "Attempting to get target request code from fragment " + this));
        cl.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public nq getViewLifecycleOwner() {
        tl tlVar = this.mViewLifecycleOwner;
        if (tlVar != null) {
            return tlVar;
        }
        o8.t("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public androidx.lifecycle.b getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.r90
    public q90 getViewModelStore() {
        if (this.mFragmentManager == null) {
            o8.t("Can't access ViewModels from detached fragment");
            return null;
        }
        if (b() == 1) {
            o8.t("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.mFragmentManager.L.f;
        q90 q90Var = (q90) hashMap.get(this.mWho);
        if (q90Var != null) {
            return q90Var;
        }
        q90 q90Var2 = new q90();
        hashMap.put(this.mWho, q90Var2);
        return q90Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        d();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new xk();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        n nVar = this.mFragmentManager;
        if (nVar != null) {
            Fragment fragment = this.mParentFragment;
            nVar.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        fk fkVar = this.mAnimationInfo;
        if (fkVar == null) {
            return false;
        }
        return fkVar.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= RESUMED;
    }

    public final boolean isStateSaved() {
        n nVar = this.mFragmentManager;
        if (nVar == null) {
            return false;
        }
        return nVar.E || nVar.F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.L();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (n.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        nk nkVar = this.mHost;
        r3 r3Var = nkVar == null ? null : nkVar.f;
        if (r3Var != null) {
            this.mCalled = false;
            onAttach((Activity) r3Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        n nVar = this.mChildFragmentManager;
        if (nVar.s >= 1) {
            return;
        }
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        nk nkVar = this.mHost;
        r3 r3Var = nkVar == null ? null : nkVar.f;
        if (r3Var != null) {
            this.mCalled = false;
            onInflate((Activity) r3Var, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (n.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
        n nVar = this.mChildFragmentManager;
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(4);
    }

    public void performAttach() {
        ArrayList<hk> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            hk hkVar = arrayList.get(i);
            i++;
            hkVar.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.g);
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.m.iterator();
        while (it.hasNext()) {
            ((zk) it.next()).b(this);
        }
        n nVar = this.mChildFragmentManager;
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new lq() { // from class: androidx.fragment.app.Fragment.6
            @Override // defpackage.lq
            public final void b(nq nqVar, gq gqVar) {
                View view;
                if (gqVar != gq.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(gq.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new tl(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        tl tlVar = this.mViewLifecycleOwner;
        if (onCreateView == null) {
            if (tlVar.h == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                o8.t("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        tlVar.b();
        View view = this.mView;
        tl tlVar2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, tlVar2);
        View view2 = this.mView;
        tl tlVar3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, tlVar3);
        View view3 = this.mView;
        tl tlVar4 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, tlVar4);
        this.mViewLifecycleOwnerLiveData.e(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(gq.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            tl tlVar = this.mViewLifecycleOwner;
            tlVar.b();
            if (tlVar.h.c.compareTo(hq.h) >= 0) {
                this.mViewLifecycleOwner.a(gq.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        r6 r6Var = new r6(getViewModelStore(), qr.e);
        String canonicalName = qr.class.getCanonicalName();
        if (canonicalName == null) {
            o8.j("Local and anonymous classes can not be ViewModels");
            return;
        }
        t30 t30Var = ((qr) r6Var.g("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), qr.class)).d;
        if (t30Var.h <= 0) {
            this.mPerformedCreateView = false;
        } else {
            t30Var.g[0].getClass();
            o8.c();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onDetach()"));
        }
        n nVar = this.mChildFragmentManager;
        if (nVar.G) {
            return;
        }
        nVar.k();
        this.mChildFragmentManager = new xk();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(gq.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(gq.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.s(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean J = n.J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != J) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(J);
            onPrimaryNavigationFragmentChanged(J);
            n nVar = this.mChildFragmentManager;
            nVar.a0();
            nVar.q(nVar.w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = RESUMED;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.a aVar = this.mLifecycleRegistry;
        gq gqVar = gq.ON_RESUME;
        aVar.e(gqVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.h.e(gqVar);
        }
        n nVar = this.mChildFragmentManager;
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(RESUMED);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.S());
    }

    public void performStart() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.a aVar = this.mLifecycleRegistry;
        gq gqVar = gq.ON_START;
        aVar.e(gqVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.h.e(gqVar);
        }
        n nVar = this.mChildFragmentManager;
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(5);
    }

    public void performStop() {
        n nVar = this.mChildFragmentManager;
        nVar.F = true;
        nVar.L.i = true;
        nVar.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(gq.ON_STOP);
        }
        this.mLifecycleRegistry.e(gq.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.t(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        a().s = true;
        n nVar = this.mFragmentManager;
        Handler handler = nVar != null ? nVar.t.h : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> b2 registerForActivityResult(z1 z1Var, i2 i2Var, x1 x1Var) {
        return e(z1Var, new j1(18, i2Var), x1Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            o8.t(o30.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        n parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.B == null) {
            parentFragmentManager.t.getClass();
            return;
        }
        parentFragmentManager.C.addLast(new uk(this.mWho, i));
        parentFragmentManager.B.a(strArr);
    }

    public final k requireActivity() {
        k activity = getActivity();
        if (activity != null) {
            return activity;
        }
        o8.t(o30.f("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        o8.t(o30.f("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        o8.t(o30.f("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final n requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        o8.t(o30.f("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            o8.t(o30.f("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        o8.t(o30.f("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.R(parcelable);
        n nVar = this.mChildFragmentManager;
        nVar.E = false;
        nVar.F = false;
        nVar.L.i = false;
        nVar.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            tl tlVar = this.mViewLifecycleOwner;
            tlVar.i.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new w40(o30.f("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(gq.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        a().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        a().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        a().b = i;
        a().c = i2;
        a().d = i3;
        a().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            o8.t("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(z20 z20Var) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().i = obj;
    }

    public void setExitSharedElementCallback(z20 z20Var) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().k = obj;
    }

    public void setFocusedView(View view) {
        a().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((kk) this.mHost).j.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(ik ikVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            o8.t("Fragment already added");
            return;
        }
        if (ikVar == null || (bundle = ikVar.f) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((kk) this.mHost).j.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        a().q = f;
    }

    public void setReenterTransition(Object obj) {
        a().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        bl blVar = cl.a;
        cl.b(new xm(this, "Attempting to set retain instance for fragment " + this));
        cl.a(this).getClass();
        this.mRetainInstance = z;
        n nVar = this.mFragmentManager;
        if (nVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        o oVar = nVar.L;
        if (z) {
            oVar.c(this);
        } else {
            oVar.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        a().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        fk fkVar = this.mAnimationInfo;
        fkVar.g = arrayList;
        fkVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            bl blVar = cl.a;
            cl.b(new ym(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this));
            cl.a(this).getClass();
        }
        n nVar = this.mFragmentManager;
        n nVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (nVar != null && nVar2 != null && nVar != nVar2) {
            o8.j(o30.f("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.c(false)) {
            if (fragment2.equals(this)) {
                o8.o("Setting ", fragment, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        bl blVar = cl.a;
        cl.b(new al(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        cl.a(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            n nVar = this.mFragmentManager;
            q f = nVar.f(this);
            Fragment fragment = f.c;
            if (fragment.mDeferStart) {
                if (nVar.b) {
                    nVar.H = true;
                } else {
                    fragment.mDeferStart = false;
                    f.j();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        nk nkVar = this.mHost;
        if (nkVar == null) {
            return false;
        }
        r3 r3Var = ((kk) nkVar).j;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return r3Var.shouldShowRequestPermissionRationale(str);
        }
        if (i != 31) {
            return r3Var.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(r3Var.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return r3Var.shouldShowRequestPermissionRationale(str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        nk nkVar = this.mHost;
        if (nkVar != null) {
            nkVar.g.startActivity(intent, bundle);
        } else {
            o8.t(o30.f("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            o8.t(o30.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        n parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.z != null) {
            parentFragmentManager.C.addLast(new uk(this.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.z.a(intent);
            return;
        }
        nk nkVar = parentFragmentManager.t;
        if (i == -1) {
            nkVar.g.startActivity(intent, bundle);
        } else {
            nkVar.getClass();
            o8.t("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            o8.t(o30.f("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (n.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        n parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A == null) {
            nk nkVar = parentFragmentManager.t;
            if (i == -1) {
                nkVar.f.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                nkVar.getClass();
                o8.t("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (n.G(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        mp mpVar = new mp(intentSender, intent, i2, i3);
        parentFragmentManager.C.addLast(new uk(this.mWho, i));
        if (n.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.A.a(mpVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().s) {
            return;
        }
        if (this.mHost == null) {
            a().s = false;
        } else if (Looper.myLooper() != this.mHost.h.getLooper()) {
            this.mHost.h.postAtFrontOfQueue(new dk(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final <I, O> b2 registerForActivityResult(z1 z1Var, x1 x1Var) {
        return e(z1Var, new j(this), x1Var);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void postponeEnterTransition() {
        a().s = true;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }
}
