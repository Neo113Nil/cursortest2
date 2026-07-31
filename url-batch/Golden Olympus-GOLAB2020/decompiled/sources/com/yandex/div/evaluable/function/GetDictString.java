package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictString extends DictString {

    @NotNull
    public static final GetDictString INSTANCE = new GetDictString();

    @NotNull
    private static final String name = "getDictString";

    private GetDictString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
