package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptNumber extends DictOptNumber {

    @NotNull
    public static final GetDictOptNumber INSTANCE = new GetDictOptNumber();

    @NotNull
    private static final String name = "getDictOptNumber";

    private GetDictOptNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
