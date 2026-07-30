package com.moyoung.dafit.module.common.baseui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes4.dex */
public class BaseFragement extends Fragment implements me.yokeyword.fragmentation.d {
    protected FragmentActivity _mActivity;
    final me.yokeyword.fragmentation.f mDelegate = new me.yokeyword.fragmentation.f(this);

    @Override // me.yokeyword.fragmentation.d
    @Deprecated
    public void enqueueAction(Runnable runnable) {
        this.mDelegate.enqueueAction(runnable);
    }

    @Override // me.yokeyword.fragmentation.d
    public me.yokeyword.fragmentation.a extraTransaction() {
        return this.mDelegate.extraTransaction();
    }

    public <T extends me.yokeyword.fragmentation.d> T findChildFragment(Class<T> cls) {
        return (T) me.yokeyword.fragmentation.g.findFragment(getChildFragmentManager(), cls);
    }

    public <T extends me.yokeyword.fragmentation.d> T findFragment(Class<T> cls) {
        return (T) me.yokeyword.fragmentation.g.findFragment(getFragmentManager(), cls);
    }

    @Override // me.yokeyword.fragmentation.d
    public FragmentAnimator getFragmentAnimator() {
        return this.mDelegate.getFragmentAnimator();
    }

    public me.yokeyword.fragmentation.d getPreFragment() {
        return me.yokeyword.fragmentation.g.getPreFragment(this);
    }

    @Override // me.yokeyword.fragmentation.d
    public me.yokeyword.fragmentation.f getSupportDelegate() {
        return this.mDelegate;
    }

    public me.yokeyword.fragmentation.d getTopChildFragment() {
        return me.yokeyword.fragmentation.g.getTopFragment(getChildFragmentManager());
    }

    public me.yokeyword.fragmentation.d getTopFragment() {
        return me.yokeyword.fragmentation.g.getTopFragment(getFragmentManager());
    }

    protected void hideSoftInput() {
        this.mDelegate.hideSoftInput();
    }

    @Override // me.yokeyword.fragmentation.d
    public final boolean isSupportVisible() {
        return this.mDelegate.isSupportVisible();
    }

    public void loadMultipleRootFragment(int i8, int i9, me.yokeyword.fragmentation.d... dVarArr) {
        this.mDelegate.loadMultipleRootFragment(i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.loadRootFragment(i8, dVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mDelegate.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mDelegate.onAttach(activity);
        this._mActivity = this.mDelegate.getActivity();
    }

    public boolean onBackPressedSupport() {
        return this.mDelegate.onBackPressedSupport();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i8, boolean z7, int i9) {
        return this.mDelegate.onCreateAnimation(i8, z7, i9);
    }

    @Override // me.yokeyword.fragmentation.d
    public FragmentAnimator onCreateFragmentAnimator() {
        return this.mDelegate.onCreateFragmentAnimator();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mDelegate.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mDelegate.onDestroyView();
        super.onDestroyView();
    }

    @Override // me.yokeyword.fragmentation.d
    public void onEnterAnimationEnd(Bundle bundle) {
        this.mDelegate.onEnterAnimationEnd(bundle);
    }

    @Override // me.yokeyword.fragmentation.d
    public void onFragmentResult(int i8, int i9, Bundle bundle) {
        this.mDelegate.onFragmentResult(i8, i9, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        try {
            this.mDelegate.onHiddenChanged(z7);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void onLazyInitView(@Nullable Bundle bundle) {
        this.mDelegate.onLazyInitView(bundle);
    }

    @Override // me.yokeyword.fragmentation.d
    public void onNewBundle(Bundle bundle) {
        this.mDelegate.onNewBundle(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mDelegate.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mDelegate.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.mDelegate.onSaveInstanceState(bundle);
    }

    @Override // me.yokeyword.fragmentation.d
    public void onSupportInvisible() {
        this.mDelegate.onSupportInvisible();
    }

    @Override // me.yokeyword.fragmentation.d
    public void onSupportVisible() {
        this.mDelegate.onSupportVisible();
    }

    public void pop() {
        this.mDelegate.pop();
    }

    public void popChild() {
        this.mDelegate.popChild();
    }

    public void popTo(Class<?> cls, boolean z7) {
        this.mDelegate.popTo(cls, z7);
    }

    public void popToChild(Class<?> cls, boolean z7) {
        this.mDelegate.popToChild(cls, z7);
    }

    @Override // me.yokeyword.fragmentation.d
    public void post(Runnable runnable) {
        this.mDelegate.post(runnable);
    }

    @Override // me.yokeyword.fragmentation.d
    public void putNewBundle(Bundle bundle) {
        this.mDelegate.putNewBundle(bundle);
    }

    public void replaceFragment(me.yokeyword.fragmentation.d dVar, boolean z7) {
        this.mDelegate.replaceFragment(dVar, z7);
    }

    @Override // me.yokeyword.fragmentation.d
    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        this.mDelegate.setFragmentAnimator(fragmentAnimator);
    }

    @Override // me.yokeyword.fragmentation.d
    public void setFragmentResult(int i8, Bundle bundle) {
        this.mDelegate.setFragmentResult(i8, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        this.mDelegate.setUserVisibleHint(z7);
    }

    public void showHideFragment(me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.showHideFragment(dVar);
    }

    protected void showSoftInput(View view) {
        this.mDelegate.showSoftInput(view);
    }

    public void start(me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.start(dVar);
    }

    public void startForResult(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mDelegate.startForResult(dVar, i8);
    }

    public void startWithPop(me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.startWithPop(dVar);
    }

    public void startWithPopTo(me.yokeyword.fragmentation.d dVar, Class<?> cls, boolean z7) {
        this.mDelegate.startWithPopTo(dVar, cls, z7);
    }

    public void loadRootFragment(int i8, me.yokeyword.fragmentation.d dVar, boolean z7, boolean z8) {
        this.mDelegate.loadRootFragment(i8, dVar, z7, z8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable) {
        this.mDelegate.popTo(cls, z7, runnable);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable) {
        this.mDelegate.popToChild(cls, z7, runnable);
    }

    public void showHideFragment(me.yokeyword.fragmentation.d dVar, me.yokeyword.fragmentation.d dVar2) {
        this.mDelegate.showHideFragment(dVar, dVar2);
    }

    public void start(me.yokeyword.fragmentation.d dVar, int i8) {
        this.mDelegate.start(dVar, i8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mDelegate.popTo(cls, z7, runnable, i8);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mDelegate.popToChild(cls, z7, runnable, i8);
    }
}
