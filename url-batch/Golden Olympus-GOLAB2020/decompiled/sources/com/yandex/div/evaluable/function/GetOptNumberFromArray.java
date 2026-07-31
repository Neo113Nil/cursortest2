package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptNumberFromArray extends ArrayOptNumber {

    @NotNull
    public static final GetOptNumberFromArray INSTANCE = new GetOptNumberFromArray();

    @NotNull
    private static final String name = "getOptNumberFromArray";

    private GetOptNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
