package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDictFromArray extends ArrayDict {

    @NotNull
    public static final GetDictFromArray INSTANCE = new GetDictFromArray();

    @NotNull
    private static final String name = "getDictFromArray";

    private GetDictFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
