package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class IntegerOverflow extends EvaluableException {

    @NotNull
    private final String expression;

    public /* synthetic */ IntegerOverflow(String str, Exception exc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerOverflow(@NotNull String expression, @Nullable Exception exc) {
        super("Failed to evaluate [" + expression + "]. Integer overflow.", exc);
        Intrinsics.checkNotNullParameter(expression, "expression");
        this.expression = expression;
    }
}
