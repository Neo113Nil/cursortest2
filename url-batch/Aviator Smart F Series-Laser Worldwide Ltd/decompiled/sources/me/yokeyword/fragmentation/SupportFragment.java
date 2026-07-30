package me.yokeyword.fragmentation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public class SupportFragment extends Fragment implements d {
    protected SupportActivity _mActivity;
    final f mDelegate = new f(this);

    @Override // me.yokeyword.fragmentation.d
    @Deprecated
    public void enqueueAction(Runnable runnable) {
        this.mDelegate.enqueueAction(runnable);
    }

    @Override // me.yokeyword.fragmentation.d
    public a extraTransaction() {
        return this.mDelegate.extraTransaction();
    }

    public <T extends d> T findChildFragment(Class<T> cls) {
        return (T) g.findFragment(getChildFragmentManager(), cls);
    }

    public <T extends d> T findFragment(Class<T> cls) {
        return (T) g.findFragment(getFragmentManager(), cls);
    }

    @Override // me.yokeyword.fragmentation.d
    public FragmentAnimator getFragmentAnimator() {
        return this.mDelegate.getFragmentAnimator();
    }

    public d getPreFragment() {
        return g.getPreFragment(this);
    }

    @Override // me.yokeyword.fragmentation.d
    public f getSupportDelegate() {
        return this.mDelegate;
    }

    public d getTopChildFragment() {
        return g.getTopFragment(getChildFragmentManager());
    }

    public d getTopFragment() {
        return g.getTopFragment(getFragmentManager());
    }

    protected void hideSoftInput() {
        this.mDelegate.hideSoftInput();
    }

    @Override // me.yokeyword.fragmentation.d
    public final boolean isSupportVisible() {
        return this.mDelegate.isSupportVisible();
    }

    public void loadMultipleRootFragment(int i8, int i9, d... dVarArr) {
        this.mDelegate.loadMultipleRootFragment(i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, d dVar) {
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
        this._mActivity = (SupportActivity) this.mDelegate.getActivity();
    }

    @Override // me.yokeyword.fragmentation.d
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
        this.mDelegate.onHiddenChanged(z7);
    }

    @Override // me.yokeyword.fragmentation.d
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

    public void replaceFragment(d dVar, boolean z7) {
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

    public void showHideFragment(d dVar) {
        this.mDelegate.showHideFragment(dVar);
    }

    protected void showSoftInput(View view) {
        this.mDelegate.showSoftInput(view);
    }

    public void start(d dVar) {
        this.mDelegate.start(dVar);
    }

    public void startForResult(d dVar, int i8) {
        this.mDelegate.startForResult(dVar, i8);
    }

    public void startWithPop(d dVar) {
        this.mDelegate.startWithPop(dVar);
    }

    public void startWithPopTo(d dVar, Class<?> cls, boolean z7) {
        this.mDelegate.startWithPopTo(dVar, cls, z7);
    }

    public void loadRootFragment(int i8, d dVar, boolean z7, boolean z8) {
        this.mDelegate.loadRootFragment(i8, dVar, z7, z8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable) {
        this.mDelegate.popTo(cls, z7, runnable);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable) {
        this.mDelegate.popToChild(cls, z7, runnable);
    }

    public void showHideFragment(d dVar, d dVar2) {
        this.mDelegate.showHideFragment(dVar, dVar2);
    }

    public void start(d dVar, int i8) {
        this.mDelegate.start(dVar, i8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mDelegate.popTo(cls, z7, runnable, i8);
    }

    public void popToChild(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mDelegate.popToChild(cls, z7, runnable, i8);
    }
}
