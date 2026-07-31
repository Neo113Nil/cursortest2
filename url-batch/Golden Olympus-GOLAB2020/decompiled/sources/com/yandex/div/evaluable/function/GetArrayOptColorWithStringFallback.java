package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayOptColorWithStringFallback extends ArrayOptColorWithStringFallback {

    @NotNull
    public static final GetArrayOptColorWithStringFallback INSTANCE = new GetArrayOptColorWithStringFallback();

    @NotNull
    private static final String name = "getArrayOptColor";

    private GetArrayOptColorWithStringFallback() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
