package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetColor extends ColorFromDict {

    @NotNull
    public static final GetColor INSTANCE = new GetColor();

    @NotNull
    private static final String name = "getColor";
    private static final boolean isMethod = true;

    private GetColor() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ColorFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
