package com.yandex.div.core.expression.variables;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class TwoWayVariableBinder<T> {

    @NotNull
    private final ErrorCollectors errorCollectors;

    @Metadata
    public interface Callbacks<T> {
        void onVariableChanged(@Nullable T t4);

        void setViewStateChangeListener(@NotNull Function1<? super T, Unit> function1);
    }

    public TwoWayVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        this.errorCollectors = errorCollectors;
    }

    @NotNull
    public Disposable bindVariable(@NotNull BindingContext bindingContext, @NotNull String variableName, @NotNull Callbacks<T> callbacks, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(path, "path");
        Div2View divView = bindingContext.getDivView();
        C1165z4 divData = divView.getDivData();
        if (divData == null) {
            return Disposable.NULL;
        }
        G g4 = new G();
        DivDataTag dataTag = divView.getDataTag();
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null) {
            return Disposable.NULL;
        }
        callbacks.setViewStateChangeListener(new TwoWayVariableBinder$bindVariable$1(g4, divView, variableName, this, bindingContext));
        return variableController.subscribeToVariableChange(variableName, this.errorCollectors.getOrCreate(dataTag, divData), true, new TwoWayVariableBinder$bindVariable$2(g4, callbacks));
    }

    @NotNull
    public abstract String toStringValue(T t4);
}
