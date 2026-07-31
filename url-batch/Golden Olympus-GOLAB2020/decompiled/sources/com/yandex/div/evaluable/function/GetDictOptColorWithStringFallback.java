package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptColorWithStringFallback extends DictOptColorWithStringFallback {

    @NotNull
    public static final GetDictOptColorWithStringFallback INSTANCE = new GetDictOptColorWithStringFallback();

    @NotNull
    private static final String name = "getDictOptColor";

    private GetDictOptColorWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
