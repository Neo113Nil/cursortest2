package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayBoolean extends ArrayBoolean {

    @NotNull
    public static final GetArrayBoolean INSTANCE = new GetArrayBoolean();

    @NotNull
    private static final String name = "getArrayBoolean";

    private GetArrayBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
