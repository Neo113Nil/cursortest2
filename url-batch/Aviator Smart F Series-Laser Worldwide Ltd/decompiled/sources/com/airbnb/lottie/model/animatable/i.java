package com.airbnb.lottie.model.animatable;

import java.util.List;

/* loaded from: classes.dex */
public class i implements m {
    private final b animatableXDimension;
    private final b animatableYDimension;

    public i(b bVar, b bVar2) {
        this.animatableXDimension = bVar;
        this.animatableYDimension = bVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a createAnimation() {
        return new com.airbnb.lottie.animation.keyframe.n(this.animatableXDimension.createAnimation(), this.animatableYDimension.createAnimation());
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean isStatic() {
        return this.animatableXDimension.isStatic() && this.animatableYDimension.isStatic();
    }
}
