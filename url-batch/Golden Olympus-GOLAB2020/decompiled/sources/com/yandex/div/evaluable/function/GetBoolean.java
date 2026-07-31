package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetBoolean extends BooleanFromDict {

    @NotNull
    public static final GetBoolean INSTANCE = new GetBoolean();

    @NotNull
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    private GetBoolean() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.BooleanFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
