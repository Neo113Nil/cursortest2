package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptBoolean extends DictOptBoolean {

    @NotNull
    public static final GetDictOptBoolean INSTANCE = new GetDictOptBoolean();

    @NotNull
    private static final String name = "getDictOptBoolean";

    private GetDictOptBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
