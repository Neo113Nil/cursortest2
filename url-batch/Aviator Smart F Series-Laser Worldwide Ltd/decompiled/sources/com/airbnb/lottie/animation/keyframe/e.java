package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes.dex */
public class e extends g {
    private final com.airbnb.lottie.model.content.d gradientColor;

    public e(List<com.airbnb.lottie.value.a> list) {
        super(list);
        com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) list.get(0).startValue;
        int size = dVar != null ? dVar.getSize() : 0;
        this.gradientColor = new com.airbnb.lottie.model.content.d(new float[size], new int[size]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public com.airbnb.lottie.model.content.d getValue(com.airbnb.lottie.value.a aVar, float f8) {
        this.gradientColor.lerp((com.airbnb.lottie.model.content.d) aVar.startValue, (com.airbnb.lottie.model.content.d) aVar.endValue, f8);
        return this.gradientColor;
    }
}
