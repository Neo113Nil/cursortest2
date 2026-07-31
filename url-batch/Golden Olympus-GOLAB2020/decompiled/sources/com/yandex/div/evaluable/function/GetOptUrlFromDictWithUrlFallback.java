package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptUrlFromDictWithUrlFallback extends DictOptUrlWithUrlFallback {

    @NotNull
    public static final GetOptUrlFromDictWithUrlFallback INSTANCE = new GetOptUrlFromDictWithUrlFallback();

    @NotNull
    private static final String name = "getOptUrlFromDict";

    private GetOptUrlFromDictWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
