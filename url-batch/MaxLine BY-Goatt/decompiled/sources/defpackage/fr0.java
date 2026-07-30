package defpackage;

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
import com.majelw.libystne.R;
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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class fr0 implements ComponentCallbacks, View.OnCreateContextMenuListener, id1, u53, jx0, zd2 {
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
    cr0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    q53 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    as0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    pr0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    kd1 mLifecycleRegistry;
    fr0 mParentFragment;
    boolean mPerformedCreateView;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    xd2 mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    fr0 mTarget;
    int mTargetRequestCode;
    View mView;
    xs0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    as0 mChildFragmentManager = new bs0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new xq0(this, 0);
    zc1 mMaxState = zc1.q;
    cn1 mViewLifecycleOwnerLiveData = new cn1();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<dr0> mOnPreAttachedListeners = new ArrayList<>();
    private final dr0 mSavedStateAttachListener = new yq0(this);

    public fr0() {
        d();
    }

    @Deprecated
    public static fr0 instantiate(Context context, String str, Bundle bundle) {
        try {
            fr0 fr0Var = (fr0) vr0.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fr0Var;
            }
            bundle.setClassLoader(fr0Var.getClass().getClassLoader());
            fr0Var.setArguments(bundle);
            return fr0Var;
        } catch (IllegalAccessException e) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new hx(q40.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final cr0 a() {
        if (this.mAnimationInfo == null) {
            cr0 cr0Var = new cr0();
            cr0Var.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            cr0Var.j = obj;
            cr0Var.k = null;
            cr0Var.l = obj;
            cr0Var.m = null;
            cr0Var.n = obj;
            cr0Var.q = 1.0f;
            cr0Var.r = null;
            this.mAnimationInfo = cr0Var;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        zc1 zc1Var = this.mMaxState;
        return (zc1Var == zc1.n || this.mParentFragment == null) ? zc1Var.ordinal() : Math.min(zc1Var.ordinal(), this.mParentFragment.b());
    }

    public final fr0 c(boolean z) {
        String str;
        if (z) {
            ls0 ls0Var = ms0.a;
            dv0 dv0Var = new dv0(this, "Attempting to get target fragment from fragment " + this);
            ms0.c(dv0Var);
            ls0 a = ms0.a(this);
            if (a.a.contains(ks0.s) && ms0.e(a, getClass(), dv0.class)) {
                ms0.b(a, dv0Var);
            }
        }
        fr0 fr0Var = this.mTarget;
        if (fr0Var != null) {
            return fr0Var;
        }
        as0 as0Var = this.mFragmentManager;
        if (as0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return as0Var.c.i(str);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        as0 as0Var;
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var != null) {
            cr0Var.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (as0Var = this.mFragmentManager) == null) {
            return;
        }
        d90 h = d90.h(viewGroup, as0Var.E());
        h.j();
        if (z) {
            this.mHost.o.post(new r7(6, h));
        } else {
            h.d();
        }
    }

    public mr0 createFragmentContainer() {
        return new zq0(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new kd1(this, true);
        this.mSavedStateRegistryController = new xd2(new yd2(this, new dj(11, this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        dr0 dr0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            dr0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(dr0Var);
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
        fr0 c = c(false);
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
            ff1.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final wq0 e(w3 w3Var, ar0 ar0Var, u3 u3Var) {
        if (this.mState > 1) {
            lh.g(q40.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        br0 br0Var = new br0(this, ar0Var, atomicReference, w3Var, u3Var);
        if (this.mState >= 0) {
            br0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(br0Var);
        }
        return new wq0(atomicReference, w3Var);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public fr0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.j(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final kr0 getActivity() {
        pr0 pr0Var = this.mHost;
        if (pr0Var == null) {
            return null;
        }
        return pr0Var.m;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null || (bool = cr0Var.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null || (bool = cr0Var.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        cr0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final as0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        lh.g(q40.k("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        pr0 pr0Var = this.mHost;
        if (pr0Var == null) {
            return null;
        }
        return pr0Var.n;
    }

    @Override // defpackage.jx0
    public i50 getDefaultViewModelCreationExtras() {
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
        if (application == null && as0.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        wm1 wm1Var = new wm1(0);
        LinkedHashMap linkedHashMap = wm1Var.a;
        if (application != null) {
            linkedHashMap.put(p53.d, application);
        }
        linkedHashMap.put(z71.v, this);
        linkedHashMap.put(z71.w, this);
        if (getArguments() != null) {
            linkedHashMap.put(z71.x, getArguments());
        }
        return wm1Var;
    }

    @Override // defpackage.jx0
    public q53 getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            lh.g("Can't access ViewModels from detached fragment");
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
            if (application == null && as0.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new ae2(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 0;
        }
        return cr0Var.b;
    }

    public Object getEnterTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        return cr0Var.i;
    }

    public ok2 getEnterTransitionCallback() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        cr0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 0;
        }
        return cr0Var.c;
    }

    public Object getExitTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        return cr0Var.k;
    }

    public ok2 getExitTransitionCallback() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        cr0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        return cr0Var.r;
    }

    @Deprecated
    public final as0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        pr0 pr0Var = this.mHost;
        if (pr0Var == null) {
            return null;
        }
        return ((jr0) pr0Var).q;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        pr0 pr0Var = this.mHost;
        if (pr0Var == null) {
            lh.g("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        kr0 kr0Var = ((jr0) pr0Var).q;
        LayoutInflater cloneInContext = kr0Var.getLayoutInflater().cloneInContext(kr0Var);
        cloneInContext.setFactory2(this.mChildFragmentManager.f);
        return cloneInContext;
    }

    @Override // defpackage.id1
    public ad1 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public ff1 getLoaderManager() {
        return ff1.a(this);
    }

    public int getNextTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 0;
        }
        return cr0Var.f;
    }

    public final fr0 getParentFragment() {
        return this.mParentFragment;
    }

    public final as0 getParentFragmentManager() {
        as0 as0Var = this.mFragmentManager;
        if (as0Var != null) {
            return as0Var;
        }
        lh.g(q40.k("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return false;
        }
        return cr0Var.a;
    }

    public int getPopEnterAnim() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 0;
        }
        return cr0Var.d;
    }

    public int getPopExitAnim() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 0;
        }
        return cr0Var.e;
    }

    public float getPostOnViewCreatedAlpha() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return 1.0f;
        }
        return cr0Var.q;
    }

    public Object getReenterTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        Object obj = cr0Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        ls0 ls0Var = ms0.a;
        av0 av0Var = new av0(this, "Attempting to get retain instance for fragment " + this);
        ms0.c(av0Var);
        ls0 a = ms0.a(this);
        if (a.a.contains(ks0.q) && ms0.e(a, getClass(), av0.class)) {
            ms0.b(a, av0Var);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        Object obj = cr0Var.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.zd2
    public final wd2 getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        return cr0Var.m;
    }

    public Object getSharedElementReturnTransition() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return null;
        }
        Object obj = cr0Var.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        cr0 cr0Var = this.mAnimationInfo;
        return (cr0Var == null || (arrayList = cr0Var.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        cr0 cr0Var = this.mAnimationInfo;
        return (cr0Var == null || (arrayList = cr0Var.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final fr0 getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        ls0 ls0Var = ms0.a;
        cv0 cv0Var = new cv0(this, "Attempting to get target request code from fragment " + this);
        ms0.c(cv0Var);
        ls0 a = ms0.a(this);
        if (a.a.contains(ks0.s) && ms0.e(a, getClass(), cv0.class)) {
            ms0.b(a, cv0Var);
        }
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

    public id1 getViewLifecycleOwner() {
        xs0 xs0Var = this.mViewLifecycleOwner;
        if (xs0Var != null) {
            return xs0Var;
        }
        lh.g("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public ef1 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.u53
    public t53 getViewModelStore() {
        if (this.mFragmentManager == null) {
            lh.g("Can't access ViewModels from detached fragment");
            return null;
        }
        int b = b();
        zc1 zc1Var = zc1.m;
        if (b == 1) {
            lh.g("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.mFragmentManager.L.d;
        t53 t53Var = (t53) hashMap.get(this.mWho);
        if (t53Var != null) {
            return t53Var;
        }
        t53 t53Var2 = new t53();
        hashMap.put(this.mWho, t53Var2);
        return t53Var2;
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
        this.mChildFragmentManager = new bs0();
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
        as0 as0Var = this.mFragmentManager;
        if (as0Var != null) {
            fr0 fr0Var = this.mParentFragment;
            as0Var.getClass();
            if (fr0Var == null ? false : fr0Var.isHidden()) {
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
            fr0 fr0Var = this.mParentFragment;
            if (!(fr0Var == null ? true : fr0Var.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        cr0 cr0Var = this.mAnimationInfo;
        if (cr0Var == null) {
            return false;
        }
        return cr0Var.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        as0 as0Var = this.mFragmentManager;
        if (as0Var == null) {
            return false;
        }
        return as0Var.E || as0Var.F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.L();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (as0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        pr0 pr0Var = this.mHost;
        kr0 kr0Var = pr0Var == null ? null : pr0Var.m;
        if (kr0Var != null) {
            this.mCalled = false;
            onAttach((Activity) kr0Var);
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
        as0 as0Var = this.mChildFragmentManager;
        if (as0Var.s >= 1) {
            return;
        }
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(1);
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
        pr0 pr0Var = this.mHost;
        kr0 kr0Var = pr0Var == null ? null : pr0Var.m;
        if (kr0Var != null) {
            this.mCalled = false;
            onInflate((Activity) kr0Var, attributeSet, bundle);
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
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (as0.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
        as0 as0Var = this.mChildFragmentManager;
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(4);
    }

    public void performAttach() {
        ArrayList<dr0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            dr0 dr0Var = arrayList.get(i);
            i++;
            dr0Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.n);
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.m.iterator();
        while (it.hasNext()) {
            ((fs0) it.next()).a(this);
        }
        as0 as0Var = this.mChildFragmentManager;
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(0);
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
        this.mLifecycleRegistry.a(new v72(1, this));
        this.mSavedStateRegistryController.a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(yc1.ON_CREATE);
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
        this.mViewLifecycleOwner = new xs0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        xs0 xs0Var = this.mViewLifecycleOwner;
        if (onCreateView == null) {
            if (xs0Var.p == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                lh.g("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        xs0Var.b();
        ij2.l(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        xs0 xs0Var2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, xs0Var2);
        uj2.d(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.d(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.f(yc1.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            xs0 xs0Var = this.mViewLifecycleOwner;
            xs0Var.b();
            if (xs0Var.p.c.compareTo(zc1.o) >= 0) {
                this.mViewLifecycleOwner.a(yc1.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        yn2 yn2Var = ff1.a(this).b.b;
        if (yn2Var.f() <= 0) {
            this.mPerformedCreateView = false;
        } else {
            yn2Var.g(0).getClass();
            b71.o();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onDetach()"));
        }
        as0 as0Var = this.mChildFragmentManager;
        if (as0Var.G) {
            return;
        }
        as0Var.k();
        this.mChildFragmentManager = new bs0();
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
            this.mViewLifecycleOwner.a(yc1.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(yc1.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onPause()"));
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
        boolean J = as0.J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != J) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(J);
            onPrimaryNavigationFragmentChanged(J);
            as0 as0Var = this.mChildFragmentManager;
            as0Var.a0();
            as0Var.q(as0Var.w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onResume()"));
        }
        kd1 kd1Var = this.mLifecycleRegistry;
        yc1 yc1Var = yc1.ON_RESUME;
        kd1Var.f(yc1Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.p.f(yc1Var);
        }
        as0 as0Var = this.mChildFragmentManager;
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.S());
    }

    public void performStart() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onStart()"));
        }
        kd1 kd1Var = this.mLifecycleRegistry;
        yc1 yc1Var = yc1.ON_START;
        kd1Var.f(yc1Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.p.f(yc1Var);
        }
        as0 as0Var = this.mChildFragmentManager;
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(5);
    }

    public void performStop() {
        as0 as0Var = this.mChildFragmentManager;
        as0Var.F = true;
        as0Var.L.g = true;
        as0Var.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(yc1.ON_STOP);
        }
        this.mLifecycleRegistry.f(yc1.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.t(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        a().s = true;
        as0 as0Var = this.mFragmentManager;
        Handler handler = as0Var != null ? as0Var.t.o : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> b4 registerForActivityResult(w3 w3Var, i4 i4Var, u3 u3Var) {
        return e(w3Var, new ar0(29, i4Var), u3Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            lh.g(q40.k("Fragment ", this, " not attached to Activity"));
            return;
        }
        as0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.B == null) {
            parentFragmentManager.t.getClass();
            return;
        }
        parentFragmentManager.C.addLast(new xr0(this.mWho, i));
        parentFragmentManager.B.b(strArr);
    }

    public final kr0 requireActivity() {
        kr0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        lh.g(q40.k("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        lh.g(q40.k("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        lh.g(q40.k("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final as0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        lh.g(q40.k("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final fr0 requireParentFragment() {
        fr0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            lh.g(q40.k("Fragment ", this, " is not attached to any Fragment or host"));
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
        lh.g(q40.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.R(parcelable);
        as0 as0Var = this.mChildFragmentManager;
        as0Var.E = false;
        as0Var.F = false;
        as0Var.L.g = false;
        as0Var.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            xs0 xs0Var = this.mViewLifecycleOwner;
            xs0Var.q.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new nq2(q40.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(yc1.ON_CREATE);
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
            lh.g("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(ok2 ok2Var) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().i = obj;
    }

    public void setExitSharedElementCallback(ok2 ok2Var) {
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
            ((jr0) this.mHost).q.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(er0 er0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            lh.g("Fragment already added");
            return;
        }
        if (er0Var == null || (bundle = er0Var.m) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((jr0) this.mHost).q.invalidateOptionsMenu();
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
        ls0 ls0Var = ms0.a;
        mj2 mj2Var = new mj2(this, "Attempting to set retain instance for fragment " + this);
        ms0.c(mj2Var);
        ls0 a = ms0.a(this);
        if (a.a.contains(ks0.q) && ms0.e(a, getClass(), mj2.class)) {
            ms0.b(a, mj2Var);
        }
        this.mRetainInstance = z;
        as0 as0Var = this.mFragmentManager;
        if (as0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        es0 es0Var = as0Var.L;
        if (z) {
            es0Var.e(this);
        } else {
            es0Var.h(this);
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
        cr0 cr0Var = this.mAnimationInfo;
        cr0Var.g = arrayList;
        cr0Var.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().n = obj;
    }

    @Deprecated
    public void setTargetFragment(fr0 fr0Var, int i) {
        if (fr0Var != null) {
            ls0 ls0Var = ms0.a;
            oj2 oj2Var = new oj2(this, "Attempting to set target fragment " + fr0Var + " with request code " + i + " for fragment " + this);
            ms0.c(oj2Var);
            ls0 a = ms0.a(this);
            if (a.a.contains(ks0.s) && ms0.e(a, getClass(), oj2.class)) {
                ms0.b(a, oj2Var);
            }
        }
        as0 as0Var = this.mFragmentManager;
        as0 as0Var2 = fr0Var != null ? fr0Var.mFragmentManager : null;
        if (as0Var != null && as0Var2 != null && as0Var != as0Var2) {
            lh.e(q40.k("Fragment ", fr0Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (fr0 fr0Var2 = fr0Var; fr0Var2 != null; fr0Var2 = fr0Var2.c(false)) {
            if (fr0Var2.equals(this)) {
                dm0.k("Setting ", fr0Var, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fr0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fr0Var.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fr0Var;
        } else {
            this.mTargetWho = fr0Var.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        ls0 ls0Var = ms0.a;
        pj2 pj2Var = new pj2(this, "Attempting to set user visible hint to " + z + " for fragment " + this);
        ms0.c(pj2Var);
        ls0 a = ms0.a(this);
        if (a.a.contains(ks0.r) && ms0.e(a, getClass(), pj2.class)) {
            ms0.b(a, pj2Var);
        }
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            as0 as0Var = this.mFragmentManager;
            is0 f = as0Var.f(this);
            fr0 fr0Var = f.c;
            if (fr0Var.mDeferStart) {
                if (as0Var.b) {
                    as0Var.H = true;
                } else {
                    fr0Var.mDeferStart = false;
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
        pr0 pr0Var = this.mHost;
        if (pr0Var == null) {
            return false;
        }
        kr0 kr0Var = ((jr0) pr0Var).q;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return kr0Var.shouldShowRequestPermissionRationale(str);
        }
        if (i != 31) {
            return kr0Var.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(kr0Var.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return kr0Var.shouldShowRequestPermissionRationale(str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        pr0 pr0Var = this.mHost;
        if (pr0Var != null) {
            pr0Var.n.startActivity(intent, bundle);
        } else {
            lh.g(q40.k("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            lh.g(q40.k("Fragment ", this, " not attached to Activity"));
            return;
        }
        as0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.z != null) {
            parentFragmentManager.C.addLast(new xr0(this.mWho, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.z.b(intent);
            return;
        }
        pr0 pr0Var = parentFragmentManager.t;
        if (i == -1) {
            pr0Var.n.startActivity(intent, bundle);
        } else {
            pr0Var.getClass();
            lh.g("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            lh.g(q40.k("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (as0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        as0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A == null) {
            pr0 pr0Var = parentFragmentManager.t;
            if (i == -1) {
                pr0Var.m.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                pr0Var.getClass();
                lh.g("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (as0.G(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        z31 z31Var = new z31(intentSender, intent, i2, i3);
        parentFragmentManager.C.addLast(new xr0(this.mWho, i));
        if (as0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.A.b(z31Var);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().s) {
            return;
        }
        if (this.mHost == null) {
            a().s = false;
        } else if (Looper.myLooper() != this.mHost.o.getLooper()) {
            this.mHost.o.postAtFrontOfQueue(new xq0(this, 1));
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

    public final <I, O> b4 registerForActivityResult(w3 w3Var, u3 u3Var) {
        return e(w3Var, new ar0(0, this), u3Var);
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

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onAttachFragment(fr0 fr0Var) {
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

    public void postponeEnterTransition() {
        a().s = true;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public static fr0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }
}
