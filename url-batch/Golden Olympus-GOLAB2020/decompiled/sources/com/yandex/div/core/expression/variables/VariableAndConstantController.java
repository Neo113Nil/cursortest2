package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class VariableAndConstantController implements VariableController {

    @NotNull
    private final ConstantsProvider constants;

    @NotNull
    private final VariableController delegate;

    public VariableAndConstantController(@NotNull VariableController delegate, @NotNull ConstantsProvider constants) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.delegate = delegate;
        this.constants = constants;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void cleanupSubscriptions() {
        this.delegate.cleanupSubscriptions();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void declare(@NotNull Variable variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        this.delegate.declare(variable);
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object wrapVariableValue = VariableControllerKt.wrapVariableValue(this.constants.get(name));
        return wrapVariableValue == null ? this.delegate.get(name) : wrapVariableValue;
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.delegate.getMutableVariable(name);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void restoreSubscriptions() {
        this.delegate.restoreSubscriptions();
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    public void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver owner, @NotNull Function1<? super Variable, Unit> callback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.delegate.setOnAnyVariableChangeCallback(owner, callback);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariableChange(@NotNull String name, @Nullable ErrorCollector errorCollector, boolean z4, @NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.delegate.subscribeToVariableChange(name, errorCollector, z4, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesChange(@NotNull List<String> names, boolean z4, @NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.delegate.subscribeToVariablesChange(names, z4, observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableController
    @NotNull
    public Disposable subscribeToVariablesUndeclared(@NotNull List<String> names, @NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(observer, "observer");
        return this.delegate.subscribeToVariablesUndeclared(names, observer);
    }
}
