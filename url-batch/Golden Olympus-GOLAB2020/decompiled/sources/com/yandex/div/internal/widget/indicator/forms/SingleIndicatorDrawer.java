package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface SingleIndicatorDrawer {
    void draw(@NotNull Canvas canvas, float f4, float f5, @NotNull IndicatorParams$ItemSize indicatorParams$ItemSize, int i4, float f6, int i5);

    void drawSelected(@NotNull Canvas canvas, @NotNull RectF rectF);
}
