package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class d extends g {
    public d(List<com.airbnb.lottie.value.a> list) {
        super(list);
    }

    float getFloatValue(com.airbnb.lottie.value.a aVar, float f8) {
        Float f9;
        if (aVar.startValue == null || aVar.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        return (cVar == null || (f9 = (Float) cVar.getValueInternal(aVar.startFrame, aVar.endFrame.floatValue(), (Float) aVar.startValue, (Float) aVar.endValue, f8, getLinearCurrentKeyframeProgress(), getProgress())) == null) ? com.airbnb.lottie.utils.i.lerp(aVar.getStartValueFloat(), aVar.getEndValueFloat(), f8) : f9.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public Float getValue(com.airbnb.lottie.value.a aVar, float f8) {
        return Float.valueOf(getFloatValue(aVar, f8));
    }

    public float getFloatValue() {
        return getFloatValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
