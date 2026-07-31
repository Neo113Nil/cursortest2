package com.bytedance.adsdk.fs.hhw;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes15.dex */
public abstract class zmn extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> zmn = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> fs = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> zn = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zmn.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.zmn.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.zmn.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.fs.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.fs.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.fs.clear();
    }

    void zmn(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.fs) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.zn.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.zn.remove(animatorPauseListener);
    }

    void zmn() {
        Iterator<Animator.AnimatorListener> it = this.fs.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void fs(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.fs) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void fs() {
        Iterator<Animator.AnimatorListener> it = this.fs.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void zn() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.zmn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void fb() {
        Iterator<Animator.AnimatorPauseListener> it = this.zn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void btk() {
        Iterator<Animator.AnimatorPauseListener> it = this.zn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
