package me.yokeyword.fragmentation;

import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes5.dex */
public class SupportActivity extends AppCompatActivity implements c {
    final e mDelegate = new e(this);

    @Override // android.app.Activity, android.view.Window.Callback, me.yokeyword.fragmentation.c
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // me.yokeyword.fragmentation.c
    public a extraTransaction() {
        return this.mDelegate.extraTransaction();
    }

    public <T extends d> T findFragment(Class<T> cls) {
        return (T) g.findFragment(getSupportFragmentManager(), cls);
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator getFragmentAnimator() {
        return this.mDelegate.getFragmentAnimator();
    }

    @Override // me.yokeyword.fragmentation.c
    public e getSupportDelegate() {
        return this.mDelegate;
    }

    public d getTopFragment() {
        return g.getTopFragment(getSupportFragmentManager());
    }

    public void loadMultipleRootFragment(int i8, int i9, d... dVarArr) {
        this.mDelegate.loadMultipleRootFragment(i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, @NonNull d dVar) {
        this.mDelegate.loadRootFragment(i8, dVar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.mDelegate.onBackPressed();
    }

    @Override // me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        this.mDelegate.onBackPressedSupport();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator onCreateFragmentAnimator() {
        return this.mDelegate.onCreateFragmentAnimator();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        this.mDelegate.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    protected void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        this.mDelegate.onPostCreate(bundle);
    }

    public void pop() {
        this.mDelegate.pop();
    }

    public void popTo(Class<?> cls, boolean z7) {
        this.mDelegate.popTo(cls, z7);
    }

    @Override // me.yokeyword.fragmentation.c
    public void post(Runnable runnable) {
        this.mDelegate.post(runnable);
    }

    public void replaceFragment(d dVar, boolean z7) {
        this.mDelegate.replaceFragment(dVar, z7);
    }

    public void setDefaultFragmentBackground(@DrawableRes int i8) {
        this.mDelegate.setDefaultFragmentBackground(i8);
    }

    @Override // me.yokeyword.fragmentation.c
    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        this.mDelegate.setFragmentAnimator(fragmentAnimator);
    }

    public void showHideFragment(d dVar) {
        this.mDelegate.showHideFragment(dVar);
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

    public void showHideFragment(d dVar, d dVar2) {
        this.mDelegate.showHideFragment(dVar, dVar2);
    }

    public void start(d dVar, int i8) {
        this.mDelegate.start(dVar, i8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable, int i8) {
        this.mDelegate.popTo(cls, z7, runnable, i8);
    }
}
