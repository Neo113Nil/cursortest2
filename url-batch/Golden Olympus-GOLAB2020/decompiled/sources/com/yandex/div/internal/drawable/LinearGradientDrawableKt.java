package com.yandex.div.internal.drawable;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class LinearGradientDrawableKt {
    private static final float snap(float f4, float f5, float f6) {
        return Math.abs(f5 - f4) <= f6 ? f5 : f4;
    }

    static /* synthetic */ float snap$default(float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f6 = 1.0E-4f;
        }
        return snap(f4, f5, f6);
    }
}
