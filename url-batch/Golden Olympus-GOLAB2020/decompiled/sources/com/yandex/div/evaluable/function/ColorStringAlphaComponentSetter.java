package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorStringAlphaComponentSetter extends ColorStringComponentSetter {

    @NotNull
    public static final ColorStringAlphaComponentSetter INSTANCE = new ColorStringAlphaComponentSetter();

    @NotNull
    private static final String name = "setColorAlpha";

    private ColorStringAlphaComponentSetter() {
        super(ColorAlphaComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
