package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringGreenComponentGetter extends ColorStringComponentGetter {

    @NotNull
    public static final ColorStringGreenComponentGetter INSTANCE = new ColorStringGreenComponentGetter();

    @NotNull
    private static final String name = "getColorGreen";

    private ColorStringGreenComponentGetter() {
        super(ColorGreenComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
