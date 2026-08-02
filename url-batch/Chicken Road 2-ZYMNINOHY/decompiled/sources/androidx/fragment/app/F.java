package androidx.fragment.app;

import E.AbstractC0005f;
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
import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.C0237p;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.EnumC0230i;
import androidx.lifecycle.InterfaceC0224c;
import androidx.lifecycle.InterfaceC0235n;
import com.rockchicken.pump.up.road.R;
import e.AbstractC0390a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.flutter.embedding.android.FlutterFragmentActivity;
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
import m1.C1307e;
import m1.C1308f;
import t.AbstractC1425m;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public abstract class F implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0235n, androidx.lifecycle.P, InterfaceC0224c, m1.g {
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
    C mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.M mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    f0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    Q mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C0237p mLifecycleRegistry;
    F mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1308f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    F mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    x0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    f0 mChildFragmentManager = new g0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC0218w(this, 0);
    EnumC0230i mMaxState = EnumC0230i.f5045e;
    androidx.lifecycle.t mViewLifecycleOwnerLiveData = new androidx.lifecycle.t();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<D> mOnPreAttachedListeners = new ArrayList<>();
    private final D mSavedStateAttachListener = new C0219x(this);

    public F() {
        d();
    }

    @Deprecated
    public static F instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final C a() {
        if (this.mAnimationInfo == null) {
            C c4 = new C();
            c4.f4743i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c4.f4744j = obj;
            c4.f4745k = null;
            c4.f4746l = obj;
            c4.f4747m = null;
            c4.n = obj;
            c4.f4749q = 1.0f;
            c4.f4750r = null;
            this.mAnimationInfo = c4;
        }
        return this.mAnimationInfo;
    }

    public final int b() {
        EnumC0230i enumC0230i = this.mMaxState;
        return (enumC0230i == EnumC0230i.f5042b || this.mParentFragment == null) ? enumC0230i.ordinal() : Math.min(enumC0230i.ordinal(), this.mParentFragment.b());
    }

    public final F c(boolean z) {
        String str;
        if (z) {
            Q.c cVar = Q.d.f2120a;
            Q.d.b(new Q.g(this, "Attempting to get target fragment from fragment " + this));
            Q.d.a(this).getClass();
        }
        F f4 = this.mTarget;
        if (f4 != null) {
            return f4;
        }
        f0 f0Var = this.mFragmentManager;
        if (f0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return f0Var.f4849c.b(str);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        f0 f0Var;
        C c4 = this.mAnimationInfo;
        if (c4 != null) {
            c4.f4751s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (f0Var = this.mFragmentManager) == null) {
            return;
        }
        C0211o j4 = C0211o.j(viewGroup, f0Var);
        j4.k();
        if (z) {
            this.mHost.f4774c.post(new RunnableC0212p(1, j4));
        } else {
            j4.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public N createFragmentContainer() {
        return new C0220y(this);
    }

    public final void d() {
        this.mLifecycleRegistry = new C0237p(this);
        this.mSavedStateRegistryController = new C1308f(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        D d4 = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            d4.a();
        } else {
            this.mOnPreAttachedListeners.add(d4);
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
        F c4 = c(false);
        if (c4 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c4);
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
            S.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.v(AbstractC0005f.z(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final C0217v e(AbstractC0390a abstractC0390a, A a3, d.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        B b4 = new B(this, a3, atomicReference, abstractC0390a, bVar);
        if (this.mState >= 0) {
            b4.a();
        } else {
            this.mOnPreAttachedListeners.add(b4);
        }
        return new C0217v(atomicReference);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public F findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f4849c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final K getActivity() {
        Q q4 = this.mHost;
        if (q4 == null) {
            return null;
        }
        return q4.f4772a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C c4 = this.mAnimationInfo;
        if (c4 == null || (bool = c4.f4748p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C c4 = this.mAnimationInfo;
        if (c4 == null || (bool = c4.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        c4.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final f0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        Q q4 = this.mHost;
        if (q4 == null) {
            return null;
        }
        return q4.f4773b;
    }

    @Override // androidx.lifecycle.InterfaceC0224c
    public R.b getDefaultViewModelCreationExtras() {
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
        if (application == null && f0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        R.c cVar = new R.c(0);
        LinkedHashMap linkedHashMap = cVar.f2272a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.K.f5032a, application);
        }
        linkedHashMap.put(androidx.lifecycle.E.f5014a, this);
        linkedHashMap.put(androidx.lifecycle.E.f5015b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.E.f5016c, getArguments());
        }
        return cVar;
    }

    public androidx.lifecycle.M getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
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
            if (application == null && f0.J(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.H(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 0;
        }
        return c4.f4736b;
    }

    public Object getEnterTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        return c4.f4743i;
    }

    public AbstractC1425m getEnterTransitionCallback() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        c4.getClass();
        return null;
    }

    public int getExitAnim() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 0;
        }
        return c4.f4737c;
    }

    public Object getExitTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        return c4.f4745k;
    }

    public AbstractC1425m getExitTransitionCallback() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        c4.getClass();
        return null;
    }

    public View getFocusedView() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        return c4.f4750r;
    }

    @Deprecated
    public final f0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        Q q4 = this.mHost;
        if (q4 == null) {
            return null;
        }
        return ((J) q4).f4759e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0235n
    public AbstractC0231j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public S.a getLoaderManager() {
        return S.a.a(this);
    }

    public int getNextTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 0;
        }
        return c4.f4740f;
    }

    public final F getParentFragment() {
        return this.mParentFragment;
    }

    public final f0 getParentFragmentManager() {
        f0 f0Var = this.mFragmentManager;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return false;
        }
        return c4.f4735a;
    }

    public int getPopEnterAnim() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 0;
        }
        return c4.f4738d;
    }

    public int getPopExitAnim() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 0;
        }
        return c4.f4739e;
    }

    public float getPostOnViewCreatedAlpha() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return 1.0f;
        }
        return c4.f4749q;
    }

    public Object getReenterTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        Object obj = c4.f4746l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        Q.c cVar = Q.d.f2120a;
        Q.d.b(new Q.f(this, "Attempting to get retain instance for fragment " + this));
        Q.d.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        Object obj = c4.f4744j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // m1.g
    public final C1307e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f14495b;
    }

    public Object getSharedElementEnterTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        return c4.f4747m;
    }

    public Object getSharedElementReturnTransition() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return null;
        }
        Object obj = c4.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C c4 = this.mAnimationInfo;
        return (c4 == null || (arrayList = c4.f4741g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C c4 = this.mAnimationInfo;
        return (c4 == null || (arrayList = c4.f4742h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i4) {
        return getResources().getString(i4);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final F getTargetFragment() {
        return c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        Q.c cVar = Q.d.f2120a;
        Q.d.b(new Q.g(this, "Attempting to get target request code from fragment " + this));
        Q.d.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC0235n getViewLifecycleOwner() {
        x0 x0Var = this.mViewLifecycleOwner;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException(AbstractC0005f.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.s getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.P
    public androidx.lifecycle.O getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (b() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.mFragmentManager.f4845N.f4888f;
        androidx.lifecycle.O o = (androidx.lifecycle.O) hashMap.get(this.mWho);
        if (o != null) {
            return o;
        }
        androidx.lifecycle.O o4 = new androidx.lifecycle.O();
        hashMap.put(this.mWho, o4);
        return o4;
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
        this.mChildFragmentManager = new g0();
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
        f0 f0Var = this.mFragmentManager;
        if (f0Var != null) {
            F f4 = this.mParentFragment;
            f0Var.getClass();
            if (f4 == null ? false : f4.isHidden()) {
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
            F f4 = this.mParentFragment;
            if (!(f4 == null ? true : f4.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        C c4 = this.mAnimationInfo;
        if (c4 == null) {
            return false;
        }
        return c4.f4751s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        f0 f0Var = this.mFragmentManager;
        if (f0Var == null) {
            return false;
        }
        return f0Var.f4839G || f0Var.f4840H;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.O();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
        if (f0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        Q q4 = this.mHost;
        FlutterFragmentActivity flutterFragmentActivity = q4 == null ? null : q4.f4772a;
        if (flutterFragmentActivity != null) {
            this.mCalled = false;
            onAttach((Activity) flutterFragmentActivity);
        }
    }

    @Deprecated
    public void onAttachFragment(F f4) {
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
        restoreChildFragmentState();
        f0 f0Var = this.mChildFragmentManager;
        if (f0Var.f4865u >= 1) {
            return;
        }
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(1);
    }

    public Animation onCreateAnimation(int i4, boolean z, int i5) {
        return null;
    }

    public Animator onCreateAnimator(int i4, boolean z, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
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

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        Q q4 = this.mHost;
        FlutterFragmentActivity flutterFragmentActivity = q4 == null ? null : q4.f4772a;
        if (flutterFragmentActivity != null) {
            this.mCalled = false;
            onInflate((Activity) flutterFragmentActivity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
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

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (f0.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(4);
    }

    public void performAttach() {
        ArrayList<D> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            D d4 = arrayList.get(i4);
            i4++;
            d4.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f4773b);
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.o.iterator();
        while (it.hasNext()) {
            ((j0) it.next()).a(this);
        }
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(0);
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
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new C0221z(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(EnumC0229h.ON_CREATE);
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
        return this.mChildFragmentManager.k(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new x0(this, getViewModelStore(), new RunnableC0216u(0, this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f4994d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (f0.J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        View view = this.mView;
        x0 x0Var = this.mViewLifecycleOwner;
        kotlin.jvm.internal.i.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, x0Var);
        View view2 = this.mView;
        x0 x0Var2 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.i.e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, x0Var2);
        View view3 = this.mView;
        x0 x0Var3 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.i.e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, x0Var3);
        this.mViewLifecycleOwnerLiveData.d(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.e(EnumC0229h.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            x0 x0Var = this.mViewLifecycleOwner;
            x0Var.b();
            if (x0Var.f4994d.f5052c.compareTo(EnumC0230i.f5043c) >= 0) {
                this.mViewLifecycleOwner.a(EnumC0229h.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        p.k kVar = S.a.a(this).f2381b.f2379d;
        if (kVar.f14670c <= 0) {
            this.mPerformedCreateView = false;
        } else {
            kVar.f14669b[0].getClass();
            throw new ClassCastException();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        f0 f0Var = this.mChildFragmentManager;
        if (f0Var.f4841I) {
            return;
        }
        f0Var.l();
        this.mChildFragmentManager = new g0();
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
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0229h.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(EnumC0229h.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onPause()"));
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
        return this.mChildFragmentManager.t(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean M4 = f0.M(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != M4) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(M4);
            onPrimaryNavigationFragmentChanged(M4);
            f0 f0Var = this.mChildFragmentManager;
            f0Var.c0();
            f0Var.r(f0Var.f4868y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        C0237p c0237p = this.mLifecycleRegistry;
        EnumC0229h enumC0229h = EnumC0229h.ON_RESUME;
        c0237p.e(enumC0229h);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f4994d.e(enumC0229h);
        }
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        C0237p c0237p = this.mLifecycleRegistry;
        EnumC0229h enumC0229h = EnumC0229h.ON_START;
        c0237p.e(enumC0229h);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f4994d.e(enumC0229h);
        }
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(5);
    }

    public void performStop() {
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4840H = true;
        f0Var.f4845N.f4891i = true;
        f0Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0229h.ON_STOP);
        }
        this.mLifecycleRegistry.e(EnumC0229h.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        a().f4751s = true;
    }

    public final <I, O> d.c registerForActivityResult(AbstractC0390a abstractC0390a, d.b bVar) {
        return e(abstractC0390a, new A(0, this), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i4) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to Activity"));
        }
        f0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4836D == null) {
            parentFragmentManager.v.getClass();
            kotlin.jvm.internal.i.e(permissions, "permissions");
        } else {
            parentFragmentManager.f4837E.addLast(new C0196b0(this.mWho, i4));
            parentFragmentManager.f4836D.a(permissions);
        }
    }

    public final K requireActivity() {
        K activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final f0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to a host."));
    }

    public final F requireParentFragment() {
        F parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.T(bundle);
        f0 f0Var = this.mChildFragmentManager;
        f0Var.f4839G = false;
        f0Var.f4840H = false;
        f0Var.f4845N.f4891i = false;
        f0Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new D0(AbstractC0005f.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC0229h.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        a().f4748p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        a().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i4, int i5, int i6, int i7) {
        if (this.mAnimationInfo == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        a().f4736b = i4;
        a().f4737c = i5;
        a().f4738d = i6;
        a().f4739e = i7;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC1425m abstractC1425m) {
        a().getClass();
    }

    public void setEnterTransition(Object obj) {
        a().f4743i = obj;
    }

    public void setExitSharedElementCallback(AbstractC1425m abstractC1425m) {
        a().getClass();
    }

    public void setExitTransition(Object obj) {
        a().f4745k = obj;
    }

    public void setFocusedView(View view) {
        a().f4750r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((J) this.mHost).f4759e.invalidateMenu();
        }
    }

    public void setInitialSavedState(E e4) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (e4 == null || (bundle = e4.f4753a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((J) this.mHost).f4759e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i4) {
        if (this.mAnimationInfo == null && i4 == 0) {
            return;
        }
        a();
        this.mAnimationInfo.f4740f = i4;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        a().f4735a = z;
    }

    public void setPostOnViewCreatedAlpha(float f4) {
        a().f4749q = f4;
    }

    public void setReenterTransition(Object obj) {
        a().f4746l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        Q.c cVar = Q.d.f2120a;
        Q.d.b(new Q.f(this, "Attempting to set retain instance for fragment " + this));
        Q.d.a(this).getClass();
        this.mRetainInstance = z;
        f0 f0Var = this.mFragmentManager;
        if (f0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            f0Var.f4845N.c(this);
        } else {
            f0Var.f4845N.g(this);
        }
    }

    public void setReturnTransition(Object obj) {
        a().f4744j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        a().f4747m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        a();
        C c4 = this.mAnimationInfo;
        c4.f4741g = arrayList;
        c4.f4742h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        a().n = obj;
    }

    @Deprecated
    public void setTargetFragment(F f4, int i4) {
        if (f4 != null) {
            Q.c cVar = Q.d.f2120a;
            Q.d.b(new Q.g(this, "Attempting to set target fragment " + f4 + " with request code " + i4 + " for fragment " + this));
            Q.d.a(this).getClass();
        }
        f0 f0Var = this.mFragmentManager;
        f0 f0Var2 = f4 != null ? f4.mFragmentManager : null;
        if (f0Var != null && f0Var2 != null && f0Var != f0Var2) {
            throw new IllegalArgumentException(AbstractC0005f.m("Fragment ", f4, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (F f5 = f4; f5 != null; f5 = f5.c(false)) {
            if (f5.equals(this)) {
                throw new IllegalArgumentException("Setting " + f4 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (f4 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || f4.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = f4;
        } else {
            this.mTargetWho = f4.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        Q.c cVar = Q.d.f2120a;
        Q.d.b(new Q.a(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        Q.d.a(this).getClass();
        boolean z4 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            f0 f0Var = this.mFragmentManager;
            m0 g4 = f0Var.g(this);
            F f4 = g4.f4925c;
            if (f4.mDeferStart) {
                if (f0Var.f4848b) {
                    f0Var.f4842J = true;
                } else {
                    f4.mDeferStart = false;
                    g4.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z4 = true;
        }
        this.mDeferStart = z4;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        Q q4 = this.mHost;
        if (q4 == null) {
            return false;
        }
        FlutterFragmentActivity flutterFragmentActivity = ((J) q4).f4759e;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i4 >= 32) {
            return flutterFragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        if (i4 != 31) {
            return flutterFragmentActivity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(flutterFragmentActivity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return flutterFragmentActivity.shouldShowRequestPermissionRationale(str);
        }
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i4, Intent intent2, int i5, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to Activity"));
        }
        if (f0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        f0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4835C == null) {
            Q q4 = parentFragmentManager.v;
            q4.getClass();
            kotlin.jvm.internal.i.e(intent, "intent");
            if (i4 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            FlutterFragmentActivity flutterFragmentActivity = q4.f4772a;
            if (flutterFragmentActivity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            flutterFragmentActivity.startIntentSenderForResult(intent, i4, intent2, i5, i6, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (f0.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.i.e(intent, "intentSender");
        d.j jVar = new d.j(intent, intent2, i5, i6);
        parentFragmentManager.f4837E.addLast(new C0196b0(this.mWho, i4));
        if (f0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f4835C.a(jVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !a().f4751s) {
            return;
        }
        if (this.mHost == null) {
            a().f4751s = false;
        } else if (Looper.myLooper() != this.mHost.f4774c.getLooper()) {
            this.mHost.f4774c.postAtFrontOfQueue(new RunnableC0218w(this, 1));
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

    @Deprecated
    public static F instantiate(Context context, String str, Bundle bundle) {
        try {
            F f4 = (F) Y.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return f4;
            }
            bundle.setClassLoader(f4.getClass().getClassLoader());
            f4.setArguments(bundle);
            return f4;
        } catch (IllegalAccessException e4) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new G1.a(AbstractC1514c.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e7);
        }
    }

    public final String getString(int i4, Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        a().f4751s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        f0 f0Var = this.mFragmentManager;
        if (f0Var != null) {
            this.mPostponedHandler = f0Var.v.f4774c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> d.c registerForActivityResult(AbstractC0390a abstractC0390a, d.h hVar, d.b bVar) {
        return e(abstractC0390a, new A(2, hVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        Q q4 = this.mHost;
        if (q4 == null) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.i.e(intent, "intent");
        q4.f4773b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0005f.m("Fragment ", this, " not attached to Activity"));
        }
        f0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f4834B != null) {
            parentFragmentManager.f4837E.addLast(new C0196b0(this.mWho, i4));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f4834B.a(intent);
            return;
        }
        Q q4 = parentFragmentManager.v;
        q4.getClass();
        kotlin.jvm.internal.i.e(intent, "intent");
        if (i4 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        q4.f4773b.startActivity(intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        Q q4 = this.mHost;
        if (q4 != null) {
            FlutterFragmentActivity flutterFragmentActivity = ((J) q4).f4759e;
            LayoutInflater cloneInContext = flutterFragmentActivity.getLayoutInflater().cloneInContext(flutterFragmentActivity);
            cloneInContext.setFactory2(this.mChildFragmentManager.f4852f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
