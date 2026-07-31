package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import O1.C0942me;
import android.graphics.Canvas;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivTextRangesBackgroundRenderer {
    private final int getLineBottomWithoutSpacing(Layout layout, int i4) {
        int lineBottom = layout.getLineBottom(i4);
        boolean z4 = i4 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == 0.0f && spacingMultiplier == 1.0f) {
            return lineBottom;
        }
        if (z4) {
            return lineBottom;
        }
        if (Float.compare(spacingMultiplier, 1.0f) != 0) {
            float lineHeight = getLineHeight(layout, i4);
            spacingAdd = lineHeight - ((lineHeight - spacingAdd) / spacingMultiplier);
        }
        return (int) (lineBottom - spacingAdd);
    }

    private final int getLineHeight(Layout layout, int i4) {
        return layout.getLineTop(i4 + 1) - layout.getLineTop(i4);
    }

    public abstract void draw(@NotNull Canvas canvas, @NotNull Layout layout, int i4, int i5, int i6, int i7, @Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he);

    protected final int getLineBottom(@NotNull Layout layout, int i4) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        int lineBottomWithoutSpacing = getLineBottomWithoutSpacing(layout, i4);
        return i4 == layout.getLineCount() + (-1) ? lineBottomWithoutSpacing - layout.getBottomPadding() : lineBottomWithoutSpacing;
    }

    protected final int getLineTop(@NotNull Layout layout, int i4) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        int lineTop = layout.getLineTop(i4);
        return i4 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
