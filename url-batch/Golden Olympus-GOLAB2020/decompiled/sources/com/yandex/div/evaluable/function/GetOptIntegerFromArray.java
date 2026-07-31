package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetOptIntegerFromArray extends ArrayOptInteger {

    @NotNull
    public static final GetOptIntegerFromArray INSTANCE = new GetOptIntegerFromArray();

    @NotNull
    private static final String name = "getOptIntegerFromArray";

    private GetOptIntegerFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
