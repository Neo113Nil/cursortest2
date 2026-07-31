package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayOptNumber extends ArrayOptNumber {

    @NotNull
    public static final GetArrayOptNumber INSTANCE = new GetArrayOptNumber();

    @NotNull
    private static final String name = "getArrayOptNumber";

    private GetArrayOptNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
