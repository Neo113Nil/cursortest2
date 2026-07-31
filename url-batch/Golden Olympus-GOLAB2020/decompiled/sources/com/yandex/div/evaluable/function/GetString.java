package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetString extends DictString {

    @NotNull
    public static final GetString INSTANCE = new GetString();

    @NotNull
    private static final String name = "getString";
    private static final boolean isMethod = true;

    private GetString() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictString
    public boolean isMethod() {
        return isMethod;
    }
}
