package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class l extends g {
    private final com.airbnb.lottie.value.d scaleXY;

    public l(List<com.airbnb.lottie.value.a> list) {
        super(list);
        this.scaleXY = new com.airbnb.lottie.value.d();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public com.airbnb.lottie.value.d getValue(com.airbnb.lottie.value.a aVar, float f8) {
        Object obj;
        com.airbnb.lottie.value.d dVar;
        Object obj2 = aVar.startValue;
        if (obj2 == null || (obj = aVar.endValue) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.airbnb.lottie.value.d dVar2 = (com.airbnb.lottie.value.d) obj2;
        com.airbnb.lottie.value.d dVar3 = (com.airbnb.lottie.value.d) obj;
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        if (cVar != null && (dVar = (com.airbnb.lottie.value.d) cVar.getValueInternal(aVar.startFrame, aVar.endFrame.floatValue(), dVar2, dVar3, f8, getLinearCurrentKeyframeProgress(), getProgress())) != null) {
            return dVar;
        }
        this.scaleXY.set(com.airbnb.lottie.utils.i.lerp(dVar2.getScaleX(), dVar3.getScaleX(), f8), com.airbnb.lottie.utils.i.lerp(dVar2.getScaleY(), dVar3.getScaleY(), f8));
        return this.scaleXY;
    }
}
