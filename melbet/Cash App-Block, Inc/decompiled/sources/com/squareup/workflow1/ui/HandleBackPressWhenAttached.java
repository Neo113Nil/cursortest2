package com.squareup.workflow1.ui;

import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.util.DBUtil;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class HandleBackPressWhenAttached implements View.OnAttachStateChangeListener, DefaultLifecycleObserver {
    public final Function0 handler;
    public final RedwoodLayoutKt$toAndroid$1 onBackPressedCallback;
    public final View view;

    public HandleBackPressWhenAttached(View view, Function0 function0) {
        view.getClass();
        function0.getClass();
        this.view = view;
        this.handler = function0;
        this.onBackPressedCallback = new RedwoodLayoutKt$toAndroid$1(this, false, 8);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        this.onBackPressedCallback.remove();
        View view = this.view;
        view.removeOnAttachStateChangeListener(this);
        LifecycleOwner lifecycleOwner2 = DBUtil.get(view);
        if (lifecycleOwner2 == null || (lifecycle = lifecycleOwner2.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        if (this.view == view) {
            this.onBackPressedCallback.setEnabled(true);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        if (this.view == view) {
            this.onBackPressedCallback.setEnabled(false);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        }
    }
}
