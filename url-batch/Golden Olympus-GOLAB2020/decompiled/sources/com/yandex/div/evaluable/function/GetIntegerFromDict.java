package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetIntegerFromDict extends DictInteger {

    @NotNull
    public static final GetIntegerFromDict INSTANCE = new GetIntegerFromDict();

    @NotNull
    private static final String name = "getIntegerFromDict";

    private GetIntegerFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
