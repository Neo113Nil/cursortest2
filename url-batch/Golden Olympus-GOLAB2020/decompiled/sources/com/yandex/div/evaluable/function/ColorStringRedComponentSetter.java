package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringRedComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringRedComponentSetter INSTANCE = new ColorStringRedComponentSetter();

    @NotNull
    private static final String name = "setColorRed";

    private ColorStringRedComponentSetter() {
        super(ColorRedComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
