package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetArrayColor extends ArrayColor {

    @NotNull
    public static final GetArrayColor INSTANCE = new GetArrayColor();

    @NotNull
    private static final String name = "getArrayColor";

    private GetArrayColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }
}
