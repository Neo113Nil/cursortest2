package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetStringFromArray extends ArrayString {

    @NotNull
    public static final GetStringFromArray INSTANCE = new GetStringFromArray();

    @NotNull
    private static final String name = "getStringFromArray";

    private GetStringFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
