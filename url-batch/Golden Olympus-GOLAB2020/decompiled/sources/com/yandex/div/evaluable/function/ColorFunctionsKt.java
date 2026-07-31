package com.yandex.div.evaluable.function;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i4) {
        if (i4 < 0 || i4 >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return i4 / 255.0f;
    }

    public static final int toColorIntComponentValue(double d4) {
        if (d4 < 0.0d || d4 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d4 * 255.0f) + 0.5f);
    }
}
