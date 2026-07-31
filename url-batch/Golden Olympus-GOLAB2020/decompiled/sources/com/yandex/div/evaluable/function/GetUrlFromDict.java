package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetUrlFromDict extends UrlFromDict {

    @NotNull
    public static final GetUrlFromDict INSTANCE = new GetUrlFromDict();

    @NotNull
    private static final String name = "getUrlFromDict";

    private GetUrlFromDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
