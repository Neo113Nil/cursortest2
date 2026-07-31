package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayUrl extends ArrayUrl {

    @NotNull
    public static final GetArrayUrl INSTANCE = new GetArrayUrl();

    @NotNull
    private static final String name = "getArrayUrl";

    private GetArrayUrl() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
