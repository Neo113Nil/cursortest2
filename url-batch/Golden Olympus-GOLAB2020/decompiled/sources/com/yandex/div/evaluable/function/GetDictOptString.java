package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptString extends DictOptString {

    @NotNull
    public static final GetDictOptString INSTANCE = new GetDictOptString();

    @NotNull
    private static final String name = "getDictOptString";

    private GetDictOptString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
