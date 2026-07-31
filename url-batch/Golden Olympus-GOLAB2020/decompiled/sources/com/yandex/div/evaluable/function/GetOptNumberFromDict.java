package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptNumberFromDict extends DictOptNumber {

    @NotNull
    public static final GetOptNumberFromDict INSTANCE = new GetOptNumberFromDict();

    @NotNull
    private static final String name = "getOptNumberFromDict";

    private GetOptNumberFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
