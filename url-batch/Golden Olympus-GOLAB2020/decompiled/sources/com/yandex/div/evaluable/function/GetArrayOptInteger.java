package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayOptInteger extends ArrayOptInteger {

    @NotNull
    public static final GetArrayOptInteger INSTANCE = new GetArrayOptInteger();

    @NotNull
    private static final String name = "getArrayOptInteger";

    private GetArrayOptInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
