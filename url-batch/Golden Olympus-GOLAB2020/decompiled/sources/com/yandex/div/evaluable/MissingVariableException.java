package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class MissingVariableException extends EvaluableException {

    @NotNull
    private final String variableName;

    public /* synthetic */ MissingVariableException(String str, Exception exc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : exc);
    }

    @NotNull
    public final String getVariableName() {
        return this.variableName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingVariableException(@NotNull String variableName, @Nullable Exception exc) {
        super("Variable '" + variableName + "' is missing.", exc);
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        this.variableName = variableName;
    }
}
