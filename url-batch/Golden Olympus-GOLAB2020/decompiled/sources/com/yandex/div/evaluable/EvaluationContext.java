package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class EvaluationContext {

    @NotNull
    private final FunctionProvider functionProvider;

    @NotNull
    private final StoredValueProvider storedValueProvider;

    @NotNull
    private final VariableProvider variableProvider;

    @NotNull
    private final WarningSender warningSender;

    public EvaluationContext(@NotNull VariableProvider variableProvider, @NotNull StoredValueProvider storedValueProvider, @NotNull FunctionProvider functionProvider, @NotNull WarningSender warningSender) {
        Intrinsics.checkNotNullParameter(variableProvider, "variableProvider");
        Intrinsics.checkNotNullParameter(storedValueProvider, "storedValueProvider");
        Intrinsics.checkNotNullParameter(functionProvider, "functionProvider");
        Intrinsics.checkNotNullParameter(warningSender, "warningSender");
        this.variableProvider = variableProvider;
        this.storedValueProvider = storedValueProvider;
        this.functionProvider = functionProvider;
        this.warningSender = warningSender;
    }

    @NotNull
    public final FunctionProvider getFunctionProvider() {
        return this.functionProvider;
    }

    @NotNull
    public final StoredValueProvider getStoredValueProvider() {
        return this.storedValueProvider;
    }

    @NotNull
    public final VariableProvider getVariableProvider() {
        return this.variableProvider;
    }

    @NotNull
    public final WarningSender getWarningSender() {
        return this.warningSender;
    }
}
