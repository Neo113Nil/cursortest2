package com.stripe.android.financialconnections.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import nl.dionsegijn.konfetti.emitters.RenderSystem;

/* loaded from: classes8.dex */
public final class ActivityVisibilityObserver implements DefaultLifecycleObserver {
    public boolean isFirstStart = true;
    public boolean isInBackground;
    public final RenderSystem.AnonymousClass1 onBackgrounded;
    public final RenderSystem.AnonymousClass1 onForegrounded;

    public ActivityVisibilityObserver(RenderSystem.AnonymousClass1 anonymousClass1, RenderSystem.AnonymousClass1 anonymousClass12) {
        this.onBackgrounded = anonymousClass1;
        this.onForegrounded = anonymousClass12;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (!this.isFirstStart && this.isInBackground) {
            this.onForegrounded.invoke();
        }
        this.isFirstStart = false;
        this.isInBackground = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        AppCompatActivity appCompatActivity = lifecycleOwner instanceof AppCompatActivity ? (AppCompatActivity) lifecycleOwner : null;
        if (appCompatActivity != null ? appCompatActivity.isChangingConfigurations() : false) {
            return;
        }
        this.isInBackground = true;
        this.onBackgrounded.invoke();
    }
}
