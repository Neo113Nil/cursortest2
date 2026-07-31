package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringBlueComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringBlueComponentSetter INSTANCE = new ColorStringBlueComponentSetter();

    @NotNull
    private static final String name = "setColorBlue";

    private ColorStringBlueComponentSetter() {
        super(ColorBlueComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
