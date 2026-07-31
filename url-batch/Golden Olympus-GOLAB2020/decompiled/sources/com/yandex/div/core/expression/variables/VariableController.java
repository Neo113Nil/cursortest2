package com.yandex.div.core.expression.variables;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.VariableProvider;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface VariableController extends VariableProvider {
    static /* synthetic */ Disposable subscribeToVariablesChange$default(VariableController variableController, List list, boolean z4, Function1 function1, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToVariablesChange");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return variableController.subscribeToVariablesChange(list, z4, function1);
    }

    @NotNull
    default List<Variable> captureAll() {
        return CollectionsKt.emptyList();
    }

    void cleanupSubscriptions();

    void declare(@NotNull Variable variable);

    @Nullable
    Variable getMutableVariable(@NotNull String str);

    void restoreSubscriptions();

    void setOnAnyVariableChangeCallback(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super Variable, Unit> function1);

    @NotNull
    Disposable subscribeToVariableChange(@NotNull String str, @Nullable ErrorCollector errorCollector, boolean z4, @NotNull Function1<? super Variable, Unit> function1);

    @NotNull
    Disposable subscribeToVariablesChange(@NotNull List<String> list, boolean z4, @NotNull Function1<? super Variable, Unit> function1);

    @NotNull
    Disposable subscribeToVariablesUndeclared(@NotNull List<String> list, @NotNull Function1<? super Variable, Unit> function1);
}
