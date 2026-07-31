package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptBooleanFromDict extends DictOptBoolean {

    @NotNull
    public static final GetOptBooleanFromDict INSTANCE = new GetOptBooleanFromDict();

    @NotNull
    private static final String name = "getOptBooleanFromDict";

    private GetOptBooleanFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
