package com.airbnb.lottie.model.animatable;

import java.util.List;

/* loaded from: classes.dex */
public class e implements m {
    private final List<com.airbnb.lottie.value.a> keyframes;

    public e(List<com.airbnb.lottie.value.a> list) {
        this.keyframes = list;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a createAnimation() {
        return this.keyframes.get(0).isStatic() ? new com.airbnb.lottie.animation.keyframe.k(this.keyframes) : new com.airbnb.lottie.animation.keyframe.j(this.keyframes);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean isStatic() {
        return this.keyframes.size() == 1 && this.keyframes.get(0).isStatic();
    }
}
