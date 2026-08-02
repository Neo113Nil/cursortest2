package com.squareup.cash.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.overlays.RealOverlayLayer;

/* loaded from: classes6.dex */
public final class MainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.squareup.cash.core.navigationcontainer.UiContainer $newContainer$inlined;
    public final /* synthetic */ com.squareup.cash.core.navigationcontainer.UiContainer $newContainer$inlined$1;
    public final /* synthetic */ RealOverlayLayer $newOverlayLayer$inlined;
    public final /* synthetic */ RealOverlayLayer $newOverlayLayer$inlined$1;
    public final /* synthetic */ com.squareup.cash.core.navigationcontainer.UiContainer $oldContainer$inlined;
    public final /* synthetic */ ContainerLifecycle $oldContainerLifecycle$inlined;
    public final /* synthetic */ RealOverlayLayer $oldOverlayLayer$inlined;
    public final /* synthetic */ MainContainerDelegate this$0;

    public MainContainerDelegate$recreateUi$$inlined$valueAnimatorOf$default$1(com.squareup.cash.core.navigationcontainer.UiContainer uiContainer, RealOverlayLayer realOverlayLayer, MainContainerDelegate mainContainerDelegate, com.squareup.cash.core.navigationcontainer.UiContainer uiContainer2, RealOverlayLayer realOverlayLayer2, com.squareup.cash.core.navigationcontainer.UiContainer uiContainer3, RealOverlayLayer realOverlayLayer3, ContainerLifecycle containerLifecycle) {
        this.$newContainer$inlined = uiContainer;
        this.$newOverlayLayer$inlined = realOverlayLayer;
        this.this$0 = mainContainerDelegate;
        this.$newContainer$inlined$1 = uiContainer2;
        this.$newOverlayLayer$inlined$1 = realOverlayLayer2;
        this.$oldContainer$inlined = uiContainer3;
        this.$oldOverlayLayer$inlined = realOverlayLayer3;
        this.$oldContainerLifecycle$inlined = containerLifecycle;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        FrameLayout frameLayout = this.this$0.containerAndOverlay;
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = this.$oldContainer$inlined;
        uiContainer.getClass();
        frameLayout.removeView(uiContainer);
        frameLayout.removeView(this.$oldOverlayLayer$inlined);
        this.$oldContainerLifecycle$inlined.lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        animator.getClass();
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = this.$newContainer$inlined;
        uiContainer.getClass();
        uiContainer.setAlpha(RecyclerView.DECELERATION_RATE);
        RealOverlayLayer realOverlayLayer = this.$newOverlayLayer$inlined;
        realOverlayLayer.setAlpha(RecyclerView.DECELERATION_RATE);
        FrameLayout frameLayout = this.this$0.containerAndOverlay;
        frameLayout.addView(realOverlayLayer);
        frameLayout.addView(uiContainer, frameLayout.getChildCount() - 1);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        com.squareup.cash.core.navigationcontainer.UiContainer uiContainer = this.$newContainer$inlined$1;
        uiContainer.getClass();
        uiContainer.setAlpha(floatValue);
        this.$newOverlayLayer$inlined$1.setAlpha(floatValue);
    }
}
