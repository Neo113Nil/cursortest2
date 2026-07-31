package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictInteger extends DictInteger {

    @NotNull
    public static final GetDictInteger INSTANCE = new GetDictInteger();

    @NotNull
    private static final String name = "getDictInteger";

    private GetDictInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
