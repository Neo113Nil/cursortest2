package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetColorFromDict extends ColorFromDict {

    @NotNull
    public static final GetColorFromDict INSTANCE = new GetColorFromDict();

    @NotNull
    private static final String name = "getColorFromDict";

    private GetColorFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
