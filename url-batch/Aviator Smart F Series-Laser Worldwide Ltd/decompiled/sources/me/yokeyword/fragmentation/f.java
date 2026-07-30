package me.yokeyword.fragmentation;

import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import me.yokeyword.fragmentation.a;
import me.yokeyword.fragmentation.anim.FragmentAnimator;
import me.yokeyword.fragmentation.helper.internal.ResultRecord;

/* loaded from: classes5.dex */
public class f {
    private static final long NOT_FOUND_ANIM_TIME = 300;
    static final int STATUS_ROOT_ANIM_DISABLE = 1;
    static final int STATUS_ROOT_ANIM_ENABLE = 2;
    static final int STATUS_UN_ROOT = 0;
    protected FragmentActivity _mActivity;
    me.yokeyword.fragmentation.helper.internal.a mAnimHelper;
    int mContainerId;
    d mEnterAnimListener;
    private Fragment mFragment;
    FragmentAnimator mFragmentAnimator;
    private Handler mHandler;
    private boolean mIsSharedElement;
    boolean mLockAnim;
    Bundle mNewBundle;
    private boolean mReplaceMode;
    private boolean mRootViewClickable;
    private Bundle mSaveInstanceState;
    private me.yokeyword.fragmentation.c mSupport;
    private me.yokeyword.fragmentation.d mSupportF;
    private h mTransactionDelegate;
    me.yokeyword.fragmentation.helper.internal.b mTransactionRecord;
    private me.yokeyword.fragmentation.helper.internal.c mVisibleDelegate;
    private int mRootStatus = 0;
    private int mCustomEnterAnim = Integer.MIN_VALUE;
    private int mCustomExitAnim = Integer.MIN_VALUE;
    private int mCustomPopExitAnim = Integer.MIN_VALUE;
    private boolean mFirstCreateView = true;
    private boolean mIsHidden = true;
    boolean mAnimByActivity = true;
    private Runnable mNotifyEnterAnimEndRunnable = new c();

    class a implements Animation.AnimationListener {
        final /* synthetic */ Animation val$enter;

        /* renamed from: me.yokeyword.fragmentation.f$a$a, reason: collision with other inner class name */
        class RunnableC0372a implements Runnable {
            RunnableC0372a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.mSupport.getSupportDelegate().mFragmentClickable = true;
            }
        }

        a(Animation animation) {
            this.val$enter = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            f.this.mSupport.getSupportDelegate().mFragmentClickable = false;
            f.this.mHandler.postDelayed(new RunnableC0372a(), this.val$enter.getDuration());
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.mEnterAnimListener.onEnterAnimStart();
            f.this.mEnterAnimListener = null;
        }
    }

    class c implements Runnable {

        class a implements Runnable {
            final /* synthetic */ View val$view;

            a(View view) {
                this.val$view = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.val$view.setClickable(false);
            }
        }

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            me.yokeyword.fragmentation.d preFragment;
            if (f.this.mFragment == null) {
                return;
            }
            f.this.mSupportF.onEnterAnimationEnd(f.this.mSaveInstanceState);
            if (f.this.mRootViewClickable || (view = f.this.mFragment.getView()) == null || (preFragment = g.getPreFragment(f.this.mFragment)) == null) {
                return;
            }
            f.this.mHandler.postDelayed(new a(view), preFragment.getSupportDelegate().getPopExitAnimDuration() - f.this.getEnterAnimDuration());
        }
    }

    interface d {
        void onEnterAnimStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(me.yokeyword.fragmentation.d dVar) {
        if (!(dVar instanceof Fragment)) {
            throw new RuntimeException("Must extends Fragment");
        }
        this.mSupportF = dVar;
        this.mFragment = (Fragment) dVar;
    }

    private void compatSharedElements() {
        notifyEnterAnimEnd();
    }

    private void fixAnimationListener(Animation animation) {
        getHandler().postDelayed(this.mNotifyEnterAnimEndRunnable, animation.getDuration());
        this.mSupport.getSupportDelegate().mFragmentClickable = true;
        if (this.mEnterAnimListener != null) {
            getHandler().post(new b());
        }
    }

    private FragmentManager getChildFragmentManager() {
        return this.mFragment.getChildFragmentManager();
    }

    private Animation getEnterAnim() {
        Animation animation;
        int i8 = this.mCustomEnterAnim;
        if (i8 != Integer.MIN_VALUE) {
            try {
                return AnimationUtils.loadAnimation(this._mActivity, i8);
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }
        me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
        if (aVar == null || (animation = aVar.enterAnim) == null) {
            return null;
        }
        return animation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getEnterAnimDuration() {
        Animation enterAnim = getEnterAnim();
        if (enterAnim != null) {
            return enterAnim.getDuration();
        }
        return 300L;
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getPopExitAnimDuration() {
        Animation animation;
        int i8 = this.mCustomPopExitAnim;
        if (i8 != Integer.MIN_VALUE) {
            try {
                return AnimationUtils.loadAnimation(this._mActivity, i8).getDuration();
            } catch (Exception e8) {
                e8.printStackTrace();
                return 300L;
            }
        }
        me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
        if (aVar == null || (animation = aVar.popExitAnim) == null) {
            return 300L;
        }
        return animation.getDuration();
    }

    private me.yokeyword.fragmentation.d getTopFragment() {
        return g.getTopFragment(getChildFragmentManager());
    }

    private int getWindowBackground() {
        TypedArray obtainStyledAttributes = this._mActivity.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void notifyEnterAnimEnd() {
        getHandler().post(this.mNotifyEnterAnimEndRunnable);
        this.mSupport.getSupportDelegate().mFragmentClickable = true;
    }

    @Deprecated
    public void enqueueAction(Runnable runnable) {
        post(runnable);
    }

    public me.yokeyword.fragmentation.a extraTransaction() {
        h hVar = this.mTransactionDelegate;
        if (hVar != null) {
            return new a.b((FragmentActivity) this.mSupport, this.mSupportF, hVar, false);
        }
        throw new RuntimeException(this.mFragment.getClass().getSimpleName() + " not attach!");
    }

    public FragmentActivity getActivity() {
        return this._mActivity;
    }

    @Nullable
    Animation getExitAnim() {
        Animation animation;
        int i8 = this.mCustomExitAnim;
        if (i8 != Integer.MIN_VALUE) {
            try {
                return AnimationUtils.loadAnimation(this._mActivity, i8);
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }
        me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
        if (aVar == null || (animation = aVar.exitAnim) == null) {
            return null;
        }
        return animation;
    }

    public long getExitAnimDuration() {
        Animation animation;
        int i8 = this.mCustomExitAnim;
        if (i8 != Integer.MIN_VALUE) {
            try {
                return AnimationUtils.loadAnimation(this._mActivity, i8).getDuration();
            } catch (Exception e8) {
                e8.printStackTrace();
                return 300L;
            }
        }
        me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
        if (aVar == null || (animation = aVar.exitAnim) == null) {
            return 300L;
        }
        return animation.getDuration();
    }

    public FragmentAnimator getFragmentAnimator() {
        if (this.mSupport == null) {
            throw new RuntimeException("Fragment has not been attached to Activity!");
        }
        if (this.mFragmentAnimator == null) {
            FragmentAnimator onCreateFragmentAnimator = this.mSupportF.onCreateFragmentAnimator();
            this.mFragmentAnimator = onCreateFragmentAnimator;
            if (onCreateFragmentAnimator == null) {
                this.mFragmentAnimator = this.mSupport.getFragmentAnimator();
            }
        }
        return this.mFragmentAnimator;
    }

    public me.yokeyword.fragmentation.helper.internal.c getVisibleDelegate() {
        if (this.mVisibleDelegate == null) {
            this.mVisibleDelegate = new me.yokeyword.fragmentation.helper.internal.c(this.mSupportF);
        }
        return this.mVisibleDelegate;
    }

    public void hideSoftInput() {
        FragmentActivity activity = this.mFragment.getActivity();
        if (activity == null) {
            return;
        }
        g.hideSoftInput(activity.getWindow().getDecorView());
    }

    public final boolean isSupportVisible() {
        return getVisibleDelegate().isSupportVisible();
    }

    public void loadMultipleRootFragment(int i8, int i9, me.yokeyword.fragmentation.d... dVarArr) {
        this.mTransactionDelegate.loadMultipleRootTransaction(getChildFragmentManager(), i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, me.yokeyword.fragmentation.d dVar) {
        loadRootFragment(i8, dVar, true, false);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        getVisibleDelegate().onActivityCreated(bundle);
        View view = this.mFragment.getView();
        if (view != null) {
            this.mRootViewClickable = view.isClickable();
            view.setClickable(true);
            setBackground(view);
        }
        if (bundle != null || this.mRootStatus == 1 || ((this.mFragment.getTag() != null && this.mFragment.getTag().startsWith("android:switcher:")) || (this.mReplaceMode && !this.mFirstCreateView))) {
            notifyEnterAnimEnd();
        } else {
            int i8 = this.mCustomEnterAnim;
            if (i8 != Integer.MIN_VALUE) {
                fixAnimationListener(i8 == 0 ? this.mAnimHelper.getNoneAnim() : AnimationUtils.loadAnimation(this._mActivity, i8));
            }
        }
        if (this.mFirstCreateView) {
            this.mFirstCreateView = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Activity activity) {
        if (!(activity instanceof me.yokeyword.fragmentation.c)) {
            throw new RuntimeException(activity.getClass().getSimpleName() + " must impl ISupportActivity!");
        }
        me.yokeyword.fragmentation.c cVar = (me.yokeyword.fragmentation.c) activity;
        this.mSupport = cVar;
        this._mActivity = (FragmentActivity) activity;
        this.mTransactionDelegate = cVar.getSupportDelegate().getTransactionDelegate();
    }

    public boolean onBackPressedSupport() {
        return false;
    }

    public void onCreate(@Nullable Bundle bundle) {
        getVisibleDelegate().onCreate(bundle);
        Bundle arguments = this.mFragment.getArguments();
        if (arguments != null) {
            this.mRootStatus = arguments.getInt("fragmentation_arg_root_status", 0);
            this.mIsSharedElement = arguments.getBoolean("fragmentation_arg_is_shared_element", false);
            this.mContainerId = arguments.getInt("fragmentation_arg_container");
            this.mReplaceMode = arguments.getBoolean("fragmentation_arg_replace", false);
            this.mCustomEnterAnim = arguments.getInt("fragmentation_arg_custom_enter_anim", Integer.MIN_VALUE);
            this.mCustomExitAnim = arguments.getInt("fragmentation_arg_custom_exit_anim", Integer.MIN_VALUE);
            this.mCustomPopExitAnim = arguments.getInt("fragmentation_arg_custom_pop_exit_anim", Integer.MIN_VALUE);
        }
        if (bundle == null) {
            getFragmentAnimator();
        } else {
            bundle.setClassLoader(getClass().getClassLoader());
            this.mSaveInstanceState = bundle;
            this.mFragmentAnimator = (FragmentAnimator) bundle.getParcelable("fragmentation_state_save_animator");
            this.mIsHidden = bundle.getBoolean("fragmentation_state_save_status");
            this.mContainerId = bundle.getInt("fragmentation_arg_container");
        }
        this.mAnimHelper = new me.yokeyword.fragmentation.helper.internal.a(this._mActivity.getApplicationContext(), this.mFragmentAnimator);
        Animation enterAnim = getEnterAnim();
        if (enterAnim == null) {
            return;
        }
        getEnterAnim().setAnimationListener(new a(enterAnim));
    }

    public Animation onCreateAnimation(int i8, boolean z7, int i9) {
        if (this.mSupport.getSupportDelegate().mPopMultipleNoAnim || this.mLockAnim) {
            return (i8 == 8194 && z7) ? this.mAnimHelper.getNoneAnimFixed() : this.mAnimHelper.getNoneAnim();
        }
        if (i8 == 4097) {
            if (!z7) {
                return this.mAnimHelper.popExitAnim;
            }
            if (this.mRootStatus == 1) {
                return this.mAnimHelper.getNoneAnim();
            }
            Animation animation = this.mAnimHelper.enterAnim;
            fixAnimationListener(animation);
            return animation;
        }
        if (i8 == 8194) {
            me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
            return z7 ? aVar.popEnterAnim : aVar.exitAnim;
        }
        if (this.mIsSharedElement && z7) {
            compatSharedElements();
        }
        if (z7) {
            return null;
        }
        return this.mAnimHelper.compatChildFragmentExitAnim(this.mFragment);
    }

    public FragmentAnimator onCreateFragmentAnimator() {
        return this.mSupport.getFragmentAnimator();
    }

    public void onDestroy() {
        this.mTransactionDelegate.handleResultRecord(this.mFragment);
    }

    public void onDestroyView() {
        this.mSupport.getSupportDelegate().mFragmentClickable = true;
        getVisibleDelegate().onDestroyView();
        getHandler().removeCallbacks(this.mNotifyEnterAnimEndRunnable);
    }

    public void onEnterAnimationEnd(Bundle bundle) {
    }

    public void onFragmentResult(int i8, int i9, Bundle bundle) {
    }

    public void onHiddenChanged(boolean z7) {
        getVisibleDelegate().onHiddenChanged(z7);
    }

    public void onLazyInitView(@Nullable Bundle bundle) {
    }

    public void onNewBundle(Bundle bundle) {
    }

    public void onPause() {
        getVisibleDelegate().onPause();
    }

    public void onResume() {
        getVisibleDelegate().onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        getVisibleDelegate().onSaveInstanceState(bundle);
        bundle.putParcelable("fragmentation_state_save_animator", this.mFragmentAnimator);
        bundle.putBoolean("fragmentation_state_save_status", this.mFragment.isHidden());
        bundle.putInt("fragmentation_arg_container", this.mContainerId);
    }

    public void onSupportInvisible() {
    }

    public void onSupportVisible() {
    }

    public void pop() {
        this.mTransactionDelegate.pop(this.mFragment.getFragmentManager());
    }

    public void popChild() {
        this.mTransactionDelegate.pop(getChildFragmentManager());
    }

    public void popQuiet() {
        this.mTransactionDelegate.popQuiet(this.mFragment.getFragmentManager(), this.mFragment);
    }

    public void popTo(Class<?> cls, boolean z7) {
        popTo(cls, z7, null);
    }

    public void popToChild(Class<?> cls, boolean z7) {
        popToChild(cls, z7, null);
    }

    public void post(Runnable runnable) {
        this.mTransactionDelegate.post(runnable);
    }

    public void putNewBundle(Bundle bundle) {
        this.mNewBundle = bundle;
    }

    public void replaceChildFragment(me.yokeyword.fragmentation.d dVar, boolean z7) {
        this.mTransactionDelegate.dispatchStartTransaction(getChildFragmentManager(), getTopFragment(), dVar, 0, 0, z7 ? 10 : 11);
    }

    public void replaceFragment(me.yokeyword.fragmentation.d dVar, boolean z7) {
        this.mTransactionDelegate.dispatchStartTransaction(this.mFragment.getFragmentManager(), this.mSupportF, dVar, 0, 0, z7 ? 10 : 11);
    }

    public void setBackground(View view) {
        if ((this.mFragment.getTag() == null || !this.mFragment.getTag().startsWith("android:switcher:")) && this.mRootStatus == 0 && view.getBackground() == null) {
            int defaultFragmentBackground = this.mSupport.getSupportDelegate().getDefaultFragmentBackground();
            if (defaultFragmentBackground == 0) {
                view.setBackgroundResource(getWindowBackground());
            } else {
                view.setBackgroundResource(defaultFragmentBackground);
            }
        }
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        this.mFragmentAnimator = fragmentAnimator;
        me.yokeyword.fragmentation.helper.internal.a aVar = this.mAnimHelper;
        if (aVar != null) {
            aVar.notifyChanged(fragmentAnimator);
        }
        this.mAnimByActivity = false;
    }

    public void setFragmentResult(int i8, Bundle bundle) {
        ResultRecord resultRecord;
        Bundle arguments = this.mFragment.getArguments();
        if (arguments == null || !arguments.containsKey("fragment_arg_result_record") || (resultRecord = (ResultRecord) arguments.getParcelable("fragment_arg_result_record")) == null) {
            return;
        }
        resultRecord.resultCode = i8;
        resultRecord.resultBundle = bundle;
    }

    public void setUserVisibleHint(boolean z7) {
        getVisibleDelegate().setUserVisibleHint(z7);
    }

    public void showHideFragment(me.yokeyword.fragmentation.d dVar) {
        showHideFragment(dVar, null);
    }

    public void showSoftInput(View view) {
        g.showSoftInput(view);
    }

    public void start(me.yokeyword.fragmentation.d dVar) {
        start(dVar, 0);
    }

    public void startChild(me.yokeyword.fragmentation.d dVar) {
        startChild(dVar, 0);
    }

    public void startChildForResult(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(getChildFragmentManager(), getTopFragment(), dVar, i8, 0, 1);
    }

    public void startChildWithPop(me.yokeyword.fragmentation.d dVar) {
        this.mTransactionDelegate.startWithPop(getChildFragmentManager(), getTopFragment(), dVar);
    }

    public void startForResult(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(this.mFragment.getFragmentManager(), this.mSupportF, dVar, i8, 0, 1);
    }

    public void startWithPop(me.yokeyword.fragmentation.d dVar) {
        this.mTransactionDelegate.startWithPop(this.mFragment.getFragmentManager(), this.mSupportF, dVar);
    }

    public void startWithPopTo(me.yokeyword.fragmentation.d dVar, Class<?> cls, boolean z7) {
        this.mTransactionDelegate.startWithPopTo(this.mFragment.getFragmentManager(), this.mSupportF, dVar, cls.getName(), z7);
    }

    public void loadRootFragment(int i8, me.yokeyword.fragmentation.d dVar, boolean z7, boolean z8) {
        this.mTransactionDelegate.loadRootTransaction(getChildFragmentManager(), i8, dVar, z7, z8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable) {
        popTo(cls, z7, runnable, Integer.MAX_VALUE);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable) {
        popToChild(cls, z7, runnable, Integer.MAX_VALUE);
    }

    public void showHideFragment(me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        this.mTransactionDelegate.showHideFragment(getChildFragmentManager(), dVar, dVar2);
    }

    public void start(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(this.mFragment.getFragmentManager(), this.mSupportF, dVar, 0, i8, 0);
    }

    public void startChild(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(getChildFragmentManager(), getTopFragment(), dVar, 0, i8, 0);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mTransactionDelegate.popTo(cls.getName(), z7, runnable, this.mFragment.getFragmentManager(), i8);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mTransactionDelegate.popTo(cls.getName(), z7, runnable, getChildFragmentManager(), i8);
    }
}
