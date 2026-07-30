package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes.dex */
public class q extends a {
    private final Object valueCallbackValue;

    public q(com.airbnb.lottie.value.c cVar) {
        this(cVar, null);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    float getEndProgress() {
        return 1.0f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public Object getValue() {
        com.airbnb.lottie.value.c cVar = this.valueCallback;
        Object obj = this.valueCallbackValue;
        return cVar.getValueInternal(0.0f, 0.0f, obj, obj, getProgress(), getProgress(), getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void setProgress(float f8) {
        this.progress = f8;
    }

    public q(com.airbnb.lottie.value.c cVar, @Nullable Object obj) {
        super(Collections.emptyList());
        setValueCallback(cVar);
        this.valueCallbackValue = obj;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    Object getValue(com.airbnb.lottie.value.a aVar, float f8) {
        return getValue();
    }
}
