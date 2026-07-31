package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayOptColorWithColorFallback extends ArrayOptColorWithColorFallback {

    @NotNull
    public static final GetArrayOptColorWithColorFallback INSTANCE = new GetArrayOptColorWithColorFallback();

    @NotNull
    private static final String name = "getArrayOptColor";

    private GetArrayOptColorWithColorFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
