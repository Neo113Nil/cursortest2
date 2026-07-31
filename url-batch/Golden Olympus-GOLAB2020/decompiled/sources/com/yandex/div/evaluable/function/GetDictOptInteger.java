package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptInteger extends DictOptInteger {

    @NotNull
    public static final GetDictOptInteger INSTANCE = new GetDictOptInteger();

    @NotNull
    private static final String name = "getDictOptInteger";

    private GetDictOptInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
