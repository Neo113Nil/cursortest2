package com.yandex.div.core.expression.variables;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class GlobalVariableController {

    @NotNull
    private final DivVariableController delegate;

    public GlobalVariableController(@NotNull DivVariableController delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }
}
