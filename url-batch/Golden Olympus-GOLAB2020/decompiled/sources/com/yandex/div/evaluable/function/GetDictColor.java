package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictColor extends ColorFromDict {

    @NotNull
    public static final GetDictColor INSTANCE = new GetDictColor();

    @NotNull
    private static final String name = "getDictColor";

    private GetDictColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
