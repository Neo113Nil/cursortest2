package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictOptUrlWithUrlFallback extends DictOptUrlWithUrlFallback {

    @NotNull
    public static final GetDictOptUrlWithUrlFallback INSTANCE = new GetDictOptUrlWithUrlFallback();

    @NotNull
    private static final String name = "getDictOptUrl";

    private GetDictOptUrlWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
