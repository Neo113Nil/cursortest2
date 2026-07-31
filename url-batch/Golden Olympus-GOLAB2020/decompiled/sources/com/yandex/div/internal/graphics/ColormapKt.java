package com.yandex.div.internal.graphics;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class ColormapKt {
    @NotNull
    public static final Colormap checkIsNotEmpty(@NotNull Colormap colormap, @NotNull Div2View divView) {
        Intrinsics.checkNotNullParameter(colormap, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        if (Intrinsics.areEqual(colormap, Colormap.EMPTY)) {
            DivActionTypedUtilsKt.logError(divView, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
        return colormap;
    }
}
