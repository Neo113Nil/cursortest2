package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetStringFromDict extends DictString {

    @NotNull
    public static final GetStringFromDict INSTANCE = new GetStringFromDict();

    @NotNull
    private static final String name = "getStringFromDict";

    private GetStringFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
