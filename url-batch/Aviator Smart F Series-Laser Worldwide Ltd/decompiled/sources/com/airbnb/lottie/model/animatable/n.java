package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class n implements m {
    final List<com.airbnb.lottie.value.a> keyframes;

    n(Object obj) {
        this((List<com.airbnb.lottie.value.a>) Collections.singletonList(new com.airbnb.lottie.value.a(obj)));
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public abstract /* synthetic */ com.airbnb.lottie.animation.keyframe.a createAnimation();

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean isStatic() {
        if (this.keyframes.isEmpty()) {
            return true;
        }
        return this.keyframes.size() == 1 && this.keyframes.get(0).isStatic();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.keyframes.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.keyframes.toArray()));
        }
        return sb.toString();
    }

    n(List<com.airbnb.lottie.value.a> list) {
        this.keyframes = list;
    }
}
