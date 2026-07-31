package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetNumber extends DictNumber {

    @NotNull
    public static final GetNumber INSTANCE = new GetNumber();

    @NotNull
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    private GetNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictNumber
    public boolean isMethod() {
        return isMethod;
    }
}
