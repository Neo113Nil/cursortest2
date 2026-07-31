package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b02 {
    public static final float a(@NotNull xz1 xz1Var, @NotNull RectF view, @NotNull RectF image) {
        Intrinsics.checkNotNullParameter(xz1Var, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(image, "image");
        float height = view.height();
        float width = view.width();
        float height2 = image.height();
        float width2 = image.width();
        if (height == 0.0f || width == 0.0f || height2 == 0.0f || width2 == 0.0f) {
            return Float.MAX_VALUE;
        }
        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
        if (width < ((int) (xz1Var.c() * min)) || height < ((int) (xz1Var.b() * min))) {
            return Float.MAX_VALUE;
        }
        return Math.abs(height - (xz1Var.b() * min)) + Math.abs(width - (xz1Var.c() * min));
    }
}
