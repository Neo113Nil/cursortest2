package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictNumber extends DictNumber {

    @NotNull
    public static final GetDictNumber INSTANCE = new GetDictNumber();

    @NotNull
    private static final String name = "getDictNumber";

    private GetDictNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
