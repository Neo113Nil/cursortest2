package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetNumberFromArray extends ArrayNumber {

    @NotNull
    public static final GetNumberFromArray INSTANCE = new GetNumberFromArray();

    @NotNull
    private static final String name = "getNumberFromArray";

    private GetNumberFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
