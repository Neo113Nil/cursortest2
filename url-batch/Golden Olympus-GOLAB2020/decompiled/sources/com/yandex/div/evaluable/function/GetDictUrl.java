package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictUrl extends UrlFromDict {

    @NotNull
    public static final GetDictUrl INSTANCE = new GetDictUrl();

    @NotNull
    private static final String name = "getDictUrl";

    private GetDictUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
