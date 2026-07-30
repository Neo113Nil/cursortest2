package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public class g extends c implements Choreographer.FrameCallback {

    @Nullable
    private com.airbnb.lottie.h composition;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;
    private long lastFrameTimeNs = 0;
    private float frame = 0.0f;
    private int repeatCount = 0;
    private float minFrame = -2.1474836E9f;
    private float maxFrame = 2.1474836E9f;

    @VisibleForTesting
    protected boolean running = false;

    private float getFrameDurationNs() {
        com.airbnb.lottie.h hVar = this.composition;
        if (hVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hVar.getFrameRate()) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.composition == null) {
            return;
        }
        float f8 = this.frame;
        if (f8 < this.minFrame || f8 > this.maxFrame) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.minFrame), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.1474836E9f;
        this.maxFrame = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        postFrameCallback();
        if (this.composition == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.c.beginSection("LottieValueAnimator#doFrame");
        float frameDurationNs = (this.lastFrameTimeNs != 0 ? j8 - r1 : 0L) / getFrameDurationNs();
        float f8 = this.frame;
        if (isReversed()) {
            frameDurationNs = -frameDurationNs;
        }
        float f9 = f8 + frameDurationNs;
        this.frame = f9;
        boolean z7 = !i.contains(f9, getMinFrame(), getMaxFrame());
        this.frame = i.clamp(this.frame, getMinFrame(), getMaxFrame());
        this.lastFrameTimeNs = j8;
        notifyUpdate();
        if (z7) {
            if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
                notifyRepeat();
                this.repeatCount++;
                if (getRepeatMode() == 2) {
                    this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                    reverseAnimationSpeed();
                } else {
                    this.frame = isReversed() ? getMaxFrame() : getMinFrame();
                }
                this.lastFrameTimeNs = j8;
            } else {
                this.frame = this.speed < 0.0f ? getMinFrame() : getMaxFrame();
                removeFrameCallback();
                notifyEnd(isReversed());
            }
        }
        verifyFrame();
        com.airbnb.lottie.c.endSection("LottieValueAnimator#doFrame");
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame = getMaxFrame() - this.frame;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.frame - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    public float getAnimatedValueAbsolute() {
        com.airbnb.lottie.h hVar = this.composition;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.frame - hVar.getStartFrame()) / (this.composition.getEndFrame() - this.composition.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.h hVar = this.composition;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.getDuration();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        com.airbnb.lottie.h hVar = this.composition;
        if (hVar == null) {
            return 0.0f;
        }
        float f8 = this.maxFrame;
        return f8 == 2.1474836E9f ? hVar.getEndFrame() : f8;
    }

    public float getMinFrame() {
        com.airbnb.lottie.h hVar = this.composition;
        if (hVar == null) {
            return 0.0f;
        }
        float f8 = this.minFrame;
        return f8 == -2.1474836E9f ? hVar.getStartFrame() : f8;
    }

    public float getSpeed() {
        return this.speed;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @Override // com.airbnb.lottie.utils.c
    void notifyCancel() {
        super.notifyCancel();
        notifyEnd(isReversed());
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
    }

    @MainThread
    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((int) (isReversed() ? getMaxFrame() : getMinFrame()));
        this.lastFrameTimeNs = 0L;
        this.repeatCount = 0;
        postFrameCallback();
    }

    protected void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    protected void removeFrameCallback() {
        removeFrameCallback(true);
    }

    @MainThread
    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0L;
        if (isReversed() && getFrame() == getMinFrame()) {
            this.frame = getMaxFrame();
        } else {
            if (isReversed() || getFrame() != getMaxFrame()) {
                return;
            }
            this.frame = getMinFrame();
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(com.airbnb.lottie.h hVar) {
        boolean z7 = this.composition == null;
        this.composition = hVar;
        if (z7) {
            setMinAndMaxFrames(Math.max(this.minFrame, hVar.getStartFrame()), Math.min(this.maxFrame, hVar.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) hVar.getStartFrame(), (int) hVar.getEndFrame());
        }
        float f8 = this.frame;
        this.frame = 0.0f;
        setFrame((int) f8);
        notifyUpdate();
    }

    public void setFrame(float f8) {
        if (this.frame == f8) {
            return;
        }
        this.frame = i.clamp(f8, getMinFrame(), getMaxFrame());
        this.lastFrameTimeNs = 0L;
        notifyUpdate();
    }

    public void setMaxFrame(float f8) {
        setMinAndMaxFrames(this.minFrame, f8);
    }

    public void setMinAndMaxFrames(float f8, float f9) {
        if (f8 > f9) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f8), Float.valueOf(f9)));
        }
        com.airbnb.lottie.h hVar = this.composition;
        float startFrame = hVar == null ? -3.4028235E38f : hVar.getStartFrame();
        com.airbnb.lottie.h hVar2 = this.composition;
        float endFrame = hVar2 == null ? Float.MAX_VALUE : hVar2.getEndFrame();
        float clamp = i.clamp(f8, startFrame, endFrame);
        float clamp2 = i.clamp(f9, startFrame, endFrame);
        if (clamp == this.minFrame && clamp2 == this.maxFrame) {
            return;
        }
        this.minFrame = clamp;
        this.maxFrame = clamp2;
        setFrame((int) i.clamp(this.frame, clamp, clamp2));
    }

    public void setMinFrame(int i8) {
        setMinAndMaxFrames(i8, (int) this.maxFrame);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i8) {
        super.setRepeatMode(i8);
        if (i8 == 2 || !this.speedReversedForRepeatMode) {
            return;
        }
        this.speedReversedForRepeatMode = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f8) {
        this.speed = f8;
    }

    @MainThread
    protected void removeFrameCallback(boolean z7) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z7) {
            this.running = false;
        }
    }
}
