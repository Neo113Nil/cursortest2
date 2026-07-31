package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetUrl extends UrlFromDict {

    @NotNull
    public static final GetUrl INSTANCE = new GetUrl();

    @NotNull
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    private GetUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.UrlFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
