package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ReverseInterpolator implements Interpolator {

    @NotNull
    private final Interpolator base;

    public ReverseInterpolator(@NotNull Interpolator base) {
        Intrinsics.checkNotNullParameter(base, "base");
        this.base = base;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        return this.base.getInterpolation(1.0f - f4);
    }
}
