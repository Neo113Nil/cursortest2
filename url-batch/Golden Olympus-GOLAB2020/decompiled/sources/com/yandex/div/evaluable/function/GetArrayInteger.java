package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayInteger extends ArrayInteger {

    @NotNull
    public static final GetArrayInteger INSTANCE = new GetArrayInteger();

    @NotNull
    private static final String name = "getArrayInteger";

    private GetArrayInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
