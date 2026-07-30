package me.yokeyword.fragmentation;

import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentationMagician;
import me.yokeyword.fragmentation.a;
import me.yokeyword.fragmentation.anim.DefaultVerticalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public class e {
    private FragmentActivity mActivity;
    private me.yokeyword.fragmentation.debug.b mDebugStackDelegate;
    private FragmentAnimator mFragmentAnimator;
    private c mSupport;
    private h mTransactionDelegate;
    boolean mPopMultipleNoAnim = false;
    boolean mFragmentClickable = true;
    private int mDefaultFragmentBackground = 0;

    class a extends me.yokeyword.fragmentation.queue.a {
        a(int i8) {
            super(i8);
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            e eVar = e.this;
            if (!eVar.mFragmentClickable) {
                eVar.mFragmentClickable = true;
            }
            if (e.this.mTransactionDelegate.dispatchBackPressedEvent(g.getActiveFragment(eVar.getSupportFragmentManager()))) {
                return;
            }
            e.this.mSupport.onBackPressedSupport();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(c cVar) {
        if (!(cVar instanceof FragmentActivity)) {
            throw new RuntimeException("Must extends FragmentActivity/AppCompatActivity");
        }
        this.mSupport = cVar;
        FragmentActivity fragmentActivity = (FragmentActivity) cVar;
        this.mActivity = fragmentActivity;
        this.mDebugStackDelegate = new me.yokeyword.fragmentation.debug.b(fragmentActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FragmentManager getSupportFragmentManager() {
        return this.mActivity.getSupportFragmentManager();
    }

    private d getTopFragment() {
        return g.getTopFragment(getSupportFragmentManager());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return !this.mFragmentClickable;
    }

    public me.yokeyword.fragmentation.a extraTransaction() {
        return new a.b((FragmentActivity) this.mSupport, getTopFragment(), getTransactionDelegate(), true);
    }

    public int getDefaultFragmentBackground() {
        return this.mDefaultFragmentBackground;
    }

    public FragmentAnimator getFragmentAnimator() {
        return this.mFragmentAnimator.copy();
    }

    public h getTransactionDelegate() {
        if (this.mTransactionDelegate == null) {
            this.mTransactionDelegate = new h(this.mSupport);
        }
        return this.mTransactionDelegate;
    }

    public void loadMultipleRootFragment(int i8, int i9, d... dVarArr) {
        this.mTransactionDelegate.loadMultipleRootTransaction(getSupportFragmentManager(), i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, d dVar) {
        loadRootFragment(i8, dVar, true, false);
    }

    public void logFragmentStackHierarchy(String str) {
        this.mDebugStackDelegate.logFragmentRecords(str);
    }

    public void onBackPressed() {
        this.mTransactionDelegate.mActionQueue.enqueue(new a(3));
    }

    public void onBackPressedSupport() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            ActivityCompat.finishAfterTransition(this.mActivity);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mTransactionDelegate = getTransactionDelegate();
        this.mFragmentAnimator = this.mSupport.onCreateFragmentAnimator();
        this.mDebugStackDelegate.onCreate(b.getDefault().getMode());
    }

    public FragmentAnimator onCreateFragmentAnimator() {
        return new DefaultVerticalAnimator();
    }

    public void onDestroy() {
        this.mDebugStackDelegate.onDestroy();
    }

    public void onPostCreate(@Nullable Bundle bundle) {
        this.mDebugStackDelegate.onPostCreate(b.getDefault().getMode());
    }

    public void pop() {
        this.mTransactionDelegate.pop(getSupportFragmentManager());
    }

    public void popTo(Class<?> cls, boolean z7) {
        popTo(cls, z7, null);
    }

    public void post(Runnable runnable) {
        this.mTransactionDelegate.post(runnable);
    }

    public void replaceFragment(d dVar, boolean z7) {
        this.mTransactionDelegate.dispatchStartTransaction(getSupportFragmentManager(), getTopFragment(), dVar, 0, 0, z7 ? 10 : 11);
    }

    public void setDefaultFragmentBackground(@DrawableRes int i8) {
        this.mDefaultFragmentBackground = i8;
    }

    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        this.mFragmentAnimator = fragmentAnimator;
        for (ActivityResultCaller activityResultCaller : FragmentationMagician.getActiveFragments(getSupportFragmentManager())) {
            if (activityResultCaller instanceof d) {
                f supportDelegate = ((d) activityResultCaller).getSupportDelegate();
                if (supportDelegate.mAnimByActivity) {
                    FragmentAnimator copy = fragmentAnimator.copy();
                    supportDelegate.mFragmentAnimator = copy;
                    me.yokeyword.fragmentation.helper.internal.a aVar = supportDelegate.mAnimHelper;
                    if (aVar != null) {
                        aVar.notifyChanged(copy);
                    }
                }
            }
        }
    }

    public void showFragmentStackHierarchyView() {
        this.mDebugStackDelegate.showFragmentStackHierarchyView();
    }

    public void showHideFragment(d dVar) {
        showHideFragment(dVar, null);
    }

    public void start(d dVar) {
        start(dVar, 0);
    }

    public void startForResult(d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(getSupportFragmentManager(), getTopFragment(), dVar, i8, 0, 1);
    }

    public void startWithPop(d dVar) {
        this.mTransactionDelegate.startWithPop(getSupportFragmentManager(), getTopFragment(), dVar);
    }

    public void startWithPopTo(d dVar, Class<?> cls, boolean z7) {
        this.mTransactionDelegate.startWithPopTo(getSupportFragmentManager(), getTopFragment(), dVar, cls.getName(), z7);
    }

    public void loadRootFragment(int i8, d dVar, boolean z7, boolean z8) {
        this.mTransactionDelegate.loadRootTransaction(getSupportFragmentManager(), i8, dVar, z7, z8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable) {
        popTo(cls, z7, runnable, Integer.MAX_VALUE);
    }

    public void showHideFragment(d dVar, d dVar2) {
        this.mTransactionDelegate.showHideFragment(getSupportFragmentManager(), dVar, dVar2);
    }

    public void start(d dVar, int i8) {
        this.mTransactionDelegate.dispatchStartTransaction(getSupportFragmentManager(), getTopFragment(), dVar, 0, i8, 0);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mTransactionDelegate.popTo(cls.getName(), z7, runnable, getSupportFragmentManager(), i8);
    }
}
