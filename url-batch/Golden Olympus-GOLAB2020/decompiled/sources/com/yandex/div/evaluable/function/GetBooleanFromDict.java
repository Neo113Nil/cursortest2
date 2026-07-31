package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetBooleanFromDict extends BooleanFromDict {

    @NotNull
    public static final GetBooleanFromDict INSTANCE = new GetBooleanFromDict();

    @NotNull
    private static final String name = "getBooleanFromDict";

    private GetBooleanFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
