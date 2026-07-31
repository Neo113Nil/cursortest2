package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptUrlFromArrayWithUrlFallback extends ArrayOptUrlWithUrlFallback {

    @NotNull
    public static final GetOptUrlFromArrayWithUrlFallback INSTANCE = new GetOptUrlFromArrayWithUrlFallback();

    @NotNull
    private static final String name = "getOptUrlFromArray";

    private GetOptUrlFromArrayWithUrlFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
