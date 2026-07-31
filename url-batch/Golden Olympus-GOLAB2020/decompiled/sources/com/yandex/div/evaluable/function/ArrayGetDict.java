package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ArrayGetDict extends ArrayDict {

    @NotNull
    public static final ArrayGetDict INSTANCE = new ArrayGetDict();

    @NotNull
    private static final String name = "getDict";
    private static final boolean isMethod = true;

    private ArrayGetDict() {
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
