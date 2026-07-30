package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a {
    private final PointF point;
    private final PointF pointWithCallbackValues;
    private final a xAnimation;

    @Nullable
    protected com.airbnb.lottie.value.c xValueCallback;
    private final a yAnimation;

    @Nullable
    protected com.airbnb.lottie.value.c yValueCallback;

    public n(a aVar, a aVar2) {
        super(Collections.emptyList());
        this.point = new PointF();
        this.pointWithCallbackValues = new PointF();
        this.xAnimation = aVar;
        this.yAnimation = aVar2;
        setProgress(getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void setProgress(float f8) {
        this.xAnimation.setProgress(f8);
        this.yAnimation.setProgress(f8);
        this.point.set(((Float) this.xAnimation.getValue()).floatValue(), ((Float) this.yAnimation.getValue()).floatValue());
        for (int i8 = 0; i8 < this.listeners.size(); i8++) {
            this.listeners.get(i8).onValueChanged();
        }
    }

    public void setXValueCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.value.c cVar2 = this.xValueCallback;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.xValueCallback = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }

    public void setYValueCallback(@Nullable com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.value.c cVar2 = this.yValueCallback;
        if (cVar2 != null) {
            cVar2.setAnimation(null);
        }
        this.yValueCallback = cVar;
        if (cVar != null) {
            cVar.setAnimation(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public PointF getValue() {
        return getValue((com.airbnb.lottie.value.a) null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public PointF getValue(com.airbnb.lottie.value.a aVar, float f8) {
        Float f9;
        com.airbnb.lottie.value.a currentKeyframe;
        com.airbnb.lottie.value.a currentKeyframe2;
        Float f10 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = this.xAnimation.getCurrentKeyframe()) == null) {
            f9 = null;
        } else {
            float interpolatedCurrentKeyframeProgress = this.xAnimation.getInterpolatedCurrentKeyframeProgress();
            Float f11 = currentKeyframe2.endFrame;
            com.airbnb.lottie.value.c cVar = this.xValueCallback;
            float f12 = currentKeyframe2.startFrame;
            f9 = (Float) cVar.getValueInternal(f12, f11 == null ? f12 : f11.floatValue(), (Float) currentKeyframe2.startValue, (Float) currentKeyframe2.endValue, f8, f8, interpolatedCurrentKeyframeProgress);
        }
        if (this.yValueCallback != null && (currentKeyframe = this.yAnimation.getCurrentKeyframe()) != null) {
            float interpolatedCurrentKeyframeProgress2 = this.yAnimation.getInterpolatedCurrentKeyframeProgress();
            Float f13 = currentKeyframe.endFrame;
            com.airbnb.lottie.value.c cVar2 = this.yValueCallback;
            float f14 = currentKeyframe.startFrame;
            f10 = (Float) cVar2.getValueInternal(f14, f13 == null ? f14 : f13.floatValue(), (Float) currentKeyframe.startValue, (Float) currentKeyframe.endValue, f8, f8, interpolatedCurrentKeyframeProgress2);
        }
        if (f9 == null) {
            this.pointWithCallbackValues.set(this.point.x, 0.0f);
        } else {
            this.pointWithCallbackValues.set(f9.floatValue(), 0.0f);
        }
        if (f10 == null) {
            PointF pointF = this.pointWithCallbackValues;
            pointF.set(pointF.x, this.point.y);
        } else {
            PointF pointF2 = this.pointWithCallbackValues;
            pointF2.set(pointF2.x, f10.floatValue());
        }
        return this.pointWithCallbackValues;
    }
}
