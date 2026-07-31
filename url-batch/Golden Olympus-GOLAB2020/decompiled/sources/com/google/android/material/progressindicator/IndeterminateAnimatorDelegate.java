package com.google.android.material.progressindicator;

import android.animation.Animator;
import l0.AbstractC3251a;

/* loaded from: classes.dex */
abstract class IndeterminateAnimatorDelegate<T extends Animator> {
    protected IndeterminateDrawable drawable;
    protected final int[] segmentColors;
    protected final float[] segmentPositions;

    protected IndeterminateAnimatorDelegate(int i4) {
        this.segmentPositions = new float[i4 * 2];
        this.segmentColors = new int[i4];
    }

    abstract void cancelAnimatorImmediately();

    protected float getFractionInRange(int i4, int i5, int i6) {
        return (i4 - i5) / i6;
    }

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(AbstractC3251a abstractC3251a);

    protected void registerDrawable(IndeterminateDrawable indeterminateDrawable) {
        this.drawable = indeterminateDrawable;
    }

    abstract void requestCancelAnimatorAfterCurrentCycle();

    abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
