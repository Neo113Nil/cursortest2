package com.moyoung.dafit.module.common.baseui;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.moyoung.dafit.module.common.R$anim;
import com.moyoung.dafit.module.common.utils.k0;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/* loaded from: classes4.dex */
public class BaseActivity extends AppCompatActivity implements me.yokeyword.fragmentation.c {
    private static final float DEFAULT_FONT_SCALE = 1.0f;
    private static final int DEFAULT_STATUS_BAR_COLOR = -1;
    final me.yokeyword.fragmentation.e mDelegate = new me.yokeyword.fragmentation.e(this);

    @Override // android.app.Activity, android.view.Window.Callback, me.yokeyword.fragmentation.c
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.mDelegate.dispatchTouchEvent(motionEvent) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // me.yokeyword.fragmentation.c
    public me.yokeyword.fragmentation.a extraTransaction() {
        return this.mDelegate.extraTransaction();
    }

    public <T extends me.yokeyword.fragmentation.d> T findFragment(Class<T> cls) {
        return (T) me.yokeyword.fragmentation.g.findFragment(getSupportFragmentManager(), cls);
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator getFragmentAnimator() {
        return this.mDelegate.getFragmentAnimator();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources.getConfiguration().fontScale != 1.0f) {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    @ColorInt
    protected int getStatusBarColor() {
        return -1;
    }

    @Override // me.yokeyword.fragmentation.c
    public me.yokeyword.fragmentation.e getSupportDelegate() {
        return this.mDelegate;
    }

    public me.yokeyword.fragmentation.d getTopFragment() {
        return me.yokeyword.fragmentation.g.getTopFragment(getSupportFragmentManager());
    }

    public void loadMultipleRootFragment(int i8, int i9, me.yokeyword.fragmentation.d... dVarArr) {
        this.mDelegate.loadMultipleRootFragment(i8, i9, dVarArr);
    }

    public void loadRootFragment(int i8, @NonNull me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.loadRootFragment(i8, dVar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.mDelegate.onBackPressed();
    }

    public void onBackPressedSupport() {
        this.mDelegate.onBackPressedSupport();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (configuration.fontScale != 1.0f) {
            getResources();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mDelegate.onCreate(bundle);
        int statusBarColor = getStatusBarColor();
        k0.setColorNoTranslucent(this, statusBarColor);
        if (statusBarColor == -1) {
            k0.setLightMode(this);
        } else {
            k0.setDarkMode(this);
        }
    }

    @Override // me.yokeyword.fragmentation.c
    public FragmentAnimator onCreateFragmentAnimator() {
        return new FragmentAnimator(R$anim.v_fragment_enter, R$anim.v_fragment_exit);
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

    public void replaceFragment(me.yokeyword.fragmentation.d dVar, boolean z7) {
        this.mDelegate.replaceFragment(dVar, z7);
    }

    public void setDefaultFragmentBackground(@DrawableRes int i8) {
        this.mDelegate.setDefaultFragmentBackground(i8);
    }

    @Override // me.yokeyword.fragmentation.c
    public void setFragmentAnimator(FragmentAnimator fragmentAnimator) {
        this.mDelegate.setFragmentAnimator(fragmentAnimator);
    }

    public void showHideFragment(me.yokeyword.fragmentation.d dVar) {
        this.mDelegate.showHideFragment(dVar);
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

    public void loadRootFragment(int i8, me.yokeyword.fragmentation.d dVar, boolean z7, boolean z8) {
        this.mDelegate.loadRootFragment(i8, dVar, z7, z8);
    }

    public void popTo(Class<?> cls, boolean z7, Runnable runnable) {
        this.mDelegate.popTo(cls, z7, runnable);
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
}
