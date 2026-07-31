package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ArrayGetNumber extends ArrayNumber {

    @NotNull
    public static final ArrayGetNumber INSTANCE = new ArrayGetNumber();

    @NotNull
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    private ArrayGetNumber() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }
}
