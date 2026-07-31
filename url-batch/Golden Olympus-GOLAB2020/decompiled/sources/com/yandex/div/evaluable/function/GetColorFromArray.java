package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetColorFromArray extends ArrayColor {

    @NotNull
    public static final GetColorFromArray INSTANCE = new GetColorFromArray();

    @NotNull
    private static final String name = "getColorFromArray";

    private GetColorFromArray() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
