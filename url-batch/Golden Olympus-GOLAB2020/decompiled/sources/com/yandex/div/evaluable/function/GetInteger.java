package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetInteger extends DictInteger {

    @NotNull
    public static final GetInteger INSTANCE = new GetInteger();

    @NotNull
    private static final String name = "getInteger";
    private static final boolean isMethod = true;

    private GetInteger() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictInteger
    public boolean isMethod() {
        return isMethod;
    }
}
