package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ArrayGetString extends ArrayString {

    @NotNull
    public static final ArrayGetString INSTANCE = new ArrayGetString();

    @NotNull
    private static final String name = "getString";
    private static final boolean isMethod = true;

    private ArrayGetString() {
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
