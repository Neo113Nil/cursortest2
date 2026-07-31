package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GetDict extends DictFromDict {

    @NotNull
    public static final GetDict INSTANCE = new GetDict();

    @NotNull
    private static final String name = "getDict";
    private static final boolean isMethod = true;

    private GetDict() {
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictFromDict
    public boolean isMethod() {
        return isMethod;
    }
}
