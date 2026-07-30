package me.yokeyword.fragmentation;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentationMagician;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.yokeyword.fragmentation.exception.AfterSaveStateTransactionWarning;
import me.yokeyword.fragmentation.f;
import me.yokeyword.fragmentation.helper.internal.ResultRecord;
import me.yokeyword.fragmentation.helper.internal.b;

/* loaded from: classes5.dex */
class h {
    static final int DEFAULT_POPTO_ANIM = Integer.MAX_VALUE;
    static final String FRAGMENTATION_ARG_CONTAINER = "fragmentation_arg_container";
    static final String FRAGMENTATION_ARG_CUSTOM_ENTER_ANIM = "fragmentation_arg_custom_enter_anim";
    static final String FRAGMENTATION_ARG_CUSTOM_EXIT_ANIM = "fragmentation_arg_custom_exit_anim";
    static final String FRAGMENTATION_ARG_CUSTOM_POP_EXIT_ANIM = "fragmentation_arg_custom_pop_exit_anim";
    static final String FRAGMENTATION_ARG_IS_SHARED_ELEMENT = "fragmentation_arg_is_shared_element";
    static final String FRAGMENTATION_ARG_REPLACE = "fragmentation_arg_replace";
    static final String FRAGMENTATION_ARG_RESULT_RECORD = "fragment_arg_result_record";
    static final String FRAGMENTATION_ARG_ROOT_STATUS = "fragmentation_arg_root_status";
    static final String FRAGMENTATION_STATE_SAVE_ANIMATOR = "fragmentation_state_save_animator";
    static final String FRAGMENTATION_STATE_SAVE_IS_HIDDEN = "fragmentation_state_save_status";
    private static final String FRAGMENTATION_STATE_SAVE_RESULT = "fragmentation_state_save_result";
    private static final String TAG = "Fragmentation";
    static final int TYPE_ADD = 0;
    static final int TYPE_ADD_RESULT = 1;
    static final int TYPE_ADD_RESULT_WITHOUT_HIDE = 3;
    static final int TYPE_ADD_WITHOUT_HIDE = 2;
    static final int TYPE_REPLACE = 10;
    static final int TYPE_REPLACE_DONT_BACK = 11;
    me.yokeyword.fragmentation.queue.b mActionQueue;
    private FragmentActivity mActivity;
    private Handler mHandler;
    private me.yokeyword.fragmentation.c mSupport;

    class a extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ Fragment val$fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, FragmentManager fragmentManager, Fragment fragment) {
            super(i8);
            this.val$fm = fragmentManager;
            this.val$fragment = fragment;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            h.this.mSupport.getSupportDelegate().mPopMultipleNoAnim = true;
            h.this.removeTopFragment(this.val$fm);
            FragmentationMagician.popBackStackAllowingStateLoss(this.val$fm, this.val$fragment.getTag(), 0);
            FragmentationMagician.popBackStackAllowingStateLoss(this.val$fm);
            FragmentationMagician.executePendingTransactionsAllowingStateLoss(this.val$fm);
            h.this.mSupport.getSupportDelegate().mPopMultipleNoAnim = false;
        }
    }

    class b extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ Runnable val$afterPopTransactionRunnable;
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ boolean val$includeTargetFragment;
        final /* synthetic */ int val$popAnim;
        final /* synthetic */ String val$targetFragmentTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8, String str, boolean z7, FragmentManager fragmentManager, int i9, Runnable runnable) {
            super(i8);
            this.val$targetFragmentTag = str;
            this.val$includeTargetFragment = z7;
            this.val$fm = fragmentManager;
            this.val$popAnim = i9;
            this.val$afterPopTransactionRunnable = runnable;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            h.this.doPopTo(this.val$targetFragmentTag, this.val$includeTargetFragment, this.val$fm, this.val$popAnim);
            Runnable runnable = this.val$afterPopTransactionRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ me.yokeyword.fragmentation.d val$stackToFragment;
        final /* synthetic */ me.yokeyword.fragmentation.d val$to;

        c(me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
            this.val$to = dVar;
            this.val$stackToFragment = dVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.handleNewBundle(this.val$to, this.val$stackToFragment);
        }
    }

    class d extends Animation {
        d() {
        }
    }

    class e extends Animation {
        e() {
        }
    }

    class f implements Runnable {
        final /* synthetic */ ViewGroup val$container;
        final /* synthetic */ View val$fromView;
        final /* synthetic */ ViewGroup val$mock;

        f(ViewGroup viewGroup, View view, ViewGroup viewGroup2) {
            this.val$mock = viewGroup;
            this.val$fromView = view;
            this.val$container = viewGroup2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.val$mock.removeViewInLayout(this.val$fromView);
                this.val$container.removeViewInLayout(this.val$mock);
            } catch (Exception unused) {
            }
        }
    }

    class g implements f.d {
        final /* synthetic */ ViewGroup val$container;
        final /* synthetic */ Animation val$exitAnim;
        final /* synthetic */ View val$fromView;
        final /* synthetic */ ViewGroup val$mock;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    g gVar = g.this;
                    gVar.val$mock.removeViewInLayout(gVar.val$fromView);
                    g gVar2 = g.this;
                    gVar2.val$container.removeViewInLayout(gVar2.val$mock);
                } catch (Exception unused) {
                }
            }
        }

        g(View view, Animation animation, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.val$fromView = view;
            this.val$exitAnim = animation;
            this.val$mock = viewGroup;
            this.val$container = viewGroup2;
        }

        @Override // me.yokeyword.fragmentation.f.d
        public void onEnterAnimStart() {
            this.val$fromView.startAnimation(this.val$exitAnim);
            h.this.mHandler.postDelayed(new a(), this.val$exitAnim.getDuration());
        }
    }

    /* renamed from: me.yokeyword.fragmentation.h$h, reason: collision with other inner class name */
    class C0373h extends ViewGroup {
        C0373h(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        }
    }

    class i extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ Runnable val$runnable;

        i(Runnable runnable) {
            this.val$runnable = runnable;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            this.val$runnable.run();
        }
    }

    class j extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ boolean val$addToBackStack;
        final /* synthetic */ boolean val$allowAnimation;
        final /* synthetic */ int val$containerId;
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ me.yokeyword.fragmentation.d val$to;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8, int i9, me.yokeyword.fragmentation.d dVar, FragmentManager fragmentManager, boolean z7, boolean z8) {
            super(i8);
            this.val$containerId = i9;
            this.val$to = dVar;
            this.val$fm = fragmentManager;
            this.val$addToBackStack = z7;
            this.val$allowAnimation = z8;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            String str;
            h.this.bindContainerId(this.val$containerId, this.val$to);
            String name = this.val$to.getClass().getName();
            me.yokeyword.fragmentation.helper.internal.b bVar = this.val$to.getSupportDelegate().mTransactionRecord;
            h.this.start(this.val$fm, null, this.val$to, (bVar == null || (str = bVar.tag) == null) ? name : str, !this.val$addToBackStack, null, this.val$allowAnimation, 10);
        }
    }

    class k extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ int val$containerId;
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ int val$showPosition;
        final /* synthetic */ me.yokeyword.fragmentation.d[] val$tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i8, FragmentManager fragmentManager, me.yokeyword.fragmentation.d[] dVarArr, int i9, int i10) {
            super(i8);
            this.val$fm = fragmentManager;
            this.val$tos = dVarArr;
            this.val$containerId = i9;
            this.val$showPosition = i10;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            FragmentTransaction beginTransaction = this.val$fm.beginTransaction();
            int i8 = 0;
            while (true) {
                Object[] objArr = this.val$tos;
                if (i8 >= objArr.length) {
                    h.this.supportCommit(this.val$fm, beginTransaction);
                    return;
                }
                Fragment fragment = (Fragment) objArr[i8];
                h.this.getArguments(fragment).putInt(h.FRAGMENTATION_ARG_ROOT_STATUS, 1);
                h.this.bindContainerId(this.val$containerId, this.val$tos[i8]);
                beginTransaction.add(this.val$containerId, fragment, fragment.getClass().getName());
                if (i8 != this.val$showPosition) {
                    beginTransaction.hide(fragment);
                }
                i8++;
            }
        }
    }

    class l extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ me.yokeyword.fragmentation.d val$from;
        final /* synthetic */ int val$launchMode;
        final /* synthetic */ int val$requestCode;
        final /* synthetic */ me.yokeyword.fragmentation.d val$to;
        final /* synthetic */ int val$type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i8, FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, int i9, int i10, int i11) {
            super(i8);
            this.val$fm = fragmentManager;
            this.val$from = dVar;
            this.val$to = dVar2;
            this.val$requestCode = i9;
            this.val$launchMode = i10;
            this.val$type = i11;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            h.this.doDispatchStartTransaction(this.val$fm, this.val$from, this.val$to, this.val$requestCode, this.val$launchMode, this.val$type);
        }
    }

    class m extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ me.yokeyword.fragmentation.d val$hideFragment;
        final /* synthetic */ me.yokeyword.fragmentation.d val$showFragment;

        m(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
            this.val$fm = fragmentManager;
            this.val$showFragment = dVar;
            this.val$hideFragment = dVar2;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            h.this.doShowHideFragment(this.val$fm, this.val$showFragment, this.val$hideFragment);
        }
    }

    class n extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ me.yokeyword.fragmentation.d val$from;
        final /* synthetic */ me.yokeyword.fragmentation.d val$to;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i8, me.yokeyword.fragmentation.d dVar, FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar2) {
            super(i8);
            this.val$from = dVar;
            this.val$fm = fragmentManager;
            this.val$to = dVar2;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            me.yokeyword.fragmentation.d topFragmentForStart = h.this.getTopFragmentForStart(this.val$from, this.val$fm);
            if (topFragmentForStart == null) {
                throw new NullPointerException("There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment() first!");
            }
            h.this.bindContainerId(topFragmentForStart.getSupportDelegate().mContainerId, this.val$to);
            h.this.handleAfterSaveInStateTransactionException(this.val$fm, "popTo()");
            FragmentationMagician.executePendingTransactionsAllowingStateLoss(this.val$fm);
            topFragmentForStart.getSupportDelegate().mLockAnim = true;
            if (!FragmentationMagician.isStateSaved(this.val$fm)) {
                h.this.mockStartWithPopAnim(me.yokeyword.fragmentation.g.getTopFragment(this.val$fm), this.val$to, topFragmentForStart.getSupportDelegate().mAnimHelper.popExitAnim);
            }
            h.this.removeTopFragment(this.val$fm);
            FragmentationMagician.popBackStackAllowingStateLoss(this.val$fm);
            FragmentationMagician.executePendingTransactionsAllowingStateLoss(this.val$fm);
        }
    }

    class o extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ String val$fragmentTag;
        final /* synthetic */ me.yokeyword.fragmentation.d val$from;
        final /* synthetic */ boolean val$includeTargetFragment;
        final /* synthetic */ me.yokeyword.fragmentation.d val$to;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i8, boolean z7, FragmentManager fragmentManager, String str, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
            super(i8);
            this.val$includeTargetFragment = z7;
            this.val$fm = fragmentManager;
            this.val$fragmentTag = str;
            this.val$from = dVar;
            this.val$to = dVar2;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            boolean z7 = this.val$includeTargetFragment;
            List<Fragment> willPopFragments = me.yokeyword.fragmentation.g.getWillPopFragments(this.val$fm, this.val$fragmentTag, z7);
            me.yokeyword.fragmentation.d topFragmentForStart = h.this.getTopFragmentForStart(this.val$from, this.val$fm);
            if (topFragmentForStart == null) {
                throw new NullPointerException("There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment() first!");
            }
            h.this.bindContainerId(topFragmentForStart.getSupportDelegate().mContainerId, this.val$to);
            if (willPopFragments.size() <= 0) {
                return;
            }
            h.this.handleAfterSaveInStateTransactionException(this.val$fm, "startWithPopTo()");
            FragmentationMagician.executePendingTransactionsAllowingStateLoss(this.val$fm);
            if (!FragmentationMagician.isStateSaved(this.val$fm)) {
                h.this.mockStartWithPopAnim(me.yokeyword.fragmentation.g.getTopFragment(this.val$fm), this.val$to, topFragmentForStart.getSupportDelegate().mAnimHelper.popExitAnim);
            }
            h.this.safePopTo(this.val$fragmentTag, this.val$fm, z7 ? 1 : 0, willPopFragments);
        }
    }

    class p extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;
        final /* synthetic */ Fragment val$fragment;
        final /* synthetic */ boolean val$showPreFragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i8, FragmentManager fragmentManager, FragmentManager fragmentManager2, Fragment fragment, boolean z7) {
            super(i8, fragmentManager);
            this.val$fm = fragmentManager2;
            this.val$fragment = fragment;
            this.val$showPreFragment = z7;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            FragmentTransaction remove = this.val$fm.beginTransaction().setTransition(8194).remove(this.val$fragment);
            if (this.val$showPreFragment) {
                Object preFragment = me.yokeyword.fragmentation.g.getPreFragment(this.val$fragment);
                if (preFragment instanceof Fragment) {
                    remove.show((Fragment) preFragment);
                }
            }
            h.this.supportCommit(this.val$fm, remove);
        }
    }

    class q extends me.yokeyword.fragmentation.queue.a {
        final /* synthetic */ FragmentManager val$fm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i8, FragmentManager fragmentManager, FragmentManager fragmentManager2) {
            super(i8, fragmentManager);
            this.val$fm = fragmentManager2;
        }

        @Override // me.yokeyword.fragmentation.queue.a
        public void run() {
            h.this.handleAfterSaveInStateTransactionException(this.val$fm, "pop()");
            FragmentationMagician.popBackStackAllowingStateLoss(this.val$fm);
            h.this.removeTopFragment(this.val$fm);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    h(me.yokeyword.fragmentation.c cVar) {
        this.mSupport = cVar;
        this.mActivity = (FragmentActivity) cVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mHandler = handler;
        this.mActionQueue = new me.yokeyword.fragmentation.queue.b(handler);
    }

    @NonNull
    private ViewGroup addMockView(View view, ViewGroup viewGroup) {
        C0373h c0373h = new C0373h(this.mActivity);
        c0373h.addView(view);
        viewGroup.addView(c0373h);
        return c0373h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void bindContainerId(int i8, me.yokeyword.fragmentation.d dVar) {
        getArguments((Fragment) dVar).putInt(FRAGMENTATION_ARG_CONTAINER, i8);
    }

    private static <T> void checkNotNull(T t7, String str) {
        if (t7 == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void doDispatchStartTransaction(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, int i8, int i9, int i10) {
        String str;
        ArrayList<b.a> arrayList;
        boolean z7;
        checkNotNull(dVar2, "toFragment == null");
        if ((i10 == 1 || i10 == 3) && dVar != 0) {
            Fragment fragment = (Fragment) dVar;
            if (fragment.isAdded()) {
                saveRequestCode(fragmentManager, fragment, (Fragment) dVar2, i8);
            } else {
                Log.w(TAG, fragment.getClass().getSimpleName() + " has not been attached yet! startForResult() converted to start()");
            }
        }
        me.yokeyword.fragmentation.d topFragmentForStart = getTopFragmentForStart(dVar, fragmentManager);
        int i11 = getArguments((Fragment) dVar2).getInt(FRAGMENTATION_ARG_CONTAINER, 0);
        if (topFragmentForStart == null && i11 == 0) {
            Log.e(TAG, "There is no Fragment in the FragmentManager, maybe you need to call loadRootFragment()!");
            return;
        }
        if (topFragmentForStart != null && i11 == 0) {
            bindContainerId(topFragmentForStart.getSupportDelegate().mContainerId, dVar2);
        }
        String name = dVar2.getClass().getName();
        me.yokeyword.fragmentation.helper.internal.b bVar = dVar2.getSupportDelegate().mTransactionRecord;
        if (bVar != null) {
            String str2 = bVar.tag;
            if (str2 != null) {
                name = str2;
            }
            boolean z8 = bVar.dontAddToBackStack;
            ArrayList<b.a> arrayList2 = bVar.sharedElementList;
            str = name;
            arrayList = arrayList2 != null ? arrayList2 : null;
            z7 = z8;
        } else {
            str = name;
            arrayList = null;
            z7 = false;
        }
        if (handleLaunchMode(fragmentManager, topFragmentForStart, dVar2, str, i9)) {
            return;
        }
        start(fragmentManager, topFragmentForStart, dVar2, str, z7, arrayList, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPopTo(String str, boolean z7, FragmentManager fragmentManager, int i8) {
        handleAfterSaveInStateTransactionException(fragmentManager, "popTo()");
        if (fragmentManager.findFragmentByTag(str) != null) {
            List<Fragment> willPopFragments = me.yokeyword.fragmentation.g.getWillPopFragments(fragmentManager, str, z7);
            if (willPopFragments.size() <= 0) {
                return;
            }
            mockPopToAnim(willPopFragments.get(0), str, fragmentManager, z7 ? 1 : 0, willPopFragments, i8);
            return;
        }
        Log.e(TAG, "Pop failure! Can't find FragmentTag:" + str + " in the FragmentManager's Stack.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void doShowHideFragment(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        if (dVar == dVar2) {
            return;
        }
        FragmentTransaction show = fragmentManager.beginTransaction().show((Fragment) dVar);
        if (dVar2 == 0) {
            List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
            if (activeFragments != null) {
                for (Fragment fragment : activeFragments) {
                    if (fragment != null && fragment != dVar) {
                        show.hide(fragment);
                    }
                }
            }
        } else {
            show.hide((Fragment) dVar2);
        }
        supportCommit(fragmentManager, show);
    }

    private void enqueue(FragmentManager fragmentManager, me.yokeyword.fragmentation.queue.a aVar) {
        if (fragmentManager == null) {
            Log.w(TAG, "FragmentManager is null, skip the action!");
        } else {
            this.mActionQueue.enqueue(aVar);
        }
    }

    private ViewGroup findContainerById(Fragment fragment, int i8) {
        if (fragment.getView() == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        KeyEvent.Callback findViewById = parentFragment != null ? parentFragment.getView() != null ? parentFragment.getView().findViewById(i8) : findContainerById(parentFragment, i8) : this.mActivity.findViewById(i8);
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle getArguments(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments;
        }
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public me.yokeyword.fragmentation.d getTopFragmentForStart(me.yokeyword.fragmentation.d dVar, FragmentManager fragmentManager) {
        if (dVar == 0) {
            return me.yokeyword.fragmentation.g.getTopFragment(fragmentManager);
        }
        if (dVar.getSupportDelegate().mContainerId == 0) {
            Fragment fragment = (Fragment) dVar;
            if (fragment.getTag() != null && !fragment.getTag().startsWith("android:switcher:")) {
                throw new IllegalStateException("Can't find container, please call loadRootFragment() first!");
            }
        }
        return me.yokeyword.fragmentation.g.getTopFragment(fragmentManager, dVar.getSupportDelegate().mContainerId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAfterSaveInStateTransactionException(FragmentManager fragmentManager, String str) {
        if (FragmentationMagician.isStateSaved(fragmentManager)) {
            new AfterSaveStateTransactionWarning(str);
            me.yokeyword.fragmentation.b.getDefault().getHandler();
        }
    }

    private boolean handleLaunchMode(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, String str, int i8) {
        me.yokeyword.fragmentation.d findBackStackFragment;
        if (dVar == null || (findBackStackFragment = me.yokeyword.fragmentation.g.findBackStackFragment(dVar2.getClass(), str, fragmentManager)) == null) {
            return false;
        }
        if (i8 == 1) {
            if (dVar2 == dVar || dVar2.getClass().getName().equals(dVar.getClass().getName())) {
                handleNewBundle(dVar2, findBackStackFragment);
                return true;
            }
        } else if (i8 == 2) {
            doPopTo(str, false, fragmentManager, Integer.MAX_VALUE);
            this.mHandler.post(new c(dVar2, findBackStackFragment));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void handleNewBundle(me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        Bundle bundle = dVar.getSupportDelegate().mNewBundle;
        Bundle arguments = getArguments((Fragment) dVar);
        if (arguments.containsKey(FRAGMENTATION_ARG_CONTAINER)) {
            arguments.remove(FRAGMENTATION_ARG_CONTAINER);
        }
        if (bundle != null) {
            arguments.putAll(bundle);
        }
        dVar2.onNewBundle(arguments);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mockPopToAnim(Fragment fragment, String str, FragmentManager fragmentManager, int i8, List<Fragment> list, int i9) {
        View view;
        Animation eVar;
        if (!(fragment instanceof me.yokeyword.fragmentation.d)) {
            safePopTo(str, fragmentManager, i8, list);
            return;
        }
        me.yokeyword.fragmentation.d dVar = (me.yokeyword.fragmentation.d) fragment;
        ViewGroup findContainerById = findContainerById(fragment, dVar.getSupportDelegate().mContainerId);
        if (findContainerById == null || (view = fragment.getView()) == null) {
            return;
        }
        findContainerById.removeViewInLayout(view);
        ViewGroup addMockView = addMockView(view, findContainerById);
        safePopTo(str, fragmentManager, i8, list);
        if (i9 == Integer.MAX_VALUE) {
            eVar = dVar.getSupportDelegate().getExitAnim();
            if (eVar == null) {
                eVar = new d();
            }
        } else {
            eVar = i9 == 0 ? new e() : AnimationUtils.loadAnimation(this.mActivity, i9);
        }
        view.startAnimation(eVar);
        this.mHandler.postDelayed(new f(addMockView, view, findContainerById), eVar.getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mockStartWithPopAnim(me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, Animation animation) {
        View view;
        Fragment fragment = (Fragment) dVar;
        ViewGroup findContainerById = findContainerById(fragment, dVar.getSupportDelegate().mContainerId);
        if (findContainerById == null || (view = fragment.getView()) == null) {
            return;
        }
        findContainerById.removeViewInLayout(view);
        dVar2.getSupportDelegate().mEnterAnimListener = new g(view, animation, addMockView(view, findContainerById), findContainerById);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTopFragment(FragmentManager fragmentManager) {
        try {
            Object backStackTopFragment = me.yokeyword.fragmentation.g.getBackStackTopFragment(fragmentManager);
            if (backStackTopFragment != null) {
                fragmentManager.beginTransaction().setTransition(8194).remove((Fragment) backStackTopFragment).commitAllowingStateLoss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safePopTo(String str, FragmentManager fragmentManager, int i8, List<Fragment> list) {
        this.mSupport.getSupportDelegate().mPopMultipleNoAnim = true;
        FragmentTransaction transition = fragmentManager.beginTransaction().setTransition(8194);
        Iterator<Fragment> it = list.iterator();
        while (it.hasNext()) {
            transition.remove(it.next());
        }
        transition.commitAllowingStateLoss();
        FragmentationMagician.popBackStackAllowingStateLoss(fragmentManager, str, i8);
        FragmentationMagician.executePendingTransactionsAllowingStateLoss(fragmentManager);
        this.mSupport.getSupportDelegate().mPopMultipleNoAnim = false;
    }

    private void saveRequestCode(FragmentManager fragmentManager, Fragment fragment, Fragment fragment2, int i8) {
        Bundle arguments = getArguments(fragment2);
        ResultRecord resultRecord = new ResultRecord();
        resultRecord.requestCode = i8;
        arguments.putParcelable(FRAGMENTATION_ARG_RESULT_RECORD, resultRecord);
        fragmentManager.putFragment(arguments, FRAGMENTATION_STATE_SAVE_RESULT, fragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void start(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, String str, boolean z7, ArrayList<b.a> arrayList, boolean z8, int i8) {
        int i9;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        boolean z9 = i8 == 0 || i8 == 1 || i8 == 2 || i8 == 3;
        Fragment fragment = (Fragment) dVar;
        Fragment fragment2 = (Fragment) dVar2;
        Bundle arguments = getArguments(fragment2);
        arguments.putBoolean(FRAGMENTATION_ARG_REPLACE, !z9);
        if (arrayList != null) {
            arguments.putBoolean(FRAGMENTATION_ARG_IS_SHARED_ELEMENT, true);
            Iterator<b.a> it = arrayList.iterator();
            while (it.hasNext()) {
                b.a next = it.next();
                beginTransaction.addSharedElement(next.sharedElement, next.sharedName);
            }
        } else if (z9) {
            me.yokeyword.fragmentation.helper.internal.b bVar = dVar2.getSupportDelegate().mTransactionRecord;
            if (bVar == null || (i9 = bVar.targetFragmentEnter) == Integer.MIN_VALUE) {
                beginTransaction.setTransition(4097);
            } else {
                beginTransaction.setCustomAnimations(i9, bVar.currentFragmentPopExit, bVar.currentFragmentPopEnter, bVar.targetFragmentExit);
                arguments.putInt(FRAGMENTATION_ARG_CUSTOM_ENTER_ANIM, bVar.targetFragmentEnter);
                arguments.putInt(FRAGMENTATION_ARG_CUSTOM_EXIT_ANIM, bVar.targetFragmentExit);
                arguments.putInt(FRAGMENTATION_ARG_CUSTOM_POP_EXIT_ANIM, bVar.currentFragmentPopExit);
            }
        } else {
            arguments.putInt(FRAGMENTATION_ARG_ROOT_STATUS, 1);
        }
        if (dVar == 0) {
            beginTransaction.replace(arguments.getInt(FRAGMENTATION_ARG_CONTAINER), fragment2, str);
            if (!z9) {
                beginTransaction.setTransition(4097);
                arguments.putInt(FRAGMENTATION_ARG_ROOT_STATUS, z8 ? 2 : 1);
            }
        } else if (z9) {
            beginTransaction.add(dVar.getSupportDelegate().mContainerId, fragment2, str);
            if (i8 != 2 && i8 != 3) {
                beginTransaction.hide(fragment);
            }
        } else {
            beginTransaction.replace(dVar.getSupportDelegate().mContainerId, fragment2, str);
        }
        if (!z7 && i8 != 11) {
            beginTransaction.addToBackStack(str);
        }
        supportCommit(fragmentManager, beginTransaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void supportCommit(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction) {
        handleAfterSaveInStateTransactionException(fragmentManager, "commit()");
        fragmentTransaction.commitAllowingStateLoss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean dispatchBackPressedEvent(me.yokeyword.fragmentation.d dVar) {
        if (dVar != 0) {
            return dVar.onBackPressedSupport() || dispatchBackPressedEvent((me.yokeyword.fragmentation.d) ((Fragment) dVar).getParentFragment());
        }
        return false;
    }

    void dispatchStartTransaction(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, int i8, int i9, int i10) {
        enqueue(fragmentManager, new l(i9 == 2 ? 2 : 0, fragmentManager, dVar, dVar2, i8, i9, i10));
    }

    void handleResultRecord(Fragment fragment) {
        ResultRecord resultRecord;
        try {
            Bundle arguments = fragment.getArguments();
            if (arguments == null || (resultRecord = (ResultRecord) arguments.getParcelable(FRAGMENTATION_ARG_RESULT_RECORD)) == null) {
                return;
            }
            ((me.yokeyword.fragmentation.d) fragment.getFragmentManager().getFragment(fragment.getArguments(), FRAGMENTATION_STATE_SAVE_RESULT)).onFragmentResult(resultRecord.requestCode, resultRecord.resultCode, resultRecord.resultBundle);
        } catch (IllegalStateException unused) {
        }
    }

    void loadMultipleRootTransaction(FragmentManager fragmentManager, int i8, int i9, me.yokeyword.fragmentation.d... dVarArr) {
        enqueue(fragmentManager, new k(4, fragmentManager, dVarArr, i8, i9));
    }

    void loadRootTransaction(FragmentManager fragmentManager, int i8, me.yokeyword.fragmentation.d dVar, boolean z7, boolean z8) {
        enqueue(fragmentManager, new j(4, i8, dVar, fragmentManager, z7, z8));
    }

    void pop(FragmentManager fragmentManager) {
        enqueue(fragmentManager, new q(1, fragmentManager, fragmentManager));
    }

    void popQuiet(FragmentManager fragmentManager, Fragment fragment) {
        enqueue(fragmentManager, new a(2, fragmentManager, fragment));
    }

    void popTo(String str, boolean z7, Runnable runnable, FragmentManager fragmentManager, int i8) {
        enqueue(fragmentManager, new b(2, str, z7, fragmentManager, i8, runnable));
    }

    void post(Runnable runnable) {
        this.mActionQueue.enqueue(new i(runnable));
    }

    void remove(FragmentManager fragmentManager, Fragment fragment, boolean z7) {
        enqueue(fragmentManager, new p(1, fragmentManager, fragmentManager, fragment, z7));
    }

    void showHideFragment(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        enqueue(fragmentManager, new m(fragmentManager, dVar, dVar2));
    }

    void startWithPop(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        enqueue(fragmentManager, new n(2, dVar, fragmentManager, dVar2));
        dispatchStartTransaction(fragmentManager, dVar, dVar2, 0, 0, 0);
    }

    void startWithPopTo(FragmentManager fragmentManager, me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2, String str, boolean z7) {
        enqueue(fragmentManager, new o(2, z7, fragmentManager, str, dVar, dVar2));
        dispatchStartTransaction(fragmentManager, dVar, dVar2, 0, 0, 0);
    }
}
