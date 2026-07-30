package com.airbnb.lottie.value;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class c {

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a animation;
    private final b frameInfo;

    @Nullable
    protected Object value;

    public c() {
        this.frameInfo = new b();
        this.value = null;
    }

    @Nullable
    public Object getValue(b bVar) {
        return this.value;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Object getValueInternal(float f8, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        return getValue(this.frameInfo.set(f8, f9, obj, obj2, f10, f11, f12));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setAnimation(@Nullable com.airbnb.lottie.animation.keyframe.a aVar) {
        this.animation = aVar;
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
        com.airbnb.lottie.animation.keyframe.a aVar = this.animation;
        if (aVar != null) {
            aVar.notifyListeners();
        }
    }

    public c(@Nullable Object obj) {
        this.frameInfo = new b();
        this.value = obj;
    }
}
