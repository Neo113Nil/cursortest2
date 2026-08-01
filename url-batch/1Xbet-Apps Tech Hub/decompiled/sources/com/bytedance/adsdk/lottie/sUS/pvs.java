package com.bytedance.adsdk.lottie.sUS;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator.java */
/* loaded from: classes.dex */
public abstract class pvs extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> pvs = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> icD = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> vG = new CopyOnWriteArraySet();

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
        this.pvs.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.pvs.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.pvs.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.icD.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.icD.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.icD.clear();
    }

    void pvs(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.icD) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.vG.add(animatorPauseListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.vG.remove(animatorPauseListener);
    }

    void pvs() {
        Iterator<Animator.AnimatorListener> it = this.icD.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void icD(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.icD) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void icD() {
        Iterator<Animator.AnimatorListener> it = this.icD.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void vG() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.pvs.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void Jd() {
        Iterator<Animator.AnimatorPauseListener> it = this.vG.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void NB() {
        Iterator<Animator.AnimatorPauseListener> it = this.vG.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }
}
