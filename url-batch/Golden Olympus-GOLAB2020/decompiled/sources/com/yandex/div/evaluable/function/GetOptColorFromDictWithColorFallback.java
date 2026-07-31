package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptColorFromDictWithColorFallback extends DictOptColorWithColorFallback {

    @NotNull
    public static final GetOptColorFromDictWithColorFallback INSTANCE = new GetOptColorFromDictWithColorFallback();

    @NotNull
    private static final String name = "getOptColorFromDict";

    private GetOptColorFromDictWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
