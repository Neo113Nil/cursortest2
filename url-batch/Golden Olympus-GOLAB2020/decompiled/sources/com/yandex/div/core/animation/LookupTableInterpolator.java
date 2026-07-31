package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;

    @NotNull
    private final float[] values;

    public LookupTableInterpolator(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.stepSize = 1.0f / AbstractC3219i.J(values);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int g4 = g.g((int) (AbstractC3219i.J(this.values) * f4), this.values.length - 2);
        float f5 = this.stepSize;
        float f6 = (f4 - (g4 * f5)) / f5;
        float[] fArr = this.values;
        float f7 = fArr[g4];
        return f7 + (f6 * (fArr[g4 + 1] - f7));
    }
}
