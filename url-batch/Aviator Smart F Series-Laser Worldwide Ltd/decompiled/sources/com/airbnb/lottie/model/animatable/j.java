package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.o;
import java.util.List;

/* loaded from: classes.dex */
public class j extends n {
    public j(List<com.airbnb.lottie.value.a> list) {
        super(list);
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

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public o createAnimation() {
        return new o(this.keyframes);
    }
}
