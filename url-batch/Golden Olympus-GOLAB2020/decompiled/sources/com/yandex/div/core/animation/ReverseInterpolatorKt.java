package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ReverseInterpolatorKt {
    @NotNull
    public static final Interpolator reversed(@NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "<this>");
        return new ReverseInterpolator(interpolator);
    }
}
