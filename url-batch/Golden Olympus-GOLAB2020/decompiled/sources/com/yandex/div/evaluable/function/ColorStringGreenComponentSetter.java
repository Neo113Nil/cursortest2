package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringGreenComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringGreenComponentSetter INSTANCE = new ColorStringGreenComponentSetter();

    @NotNull
    private static final String name = "setColorGreen";

    private ColorStringGreenComponentSetter() {
        super(ColorGreenComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
