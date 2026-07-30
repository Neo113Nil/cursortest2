package me.yokeyword.fragmentation.helper.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentationMagician;
import java.util.List;
import me.yokeyword.fragmentation.d;

/* loaded from: classes5.dex */
public class c {
    private static final String FRAGMENTATION_STATE_SAVE_COMPAT_REPLACE = "fragmentation_compat_replace";
    private static final String FRAGMENTATION_STATE_SAVE_IS_INVISIBLE_WHEN_LEAVE = "fragmentation_invisible_when_leave";
    private Fragment mFragment;
    private Handler mHandler;
    private boolean mInvisibleWhenLeave;
    private boolean mIsSupportVisible;
    private Bundle mSaveInstanceState;
    private d mSupportF;
    private Runnable taskDispatchSupportVisible;
    private boolean mNeedDispatch = true;
    private boolean mIsFirstVisible = true;
    private boolean mFirstCreateViewCompatReplace = true;
    private boolean mAbortInitVisible = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.taskDispatchSupportVisible = null;
            c.this.dispatchSupportVisible(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar) {
        this.mSupportF = dVar;
        this.mFragment = (Fragment) dVar;
    }

    private boolean checkAddState() {
        if (this.mFragment.isAdded()) {
            return false;
        }
        this.mIsSupportVisible = !this.mIsSupportVisible;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void dispatchChild(boolean z7) {
        List<Fragment> activeFragments;
        if (!this.mNeedDispatch) {
            this.mNeedDispatch = true;
            return;
        }
        if (checkAddState() || (activeFragments = FragmentationMagician.getActiveFragments(this.mFragment.getChildFragmentManager())) == null) {
            return;
        }
        for (Fragment fragment : activeFragments) {
            if ((fragment instanceof d) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                ((d) fragment).getSupportDelegate().getVisibleDelegate().dispatchSupportVisible(z7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void dispatchChildOnFragmentShownWhenNotResumed() {
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(this.mFragment.getChildFragmentManager());
        if (activeFragments != null) {
            for (Fragment fragment : activeFragments) {
                if ((fragment instanceof d) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                    ((d) fragment).getSupportDelegate().getVisibleDelegate().onFragmentShownWhenNotResumed();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchSupportVisible(boolean z7) {
        if (z7 && isParentInvisible()) {
            return;
        }
        if (this.mIsSupportVisible == z7) {
            this.mNeedDispatch = true;
            return;
        }
        this.mIsSupportVisible = z7;
        if (!z7) {
            dispatchChild(false);
            this.mSupportF.onSupportInvisible();
        } else {
            if (checkAddState()) {
                return;
            }
            this.mSupportF.onSupportVisible();
            if (this.mIsFirstVisible) {
                this.mIsFirstVisible = false;
                this.mSupportF.onLazyInitView(this.mSaveInstanceState);
            }
            dispatchChild(true);
        }
    }

    private void enqueueDispatchVisible() {
        this.taskDispatchSupportVisible = new a();
        getHandler().post(this.taskDispatchSupportVisible);
    }

    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    private void initVisible() {
        if (this.mInvisibleWhenLeave || this.mFragment.isHidden() || !this.mFragment.getUserVisibleHint()) {
            return;
        }
        if ((this.mFragment.getParentFragment() == null || !isFragmentVisible(this.mFragment.getParentFragment())) && this.mFragment.getParentFragment() != null) {
            return;
        }
        this.mNeedDispatch = false;
        safeDispatchUserVisibleHint(true);
    }

    private boolean isFragmentVisible(Fragment fragment) {
        return !fragment.isHidden() && fragment.getUserVisibleHint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isParentInvisible() {
        Fragment parentFragment = this.mFragment.getParentFragment();
        return parentFragment instanceof d ? !((d) parentFragment).isSupportVisible() : (parentFragment == 0 || parentFragment.isVisible()) ? false : true;
    }

    private void onFragmentShownWhenNotResumed() {
        this.mInvisibleWhenLeave = false;
        dispatchChildOnFragmentShownWhenNotResumed();
    }

    private void safeDispatchUserVisibleHint(boolean z7) {
        if (!this.mIsFirstVisible) {
            dispatchSupportVisible(z7);
        } else if (z7) {
            enqueueDispatchVisible();
        }
    }

    public boolean isSupportVisible() {
        return this.mIsSupportVisible;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (this.mFirstCreateViewCompatReplace || this.mFragment.getTag() == null || !this.mFragment.getTag().startsWith("android:switcher:")) {
            if (this.mFirstCreateViewCompatReplace) {
                this.mFirstCreateViewCompatReplace = false;
            }
            initVisible();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (bundle != null) {
            this.mSaveInstanceState = bundle;
            this.mInvisibleWhenLeave = bundle.getBoolean(FRAGMENTATION_STATE_SAVE_IS_INVISIBLE_WHEN_LEAVE);
            this.mFirstCreateViewCompatReplace = bundle.getBoolean(FRAGMENTATION_STATE_SAVE_COMPAT_REPLACE);
        }
    }

    public void onDestroyView() {
        this.mIsFirstVisible = true;
    }

    public void onHiddenChanged(boolean z7) {
        if (!z7 && !this.mFragment.isResumed()) {
            onFragmentShownWhenNotResumed();
        } else if (z7) {
            safeDispatchUserVisibleHint(false);
        } else {
            enqueueDispatchVisible();
        }
    }

    public void onPause() {
        if (this.taskDispatchSupportVisible != null) {
            getHandler().removeCallbacks(this.taskDispatchSupportVisible);
            this.mAbortInitVisible = true;
        } else {
            if (!this.mIsSupportVisible || !isFragmentVisible(this.mFragment)) {
                this.mInvisibleWhenLeave = true;
                return;
            }
            this.mNeedDispatch = false;
            this.mInvisibleWhenLeave = false;
            dispatchSupportVisible(false);
        }
    }

    public void onResume() {
        if (this.mIsFirstVisible) {
            if (this.mAbortInitVisible) {
                this.mAbortInitVisible = false;
                initVisible();
                return;
            }
            return;
        }
        if (this.mIsSupportVisible || this.mInvisibleWhenLeave || !isFragmentVisible(this.mFragment)) {
            return;
        }
        this.mNeedDispatch = false;
        dispatchSupportVisible(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(FRAGMENTATION_STATE_SAVE_IS_INVISIBLE_WHEN_LEAVE, this.mInvisibleWhenLeave);
        bundle.putBoolean(FRAGMENTATION_STATE_SAVE_COMPAT_REPLACE, this.mFirstCreateViewCompatReplace);
    }

    public void setUserVisibleHint(boolean z7) {
        if (this.mFragment.isResumed() || (!this.mFragment.isAdded() && z7)) {
            boolean z8 = this.mIsSupportVisible;
            if (!z8 && z7) {
                safeDispatchUserVisibleHint(true);
            } else {
                if (!z8 || z7) {
                    return;
                }
                dispatchSupportVisible(false);
            }
        }
    }
}
