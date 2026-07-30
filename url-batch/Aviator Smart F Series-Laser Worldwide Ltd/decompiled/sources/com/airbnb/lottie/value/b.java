package com.airbnb.lottie.value;

import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class b {
    private float endFrame;
    private Object endValue;
    private float interpolatedKeyframeProgress;
    private float linearKeyframeProgress;
    private float overallProgress;
    private float startFrame;
    private Object startValue;

    public float getEndFrame() {
        return this.endFrame;
    }

    public Object getEndValue() {
        return this.endValue;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.interpolatedKeyframeProgress;
    }

    public float getLinearKeyframeProgress() {
        return this.linearKeyframeProgress;
    }

    public float getOverallProgress() {
        return this.overallProgress;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public Object getStartValue() {
        return this.startValue;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b set(float f8, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        this.startFrame = f8;
        this.endFrame = f9;
        this.startValue = obj;
        this.endValue = obj2;
        this.linearKeyframeProgress = f10;
        this.interpolatedKeyframeProgress = f11;
        this.overallProgress = f12;
        return this;
    }
}
