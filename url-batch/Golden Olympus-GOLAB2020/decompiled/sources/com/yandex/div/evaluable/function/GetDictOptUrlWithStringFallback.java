package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptUrlWithStringFallback extends DictOptUrlWithStringFallback {

    @NotNull
    public static final GetDictOptUrlWithStringFallback INSTANCE = new GetDictOptUrlWithStringFallback();

    @NotNull
    private static final String name = "getDictOptUrl";

    private GetDictOptUrlWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
