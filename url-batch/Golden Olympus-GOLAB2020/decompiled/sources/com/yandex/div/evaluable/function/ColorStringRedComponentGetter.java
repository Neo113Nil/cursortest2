package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringRedComponentGetter extends ColorStringComponentGetter {

    @NotNull
    public static final ColorStringRedComponentGetter INSTANCE = new ColorStringRedComponentGetter();

    @NotNull
    private static final String name = "getColorRed";

    private ColorStringRedComponentGetter() {
        super(ColorRedComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
