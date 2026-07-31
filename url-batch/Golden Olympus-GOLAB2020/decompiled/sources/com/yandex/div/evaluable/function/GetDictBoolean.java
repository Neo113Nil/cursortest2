package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictBoolean extends BooleanFromDict {

    @NotNull
    public static final GetDictBoolean INSTANCE = new GetDictBoolean();

    @NotNull
    private static final String name = "getDictBoolean";

    private GetDictBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
