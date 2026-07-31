package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptIntegerFromDict extends DictOptInteger {

    @NotNull
    public static final GetOptIntegerFromDict INSTANCE = new GetOptIntegerFromDict();

    @NotNull
    private static final String name = "getOptIntegerFromDict";

    private GetOptIntegerFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
