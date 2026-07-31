package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayFromArray extends ArrayFromArray {

    @NotNull
    public static final GetArrayFromArray INSTANCE = new GetArrayFromArray();

    @NotNull
    private static final String name = "getArrayFromArray";

    private GetArrayFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
