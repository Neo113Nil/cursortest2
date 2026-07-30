package com.airbnb.lottie.model.animatable;

import java.util.List;

/* loaded from: classes.dex */
public class f extends n {
    public f(List<com.airbnb.lottie.value.a> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a createAnimation() {
        return new com.airbnb.lottie.animation.keyframe.k(this.keyframes);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
