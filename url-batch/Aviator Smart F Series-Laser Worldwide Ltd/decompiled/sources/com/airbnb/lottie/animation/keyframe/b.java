package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class b extends g {
    public b(List<com.airbnb.lottie.value.a> list) {
        super(list);
    }

    public int getIntValue(com.airbnb.lottie.value.a aVar, float f8) {
        Integer num;
        if (aVar.startValue == null || aVar.endValue == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        return (cVar == null || (num = (Integer) cVar.getValueInternal(aVar.startFrame, aVar.endFrame.floatValue(), (Integer) aVar.startValue, (Integer) aVar.endValue, f8, getLinearCurrentKeyframeProgress(), getProgress())) == null) ? com.airbnb.lottie.utils.d.evaluate(com.airbnb.lottie.utils.i.clamp(f8, 0.0f, 1.0f), ((Integer) aVar.startValue).intValue(), ((Integer) aVar.endValue).intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public Integer getValue(com.airbnb.lottie.value.a aVar, float f8) {
        return Integer.valueOf(getIntValue(aVar, f8));
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }
}
