package com.yandex.div.internal.widget.indicator.forms;

import W1.m;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Shape;
import com.yandex.div.internal.widget.indicator.IndicatorParams$Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class SingleIndicatorDrawerKt {
    @NotNull
    public static final SingleIndicatorDrawer getIndicatorDrawer(@NotNull IndicatorParams$Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        IndicatorParams$Shape activeShape = style.getActiveShape();
        if (activeShape instanceof IndicatorParams$Shape.RoundedRect) {
            return new RoundedRect(style);
        }
        if (activeShape instanceof IndicatorParams$Shape.Circle) {
            return new Circle(style);
        }
        throw new m();
    }
}
